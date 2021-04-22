from GraphlyListener import GraphlyListener
from GraphlyParser import GraphlyParser


class DrawBeforeCanvasException(Exception):
    def __init__(self, message="Drawing command was used before canvas initialization!"):
        self.message = message
        super().__init__(self.message)


class GraphlyCanvasChecker(GraphlyListener):
    def __init__(self):
        self.is_canvas_initialized = False

    def exitCanvas(self, ctx: GraphlyParser.CanvasContext):
        self.is_canvas_initialized = True

    def enterDraw(self, ctx: GraphlyParser.DrawContext):
        if not self.is_canvas_initialized:
            raise DrawBeforeCanvasException
