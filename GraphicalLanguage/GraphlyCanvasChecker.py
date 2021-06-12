from GraphlyListener import GraphlyListener
from GraphlyParser import GraphlyParser
from exceptions.DrawBeforeCanvasException import DrawBeforeCanvasException
from exceptions.SaveBeforeCanvasException import SaveBeforeCanvasException
from exceptions.NoCanvasException import NoCanvasException
from exceptions.MultipleCanvasException import MultipleCanvasException


class GraphlyCanvasChecker(GraphlyListener):
    def __init__(self):
        self.is_canvas_initialized = False

    def exitProgram(self, ctx:GraphlyParser.ProgramContext):
        if not self.is_canvas_initialized:
            raise NoCanvasException(ctx.start.line)

    def enterCanvas(self, ctx:GraphlyParser.CanvasContext):
        if self.is_canvas_initialized:
            raise MultipleCanvasException(ctx.start.line)

    def exitCanvas(self, ctx: GraphlyParser.CanvasContext):
        self.is_canvas_initialized = True

    def enterDraw(self, ctx: GraphlyParser.DrawContext):
        if not self.is_canvas_initialized:
            raise DrawBeforeCanvasException(ctx.start.line)

    def enterSimpleSave(self, ctx:GraphlyParser.SimpleSaveContext):
        if not self.is_canvas_initialized:
            raise SaveBeforeCanvasException(ctx.start.line)

    def enterNamedSave(self, ctx:GraphlyParser.NamedSaveContext):
        if not self.is_canvas_initialized:
            raise SaveBeforeCanvasException(ctx.start.line)
