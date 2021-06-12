class NoCanvasException(Exception):
    def __init__(self, line):
        self.message = f"Line no. {line}: No canvas was defined! You must define one!"
        super().__init__(self.message)
