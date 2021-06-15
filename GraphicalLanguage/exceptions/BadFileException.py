class BadFileException(Exception):
    def __init__(self, path):
        self.message = f"Cannot read file {path}! Check if it exists or whether it's a file!"
        super().__init__(self.message)
