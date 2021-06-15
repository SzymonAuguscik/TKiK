class MultipleCanvasException(Exception):
    def __init__(self, line):
        self.message = f"Line no. {line}: Multiple canvas definition found! There can only be one canvas defined!"
        super().__init__(self.message)