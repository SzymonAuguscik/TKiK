class UnknownVariableException(Exception):
    def __init__(self, line, name):
        self.message = f"Line no. {line}: Unknown variable {name}!"
        super().__init__(self.message)
