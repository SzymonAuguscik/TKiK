import antlr4
import sys

from os import environ
environ['PYGAME_HIDE_SUPPORT_PROMPT'] = "hide"
import pygame

from GraphlyLexer import GraphlyLexer
from GraphlyParser import GraphlyParser
from GraphlyCanvasChecker import GraphlyCanvasChecker
from GraphlyProgramVisitor import GraphlyProgramVisitor
from GraphlyErrorListener import ThrowingErrorListener

from os.path import isfile, splitext, exists

from exceptions.BadFileException import BadFileException
from exceptions.EmptyPathException import EmptyPathException
from exceptions.BadFlagException import BadFlagException


def check_canvas(argv):  # first run of program
    print("Checking canvas...", end=" ")

    input_stream = antlr4.FileStream(argv[1])

    lexer = GraphlyLexer(input_stream)
    lexer.removeErrorListeners()
    lexer.addErrorListener(ThrowingErrorListener())


    stream = antlr4.CommonTokenStream(lexer)
    parser = GraphlyParser(stream)
    parser.removeErrorListeners()
    parser.addErrorListener(ThrowingErrorListener())

    tree = parser.program()
    graph = GraphlyCanvasChecker()

    tree_walker = antlr4.ParseTreeWalker()
    tree_walker.walk(graph, tree)


    print("All is ok!")


def execute_graphly_script(argv):  # second run of program
    input_stream = antlr4.FileStream(argv[1])

    lexer = GraphlyLexer(input_stream)
    # lexer.removeErrorListeners()
    # lexer.addErrorListener(ThrowingErrorListener())

    stream = antlr4.CommonTokenStream(lexer)
    parser = GraphlyParser(stream)
    # parser.removeErrorListeners()
    # parser.addErrorListener(ThrowingErrorListener())

    tree = parser.program()
    # graph = GraphlyProgramListener()
    #
    # tree_walker = antlr4.ParseTreeWalker()
    # tree_walker.walk(graph, tree)

    filename = splitext(argv[1])[0]

    GraphlyProgramVisitor(filename).visit(tree)

    run = True

    while run:
        for event in pygame.event.get():
            if event.type == pygame.QUIT:
                run = False

    pygame.quit()


def main(argv):
    option = argv[2] if len(argv) >= 3 else ""
    if option != "-e":
        sys.tracebacklimit = 0

    if len(argv) < 2:
        raise EmptyPathException()

    if len(argv) == 3 and argv[2] != "-e":
        raise BadFlagException(argv[2])

    if not (isfile(argv[1]) and exists(argv[1])):
        raise BadFileException(argv[1])

    check_canvas(argv)
    execute_graphly_script(argv)


if __name__ == '__main__':
    main(sys.argv)
