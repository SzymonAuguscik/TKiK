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


    # Enter a parse tree produced by GraphlyParser#block.
    def enterBlock(self, ctx:GraphlyParser.BlockContext):
        pass

    # Exit a parse tree produced by GraphlyParser#block.
    def exitBlock(self, ctx:GraphlyParser.BlockContext):
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


    # Enter a parse tree produced by GraphlyParser#condition_block.
    def enterCondition_block(self, ctx:GraphlyParser.Condition_blockContext):
        pass

    # Exit a parse tree produced by GraphlyParser#condition_block.
    def exitCondition_block(self, ctx:GraphlyParser.Condition_blockContext):
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


    # Enter a parse tree produced by GraphlyParser#groupMember.
    def enterGroupMember(self, ctx:GraphlyParser.GroupMemberContext):
        pass

    # Exit a parse tree produced by GraphlyParser#groupMember.
    def exitGroupMember(self, ctx:GraphlyParser.GroupMemberContext):
        pass


    # Enter a parse tree produced by GraphlyParser#transformable.
    def enterTransformable(self, ctx:GraphlyParser.TransformableContext):
        pass

    # Exit a parse tree produced by GraphlyParser#transformable.
    def exitTransformable(self, ctx:GraphlyParser.TransformableContext):
        pass


    # Enter a parse tree produced by GraphlyParser#group.
    def enterGroup(self, ctx:GraphlyParser.GroupContext):
        pass

    # Exit a parse tree produced by GraphlyParser#group.
    def exitGroup(self, ctx:GraphlyParser.GroupContext):
        pass


    # Enter a parse tree produced by GraphlyParser#num.
    def enterNum(self, ctx:GraphlyParser.NumContext):
        pass

    # Exit a parse tree produced by GraphlyParser#num.
    def exitNum(self, ctx:GraphlyParser.NumContext):
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


    # Enter a parse tree produced by GraphlyParser#shapeLog.
    def enterShapeLog(self, ctx:GraphlyParser.ShapeLogContext):
        pass

    # Exit a parse tree produced by GraphlyParser#shapeLog.
    def exitShapeLog(self, ctx:GraphlyParser.ShapeLogContext):
        pass


    # Enter a parse tree produced by GraphlyParser#exprLog.
    def enterExprLog(self, ctx:GraphlyParser.ExprLogContext):
        pass

    # Exit a parse tree produced by GraphlyParser#exprLog.
    def exitExprLog(self, ctx:GraphlyParser.ExprLogContext):
        pass


    # Enter a parse tree produced by GraphlyParser#textLog.
    def enterTextLog(self, ctx:GraphlyParser.TextLogContext):
        pass

    # Exit a parse tree produced by GraphlyParser#textLog.
    def exitTextLog(self, ctx:GraphlyParser.TextLogContext):
        pass


    # Enter a parse tree produced by GraphlyParser#simpleSave.
    def enterSimpleSave(self, ctx:GraphlyParser.SimpleSaveContext):
        pass

    # Exit a parse tree produced by GraphlyParser#simpleSave.
    def exitSimpleSave(self, ctx:GraphlyParser.SimpleSaveContext):
        pass


    # Enter a parse tree produced by GraphlyParser#namedSave.
    def enterNamedSave(self, ctx:GraphlyParser.NamedSaveContext):
        pass

    # Exit a parse tree produced by GraphlyParser#namedSave.
    def exitNamedSave(self, ctx:GraphlyParser.NamedSaveContext):
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


    # Enter a parse tree produced by GraphlyParser#copyAssign.
    def enterCopyAssign(self, ctx:GraphlyParser.CopyAssignContext):
        pass

    # Exit a parse tree produced by GraphlyParser#copyAssign.
    def exitCopyAssign(self, ctx:GraphlyParser.CopyAssignContext):
        pass


    # Enter a parse tree produced by GraphlyParser#numAssign.
    def enterNumAssign(self, ctx:GraphlyParser.NumAssignContext):
        pass

    # Exit a parse tree produced by GraphlyParser#numAssign.
    def exitNumAssign(self, ctx:GraphlyParser.NumAssignContext):
        pass


    # Enter a parse tree produced by GraphlyParser#minusOpExpr.
    def enterMinusOpExpr(self, ctx:GraphlyParser.MinusOpExprContext):
        pass

    # Exit a parse tree produced by GraphlyParser#minusOpExpr.
    def exitMinusOpExpr(self, ctx:GraphlyParser.MinusOpExprContext):
        pass


    # Enter a parse tree produced by GraphlyParser#roundingOpExpr.
    def enterRoundingOpExpr(self, ctx:GraphlyParser.RoundingOpExprContext):
        pass

    # Exit a parse tree produced by GraphlyParser#roundingOpExpr.
    def exitRoundingOpExpr(self, ctx:GraphlyParser.RoundingOpExprContext):
        pass


    # Enter a parse tree produced by GraphlyParser#booleanOpExpr.
    def enterBooleanOpExpr(self, ctx:GraphlyParser.BooleanOpExprContext):
        pass

    # Exit a parse tree produced by GraphlyParser#booleanOpExpr.
    def exitBooleanOpExpr(self, ctx:GraphlyParser.BooleanOpExprContext):
        pass


    # Enter a parse tree produced by GraphlyParser#arithmeticOpExpr.
    def enterArithmeticOpExpr(self, ctx:GraphlyParser.ArithmeticOpExprContext):
        pass

    # Exit a parse tree produced by GraphlyParser#arithmeticOpExpr.
    def exitArithmeticOpExpr(self, ctx:GraphlyParser.ArithmeticOpExprContext):
        pass


    # Enter a parse tree produced by GraphlyParser#negationOpExpr.
    def enterNegationOpExpr(self, ctx:GraphlyParser.NegationOpExprContext):
        pass

    # Exit a parse tree produced by GraphlyParser#negationOpExpr.
    def exitNegationOpExpr(self, ctx:GraphlyParser.NegationOpExprContext):
        pass


    # Enter a parse tree produced by GraphlyParser#atomExpr.
    def enterAtomExpr(self, ctx:GraphlyParser.AtomExprContext):
        pass

    # Exit a parse tree produced by GraphlyParser#atomExpr.
    def exitAtomExpr(self, ctx:GraphlyParser.AtomExprContext):
        pass


    # Enter a parse tree produced by GraphlyParser#parenExpr.
    def enterParenExpr(self, ctx:GraphlyParser.ParenExprContext):
        pass

    # Exit a parse tree produced by GraphlyParser#parenExpr.
    def exitParenExpr(self, ctx:GraphlyParser.ParenExprContext):
        pass


    # Enter a parse tree produced by GraphlyParser#intAtom.
    def enterIntAtom(self, ctx:GraphlyParser.IntAtomContext):
        pass

    # Exit a parse tree produced by GraphlyParser#intAtom.
    def exitIntAtom(self, ctx:GraphlyParser.IntAtomContext):
        pass


    # Enter a parse tree produced by GraphlyParser#fltAtom.
    def enterFltAtom(self, ctx:GraphlyParser.FltAtomContext):
        pass

    # Exit a parse tree produced by GraphlyParser#fltAtom.
    def exitFltAtom(self, ctx:GraphlyParser.FltAtomContext):
        pass


    # Enter a parse tree produced by GraphlyParser#varAtom.
    def enterVarAtom(self, ctx:GraphlyParser.VarAtomContext):
        pass

    # Exit a parse tree produced by GraphlyParser#varAtom.
    def exitVarAtom(self, ctx:GraphlyParser.VarAtomContext):
        pass



del GraphlyParser