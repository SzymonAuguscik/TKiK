class IncorrectPolygonCreationException(Exception):
    def __init__(self, group_name, type):
        self.message = f"Incorrect member in points group {group_name}! Found member of type {type}!"
        super().__init__(self.message)
