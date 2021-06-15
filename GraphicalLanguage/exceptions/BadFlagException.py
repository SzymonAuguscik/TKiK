class BadFlagException(Exception):
    def __init__(self, flag):
        self.message = f"Incorrect argument! Expected '-e' or nothing, got '{flag}' instead"
        super().__init__(self.message)
