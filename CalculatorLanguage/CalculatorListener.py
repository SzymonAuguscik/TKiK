# Generated from Calculator.g4 by ANTLR 4.9.2
from antlr4 import *
if __name__ is not None and "." in __name__:
    from .CalculatorParser import CalculatorParser
else:
    from CalculatorParser import CalculatorParser

# This class defines a complete listener for a parse tree produced by CalculatorParser.
class CalculatorListener(ParseTreeListener):

    # Enter a parse tree produced by CalculatorParser#expression.
    def enterExpression(self, ctx:CalculatorParser.ExpressionContext):
        pass

    # Exit a parse tree produced by CalculatorParser#expression.
    def exitExpression(self, ctx:CalculatorParser.ExpressionContext):
        pass


    # Enter a parse tree produced by CalculatorParser#operation.
    def enterOperation(self, ctx:CalculatorParser.OperationContext):
        pass

    # Exit a parse tree produced by CalculatorParser#operation.
    def exitOperation(self, ctx:CalculatorParser.OperationContext):
        pass


    # Enter a parse tree produced by CalculatorParser#number.
    def enterNumber(self, ctx:CalculatorParser.NumberContext):
        pass

    # Exit a parse tree produced by CalculatorParser#number.
    def exitNumber(self, ctx:CalculatorParser.NumberContext):
        pass



del CalculatorParser