class IndexOutOfRangeException(Exception):
    def __init__(self, line, group_name, index):
        self.message = f"Line no. {line}: index {index} is out of range for group {group_name}!"
        super().__init__(self.message)
