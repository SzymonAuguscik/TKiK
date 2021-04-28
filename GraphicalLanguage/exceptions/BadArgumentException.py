class BadArgumentException(Exception):
    def __init__(self, method_name, variable_name, type):
        self.message = f"{method_name} cannot be used with {variable_name} of type {type}"
        super().__init__(self.message)
