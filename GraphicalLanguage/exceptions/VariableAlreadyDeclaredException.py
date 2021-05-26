class VariableAlreadyDeclaredException(Exception):
    def __init__(self, line, name):
        self.message = f"Line no. {line}: variable {name} already declared!"
        super().__init__(self.message)
