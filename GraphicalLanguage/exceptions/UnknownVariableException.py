class UnknownVariableException(Exception):
    def __init__(self, name):
        self.message = f"Unknown variable {name}!"
        super().__init__(self.message)
