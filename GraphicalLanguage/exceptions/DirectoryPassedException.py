class DirectoryPassedException(Exception):
    def __init__(self, path):
        self.message = f"Cannot read file! Given path - {path} - leads to directory instead of Graphly file!"
        super().__init__(self.message)
