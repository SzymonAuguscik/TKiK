class UnknownGroupTypeException(Exception):
    def __init__(self, line, type):
        self.message = f"Line no. {line}: unknown group member type {type}!"
        super().__init__(self.message)
