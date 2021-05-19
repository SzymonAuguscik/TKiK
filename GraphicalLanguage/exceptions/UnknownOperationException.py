class UnknownOperationException(Exception):
    def __init__(self, op):
        self.message = f"Unknown operation {op}!"
        super().__init__(self.message)