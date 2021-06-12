class IllegalCharacterException(Exception):
    def __init__(self, line, name):
        self.message = f"Line no. {line}: illegal character in filename {name}! You cannot use blank spaces and any of these: #%&{{}}\\<>*?/ $!\'\":@+`|="
        super().__init__(self.message)
