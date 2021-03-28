import antlr4
import sys

from CalculatorLexer import CalculatorLexer
from CalculatorParser import CalculatorParser
from CalculatorListener import CalculatorListener


class Calculator(CalculatorListener):
    # Exit a parse tree produced by CalculatorParser#expression.
    def exitOperation(self, ctx):
        multiplying = True
        value = 1
        for child in ctx.getChildren():
            if isinstance(child, antlr4.tree.Tree.TerminalNode):
                multiplying = child.getText() == "*"
            else:
                if multiplying:
                    value *= float(child.getText())
                else:
                    value /= float(child.getText())

        return value

    # Exit a parse tree produced by CalculatorParser#operation.
    def exitExpression(self, ctx):
        adding = True
        value = 0
        for child in ctx.getChildren():
            if isinstance(child, antlr4.tree.Tree.TerminalNode):
                adding = child.getText() == "+"
            else:
                multValue = self.exitOperation(child)
                if adding:
                    value += multValue
                else:
                    value -= multValue
        return value


def main(argv):
    input_stream = antlr4.FileStream(argv[1])

    lexer = CalculatorLexer(input_stream)
    stream = antlr4.CommonTokenStream(lexer)
    parser = CalculatorParser(stream)
    tree = parser.expression()

    calculator = Calculator()
    value = calculator.exitExpression(tree)

    print(f"Got: {tree.getText()}")
    print(f"Parsed as: {value}")


if __name__ == '__main__':
    main(sys.argv)
