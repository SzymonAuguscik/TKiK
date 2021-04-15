// Generated from Graphly.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GraphlyParser}.
 */
public interface GraphlyListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GraphlyParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(GraphlyParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraphlyParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(GraphlyParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link GraphlyParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterInstruction(GraphlyParser.InstructionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraphlyParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitInstruction(GraphlyParser.InstructionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GraphlyParser#instruction_without_draw}.
	 * @param ctx the parse tree
	 */
	void enterInstruction_without_draw(GraphlyParser.Instruction_without_drawContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraphlyParser#instruction_without_draw}.
	 * @param ctx the parse tree
	 */
	void exitInstruction_without_draw(GraphlyParser.Instruction_without_drawContext ctx);
	/**
	 * Enter a parse tree produced by {@link GraphlyParser#loop}.
	 * @param ctx the parse tree
	 */
	void enterLoop(GraphlyParser.LoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraphlyParser#loop}.
	 * @param ctx the parse tree
	 */
	void exitLoop(GraphlyParser.LoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link GraphlyParser#check}.
	 * @param ctx the parse tree
	 */
	void enterCheck(GraphlyParser.CheckContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraphlyParser#check}.
	 * @param ctx the parse tree
	 */
	void exitCheck(GraphlyParser.CheckContext ctx);
	/**
	 * Enter a parse tree produced by {@link GraphlyParser#shape}.
	 * @param ctx the parse tree
	 */
	void enterShape(GraphlyParser.ShapeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraphlyParser#shape}.
	 * @param ctx the parse tree
	 */
	void exitShape(GraphlyParser.ShapeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GraphlyParser#point}.
	 * @param ctx the parse tree
	 */
	void enterPoint(GraphlyParser.PointContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraphlyParser#point}.
	 * @param ctx the parse tree
	 */
	void exitPoint(GraphlyParser.PointContext ctx);
	/**
	 * Enter a parse tree produced by {@link GraphlyParser#segment}.
	 * @param ctx the parse tree
	 */
	void enterSegment(GraphlyParser.SegmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraphlyParser#segment}.
	 * @param ctx the parse tree
	 */
	void exitSegment(GraphlyParser.SegmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link GraphlyParser#circle}.
	 * @param ctx the parse tree
	 */
	void enterCircle(GraphlyParser.CircleContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraphlyParser#circle}.
	 * @param ctx the parse tree
	 */
	void exitCircle(GraphlyParser.CircleContext ctx);
	/**
	 * Enter a parse tree produced by {@link GraphlyParser#polygon}.
	 * @param ctx the parse tree
	 */
	void enterPolygon(GraphlyParser.PolygonContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraphlyParser#polygon}.
	 * @param ctx the parse tree
	 */
	void exitPolygon(GraphlyParser.PolygonContext ctx);
	/**
	 * Enter a parse tree produced by {@link GraphlyParser#group}.
	 * @param ctx the parse tree
	 */
	void enterGroup(GraphlyParser.GroupContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraphlyParser#group}.
	 * @param ctx the parse tree
	 */
	void exitGroup(GraphlyParser.GroupContext ctx);
	/**
	 * Enter a parse tree produced by {@link GraphlyParser#groupMember}.
	 * @param ctx the parse tree
	 */
	void enterGroupMember(GraphlyParser.GroupMemberContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraphlyParser#groupMember}.
	 * @param ctx the parse tree
	 */
	void exitGroupMember(GraphlyParser.GroupMemberContext ctx);
	/**
	 * Enter a parse tree produced by {@link GraphlyParser#type_definition}.
	 * @param ctx the parse tree
	 */
	void enterType_definition(GraphlyParser.Type_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraphlyParser#type_definition}.
	 * @param ctx the parse tree
	 */
	void exitType_definition(GraphlyParser.Type_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GraphlyParser#num}.
	 * @param ctx the parse tree
	 */
	void enterNum(GraphlyParser.NumContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraphlyParser#num}.
	 * @param ctx the parse tree
	 */
	void exitNum(GraphlyParser.NumContext ctx);
	/**
	 * Enter a parse tree produced by {@link GraphlyParser#iterator}.
	 * @param ctx the parse tree
	 */
	void enterIterator(GraphlyParser.IteratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraphlyParser#iterator}.
	 * @param ctx the parse tree
	 */
	void exitIterator(GraphlyParser.IteratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link GraphlyParser#canvas}.
	 * @param ctx the parse tree
	 */
	void enterCanvas(GraphlyParser.CanvasContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraphlyParser#canvas}.
	 * @param ctx the parse tree
	 */
	void exitCanvas(GraphlyParser.CanvasContext ctx);
	/**
	 * Enter a parse tree produced by {@link GraphlyParser#draw}.
	 * @param ctx the parse tree
	 */
	void enterDraw(GraphlyParser.DrawContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraphlyParser#draw}.
	 * @param ctx the parse tree
	 */
	void exitDraw(GraphlyParser.DrawContext ctx);
	/**
	 * Enter a parse tree produced by {@link GraphlyParser#transformation}.
	 * @param ctx the parse tree
	 */
	void enterTransformation(GraphlyParser.TransformationContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraphlyParser#transformation}.
	 * @param ctx the parse tree
	 */
	void exitTransformation(GraphlyParser.TransformationContext ctx);
	/**
	 * Enter a parse tree produced by {@link GraphlyParser#fill}.
	 * @param ctx the parse tree
	 */
	void enterFill(GraphlyParser.FillContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraphlyParser#fill}.
	 * @param ctx the parse tree
	 */
	void exitFill(GraphlyParser.FillContext ctx);
	/**
	 * Enter a parse tree produced by {@link GraphlyParser#move}.
	 * @param ctx the parse tree
	 */
	void enterMove(GraphlyParser.MoveContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraphlyParser#move}.
	 * @param ctx the parse tree
	 */
	void exitMove(GraphlyParser.MoveContext ctx);
	/**
	 * Enter a parse tree produced by {@link GraphlyParser#place}.
	 * @param ctx the parse tree
	 */
	void enterPlace(GraphlyParser.PlaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraphlyParser#place}.
	 * @param ctx the parse tree
	 */
	void exitPlace(GraphlyParser.PlaceContext ctx);
	/**
	 * Enter a parse tree produced by {@link GraphlyParser#rotate}.
	 * @param ctx the parse tree
	 */
	void enterRotate(GraphlyParser.RotateContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraphlyParser#rotate}.
	 * @param ctx the parse tree
	 */
	void exitRotate(GraphlyParser.RotateContext ctx);
	/**
	 * Enter a parse tree produced by {@link GraphlyParser#scale}.
	 * @param ctx the parse tree
	 */
	void enterScale(GraphlyParser.ScaleContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraphlyParser#scale}.
	 * @param ctx the parse tree
	 */
	void exitScale(GraphlyParser.ScaleContext ctx);
	/**
	 * Enter a parse tree produced by {@link GraphlyParser#arithmetic}.
	 * @param ctx the parse tree
	 */
	void enterArithmetic(GraphlyParser.ArithmeticContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraphlyParser#arithmetic}.
	 * @param ctx the parse tree
	 */
	void exitArithmetic(GraphlyParser.ArithmeticContext ctx);
	/**
	 * Enter a parse tree produced by {@link GraphlyParser#logic}.
	 * @param ctx the parse tree
	 */
	void enterLogic(GraphlyParser.LogicContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraphlyParser#logic}.
	 * @param ctx the parse tree
	 */
	void exitLogic(GraphlyParser.LogicContext ctx);
	/**
	 * Enter a parse tree produced by {@link GraphlyParser#neq}.
	 * @param ctx the parse tree
	 */
	void enterNeq(GraphlyParser.NeqContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraphlyParser#neq}.
	 * @param ctx the parse tree
	 */
	void exitNeq(GraphlyParser.NeqContext ctx);
	/**
	 * Enter a parse tree produced by {@link GraphlyParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterCond(GraphlyParser.CondContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraphlyParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitCond(GraphlyParser.CondContext ctx);
	/**
	 * Enter a parse tree produced by {@link GraphlyParser#signed_flt}.
	 * @param ctx the parse tree
	 */
	void enterSigned_flt(GraphlyParser.Signed_fltContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraphlyParser#signed_flt}.
	 * @param ctx the parse tree
	 */
	void exitSigned_flt(GraphlyParser.Signed_fltContext ctx);
	/**
	 * Enter a parse tree produced by {@link GraphlyParser#color}.
	 * @param ctx the parse tree
	 */
	void enterColor(GraphlyParser.ColorContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraphlyParser#color}.
	 * @param ctx the parse tree
	 */
	void exitColor(GraphlyParser.ColorContext ctx);
	/**
	 * Enter a parse tree produced by {@link GraphlyParser#flt}.
	 * @param ctx the parse tree
	 */
	void enterFlt(GraphlyParser.FltContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraphlyParser#flt}.
	 * @param ctx the parse tree
	 */
	void exitFlt(GraphlyParser.FltContext ctx);
	/**
	 * Enter a parse tree produced by {@link GraphlyParser#operation_flt}.
	 * @param ctx the parse tree
	 */
	void enterOperation_flt(GraphlyParser.Operation_fltContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraphlyParser#operation_flt}.
	 * @param ctx the parse tree
	 */
	void exitOperation_flt(GraphlyParser.Operation_fltContext ctx);
	/**
	 * Enter a parse tree produced by {@link GraphlyParser#itr}.
	 * @param ctx the parse tree
	 */
	void enterItr(GraphlyParser.ItrContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraphlyParser#itr}.
	 * @param ctx the parse tree
	 */
	void exitItr(GraphlyParser.ItrContext ctx);
}