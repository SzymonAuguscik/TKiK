# Generated from Graphly.g4 by ANTLR 4.9.2
from antlr4 import *
if __name__ is not None and "." in __name__:
    from .GraphlyParser import GraphlyParser
else:
    from GraphlyParser import GraphlyParser

# This class defines a complete listener for a parse tree produced by GraphlyParser.
class GraphlyListener(ParseTreeListener):

    # Enter a parse tree produced by GraphlyParser#program.
    def enterProgram(self, ctx:GraphlyParser.ProgramContext):
        pass

    # Exit a parse tree produced by GraphlyParser#program.
    def exitProgram(self, ctx:GraphlyParser.ProgramContext):
        pass


    # Enter a parse tree produced by GraphlyParser#instruction.
    def enterInstruction(self, ctx:GraphlyParser.InstructionContext):
        pass

    # Exit a parse tree produced by GraphlyParser#instruction.
    def exitInstruction(self, ctx:GraphlyParser.InstructionContext):
        pass


    # Enter a parse tree produced by GraphlyParser#instruction_without_draw.
    def enterInstruction_without_draw(self, ctx:GraphlyParser.Instruction_without_drawContext):
        pass

    # Exit a parse tree produced by GraphlyParser#instruction_without_draw.
    def exitInstruction_without_draw(self, ctx:GraphlyParser.Instruction_without_drawContext):
        pass


    # Enter a parse tree produced by GraphlyParser#loop.
    def enterLoop(self, ctx:GraphlyParser.LoopContext):
        pass

    # Exit a parse tree produced by GraphlyParser#loop.
    def exitLoop(self, ctx:GraphlyParser.LoopContext):
        pass


    # Enter a parse tree produced by GraphlyParser#check.
    def enterCheck(self, ctx:GraphlyParser.CheckContext):
        pass

    # Exit a parse tree produced by GraphlyParser#check.
    def exitCheck(self, ctx:GraphlyParser.CheckContext):
        pass


    # Enter a parse tree produced by GraphlyParser#shape.
    def enterShape(self, ctx:GraphlyParser.ShapeContext):
        pass

    # Exit a parse tree produced by GraphlyParser#shape.
    def exitShape(self, ctx:GraphlyParser.ShapeContext):
        pass


    # Enter a parse tree produced by GraphlyParser#point.
    def enterPoint(self, ctx:GraphlyParser.PointContext):
        pass

    # Exit a parse tree produced by GraphlyParser#point.
    def exitPoint(self, ctx:GraphlyParser.PointContext):
        pass


    # Enter a parse tree produced by GraphlyParser#segment.
    def enterSegment(self, ctx:GraphlyParser.SegmentContext):
        pass

    # Exit a parse tree produced by GraphlyParser#segment.
    def exitSegment(self, ctx:GraphlyParser.SegmentContext):
        pass


    # Enter a parse tree produced by GraphlyParser#circle.
    def enterCircle(self, ctx:GraphlyParser.CircleContext):
        pass

    # Exit a parse tree produced by GraphlyParser#circle.
    def exitCircle(self, ctx:GraphlyParser.CircleContext):
        pass


    # Enter a parse tree produced by GraphlyParser#polygon.
    def enterPolygon(self, ctx:GraphlyParser.PolygonContext):
        pass

    # Exit a parse tree produced by GraphlyParser#polygon.
    def exitPolygon(self, ctx:GraphlyParser.PolygonContext):
        pass


    # Enter a parse tree produced by GraphlyParser#group.
    def enterGroup(self, ctx:GraphlyParser.GroupContext):
        pass

    # Exit a parse tree produced by GraphlyParser#group.
    def exitGroup(self, ctx:GraphlyParser.GroupContext):
        pass


    # Enter a parse tree produced by GraphlyParser#groupMember.
    def enterGroupMember(self, ctx:GraphlyParser.GroupMemberContext):
        pass

    # Exit a parse tree produced by GraphlyParser#groupMember.
    def exitGroupMember(self, ctx:GraphlyParser.GroupMemberContext):
        pass


    # Enter a parse tree produced by GraphlyParser#type_definition.
    def enterType_definition(self, ctx:GraphlyParser.Type_definitionContext):
        pass

    # Exit a parse tree produced by GraphlyParser#type_definition.
    def exitType_definition(self, ctx:GraphlyParser.Type_definitionContext):
        pass


    # Enter a parse tree produced by GraphlyParser#num.
    def enterNum(self, ctx:GraphlyParser.NumContext):
        pass

    # Exit a parse tree produced by GraphlyParser#num.
    def exitNum(self, ctx:GraphlyParser.NumContext):
        pass


    # Enter a parse tree produced by GraphlyParser#iterator.
    def enterIterator(self, ctx:GraphlyParser.IteratorContext):
        pass

    # Exit a parse tree produced by GraphlyParser#iterator.
    def exitIterator(self, ctx:GraphlyParser.IteratorContext):
        pass


    # Enter a parse tree produced by GraphlyParser#canvas.
    def enterCanvas(self, ctx:GraphlyParser.CanvasContext):
        pass

    # Exit a parse tree produced by GraphlyParser#canvas.
    def exitCanvas(self, ctx:GraphlyParser.CanvasContext):
        pass


    # Enter a parse tree produced by GraphlyParser#draw.
    def enterDraw(self, ctx:GraphlyParser.DrawContext):
        pass

    # Exit a parse tree produced by GraphlyParser#draw.
    def exitDraw(self, ctx:GraphlyParser.DrawContext):
        pass


    # Enter a parse tree produced by GraphlyParser#transformation.
    def enterTransformation(self, ctx:GraphlyParser.TransformationContext):
        pass

    # Exit a parse tree produced by GraphlyParser#transformation.
    def exitTransformation(self, ctx:GraphlyParser.TransformationContext):
        pass


    # Enter a parse tree produced by GraphlyParser#fill.
    def enterFill(self, ctx:GraphlyParser.FillContext):
        pass

    # Exit a parse tree produced by GraphlyParser#fill.
    def exitFill(self, ctx:GraphlyParser.FillContext):
        pass


    # Enter a parse tree produced by GraphlyParser#move.
    def enterMove(self, ctx:GraphlyParser.MoveContext):
        pass

    # Exit a parse tree produced by GraphlyParser#move.
    def exitMove(self, ctx:GraphlyParser.MoveContext):
        pass


    # Enter a parse tree produced by GraphlyParser#place.
    def enterPlace(self, ctx:GraphlyParser.PlaceContext):
        pass

    # Exit a parse tree produced by GraphlyParser#place.
    def exitPlace(self, ctx:GraphlyParser.PlaceContext):
        pass


    # Enter a parse tree produced by GraphlyParser#rotate.
    def enterRotate(self, ctx:GraphlyParser.RotateContext):
        pass

    # Exit a parse tree produced by GraphlyParser#rotate.
    def exitRotate(self, ctx:GraphlyParser.RotateContext):
        pass


    # Enter a parse tree produced by GraphlyParser#scale.
    def enterScale(self, ctx:GraphlyParser.ScaleContext):
        pass

    # Exit a parse tree produced by GraphlyParser#scale.
    def exitScale(self, ctx:GraphlyParser.ScaleContext):
        pass


    # Enter a parse tree produced by GraphlyParser#arithmetic.
    def enterArithmetic(self, ctx:GraphlyParser.ArithmeticContext):
        pass

    # Exit a parse tree produced by GraphlyParser#arithmetic.
    def exitArithmetic(self, ctx:GraphlyParser.ArithmeticContext):
        pass


    # Enter a parse tree produced by GraphlyParser#logic.
    def enterLogic(self, ctx:GraphlyParser.LogicContext):
        pass

    # Exit a parse tree produced by GraphlyParser#logic.
    def exitLogic(self, ctx:GraphlyParser.LogicContext):
        pass


    # Enter a parse tree produced by GraphlyParser#neq.
    def enterNeq(self, ctx:GraphlyParser.NeqContext):
        pass

    # Exit a parse tree produced by GraphlyParser#neq.
    def exitNeq(self, ctx:GraphlyParser.NeqContext):
        pass


    # Enter a parse tree produced by GraphlyParser#cond.
    def enterCond(self, ctx:GraphlyParser.CondContext):
        pass

    # Exit a parse tree produced by GraphlyParser#cond.
    def exitCond(self, ctx:GraphlyParser.CondContext):
        pass


    # Enter a parse tree produced by GraphlyParser#signed_flt.
    def enterSigned_flt(self, ctx:GraphlyParser.Signed_fltContext):
        pass

    # Exit a parse tree produced by GraphlyParser#signed_flt.
    def exitSigned_flt(self, ctx:GraphlyParser.Signed_fltContext):
        pass


    # Enter a parse tree produced by GraphlyParser#color.
    def enterColor(self, ctx:GraphlyParser.ColorContext):
        pass

    # Exit a parse tree produced by GraphlyParser#color.
    def exitColor(self, ctx:GraphlyParser.ColorContext):
        pass


    # Enter a parse tree produced by GraphlyParser#flt.
    def enterFlt(self, ctx:GraphlyParser.FltContext):
        pass

    # Exit a parse tree produced by GraphlyParser#flt.
    def exitFlt(self, ctx:GraphlyParser.FltContext):
        pass


    # Enter a parse tree produced by GraphlyParser#operation_flt.
    def enterOperation_flt(self, ctx:GraphlyParser.Operation_fltContext):
        pass

    # Exit a parse tree produced by GraphlyParser#operation_flt.
    def exitOperation_flt(self, ctx:GraphlyParser.Operation_fltContext):
        pass


    # Enter a parse tree produced by GraphlyParser#itr.
    def enterItr(self, ctx:GraphlyParser.ItrContext):
        pass

    # Exit a parse tree produced by GraphlyParser#itr.
    def exitItr(self, ctx:GraphlyParser.ItrContext):
        pass



del GraphlyParser