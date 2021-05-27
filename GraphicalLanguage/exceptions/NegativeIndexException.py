class NegativeIndexException(Exception):
    def __init__(self, line, group_name, index):
        self.message = f"Line no. {line}: group member of group {group_name} cannot have negative indices! Got index {index}!"
        super().__init__(self.message)
