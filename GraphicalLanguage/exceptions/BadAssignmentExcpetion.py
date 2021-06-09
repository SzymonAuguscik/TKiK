class BadAssignmentException(Exception):
    def __init__(self, line, expected_type, found_type):
        self.message = f"Line no. {line}: cannot assign type {found_type} to type {expected_type}"
        super().__init__(self.message)
