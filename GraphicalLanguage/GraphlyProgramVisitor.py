import pygame

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

from math import floor, ceil
from math import sin, cos, radians


class GraphlyProgramVisitor(GraphlyVisitor):
    POINT_RADIUS = 3
    SCREEN_WIDTH = 640
    SCREEN_HEIGHT = 480

    class Point:
        def __init__(self, name, x, y):
            self.x = x
            self.y = y
            self.name = name
            self.color = (0, 0, 0)

        def get_coordination_tuple(self):
            return self.x, self.y

    class Segment:
        SEGMENT_WIDTH = 1

        def __init__(self, name, start_point, end_point):
            self.name = name
            self.start_point = start_point
            self.end_point = end_point
            self.color = (0, 0, 0)
            self.width = self.SEGMENT_WIDTH

    class Circle:
        CIRCLE_WIDTH = 1

        def __init__(self, name, center_point, radius):
            self.name = name
            self.center_point = center_point
            self.radius = radius
            self.color = (0, 0, 0)
            self.width = self.CIRCLE_WIDTH

    class Polygon:
        POLYGON_WIDTH = 0

        def __init__(self, name, points):
            self.name = name
            self.points = points
            self.color = (0, 0, 0)
            self.width = self.POLYGON_WIDTH

    def __init__(self):
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
            int: "num/iterator",
            float: "num",
            self.Point: "point",
            self.Segment: "segment",
            self.Circle: "circle",
            self.Polygon: "polygon",
            list: "group",
            "shape": "shape"
        }
        self.screen = pygame.display.set_mode((self.SCREEN_WIDTH, self.SCREEN_HEIGHT))
        self.drawables = (self.Point, self.Segment, self.Circle, self.Polygon, list)

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

        iterator = int(self.visit(ctx.start))
        until = int(self.visit(ctx.until))
        step = int(self.visit(ctx.step))

        block = ctx.block()

        if not self.variable_exists(name):
            self.set_variable(name, iterator)
        else:
            raise VariableAlreadyDeclaredException(ctx.start.line, name)
        
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

    # TODO
    # add exceptions after providing full variables service

    def visitPoint(self, ctx: GraphlyParser.PointContext):
        name = ctx.NAME().getText()

        if not self.variable_exists(name):
            x_cord = self.visit(ctx.x)
            y_cord = self.visit(ctx.y)

            point = self.Point(name, x_cord, y_cord)

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

            if type(p1) == self.Point and type(p2) == self.Point:
                segment = self.Segment(name, p1, p2)
                self.set_variable(name, segment)
            else:
                if type(p1) != self.Point:
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

            if type(point) == self.Point:
                radius = self.visit(ctx.expr())
                circle = self.Circle(name, point, radius)
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

            if type(group) == list:
                for member in group:
                    if type(member) != self.Point:
                        raise IncorrectPolygonInitializationException(
                            ctx.start.line, group_name, name, self.types[type(member)])

                polygon = self.Polygon(name, group)

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
            correct_type = list(self.types.keys())[list(self.types.values()).index(ctx.TYPE().getText()[:-1])]
            arguments = name_tokens[1:]
            group_members = []

            for arg in arguments:
                arg_name = arg.getText()

                member = self.get_variable(arg_name, ctx)

                if correct_type == "shape" and type(member) not in (self.Point, self.Segment, self.Circle, self.Polygon):
                    raise BadTypeInGroupException(ctx.start.line, name, self.types[correct_type], self.types[type(member)])
                elif correct_type != "shape" and type(member) != correct_type:
                    raise BadTypeInGroupException(ctx.start.line, name, self.types[correct_type], self.types[type(member)])

                group_members.append(member)

            self.set_variable(name, group_members)
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

        self.screen = pygame.display.set_mode((x, y))

        if color in self.colors:
            self.screen.fill(self.colors[color])
        else:
            raise BadColorException(ctx.start.line, color)

    def draw_single_shape(self, variable):
        if type(variable) == self.Point:
            pygame.draw.circle(self.screen, variable.color, (variable.x, variable.y), self.POINT_RADIUS)
        elif type(variable) == self.Segment:
            start_point = variable.start_point.get_coordination_tuple()
            end_point = variable.end_point.get_coordination_tuple()
            pygame.draw.line(self.screen, variable.color, start_point, end_point, variable.width)
        elif type(variable) == self.Circle:
            center_point = variable.center_point.get_coordination_tuple()
            pygame.draw.circle(self.screen, variable.color, center_point, variable.radius)
        elif type(variable) == self.Polygon:
            coordination_tuples_list = [point.get_coordination_tuple() for point in variable.points]
            pygame.draw.polygon(self.screen, variable.color, coordination_tuples_list, variable.width)
        elif type(variable) == list:
            for member in variable:
                self.draw_single_shape(member)

    def visitGroupMember(self, ctx: GraphlyParser.GroupMemberContext):
        return ctx.NAME().getText(), self.visitChildren(ctx.expr())

    def try_to_get_member(self, ctx, arg, name):
        if self.check_if_group_member(name):
            group_name, index = self.visit(arg)
            group = self.get_variable(group_name, ctx)

            if index < 0:
                raise NegativeIndexException(ctx.start.line, group_name, index)

            try:
                return group[index]
            except IndexError:
                raise IndexOutOfRangeException(ctx.start.line, group_name, index)
        else:
            return self.get_variable(name, ctx)

    def visitDraw(self, ctx: GraphlyParser.DrawContext):
        name = ctx.arg.getText()
        variable = self.try_to_get_member(ctx, ctx.arg, name)

        if type(variable) in self.drawables:
            self.draw_single_shape(variable)
        else:
            raise BadArgumentException(ctx.start.line, "draw", name, self.types[type(variable)])

    def fill_single_shape(self, variable, color, ctx):
        if type(variable) in (self.Point, self.Segment, self.Circle, self.Polygon):
            if color in self.colors:
                variable.color = self.colors[color]
            else:
                raise BadColorException(ctx.start.line, color)
        elif type(variable) == list:
            for member in variable:
                self.fill_single_shape(member, color, ctx)

    def visitFill(self, ctx: GraphlyParser.FillContext):
        name = ctx.arg.getText()
        color = ctx.COLOR().getText()
        variable = self.try_to_get_member(ctx, ctx.arg, name)

        if type(variable) in self.drawables:
            self.fill_single_shape(variable, color, ctx)
        else:
            raise BadArgumentException(ctx.start.line, "fill", name, self.types[type(variable)])

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
        return self.get_variable(ctx.getText(), ctx)

    def move_single_shape(self, variable, x, y):
        if type(variable) == self.Point:
            variable.x += x
            variable.y += y
        elif type(variable) == self.Segment:
            variable.start_point.x += x
            variable.start_point.y += y
            variable.end_point.x += x
            variable.end_point.y += y
        elif type(variable) == self.Circle:
            variable.center_point.x += x
            variable.center_point.y += y
        elif type(variable) == self.Polygon:
            for i in range(len(variable.points)):
                variable.points[i].x += x
                variable.points[i].y += y
        elif type(variable) == list:
            for member in variable:
                self.move_single_shape(member, x, y)

    def visitMove(self, ctx: GraphlyParser.MoveContext):
        name = ctx.arg.getText()
        x = self.visit(ctx.dx)
        y = self.visit(ctx.dy)
        variable = self.try_to_get_member(ctx, ctx.arg, name)

        if type(variable) in self.drawables:
            self.move_single_shape(variable, x, y)
        else:
            raise BadArgumentException(ctx.start.line, "move", name, self.types[type(variable)])

        return self.visitChildren(ctx)

    def place_single_shape(self, shape, place_point):
        if type(place_point) == self.Point:
            if type(shape) == self.Point:
                x = place_point.x - shape.x
                y = place_point.y - shape.y

                shape.x += x
                shape.y += y
            elif type(shape) == self.Segment:
                x = place_point.x - shape.start_point.x
                y = place_point.y - shape.start_point.y

                shape.start_point.x += x
                shape.start_point.y += y

                shape.end_point.x += x
                shape.end_point.y += y
            elif type(shape) == self.Circle:
                x = place_point.x - shape.center_point.x
                y = place_point.y - shape.center_point.y

                shape.center_point.x += x
                shape.center_point.y += y
            elif type(shape) == self.Polygon:
                x = place_point.x - shape.points[0].x
                y = place_point.y - shape.points[0].y

                for i in range(len(shape.points)):
                    shape.points[i].x += x
                    shape.points[i].y += y
            elif type(shape) == list:
                for member in shape:
                    self.place_single_shape(member, place_point)

    def visitPlace(self, ctx: GraphlyParser.PlaceContext):
        shape_name = ctx.arg1.getText()
        place_point_name = ctx.arg2.getText()

        shape = self.try_to_get_member(ctx, ctx.arg1, shape_name)
        place_point = self.try_to_get_member(ctx, ctx.arg2, place_point_name)

        if type(place_point) == self.Point:
            if type(shape) in self.drawables:
                self.place_single_shape(shape, place_point)
            else:
                raise BadArgumentException(ctx.start.line, "place", shape_name, self.types[type(shape)])
        else:
            raise BadArgumentException(ctx.start.line, "place", place_point_name, self.types[type(place_point)])

        return self.visitChildren(ctx)

    def rotate_single_point(self, point, pivot, angle):
        s = sin(radians(angle))
        c = cos(radians(angle))

        origin_x = point.x - pivot.x
        origin_y = point.y - pivot.y

        new_x = origin_x * c - origin_y * s
        new_y = origin_x * s + origin_y * c

        return new_x + pivot.x, new_y + pivot.y

    def rotate_single_shape(self, shape, pivot_point, angle):
        if type(shape) == self.Point:
            x, y = self.rotate_single_point(shape, pivot_point, angle)

            shape.x = x
            shape.y = y
        elif type(shape) == self.Segment:
            start_x, start_y = self.rotate_single_point(shape.start_point, pivot_point, angle)
            end_x, end_y = self.rotate_single_point(shape.end_point, pivot_point, angle)

            shape.start_point.x = start_x
            shape.start_point.y = start_y
            shape.end_point.x = end_x
            shape.end_point.y = end_y
        elif type(shape) == self.Circle:
            x, y = self.rotate_single_point(shape.center_point, pivot_point, angle)

            shape.center_point.x = x
            shape.center_point.y = y
        elif type(shape) == self.Polygon:
            for i in range(len(shape.points)):
                x, y = self.rotate_single_point(shape.points[i], pivot_point, angle)

                shape.points[i].x = x
                shape.points[i].y = y
        elif type(shape) == list:
            for member in shape:
                self.rotate_single_shape(member, pivot_point, angle)

    def visitRotate(self, ctx: GraphlyParser.RotateContext):
        shape_name = ctx.arg1.getText()
        pivot_point_name = ctx.arg2.getText()

        shape = self.try_to_get_member(ctx, ctx.arg1, shape_name)
        pivot_point = self.try_to_get_member(ctx, ctx.arg2, pivot_point_name)

        angle = self.visit(ctx.angle)
        angle *= -1  # counterclockwise

        if type(shape) in self.drawables:
            self.rotate_single_shape(shape, pivot_point, angle)
        else:
            raise BadArgumentException(ctx.start.line, "rotate", shape_name, self.types[type(shape)])

        return self.visitChildren(ctx)

    def scale_single_point(self, point, pivot, factor):
        vector_x = factor * (point.x - pivot.x)
        vector_y = factor * (point.y - pivot.y)

        return pivot.x + vector_x, pivot.y + vector_y

    def scale_single_shape(self, shape, pivot_point, factor):
        if type(shape) == self.Point:
            x, y = self.scale_single_point(shape, pivot_point, factor)

            shape.x = x
            shape.y = y
        elif type(shape) == self.Segment:
            start_x, start_y = self.scale_single_point(shape.start_point, pivot_point, factor)
            end_x, end_y = self.scale_single_point(shape.end_point, pivot_point, factor)

            shape.start_point.x = start_x
            shape.start_point.y = start_y
            shape.end_point.x = end_x
            shape.end_point.y = end_y
        elif type(shape) == self.Circle:
            x, y = self.scale_single_point(shape.center_point, pivot_point, factor)

            shape.center_point.x = x
            shape.center_point.y = y
            shape.radius *= abs(factor)
        elif type(shape) == self.Polygon:
            for i in range(len(shape.points)):
                x, y = self.scale_single_point(shape.points[i], pivot_point, factor)

                shape.points[i].x = x
                shape.points[i].y = y
        elif type(shape) == list:
            for member in shape:
                self.scale_single_shape(member, pivot_point, factor)

    def visitScale(self, ctx: GraphlyParser.ScaleContext):
        shape_name = ctx.arg1.getText()
        pivot_point_name = ctx.arg2.getText()

        shape = self.try_to_get_member(ctx, ctx.arg1, shape_name)
        pivot_point = self.try_to_get_member(ctx, ctx.arg2, pivot_point_name)

        factor = self.visit(ctx.k)

        if type(shape) in self.drawables:
            self.scale_single_shape(shape, pivot_point, factor)
        else:
            raise BadArgumentException(ctx.start.line, "scale", shape_name, self.types[type(shape)])

        return self.visitChildren(ctx)

