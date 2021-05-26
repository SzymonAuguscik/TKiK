class BadColorException(Exception):
    def __init__(self, line, name):
        self.message = f"Line no. {line}: unknown color {name}!"
        super().__init__(self.message)
