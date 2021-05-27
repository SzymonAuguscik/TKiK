class UnknownOperationException(Exception):
    def __init__(self, line, op):
        self.message = f"Line no. {line}: unknown operation {op}!"
        super().__init__(self.message)
