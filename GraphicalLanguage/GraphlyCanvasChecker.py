from GraphlyListener import GraphlyListener
from GraphlyParser import GraphlyParser
from exceptions.DrawBeforeCanvasException import DrawBeforeCanvasException


class GraphlyCanvasChecker(GraphlyListener):
    def __init__(self):
        self.is_canvas_initialized = False

    def exitCanvas(self, ctx: GraphlyParser.CanvasContext):
        self.is_canvas_initialized = True

    def enterDraw(self, ctx: GraphlyParser.DrawContext):
        if not self.is_canvas_initialized:
            raise DrawBeforeCanvasException(ctx.start.line)
