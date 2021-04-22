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
        self.variables = {}
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

    def enterProgram(self, ctx: GraphlyParser.ProgramContext):
        pygame.init()

    def exitProgram(self, ctx: GraphlyParser.ProgramContext):
        pygame.display.update()

    # def enterLoop(self, ctx: GraphlyParser.LoopContext):
    #     print("Loop")
    #
    # def enterCheck(self, ctx: GraphlyParser.CheckContext):
    #     print("Check")

    def enterPoint(self, ctx: GraphlyParser.PointContext):
        name = ctx.NAME().getText()

        if name not in self.variables:
            x_cord = float(ctx.operation_flt(0).getText())
            y_cord = float(ctx.operation_flt(1).getText())

            point = self.Point(name, x_cord, y_cord)

            self.variables[name] = point
        else:
            print_already_declared_variable_error(name)

    def enterSegment(self, ctx: GraphlyParser.SegmentContext):
        name = ctx.NAME(0).getText()

        if name not in self.variables:
            point1_name = ctx.NAME(1).getText()
            point2_name = ctx.NAME(2).getText()

            if point1_name in self.variables and point2_name in self.variables:
                p1 = self.variables[point1_name]
                p2 = self.variables[point2_name]

                if type(p1) == self.Point and type(p2) == self.Point:
                    segment = self.Segment(name, p1, p2)
                    self.variables[name] = segment
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

        if name not in self.variables:
            point_name = ctx.NAME(1).getText()

            if point_name in self.variables:
                point = self.variables[point_name]

                if type(point) == self.Point:
                    value = float(ctx.operation_flt().getText())
                    circle = self.Circle(name, point, value)

                    self.variables[name] = circle
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

        if name not in self.variables:
            group_name = ctx.NAME(1).getText()

            if group_name in self.variables:
                group = self.variables[group_name]

                if type(group) == list:
                    for member in group:
                        if type(member) != self.Point:
                            # TODO
                            # exception
                            print("Bad group member")

                    polygon = self.Polygon(name, group)

                    self.variables[name] = polygon
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

        if name not in self.variables:
            for arg in arguments:
                arg_name = arg.getText()

                if arg_name in self.variables:
                    member = self.variables[arg_name]
                    group_members.append(member)
                else:
                    # TODO
                    # exception
                    print("Error in group")

            self.variables[name] = group_members
        else:
            print_already_declared_variable_error(name)

    def enterGroupMember(self, ctx: GraphlyParser.GroupMemberContext):
        print("GroupMember")

    def enterNum(self, ctx: GraphlyParser.NumContext):
        name = ctx.NAME(0).getText()

        if name not in self.variables:
            value = float(ctx.operation_flt().getText())
            self.variables[name] = value
        else:
            print_already_declared_variable_error(name)

    # def enterIterator(self, ctx: GraphlyParser.IteratorContext):
    #     print(ctx.getText())

    def enterCanvas(self, ctx: GraphlyParser.CanvasContext):
        color = ctx.color().getText()

        name_x = str(ctx.operation_flt(0).getText())
        name_y = str(ctx.operation_flt(1).getText())

        if name_x in self.variables and name_y in self.variables:
            size_x = int(self.variables[name_x])
            size_y = int(self.variables[name_y])
            self.screen = pygame.display.set_mode((size_x, size_y))

        if color in self.colors:
            self.screen.fill(self.colors[color])
        else:
            # TODO
            # exception
            print(f"Error! Unknown color {color}")

    def enterDraw(self, ctx: GraphlyParser.DrawContext):
        name = ctx.NAME().getText()

        if name in self.variables:
            variable = self.variables[name]
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

        if name in self.variables:
            variable = self.variables[name]

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