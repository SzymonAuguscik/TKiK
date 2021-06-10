class Drawable:
    def draw(self):
        pass

    def fill(self, color):
        pass
    
    def move(self, dx, dy):
        pass
    
    def place(self, point):
        pass
    
    def rotate(self, angle, point):
        pass
    
    def scale(self, k, point):
        pass

class Group(Drawable):
    def __init__(self, members, type_):
        #TODO: add validation        
        self.members = members
        self.type = type_

    def draw(self):
        for m in self.members:
            m.draw()

    def fill(self, color):
        for m in self.members:
            m.fill(color)
    
    def move(self, dx, dy):
        for m in self.members:
            m.move(dx, dy)
    
    def place(self, point):
        for m in self.members:
            m.place(point)
    
    def rotate(self, angle, point):
        for m in self.members:
            m.rotate(angle, point)
    
    def scale(self, k, point):
        for m in self.members:
            m.scale(k, point)

class Point(Drawable):
    def __init__(self, name, x, y):
        self.x = x
        self.y = y
        self.name = name
        self.color = (0, 0, 0)

    def get_coordination_tuple(self):
        return self.x, self.y

    def __str__(self):
        return f'<point, {self.name}, ({self.x}, {self.y}), #{self.color}>'

    def draw(self):
        pass

    def fill(self, color):
        pass
    
    def move(self, dx, dy):
        pass
    
    def place(self, point):
        pass
    
    def rotate(self, angle, point):
        pass
    
    def scale(self, k, point):
        pass


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

    def draw(self):
        pass

    def fill(self, color):
        pass
    
    def move(self, dx, dy):
        pass
    
    def place(self, point):
        pass
    
    def rotate(self, angle, point):
        pass
    
    def scale(self, k, point):
        pass


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

    def draw(self):
        pass

    def fill(self, color):
        pass
    
    def move(self, dx, dy):
        pass
    
    def place(self, point):
        pass
    
    def rotate(self, angle, point):
        pass
    
    def scale(self, k, point):
        pass


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

    def draw(self):
        pass

    def fill(self, color):
        pass
    
    def move(self, dx, dy):
        pass
    
    def place(self, point):
        pass
    
    def rotate(self, angle, point):
        pass
    
    def scale(self, k, point):
        pass
    