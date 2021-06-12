class BadTypeInExpressionException(Exception):
    def __init__(self, line, wrong_type):
        self.message = f"Line no. {line}: cannot use type {wrong_type} in expression! Only type num is accepted."
        super().__init__(self.message)