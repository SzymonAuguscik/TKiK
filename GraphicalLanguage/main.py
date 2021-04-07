import antlr4
import sys

from GraphlyLexer import GraphlyLexer
from GraphlyListener import GraphlyListener
from GraphlyParser import GraphlyParser


class GraphlyProgram(GraphlyListener):

    def enterProgram(self, ctx: GraphlyParser.ProgramContext):
        print("Parsing successful")

    # # Enter a parse tree produced by GraphlyParser#instruction.
    # def enterInstruction(self, ctx: GraphlyParser.InstructionContext):
    #     print(ctx.getText())
    #
    # # Enter a parse tree produced by GraphlyParser#instruction_without_draw.
    # def enterInstruction_without_draw(self, ctx: GraphlyParser.Instruction_without_drawContext):
    #     print(ctx.getText())
    #
    # # Enter a parse tree produced by GraphlyParser#loop.
    # def enterLoop(self, ctx: GraphlyParser.LoopContext):
    #     print(ctx.getText())
    #
    # # Enter a parse tree produced by GraphlyParser#check.
    # def enterCheck(self, ctx: GraphlyParser.CheckContext):
    #     print(ctx.getText())
    #
    # # Enter a parse tree produced by GraphlyParser#shape.
    # def enterShape(self, ctx: GraphlyParser.ShapeContext):
    #     print(ctx.getText())
    #
    # # Enter a parse tree produced by GraphlyParser#point.
    # def enterPoint(self, ctx: GraphlyParser.PointContext):
    #     print(ctx.getText())
    #
    # # Enter a parse tree produced by GraphlyParser#segment.
    # def enterSegment(self, ctx: GraphlyParser.SegmentContext):
    #     print(ctx.getText())
    #
    # # Enter a parse tree produced by GraphlyParser#circle.
    # def enterCircle(self, ctx: GraphlyParser.CircleContext):
    #     print(ctx.getText())
    #
    # # Enter a parse tree produced by GraphlyParser#polygon.
    # def enterPolygon(self, ctx: GraphlyParser.PolygonContext):
    #     print(ctx.getText())
    #
    # # Enter a parse tree produced by GraphlyParser#group.
    # def enterGroup(self, ctx: GraphlyParser.GroupContext):
    #     print(ctx.getText())
    #
    # # Enter a parse tree produced by GraphlyParser#groupMember.
    # def enterGroupMember(self, ctx: GraphlyParser.GroupMemberContext):
    #     print(ctx.getText())
    #
    # # Enter a parse tree produced by GraphlyParser#type_definition.
    # def enterType_definition(self, ctx: GraphlyParser.Type_definitionContext):
    #     print(ctx.getText())
    #
    # # Enter a parse tree produced by GraphlyParser#num.
    # def enterNum(self, ctx: GraphlyParser.NumContext):
    #     print(ctx.getText())
    #
    # # Enter a parse tree produced by GraphlyParser#iterator.
    # def enterIterator(self, ctx: GraphlyParser.IteratorContext):
    #     print(ctx.getText())
    #
    # # Enter a parse tree produced by GraphlyParser#canvas.
    # def enterCanvas(self, ctx: GraphlyParser.CanvasContext):
    #     print(ctx.getText())
    #
    # # Enter a parse tree produced by GraphlyParser#draw.
    # def enterDraw(self, ctx: GraphlyParser.DrawContext):
    #     print(ctx.getText())
    #
    # # Enter a parse tree produced by GraphlyParser#transformation.
    # def enterTransformation(self, ctx: GraphlyParser.TransformationContext):
    #     print(ctx.getText())
    #
    # # Enter a parse tree produced by GraphlyParser#fill.
    # def enterFill(self, ctx: GraphlyParser.FillContext):
    #     print(ctx.getText())
    #
    # # Enter a parse tree produced by GraphlyParser#move.
    # def enterMove(self, ctx: GraphlyParser.MoveContext):
    #     print(ctx.getText())
    #
    # # Enter a parse tree produced by GraphlyParser#place.
    # def enterPlace(self, ctx: GraphlyParser.PlaceContext):
    #     print(ctx.getText())
    #
    # # Enter a parse tree produced by GraphlyParser#rotate.
    # def enterRotate(self, ctx: GraphlyParser.RotateContext):
    #     print(ctx.getText())
    #
    # # Enter a parse tree produced by GraphlyParser#scale.
    # def enterScale(self, ctx: GraphlyParser.ScaleContext):
    #     print(ctx.getText())


def main(argv):
    input_stream = antlr4.FileStream(argv[1])

    lexer = GraphlyLexer(input_stream)
    stream = antlr4.CommonTokenStream(lexer)
    parser = GraphlyParser(stream)

    tree = parser.program()
    graph = GraphlyProgram()

    tree_walker = antlr4.ParseTreeWalker()
    tree_walker.walk(graph, tree)


if __name__ == '__main__':
    main(sys.argv)
