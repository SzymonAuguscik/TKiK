// Generated from Calculator.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CalculatorParser}.
 */
public interface CalculatorListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CalculatorParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(CalculatorParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(CalculatorParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculatorParser#operation}.
	 * @param ctx the parse tree
	 */
	void enterOperation(CalculatorParser.OperationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParser#operation}.
	 * @param ctx the parse tree
	 */
	void exitOperation(CalculatorParser.OperationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculatorParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(CalculatorParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(CalculatorParser.NumberContext ctx);
}