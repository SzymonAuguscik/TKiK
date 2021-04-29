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


    # Visit a parse tree produced by GraphlyParser#group.
    def visitGroup(self, ctx:GraphlyParser.GroupContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by GraphlyParser#groupMember.
    def visitGroupMember(self, ctx:GraphlyParser.GroupMemberContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by GraphlyParser#type_definition.
    def visitType_definition(self, ctx:GraphlyParser.Type_definitionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by GraphlyParser#num.
    def visitNum(self, ctx:GraphlyParser.NumContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by GraphlyParser#iterator.
    def visitIterator(self, ctx:GraphlyParser.IteratorContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by GraphlyParser#canvas.
    def visitCanvas(self, ctx:GraphlyParser.CanvasContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by GraphlyParser#draw.
    def visitDraw(self, ctx:GraphlyParser.DrawContext):
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


    # Visit a parse tree produced by GraphlyParser#arithmetic.
    def visitArithmetic(self, ctx:GraphlyParser.ArithmeticContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by GraphlyParser#logic.
    def visitLogic(self, ctx:GraphlyParser.LogicContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by GraphlyParser#neq.
    def visitNeq(self, ctx:GraphlyParser.NeqContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by GraphlyParser#cond.
    def visitCond(self, ctx:GraphlyParser.CondContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by GraphlyParser#signed_flt.
    def visitSigned_flt(self, ctx:GraphlyParser.Signed_fltContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by GraphlyParser#flt.
    def visitFlt(self, ctx:GraphlyParser.FltContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by GraphlyParser#operation_flt.
    def visitOperation_flt(self, ctx:GraphlyParser.Operation_fltContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by GraphlyParser#itr.
    def visitItr(self, ctx:GraphlyParser.ItrContext):
        return self.visitChildren(ctx)



del GraphlyParser