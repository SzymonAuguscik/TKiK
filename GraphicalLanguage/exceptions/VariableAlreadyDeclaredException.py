class VariableAlreadyDeclaredException(Exception):
    def __init__(self, name):
        self.message = f"Variable {name} already declared!"
        super().__init__(self.message)
