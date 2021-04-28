class DrawBeforeCanvasException(Exception):
    def __init__(self, message="Drawing command was used before canvas initialization!"):
        self.message = message
        super().__init__(self.message)
