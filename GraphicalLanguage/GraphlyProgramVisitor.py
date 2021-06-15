import pygame
import sys

from GraphlyVisitor import GraphlyVisitor
from GraphlyParser import GraphlyParser

from exceptions.VariableAlreadyDeclaredException import VariableAlreadyDeclaredException
from exceptions.UnknownVariableException import UnknownVariableException
from exceptions.BadArgumentException import BadArgumentException
from exceptions.BadColorException import BadColorException
from exceptions.BadTypeInGroupException import BadTypeInGroupException
from exceptions.UnknownOperationException import UnknownOperationException
from exceptions.IncorrectPolygonInitializationException import IncorrectPolygonInitializationException
from exceptions.NegativeIndexException import NegativeIndexException
from exceptions.IndexOutOfRangeException import IndexOutOfRangeException
from exceptions.NonPositiveValueInCanvasException import NonPositiveValueInCanvasException
from exceptions.BadAssignmentException import BadAssignmentException
from exceptions.UnknownGroupTypeException import UnknownGroupTypeException
from exceptions.BadTypeInExpressionException import BadTypeInExpressionException
from exceptions.IllegalCharacterException import IllegalCharacterException
from exceptions.FailedSaveException import FailedSaveException

from drawables import *

from math import floor, ceil
from math import sin, cos, radians
from copy import deepcopy

from os.path import dirname, splitext


class GraphlyProgramVisitor(GraphlyVisitor):
    SCREEN_WIDTH = 640
    SCREEN_HEIGHT = 480

    def __init__(self, filename):
        self.filename = filename
            
        self.scopes = []

        self.colors = {
            "#red": (255, 0, 0),
            "#green": (0, 255, 0),
            "#yellow": (255, 255, 0),
            "#black": (0, 0, 0),
            "#blue": (0, 0, 255),
            "#white": (255, 255, 255),
            "#orange": (255, 165, 0),
            "#pink": (255, 100, 203),
            "#gray": (105, 105, 105)
        }

        self.types = {
            int: "num",
            float: "num",
            Point: "point",
            Segment: "segment",
            Circle: "circle",
            Polygon: "polygon",
            Group: "group",
            "shape": "shape",
            "drawable": "drawable",
            Drawable: "drawable"
        }

        self.screen = pygame.display.set_mode((self.SCREEN_WIDTH, self.SCREEN_HEIGHT))
        self.group_member_types = ("shapes", "circles", "points", "polygons", "segments", "drawables")

    def variable_exists(self, variable):
        # Checks if variable exists in the current scope
        if variable in self.scopes[-1]:
            return True
        return False

    def get_variable(self, variable, ctx):
        # Returns variable if found in any scope
        # Raises UnknownVariableException
        # Need to pass context to raise exception
        for scope in reversed(self.scopes):
            if variable in scope:
                return scope[variable]

        raise UnknownVariableException(ctx.start.line, variable)

    def set_variable(self, name, value):
        # Sets/creates variable in the current scope
        self.scopes[-1][name] = value

    
    def assign_variable(self, name, value, ctx):
        for scope in reversed(self.scopes):
            if name in scope:
                scope[name] = value
                return

        raise UnknownVariableException(ctx.start.line, name)


    def set_group_member(self, name, index, value):
        self.scopes[-1][name].members[index] = value

    
    def assign_group_member(self, name, index, value, ctx):
        for scope in reversed(self.scopes):
            if name in scope:
                scope[name].members[index] = value
                return

        raise UnknownVariableException(ctx.start.line, name)

    def check_if_group_member(self, name):
        return name[-1] == ']'

    def visitProgram(self, ctx: GraphlyParser.ProgramContext):
        pygame.init()
        self.scopes.append({})
        self.visitChildren(ctx)
        pygame.display.update()

    def visitBlock(self, ctx:GraphlyParser.BlockContext):
        self.scopes.append({})
        self.visitChildren(ctx)
        self.scopes.pop()

    def visitLoop(self, ctx: GraphlyParser.LoopContext):
        name = ctx.name.text

        iterator = int(self.visit(ctx.starting))
        until = int(self.visit(ctx.until))
        step = int(self.visit(ctx.step))

        block = ctx.block()

        self.set_variable(name, iterator)
        
        while iterator < until:
            self.visit(block)
            
            iterator += step
            self.set_variable(name, iterator)


    def visitCheck(self, ctx: GraphlyParser.CheckContext):
        do_else = True
        for cb in ctx.condition_block():
            if self.visit(cb.expr()):
                self.visit(cb.block())
                do_else = False
                break
        
        if do_else and not ctx.block() is None:
            self.visit(ctx.block())


    def visitPoint(self, ctx: GraphlyParser.PointContext):
        name = ctx.NAME().getText()

        if not self.variable_exists(name):
            x_cord = self.visit(ctx.x)
            y_cord = self.visit(ctx.y)

            point = Point(name, x_cord, y_cord)

            self.set_variable(name, point)
        else:
            raise VariableAlreadyDeclaredException(ctx.start.line, name)

    def visitSegment(self, ctx: GraphlyParser.SegmentContext):
        name = ctx.NAME(0).getText()

        if not self.variable_exists(name):
            point1_name = ctx.NAME(1).getText()
            point2_name = ctx.NAME(2).getText()

            p1 = self.get_variable(point1_name, ctx)
            p2 = self.get_variable(point2_name, ctx)

            if type(p1) == Point and type(p2) == Point:
                segment = Segment(name, p1, p2)
                self.set_variable(name, segment)
            else:
                if type(p1) != Point:
                    raise BadArgumentException(
                        ctx.start.line, "segment", point1_name, self.types[type(p1)])
                raise BadArgumentException(
                    ctx.start.line, "segment", point2_name, self.types[type(p2)])
        else:
            raise VariableAlreadyDeclaredException(ctx.start.line, name)


    def visitCircle(self, ctx: GraphlyParser.CircleContext):
        name = ctx.NAME(0).getText()

        if not self.variable_exists(name):
            point_name = ctx.NAME(1).getText()

            point = self.get_variable(point_name, ctx)

            if type(point) == Point:
                radius = self.visit(ctx.expr())
                circle = Circle(name, point, radius)
                self.set_variable(name, circle)

            else:
                raise BadArgumentException(
                    ctx.start.line, "circle", point_name, self.types[type(point)])
        else:
            raise VariableAlreadyDeclaredException(ctx.start.line, name)

    def visitPolygon(self, ctx: GraphlyParser.PolygonContext):
        name = ctx.NAME(0).getText()

        if not self.variable_exists(name):
            group_name = ctx.NAME(1).getText()

            group = self.get_variable(group_name, ctx)

            if type(group) == Group:
                for member in group.members:
                    if type(member) != Point:
                        raise IncorrectPolygonInitializationException(
                            ctx.start.line, group_name, name, self.types[type(member)])

                polygon = Polygon(name, group.members)

                self.set_variable(name, polygon)
            else:
                raise BadArgumentException(
                    ctx.start.line, "polygon", group_name, self.types[type(group)])
        else:
            raise VariableAlreadyDeclaredException(ctx.start.line, name)

    def visitGroup(self, ctx: GraphlyParser.GroupContext):
        name_tokens = ctx.getTokens(GraphlyParser.NAME)

        name = name_tokens[0].getText()

        if not self.variable_exists(name):
            group_type = ctx.TYPE().getText()

            if group_type not in self.group_member_types:
                raise UnknownGroupTypeException(ctx.start.line, group_type)

            correct_type = list(self.types.keys())[list(self.types.values()).index(group_type[:-1])]

            arguments = name_tokens[1:]
            group_members = []

            for arg in arguments:
                arg_name = arg.getText()
                member = self.get_variable(arg_name, ctx)
                if correct_type == self.types["shape"] and type(member) not in (Point, Segment, Circle, Polygon):
                    raise BadTypeInGroupException(ctx.start.line, name, self.types[correct_type], self.types[type(member)])

                if correct_type == self.types["drawable"] and type(member) not in (Point, Segment, Circle, Polygon, Group):
                    raise BadTypeInGroupException(ctx.start.line, name, self.types[correct_type],self.types[type(member)])

                if correct_type not in (self.types["shape"], self.types["drawable"]) and type(member) != correct_type:
                    raise BadTypeInGroupException(ctx.start.line, name, self.types[correct_type], self.types[type(member)])

                group_members.append(member)

            self.set_variable(name, Group(name, group_type, group_members))
        else:
            raise VariableAlreadyDeclaredException(ctx.start.line, name)


    def visitNum(self, ctx: GraphlyParser.NumContext):
        name = ctx.NAME().getText()

        if not self.variable_exists(name):
            value = self.visit(ctx.expr())
            self.set_variable(name, value)
        else:
            raise VariableAlreadyDeclaredException(ctx.start.line, name)


    def visitCanvas(self, ctx: GraphlyParser.CanvasContext):
        color = ctx.COLOR().getText()

        x = int(self.visit(ctx.x))
        y = int(self.visit(ctx.y))

        if x <= 0:
            raise NonPositiveValueInCanvasException(ctx.start.line, x)
        if y <= 0:
            raise NonPositiveValueInCanvasException(ctx.start.line, y)

        self.screen = pygame.display.set_mode((x, y))

        if color in self.colors:
            self.screen.fill(self.colors[color])
        else:
            raise BadColorException(ctx.start.line, color)


    def visitGroupMember(self, ctx: GraphlyParser.GroupMemberContext):
        return ctx.NAME().getText(), self.visitChildren(ctx.expr())

    def try_to_get_member(self, ctx, arg, name):
        if self.check_if_group_member(name):
            group_name, index = self.visit(arg)
            group = self.get_variable(group_name, ctx)

            if index < 0:
                raise NegativeIndexException(ctx.start.line, group_name, index)

            try:
                return group.members[index]
            except IndexError:
                raise IndexOutOfRangeException(ctx.start.line, group_name, index)
        else:
            return self.get_variable(name, ctx)

    def visitDraw(self, ctx: GraphlyParser.DrawContext):
        name = ctx.arg.getText()
        variable = self.try_to_get_member(ctx, ctx.arg, name)

        if issubclass(type(variable), Drawable):
            variable.draw(self.screen)
        else:
            raise BadArgumentException(ctx.start.line, "draw", name, self.types[type(variable)])

    
    def visitShapeLog(self, ctx:GraphlyParser.ShapeLogContext):
        name = ctx.arg.getText()
        variable = self.try_to_get_member(ctx, ctx.arg, name)
        print(variable)


    def visitExprLog(self, ctx:GraphlyParser.ExprLogContext):
        print(self.visit(ctx.arg))


    def visitTextLog(self, ctx:GraphlyParser.TextLogContext):
        print(ctx.TEXT().getText())


    def visitSimpleSave(self, ctx:GraphlyParser.SimpleSaveContext):
        try:
            pygame.image.save(self.screen, self.filename + '.png')
        except:
            raise FailedSaveException(ctx.start.line, self.filename + '.png')


    def visitNamedSave(self, ctx:GraphlyParser.NamedSaveContext):
        name = ctx.TEXT().getText().replace('"', '')

        forbidden = '#%&\{\}\\<>*?/ $!\'":@+`|='
        if any(c in forbidden for c in name):
            raise IllegalCharacterException(ctx.start.line, name)
        
        if splitext(name)[1] not in ('.png', '.jpeg', '.bmp', '.tga'):
            name += '.png'

        direcotry = dirname(self.filename)
        if direcotry != '':
            name = direcotry + '/' + name

        try:
            pygame.image.save(self.screen, name)
        except:
            raise FailedSaveException(ctx.start.line, name)

    
    def visitFill(self, ctx: GraphlyParser.FillContext):
        name = ctx.arg.getText()
        color = ctx.COLOR().getText()
        variable = self.try_to_get_member(ctx, ctx.arg, name)

        if issubclass(type(variable), Drawable):
            if color in self.colors:
                variable.fill(self.colors[color])
            else:
                raise BadColorException(ctx.start.line, color)
        else:
            raise BadArgumentException(ctx.start.line, "fill", name, self.types[type(variable)])

    
    def visitCopyAssign(self, ctx:GraphlyParser.CopyAssignContext):
        name1 = ctx.arg1.getText()
        name2 = ctx.arg2.getText()
        variable2 = self.try_to_get_member(ctx, ctx.arg2, name2)

        try:
            variable1 = self.try_to_get_member(ctx, ctx.arg1, name1)
            if type(variable1) == type(variable2):
                if type(variable1) not in (int, float):
                    variable1.__dict__ = deepcopy(variable2.__dict__)
                else:
                    self.assign_variable(name1, variable2, ctx)
            else:
                raise BadAssignmentException(ctx.start.line, self.types[type(variable1)], self.types[type(variable2)])
        except UnknownVariableException:
            self.set_variable(name1, deepcopy(variable2))
        


    def visitNumAssign(self, ctx:GraphlyParser.NumAssignContext):
        name = ctx.arg1.getText()
        value = self.visit(ctx.arg2)
        
        self.assign_variable(name, value, ctx)


    def visitMinusOpExpr(self, ctx: GraphlyParser.MinusOpExprContext):
        return -self.visit(ctx.expr())


    def visitBooleanOpExpr(self, ctx:GraphlyParser.BooleanOpExprContext):
        left = self.visit(ctx.left)
        right = self.visit(ctx.right)
        op = ctx.op.text

        if op == '<=':
            return left <= right
        elif op == '>':
            return left > right
        elif op == '>=':
            return left >= right
        elif op == '<':
            return left < right
        elif op == '=':
            return left == right
        elif op == '!=':
            return left != right
        elif op == '&':
            return left and right
        elif op == '|':
            return left or right
        else:
            raise UnknownOperationException(ctx.start.line, op)


    def visitArithmeticOpExpr(self, ctx:GraphlyParser.ArithmeticOpExprContext):
        left = self.visit(ctx.left)
        right = self.visit(ctx.right)
        op = ctx.op.text

        if op == '+':
            return left + right
        elif op == '-':
            return left - right
        elif op == '*':
            return left * right
        elif op == '/':
            return left / right
        elif op == '%':
            return left % right
        else:
            raise UnknownOperationException(ctx.start.line, op)

    def visitNegationOpExpr(self, ctx:GraphlyParser.NegationOpExprContext):
        return not self.visit(ctx.expr())


    def visitParenExpr(self, ctx:GraphlyParser.ParenExprContext):
        return self.visit(ctx.expr())


    def visitRoundingOpExpr(self, ctx:GraphlyParser.RoundingOpExprContext):
        op = ctx.op.text

        if op == '^':
            return ceil(self.visit(ctx.expr()))
        elif op == '_':
            return floor(self.visit(ctx.expr()))
        elif op == '~':
            return round(self.visit(ctx.expr()))
        else:
            raise UnknownOperationException(ctx.start.line, op)


    def visitFltAtom(self, ctx:GraphlyParser.FltAtomContext):
        return float(ctx.getText())


    def visitIntAtom(self, ctx:GraphlyParser.IntAtomContext):
        return int(ctx.getText())


    def visitVarAtom(self, ctx:GraphlyParser.VarAtomContext):
        variable = self.get_variable(ctx.getText(), ctx)

        if type(variable) not in (int, float):
            raise BadTypeInExpressionException(ctx.start.line, self.types[type(variable)])

        return variable


    def visitMove(self, ctx: GraphlyParser.MoveContext):
        name = ctx.arg.getText()
        x = self.visit(ctx.dx)
        y = self.visit(ctx.dy)
        variable = self.try_to_get_member(ctx, ctx.arg, name)

        if issubclass(type(variable), Drawable):
            variable.move(x, y)
        else:
            raise BadArgumentException(ctx.start.line, "move", name, self.types[type(variable)])


    def visitPlace(self, ctx: GraphlyParser.PlaceContext):
        shape_name = ctx.arg1.getText()
        place_point_name = ctx.arg2.getText()

        shape = self.try_to_get_member(ctx, ctx.arg1, shape_name)
        place_point = self.try_to_get_member(ctx, ctx.arg2, place_point_name)

        if type(place_point) == Point:
            if issubclass(type(shape), Drawable):
                shape.place(place_point)
            else:
                raise BadArgumentException(ctx.start.line, "place", shape_name, self.types[type(shape)])
        else:
            raise BadArgumentException(ctx.start.line, "place", place_point_name, self.types[type(place_point)])


    def visitRotate(self, ctx: GraphlyParser.RotateContext):
        shape_name = ctx.arg1.getText()
        pivot_point_name = ctx.arg2.getText()

        shape = self.try_to_get_member(ctx, ctx.arg1, shape_name)
        pivot_point = self.try_to_get_member(ctx, ctx.arg2, pivot_point_name)

        if type(pivot_point) != Point:
            raise BadArgumentException(ctx.start.line, "rotate", "pivot_point", self.types[type(pivot_point)])

        angle = self.visit(ctx.angle)

        if type(angle) not in (int, float):
            raise BadArgumentException(ctx.start.line, "rotate", "angle", self.types[type(angle)])

        angle *= -1  # counterclockwise

        if issubclass(type(shape), Drawable):
            shape.rotate(pivot_point, angle)
        else:
            raise BadArgumentException(ctx.start.line, "rotate", shape_name, self.types[type(shape)])


    def visitScale(self, ctx: GraphlyParser.ScaleContext):
        shape_name = ctx.arg1.getText()
        pivot_point_name = ctx.arg2.getText()

        shape = self.try_to_get_member(ctx, ctx.arg1, shape_name)
        pivot_point = self.try_to_get_member(ctx, ctx.arg2, pivot_point_name)

        if type(pivot_point) != Point:
            raise BadArgumentException(ctx.start.line, "scale", "pivot_point", self.types[type(pivot_point)])

        factor = self.visit(ctx.k)

        if type(factor) not in (int, float):
            raise BadArgumentException(ctx.start.line, "scale", "factor", self.types[type(factor)])

        if issubclass(type(shape), Drawable):
            shape.scale(pivot_point, factor)
        else:
            raise BadArgumentException(ctx.start.line, "scale", shape_name, self.types[type(shape)])
