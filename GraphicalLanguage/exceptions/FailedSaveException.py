class FailedSaveException(Exception):
    def __init__(self, line, name):
        self.message = f"Line no. {line}: failed to save canvas to {name}!"
        super().__init__(self.message)
