import antlr4
import sys
import pygame

from GraphlyLexer import GraphlyLexer
from GraphlyListener import GraphlyListener
from GraphlyParser import GraphlyParser


class GraphlyProgram(GraphlyListener):

    def enterProgram(self, ctx: GraphlyParser.ProgramContext):
        pygame.init()
        print("Program")

    # Exit a parse tree produced by GraphlyParser#program.
    def exitProgram(self, ctx:GraphlyParser.ProgramContext):
        pygame.display.update()

    # Enter a parse tree produced by GraphlyParser#instruction.
    def enterInstruction(self, ctx: GraphlyParser.InstructionContext):
        print("Instruction: ", end="")

    # Enter a parse tree produced by GraphlyParser#instruction_without_draw.
    def enterInstruction_without_draw(self, ctx: GraphlyParser.Instruction_without_drawContext):
        print("Instruction without draw: ", end="")

    # Enter a parse tree produced by GraphlyParser#loop.
    def enterLoop(self, ctx: GraphlyParser.LoopContext):
        print("Loop")

    # Enter a parse tree produced by GraphlyParser#check.
    def enterCheck(self, ctx: GraphlyParser.CheckContext):
        print("Check")

    # Enter a parse tree produced by GraphlyParser#shape.
    def enterShape(self, ctx: GraphlyParser.ShapeContext):
        print("Shape: ", end="")

    # Enter a parse tree produced by GraphlyParser#point.
    def enterPoint(self, ctx: GraphlyParser.PointContext):
        print("Point")

    # Enter a parse tree produced by GraphlyParser#segment.
    def enterSegment(self, ctx: GraphlyParser.SegmentContext):
        print("Segment")

    # Enter a parse tree produced by GraphlyParser#circle.
    def enterCircle(self, ctx: GraphlyParser.CircleContext):
        print("Circle")

    # Enter a parse tree produced by GraphlyParser#polygon.
    def enterPolygon(self, ctx: GraphlyParser.PolygonContext):
        print("Polygon")

    # Enter a parse tree produced by GraphlyParser#group.
    def enterGroup(self, ctx: GraphlyParser.GroupContext):
        print("Group")

    # Enter a parse tree produced by GraphlyParser#groupMember.
    def enterGroupMember(self, ctx: GraphlyParser.GroupMemberContext):
        print("GroupMember")

    # Enter a parse tree produced by GraphlyParser#type_definition.
    def enterType_definition(self, ctx: GraphlyParser.Type_definitionContext):
        print("TypeDefinition: ", end="")

    # Enter a parse tree produced by GraphlyParser#num.
    def enterNum(self, ctx: GraphlyParser.NumContext):
        print(ctx.getText())

    # Enter a parse tree produced by GraphlyParser#iterator.
    def enterIterator(self, ctx: GraphlyParser.IteratorContext):
        print(ctx.getText())

    # Enter a parse tree produced by GraphlyParser#canvas.
    def enterCanvas(self, ctx: GraphlyParser.CanvasContext):
        self.screen = pygame.display.set_mode((640,480))
        self.screen.fill((255,255,255))
        print(ctx.getTokens())
        print("Canvas")

    # Enter a parse tree produced by GraphlyParser#draw.
    def enterDraw(self, ctx: GraphlyParser.DrawContext):
        pygame.draw.rect(self.screen, (0,0,0), (100,100,100,100), 1)
        print("Draw")

    # Enter a parse tree produced by GraphlyParser#transformation.
    def enterTransformation(self, ctx: GraphlyParser.TransformationContext):
        print("Transformation: ", end="")

    # Enter a parse tree produced by GraphlyParser#fill.
    def enterFill(self, ctx: GraphlyParser.FillContext):
        print("Fill")

    # Enter a parse tree produced by GraphlyParser#move.
    def enterMove(self, ctx: GraphlyParser.MoveContext):
        print("Move")

    # Enter a parse tree produced by GraphlyParser#place.
    def enterPlace(self, ctx: GraphlyParser.PlaceContext):
        print("Place")

    # Enter a parse tree produced by GraphlyParser#rotate.
    def enterRotate(self, ctx: GraphlyParser.RotateContext):
        print("Rotate")

    # Enter a parse tree produced by GraphlyParser#scale.
    def enterScale(self, ctx: GraphlyParser.ScaleContext):
        print("Scale")


def main(argv):
    input_stream = antlr4.FileStream(argv[1])

    lexer = GraphlyLexer(input_stream)
    stream = antlr4.CommonTokenStream(lexer)
    parser = GraphlyParser(stream)

    tree = parser.program()
    graph = GraphlyProgram()

    tree_walker = antlr4.ParseTreeWalker()
    tree_walker.walk(graph, tree)

    run = True
    while run:
        for event in pygame.event.get():
            if event.type == pygame.QUIT:
                run =False

    pygame.quit()


if __name__ == '__main__':
    main(sys.argv)
