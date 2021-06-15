# Generated from Graphly.g4 by ANTLR 4.9.2
from antlr4 import *
if __name__ is not None and "." in __name__:
    from .GraphlyParser import GraphlyParser
else:
    from GraphlyParser import GraphlyParser

# This class defines a complete generic visitor for a parse tree produced by GraphlyParser.

class GraphlyVisitor(ParseTreeVisitor):

    # Visit a parse tree produced by GraphlyParser#program.
    def visitProgram(self, ctx:GraphlyParser.ProgramContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by GraphlyParser#instruction.
    def visitInstruction(self, ctx:GraphlyParser.InstructionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by GraphlyParser#block.
    def visitBlock(self, ctx:GraphlyParser.BlockContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by GraphlyParser#loop.
    def visitLoop(self, ctx:GraphlyParser.LoopContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by GraphlyParser#check.
    def visitCheck(self, ctx:GraphlyParser.CheckContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by GraphlyParser#condition_block.
    def visitCondition_block(self, ctx:GraphlyParser.Condition_blockContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by GraphlyParser#shape.
    def visitShape(self, ctx:GraphlyParser.ShapeContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by GraphlyParser#point.
    def visitPoint(self, ctx:GraphlyParser.PointContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by GraphlyParser#segment.
    def visitSegment(self, ctx:GraphlyParser.SegmentContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by GraphlyParser#circle.
    def visitCircle(self, ctx:GraphlyParser.CircleContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by GraphlyParser#polygon.
    def visitPolygon(self, ctx:GraphlyParser.PolygonContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by GraphlyParser#groupMember.
    def visitGroupMember(self, ctx:GraphlyParser.GroupMemberContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by GraphlyParser#transformable.
    def visitTransformable(self, ctx:GraphlyParser.TransformableContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by GraphlyParser#group.
    def visitGroup(self, ctx:GraphlyParser.GroupContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by GraphlyParser#num.
    def visitNum(self, ctx:GraphlyParser.NumContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by GraphlyParser#canvas.
    def visitCanvas(self, ctx:GraphlyParser.CanvasContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by GraphlyParser#draw.
    def visitDraw(self, ctx:GraphlyParser.DrawContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by GraphlyParser#shapeLog.
    def visitShapeLog(self, ctx:GraphlyParser.ShapeLogContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by GraphlyParser#exprLog.
    def visitExprLog(self, ctx:GraphlyParser.ExprLogContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by GraphlyParser#textLog.
    def visitTextLog(self, ctx:GraphlyParser.TextLogContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by GraphlyParser#simpleSave.
    def visitSimpleSave(self, ctx:GraphlyParser.SimpleSaveContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by GraphlyParser#namedSave.
    def visitNamedSave(self, ctx:GraphlyParser.NamedSaveContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by GraphlyParser#transformation.
    def visitTransformation(self, ctx:GraphlyParser.TransformationContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by GraphlyParser#fill.
    def visitFill(self, ctx:GraphlyParser.FillContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by GraphlyParser#move.
    def visitMove(self, ctx:GraphlyParser.MoveContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by GraphlyParser#place.
    def visitPlace(self, ctx:GraphlyParser.PlaceContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by GraphlyParser#rotate.
    def visitRotate(self, ctx:GraphlyParser.RotateContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by GraphlyParser#scale.
    def visitScale(self, ctx:GraphlyParser.ScaleContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by GraphlyParser#copyAssign.
    def visitCopyAssign(self, ctx:GraphlyParser.CopyAssignContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by GraphlyParser#numAssign.
    def visitNumAssign(self, ctx:GraphlyParser.NumAssignContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by GraphlyParser#minusOpExpr.
    def visitMinusOpExpr(self, ctx:GraphlyParser.MinusOpExprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by GraphlyParser#roundingOpExpr.
    def visitRoundingOpExpr(self, ctx:GraphlyParser.RoundingOpExprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by GraphlyParser#booleanOpExpr.
    def visitBooleanOpExpr(self, ctx:GraphlyParser.BooleanOpExprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by GraphlyParser#arithmeticOpExpr.
    def visitArithmeticOpExpr(self, ctx:GraphlyParser.ArithmeticOpExprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by GraphlyParser#negationOpExpr.
    def visitNegationOpExpr(self, ctx:GraphlyParser.NegationOpExprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by GraphlyParser#atomExpr.
    def visitAtomExpr(self, ctx:GraphlyParser.AtomExprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by GraphlyParser#parenExpr.
    def visitParenExpr(self, ctx:GraphlyParser.ParenExprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by GraphlyParser#intAtom.
    def visitIntAtom(self, ctx:GraphlyParser.IntAtomContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by GraphlyParser#fltAtom.
    def visitFltAtom(self, ctx:GraphlyParser.FltAtomContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by GraphlyParser#varAtom.
    def visitVarAtom(self, ctx:GraphlyParser.VarAtomContext):
        return self.visitChildren(ctx)



del GraphlyParser