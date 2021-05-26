class BadArgumentException(Exception):
    def __init__(self, line, method_name, variable_name, type):
        self.message = f"Line no. {line}: {method_name} cannot be used with {variable_name} of type {type}"
        super().__init__(self.message)
