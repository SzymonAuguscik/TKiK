class BadColorException(Exception):
    def __init__(self, name):
        self.message = f"Unknown color {name}!"
        super().__init__(self.message)
