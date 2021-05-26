class IncorrectPolygonInitializationException(Exception):
    def __init__(self, line, group_name, polygon_name, type):
        self.message = f"Line no. {line}: invalid group {group_name} in polygon {polygon_name} creation!\n" \
                       f"All of group members should be points but at least one member's type is {type}!"
        super().__init__(self.message)
