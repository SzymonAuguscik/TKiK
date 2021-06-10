import pygame
from math import sin, cos, radians

class Drawable:
    def draw(self, screen):
        pass

    def fill(self, color):
        self.color = color
    
    def move(self, x, y):
        pass
    
    def place(self, point):
        pass
    
    def rotate(self, point, angle):
        pass
    
    def scale(self, point, factor):
        pass

    def rotate_single_point(self, point, pivot, angle):
        s = sin(radians(angle))
        c = cos(radians(angle))

        origin_x = point.x - pivot.x
        origin_y = point.y - pivot.y

        new_x = origin_x * c - origin_y * s
        new_y = origin_x * s + origin_y * c

        return new_x + pivot.x, new_y + pivot.y

    def scale_single_point(self, point, pivot, factor):
        vector_x = factor * (point.x - pivot.x)
        vector_y = factor * (point.y - pivot.y)

        return pivot.x + vector_x, pivot.y + vector_y


class Group(Drawable):
    def __init__(self, name, type_, members):
        self.name = name
        self.type = type_   
        self.members = members
    
    def __str__(self):
        ret = f'<group<{self.type}>, {self.name}, [\n'
        for m in self.members:
            ret += '  ' + str(m) + ','
        return ret[:-2] + f'\n]>'

    def draw(self, screen):
        for m in self.members:
            m.draw(screen)

    def fill(self, color):
        for m in self.members:
            m.fill(color)
    
    def move(self, x, y):
        for m in self.members:
            m.move(x, y)
    
    def place(self, point):
        for m in self.members:
            m.place(point)
    
    def rotate(self, point, angle):
        for m in self.members:
            m.rotate(point, angle)
    
    def scale(self, point, factor):
        for m in self.members:
            m.scale(point, factor)
        

class Point(Drawable):
    POINT_RADIUS = 3

    def __init__(self, name, x, y):
        self.x = x
        self.y = y
        self.name = name
        self.color = (0, 0, 0)

    def get_coordination_tuple(self):
        return self.x, self.y

    def __str__(self):
        return f'<point, {self.name}, ({self.x}, {self.y}), #{self.color}>'

    def draw(self, screen):
        pygame.draw.circle(screen, self.color, (self.x, self.y), self.POINT_RADIUS)
    
    def move(self, x, y):
        self.x += x
        self.y += y
    
    def place(self, point):
        x = point.x - self.x
        y = point.y - self.y

        self.x += x
        self.y += y
    
    def rotate(self, point, angle):
        x, y = self.rotate_single_point(self, point, angle)

        self.x = x
        self.y = y
    
    def scale(self, point, factor):
        x, y = self.scale_single_point(self, point, factor)

        self.x = x
        self.y = y


class Segment(Drawable):
    SEGMENT_WIDTH = 1

    def __init__(self, name, start_point, end_point):
        self.name = name
        self.start_point = start_point
        self.end_point = end_point
        self.color = (0, 0, 0)
        self.width = self.SEGMENT_WIDTH
    
    def __str__(self):
        return f'<segment, {self.name}, {self.start_point}, {self.end_point}, #{self.color}>'

    def draw(self, screen):
        start_point = self.start_point.get_coordination_tuple()
        end_point = self.end_point.get_coordination_tuple()
        pygame.draw.line(screen, self.color, start_point, end_point, self.width)
 
    def move(self, x, y):
        self.start_point.x += x
        self.start_point.y += y
        self.end_point.x += x
        self.end_point.y += y
    
    def place(self, point):
        x = point.x - self.start_point.x
        y = point.y - self.start_point.y

        self.start_point.x += x
        self.start_point.y += y

        self.end_point.x += x
        self.end_point.y += y
    
    def rotate(self, point, angle):
        start_x, start_y = self.rotate_single_point(self.start_point, point, angle)
        end_x, end_y = self.rotate_single_point(self.end_point, point, angle)

        self.start_point.x = start_x
        self.start_point.y = start_y
        self.end_point.x = end_x
        self.end_point.y = end_y
    
    def scale(self, point, factor):
        start_x, start_y = self.scale_single_point(self.start_point, point, factor)
        end_x, end_y = self.scale_single_point(self.end_point, point, factor)

        self.start_point.x = start_x
        self.start_point.y = start_y
        self.end_point.x = end_x
        self.end_point.y = end_y


class Circle(Drawable):
    CIRCLE_WIDTH = 1

    def __init__(self, name, center_point, radius):
        self.name = name
        self.center_point = center_point
        self.radius = radius
        self.color = (0, 0, 0)
        self.width = self.CIRCLE_WIDTH

    def __str__(self):
        return f'<circle, {self.name}, {self.center_point}, {self.radius}, #{self.color}>'

    def draw(self, screen):
        center_point = self.center_point.get_coordination_tuple()
        pygame.draw.circle(screen, self.color, center_point, self.radius)
  
    def move(self, x, y):
        self.center_point.x += x
        self.center_point.y += y
    
    def place(self, point):
        x = point.x - self.center_point.x
        y = point.y - self.center_point.y

        self.center_point.x += x
        self.center_point.y += y
    
    def rotate(self, point, angle):
        x, y = self.rotate_single_point(self.center_point, point, angle)

        self.center_point.x = x
        self.center_point.y = y
    
    def scale(self, point, factor):
        x, y = self.scale_single_point(self.center_point, point, factor)

        self.center_point.x = x
        self.center_point.y = y
        self.radius *= abs(factor)


class Polygon(Drawable):
    POLYGON_WIDTH = 0

    def __init__(self, name, points):
        self.name = name
        self.points = points
        self.color = (0, 0, 0)
        self.width = self.POLYGON_WIDTH

    def __str__(self):
        ret = f'<polygon, {self.name}, ['
        for p in self.points:
            ret += str(p) + ', '
        return ret[:-2] + f'], #{self.color}>'

    def draw(self, screen):
        coordination_tuples_list = [point.get_coordination_tuple() for point in self.points]
        pygame.draw.polygon(screen, self.color, coordination_tuples_list, self.width)

    def move(self, x, y):
        for i in range(len(self.points)):
            self.points[i].x += x
            self.points[i].y += y
    
    def place(self, point):
        x = point.x - self.points[0].x
        y = point.y - self.points[0].y

        for i in range(len(self.points)):
            self.points[i].x += x
            self.points[i].y += y
    
    def rotate(self, point, angle):
        for i in range(len(self.points)):
            x, y = self.rotate_single_point(self.points[i], point, angle)

            self.points[i].x = x
            self.points[i].y = y
    
    def scale(self, point, factor):
        for i in range(len(self.points)):
            x, y = self.scale_single_point(self.points[i], point, factor)

            self.points[i].x = x
            self.points[i].y = y
    