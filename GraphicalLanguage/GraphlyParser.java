// Generated from Graphly.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GraphlyParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		WS=39, COM_SIGN=40, PLUS=41, MINUS=42, MULTIPLICATION=43, DIVISION=44, 
		MODULO=45, NEG=46, EQ=47, GREATER=48, LOWER=49, GT=50, LT=51, DOT=52, 
		DIGIT=53, NAME=54;
	public static final int
		RULE_program = 0, RULE_instruction = 1, RULE_instruction_without_draw = 2, 
		RULE_loop = 3, RULE_check = 4, RULE_shape = 5, RULE_point = 6, RULE_segment = 7, 
		RULE_circle = 8, RULE_polygon = 9, RULE_group = 10, RULE_groupMember = 11, 
		RULE_type_definition = 12, RULE_num = 13, RULE_iterator = 14, RULE_canvas = 15, 
		RULE_draw = 16, RULE_transformation = 17, RULE_fill = 18, RULE_move = 19, 
		RULE_place = 20, RULE_rotate = 21, RULE_scale = 22, RULE_arithmetic = 23, 
		RULE_logic = 24, RULE_neq = 25, RULE_cond = 26, RULE_signed_flt = 27, 
		RULE_color = 28, RULE_flt = 29, RULE_operation_flt = 30, RULE_itr = 31;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "instruction", "instruction_without_draw", "loop", "check", 
			"shape", "point", "segment", "circle", "polygon", "group", "groupMember", 
			"type_definition", "num", "iterator", "canvas", "draw", "transformation", 
			"fill", "move", "place", "rotate", "scale", "arithmetic", "logic", "neq", 
			"cond", "signed_flt", "color", "flt", "operation_flt", "itr"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'\n'", "'loop'", "'start'", "'until'", "'step'", "'then'", "'end'", 
			"'check'", "'else'", "'else then'", "'point'", "':'", "','", "'segment'", 
			"'circle'", "'polygon'", "'group'", "'['", "']'", "'num'", "'iterator'", 
			"'canvas'", "'draw'", "'fill'", "'move'", "'place'", "'rotate'", "'scale'", 
			"'#'", "'red'", "'green'", "'yellow'", "'transparent'", "'black'", "'blue'", 
			"'white'", "'orange'", "'pink'", null, null, "'+'", "'-'", "'*'", "'/'", 
			"'%'", "'!'", "'='", "'>'", "'<'", "'>='", "'<='", "'.'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, "WS", "COM_SIGN", "PLUS", "MINUS", "MULTIPLICATION", 
			"DIVISION", "MODULO", "NEG", "EQ", "GREATER", "LOWER", "GT", "LT", "DOT", 
			"DIGIT", "NAME"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Graphly.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public GraphlyParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public CanvasContext canvas() {
			return getRuleContext(CanvasContext.class,0);
		}
		public TerminalNode EOF() { return getToken(GraphlyParser.EOF, 0); }
		public List<Instruction_without_drawContext> instruction_without_draw() {
			return getRuleContexts(Instruction_without_drawContext.class);
		}
		public Instruction_without_drawContext instruction_without_draw(int i) {
			return getRuleContext(Instruction_without_drawContext.class,i);
		}
		public List<InstructionContext> instruction() {
			return getRuleContexts(InstructionContext.class);
		}
		public InstructionContext instruction(int i) {
			return getRuleContext(InstructionContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraphlyListener ) ((GraphlyListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraphlyListener ) ((GraphlyListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(67);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(64);
							match(T__0);
							}
							} 
						}
						setState(69);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
					}
					setState(70);
					instruction_without_draw();
					setState(72); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							{
							setState(71);
							match(T__0);
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(74); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
					} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
					}
					} 
				}
				setState(80);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			setState(81);
			canvas();
			setState(96);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(83); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(82);
						match(T__0);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(85); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(87);
				instruction();
				setState(91);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(88);
						match(T__0);
						}
						} 
					}
					setState(93);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
				}
				}
				}
				setState(98);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(99);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InstructionContext extends ParserRuleContext {
		public ShapeContext shape() {
			return getRuleContext(ShapeContext.class,0);
		}
		public Type_definitionContext type_definition() {
			return getRuleContext(Type_definitionContext.class,0);
		}
		public DrawContext draw() {
			return getRuleContext(DrawContext.class,0);
		}
		public TransformationContext transformation() {
			return getRuleContext(TransformationContext.class,0);
		}
		public GroupContext group() {
			return getRuleContext(GroupContext.class,0);
		}
		public LoopContext loop() {
			return getRuleContext(LoopContext.class,0);
		}
		public CheckContext check() {
			return getRuleContext(CheckContext.class,0);
		}
		public List<TerminalNode> WS() { return getTokens(GraphlyParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(GraphlyParser.WS, i);
		}
		public InstructionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraphlyListener ) ((GraphlyListener)listener).enterInstruction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraphlyListener ) ((GraphlyListener)listener).exitInstruction(this);
		}
	}

	public final InstructionContext instruction() throws RecognitionException {
		InstructionContext _localctx = new InstructionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_instruction);
		int _la;
		try {
			setState(114);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(101);
				shape();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(102);
				type_definition();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(103);
				draw();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(104);
				transformation();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(105);
				group();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(106);
				loop();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(107);
				check();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(111);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(108);
					match(WS);
					}
					}
					setState(113);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Instruction_without_drawContext extends ParserRuleContext {
		public ShapeContext shape() {
			return getRuleContext(ShapeContext.class,0);
		}
		public Type_definitionContext type_definition() {
			return getRuleContext(Type_definitionContext.class,0);
		}
		public TransformationContext transformation() {
			return getRuleContext(TransformationContext.class,0);
		}
		public GroupContext group() {
			return getRuleContext(GroupContext.class,0);
		}
		public LoopContext loop() {
			return getRuleContext(LoopContext.class,0);
		}
		public CheckContext check() {
			return getRuleContext(CheckContext.class,0);
		}
		public List<TerminalNode> WS() { return getTokens(GraphlyParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(GraphlyParser.WS, i);
		}
		public Instruction_without_drawContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruction_without_draw; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraphlyListener ) ((GraphlyListener)listener).enterInstruction_without_draw(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraphlyListener ) ((GraphlyListener)listener).exitInstruction_without_draw(this);
		}
	}

	public final Instruction_without_drawContext instruction_without_draw() throws RecognitionException {
		Instruction_without_drawContext _localctx = new Instruction_without_drawContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_instruction_without_draw);
		int _la;
		try {
			setState(128);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(116);
				shape();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(117);
				type_definition();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(118);
				transformation();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(119);
				group();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(120);
				loop();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(121);
				check();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(125);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(122);
					match(WS);
					}
					}
					setState(127);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LoopContext extends ParserRuleContext {
		public List<TerminalNode> NAME() { return getTokens(GraphlyParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(GraphlyParser.NAME, i);
		}
		public List<ItrContext> itr() {
			return getRuleContexts(ItrContext.class);
		}
		public ItrContext itr(int i) {
			return getRuleContext(ItrContext.class,i);
		}
		public List<TerminalNode> WS() { return getTokens(GraphlyParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(GraphlyParser.WS, i);
		}
		public List<InstructionContext> instruction() {
			return getRuleContexts(InstructionContext.class);
		}
		public InstructionContext instruction(int i) {
			return getRuleContext(InstructionContext.class,i);
		}
		public LoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraphlyListener ) ((GraphlyListener)listener).enterLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraphlyListener ) ((GraphlyListener)listener).exitLoop(this);
		}
	}

	public final LoopContext loop() throws RecognitionException {
		LoopContext _localctx = new LoopContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_loop);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			match(T__1);
			setState(132); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(131);
				match(WS);
				}
				}
				setState(134); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WS );
			setState(136);
			match(NAME);
			setState(138); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(137);
				match(WS);
				}
				}
				setState(140); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WS );
			setState(142);
			match(T__2);
			setState(144); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(143);
				match(WS);
				}
				}
				setState(146); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WS );
			setState(150);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DIGIT:
				{
				setState(148);
				itr();
				}
				break;
			case NAME:
				{
				setState(149);
				match(NAME);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(153); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(152);
				match(WS);
				}
				}
				setState(155); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WS );
			setState(157);
			match(T__3);
			setState(159); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(158);
				match(WS);
				}
				}
				setState(161); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WS );
			setState(165);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DIGIT:
				{
				setState(163);
				itr();
				}
				break;
			case NAME:
				{
				setState(164);
				match(NAME);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(168); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(167);
				match(WS);
				}
				}
				setState(170); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WS );
			setState(172);
			match(T__4);
			setState(174); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(173);
				match(WS);
				}
				}
				setState(176); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WS );
			setState(180);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DIGIT:
				{
				setState(178);
				itr();
				}
				break;
			case NAME:
				{
				setState(179);
				match(NAME);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(183); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(182);
				match(WS);
				}
				}
				setState(185); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WS );
			setState(187);
			match(T__5);
			setState(188);
			match(T__0);
			setState(200);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(192);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(189);
							match(WS);
							}
							} 
						}
						setState(194);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
					}
					setState(195);
					instruction();
					setState(196);
					match(T__0);
					}
					} 
				}
				setState(202);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			}
			setState(206);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(203);
				match(WS);
				}
				}
				setState(208);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(209);
			match(T__6);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CheckContext extends ParserRuleContext {
		public List<CondContext> cond() {
			return getRuleContexts(CondContext.class);
		}
		public CondContext cond(int i) {
			return getRuleContext(CondContext.class,i);
		}
		public List<TerminalNode> WS() { return getTokens(GraphlyParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(GraphlyParser.WS, i);
		}
		public List<InstructionContext> instruction() {
			return getRuleContexts(InstructionContext.class);
		}
		public InstructionContext instruction(int i) {
			return getRuleContext(InstructionContext.class,i);
		}
		public CheckContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_check; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraphlyListener ) ((GraphlyListener)listener).enterCheck(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraphlyListener ) ((GraphlyListener)listener).exitCheck(this);
		}
	}

	public final CheckContext check() throws RecognitionException {
		CheckContext _localctx = new CheckContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_check);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(211);
				match(WS);
				}
				}
				setState(216);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(217);
			match(T__7);
			setState(219); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(218);
					match(WS);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(221); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(223);
			cond();
			setState(225); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(224);
				match(WS);
				}
				}
				setState(227); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WS );
			setState(229);
			match(T__5);
			setState(230);
			match(T__0);
			setState(234);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(231);
					match(WS);
					}
					} 
				}
				setState(236);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			}
			setState(248);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(240);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(237);
							match(WS);
							}
							} 
						}
						setState(242);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
					}
					setState(243);
					instruction();
					setState(244);
					match(T__0);
					}
					} 
				}
				setState(250);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			}
			setState(293);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__8) {
				{
				{
				setState(251);
				match(T__8);
				setState(253); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(252);
					match(WS);
					}
					}
					setState(255); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==WS );
				setState(257);
				match(T__7);
				setState(259); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(258);
						match(WS);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(261); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(263);
				cond();
				setState(265); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(264);
					match(WS);
					}
					}
					setState(267); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==WS );
				setState(269);
				match(T__5);
				setState(270);
				match(T__0);
				setState(274);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(271);
						match(WS);
						}
						} 
					}
					setState(276);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
				}
				setState(288);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(280);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(277);
								match(WS);
								}
								} 
							}
							setState(282);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
						}
						setState(283);
						instruction();
						setState(284);
						match(T__0);
						}
						} 
					}
					setState(290);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
				}
				}
				}
				setState(295);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(312);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__9) {
				{
				setState(296);
				match(T__9);
				setState(297);
				match(T__0);
				setState(309);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(301);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(298);
								match(WS);
								}
								} 
							}
							setState(303);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
						}
						setState(304);
						instruction();
						setState(305);
						match(T__0);
						}
						} 
					}
					setState(311);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
				}
				}
			}

			setState(317);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(314);
				match(WS);
				}
				}
				setState(319);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(320);
			match(T__6);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ShapeContext extends ParserRuleContext {
		public PointContext point() {
			return getRuleContext(PointContext.class,0);
		}
		public SegmentContext segment() {
			return getRuleContext(SegmentContext.class,0);
		}
		public CircleContext circle() {
			return getRuleContext(CircleContext.class,0);
		}
		public PolygonContext polygon() {
			return getRuleContext(PolygonContext.class,0);
		}
		public ShapeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shape; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraphlyListener ) ((GraphlyListener)listener).enterShape(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraphlyListener ) ((GraphlyListener)listener).exitShape(this);
		}
	}

	public final ShapeContext shape() throws RecognitionException {
		ShapeContext _localctx = new ShapeContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_shape);
		try {
			setState(326);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(322);
				point();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(323);
				segment();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(324);
				circle();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(325);
				polygon();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PointContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(GraphlyParser.NAME, 0); }
		public List<Operation_fltContext> operation_flt() {
			return getRuleContexts(Operation_fltContext.class);
		}
		public Operation_fltContext operation_flt(int i) {
			return getRuleContext(Operation_fltContext.class,i);
		}
		public List<TerminalNode> WS() { return getTokens(GraphlyParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(GraphlyParser.WS, i);
		}
		public PointContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_point; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraphlyListener ) ((GraphlyListener)listener).enterPoint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraphlyListener ) ((GraphlyListener)listener).exitPoint(this);
		}
	}

	public final PointContext point() throws RecognitionException {
		PointContext _localctx = new PointContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_point);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(331);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(328);
				match(WS);
				}
				}
				setState(333);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(334);
			match(T__10);
			setState(336); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(335);
				match(WS);
				}
				}
				setState(338); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WS );
			setState(340);
			match(NAME);
			setState(344);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(341);
				match(WS);
				}
				}
				setState(346);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(347);
			match(T__11);
			setState(351);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(348);
				match(WS);
				}
				}
				setState(353);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(354);
			operation_flt();
			setState(358);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(355);
				match(WS);
				}
				}
				setState(360);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(361);
			match(T__12);
			setState(365);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(362);
				match(WS);
				}
				}
				setState(367);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(368);
			operation_flt();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SegmentContext extends ParserRuleContext {
		public List<TerminalNode> NAME() { return getTokens(GraphlyParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(GraphlyParser.NAME, i);
		}
		public List<TerminalNode> WS() { return getTokens(GraphlyParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(GraphlyParser.WS, i);
		}
		public SegmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_segment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraphlyListener ) ((GraphlyListener)listener).enterSegment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraphlyListener ) ((GraphlyListener)listener).exitSegment(this);
		}
	}

	public final SegmentContext segment() throws RecognitionException {
		SegmentContext _localctx = new SegmentContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_segment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(373);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(370);
				match(WS);
				}
				}
				setState(375);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(376);
			match(T__13);
			setState(378); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(377);
				match(WS);
				}
				}
				setState(380); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WS );
			setState(382);
			match(NAME);
			setState(386);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(383);
				match(WS);
				}
				}
				setState(388);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(389);
			match(T__11);
			setState(393);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(390);
				match(WS);
				}
				}
				setState(395);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(396);
			match(NAME);
			setState(400);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(397);
				match(WS);
				}
				}
				setState(402);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(403);
			match(T__12);
			setState(405); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(404);
				match(WS);
				}
				}
				setState(407); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WS );
			setState(409);
			match(NAME);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CircleContext extends ParserRuleContext {
		public List<TerminalNode> NAME() { return getTokens(GraphlyParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(GraphlyParser.NAME, i);
		}
		public Operation_fltContext operation_flt() {
			return getRuleContext(Operation_fltContext.class,0);
		}
		public List<TerminalNode> WS() { return getTokens(GraphlyParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(GraphlyParser.WS, i);
		}
		public CircleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_circle; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraphlyListener ) ((GraphlyListener)listener).enterCircle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraphlyListener ) ((GraphlyListener)listener).exitCircle(this);
		}
	}

	public final CircleContext circle() throws RecognitionException {
		CircleContext _localctx = new CircleContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_circle);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(414);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(411);
				match(WS);
				}
				}
				setState(416);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(417);
			match(T__14);
			setState(419); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(418);
				match(WS);
				}
				}
				setState(421); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WS );
			setState(423);
			match(NAME);
			setState(427);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(424);
				match(WS);
				}
				}
				setState(429);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(430);
			match(T__11);
			setState(434);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(431);
				match(WS);
				}
				}
				setState(436);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(437);
			match(NAME);
			setState(441);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(438);
				match(WS);
				}
				}
				setState(443);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(444);
			match(T__12);
			setState(448);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(445);
				match(WS);
				}
				}
				setState(450);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(451);
			operation_flt();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PolygonContext extends ParserRuleContext {
		public List<TerminalNode> NAME() { return getTokens(GraphlyParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(GraphlyParser.NAME, i);
		}
		public List<TerminalNode> WS() { return getTokens(GraphlyParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(GraphlyParser.WS, i);
		}
		public PolygonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_polygon; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraphlyListener ) ((GraphlyListener)listener).enterPolygon(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraphlyListener ) ((GraphlyListener)listener).exitPolygon(this);
		}
	}

	public final PolygonContext polygon() throws RecognitionException {
		PolygonContext _localctx = new PolygonContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_polygon);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(456);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(453);
				match(WS);
				}
				}
				setState(458);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(459);
			match(T__15);
			setState(461); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(460);
				match(WS);
				}
				}
				setState(463); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WS );
			setState(465);
			match(NAME);
			setState(469);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(466);
				match(WS);
				}
				}
				setState(471);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(472);
			match(T__11);
			setState(476);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(473);
				match(WS);
				}
				}
				setState(478);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(479);
			match(NAME);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GroupContext extends ParserRuleContext {
		public List<TerminalNode> NAME() { return getTokens(GraphlyParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(GraphlyParser.NAME, i);
		}
		public List<TerminalNode> WS() { return getTokens(GraphlyParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(GraphlyParser.WS, i);
		}
		public GroupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_group; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraphlyListener ) ((GraphlyListener)listener).enterGroup(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraphlyListener ) ((GraphlyListener)listener).exitGroup(this);
		}
	}

	public final GroupContext group() throws RecognitionException {
		GroupContext _localctx = new GroupContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_group);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(484);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(481);
				match(WS);
				}
				}
				setState(486);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(487);
			match(T__16);
			setState(489); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(488);
				match(WS);
				}
				}
				setState(491); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WS );
			setState(493);
			match(NAME);
			setState(497);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(494);
				match(WS);
				}
				}
				setState(499);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(500);
			match(T__11);
			setState(504);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(501);
				match(WS);
				}
				}
				setState(506);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(507);
			match(NAME);
			setState(511);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(508);
				match(WS);
				}
				}
				setState(513);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(530);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__12) {
				{
				{
				setState(514);
				match(T__12);
				setState(518);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(515);
					match(WS);
					}
					}
					setState(520);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(521);
				match(NAME);
				setState(525);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(522);
					match(WS);
					}
					}
					setState(527);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(532);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GroupMemberContext extends ParserRuleContext {
		public List<TerminalNode> NAME() { return getTokens(GraphlyParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(GraphlyParser.NAME, i);
		}
		public ItrContext itr() {
			return getRuleContext(ItrContext.class,0);
		}
		public List<TerminalNode> WS() { return getTokens(GraphlyParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(GraphlyParser.WS, i);
		}
		public GroupMemberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groupMember; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraphlyListener ) ((GraphlyListener)listener).enterGroupMember(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraphlyListener ) ((GraphlyListener)listener).exitGroupMember(this);
		}
	}

	public final GroupMemberContext groupMember() throws RecognitionException {
		GroupMemberContext _localctx = new GroupMemberContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_groupMember);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(536);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(533);
				match(WS);
				}
				}
				setState(538);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(539);
			match(NAME);
			setState(543);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(540);
				match(WS);
				}
				}
				setState(545);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(546);
			match(T__17);
			setState(550);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(547);
				match(WS);
				}
				}
				setState(552);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(555);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DIGIT:
				{
				setState(553);
				itr();
				}
				break;
			case NAME:
				{
				setState(554);
				match(NAME);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(560);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(557);
				match(WS);
				}
				}
				setState(562);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(563);
			match(T__18);
			setState(565); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(564);
				match(WS);
				}
				}
				setState(567); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WS );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Type_definitionContext extends ParserRuleContext {
		public NumContext num() {
			return getRuleContext(NumContext.class,0);
		}
		public IteratorContext iterator() {
			return getRuleContext(IteratorContext.class,0);
		}
		public Type_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraphlyListener ) ((GraphlyListener)listener).enterType_definition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraphlyListener ) ((GraphlyListener)listener).exitType_definition(this);
		}
	}

	public final Type_definitionContext type_definition() throws RecognitionException {
		Type_definitionContext _localctx = new Type_definitionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_type_definition);
		try {
			setState(571);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,78,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(569);
				num();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(570);
				iterator();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NumContext extends ParserRuleContext {
		public List<TerminalNode> NAME() { return getTokens(GraphlyParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(GraphlyParser.NAME, i);
		}
		public Signed_fltContext signed_flt() {
			return getRuleContext(Signed_fltContext.class,0);
		}
		public List<TerminalNode> WS() { return getTokens(GraphlyParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(GraphlyParser.WS, i);
		}
		public NumContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_num; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraphlyListener ) ((GraphlyListener)listener).enterNum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraphlyListener ) ((GraphlyListener)listener).exitNum(this);
		}
	}

	public final NumContext num() throws RecognitionException {
		NumContext _localctx = new NumContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_num);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(576);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(573);
				match(WS);
				}
				}
				setState(578);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(579);
			match(T__19);
			setState(581); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(580);
				match(WS);
				}
				}
				setState(583); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WS );
			setState(585);
			match(NAME);
			setState(589);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(586);
				match(WS);
				}
				}
				setState(591);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(592);
			match(T__11);
			setState(596);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(593);
				match(WS);
				}
				}
				setState(598);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(601);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,83,_ctx) ) {
			case 1:
				{
				setState(599);
				signed_flt();
				}
				break;
			case 2:
				{
				setState(600);
				match(NAME);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IteratorContext extends ParserRuleContext {
		public List<TerminalNode> NAME() { return getTokens(GraphlyParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(GraphlyParser.NAME, i);
		}
		public ItrContext itr() {
			return getRuleContext(ItrContext.class,0);
		}
		public List<TerminalNode> WS() { return getTokens(GraphlyParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(GraphlyParser.WS, i);
		}
		public IteratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iterator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraphlyListener ) ((GraphlyListener)listener).enterIterator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraphlyListener ) ((GraphlyListener)listener).exitIterator(this);
		}
	}

	public final IteratorContext iterator() throws RecognitionException {
		IteratorContext _localctx = new IteratorContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_iterator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(606);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(603);
				match(WS);
				}
				}
				setState(608);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(609);
			match(T__20);
			setState(611); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(610);
				match(WS);
				}
				}
				setState(613); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WS );
			setState(615);
			match(NAME);
			setState(619);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(616);
				match(WS);
				}
				}
				setState(621);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(622);
			match(T__11);
			setState(626);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(623);
				match(WS);
				}
				}
				setState(628);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(631);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DIGIT:
				{
				setState(629);
				itr();
				}
				break;
			case NAME:
				{
				setState(630);
				match(NAME);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CanvasContext extends ParserRuleContext {
		public ColorContext color() {
			return getRuleContext(ColorContext.class,0);
		}
		public List<Signed_fltContext> signed_flt() {
			return getRuleContexts(Signed_fltContext.class);
		}
		public Signed_fltContext signed_flt(int i) {
			return getRuleContext(Signed_fltContext.class,i);
		}
		public List<TerminalNode> NAME() { return getTokens(GraphlyParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(GraphlyParser.NAME, i);
		}
		public List<TerminalNode> WS() { return getTokens(GraphlyParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(GraphlyParser.WS, i);
		}
		public CanvasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_canvas; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraphlyListener ) ((GraphlyListener)listener).enterCanvas(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraphlyListener ) ((GraphlyListener)listener).exitCanvas(this);
		}
	}

	public final CanvasContext canvas() throws RecognitionException {
		CanvasContext _localctx = new CanvasContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_canvas);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(636);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(633);
				match(WS);
				}
				}
				setState(638);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(639);
			match(T__21);
			setState(643);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(640);
				match(WS);
				}
				}
				setState(645);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(646);
			match(T__11);
			setState(650);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(647);
				match(WS);
				}
				}
				setState(652);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(655);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,92,_ctx) ) {
			case 1:
				{
				setState(653);
				signed_flt();
				}
				break;
			case 2:
				{
				setState(654);
				match(NAME);
				}
				break;
			}
			setState(660);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(657);
				match(WS);
				}
				}
				setState(662);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(663);
			match(T__12);
			setState(667);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(664);
				match(WS);
				}
				}
				setState(669);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(672);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,95,_ctx) ) {
			case 1:
				{
				setState(670);
				signed_flt();
				}
				break;
			case 2:
				{
				setState(671);
				match(NAME);
				}
				break;
			}
			setState(677);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(674);
				match(WS);
				}
				}
				setState(679);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(680);
			match(T__12);
			setState(684);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(681);
				match(WS);
				}
				}
				setState(686);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(687);
			color();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DrawContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(GraphlyParser.NAME, 0); }
		public List<TerminalNode> WS() { return getTokens(GraphlyParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(GraphlyParser.WS, i);
		}
		public DrawContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_draw; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraphlyListener ) ((GraphlyListener)listener).enterDraw(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraphlyListener ) ((GraphlyListener)listener).exitDraw(this);
		}
	}

	public final DrawContext draw() throws RecognitionException {
		DrawContext _localctx = new DrawContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_draw);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(692);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(689);
				match(WS);
				}
				}
				setState(694);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(695);
			match(T__22);
			setState(697); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(696);
				match(WS);
				}
				}
				setState(699); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WS );
			setState(701);
			match(NAME);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TransformationContext extends ParserRuleContext {
		public FillContext fill() {
			return getRuleContext(FillContext.class,0);
		}
		public MoveContext move() {
			return getRuleContext(MoveContext.class,0);
		}
		public PlaceContext place() {
			return getRuleContext(PlaceContext.class,0);
		}
		public RotateContext rotate() {
			return getRuleContext(RotateContext.class,0);
		}
		public ScaleContext scale() {
			return getRuleContext(ScaleContext.class,0);
		}
		public TransformationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_transformation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraphlyListener ) ((GraphlyListener)listener).enterTransformation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraphlyListener ) ((GraphlyListener)listener).exitTransformation(this);
		}
	}

	public final TransformationContext transformation() throws RecognitionException {
		TransformationContext _localctx = new TransformationContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_transformation);
		try {
			setState(708);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,100,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(703);
				fill();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(704);
				move();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(705);
				place();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(706);
				rotate();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(707);
				scale();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FillContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(GraphlyParser.NAME, 0); }
		public ColorContext color() {
			return getRuleContext(ColorContext.class,0);
		}
		public List<TerminalNode> WS() { return getTokens(GraphlyParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(GraphlyParser.WS, i);
		}
		public FillContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fill; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraphlyListener ) ((GraphlyListener)listener).enterFill(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraphlyListener ) ((GraphlyListener)listener).exitFill(this);
		}
	}

	public final FillContext fill() throws RecognitionException {
		FillContext _localctx = new FillContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_fill);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(713);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(710);
				match(WS);
				}
				}
				setState(715);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(716);
			match(T__23);
			setState(718); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(717);
				match(WS);
				}
				}
				setState(720); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WS );
			setState(722);
			match(NAME);
			setState(726);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(723);
				match(WS);
				}
				}
				setState(728);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(729);
			match(T__11);
			setState(733);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(730);
				match(WS);
				}
				}
				setState(735);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(736);
			color();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MoveContext extends ParserRuleContext {
		public List<TerminalNode> NAME() { return getTokens(GraphlyParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(GraphlyParser.NAME, i);
		}
		public List<Signed_fltContext> signed_flt() {
			return getRuleContexts(Signed_fltContext.class);
		}
		public Signed_fltContext signed_flt(int i) {
			return getRuleContext(Signed_fltContext.class,i);
		}
		public List<TerminalNode> WS() { return getTokens(GraphlyParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(GraphlyParser.WS, i);
		}
		public MoveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_move; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraphlyListener ) ((GraphlyListener)listener).enterMove(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraphlyListener ) ((GraphlyListener)listener).exitMove(this);
		}
	}

	public final MoveContext move() throws RecognitionException {
		MoveContext _localctx = new MoveContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_move);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(741);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(738);
				match(WS);
				}
				}
				setState(743);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(744);
			match(T__24);
			setState(746); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(745);
				match(WS);
				}
				}
				setState(748); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WS );
			setState(750);
			match(NAME);
			setState(754);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(751);
				match(WS);
				}
				}
				setState(756);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(757);
			match(T__11);
			setState(761);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(758);
				match(WS);
				}
				}
				setState(763);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(766);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,109,_ctx) ) {
			case 1:
				{
				setState(764);
				signed_flt();
				}
				break;
			case 2:
				{
				setState(765);
				match(NAME);
				}
				break;
			}
			setState(771);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(768);
				match(WS);
				}
				}
				setState(773);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(774);
			match(T__12);
			setState(778);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(775);
				match(WS);
				}
				}
				setState(780);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(783);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,112,_ctx) ) {
			case 1:
				{
				setState(781);
				signed_flt();
				}
				break;
			case 2:
				{
				setState(782);
				match(NAME);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PlaceContext extends ParserRuleContext {
		public List<TerminalNode> NAME() { return getTokens(GraphlyParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(GraphlyParser.NAME, i);
		}
		public List<TerminalNode> WS() { return getTokens(GraphlyParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(GraphlyParser.WS, i);
		}
		public PlaceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_place; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraphlyListener ) ((GraphlyListener)listener).enterPlace(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraphlyListener ) ((GraphlyListener)listener).exitPlace(this);
		}
	}

	public final PlaceContext place() throws RecognitionException {
		PlaceContext _localctx = new PlaceContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_place);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(788);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(785);
				match(WS);
				}
				}
				setState(790);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(791);
			match(T__25);
			setState(793); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(792);
				match(WS);
				}
				}
				setState(795); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WS );
			setState(797);
			match(NAME);
			setState(801);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(798);
				match(WS);
				}
				}
				setState(803);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(804);
			match(T__11);
			setState(808);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(805);
				match(WS);
				}
				}
				setState(810);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(811);
			match(NAME);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RotateContext extends ParserRuleContext {
		public List<TerminalNode> NAME() { return getTokens(GraphlyParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(GraphlyParser.NAME, i);
		}
		public Signed_fltContext signed_flt() {
			return getRuleContext(Signed_fltContext.class,0);
		}
		public List<TerminalNode> WS() { return getTokens(GraphlyParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(GraphlyParser.WS, i);
		}
		public RotateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rotate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraphlyListener ) ((GraphlyListener)listener).enterRotate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraphlyListener ) ((GraphlyListener)listener).exitRotate(this);
		}
	}

	public final RotateContext rotate() throws RecognitionException {
		RotateContext _localctx = new RotateContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_rotate);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(816);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(813);
				match(WS);
				}
				}
				setState(818);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(819);
			match(T__26);
			setState(821); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(820);
				match(WS);
				}
				}
				setState(823); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WS );
			setState(825);
			match(NAME);
			setState(829);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(826);
				match(WS);
				}
				}
				setState(831);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(832);
			match(T__11);
			setState(836);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(833);
				match(WS);
				}
				}
				setState(838);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(841);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,121,_ctx) ) {
			case 1:
				{
				setState(839);
				signed_flt();
				}
				break;
			case 2:
				{
				setState(840);
				match(NAME);
				}
				break;
			}
			setState(846);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(843);
				match(WS);
				}
				}
				setState(848);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(849);
			match(T__12);
			setState(853);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(850);
				match(WS);
				}
				}
				setState(855);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(856);
			match(NAME);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ScaleContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(GraphlyParser.NAME, 0); }
		public Operation_fltContext operation_flt() {
			return getRuleContext(Operation_fltContext.class,0);
		}
		public List<TerminalNode> WS() { return getTokens(GraphlyParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(GraphlyParser.WS, i);
		}
		public ScaleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scale; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraphlyListener ) ((GraphlyListener)listener).enterScale(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraphlyListener ) ((GraphlyListener)listener).exitScale(this);
		}
	}

	public final ScaleContext scale() throws RecognitionException {
		ScaleContext _localctx = new ScaleContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_scale);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(861);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(858);
				match(WS);
				}
				}
				setState(863);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(864);
			match(T__27);
			setState(866); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(865);
				match(WS);
				}
				}
				setState(868); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WS );
			setState(870);
			match(NAME);
			setState(874);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(871);
				match(WS);
				}
				}
				setState(876);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(877);
			match(T__11);
			setState(881);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(878);
				match(WS);
				}
				}
				setState(883);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(884);
			operation_flt();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArithmeticContext extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(GraphlyParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(GraphlyParser.MINUS, 0); }
		public TerminalNode MULTIPLICATION() { return getToken(GraphlyParser.MULTIPLICATION, 0); }
		public TerminalNode DIVISION() { return getToken(GraphlyParser.DIVISION, 0); }
		public TerminalNode MODULO() { return getToken(GraphlyParser.MODULO, 0); }
		public ArithmeticContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithmetic; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraphlyListener ) ((GraphlyListener)listener).enterArithmetic(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraphlyListener ) ((GraphlyListener)listener).exitArithmetic(this);
		}
	}

	public final ArithmeticContext arithmetic() throws RecognitionException {
		ArithmeticContext _localctx = new ArithmeticContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_arithmetic);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(886);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << MINUS) | (1L << MULTIPLICATION) | (1L << DIVISION) | (1L << MODULO))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LogicContext extends ParserRuleContext {
		public TerminalNode GREATER() { return getToken(GraphlyParser.GREATER, 0); }
		public TerminalNode LOWER() { return getToken(GraphlyParser.LOWER, 0); }
		public TerminalNode GT() { return getToken(GraphlyParser.GT, 0); }
		public TerminalNode LT() { return getToken(GraphlyParser.LT, 0); }
		public TerminalNode EQ() { return getToken(GraphlyParser.EQ, 0); }
		public NeqContext neq() {
			return getRuleContext(NeqContext.class,0);
		}
		public LogicContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logic; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraphlyListener ) ((GraphlyListener)listener).enterLogic(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraphlyListener ) ((GraphlyListener)listener).exitLogic(this);
		}
	}

	public final LogicContext logic() throws RecognitionException {
		LogicContext _localctx = new LogicContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_logic);
		try {
			setState(894);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case GREATER:
				enterOuterAlt(_localctx, 1);
				{
				setState(888);
				match(GREATER);
				}
				break;
			case LOWER:
				enterOuterAlt(_localctx, 2);
				{
				setState(889);
				match(LOWER);
				}
				break;
			case GT:
				enterOuterAlt(_localctx, 3);
				{
				setState(890);
				match(GT);
				}
				break;
			case LT:
				enterOuterAlt(_localctx, 4);
				{
				setState(891);
				match(LT);
				}
				break;
			case EQ:
				enterOuterAlt(_localctx, 5);
				{
				setState(892);
				match(EQ);
				}
				break;
			case NEG:
				enterOuterAlt(_localctx, 6);
				{
				setState(893);
				neq();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NeqContext extends ParserRuleContext {
		public TerminalNode NEG() { return getToken(GraphlyParser.NEG, 0); }
		public TerminalNode EQ() { return getToken(GraphlyParser.EQ, 0); }
		public NeqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_neq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraphlyListener ) ((GraphlyListener)listener).enterNeq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraphlyListener ) ((GraphlyListener)listener).exitNeq(this);
		}
	}

	public final NeqContext neq() throws RecognitionException {
		NeqContext _localctx = new NeqContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_neq);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(896);
			match(NEG);
			setState(897);
			match(EQ);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CondContext extends ParserRuleContext {
		public LogicContext logic() {
			return getRuleContext(LogicContext.class,0);
		}
		public List<TerminalNode> WS() { return getTokens(GraphlyParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(GraphlyParser.WS, i);
		}
		public List<Signed_fltContext> signed_flt() {
			return getRuleContexts(Signed_fltContext.class);
		}
		public Signed_fltContext signed_flt(int i) {
			return getRuleContext(Signed_fltContext.class,i);
		}
		public List<TerminalNode> NAME() { return getTokens(GraphlyParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(GraphlyParser.NAME, i);
		}
		public List<ItrContext> itr() {
			return getRuleContexts(ItrContext.class);
		}
		public ItrContext itr(int i) {
			return getRuleContext(ItrContext.class,i);
		}
		public CondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraphlyListener ) ((GraphlyListener)listener).enterCond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraphlyListener ) ((GraphlyListener)listener).exitCond(this);
		}
	}

	public final CondContext cond() throws RecognitionException {
		CondContext _localctx = new CondContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_cond);
		int _la;
		try {
			setState(947);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,138,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(902);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(899);
					match(WS);
					}
					}
					setState(904);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				{
				setState(907);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,130,_ctx) ) {
				case 1:
					{
					setState(905);
					signed_flt();
					}
					break;
				case 2:
					{
					setState(906);
					match(NAME);
					}
					break;
				}
				setState(912);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(909);
					match(WS);
					}
					}
					setState(914);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(915);
				logic();
				setState(919);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(916);
					match(WS);
					}
					}
					setState(921);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(924);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,133,_ctx) ) {
				case 1:
					{
					setState(922);
					signed_flt();
					}
					break;
				case 2:
					{
					setState(923);
					match(NAME);
					}
					break;
				}
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(928);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case DIGIT:
					{
					setState(926);
					itr();
					}
					break;
				case NAME:
					{
					setState(927);
					match(NAME);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(933);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(930);
					match(WS);
					}
					}
					setState(935);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(936);
				logic();
				setState(940);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(937);
					match(WS);
					}
					}
					setState(942);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(945);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case DIGIT:
					{
					setState(943);
					itr();
					}
					break;
				case NAME:
					{
					setState(944);
					match(NAME);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Signed_fltContext extends ParserRuleContext {
		public FltContext flt() {
			return getRuleContext(FltContext.class,0);
		}
		public List<TerminalNode> NAME() { return getTokens(GraphlyParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(GraphlyParser.NAME, i);
		}
		public TerminalNode MINUS() { return getToken(GraphlyParser.MINUS, 0); }
		public List<ArithmeticContext> arithmetic() {
			return getRuleContexts(ArithmeticContext.class);
		}
		public ArithmeticContext arithmetic(int i) {
			return getRuleContext(ArithmeticContext.class,i);
		}
		public List<Signed_fltContext> signed_flt() {
			return getRuleContexts(Signed_fltContext.class);
		}
		public Signed_fltContext signed_flt(int i) {
			return getRuleContext(Signed_fltContext.class,i);
		}
		public Signed_fltContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signed_flt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraphlyListener ) ((GraphlyListener)listener).enterSigned_flt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraphlyListener ) ((GraphlyListener)listener).exitSigned_flt(this);
		}
	}

	public final Signed_fltContext signed_flt() throws RecognitionException {
		Signed_fltContext _localctx = new Signed_fltContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_signed_flt);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(950);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MINUS) {
				{
				setState(949);
				match(MINUS);
				}
			}

			setState(954);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DOT:
			case DIGIT:
				{
				setState(952);
				flt();
				}
				break;
			case NAME:
				{
				setState(953);
				match(NAME);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(963);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,142,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(956);
					arithmetic();
					setState(959);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,141,_ctx) ) {
					case 1:
						{
						setState(957);
						signed_flt();
						}
						break;
					case 2:
						{
						setState(958);
						match(NAME);
						}
						break;
					}
					}
					} 
				}
				setState(965);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,142,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ColorContext extends ParserRuleContext {
		public ColorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_color; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraphlyListener ) ((GraphlyListener)listener).enterColor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraphlyListener ) ((GraphlyListener)listener).exitColor(this);
		}
	}

	public final ColorContext color() throws RecognitionException {
		ColorContext _localctx = new ColorContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_color);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(966);
			match(T__28);
			setState(967);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FltContext extends ParserRuleContext {
		public TerminalNode DOT() { return getToken(GraphlyParser.DOT, 0); }
		public List<TerminalNode> DIGIT() { return getTokens(GraphlyParser.DIGIT); }
		public TerminalNode DIGIT(int i) {
			return getToken(GraphlyParser.DIGIT, i);
		}
		public FltContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_flt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraphlyListener ) ((GraphlyListener)listener).enterFlt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraphlyListener ) ((GraphlyListener)listener).exitFlt(this);
		}
	}

	public final FltContext flt() throws RecognitionException {
		FltContext _localctx = new FltContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_flt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(976);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,144,_ctx) ) {
			case 1:
				{
				setState(972);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==DIGIT) {
					{
					{
					setState(969);
					match(DIGIT);
					}
					}
					setState(974);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(975);
				match(DOT);
				}
				break;
			}
			setState(979); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(978);
				match(DIGIT);
				}
				}
				setState(981); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==DIGIT );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Operation_fltContext extends ParserRuleContext {
		public List<FltContext> flt() {
			return getRuleContexts(FltContext.class);
		}
		public FltContext flt(int i) {
			return getRuleContext(FltContext.class,i);
		}
		public List<TerminalNode> NAME() { return getTokens(GraphlyParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(GraphlyParser.NAME, i);
		}
		public List<ArithmeticContext> arithmetic() {
			return getRuleContexts(ArithmeticContext.class);
		}
		public ArithmeticContext arithmetic(int i) {
			return getRuleContext(ArithmeticContext.class,i);
		}
		public Operation_fltContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operation_flt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraphlyListener ) ((GraphlyListener)listener).enterOperation_flt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraphlyListener ) ((GraphlyListener)listener).exitOperation_flt(this);
		}
	}

	public final Operation_fltContext operation_flt() throws RecognitionException {
		Operation_fltContext _localctx = new Operation_fltContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_operation_flt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(985);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DOT:
			case DIGIT:
				{
				setState(983);
				flt();
				}
				break;
			case NAME:
				{
				setState(984);
				match(NAME);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(994);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << MINUS) | (1L << MULTIPLICATION) | (1L << DIVISION) | (1L << MODULO))) != 0)) {
				{
				{
				setState(987);
				arithmetic();
				setState(990);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case DOT:
				case DIGIT:
					{
					setState(988);
					flt();
					}
					break;
				case NAME:
					{
					setState(989);
					match(NAME);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(996);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ItrContext extends ParserRuleContext {
		public List<TerminalNode> DIGIT() { return getTokens(GraphlyParser.DIGIT); }
		public TerminalNode DIGIT(int i) {
			return getToken(GraphlyParser.DIGIT, i);
		}
		public ItrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_itr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraphlyListener ) ((GraphlyListener)listener).enterItr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraphlyListener ) ((GraphlyListener)listener).exitItr(this);
		}
	}

	public final ItrContext itr() throws RecognitionException {
		ItrContext _localctx = new ItrContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_itr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(998); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(997);
				match(DIGIT);
				}
				}
				setState(1000); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==DIGIT );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\38\u03ed\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\3\2\7\2D\n\2\f\2\16\2G\13\2\3\2\3\2\6\2K\n\2\r\2\16\2L\7\2O\n\2\f"+
		"\2\16\2R\13\2\3\2\3\2\6\2V\n\2\r\2\16\2W\3\2\3\2\7\2\\\n\2\f\2\16\2_\13"+
		"\2\7\2a\n\2\f\2\16\2d\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3"+
		"p\n\3\f\3\16\3s\13\3\5\3u\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4~\n\4\f\4"+
		"\16\4\u0081\13\4\5\4\u0083\n\4\3\5\3\5\6\5\u0087\n\5\r\5\16\5\u0088\3"+
		"\5\3\5\6\5\u008d\n\5\r\5\16\5\u008e\3\5\3\5\6\5\u0093\n\5\r\5\16\5\u0094"+
		"\3\5\3\5\5\5\u0099\n\5\3\5\6\5\u009c\n\5\r\5\16\5\u009d\3\5\3\5\6\5\u00a2"+
		"\n\5\r\5\16\5\u00a3\3\5\3\5\5\5\u00a8\n\5\3\5\6\5\u00ab\n\5\r\5\16\5\u00ac"+
		"\3\5\3\5\6\5\u00b1\n\5\r\5\16\5\u00b2\3\5\3\5\5\5\u00b7\n\5\3\5\6\5\u00ba"+
		"\n\5\r\5\16\5\u00bb\3\5\3\5\3\5\7\5\u00c1\n\5\f\5\16\5\u00c4\13\5\3\5"+
		"\3\5\3\5\7\5\u00c9\n\5\f\5\16\5\u00cc\13\5\3\5\7\5\u00cf\n\5\f\5\16\5"+
		"\u00d2\13\5\3\5\3\5\3\6\7\6\u00d7\n\6\f\6\16\6\u00da\13\6\3\6\3\6\6\6"+
		"\u00de\n\6\r\6\16\6\u00df\3\6\3\6\6\6\u00e4\n\6\r\6\16\6\u00e5\3\6\3\6"+
		"\3\6\7\6\u00eb\n\6\f\6\16\6\u00ee\13\6\3\6\7\6\u00f1\n\6\f\6\16\6\u00f4"+
		"\13\6\3\6\3\6\3\6\7\6\u00f9\n\6\f\6\16\6\u00fc\13\6\3\6\3\6\6\6\u0100"+
		"\n\6\r\6\16\6\u0101\3\6\3\6\6\6\u0106\n\6\r\6\16\6\u0107\3\6\3\6\6\6\u010c"+
		"\n\6\r\6\16\6\u010d\3\6\3\6\3\6\7\6\u0113\n\6\f\6\16\6\u0116\13\6\3\6"+
		"\7\6\u0119\n\6\f\6\16\6\u011c\13\6\3\6\3\6\3\6\7\6\u0121\n\6\f\6\16\6"+
		"\u0124\13\6\7\6\u0126\n\6\f\6\16\6\u0129\13\6\3\6\3\6\3\6\7\6\u012e\n"+
		"\6\f\6\16\6\u0131\13\6\3\6\3\6\3\6\7\6\u0136\n\6\f\6\16\6\u0139\13\6\5"+
		"\6\u013b\n\6\3\6\7\6\u013e\n\6\f\6\16\6\u0141\13\6\3\6\3\6\3\7\3\7\3\7"+
		"\3\7\5\7\u0149\n\7\3\b\7\b\u014c\n\b\f\b\16\b\u014f\13\b\3\b\3\b\6\b\u0153"+
		"\n\b\r\b\16\b\u0154\3\b\3\b\7\b\u0159\n\b\f\b\16\b\u015c\13\b\3\b\3\b"+
		"\7\b\u0160\n\b\f\b\16\b\u0163\13\b\3\b\3\b\7\b\u0167\n\b\f\b\16\b\u016a"+
		"\13\b\3\b\3\b\7\b\u016e\n\b\f\b\16\b\u0171\13\b\3\b\3\b\3\t\7\t\u0176"+
		"\n\t\f\t\16\t\u0179\13\t\3\t\3\t\6\t\u017d\n\t\r\t\16\t\u017e\3\t\3\t"+
		"\7\t\u0183\n\t\f\t\16\t\u0186\13\t\3\t\3\t\7\t\u018a\n\t\f\t\16\t\u018d"+
		"\13\t\3\t\3\t\7\t\u0191\n\t\f\t\16\t\u0194\13\t\3\t\3\t\6\t\u0198\n\t"+
		"\r\t\16\t\u0199\3\t\3\t\3\n\7\n\u019f\n\n\f\n\16\n\u01a2\13\n\3\n\3\n"+
		"\6\n\u01a6\n\n\r\n\16\n\u01a7\3\n\3\n\7\n\u01ac\n\n\f\n\16\n\u01af\13"+
		"\n\3\n\3\n\7\n\u01b3\n\n\f\n\16\n\u01b6\13\n\3\n\3\n\7\n\u01ba\n\n\f\n"+
		"\16\n\u01bd\13\n\3\n\3\n\7\n\u01c1\n\n\f\n\16\n\u01c4\13\n\3\n\3\n\3\13"+
		"\7\13\u01c9\n\13\f\13\16\13\u01cc\13\13\3\13\3\13\6\13\u01d0\n\13\r\13"+
		"\16\13\u01d1\3\13\3\13\7\13\u01d6\n\13\f\13\16\13\u01d9\13\13\3\13\3\13"+
		"\7\13\u01dd\n\13\f\13\16\13\u01e0\13\13\3\13\3\13\3\f\7\f\u01e5\n\f\f"+
		"\f\16\f\u01e8\13\f\3\f\3\f\6\f\u01ec\n\f\r\f\16\f\u01ed\3\f\3\f\7\f\u01f2"+
		"\n\f\f\f\16\f\u01f5\13\f\3\f\3\f\7\f\u01f9\n\f\f\f\16\f\u01fc\13\f\3\f"+
		"\3\f\7\f\u0200\n\f\f\f\16\f\u0203\13\f\3\f\3\f\7\f\u0207\n\f\f\f\16\f"+
		"\u020a\13\f\3\f\3\f\7\f\u020e\n\f\f\f\16\f\u0211\13\f\7\f\u0213\n\f\f"+
		"\f\16\f\u0216\13\f\3\r\7\r\u0219\n\r\f\r\16\r\u021c\13\r\3\r\3\r\7\r\u0220"+
		"\n\r\f\r\16\r\u0223\13\r\3\r\3\r\7\r\u0227\n\r\f\r\16\r\u022a\13\r\3\r"+
		"\3\r\5\r\u022e\n\r\3\r\7\r\u0231\n\r\f\r\16\r\u0234\13\r\3\r\3\r\6\r\u0238"+
		"\n\r\r\r\16\r\u0239\3\16\3\16\5\16\u023e\n\16\3\17\7\17\u0241\n\17\f\17"+
		"\16\17\u0244\13\17\3\17\3\17\6\17\u0248\n\17\r\17\16\17\u0249\3\17\3\17"+
		"\7\17\u024e\n\17\f\17\16\17\u0251\13\17\3\17\3\17\7\17\u0255\n\17\f\17"+
		"\16\17\u0258\13\17\3\17\3\17\5\17\u025c\n\17\3\20\7\20\u025f\n\20\f\20"+
		"\16\20\u0262\13\20\3\20\3\20\6\20\u0266\n\20\r\20\16\20\u0267\3\20\3\20"+
		"\7\20\u026c\n\20\f\20\16\20\u026f\13\20\3\20\3\20\7\20\u0273\n\20\f\20"+
		"\16\20\u0276\13\20\3\20\3\20\5\20\u027a\n\20\3\21\7\21\u027d\n\21\f\21"+
		"\16\21\u0280\13\21\3\21\3\21\7\21\u0284\n\21\f\21\16\21\u0287\13\21\3"+
		"\21\3\21\7\21\u028b\n\21\f\21\16\21\u028e\13\21\3\21\3\21\5\21\u0292\n"+
		"\21\3\21\7\21\u0295\n\21\f\21\16\21\u0298\13\21\3\21\3\21\7\21\u029c\n"+
		"\21\f\21\16\21\u029f\13\21\3\21\3\21\5\21\u02a3\n\21\3\21\7\21\u02a6\n"+
		"\21\f\21\16\21\u02a9\13\21\3\21\3\21\7\21\u02ad\n\21\f\21\16\21\u02b0"+
		"\13\21\3\21\3\21\3\22\7\22\u02b5\n\22\f\22\16\22\u02b8\13\22\3\22\3\22"+
		"\6\22\u02bc\n\22\r\22\16\22\u02bd\3\22\3\22\3\23\3\23\3\23\3\23\3\23\5"+
		"\23\u02c7\n\23\3\24\7\24\u02ca\n\24\f\24\16\24\u02cd\13\24\3\24\3\24\6"+
		"\24\u02d1\n\24\r\24\16\24\u02d2\3\24\3\24\7\24\u02d7\n\24\f\24\16\24\u02da"+
		"\13\24\3\24\3\24\7\24\u02de\n\24\f\24\16\24\u02e1\13\24\3\24\3\24\3\25"+
		"\7\25\u02e6\n\25\f\25\16\25\u02e9\13\25\3\25\3\25\6\25\u02ed\n\25\r\25"+
		"\16\25\u02ee\3\25\3\25\7\25\u02f3\n\25\f\25\16\25\u02f6\13\25\3\25\3\25"+
		"\7\25\u02fa\n\25\f\25\16\25\u02fd\13\25\3\25\3\25\5\25\u0301\n\25\3\25"+
		"\7\25\u0304\n\25\f\25\16\25\u0307\13\25\3\25\3\25\7\25\u030b\n\25\f\25"+
		"\16\25\u030e\13\25\3\25\3\25\5\25\u0312\n\25\3\26\7\26\u0315\n\26\f\26"+
		"\16\26\u0318\13\26\3\26\3\26\6\26\u031c\n\26\r\26\16\26\u031d\3\26\3\26"+
		"\7\26\u0322\n\26\f\26\16\26\u0325\13\26\3\26\3\26\7\26\u0329\n\26\f\26"+
		"\16\26\u032c\13\26\3\26\3\26\3\27\7\27\u0331\n\27\f\27\16\27\u0334\13"+
		"\27\3\27\3\27\6\27\u0338\n\27\r\27\16\27\u0339\3\27\3\27\7\27\u033e\n"+
		"\27\f\27\16\27\u0341\13\27\3\27\3\27\7\27\u0345\n\27\f\27\16\27\u0348"+
		"\13\27\3\27\3\27\5\27\u034c\n\27\3\27\7\27\u034f\n\27\f\27\16\27\u0352"+
		"\13\27\3\27\3\27\7\27\u0356\n\27\f\27\16\27\u0359\13\27\3\27\3\27\3\30"+
		"\7\30\u035e\n\30\f\30\16\30\u0361\13\30\3\30\3\30\6\30\u0365\n\30\r\30"+
		"\16\30\u0366\3\30\3\30\7\30\u036b\n\30\f\30\16\30\u036e\13\30\3\30\3\30"+
		"\7\30\u0372\n\30\f\30\16\30\u0375\13\30\3\30\3\30\3\31\3\31\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\5\32\u0381\n\32\3\33\3\33\3\33\3\34\7\34\u0387\n"+
		"\34\f\34\16\34\u038a\13\34\3\34\3\34\5\34\u038e\n\34\3\34\7\34\u0391\n"+
		"\34\f\34\16\34\u0394\13\34\3\34\3\34\7\34\u0398\n\34\f\34\16\34\u039b"+
		"\13\34\3\34\3\34\5\34\u039f\n\34\3\34\3\34\5\34\u03a3\n\34\3\34\7\34\u03a6"+
		"\n\34\f\34\16\34\u03a9\13\34\3\34\3\34\7\34\u03ad\n\34\f\34\16\34\u03b0"+
		"\13\34\3\34\3\34\5\34\u03b4\n\34\5\34\u03b6\n\34\3\35\5\35\u03b9\n\35"+
		"\3\35\3\35\5\35\u03bd\n\35\3\35\3\35\3\35\5\35\u03c2\n\35\7\35\u03c4\n"+
		"\35\f\35\16\35\u03c7\13\35\3\36\3\36\3\36\3\37\7\37\u03cd\n\37\f\37\16"+
		"\37\u03d0\13\37\3\37\5\37\u03d3\n\37\3\37\6\37\u03d6\n\37\r\37\16\37\u03d7"+
		"\3 \3 \5 \u03dc\n \3 \3 \3 \5 \u03e1\n \7 \u03e3\n \f \16 \u03e6\13 \3"+
		"!\6!\u03e9\n!\r!\16!\u03ea\3!\2\2\"\2\4\6\b\n\f\16\20\22\24\26\30\32\34"+
		"\36 \"$&(*,.\60\62\64\668:<>@\2\4\3\2+/\3\2 (\2\u0476\2P\3\2\2\2\4t\3"+
		"\2\2\2\6\u0082\3\2\2\2\b\u0084\3\2\2\2\n\u00d8\3\2\2\2\f\u0148\3\2\2\2"+
		"\16\u014d\3\2\2\2\20\u0177\3\2\2\2\22\u01a0\3\2\2\2\24\u01ca\3\2\2\2\26"+
		"\u01e6\3\2\2\2\30\u021a\3\2\2\2\32\u023d\3\2\2\2\34\u0242\3\2\2\2\36\u0260"+
		"\3\2\2\2 \u027e\3\2\2\2\"\u02b6\3\2\2\2$\u02c6\3\2\2\2&\u02cb\3\2\2\2"+
		"(\u02e7\3\2\2\2*\u0316\3\2\2\2,\u0332\3\2\2\2.\u035f\3\2\2\2\60\u0378"+
		"\3\2\2\2\62\u0380\3\2\2\2\64\u0382\3\2\2\2\66\u03b5\3\2\2\28\u03b8\3\2"+
		"\2\2:\u03c8\3\2\2\2<\u03d2\3\2\2\2>\u03db\3\2\2\2@\u03e8\3\2\2\2BD\7\3"+
		"\2\2CB\3\2\2\2DG\3\2\2\2EC\3\2\2\2EF\3\2\2\2FH\3\2\2\2GE\3\2\2\2HJ\5\6"+
		"\4\2IK\7\3\2\2JI\3\2\2\2KL\3\2\2\2LJ\3\2\2\2LM\3\2\2\2MO\3\2\2\2NE\3\2"+
		"\2\2OR\3\2\2\2PN\3\2\2\2PQ\3\2\2\2QS\3\2\2\2RP\3\2\2\2Sb\5 \21\2TV\7\3"+
		"\2\2UT\3\2\2\2VW\3\2\2\2WU\3\2\2\2WX\3\2\2\2XY\3\2\2\2Y]\5\4\3\2Z\\\7"+
		"\3\2\2[Z\3\2\2\2\\_\3\2\2\2][\3\2\2\2]^\3\2\2\2^a\3\2\2\2_]\3\2\2\2`U"+
		"\3\2\2\2ad\3\2\2\2b`\3\2\2\2bc\3\2\2\2ce\3\2\2\2db\3\2\2\2ef\7\2\2\3f"+
		"\3\3\2\2\2gu\5\f\7\2hu\5\32\16\2iu\5\"\22\2ju\5$\23\2ku\5\26\f\2lu\5\b"+
		"\5\2mu\5\n\6\2np\7)\2\2on\3\2\2\2ps\3\2\2\2qo\3\2\2\2qr\3\2\2\2ru\3\2"+
		"\2\2sq\3\2\2\2tg\3\2\2\2th\3\2\2\2ti\3\2\2\2tj\3\2\2\2tk\3\2\2\2tl\3\2"+
		"\2\2tm\3\2\2\2tq\3\2\2\2u\5\3\2\2\2v\u0083\5\f\7\2w\u0083\5\32\16\2x\u0083"+
		"\5$\23\2y\u0083\5\26\f\2z\u0083\5\b\5\2{\u0083\5\n\6\2|~\7)\2\2}|\3\2"+
		"\2\2~\u0081\3\2\2\2\177}\3\2\2\2\177\u0080\3\2\2\2\u0080\u0083\3\2\2\2"+
		"\u0081\177\3\2\2\2\u0082v\3\2\2\2\u0082w\3\2\2\2\u0082x\3\2\2\2\u0082"+
		"y\3\2\2\2\u0082z\3\2\2\2\u0082{\3\2\2\2\u0082\177\3\2\2\2\u0083\7\3\2"+
		"\2\2\u0084\u0086\7\4\2\2\u0085\u0087\7)\2\2\u0086\u0085\3\2\2\2\u0087"+
		"\u0088\3\2\2\2\u0088\u0086\3\2\2\2\u0088\u0089\3\2\2\2\u0089\u008a\3\2"+
		"\2\2\u008a\u008c\78\2\2\u008b\u008d\7)\2\2\u008c\u008b\3\2\2\2\u008d\u008e"+
		"\3\2\2\2\u008e\u008c\3\2\2\2\u008e\u008f\3\2\2\2\u008f\u0090\3\2\2\2\u0090"+
		"\u0092\7\5\2\2\u0091\u0093\7)\2\2\u0092\u0091\3\2\2\2\u0093\u0094\3\2"+
		"\2\2\u0094\u0092\3\2\2\2\u0094\u0095\3\2\2\2\u0095\u0098\3\2\2\2\u0096"+
		"\u0099\5@!\2\u0097\u0099\78\2\2\u0098\u0096\3\2\2\2\u0098\u0097\3\2\2"+
		"\2\u0099\u009b\3\2\2\2\u009a\u009c\7)\2\2\u009b\u009a\3\2\2\2\u009c\u009d"+
		"\3\2\2\2\u009d\u009b\3\2\2\2\u009d\u009e\3\2\2\2\u009e\u009f\3\2\2\2\u009f"+
		"\u00a1\7\6\2\2\u00a0\u00a2\7)\2\2\u00a1\u00a0\3\2\2\2\u00a2\u00a3\3\2"+
		"\2\2\u00a3\u00a1\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\u00a7\3\2\2\2\u00a5"+
		"\u00a8\5@!\2\u00a6\u00a8\78\2\2\u00a7\u00a5\3\2\2\2\u00a7\u00a6\3\2\2"+
		"\2\u00a8\u00aa\3\2\2\2\u00a9\u00ab\7)\2\2\u00aa\u00a9\3\2\2\2\u00ab\u00ac"+
		"\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae"+
		"\u00b0\7\7\2\2\u00af\u00b1\7)\2\2\u00b0\u00af\3\2\2\2\u00b1\u00b2\3\2"+
		"\2\2\u00b2\u00b0\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3\u00b6\3\2\2\2\u00b4"+
		"\u00b7\5@!\2\u00b5\u00b7\78\2\2\u00b6\u00b4\3\2\2\2\u00b6\u00b5\3\2\2"+
		"\2\u00b7\u00b9\3\2\2\2\u00b8\u00ba\7)\2\2\u00b9\u00b8\3\2\2\2\u00ba\u00bb"+
		"\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd"+
		"\u00be\7\b\2\2\u00be\u00ca\7\3\2\2\u00bf\u00c1\7)\2\2\u00c0\u00bf\3\2"+
		"\2\2\u00c1\u00c4\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3"+
		"\u00c5\3\2\2\2\u00c4\u00c2\3\2\2\2\u00c5\u00c6\5\4\3\2\u00c6\u00c7\7\3"+
		"\2\2\u00c7\u00c9\3\2\2\2\u00c8\u00c2\3\2\2\2\u00c9\u00cc\3\2\2\2\u00ca"+
		"\u00c8\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb\u00d0\3\2\2\2\u00cc\u00ca\3\2"+
		"\2\2\u00cd\u00cf\7)\2\2\u00ce\u00cd\3\2\2\2\u00cf\u00d2\3\2\2\2\u00d0"+
		"\u00ce\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1\u00d3\3\2\2\2\u00d2\u00d0\3\2"+
		"\2\2\u00d3\u00d4\7\t\2\2\u00d4\t\3\2\2\2\u00d5\u00d7\7)\2\2\u00d6\u00d5"+
		"\3\2\2\2\u00d7\u00da\3\2\2\2\u00d8\u00d6\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9"+
		"\u00db\3\2\2\2\u00da\u00d8\3\2\2\2\u00db\u00dd\7\n\2\2\u00dc\u00de\7)"+
		"\2\2\u00dd\u00dc\3\2\2\2\u00de\u00df\3\2\2\2\u00df\u00dd\3\2\2\2\u00df"+
		"\u00e0\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1\u00e3\5\66\34\2\u00e2\u00e4\7"+
		")\2\2\u00e3\u00e2\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e5"+
		"\u00e6\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7\u00e8\7\b\2\2\u00e8\u00ec\7\3"+
		"\2\2\u00e9\u00eb\7)\2\2\u00ea\u00e9\3\2\2\2\u00eb\u00ee\3\2\2\2\u00ec"+
		"\u00ea\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed\u00fa\3\2\2\2\u00ee\u00ec\3\2"+
		"\2\2\u00ef\u00f1\7)\2\2\u00f0\u00ef\3\2\2\2\u00f1\u00f4\3\2\2\2\u00f2"+
		"\u00f0\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3\u00f5\3\2\2\2\u00f4\u00f2\3\2"+
		"\2\2\u00f5\u00f6\5\4\3\2\u00f6\u00f7\7\3\2\2\u00f7\u00f9\3\2\2\2\u00f8"+
		"\u00f2\3\2\2\2\u00f9\u00fc\3\2\2\2\u00fa\u00f8\3\2\2\2\u00fa\u00fb\3\2"+
		"\2\2\u00fb\u0127\3\2\2\2\u00fc\u00fa\3\2\2\2\u00fd\u00ff\7\13\2\2\u00fe"+
		"\u0100\7)\2\2\u00ff\u00fe\3\2\2\2\u0100\u0101\3\2\2\2\u0101\u00ff\3\2"+
		"\2\2\u0101\u0102\3\2\2\2\u0102\u0103\3\2\2\2\u0103\u0105\7\n\2\2\u0104"+
		"\u0106\7)\2\2\u0105\u0104\3\2\2\2\u0106\u0107\3\2\2\2\u0107\u0105\3\2"+
		"\2\2\u0107\u0108\3\2\2\2\u0108\u0109\3\2\2\2\u0109\u010b\5\66\34\2\u010a"+
		"\u010c\7)\2\2\u010b\u010a\3\2\2\2\u010c\u010d\3\2\2\2\u010d\u010b\3\2"+
		"\2\2\u010d\u010e\3\2\2\2\u010e\u010f\3\2\2\2\u010f\u0110\7\b\2\2\u0110"+
		"\u0114\7\3\2\2\u0111\u0113\7)\2\2\u0112\u0111\3\2\2\2\u0113\u0116\3\2"+
		"\2\2\u0114\u0112\3\2\2\2\u0114\u0115\3\2\2\2\u0115\u0122\3\2\2\2\u0116"+
		"\u0114\3\2\2\2\u0117\u0119\7)\2\2\u0118\u0117\3\2\2\2\u0119\u011c\3\2"+
		"\2\2\u011a\u0118\3\2\2\2\u011a\u011b\3\2\2\2\u011b\u011d\3\2\2\2\u011c"+
		"\u011a\3\2\2\2\u011d\u011e\5\4\3\2\u011e\u011f\7\3\2\2\u011f\u0121\3\2"+
		"\2\2\u0120\u011a\3\2\2\2\u0121\u0124\3\2\2\2\u0122\u0120\3\2\2\2\u0122"+
		"\u0123\3\2\2\2\u0123\u0126\3\2\2\2\u0124\u0122\3\2\2\2\u0125\u00fd\3\2"+
		"\2\2\u0126\u0129\3\2\2\2\u0127\u0125\3\2\2\2\u0127\u0128\3\2\2\2\u0128"+
		"\u013a\3\2\2\2\u0129\u0127\3\2\2\2\u012a\u012b\7\f\2\2\u012b\u0137\7\3"+
		"\2\2\u012c\u012e\7)\2\2\u012d\u012c\3\2\2\2\u012e\u0131\3\2\2\2\u012f"+
		"\u012d\3\2\2\2\u012f\u0130\3\2\2\2\u0130\u0132\3\2\2\2\u0131\u012f\3\2"+
		"\2\2\u0132\u0133\5\4\3\2\u0133\u0134\7\3\2\2\u0134\u0136\3\2\2\2\u0135"+
		"\u012f\3\2\2\2\u0136\u0139\3\2\2\2\u0137\u0135\3\2\2\2\u0137\u0138\3\2"+
		"\2\2\u0138\u013b\3\2\2\2\u0139\u0137\3\2\2\2\u013a\u012a\3\2\2\2\u013a"+
		"\u013b\3\2\2\2\u013b\u013f\3\2\2\2\u013c\u013e\7)\2\2\u013d\u013c\3\2"+
		"\2\2\u013e\u0141\3\2\2\2\u013f\u013d\3\2\2\2\u013f\u0140\3\2\2\2\u0140"+
		"\u0142\3\2\2\2\u0141\u013f\3\2\2\2\u0142\u0143\7\t\2\2\u0143\13\3\2\2"+
		"\2\u0144\u0149\5\16\b\2\u0145\u0149\5\20\t\2\u0146\u0149\5\22\n\2\u0147"+
		"\u0149\5\24\13\2\u0148\u0144\3\2\2\2\u0148\u0145\3\2\2\2\u0148\u0146\3"+
		"\2\2\2\u0148\u0147\3\2\2\2\u0149\r\3\2\2\2\u014a\u014c\7)\2\2\u014b\u014a"+
		"\3\2\2\2\u014c\u014f\3\2\2\2\u014d\u014b\3\2\2\2\u014d\u014e\3\2\2\2\u014e"+
		"\u0150\3\2\2\2\u014f\u014d\3\2\2\2\u0150\u0152\7\r\2\2\u0151\u0153\7)"+
		"\2\2\u0152\u0151\3\2\2\2\u0153\u0154\3\2\2\2\u0154\u0152\3\2\2\2\u0154"+
		"\u0155\3\2\2\2\u0155\u0156\3\2\2\2\u0156\u015a\78\2\2\u0157\u0159\7)\2"+
		"\2\u0158\u0157\3\2\2\2\u0159\u015c\3\2\2\2\u015a\u0158\3\2\2\2\u015a\u015b"+
		"\3\2\2\2\u015b\u015d\3\2\2\2\u015c\u015a\3\2\2\2\u015d\u0161\7\16\2\2"+
		"\u015e\u0160\7)\2\2\u015f\u015e\3\2\2\2\u0160\u0163\3\2\2\2\u0161\u015f"+
		"\3\2\2\2\u0161\u0162\3\2\2\2\u0162\u0164\3\2\2\2\u0163\u0161\3\2\2\2\u0164"+
		"\u0168\5> \2\u0165\u0167\7)\2\2\u0166\u0165\3\2\2\2\u0167\u016a\3\2\2"+
		"\2\u0168\u0166\3\2\2\2\u0168\u0169\3\2\2\2\u0169\u016b\3\2\2\2\u016a\u0168"+
		"\3\2\2\2\u016b\u016f\7\17\2\2\u016c\u016e\7)\2\2\u016d\u016c\3\2\2\2\u016e"+
		"\u0171\3\2\2\2\u016f\u016d\3\2\2\2\u016f\u0170\3\2\2\2\u0170\u0172\3\2"+
		"\2\2\u0171\u016f\3\2\2\2\u0172\u0173\5> \2\u0173\17\3\2\2\2\u0174\u0176"+
		"\7)\2\2\u0175\u0174\3\2\2\2\u0176\u0179\3\2\2\2\u0177\u0175\3\2\2\2\u0177"+
		"\u0178\3\2\2\2\u0178\u017a\3\2\2\2\u0179\u0177\3\2\2\2\u017a\u017c\7\20"+
		"\2\2\u017b\u017d\7)\2\2\u017c\u017b\3\2\2\2\u017d\u017e\3\2\2\2\u017e"+
		"\u017c\3\2\2\2\u017e\u017f\3\2\2\2\u017f\u0180\3\2\2\2\u0180\u0184\78"+
		"\2\2\u0181\u0183\7)\2\2\u0182\u0181\3\2\2\2\u0183\u0186\3\2\2\2\u0184"+
		"\u0182\3\2\2\2\u0184\u0185\3\2\2\2\u0185\u0187\3\2\2\2\u0186\u0184\3\2"+
		"\2\2\u0187\u018b\7\16\2\2\u0188\u018a\7)\2\2\u0189\u0188\3\2\2\2\u018a"+
		"\u018d\3\2\2\2\u018b\u0189\3\2\2\2\u018b\u018c\3\2\2\2\u018c\u018e\3\2"+
		"\2\2\u018d\u018b\3\2\2\2\u018e\u0192\78\2\2\u018f\u0191\7)\2\2\u0190\u018f"+
		"\3\2\2\2\u0191\u0194\3\2\2\2\u0192\u0190\3\2\2\2\u0192\u0193\3\2\2\2\u0193"+
		"\u0195\3\2\2\2\u0194\u0192\3\2\2\2\u0195\u0197\7\17\2\2\u0196\u0198\7"+
		")\2\2\u0197\u0196\3\2\2\2\u0198\u0199\3\2\2\2\u0199\u0197\3\2\2\2\u0199"+
		"\u019a\3\2\2\2\u019a\u019b\3\2\2\2\u019b\u019c\78\2\2\u019c\21\3\2\2\2"+
		"\u019d\u019f\7)\2\2\u019e\u019d\3\2\2\2\u019f\u01a2\3\2\2\2\u01a0\u019e"+
		"\3\2\2\2\u01a0\u01a1\3\2\2\2\u01a1\u01a3\3\2\2\2\u01a2\u01a0\3\2\2\2\u01a3"+
		"\u01a5\7\21\2\2\u01a4\u01a6\7)\2\2\u01a5\u01a4\3\2\2\2\u01a6\u01a7\3\2"+
		"\2\2\u01a7\u01a5\3\2\2\2\u01a7\u01a8\3\2\2\2\u01a8\u01a9\3\2\2\2\u01a9"+
		"\u01ad\78\2\2\u01aa\u01ac\7)\2\2\u01ab\u01aa\3\2\2\2\u01ac\u01af\3\2\2"+
		"\2\u01ad\u01ab\3\2\2\2\u01ad\u01ae\3\2\2\2\u01ae\u01b0\3\2\2\2\u01af\u01ad"+
		"\3\2\2\2\u01b0\u01b4\7\16\2\2\u01b1\u01b3\7)\2\2\u01b2\u01b1\3\2\2\2\u01b3"+
		"\u01b6\3\2\2\2\u01b4\u01b2\3\2\2\2\u01b4\u01b5\3\2\2\2\u01b5\u01b7\3\2"+
		"\2\2\u01b6\u01b4\3\2\2\2\u01b7\u01bb\78\2\2\u01b8\u01ba\7)\2\2\u01b9\u01b8"+
		"\3\2\2\2\u01ba\u01bd\3\2\2\2\u01bb\u01b9\3\2\2\2\u01bb\u01bc\3\2\2\2\u01bc"+
		"\u01be\3\2\2\2\u01bd\u01bb\3\2\2\2\u01be\u01c2\7\17\2\2\u01bf\u01c1\7"+
		")\2\2\u01c0\u01bf\3\2\2\2\u01c1\u01c4\3\2\2\2\u01c2\u01c0\3\2\2\2\u01c2"+
		"\u01c3\3\2\2\2\u01c3\u01c5\3\2\2\2\u01c4\u01c2\3\2\2\2\u01c5\u01c6\5>"+
		" \2\u01c6\23\3\2\2\2\u01c7\u01c9\7)\2\2\u01c8\u01c7\3\2\2\2\u01c9\u01cc"+
		"\3\2\2\2\u01ca\u01c8\3\2\2\2\u01ca\u01cb\3\2\2\2\u01cb\u01cd\3\2\2\2\u01cc"+
		"\u01ca\3\2\2\2\u01cd\u01cf\7\22\2\2\u01ce\u01d0\7)\2\2\u01cf\u01ce\3\2"+
		"\2\2\u01d0\u01d1\3\2\2\2\u01d1\u01cf\3\2\2\2\u01d1\u01d2\3\2\2\2\u01d2"+
		"\u01d3\3\2\2\2\u01d3\u01d7\78\2\2\u01d4\u01d6\7)\2\2\u01d5\u01d4\3\2\2"+
		"\2\u01d6\u01d9\3\2\2\2\u01d7\u01d5\3\2\2\2\u01d7\u01d8\3\2\2\2\u01d8\u01da"+
		"\3\2\2\2\u01d9\u01d7\3\2\2\2\u01da\u01de\7\16\2\2\u01db\u01dd\7)\2\2\u01dc"+
		"\u01db\3\2\2\2\u01dd\u01e0\3\2\2\2\u01de\u01dc\3\2\2\2\u01de\u01df\3\2"+
		"\2\2\u01df\u01e1\3\2\2\2\u01e0\u01de\3\2\2\2\u01e1\u01e2\78\2\2\u01e2"+
		"\25\3\2\2\2\u01e3\u01e5\7)\2\2\u01e4\u01e3\3\2\2\2\u01e5\u01e8\3\2\2\2"+
		"\u01e6\u01e4\3\2\2\2\u01e6\u01e7\3\2\2\2\u01e7\u01e9\3\2\2\2\u01e8\u01e6"+
		"\3\2\2\2\u01e9\u01eb\7\23\2\2\u01ea\u01ec\7)\2\2\u01eb\u01ea\3\2\2\2\u01ec"+
		"\u01ed\3\2\2\2\u01ed\u01eb\3\2\2\2\u01ed\u01ee\3\2\2\2\u01ee\u01ef\3\2"+
		"\2\2\u01ef\u01f3\78\2\2\u01f0\u01f2\7)\2\2\u01f1\u01f0\3\2\2\2\u01f2\u01f5"+
		"\3\2\2\2\u01f3\u01f1\3\2\2\2\u01f3\u01f4\3\2\2\2\u01f4\u01f6\3\2\2\2\u01f5"+
		"\u01f3\3\2\2\2\u01f6\u01fa\7\16\2\2\u01f7\u01f9\7)\2\2\u01f8\u01f7\3\2"+
		"\2\2\u01f9\u01fc\3\2\2\2\u01fa\u01f8\3\2\2\2\u01fa\u01fb\3\2\2\2\u01fb"+
		"\u01fd\3\2\2\2\u01fc\u01fa\3\2\2\2\u01fd\u0201\78\2\2\u01fe\u0200\7)\2"+
		"\2\u01ff\u01fe\3\2\2\2\u0200\u0203\3\2\2\2\u0201\u01ff\3\2\2\2\u0201\u0202"+
		"\3\2\2\2\u0202\u0214\3\2\2\2\u0203\u0201\3\2\2\2\u0204\u0208\7\17\2\2"+
		"\u0205\u0207\7)\2\2\u0206\u0205\3\2\2\2\u0207\u020a\3\2\2\2\u0208\u0206"+
		"\3\2\2\2\u0208\u0209\3\2\2\2\u0209\u020b\3\2\2\2\u020a\u0208\3\2\2\2\u020b"+
		"\u020f\78\2\2\u020c\u020e\7)\2\2\u020d\u020c\3\2\2\2\u020e\u0211\3\2\2"+
		"\2\u020f\u020d\3\2\2\2\u020f\u0210\3\2\2\2\u0210\u0213\3\2\2\2\u0211\u020f"+
		"\3\2\2\2\u0212\u0204\3\2\2\2\u0213\u0216\3\2\2\2\u0214\u0212\3\2\2\2\u0214"+
		"\u0215\3\2\2\2\u0215\27\3\2\2\2\u0216\u0214\3\2\2\2\u0217\u0219\7)\2\2"+
		"\u0218\u0217\3\2\2\2\u0219\u021c\3\2\2\2\u021a\u0218\3\2\2\2\u021a\u021b"+
		"\3\2\2\2\u021b\u021d\3\2\2\2\u021c\u021a\3\2\2\2\u021d\u0221\78\2\2\u021e"+
		"\u0220\7)\2\2\u021f\u021e\3\2\2\2\u0220\u0223\3\2\2\2\u0221\u021f\3\2"+
		"\2\2\u0221\u0222\3\2\2\2\u0222\u0224\3\2\2\2\u0223\u0221\3\2\2\2\u0224"+
		"\u0228\7\24\2\2\u0225\u0227\7)\2\2\u0226\u0225\3\2\2\2\u0227\u022a\3\2"+
		"\2\2\u0228\u0226\3\2\2\2\u0228\u0229\3\2\2\2\u0229\u022d\3\2\2\2\u022a"+
		"\u0228\3\2\2\2\u022b\u022e\5@!\2\u022c\u022e\78\2\2\u022d\u022b\3\2\2"+
		"\2\u022d\u022c\3\2\2\2\u022e\u0232\3\2\2\2\u022f\u0231\7)\2\2\u0230\u022f"+
		"\3\2\2\2\u0231\u0234\3\2\2\2\u0232\u0230\3\2\2\2\u0232\u0233\3\2\2\2\u0233"+
		"\u0235\3\2\2\2\u0234\u0232\3\2\2\2\u0235\u0237\7\25\2\2\u0236\u0238\7"+
		")\2\2\u0237\u0236\3\2\2\2\u0238\u0239\3\2\2\2\u0239\u0237\3\2\2\2\u0239"+
		"\u023a\3\2\2\2\u023a\31\3\2\2\2\u023b\u023e\5\34\17\2\u023c\u023e\5\36"+
		"\20\2\u023d\u023b\3\2\2\2\u023d\u023c\3\2\2\2\u023e\33\3\2\2\2\u023f\u0241"+
		"\7)\2\2\u0240\u023f\3\2\2\2\u0241\u0244\3\2\2\2\u0242\u0240\3\2\2\2\u0242"+
		"\u0243\3\2\2\2\u0243\u0245\3\2\2\2\u0244\u0242\3\2\2\2\u0245\u0247\7\26"+
		"\2\2\u0246\u0248\7)\2\2\u0247\u0246\3\2\2\2\u0248\u0249\3\2\2\2\u0249"+
		"\u0247\3\2\2\2\u0249\u024a\3\2\2\2\u024a\u024b\3\2\2\2\u024b\u024f\78"+
		"\2\2\u024c\u024e\7)\2\2\u024d\u024c\3\2\2\2\u024e\u0251\3\2\2\2\u024f"+
		"\u024d\3\2\2\2\u024f\u0250\3\2\2\2\u0250\u0252\3\2\2\2\u0251\u024f\3\2"+
		"\2\2\u0252\u0256\7\16\2\2\u0253\u0255\7)\2\2\u0254\u0253\3\2\2\2\u0255"+
		"\u0258\3\2\2\2\u0256\u0254\3\2\2\2\u0256\u0257\3\2\2\2\u0257\u025b\3\2"+
		"\2\2\u0258\u0256\3\2\2\2\u0259\u025c\58\35\2\u025a\u025c\78\2\2\u025b"+
		"\u0259\3\2\2\2\u025b\u025a\3\2\2\2\u025c\35\3\2\2\2\u025d\u025f\7)\2\2"+
		"\u025e\u025d\3\2\2\2\u025f\u0262\3\2\2\2\u0260\u025e\3\2\2\2\u0260\u0261"+
		"\3\2\2\2\u0261\u0263\3\2\2\2\u0262\u0260\3\2\2\2\u0263\u0265\7\27\2\2"+
		"\u0264\u0266\7)\2\2\u0265\u0264\3\2\2\2\u0266\u0267\3\2\2\2\u0267\u0265"+
		"\3\2\2\2\u0267\u0268\3\2\2\2\u0268\u0269\3\2\2\2\u0269\u026d\78\2\2\u026a"+
		"\u026c\7)\2\2\u026b\u026a\3\2\2\2\u026c\u026f\3\2\2\2\u026d\u026b\3\2"+
		"\2\2\u026d\u026e\3\2\2\2\u026e\u0270\3\2\2\2\u026f\u026d\3\2\2\2\u0270"+
		"\u0274\7\16\2\2\u0271\u0273\7)\2\2\u0272\u0271\3\2\2\2\u0273\u0276\3\2"+
		"\2\2\u0274\u0272\3\2\2\2\u0274\u0275\3\2\2\2\u0275\u0279\3\2\2\2\u0276"+
		"\u0274\3\2\2\2\u0277\u027a\5@!\2\u0278\u027a\78\2\2\u0279\u0277\3\2\2"+
		"\2\u0279\u0278\3\2\2\2\u027a\37\3\2\2\2\u027b\u027d\7)\2\2\u027c\u027b"+
		"\3\2\2\2\u027d\u0280\3\2\2\2\u027e\u027c\3\2\2\2\u027e\u027f\3\2\2\2\u027f"+
		"\u0281\3\2\2\2\u0280\u027e\3\2\2\2\u0281\u0285\7\30\2\2\u0282\u0284\7"+
		")\2\2\u0283\u0282\3\2\2\2\u0284\u0287\3\2\2\2\u0285\u0283\3\2\2\2\u0285"+
		"\u0286\3\2\2\2\u0286\u0288\3\2\2\2\u0287\u0285\3\2\2\2\u0288\u028c\7\16"+
		"\2\2\u0289\u028b\7)\2\2\u028a\u0289\3\2\2\2\u028b\u028e\3\2\2\2\u028c"+
		"\u028a\3\2\2\2\u028c\u028d\3\2\2\2\u028d\u0291\3\2\2\2\u028e\u028c\3\2"+
		"\2\2\u028f\u0292\58\35\2\u0290\u0292\78\2\2\u0291\u028f\3\2\2\2\u0291"+
		"\u0290\3\2\2\2\u0292\u0296\3\2\2\2\u0293\u0295\7)\2\2\u0294\u0293\3\2"+
		"\2\2\u0295\u0298\3\2\2\2\u0296\u0294\3\2\2\2\u0296\u0297\3\2\2\2\u0297"+
		"\u0299\3\2\2\2\u0298\u0296\3\2\2\2\u0299\u029d\7\17\2\2\u029a\u029c\7"+
		")\2\2\u029b\u029a\3\2\2\2\u029c\u029f\3\2\2\2\u029d\u029b\3\2\2\2\u029d"+
		"\u029e\3\2\2\2\u029e\u02a2\3\2\2\2\u029f\u029d\3\2\2\2\u02a0\u02a3\58"+
		"\35\2\u02a1\u02a3\78\2\2\u02a2\u02a0\3\2\2\2\u02a2\u02a1\3\2\2\2\u02a3"+
		"\u02a7\3\2\2\2\u02a4\u02a6\7)\2\2\u02a5\u02a4\3\2\2\2\u02a6\u02a9\3\2"+
		"\2\2\u02a7\u02a5\3\2\2\2\u02a7\u02a8\3\2\2\2\u02a8\u02aa\3\2\2\2\u02a9"+
		"\u02a7\3\2\2\2\u02aa\u02ae\7\17\2\2\u02ab\u02ad\7)\2\2\u02ac\u02ab\3\2"+
		"\2\2\u02ad\u02b0\3\2\2\2\u02ae\u02ac\3\2\2\2\u02ae\u02af\3\2\2\2\u02af"+
		"\u02b1\3\2\2\2\u02b0\u02ae\3\2\2\2\u02b1\u02b2\5:\36\2\u02b2!\3\2\2\2"+
		"\u02b3\u02b5\7)\2\2\u02b4\u02b3\3\2\2\2\u02b5\u02b8\3\2\2\2\u02b6\u02b4"+
		"\3\2\2\2\u02b6\u02b7\3\2\2\2\u02b7\u02b9\3\2\2\2\u02b8\u02b6\3\2\2\2\u02b9"+
		"\u02bb\7\31\2\2\u02ba\u02bc\7)\2\2\u02bb\u02ba\3\2\2\2\u02bc\u02bd\3\2"+
		"\2\2\u02bd\u02bb\3\2\2\2\u02bd\u02be\3\2\2\2\u02be\u02bf\3\2\2\2\u02bf"+
		"\u02c0\78\2\2\u02c0#\3\2\2\2\u02c1\u02c7\5&\24\2\u02c2\u02c7\5(\25\2\u02c3"+
		"\u02c7\5*\26\2\u02c4\u02c7\5,\27\2\u02c5\u02c7\5.\30\2\u02c6\u02c1\3\2"+
		"\2\2\u02c6\u02c2\3\2\2\2\u02c6\u02c3\3\2\2\2\u02c6\u02c4\3\2\2\2\u02c6"+
		"\u02c5\3\2\2\2\u02c7%\3\2\2\2\u02c8\u02ca\7)\2\2\u02c9\u02c8\3\2\2\2\u02ca"+
		"\u02cd\3\2\2\2\u02cb\u02c9\3\2\2\2\u02cb\u02cc\3\2\2\2\u02cc\u02ce\3\2"+
		"\2\2\u02cd\u02cb\3\2\2\2\u02ce\u02d0\7\32\2\2\u02cf\u02d1\7)\2\2\u02d0"+
		"\u02cf\3\2\2\2\u02d1\u02d2\3\2\2\2\u02d2\u02d0\3\2\2\2\u02d2\u02d3\3\2"+
		"\2\2\u02d3\u02d4\3\2\2\2\u02d4\u02d8\78\2\2\u02d5\u02d7\7)\2\2\u02d6\u02d5"+
		"\3\2\2\2\u02d7\u02da\3\2\2\2\u02d8\u02d6\3\2\2\2\u02d8\u02d9\3\2\2\2\u02d9"+
		"\u02db\3\2\2\2\u02da\u02d8\3\2\2\2\u02db\u02df\7\16\2\2\u02dc\u02de\7"+
		")\2\2\u02dd\u02dc\3\2\2\2\u02de\u02e1\3\2\2\2\u02df\u02dd\3\2\2\2\u02df"+
		"\u02e0\3\2\2\2\u02e0\u02e2\3\2\2\2\u02e1\u02df\3\2\2\2\u02e2\u02e3\5:"+
		"\36\2\u02e3\'\3\2\2\2\u02e4\u02e6\7)\2\2\u02e5\u02e4\3\2\2\2\u02e6\u02e9"+
		"\3\2\2\2\u02e7\u02e5\3\2\2\2\u02e7\u02e8\3\2\2\2\u02e8\u02ea\3\2\2\2\u02e9"+
		"\u02e7\3\2\2\2\u02ea\u02ec\7\33\2\2\u02eb\u02ed\7)\2\2\u02ec\u02eb\3\2"+
		"\2\2\u02ed\u02ee\3\2\2\2\u02ee\u02ec\3\2\2\2\u02ee\u02ef\3\2\2\2\u02ef"+
		"\u02f0\3\2\2\2\u02f0\u02f4\78\2\2\u02f1\u02f3\7)\2\2\u02f2\u02f1\3\2\2"+
		"\2\u02f3\u02f6\3\2\2\2\u02f4\u02f2\3\2\2\2\u02f4\u02f5\3\2\2\2\u02f5\u02f7"+
		"\3\2\2\2\u02f6\u02f4\3\2\2\2\u02f7\u02fb\7\16\2\2\u02f8\u02fa\7)\2\2\u02f9"+
		"\u02f8\3\2\2\2\u02fa\u02fd\3\2\2\2\u02fb\u02f9\3\2\2\2\u02fb\u02fc\3\2"+
		"\2\2\u02fc\u0300\3\2\2\2\u02fd\u02fb\3\2\2\2\u02fe\u0301\58\35\2\u02ff"+
		"\u0301\78\2\2\u0300\u02fe\3\2\2\2\u0300\u02ff\3\2\2\2\u0301\u0305\3\2"+
		"\2\2\u0302\u0304\7)\2\2\u0303\u0302\3\2\2\2\u0304\u0307\3\2\2\2\u0305"+
		"\u0303\3\2\2\2\u0305\u0306\3\2\2\2\u0306\u0308\3\2\2\2\u0307\u0305\3\2"+
		"\2\2\u0308\u030c\7\17\2\2\u0309\u030b\7)\2\2\u030a\u0309\3\2\2\2\u030b"+
		"\u030e\3\2\2\2\u030c\u030a\3\2\2\2\u030c\u030d\3\2\2\2\u030d\u0311\3\2"+
		"\2\2\u030e\u030c\3\2\2\2\u030f\u0312\58\35\2\u0310\u0312\78\2\2\u0311"+
		"\u030f\3\2\2\2\u0311\u0310\3\2\2\2\u0312)\3\2\2\2\u0313\u0315\7)\2\2\u0314"+
		"\u0313\3\2\2\2\u0315\u0318\3\2\2\2\u0316\u0314\3\2\2\2\u0316\u0317\3\2"+
		"\2\2\u0317\u0319\3\2\2\2\u0318\u0316\3\2\2\2\u0319\u031b\7\34\2\2\u031a"+
		"\u031c\7)\2\2\u031b\u031a\3\2\2\2\u031c\u031d\3\2\2\2\u031d\u031b\3\2"+
		"\2\2\u031d\u031e\3\2\2\2\u031e\u031f\3\2\2\2\u031f\u0323\78\2\2\u0320"+
		"\u0322\7)\2\2\u0321\u0320\3\2\2\2\u0322\u0325\3\2\2\2\u0323\u0321\3\2"+
		"\2\2\u0323\u0324\3\2\2\2\u0324\u0326\3\2\2\2\u0325\u0323\3\2\2\2\u0326"+
		"\u032a\7\16\2\2\u0327\u0329\7)\2\2\u0328\u0327\3\2\2\2\u0329\u032c\3\2"+
		"\2\2\u032a\u0328\3\2\2\2\u032a\u032b\3\2\2\2\u032b\u032d\3\2\2\2\u032c"+
		"\u032a\3\2\2\2\u032d\u032e\78\2\2\u032e+\3\2\2\2\u032f\u0331\7)\2\2\u0330"+
		"\u032f\3\2\2\2\u0331\u0334\3\2\2\2\u0332\u0330\3\2\2\2\u0332\u0333\3\2"+
		"\2\2\u0333\u0335\3\2\2\2\u0334\u0332\3\2\2\2\u0335\u0337\7\35\2\2\u0336"+
		"\u0338\7)\2\2\u0337\u0336\3\2\2\2\u0338\u0339\3\2\2\2\u0339\u0337\3\2"+
		"\2\2\u0339\u033a\3\2\2\2\u033a\u033b\3\2\2\2\u033b\u033f\78\2\2\u033c"+
		"\u033e\7)\2\2\u033d\u033c\3\2\2\2\u033e\u0341\3\2\2\2\u033f\u033d\3\2"+
		"\2\2\u033f\u0340\3\2\2\2\u0340\u0342\3\2\2\2\u0341\u033f\3\2\2\2\u0342"+
		"\u0346\7\16\2\2\u0343\u0345\7)\2\2\u0344\u0343\3\2\2\2\u0345\u0348\3\2"+
		"\2\2\u0346\u0344\3\2\2\2\u0346\u0347\3\2\2\2\u0347\u034b\3\2\2\2\u0348"+
		"\u0346\3\2\2\2\u0349\u034c\58\35\2\u034a\u034c\78\2\2\u034b\u0349\3\2"+
		"\2\2\u034b\u034a\3\2\2\2\u034c\u0350\3\2\2\2\u034d\u034f\7)\2\2\u034e"+
		"\u034d\3\2\2\2\u034f\u0352\3\2\2\2\u0350\u034e\3\2\2\2\u0350\u0351\3\2"+
		"\2\2\u0351\u0353\3\2\2\2\u0352\u0350\3\2\2\2\u0353\u0357\7\17\2\2\u0354"+
		"\u0356\7)\2\2\u0355\u0354\3\2\2\2\u0356\u0359\3\2\2\2\u0357\u0355\3\2"+
		"\2\2\u0357\u0358\3\2\2\2\u0358\u035a\3\2\2\2\u0359\u0357\3\2\2\2\u035a"+
		"\u035b\78\2\2\u035b-\3\2\2\2\u035c\u035e\7)\2\2\u035d\u035c\3\2\2\2\u035e"+
		"\u0361\3\2\2\2\u035f\u035d\3\2\2\2\u035f\u0360\3\2\2\2\u0360\u0362\3\2"+
		"\2\2\u0361\u035f\3\2\2\2\u0362\u0364\7\36\2\2\u0363\u0365\7)\2\2\u0364"+
		"\u0363\3\2\2\2\u0365\u0366\3\2\2\2\u0366\u0364\3\2\2\2\u0366\u0367\3\2"+
		"\2\2\u0367\u0368\3\2\2\2\u0368\u036c\78\2\2\u0369\u036b\7)\2\2\u036a\u0369"+
		"\3\2\2\2\u036b\u036e\3\2\2\2\u036c\u036a\3\2\2\2\u036c\u036d\3\2\2\2\u036d"+
		"\u036f\3\2\2\2\u036e\u036c\3\2\2\2\u036f\u0373\7\16\2\2\u0370\u0372\7"+
		")\2\2\u0371\u0370\3\2\2\2\u0372\u0375\3\2\2\2\u0373\u0371\3\2\2\2\u0373"+
		"\u0374\3\2\2\2\u0374\u0376\3\2\2\2\u0375\u0373\3\2\2\2\u0376\u0377\5>"+
		" \2\u0377/\3\2\2\2\u0378\u0379\t\2\2\2\u0379\61\3\2\2\2\u037a\u0381\7"+
		"\62\2\2\u037b\u0381\7\63\2\2\u037c\u0381\7\64\2\2\u037d\u0381\7\65\2\2"+
		"\u037e\u0381\7\61\2\2\u037f\u0381\5\64\33\2\u0380\u037a\3\2\2\2\u0380"+
		"\u037b\3\2\2\2\u0380\u037c\3\2\2\2\u0380\u037d\3\2\2\2\u0380\u037e\3\2"+
		"\2\2\u0380\u037f\3\2\2\2\u0381\63\3\2\2\2\u0382\u0383\7\60\2\2\u0383\u0384"+
		"\7\61\2\2\u0384\65\3\2\2\2\u0385\u0387\7)\2\2\u0386\u0385\3\2\2\2\u0387"+
		"\u038a\3\2\2\2\u0388\u0386\3\2\2\2\u0388\u0389\3\2\2\2\u0389\u038d\3\2"+
		"\2\2\u038a\u0388\3\2\2\2\u038b\u038e\58\35\2\u038c\u038e\78\2\2\u038d"+
		"\u038b\3\2\2\2\u038d\u038c\3\2\2\2\u038e\u0392\3\2\2\2\u038f\u0391\7)"+
		"\2\2\u0390\u038f\3\2\2\2\u0391\u0394\3\2\2\2\u0392\u0390\3\2\2\2\u0392"+
		"\u0393\3\2\2\2\u0393\u0395\3\2\2\2\u0394\u0392\3\2\2\2\u0395\u0399\5\62"+
		"\32\2\u0396\u0398\7)\2\2\u0397\u0396\3\2\2\2\u0398\u039b\3\2\2\2\u0399"+
		"\u0397\3\2\2\2\u0399\u039a\3\2\2\2\u039a\u039e\3\2\2\2\u039b\u0399\3\2"+
		"\2\2\u039c\u039f\58\35\2\u039d\u039f\78\2\2\u039e\u039c\3\2\2\2\u039e"+
		"\u039d\3\2\2\2\u039f\u03b6\3\2\2\2\u03a0\u03a3\5@!\2\u03a1\u03a3\78\2"+
		"\2\u03a2\u03a0\3\2\2\2\u03a2\u03a1\3\2\2\2\u03a3\u03a7\3\2\2\2\u03a4\u03a6"+
		"\7)\2\2\u03a5\u03a4\3\2\2\2\u03a6\u03a9\3\2\2\2\u03a7\u03a5\3\2\2\2\u03a7"+
		"\u03a8\3\2\2\2\u03a8\u03aa\3\2\2\2\u03a9\u03a7\3\2\2\2\u03aa\u03ae\5\62"+
		"\32\2\u03ab\u03ad\7)\2\2\u03ac\u03ab\3\2\2\2\u03ad\u03b0\3\2\2\2\u03ae"+
		"\u03ac\3\2\2\2\u03ae\u03af\3\2\2\2\u03af\u03b3\3\2\2\2\u03b0\u03ae\3\2"+
		"\2\2\u03b1\u03b4\5@!\2\u03b2\u03b4\78\2\2\u03b3\u03b1\3\2\2\2\u03b3\u03b2"+
		"\3\2\2\2\u03b4\u03b6\3\2\2\2\u03b5\u0388\3\2\2\2\u03b5\u03a2\3\2\2\2\u03b6"+
		"\67\3\2\2\2\u03b7\u03b9\7,\2\2\u03b8\u03b7\3\2\2\2\u03b8\u03b9\3\2\2\2"+
		"\u03b9\u03bc\3\2\2\2\u03ba\u03bd\5<\37\2\u03bb\u03bd\78\2\2\u03bc\u03ba"+
		"\3\2\2\2\u03bc\u03bb\3\2\2\2\u03bd\u03c5\3\2\2\2\u03be\u03c1\5\60\31\2"+
		"\u03bf\u03c2\58\35\2\u03c0\u03c2\78\2\2\u03c1\u03bf\3\2\2\2\u03c1\u03c0"+
		"\3\2\2\2\u03c2\u03c4\3\2\2\2\u03c3\u03be\3\2\2\2\u03c4\u03c7\3\2\2\2\u03c5"+
		"\u03c3\3\2\2\2\u03c5\u03c6\3\2\2\2\u03c69\3\2\2\2\u03c7\u03c5\3\2\2\2"+
		"\u03c8\u03c9\7\37\2\2\u03c9\u03ca\t\3\2\2\u03ca;\3\2\2\2\u03cb\u03cd\7"+
		"\67\2\2\u03cc\u03cb\3\2\2\2\u03cd\u03d0\3\2\2\2\u03ce\u03cc\3\2\2\2\u03ce"+
		"\u03cf\3\2\2\2\u03cf\u03d1\3\2\2\2\u03d0\u03ce\3\2\2\2\u03d1\u03d3\7\66"+
		"\2\2\u03d2\u03ce\3\2\2\2\u03d2\u03d3\3\2\2\2\u03d3\u03d5\3\2\2\2\u03d4"+
		"\u03d6\7\67\2\2\u03d5\u03d4\3\2\2\2\u03d6\u03d7\3\2\2\2\u03d7\u03d5\3"+
		"\2\2\2\u03d7\u03d8\3\2\2\2\u03d8=\3\2\2\2\u03d9\u03dc\5<\37\2\u03da\u03dc"+
		"\78\2\2\u03db\u03d9\3\2\2\2\u03db\u03da\3\2\2\2\u03dc\u03e4\3\2\2\2\u03dd"+
		"\u03e0\5\60\31\2\u03de\u03e1\5<\37\2\u03df\u03e1\78\2\2\u03e0\u03de\3"+
		"\2\2\2\u03e0\u03df\3\2\2\2\u03e1\u03e3\3\2\2\2\u03e2\u03dd\3\2\2\2\u03e3"+
		"\u03e6\3\2\2\2\u03e4\u03e2\3\2\2\2\u03e4\u03e5\3\2\2\2\u03e5?\3\2\2\2"+
		"\u03e6\u03e4\3\2\2\2\u03e7\u03e9\7\67\2\2\u03e8\u03e7\3\2\2\2\u03e9\u03ea"+
		"\3\2\2\2\u03ea\u03e8\3\2\2\2\u03ea\u03eb\3\2\2\2\u03ebA\3\2\2\2\u0098"+
		"ELPW]bqt\177\u0082\u0088\u008e\u0094\u0098\u009d\u00a3\u00a7\u00ac\u00b2"+
		"\u00b6\u00bb\u00c2\u00ca\u00d0\u00d8\u00df\u00e5\u00ec\u00f2\u00fa\u0101"+
		"\u0107\u010d\u0114\u011a\u0122\u0127\u012f\u0137\u013a\u013f\u0148\u014d"+
		"\u0154\u015a\u0161\u0168\u016f\u0177\u017e\u0184\u018b\u0192\u0199\u01a0"+
		"\u01a7\u01ad\u01b4\u01bb\u01c2\u01ca\u01d1\u01d7\u01de\u01e6\u01ed\u01f3"+
		"\u01fa\u0201\u0208\u020f\u0214\u021a\u0221\u0228\u022d\u0232\u0239\u023d"+
		"\u0242\u0249\u024f\u0256\u025b\u0260\u0267\u026d\u0274\u0279\u027e\u0285"+
		"\u028c\u0291\u0296\u029d\u02a2\u02a7\u02ae\u02b6\u02bd\u02c6\u02cb\u02d2"+
		"\u02d8\u02df\u02e7\u02ee\u02f4\u02fb\u0300\u0305\u030c\u0311\u0316\u031d"+
		"\u0323\u032a\u0332\u0339\u033f\u0346\u034b\u0350\u0357\u035f\u0366\u036c"+
		"\u0373\u0380\u0388\u038d\u0392\u0399\u039e\u03a2\u03a7\u03ae\u03b3\u03b5"+
		"\u03b8\u03bc\u03c1\u03c5\u03ce\u03d2\u03d7\u03db\u03e0\u03e4\u03ea";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}