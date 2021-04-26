import pygame

from GraphlyListener import GraphlyListener
from GraphlyParser import GraphlyParser


class GraphlyProgramListener(GraphlyListener):
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

    def create_variable(self, name, value):
        # Creates variable in the current scope
        self.scopes[-1][name] = value

    def enterProgram(self, ctx: GraphlyParser.ProgramContext):
        pygame.init()
        self.scopes.append({})

    def exitProgram(self, ctx: GraphlyParser.ProgramContext):
        pygame.display.update()

    def enterLoop(self, ctx: GraphlyParser.LoopContext):
        self.scopes.append({})

    def exitLoop(self, ctx:GraphlyParser.LoopContext):
        self.scopes.pop()
    
    def enterCheck(self, ctx: GraphlyParser.CheckContext):
        self.scopes.append({})

    def exitCheck(self, ctx:GraphlyParser.CheckContext):
        self.scopes.pop()

    def enterPoint(self, ctx: GraphlyParser.PointContext):
        name = ctx.NAME().getText()

        if not self.variable_exists(name):
            x_cord = float(ctx.operation_flt(0).getText())
            y_cord = float(ctx.operation_flt(1).getText())

            point = self.Point(name, x_cord, y_cord)

            self.create_variable(name, point)
        else:
            print_already_declared_variable_error(name)

    def enterSegment(self, ctx: GraphlyParser.SegmentContext):
        name = ctx.NAME(0).getText()

        if not self.variable_exists(name):
            point1_name = ctx.NAME(1).getText()
            point2_name = ctx.NAME(2).getText()

            if self.variable_exists(point1_name) and self.variable_exists(point2_name):
                p1 = self.get_variable(point1_name)
                p2 = self.get_variable(point2_name)

                if type(p1) == self.Point and type(p2) == self.Point:
                    segment = self.Segment(name, p1, p2)
                    self.create_variable(name, segment)
                else:
                    # TODO
                    # exception
                    print("Bad type")
            else:
                # TODO
                # change it later with throwing exception
                print(f"Error! Uknown variable")
        else:
            print_already_declared_variable_error(name)

    def enterCircle(self, ctx: GraphlyParser.CircleContext):
        name = ctx.NAME(0).getText()

        if not self.variable_exists(name):
            point_name = ctx.NAME(1).getText()

            if self.variable_exists(point_name):
                point = self.get_variable(point_name)

                if type(point) == self.Point:
                    value = float(ctx.operation_flt().getText())
                    circle = self.Circle(name, point, value)

                    self.create_variable(name, circle)
                else:
                    # TODO
                    # exception
                    print("Bad type")
            else:
                # TODO
                # exception
                print("Error!")
        else:
            print_already_declared_variable_error(name)

    def enterPolygon(self, ctx: GraphlyParser.PolygonContext):
        name = ctx.NAME(0).getText()

        if not self.variable_exists(name):
            group_name = ctx.NAME(1).getText()

            if self.variable_exists(group_name):
                group = self.get_variable(group_name)

                if type(group) == list:
                    for member in group:
                        if type(member) != self.Point:
                            # TODO
                            # exception
                            print("Bad group member")

                    polygon = self.Polygon(name, group)

                    self.create_variable(name, polygon)
                else:
                    # TODO
                    # exception
                    print("Bad argument of polygon")
            else:
                # TODO
                # exception
                print("Error in polygon")
        else:
            print_already_declared_variable_error(name)

    # TODO
    # Possible problem with no args
    # Deal with different types of members
    def enterGroup(self, ctx: GraphlyParser.GroupContext):
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
                    # TODO
                    # exception
                    print("Error in group")

            self.create_variable(name, group_members)
        else:
            print_already_declared_variable_error(name)

    def enterGroupMember(self, ctx: GraphlyParser.GroupMemberContext):
        print("GroupMember")

    def enterNum(self, ctx: GraphlyParser.NumContext):
        name = ctx.NAME(0).getText()

        if not self.variable_exists(name):
            value = float(ctx.operation_flt().getText())
            self.create_variable(name, value)
        else:
            print_already_declared_variable_error(name)

    # def enterIterator(self, ctx: GraphlyParser.IteratorContext):
    #     print(ctx.getText())

    def enterCanvas(self, ctx: GraphlyParser.CanvasContext):
        color = ctx.color().getText()

        name_x = str(ctx.operation_flt(0).getText())
        name_y = str(ctx.operation_flt(1).getText())

        if self.variable_exists(name_x) and self.variable_exists(name_y):
            size_x = int(self.get_variable(name_x))
            size_y = int(self.get_variable(name_y))
            self.screen = pygame.display.set_mode((size_x, size_y))

        if color in self.colors:
            self.screen.fill(self.colors[color])
        else:
            # TODO
            # exception
            print(f"Error! Unknown color {color}")

    def enterDraw(self, ctx: GraphlyParser.DrawContext):
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
            # TODO
            # exception
            print("Unknown variable")

    def enterFill(self, ctx: GraphlyParser.FillContext):
        name = ctx.NAME().getText()

        if self.variable_exists(name):
            variable = self.get_variable(name)

            if type(variable) in (self.Point, self.Segment, self.Circle, self.Polygon):
                color = ctx.color().getText()

                if color in self.colors:
                    variable.color = self.colors[color]
                else:
                    # TODO
                    # exception
                    print("Error! Bad color")
            else:
                # TODO
                # exception
                print("Error! Bad argument")
        else:
            # TODO
            # exception
            print("Error in fill")

    def enterMove(self, ctx: GraphlyParser.MoveContext):
        print("Move")

    def enterPlace(self, ctx: GraphlyParser.PlaceContext):
        print("Place")

    def enterRotate(self, ctx: GraphlyParser.RotateContext):
        print("Rotate")

    def enterScale(self, ctx: GraphlyParser.ScaleContext):
        print("Scale")


def print_already_declared_variable_error(name):
    print(f"Error! Variable {name} already declared!")