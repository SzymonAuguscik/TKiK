class SaveBeforeCanvasException(Exception):
    def __init__(self, line, message="saving command was used before canvas initialization!"):
        self.message = f"Line no. {line}: " + message
        super().__init__(self.message)
