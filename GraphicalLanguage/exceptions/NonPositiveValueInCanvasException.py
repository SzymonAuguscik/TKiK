class NonPositiveValueInCanvasException(Exception):
    def __init__(self, line, value):
        self.message = f"Line no. {line}: canvas cannot be initialized with size {value}!"
        super().__init__(self.message)
