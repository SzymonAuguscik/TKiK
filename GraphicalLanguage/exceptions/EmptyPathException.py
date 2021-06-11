class EmptyPathException(Exception):
    def __init__(self):
        self.message = f"Cannot read file! Empty path was given!"
        super().__init__(self.message)
