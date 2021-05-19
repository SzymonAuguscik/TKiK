import pygame
from re import split, sub

from GraphlyVisitor import GraphlyVisitor
from GraphlyParser import GraphlyParser

from exceptions.VariableAlreadyDeclaredException import VariableAlreadyDeclaredException
from exceptions.UnknownVariableException import UnknownVariableException
from exceptions.BadArgumentException import BadArgumentException
from exceptions.BadColorException import BadColorException
from exceptions.IncorrectPolygonCreationException import IncorrectPolygonCreationException

from re import split, sub
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
            "#pink": (255, 100, 203)
        }
        self.screen = pygame.display.set_mode((self.SCREEN_WIDTH, self.SCREEN_HEIGHT))

    def variable_exists(self, variable):
        # Checks if variable exists in any scope
        # TODO
        # Alternatively, we can check if variable exists only in the current
        # scope, allowing to create variables of the same name as in higher
        # scopes. Also, functionality of this function could be implemented by
        # get_variable.
        for scope in reversed(self.scopes):
            if variable in scope:
                return True
        return False

    def get_variable(self, variable):
        # Returns variable if found in any scope, or None
        # TODO
        # This function could throw an error, so that we don't need to perform
        # all those checks all over the code.
        for scope in reversed(self.scopes):
            if variable in scope:
                return scope[variable]
        return None

    def set_variable(self, name, value):
        # Sets/creates variable in the current scope
        self.scopes[-1][name] = value


    def check_if_variables(self, variables_text):
        #Returns value of all given variables if given correctly
        #TODO
        #Check if variable are named or given properly

        values = []

        for variable_text in variables_text:
            if variable_text[0].isupper() and not self.cointains_op(variable_text):
                if self.variable_exists(variable_text):
                    values.append(self.get_variable(variable_text))
                else:
                    raise UnknownVariableException(variable_text)
            else:
                variable_text = self.operation_to_eval(variable_text)
                values.append(eval(variable_text))

        return values


    def cointains_op(self, variables_text):
        #checks if there is a string in operation text
        operations = "+-*/%"
        for op in operations:
            if op in variables_text:
                return True

        return False



    def operation_to_eval(self, operation_text):
        #Takes operation string and checks if there is variable 
        #if there is variable search for its value

        operations = "+-*/%"

        operation_text = operation_text.replace(" ", "")

        if operation_text[0] == '-':
            operation_text = "0" + operation_text

        operation_arr = split('\+|\-|\*|\/|\%', operation_text)

        for op in operations:
            operation_text = operation_text.replace(op, " " + op + " ")
        
        for var in operation_arr:
            if var[0].isupper():
                if self.variable_exists(var):
                    operation_text = sub(r'\b{}\b'.format(var), str(self.get_variable(var)), operation_text)
                else:
                    raise UnknownVariableException(var)

        return operation_text
    

    def visitProgram(self, ctx: GraphlyParser.ProgramContext):
        pygame.init()
        self.scopes.append({})
        self.visitChildren(ctx)
        pygame.display.update()

    def visitLoop(self, ctx: GraphlyParser.LoopContext):
        self.scopes.append({})
        
        name = ctx.NAME(0).getText()

        iterator = int(ctx.itr(0).getText())
        until = int(ctx.itr(1).getText())
        step = int(ctx.itr(2).getText())
        block = ctx.block()

        if not self.variable_exists(name):
            self.set_variable(name, iterator)
        else:
            raise VariableAlreadyDeclaredException(name)
        
        while iterator < until:
            print(f'{name}: {self.get_variable(name)}')
            self.visit(block)
            
            iterator += step
            self.set_variable(name, iterator)

        self.scopes.pop()

    def visitCheck(self, ctx: GraphlyParser.CheckContext):
        self.scopes.append({})
        
        do_else = True
        for cb in ctx.condition_block():
            if self.visit(cb.cond()):
                self.visit(cb.block())
                do_else = False
                break
        
        if do_else and not ctx.block() is None:
            self.visit(ctx.block())

        self.scopes.pop()

    # TODO
    # add exceptions after providing full variables service

    def visitPoint(self, ctx: GraphlyParser.PointContext):
        name = ctx.NAME().getText()

        if not self.variable_exists(name):
            x_cord = ctx.operation_flt(0).getText()
            y_cord = ctx.operation_flt(1).getText()
            values = self.check_if_variables([x_cord, y_cord])

            point = self.Point(name, values[0], values[1])

            self.set_variable(name, point)
        else:
            raise VariableAlreadyDeclaredException(name)

        return self.visitChildren(ctx)

    def visitSegment(self, ctx: GraphlyParser.SegmentContext):
        name = ctx.NAME(0).getText()

        if not self.variable_exists(name):
            point1_name = ctx.NAME(1).getText()
            point2_name = ctx.NAME(2).getText()

            if self.variable_exists(point1_name) and self.variable_exists(point2_name):
                p1 = self.get_variable(point1_name)
                p2 = self.get_variable(point2_name)

                if type(p1) == self.Point and type(p2) == self.Point:
                    segment = self.Segment(name, p1, p2)
                    self.set_variable(name, segment)
                else:
                    if type(p1) != self.Point:
                        raise BadArgumentException("segment", point1_name, type(p1))
                    raise BadArgumentException("segment", point2_name, type(p2))
            else:
                if not self.variable_exists(point1_name):
                    raise UnknownVariableException(point1_name)
                raise UnknownVariableException(point2_name)
        else:
            raise VariableAlreadyDeclaredException(name)

        return self.visitChildren(ctx)

    def visitCircle(self, ctx: GraphlyParser.CircleContext):
        name = ctx.NAME(0).getText()

        if not self.variable_exists(name):
            point_name = ctx.NAME(1).getText()

            if self.variable_exists(point_name):
                point = self.get_variable(point_name)

                if type(point) == self.Point:
                    value = self.check_if_variables([ctx.operation_flt().getText()])
                    circle = self.Circle(name, point, value[0])

                    self.set_variable(name, circle)
                else:
                    raise BadArgumentException("circle", point_name, type(point))
            else:
                raise UnknownVariableException(point_name)
        else:
            raise VariableAlreadyDeclaredException(name)

        return self.visitChildren(ctx)

    def visitPolygon(self, ctx: GraphlyParser.PolygonContext):
        name = ctx.NAME(0).getText()

        if not self.variable_exists(name):
            group_name = ctx.NAME(1).getText()

            if self.variable_exists(group_name):
                group = self.get_variable(group_name)

                if type(group) == list:
                    for member in group:
                        if type(member) != self.Point:
                            raise IncorrectPolygonCreationException(
                                group_name, type(member))

                    polygon = self.Polygon(name, group)

                    self.set_variable(name, polygon)
                else:
                    raise BadArgumentException("polygon", group_name, type(group))
            else:
                raise UnknownVariableException(group_name)
        else:
            raise VariableAlreadyDeclaredException(name)

        return self.visitChildren(ctx)




    

    # TODO
    # Possible problem with no args
    # Deal with different types of members
    def visitGroup(self, ctx: GraphlyParser.GroupContext):
        name_tokens = ctx.getTokens(GraphlyParser.NAME)

        name = name_tokens[0].getText()
        arguments = name_tokens[1:]
        group_members = []

        if not self.variable_exists(name):
            for arg in arguments:
                arg_name = arg.getText()

                if self.variable_exists(arg_name):
                    member = self.get_variable(arg_name)
                    group_members.append(member)
                else:
                    raise UnknownVariableException(arg_name)

            self.set_variable(name, group_members)
        else:
            raise VariableAlreadyDeclaredException(name)

        return self.visitChildren(ctx)

    def visitGroupMember(self, ctx: GraphlyParser.GroupMemberContext):
        print("GroupMember")

        return self.visitChildren(ctx)

    def visitNum(self, ctx: GraphlyParser.NumContext):
        name = ctx.NAME().getText()

        if not self.variable_exists(name):
            value = self.check_if_variables([ctx.operation_flt().getText()])
            self.set_variable(name, value[0])
        else:
            raise VariableAlreadyDeclaredException(name)

        return self.visitChildren(ctx)

    def visitCanvas(self, ctx: GraphlyParser.CanvasContext):
        color = ctx.COLOR().getText()

        name_x = str(ctx.operation_flt(0).getText())
        name_y = str(ctx.operation_flt(1).getText())

        sizes = self.check_if_variables([name_x, name_y])
        self.screen = pygame.display.set_mode((int(sizes[0]), int(sizes[1])))

        if color in self.colors:
            self.screen.fill(self.colors[color])
        else:
            raise BadColorException(color)

        return self.visitChildren(ctx)

    def visitDraw(self, ctx: GraphlyParser.DrawContext):
        name = ctx.NAME().getText()

        if self.variable_exists(name):
            variable = self.get_variable(name)

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
            else:
                raise BadArgumentException("draw", name, type(variable))
        else:
            raise UnknownVariableException(name)

        return self.visitChildren(ctx)

    def visitFill(self, ctx: GraphlyParser.FillContext):
        name = ctx.NAME().getText()

        if self.variable_exists(name):
            variable = self.get_variable(name)

            if type(variable) in (self.Point, self.Segment, self.Circle, self.Polygon):
                color = ctx.COLOR().getText()

                if color in self.colors:
                    variable.color = self.colors[color]
                else:
                    raise BadColorException(color)
            else:
                raise BadArgumentException("fill", name, type(variable))
        else:
            raise UnknownVariableException(name)

        return self.visitChildren(ctx)

    def visitCond(self, ctx: GraphlyParser.CondContext):
        # TODO
        # return true value of condition
        return len(ctx.logic().getText()) == 2

    def visitMove(self, ctx: GraphlyParser.MoveContext):
        name = ctx.NAME().getText()

        variable = self.get_variable(name)
        name_x = str(ctx.operation_flt(0).getText())
        name_y = str(ctx.operation_flt(1).getText())

        x, y = self.check_if_variables([name_x, name_y])

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
        else:
            raise BadArgumentException("move", name, type(variable))

        return self.visitChildren(ctx)

    def visitPlace(self, ctx: GraphlyParser.PlaceContext):
        shape_name = ctx.NAME(0).getText()
        place_point_name = ctx.NAME(1).getText()

        shape = self.get_variable(shape_name)
        place_point = self.get_variable(place_point_name)

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
            else:
                raise BadArgumentException("place", shape_name, type(shape))
        else:
            raise BadArgumentException("place", place_point_name, type(place_point))

        return self.visitChildren(ctx)

    def rotate_single_point(self, point, pivot, angle):
        s = sin(radians(angle))
        c = cos(radians(angle))

        origin_x = point.x - pivot.x
        origin_y = point.y - pivot.y

        new_x = origin_x * c - origin_y * s
        new_y = origin_x * s + origin_y * c

        return new_x + pivot.x, new_y + pivot.y

    def visitRotate(self, ctx: GraphlyParser.RotateContext):
        shape_name = ctx.NAME(0).getText()
        pivot_point_name = ctx.NAME(1).getText()

        shape = self.get_variable(shape_name)
        pivot_point = self.get_variable(pivot_point_name)

        angle_name = ctx.operation_flt().getText()
        [angle] = self.check_if_variables([angle_name])
        angle *= -1  # counterclockwise

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
        else:
            raise BadArgumentException("rotate", shape_name, type(shape))

        return self.visitChildren(ctx)

    def scale_single_point(self, point, pivot, factor):
        vector_x = factor * (point.x - pivot.x)
        vector_y = factor * (point.y - pivot.y)

        return pivot.x + vector_x, pivot.y + vector_y

    def visitScale(self, ctx: GraphlyParser.ScaleContext):
        shape_name = ctx.NAME(0).getText()
        pivot_point_name = ctx.NAME(1).getText()

        shape = self.get_variable(shape_name)
        pivot_point = self.get_variable(pivot_point_name)

        factor_name = ctx.operation_flt().getText()
        [factor] = self.check_if_variables([factor_name])

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
        else:
            raise BadArgumentException("scale", shape_name, type(shape))

        return self.visitChildren(ctx)
