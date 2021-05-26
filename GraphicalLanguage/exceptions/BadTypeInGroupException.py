class BadTypeInGroupException(Exception):
    def __init__(self, line, group_name, correct_type, wrong_type):
        self.message = f"Line no. {line}: incorrect member in group {group_name} of types {correct_type}! Found member of type {wrong_type}!"
        super().__init__(self.message)
