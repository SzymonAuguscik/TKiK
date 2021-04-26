import antlr4
import sys
import pygame

from GraphlyLexer import GraphlyLexer
from GraphlyParser import GraphlyParser
from GraphlyProgramListener import GraphlyProgramListener
from GraphlyCanvasChecker import GraphlyCanvasChecker, DrawBeforeCanvasException


def check_canvas(argv):  # first run of program
    print("Checking canvas...", end=" ")

    input_stream = antlr4.FileStream(argv[1])

    lexer = GraphlyLexer(input_stream)
    stream = antlr4.CommonTokenStream(lexer)
    parser = GraphlyParser(stream)

    tree = parser.program()
    graph = GraphlyCanvasChecker()

    tree_walker = antlr4.ParseTreeWalker()
    tree_walker.walk(graph, tree)

    print("All is ok!")


def execute_graphly_script(argv):  # second run of program
    input_stream = antlr4.FileStream(argv[1])

    lexer = GraphlyLexer(input_stream)
    stream = antlr4.CommonTokenStream(lexer)
    parser = GraphlyParser(stream)

    tree = parser.program()
    graph = GraphlyProgramListener()

    tree_walker = antlr4.ParseTreeWalker()
    tree_walker.walk(graph, tree)

    run = True

    while run:
        for event in pygame.event.get():
            if event.type == pygame.QUIT:
                run = False

    pygame.quit()


def main(argv):
    check_canvas(argv)
    execute_graphly_script(argv)


if __name__ == '__main__':
    main(sys.argv)
