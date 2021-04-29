// Generated from c:\Users\Asus\Desktop\semestr6\TKiK\GraphicalLanguage\Graphly.g4 by ANTLR 4.8
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
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, WS=29, COM_SIGN=30, PLUS=31, MINUS=32, 
		MULTIPLICATION=33, DIVISION=34, MODULO=35, NEG=36, EQ=37, GREATER=38, 
		LOWER=39, GT=40, LT=41, COLOR=42, DOT=43, DIGIT=44, NAME=45;
	public static final int
		RULE_program = 0, RULE_instruction = 1, RULE_loop = 2, RULE_check = 3, 
		RULE_shape = 4, RULE_point = 5, RULE_segment = 6, RULE_circle = 7, RULE_polygon = 8, 
		RULE_group = 9, RULE_groupMember = 10, RULE_type_definition = 11, RULE_num = 12, 
		RULE_iterator = 13, RULE_canvas = 14, RULE_draw = 15, RULE_transformation = 16, 
		RULE_fill = 17, RULE_move = 18, RULE_place = 19, RULE_rotate = 20, RULE_scale = 21, 
		RULE_arithmetic = 22, RULE_logic = 23, RULE_neq = 24, RULE_cond = 25, 
		RULE_signed_flt = 26, RULE_flt = 27, RULE_operation_flt = 28, RULE_itr = 29;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "instruction", "loop", "check", "shape", "point", "segment", 
			"circle", "polygon", "group", "groupMember", "type_definition", "num", 
			"iterator", "canvas", "draw", "transformation", "fill", "move", "place", 
			"rotate", "scale", "arithmetic", "logic", "neq", "cond", "signed_flt", 
			"flt", "operation_flt", "itr"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'\n'", "'loop'", "'start'", "'until'", "'step'", "'then'", "'end'", 
			"'check'", "'else'", "'else then'", "'point'", "':'", "','", "'segment'", 
			"'circle'", "'polygon'", "'group'", "'['", "']'", "'num'", "'iterator'", 
			"'canvas'", "'draw'", "'fill'", "'move'", "'place'", "'rotate'", "'scale'", 
			null, null, "'+'", "'-'", "'*'", "'/'", "'%'", "'!'", "'='", "'>'", "'<'", 
			"'>='", "'<='", null, "'.'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, "WS", "COM_SIGN", "PLUS", "MINUS", "MULTIPLICATION", 
			"DIVISION", "MODULO", "NEG", "EQ", "GREATER", "LOWER", "GT", "LT", "COLOR", 
			"DOT", "DIGIT", "NAME"
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
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(63);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(60);
							match(T__0);
							}
							} 
						}
						setState(65);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
					}
					setState(66);
					instruction();
					setState(68); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							{
							setState(67);
							match(T__0);
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(70); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
					} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
					}
					} 
				}
				setState(76);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			setState(77);
			canvas();
			setState(92);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(79); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(78);
						match(T__0);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(81); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(83);
				instruction();
				setState(87);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(84);
						match(T__0);
						}
						} 
					}
					setState(89);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
				}
				}
				}
				setState(94);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(95);
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
	}

	public final InstructionContext instruction() throws RecognitionException {
		InstructionContext _localctx = new InstructionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_instruction);
		int _la;
		try {
			setState(110);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(97);
				shape();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(98);
				type_definition();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(99);
				draw();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(100);
				transformation();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(101);
				group();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(102);
				loop();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(103);
				check();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(107);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(104);
					match(WS);
					}
					}
					setState(109);
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
	}

	public final LoopContext loop() throws RecognitionException {
		LoopContext _localctx = new LoopContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_loop);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			match(T__1);
			setState(114); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(113);
				match(WS);
				}
				}
				setState(116); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WS );
			setState(118);
			match(NAME);
			setState(120); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(119);
				match(WS);
				}
				}
				setState(122); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WS );
			setState(124);
			match(T__2);
			setState(126); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(125);
				match(WS);
				}
				}
				setState(128); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WS );
			setState(132);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DIGIT:
				{
				setState(130);
				itr();
				}
				break;
			case NAME:
				{
				setState(131);
				match(NAME);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(135); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(134);
				match(WS);
				}
				}
				setState(137); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WS );
			setState(139);
			match(T__3);
			setState(141); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(140);
				match(WS);
				}
				}
				setState(143); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WS );
			setState(147);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DIGIT:
				{
				setState(145);
				itr();
				}
				break;
			case NAME:
				{
				setState(146);
				match(NAME);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(150); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(149);
				match(WS);
				}
				}
				setState(152); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WS );
			setState(154);
			match(T__4);
			setState(156); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(155);
				match(WS);
				}
				}
				setState(158); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WS );
			setState(162);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DIGIT:
				{
				setState(160);
				itr();
				}
				break;
			case NAME:
				{
				setState(161);
				match(NAME);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(165); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(164);
				match(WS);
				}
				}
				setState(167); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WS );
			setState(169);
			match(T__5);
			setState(170);
			match(T__0);
			setState(182);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(174);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(171);
							match(WS);
							}
							} 
						}
						setState(176);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
					}
					setState(177);
					instruction();
					setState(178);
					match(T__0);
					}
					} 
				}
				setState(184);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			}
			setState(188);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(185);
				match(WS);
				}
				}
				setState(190);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(191);
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
	}

	public final CheckContext check() throws RecognitionException {
		CheckContext _localctx = new CheckContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_check);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(196);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(193);
				match(WS);
				}
				}
				setState(198);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(199);
			match(T__7);
			setState(201); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(200);
					match(WS);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(203); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(205);
			cond();
			setState(207); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(206);
				match(WS);
				}
				}
				setState(209); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WS );
			setState(211);
			match(T__5);
			setState(212);
			match(T__0);
			setState(216);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(213);
					match(WS);
					}
					} 
				}
				setState(218);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			}
			setState(230);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(222);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(219);
							match(WS);
							}
							} 
						}
						setState(224);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
					}
					setState(225);
					instruction();
					setState(226);
					match(T__0);
					}
					} 
				}
				setState(232);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			}
			setState(275);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__8) {
				{
				{
				setState(233);
				match(T__8);
				setState(235); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(234);
					match(WS);
					}
					}
					setState(237); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==WS );
				setState(239);
				match(T__7);
				setState(241); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(240);
						match(WS);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(243); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(245);
				cond();
				setState(247); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(246);
					match(WS);
					}
					}
					setState(249); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==WS );
				setState(251);
				match(T__5);
				setState(252);
				match(T__0);
				setState(256);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(253);
						match(WS);
						}
						} 
					}
					setState(258);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
				}
				setState(270);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(262);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(259);
								match(WS);
								}
								} 
							}
							setState(264);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
						}
						setState(265);
						instruction();
						setState(266);
						match(T__0);
						}
						} 
					}
					setState(272);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
				}
				}
				}
				setState(277);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(294);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__9) {
				{
				setState(278);
				match(T__9);
				setState(279);
				match(T__0);
				setState(291);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(283);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(280);
								match(WS);
								}
								} 
							}
							setState(285);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
						}
						setState(286);
						instruction();
						setState(287);
						match(T__0);
						}
						} 
					}
					setState(293);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
				}
				}
			}

			setState(299);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(296);
				match(WS);
				}
				}
				setState(301);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(302);
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
	}

	public final ShapeContext shape() throws RecognitionException {
		ShapeContext _localctx = new ShapeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_shape);
		try {
			setState(308);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(304);
				point();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(305);
				segment();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(306);
				circle();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(307);
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
	}

	public final PointContext point() throws RecognitionException {
		PointContext _localctx = new PointContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_point);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(313);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(310);
				match(WS);
				}
				}
				setState(315);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(316);
			match(T__10);
			setState(318); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(317);
				match(WS);
				}
				}
				setState(320); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WS );
			setState(322);
			match(NAME);
			setState(326);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(323);
				match(WS);
				}
				}
				setState(328);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(329);
			match(T__11);
			setState(333);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(330);
				match(WS);
				}
				}
				setState(335);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(336);
			operation_flt();
			setState(340);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(337);
				match(WS);
				}
				}
				setState(342);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(343);
			match(T__12);
			setState(347);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(344);
				match(WS);
				}
				}
				setState(349);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(350);
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
	}

	public final SegmentContext segment() throws RecognitionException {
		SegmentContext _localctx = new SegmentContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_segment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(355);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(352);
				match(WS);
				}
				}
				setState(357);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(358);
			match(T__13);
			setState(360); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(359);
				match(WS);
				}
				}
				setState(362); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WS );
			setState(364);
			match(NAME);
			setState(368);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(365);
				match(WS);
				}
				}
				setState(370);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(371);
			match(T__11);
			setState(375);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(372);
				match(WS);
				}
				}
				setState(377);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(378);
			match(NAME);
			setState(382);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(379);
				match(WS);
				}
				}
				setState(384);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(385);
			match(T__12);
			setState(387); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(386);
				match(WS);
				}
				}
				setState(389); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WS );
			setState(391);
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
	}

	public final CircleContext circle() throws RecognitionException {
		CircleContext _localctx = new CircleContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_circle);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(396);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(393);
				match(WS);
				}
				}
				setState(398);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(399);
			match(T__14);
			setState(401); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(400);
				match(WS);
				}
				}
				setState(403); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WS );
			setState(405);
			match(NAME);
			setState(409);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(406);
				match(WS);
				}
				}
				setState(411);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(412);
			match(T__11);
			setState(416);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(413);
				match(WS);
				}
				}
				setState(418);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(419);
			match(NAME);
			setState(423);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(420);
				match(WS);
				}
				}
				setState(425);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(426);
			match(T__12);
			setState(430);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(427);
				match(WS);
				}
				}
				setState(432);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(433);
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
	}

	public final PolygonContext polygon() throws RecognitionException {
		PolygonContext _localctx = new PolygonContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_polygon);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(438);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(435);
				match(WS);
				}
				}
				setState(440);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(441);
			match(T__15);
			setState(443); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(442);
				match(WS);
				}
				}
				setState(445); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WS );
			setState(447);
			match(NAME);
			setState(451);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(448);
				match(WS);
				}
				}
				setState(453);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(454);
			match(T__11);
			setState(458);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(455);
				match(WS);
				}
				}
				setState(460);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(461);
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
	}

	public final GroupContext group() throws RecognitionException {
		GroupContext _localctx = new GroupContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_group);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(466);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(463);
				match(WS);
				}
				}
				setState(468);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(469);
			match(T__16);
			setState(471); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(470);
				match(WS);
				}
				}
				setState(473); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WS );
			setState(475);
			match(NAME);
			setState(479);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(476);
				match(WS);
				}
				}
				setState(481);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(482);
			match(T__11);
			setState(486);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(483);
				match(WS);
				}
				}
				setState(488);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(489);
			match(NAME);
			setState(493);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(490);
				match(WS);
				}
				}
				setState(495);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(512);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__12) {
				{
				{
				setState(496);
				match(T__12);
				setState(500);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(497);
					match(WS);
					}
					}
					setState(502);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(503);
				match(NAME);
				setState(507);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(504);
					match(WS);
					}
					}
					setState(509);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(514);
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
	}

	public final GroupMemberContext groupMember() throws RecognitionException {
		GroupMemberContext _localctx = new GroupMemberContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_groupMember);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
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
			setState(528);
			match(T__17);
			setState(532);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(529);
				match(WS);
				}
				}
				setState(534);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(537);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DIGIT:
				{
				setState(535);
				itr();
				}
				break;
			case NAME:
				{
				setState(536);
				match(NAME);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(542);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(539);
				match(WS);
				}
				}
				setState(544);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(545);
			match(T__18);
			setState(547); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(546);
				match(WS);
				}
				}
				setState(549); 
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
	}

	public final Type_definitionContext type_definition() throws RecognitionException {
		Type_definitionContext _localctx = new Type_definitionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_type_definition);
		try {
			setState(553);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,76,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(551);
				num();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(552);
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
		public Operation_fltContext operation_flt() {
			return getRuleContext(Operation_fltContext.class,0);
		}
		public List<TerminalNode> WS() { return getTokens(GraphlyParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(GraphlyParser.WS, i);
		}
		public NumContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_num; }
	}

	public final NumContext num() throws RecognitionException {
		NumContext _localctx = new NumContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_num);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(558);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(555);
				match(WS);
				}
				}
				setState(560);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(561);
			match(T__19);
			setState(563); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(562);
				match(WS);
				}
				}
				setState(565); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WS );
			setState(567);
			match(NAME);
			setState(571);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(568);
				match(WS);
				}
				}
				setState(573);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(574);
			match(T__11);
			setState(578);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(575);
				match(WS);
				}
				}
				setState(580);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(583);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,81,_ctx) ) {
			case 1:
				{
				setState(581);
				operation_flt();
				}
				break;
			case 2:
				{
				setState(582);
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
	}

	public final IteratorContext iterator() throws RecognitionException {
		IteratorContext _localctx = new IteratorContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_iterator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(588);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(585);
				match(WS);
				}
				}
				setState(590);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(591);
			match(T__20);
			setState(593); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(592);
				match(WS);
				}
				}
				setState(595); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WS );
			setState(597);
			match(NAME);
			setState(601);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(598);
				match(WS);
				}
				}
				setState(603);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(604);
			match(T__11);
			setState(608);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(605);
				match(WS);
				}
				}
				setState(610);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(613);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DIGIT:
				{
				setState(611);
				itr();
				}
				break;
			case NAME:
				{
				setState(612);
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
		public TerminalNode COLOR() { return getToken(GraphlyParser.COLOR, 0); }
		public List<Operation_fltContext> operation_flt() {
			return getRuleContexts(Operation_fltContext.class);
		}
		public Operation_fltContext operation_flt(int i) {
			return getRuleContext(Operation_fltContext.class,i);
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
	}

	public final CanvasContext canvas() throws RecognitionException {
		CanvasContext _localctx = new CanvasContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_canvas);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(618);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(615);
				match(WS);
				}
				}
				setState(620);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(621);
			match(T__21);
			setState(625);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(622);
				match(WS);
				}
				}
				setState(627);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(628);
			match(T__11);
			setState(632);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(629);
				match(WS);
				}
				}
				setState(634);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(637);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,90,_ctx) ) {
			case 1:
				{
				setState(635);
				operation_flt();
				}
				break;
			case 2:
				{
				setState(636);
				match(NAME);
				}
				break;
			}
			setState(642);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(639);
				match(WS);
				}
				}
				setState(644);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(645);
			match(T__12);
			setState(649);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(646);
				match(WS);
				}
				}
				setState(651);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(654);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,93,_ctx) ) {
			case 1:
				{
				setState(652);
				operation_flt();
				}
				break;
			case 2:
				{
				setState(653);
				match(NAME);
				}
				break;
			}
			setState(659);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(656);
				match(WS);
				}
				}
				setState(661);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(662);
			match(T__12);
			setState(666);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(663);
				match(WS);
				}
				}
				setState(668);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(669);
			match(COLOR);
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
	}

	public final DrawContext draw() throws RecognitionException {
		DrawContext _localctx = new DrawContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_draw);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(674);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(671);
				match(WS);
				}
				}
				setState(676);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(677);
			match(T__22);
			setState(679); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(678);
				match(WS);
				}
				}
				setState(681); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WS );
			setState(683);
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
	}

	public final TransformationContext transformation() throws RecognitionException {
		TransformationContext _localctx = new TransformationContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_transformation);
		try {
			setState(690);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,98,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(685);
				fill();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(686);
				move();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(687);
				place();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(688);
				rotate();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(689);
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
		public TerminalNode COLOR() { return getToken(GraphlyParser.COLOR, 0); }
		public List<TerminalNode> WS() { return getTokens(GraphlyParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(GraphlyParser.WS, i);
		}
		public FillContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fill; }
	}

	public final FillContext fill() throws RecognitionException {
		FillContext _localctx = new FillContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_fill);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(695);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(692);
				match(WS);
				}
				}
				setState(697);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(698);
			match(T__23);
			setState(700); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(699);
				match(WS);
				}
				}
				setState(702); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WS );
			setState(704);
			match(NAME);
			setState(708);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(705);
				match(WS);
				}
				}
				setState(710);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(711);
			match(T__11);
			setState(715);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(712);
				match(WS);
				}
				}
				setState(717);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(718);
			match(COLOR);
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
		public MoveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_move; }
	}

	public final MoveContext move() throws RecognitionException {
		MoveContext _localctx = new MoveContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_move);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(723);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(720);
				match(WS);
				}
				}
				setState(725);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(726);
			match(T__24);
			setState(728); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(727);
				match(WS);
				}
				}
				setState(730); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WS );
			setState(732);
			match(NAME);
			setState(736);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(733);
				match(WS);
				}
				}
				setState(738);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(739);
			match(T__11);
			setState(743);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(740);
				match(WS);
				}
				}
				setState(745);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(748);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,107,_ctx) ) {
			case 1:
				{
				setState(746);
				operation_flt();
				}
				break;
			case 2:
				{
				setState(747);
				match(NAME);
				}
				break;
			}
			setState(753);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(750);
				match(WS);
				}
				}
				setState(755);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(756);
			match(T__12);
			setState(760);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(757);
				match(WS);
				}
				}
				setState(762);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(765);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,110,_ctx) ) {
			case 1:
				{
				setState(763);
				operation_flt();
				}
				break;
			case 2:
				{
				setState(764);
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
	}

	public final PlaceContext place() throws RecognitionException {
		PlaceContext _localctx = new PlaceContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_place);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(770);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(767);
				match(WS);
				}
				}
				setState(772);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(773);
			match(T__25);
			setState(775); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(774);
				match(WS);
				}
				}
				setState(777); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WS );
			setState(779);
			match(NAME);
			setState(783);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(780);
				match(WS);
				}
				}
				setState(785);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(786);
			match(T__11);
			setState(790);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(787);
				match(WS);
				}
				}
				setState(792);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(793);
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
		public Operation_fltContext operation_flt() {
			return getRuleContext(Operation_fltContext.class,0);
		}
		public List<TerminalNode> WS() { return getTokens(GraphlyParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(GraphlyParser.WS, i);
		}
		public RotateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rotate; }
	}

	public final RotateContext rotate() throws RecognitionException {
		RotateContext _localctx = new RotateContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_rotate);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(798);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(795);
				match(WS);
				}
				}
				setState(800);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(801);
			match(T__26);
			setState(803); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(802);
				match(WS);
				}
				}
				setState(805); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WS );
			setState(807);
			match(NAME);
			setState(811);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(808);
				match(WS);
				}
				}
				setState(813);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(814);
			match(T__11);
			setState(818);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(815);
				match(WS);
				}
				}
				setState(820);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(823);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,119,_ctx) ) {
			case 1:
				{
				setState(821);
				operation_flt();
				}
				break;
			case 2:
				{
				setState(822);
				match(NAME);
				}
				break;
			}
			setState(828);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(825);
				match(WS);
				}
				}
				setState(830);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(831);
			match(T__12);
			setState(835);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(832);
				match(WS);
				}
				}
				setState(837);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(838);
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
	}

	public final ScaleContext scale() throws RecognitionException {
		ScaleContext _localctx = new ScaleContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_scale);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(843);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(840);
				match(WS);
				}
				}
				setState(845);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(846);
			match(T__27);
			setState(848); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(847);
				match(WS);
				}
				}
				setState(850); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WS );
			setState(852);
			match(NAME);
			setState(856);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(853);
				match(WS);
				}
				}
				setState(858);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(859);
			match(T__11);
			setState(863);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(860);
				match(WS);
				}
				}
				setState(865);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(866);
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
	}

	public final ArithmeticContext arithmetic() throws RecognitionException {
		ArithmeticContext _localctx = new ArithmeticContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_arithmetic);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(868);
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
	}

	public final LogicContext logic() throws RecognitionException {
		LogicContext _localctx = new LogicContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_logic);
		try {
			setState(876);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case GREATER:
				enterOuterAlt(_localctx, 1);
				{
				setState(870);
				match(GREATER);
				}
				break;
			case LOWER:
				enterOuterAlt(_localctx, 2);
				{
				setState(871);
				match(LOWER);
				}
				break;
			case GT:
				enterOuterAlt(_localctx, 3);
				{
				setState(872);
				match(GT);
				}
				break;
			case LT:
				enterOuterAlt(_localctx, 4);
				{
				setState(873);
				match(LT);
				}
				break;
			case EQ:
				enterOuterAlt(_localctx, 5);
				{
				setState(874);
				match(EQ);
				}
				break;
			case NEG:
				enterOuterAlt(_localctx, 6);
				{
				setState(875);
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
	}

	public final NeqContext neq() throws RecognitionException {
		NeqContext _localctx = new NeqContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_neq);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(878);
			match(NEG);
			setState(879);
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
		public List<Operation_fltContext> operation_flt() {
			return getRuleContexts(Operation_fltContext.class);
		}
		public Operation_fltContext operation_flt(int i) {
			return getRuleContext(Operation_fltContext.class,i);
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
	}

	public final CondContext cond() throws RecognitionException {
		CondContext _localctx = new CondContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_cond);
		int _la;
		try {
			setState(929);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,136,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(884);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(881);
					match(WS);
					}
					}
					setState(886);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				{
				setState(889);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,128,_ctx) ) {
				case 1:
					{
					setState(887);
					operation_flt();
					}
					break;
				case 2:
					{
					setState(888);
					match(NAME);
					}
					break;
				}
				setState(894);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(891);
					match(WS);
					}
					}
					setState(896);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(897);
				logic();
				setState(901);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(898);
					match(WS);
					}
					}
					setState(903);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(906);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,131,_ctx) ) {
				case 1:
					{
					setState(904);
					operation_flt();
					}
					break;
				case 2:
					{
					setState(905);
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
				setState(910);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case DIGIT:
					{
					setState(908);
					itr();
					}
					break;
				case NAME:
					{
					setState(909);
					match(NAME);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(915);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(912);
					match(WS);
					}
					}
					setState(917);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(918);
				logic();
				setState(922);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(919);
					match(WS);
					}
					}
					setState(924);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(927);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case DIGIT:
					{
					setState(925);
					itr();
					}
					break;
				case NAME:
					{
					setState(926);
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
	}

	public final Signed_fltContext signed_flt() throws RecognitionException {
		Signed_fltContext _localctx = new Signed_fltContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_signed_flt);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(932);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MINUS) {
				{
				setState(931);
				match(MINUS);
				}
			}

			setState(936);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DOT:
			case DIGIT:
				{
				setState(934);
				flt();
				}
				break;
			case NAME:
				{
				setState(935);
				match(NAME);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(945);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,140,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(938);
					arithmetic();
					setState(941);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,139,_ctx) ) {
					case 1:
						{
						setState(939);
						signed_flt();
						}
						break;
					case 2:
						{
						setState(940);
						match(NAME);
						}
						break;
					}
					}
					} 
				}
				setState(947);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,140,_ctx);
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
	}

	public final FltContext flt() throws RecognitionException {
		FltContext _localctx = new FltContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_flt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(955);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,142,_ctx) ) {
			case 1:
				{
				setState(951);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==DIGIT) {
					{
					{
					setState(948);
					match(DIGIT);
					}
					}
					setState(953);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(954);
				match(DOT);
				}
				break;
			}
			setState(958); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(957);
				match(DIGIT);
				}
				}
				setState(960); 
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
	}

	public final Operation_fltContext operation_flt() throws RecognitionException {
		Operation_fltContext _localctx = new Operation_fltContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_operation_flt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(964);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DOT:
			case DIGIT:
				{
				setState(962);
				flt();
				}
				break;
			case NAME:
				{
				setState(963);
				match(NAME);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(973);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << MINUS) | (1L << MULTIPLICATION) | (1L << DIVISION) | (1L << MODULO))) != 0)) {
				{
				{
				setState(966);
				arithmetic();
				setState(969);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case DOT:
				case DIGIT:
					{
					setState(967);
					flt();
					}
					break;
				case NAME:
					{
					setState(968);
					match(NAME);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(975);
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
	}

	public final ItrContext itr() throws RecognitionException {
		ItrContext _localctx = new ItrContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_itr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(977); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(976);
				match(DIGIT);
				}
				}
				setState(979); 
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3/\u03d8\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\3\2\7\2@"+
		"\n\2\f\2\16\2C\13\2\3\2\3\2\6\2G\n\2\r\2\16\2H\7\2K\n\2\f\2\16\2N\13\2"+
		"\3\2\3\2\6\2R\n\2\r\2\16\2S\3\2\3\2\7\2X\n\2\f\2\16\2[\13\2\7\2]\n\2\f"+
		"\2\16\2`\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3l\n\3\f\3\16"+
		"\3o\13\3\5\3q\n\3\3\4\3\4\6\4u\n\4\r\4\16\4v\3\4\3\4\6\4{\n\4\r\4\16\4"+
		"|\3\4\3\4\6\4\u0081\n\4\r\4\16\4\u0082\3\4\3\4\5\4\u0087\n\4\3\4\6\4\u008a"+
		"\n\4\r\4\16\4\u008b\3\4\3\4\6\4\u0090\n\4\r\4\16\4\u0091\3\4\3\4\5\4\u0096"+
		"\n\4\3\4\6\4\u0099\n\4\r\4\16\4\u009a\3\4\3\4\6\4\u009f\n\4\r\4\16\4\u00a0"+
		"\3\4\3\4\5\4\u00a5\n\4\3\4\6\4\u00a8\n\4\r\4\16\4\u00a9\3\4\3\4\3\4\7"+
		"\4\u00af\n\4\f\4\16\4\u00b2\13\4\3\4\3\4\3\4\7\4\u00b7\n\4\f\4\16\4\u00ba"+
		"\13\4\3\4\7\4\u00bd\n\4\f\4\16\4\u00c0\13\4\3\4\3\4\3\5\7\5\u00c5\n\5"+
		"\f\5\16\5\u00c8\13\5\3\5\3\5\6\5\u00cc\n\5\r\5\16\5\u00cd\3\5\3\5\6\5"+
		"\u00d2\n\5\r\5\16\5\u00d3\3\5\3\5\3\5\7\5\u00d9\n\5\f\5\16\5\u00dc\13"+
		"\5\3\5\7\5\u00df\n\5\f\5\16\5\u00e2\13\5\3\5\3\5\3\5\7\5\u00e7\n\5\f\5"+
		"\16\5\u00ea\13\5\3\5\3\5\6\5\u00ee\n\5\r\5\16\5\u00ef\3\5\3\5\6\5\u00f4"+
		"\n\5\r\5\16\5\u00f5\3\5\3\5\6\5\u00fa\n\5\r\5\16\5\u00fb\3\5\3\5\3\5\7"+
		"\5\u0101\n\5\f\5\16\5\u0104\13\5\3\5\7\5\u0107\n\5\f\5\16\5\u010a\13\5"+
		"\3\5\3\5\3\5\7\5\u010f\n\5\f\5\16\5\u0112\13\5\7\5\u0114\n\5\f\5\16\5"+
		"\u0117\13\5\3\5\3\5\3\5\7\5\u011c\n\5\f\5\16\5\u011f\13\5\3\5\3\5\3\5"+
		"\7\5\u0124\n\5\f\5\16\5\u0127\13\5\5\5\u0129\n\5\3\5\7\5\u012c\n\5\f\5"+
		"\16\5\u012f\13\5\3\5\3\5\3\6\3\6\3\6\3\6\5\6\u0137\n\6\3\7\7\7\u013a\n"+
		"\7\f\7\16\7\u013d\13\7\3\7\3\7\6\7\u0141\n\7\r\7\16\7\u0142\3\7\3\7\7"+
		"\7\u0147\n\7\f\7\16\7\u014a\13\7\3\7\3\7\7\7\u014e\n\7\f\7\16\7\u0151"+
		"\13\7\3\7\3\7\7\7\u0155\n\7\f\7\16\7\u0158\13\7\3\7\3\7\7\7\u015c\n\7"+
		"\f\7\16\7\u015f\13\7\3\7\3\7\3\b\7\b\u0164\n\b\f\b\16\b\u0167\13\b\3\b"+
		"\3\b\6\b\u016b\n\b\r\b\16\b\u016c\3\b\3\b\7\b\u0171\n\b\f\b\16\b\u0174"+
		"\13\b\3\b\3\b\7\b\u0178\n\b\f\b\16\b\u017b\13\b\3\b\3\b\7\b\u017f\n\b"+
		"\f\b\16\b\u0182\13\b\3\b\3\b\6\b\u0186\n\b\r\b\16\b\u0187\3\b\3\b\3\t"+
		"\7\t\u018d\n\t\f\t\16\t\u0190\13\t\3\t\3\t\6\t\u0194\n\t\r\t\16\t\u0195"+
		"\3\t\3\t\7\t\u019a\n\t\f\t\16\t\u019d\13\t\3\t\3\t\7\t\u01a1\n\t\f\t\16"+
		"\t\u01a4\13\t\3\t\3\t\7\t\u01a8\n\t\f\t\16\t\u01ab\13\t\3\t\3\t\7\t\u01af"+
		"\n\t\f\t\16\t\u01b2\13\t\3\t\3\t\3\n\7\n\u01b7\n\n\f\n\16\n\u01ba\13\n"+
		"\3\n\3\n\6\n\u01be\n\n\r\n\16\n\u01bf\3\n\3\n\7\n\u01c4\n\n\f\n\16\n\u01c7"+
		"\13\n\3\n\3\n\7\n\u01cb\n\n\f\n\16\n\u01ce\13\n\3\n\3\n\3\13\7\13\u01d3"+
		"\n\13\f\13\16\13\u01d6\13\13\3\13\3\13\6\13\u01da\n\13\r\13\16\13\u01db"+
		"\3\13\3\13\7\13\u01e0\n\13\f\13\16\13\u01e3\13\13\3\13\3\13\7\13\u01e7"+
		"\n\13\f\13\16\13\u01ea\13\13\3\13\3\13\7\13\u01ee\n\13\f\13\16\13\u01f1"+
		"\13\13\3\13\3\13\7\13\u01f5\n\13\f\13\16\13\u01f8\13\13\3\13\3\13\7\13"+
		"\u01fc\n\13\f\13\16\13\u01ff\13\13\7\13\u0201\n\13\f\13\16\13\u0204\13"+
		"\13\3\f\7\f\u0207\n\f\f\f\16\f\u020a\13\f\3\f\3\f\7\f\u020e\n\f\f\f\16"+
		"\f\u0211\13\f\3\f\3\f\7\f\u0215\n\f\f\f\16\f\u0218\13\f\3\f\3\f\5\f\u021c"+
		"\n\f\3\f\7\f\u021f\n\f\f\f\16\f\u0222\13\f\3\f\3\f\6\f\u0226\n\f\r\f\16"+
		"\f\u0227\3\r\3\r\5\r\u022c\n\r\3\16\7\16\u022f\n\16\f\16\16\16\u0232\13"+
		"\16\3\16\3\16\6\16\u0236\n\16\r\16\16\16\u0237\3\16\3\16\7\16\u023c\n"+
		"\16\f\16\16\16\u023f\13\16\3\16\3\16\7\16\u0243\n\16\f\16\16\16\u0246"+
		"\13\16\3\16\3\16\5\16\u024a\n\16\3\17\7\17\u024d\n\17\f\17\16\17\u0250"+
		"\13\17\3\17\3\17\6\17\u0254\n\17\r\17\16\17\u0255\3\17\3\17\7\17\u025a"+
		"\n\17\f\17\16\17\u025d\13\17\3\17\3\17\7\17\u0261\n\17\f\17\16\17\u0264"+
		"\13\17\3\17\3\17\5\17\u0268\n\17\3\20\7\20\u026b\n\20\f\20\16\20\u026e"+
		"\13\20\3\20\3\20\7\20\u0272\n\20\f\20\16\20\u0275\13\20\3\20\3\20\7\20"+
		"\u0279\n\20\f\20\16\20\u027c\13\20\3\20\3\20\5\20\u0280\n\20\3\20\7\20"+
		"\u0283\n\20\f\20\16\20\u0286\13\20\3\20\3\20\7\20\u028a\n\20\f\20\16\20"+
		"\u028d\13\20\3\20\3\20\5\20\u0291\n\20\3\20\7\20\u0294\n\20\f\20\16\20"+
		"\u0297\13\20\3\20\3\20\7\20\u029b\n\20\f\20\16\20\u029e\13\20\3\20\3\20"+
		"\3\21\7\21\u02a3\n\21\f\21\16\21\u02a6\13\21\3\21\3\21\6\21\u02aa\n\21"+
		"\r\21\16\21\u02ab\3\21\3\21\3\22\3\22\3\22\3\22\3\22\5\22\u02b5\n\22\3"+
		"\23\7\23\u02b8\n\23\f\23\16\23\u02bb\13\23\3\23\3\23\6\23\u02bf\n\23\r"+
		"\23\16\23\u02c0\3\23\3\23\7\23\u02c5\n\23\f\23\16\23\u02c8\13\23\3\23"+
		"\3\23\7\23\u02cc\n\23\f\23\16\23\u02cf\13\23\3\23\3\23\3\24\7\24\u02d4"+
		"\n\24\f\24\16\24\u02d7\13\24\3\24\3\24\6\24\u02db\n\24\r\24\16\24\u02dc"+
		"\3\24\3\24\7\24\u02e1\n\24\f\24\16\24\u02e4\13\24\3\24\3\24\7\24\u02e8"+
		"\n\24\f\24\16\24\u02eb\13\24\3\24\3\24\5\24\u02ef\n\24\3\24\7\24\u02f2"+
		"\n\24\f\24\16\24\u02f5\13\24\3\24\3\24\7\24\u02f9\n\24\f\24\16\24\u02fc"+
		"\13\24\3\24\3\24\5\24\u0300\n\24\3\25\7\25\u0303\n\25\f\25\16\25\u0306"+
		"\13\25\3\25\3\25\6\25\u030a\n\25\r\25\16\25\u030b\3\25\3\25\7\25\u0310"+
		"\n\25\f\25\16\25\u0313\13\25\3\25\3\25\7\25\u0317\n\25\f\25\16\25\u031a"+
		"\13\25\3\25\3\25\3\26\7\26\u031f\n\26\f\26\16\26\u0322\13\26\3\26\3\26"+
		"\6\26\u0326\n\26\r\26\16\26\u0327\3\26\3\26\7\26\u032c\n\26\f\26\16\26"+
		"\u032f\13\26\3\26\3\26\7\26\u0333\n\26\f\26\16\26\u0336\13\26\3\26\3\26"+
		"\5\26\u033a\n\26\3\26\7\26\u033d\n\26\f\26\16\26\u0340\13\26\3\26\3\26"+
		"\7\26\u0344\n\26\f\26\16\26\u0347\13\26\3\26\3\26\3\27\7\27\u034c\n\27"+
		"\f\27\16\27\u034f\13\27\3\27\3\27\6\27\u0353\n\27\r\27\16\27\u0354\3\27"+
		"\3\27\7\27\u0359\n\27\f\27\16\27\u035c\13\27\3\27\3\27\7\27\u0360\n\27"+
		"\f\27\16\27\u0363\13\27\3\27\3\27\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3"+
		"\31\5\31\u036f\n\31\3\32\3\32\3\32\3\33\7\33\u0375\n\33\f\33\16\33\u0378"+
		"\13\33\3\33\3\33\5\33\u037c\n\33\3\33\7\33\u037f\n\33\f\33\16\33\u0382"+
		"\13\33\3\33\3\33\7\33\u0386\n\33\f\33\16\33\u0389\13\33\3\33\3\33\5\33"+
		"\u038d\n\33\3\33\3\33\5\33\u0391\n\33\3\33\7\33\u0394\n\33\f\33\16\33"+
		"\u0397\13\33\3\33\3\33\7\33\u039b\n\33\f\33\16\33\u039e\13\33\3\33\3\33"+
		"\5\33\u03a2\n\33\5\33\u03a4\n\33\3\34\5\34\u03a7\n\34\3\34\3\34\5\34\u03ab"+
		"\n\34\3\34\3\34\3\34\5\34\u03b0\n\34\7\34\u03b2\n\34\f\34\16\34\u03b5"+
		"\13\34\3\35\7\35\u03b8\n\35\f\35\16\35\u03bb\13\35\3\35\5\35\u03be\n\35"+
		"\3\35\6\35\u03c1\n\35\r\35\16\35\u03c2\3\36\3\36\5\36\u03c7\n\36\3\36"+
		"\3\36\3\36\5\36\u03cc\n\36\7\36\u03ce\n\36\f\36\16\36\u03d1\13\36\3\37"+
		"\6\37\u03d4\n\37\r\37\16\37\u03d5\3\37\2\2 \2\4\6\b\n\f\16\20\22\24\26"+
		"\30\32\34\36 \"$&(*,.\60\62\64\668:<\2\3\3\2!%\2\u045c\2L\3\2\2\2\4p\3"+
		"\2\2\2\6r\3\2\2\2\b\u00c6\3\2\2\2\n\u0136\3\2\2\2\f\u013b\3\2\2\2\16\u0165"+
		"\3\2\2\2\20\u018e\3\2\2\2\22\u01b8\3\2\2\2\24\u01d4\3\2\2\2\26\u0208\3"+
		"\2\2\2\30\u022b\3\2\2\2\32\u0230\3\2\2\2\34\u024e\3\2\2\2\36\u026c\3\2"+
		"\2\2 \u02a4\3\2\2\2\"\u02b4\3\2\2\2$\u02b9\3\2\2\2&\u02d5\3\2\2\2(\u0304"+
		"\3\2\2\2*\u0320\3\2\2\2,\u034d\3\2\2\2.\u0366\3\2\2\2\60\u036e\3\2\2\2"+
		"\62\u0370\3\2\2\2\64\u03a3\3\2\2\2\66\u03a6\3\2\2\28\u03bd\3\2\2\2:\u03c6"+
		"\3\2\2\2<\u03d3\3\2\2\2>@\7\3\2\2?>\3\2\2\2@C\3\2\2\2A?\3\2\2\2AB\3\2"+
		"\2\2BD\3\2\2\2CA\3\2\2\2DF\5\4\3\2EG\7\3\2\2FE\3\2\2\2GH\3\2\2\2HF\3\2"+
		"\2\2HI\3\2\2\2IK\3\2\2\2JA\3\2\2\2KN\3\2\2\2LJ\3\2\2\2LM\3\2\2\2MO\3\2"+
		"\2\2NL\3\2\2\2O^\5\36\20\2PR\7\3\2\2QP\3\2\2\2RS\3\2\2\2SQ\3\2\2\2ST\3"+
		"\2\2\2TU\3\2\2\2UY\5\4\3\2VX\7\3\2\2WV\3\2\2\2X[\3\2\2\2YW\3\2\2\2YZ\3"+
		"\2\2\2Z]\3\2\2\2[Y\3\2\2\2\\Q\3\2\2\2]`\3\2\2\2^\\\3\2\2\2^_\3\2\2\2_"+
		"a\3\2\2\2`^\3\2\2\2ab\7\2\2\3b\3\3\2\2\2cq\5\n\6\2dq\5\30\r\2eq\5 \21"+
		"\2fq\5\"\22\2gq\5\24\13\2hq\5\6\4\2iq\5\b\5\2jl\7\37\2\2kj\3\2\2\2lo\3"+
		"\2\2\2mk\3\2\2\2mn\3\2\2\2nq\3\2\2\2om\3\2\2\2pc\3\2\2\2pd\3\2\2\2pe\3"+
		"\2\2\2pf\3\2\2\2pg\3\2\2\2ph\3\2\2\2pi\3\2\2\2pm\3\2\2\2q\5\3\2\2\2rt"+
		"\7\4\2\2su\7\37\2\2ts\3\2\2\2uv\3\2\2\2vt\3\2\2\2vw\3\2\2\2wx\3\2\2\2"+
		"xz\7/\2\2y{\7\37\2\2zy\3\2\2\2{|\3\2\2\2|z\3\2\2\2|}\3\2\2\2}~\3\2\2\2"+
		"~\u0080\7\5\2\2\177\u0081\7\37\2\2\u0080\177\3\2\2\2\u0081\u0082\3\2\2"+
		"\2\u0082\u0080\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u0086\3\2\2\2\u0084\u0087"+
		"\5<\37\2\u0085\u0087\7/\2\2\u0086\u0084\3\2\2\2\u0086\u0085\3\2\2\2\u0087"+
		"\u0089\3\2\2\2\u0088\u008a\7\37\2\2\u0089\u0088\3\2\2\2\u008a\u008b\3"+
		"\2\2\2\u008b\u0089\3\2\2\2\u008b\u008c\3\2\2\2\u008c\u008d\3\2\2\2\u008d"+
		"\u008f\7\6\2\2\u008e\u0090\7\37\2\2\u008f\u008e\3\2\2\2\u0090\u0091\3"+
		"\2\2\2\u0091\u008f\3\2\2\2\u0091\u0092\3\2\2\2\u0092\u0095\3\2\2\2\u0093"+
		"\u0096\5<\37\2\u0094\u0096\7/\2\2\u0095\u0093\3\2\2\2\u0095\u0094\3\2"+
		"\2\2\u0096\u0098\3\2\2\2\u0097\u0099\7\37\2\2\u0098\u0097\3\2\2\2\u0099"+
		"\u009a\3\2\2\2\u009a\u0098\3\2\2\2\u009a\u009b\3\2\2\2\u009b\u009c\3\2"+
		"\2\2\u009c\u009e\7\7\2\2\u009d\u009f\7\37\2\2\u009e\u009d\3\2\2\2\u009f"+
		"\u00a0\3\2\2\2\u00a0\u009e\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\u00a4\3\2"+
		"\2\2\u00a2\u00a5\5<\37\2\u00a3\u00a5\7/\2\2\u00a4\u00a2\3\2\2\2\u00a4"+
		"\u00a3\3\2\2\2\u00a5\u00a7\3\2\2\2\u00a6\u00a8\7\37\2\2\u00a7\u00a6\3"+
		"\2\2\2\u00a8\u00a9\3\2\2\2\u00a9\u00a7\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa"+
		"\u00ab\3\2\2\2\u00ab\u00ac\7\b\2\2\u00ac\u00b8\7\3\2\2\u00ad\u00af\7\37"+
		"\2\2\u00ae\u00ad\3\2\2\2\u00af\u00b2\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b0"+
		"\u00b1\3\2\2\2\u00b1\u00b3\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b3\u00b4\5\4"+
		"\3\2\u00b4\u00b5\7\3\2\2\u00b5\u00b7\3\2\2\2\u00b6\u00b0\3\2\2\2\u00b7"+
		"\u00ba\3\2\2\2\u00b8\u00b6\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9\u00be\3\2"+
		"\2\2\u00ba\u00b8\3\2\2\2\u00bb\u00bd\7\37\2\2\u00bc\u00bb\3\2\2\2\u00bd"+
		"\u00c0\3\2\2\2\u00be\u00bc\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf\u00c1\3\2"+
		"\2\2\u00c0\u00be\3\2\2\2\u00c1\u00c2\7\t\2\2\u00c2\7\3\2\2\2\u00c3\u00c5"+
		"\7\37\2\2\u00c4\u00c3\3\2\2\2\u00c5\u00c8\3\2\2\2\u00c6\u00c4\3\2\2\2"+
		"\u00c6\u00c7\3\2\2\2\u00c7\u00c9\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c9\u00cb"+
		"\7\n\2\2\u00ca\u00cc\7\37\2\2\u00cb\u00ca\3\2\2\2\u00cc\u00cd\3\2\2\2"+
		"\u00cd\u00cb\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf\u00d1"+
		"\5\64\33\2\u00d0\u00d2\7\37\2\2\u00d1\u00d0\3\2\2\2\u00d2\u00d3\3\2\2"+
		"\2\u00d3\u00d1\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5\u00d6"+
		"\7\b\2\2\u00d6\u00da\7\3\2\2\u00d7\u00d9\7\37\2\2\u00d8\u00d7\3\2\2\2"+
		"\u00d9\u00dc\3\2\2\2\u00da\u00d8\3\2\2\2\u00da\u00db\3\2\2\2\u00db\u00e8"+
		"\3\2\2\2\u00dc\u00da\3\2\2\2\u00dd\u00df\7\37\2\2\u00de\u00dd\3\2\2\2"+
		"\u00df\u00e2\3\2\2\2\u00e0\u00de\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1\u00e3"+
		"\3\2\2\2\u00e2\u00e0\3\2\2\2\u00e3\u00e4\5\4\3\2\u00e4\u00e5\7\3\2\2\u00e5"+
		"\u00e7\3\2\2\2\u00e6\u00e0\3\2\2\2\u00e7\u00ea\3\2\2\2\u00e8\u00e6\3\2"+
		"\2\2\u00e8\u00e9\3\2\2\2\u00e9\u0115\3\2\2\2\u00ea\u00e8\3\2\2\2\u00eb"+
		"\u00ed\7\13\2\2\u00ec\u00ee\7\37\2\2\u00ed\u00ec\3\2\2\2\u00ee\u00ef\3"+
		"\2\2\2\u00ef\u00ed\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1"+
		"\u00f3\7\n\2\2\u00f2\u00f4\7\37\2\2\u00f3\u00f2\3\2\2\2\u00f4\u00f5\3"+
		"\2\2\2\u00f5\u00f3\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7"+
		"\u00f9\5\64\33\2\u00f8\u00fa\7\37\2\2\u00f9\u00f8\3\2\2\2\u00fa\u00fb"+
		"\3\2\2\2\u00fb\u00f9\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fd"+
		"\u00fe\7\b\2\2\u00fe\u0102\7\3\2\2\u00ff\u0101\7\37\2\2\u0100\u00ff\3"+
		"\2\2\2\u0101\u0104\3\2\2\2\u0102\u0100\3\2\2\2\u0102\u0103\3\2\2\2\u0103"+
		"\u0110\3\2\2\2\u0104\u0102\3\2\2\2\u0105\u0107\7\37\2\2\u0106\u0105\3"+
		"\2\2\2\u0107\u010a\3\2\2\2\u0108\u0106\3\2\2\2\u0108\u0109\3\2\2\2\u0109"+
		"\u010b\3\2\2\2\u010a\u0108\3\2\2\2\u010b\u010c\5\4\3\2\u010c\u010d\7\3"+
		"\2\2\u010d\u010f\3\2\2\2\u010e\u0108\3\2\2\2\u010f\u0112\3\2\2\2\u0110"+
		"\u010e\3\2\2\2\u0110\u0111\3\2\2\2\u0111\u0114\3\2\2\2\u0112\u0110\3\2"+
		"\2\2\u0113\u00eb\3\2\2\2\u0114\u0117\3\2\2\2\u0115\u0113\3\2\2\2\u0115"+
		"\u0116\3\2\2\2\u0116\u0128\3\2\2\2\u0117\u0115\3\2\2\2\u0118\u0119\7\f"+
		"\2\2\u0119\u0125\7\3\2\2\u011a\u011c\7\37\2\2\u011b\u011a\3\2\2\2\u011c"+
		"\u011f\3\2\2\2\u011d\u011b\3\2\2\2\u011d\u011e\3\2\2\2\u011e\u0120\3\2"+
		"\2\2\u011f\u011d\3\2\2\2\u0120\u0121\5\4\3\2\u0121\u0122\7\3\2\2\u0122"+
		"\u0124\3\2\2\2\u0123\u011d\3\2\2\2\u0124\u0127\3\2\2\2\u0125\u0123\3\2"+
		"\2\2\u0125\u0126\3\2\2\2\u0126\u0129\3\2\2\2\u0127\u0125\3\2\2\2\u0128"+
		"\u0118\3\2\2\2\u0128\u0129\3\2\2\2\u0129\u012d\3\2\2\2\u012a\u012c\7\37"+
		"\2\2\u012b\u012a\3\2\2\2\u012c\u012f\3\2\2\2\u012d\u012b\3\2\2\2\u012d"+
		"\u012e\3\2\2\2\u012e\u0130\3\2\2\2\u012f\u012d\3\2\2\2\u0130\u0131\7\t"+
		"\2\2\u0131\t\3\2\2\2\u0132\u0137\5\f\7\2\u0133\u0137\5\16\b\2\u0134\u0137"+
		"\5\20\t\2\u0135\u0137\5\22\n\2\u0136\u0132\3\2\2\2\u0136\u0133\3\2\2\2"+
		"\u0136\u0134\3\2\2\2\u0136\u0135\3\2\2\2\u0137\13\3\2\2\2\u0138\u013a"+
		"\7\37\2\2\u0139\u0138\3\2\2\2\u013a\u013d\3\2\2\2\u013b\u0139\3\2\2\2"+
		"\u013b\u013c\3\2\2\2\u013c\u013e\3\2\2\2\u013d\u013b\3\2\2\2\u013e\u0140"+
		"\7\r\2\2\u013f\u0141\7\37\2\2\u0140\u013f\3\2\2\2\u0141\u0142\3\2\2\2"+
		"\u0142\u0140\3\2\2\2\u0142\u0143\3\2\2\2\u0143\u0144\3\2\2\2\u0144\u0148"+
		"\7/\2\2\u0145\u0147\7\37\2\2\u0146\u0145\3\2\2\2\u0147\u014a\3\2\2\2\u0148"+
		"\u0146\3\2\2\2\u0148\u0149\3\2\2\2\u0149\u014b\3\2\2\2\u014a\u0148\3\2"+
		"\2\2\u014b\u014f\7\16\2\2\u014c\u014e\7\37\2\2\u014d\u014c\3\2\2\2\u014e"+
		"\u0151\3\2\2\2\u014f\u014d\3\2\2\2\u014f\u0150\3\2\2\2\u0150\u0152\3\2"+
		"\2\2\u0151\u014f\3\2\2\2\u0152\u0156\5:\36\2\u0153\u0155\7\37\2\2\u0154"+
		"\u0153\3\2\2\2\u0155\u0158\3\2\2\2\u0156\u0154\3\2\2\2\u0156\u0157\3\2"+
		"\2\2\u0157\u0159\3\2\2\2\u0158\u0156\3\2\2\2\u0159\u015d\7\17\2\2\u015a"+
		"\u015c\7\37\2\2\u015b\u015a\3\2\2\2\u015c\u015f\3\2\2\2\u015d\u015b\3"+
		"\2\2\2\u015d\u015e\3\2\2\2\u015e\u0160\3\2\2\2\u015f\u015d\3\2\2\2\u0160"+
		"\u0161\5:\36\2\u0161\r\3\2\2\2\u0162\u0164\7\37\2\2\u0163\u0162\3\2\2"+
		"\2\u0164\u0167\3\2\2\2\u0165\u0163\3\2\2\2\u0165\u0166\3\2\2\2\u0166\u0168"+
		"\3\2\2\2\u0167\u0165\3\2\2\2\u0168\u016a\7\20\2\2\u0169\u016b\7\37\2\2"+
		"\u016a\u0169\3\2\2\2\u016b\u016c\3\2\2\2\u016c\u016a\3\2\2\2\u016c\u016d"+
		"\3\2\2\2\u016d\u016e\3\2\2\2\u016e\u0172\7/\2\2\u016f\u0171\7\37\2\2\u0170"+
		"\u016f\3\2\2\2\u0171\u0174\3\2\2\2\u0172\u0170\3\2\2\2\u0172\u0173\3\2"+
		"\2\2\u0173\u0175\3\2\2\2\u0174\u0172\3\2\2\2\u0175\u0179\7\16\2\2\u0176"+
		"\u0178\7\37\2\2\u0177\u0176\3\2\2\2\u0178\u017b\3\2\2\2\u0179\u0177\3"+
		"\2\2\2\u0179\u017a\3\2\2\2\u017a\u017c\3\2\2\2\u017b\u0179\3\2\2\2\u017c"+
		"\u0180\7/\2\2\u017d\u017f\7\37\2\2\u017e\u017d\3\2\2\2\u017f\u0182\3\2"+
		"\2\2\u0180\u017e\3\2\2\2\u0180\u0181\3\2\2\2\u0181\u0183\3\2\2\2\u0182"+
		"\u0180\3\2\2\2\u0183\u0185\7\17\2\2\u0184\u0186\7\37\2\2\u0185\u0184\3"+
		"\2\2\2\u0186\u0187\3\2\2\2\u0187\u0185\3\2\2\2\u0187\u0188\3\2\2\2\u0188"+
		"\u0189\3\2\2\2\u0189\u018a\7/\2\2\u018a\17\3\2\2\2\u018b\u018d\7\37\2"+
		"\2\u018c\u018b\3\2\2\2\u018d\u0190\3\2\2\2\u018e\u018c\3\2\2\2\u018e\u018f"+
		"\3\2\2\2\u018f\u0191\3\2\2\2\u0190\u018e\3\2\2\2\u0191\u0193\7\21\2\2"+
		"\u0192\u0194\7\37\2\2\u0193\u0192\3\2\2\2\u0194\u0195\3\2\2\2\u0195\u0193"+
		"\3\2\2\2\u0195\u0196\3\2\2\2\u0196\u0197\3\2\2\2\u0197\u019b\7/\2\2\u0198"+
		"\u019a\7\37\2\2\u0199\u0198\3\2\2\2\u019a\u019d\3\2\2\2\u019b\u0199\3"+
		"\2\2\2\u019b\u019c\3\2\2\2\u019c\u019e\3\2\2\2\u019d\u019b\3\2\2\2\u019e"+
		"\u01a2\7\16\2\2\u019f\u01a1\7\37\2\2\u01a0\u019f\3\2\2\2\u01a1\u01a4\3"+
		"\2\2\2\u01a2\u01a0\3\2\2\2\u01a2\u01a3\3\2\2\2\u01a3\u01a5\3\2\2\2\u01a4"+
		"\u01a2\3\2\2\2\u01a5\u01a9\7/\2\2\u01a6\u01a8\7\37\2\2\u01a7\u01a6\3\2"+
		"\2\2\u01a8\u01ab\3\2\2\2\u01a9\u01a7\3\2\2\2\u01a9\u01aa\3\2\2\2\u01aa"+
		"\u01ac\3\2\2\2\u01ab\u01a9\3\2\2\2\u01ac\u01b0\7\17\2\2\u01ad\u01af\7"+
		"\37\2\2\u01ae\u01ad\3\2\2\2\u01af\u01b2\3\2\2\2\u01b0\u01ae\3\2\2\2\u01b0"+
		"\u01b1\3\2\2\2\u01b1\u01b3\3\2\2\2\u01b2\u01b0\3\2\2\2\u01b3\u01b4\5:"+
		"\36\2\u01b4\21\3\2\2\2\u01b5\u01b7\7\37\2\2\u01b6\u01b5\3\2\2\2\u01b7"+
		"\u01ba\3\2\2\2\u01b8\u01b6\3\2\2\2\u01b8\u01b9\3\2\2\2\u01b9\u01bb\3\2"+
		"\2\2\u01ba\u01b8\3\2\2\2\u01bb\u01bd\7\22\2\2\u01bc\u01be\7\37\2\2\u01bd"+
		"\u01bc\3\2\2\2\u01be\u01bf\3\2\2\2\u01bf\u01bd\3\2\2\2\u01bf\u01c0\3\2"+
		"\2\2\u01c0\u01c1\3\2\2\2\u01c1\u01c5\7/\2\2\u01c2\u01c4\7\37\2\2\u01c3"+
		"\u01c2\3\2\2\2\u01c4\u01c7\3\2\2\2\u01c5\u01c3\3\2\2\2\u01c5\u01c6\3\2"+
		"\2\2\u01c6\u01c8\3\2\2\2\u01c7\u01c5\3\2\2\2\u01c8\u01cc\7\16\2\2\u01c9"+
		"\u01cb\7\37\2\2\u01ca\u01c9\3\2\2\2\u01cb\u01ce\3\2\2\2\u01cc\u01ca\3"+
		"\2\2\2\u01cc\u01cd\3\2\2\2\u01cd\u01cf\3\2\2\2\u01ce\u01cc\3\2\2\2\u01cf"+
		"\u01d0\7/\2\2\u01d0\23\3\2\2\2\u01d1\u01d3\7\37\2\2\u01d2\u01d1\3\2\2"+
		"\2\u01d3\u01d6\3\2\2\2\u01d4\u01d2\3\2\2\2\u01d4\u01d5\3\2\2\2\u01d5\u01d7"+
		"\3\2\2\2\u01d6\u01d4\3\2\2\2\u01d7\u01d9\7\23\2\2\u01d8\u01da\7\37\2\2"+
		"\u01d9\u01d8\3\2\2\2\u01da\u01db\3\2\2\2\u01db\u01d9\3\2\2\2\u01db\u01dc"+
		"\3\2\2\2\u01dc\u01dd\3\2\2\2\u01dd\u01e1\7/\2\2\u01de\u01e0\7\37\2\2\u01df"+
		"\u01de\3\2\2\2\u01e0\u01e3\3\2\2\2\u01e1\u01df\3\2\2\2\u01e1\u01e2\3\2"+
		"\2\2\u01e2\u01e4\3\2\2\2\u01e3\u01e1\3\2\2\2\u01e4\u01e8\7\16\2\2\u01e5"+
		"\u01e7\7\37\2\2\u01e6\u01e5\3\2\2\2\u01e7\u01ea\3\2\2\2\u01e8\u01e6\3"+
		"\2\2\2\u01e8\u01e9\3\2\2\2\u01e9\u01eb\3\2\2\2\u01ea\u01e8\3\2\2\2\u01eb"+
		"\u01ef\7/\2\2\u01ec\u01ee\7\37\2\2\u01ed\u01ec\3\2\2\2\u01ee\u01f1\3\2"+
		"\2\2\u01ef\u01ed\3\2\2\2\u01ef\u01f0\3\2\2\2\u01f0\u0202\3\2\2\2\u01f1"+
		"\u01ef\3\2\2\2\u01f2\u01f6\7\17\2\2\u01f3\u01f5\7\37\2\2\u01f4\u01f3\3"+
		"\2\2\2\u01f5\u01f8\3\2\2\2\u01f6\u01f4\3\2\2\2\u01f6\u01f7\3\2\2\2\u01f7"+
		"\u01f9\3\2\2\2\u01f8\u01f6\3\2\2\2\u01f9\u01fd\7/\2\2\u01fa\u01fc\7\37"+
		"\2\2\u01fb\u01fa\3\2\2\2\u01fc\u01ff\3\2\2\2\u01fd\u01fb\3\2\2\2\u01fd"+
		"\u01fe\3\2\2\2\u01fe\u0201\3\2\2\2\u01ff\u01fd\3\2\2\2\u0200\u01f2\3\2"+
		"\2\2\u0201\u0204\3\2\2\2\u0202\u0200\3\2\2\2\u0202\u0203\3\2\2\2\u0203"+
		"\25\3\2\2\2\u0204\u0202\3\2\2\2\u0205\u0207\7\37\2\2\u0206\u0205\3\2\2"+
		"\2\u0207\u020a\3\2\2\2\u0208\u0206\3\2\2\2\u0208\u0209\3\2\2\2\u0209\u020b"+
		"\3\2\2\2\u020a\u0208\3\2\2\2\u020b\u020f\7/\2\2\u020c\u020e\7\37\2\2\u020d"+
		"\u020c\3\2\2\2\u020e\u0211\3\2\2\2\u020f\u020d\3\2\2\2\u020f\u0210\3\2"+
		"\2\2\u0210\u0212\3\2\2\2\u0211\u020f\3\2\2\2\u0212\u0216\7\24\2\2\u0213"+
		"\u0215\7\37\2\2\u0214\u0213\3\2\2\2\u0215\u0218\3\2\2\2\u0216\u0214\3"+
		"\2\2\2\u0216\u0217\3\2\2\2\u0217\u021b\3\2\2\2\u0218\u0216\3\2\2\2\u0219"+
		"\u021c\5<\37\2\u021a\u021c\7/\2\2\u021b\u0219\3\2\2\2\u021b\u021a\3\2"+
		"\2\2\u021c\u0220\3\2\2\2\u021d\u021f\7\37\2\2\u021e\u021d\3\2\2\2\u021f"+
		"\u0222\3\2\2\2\u0220\u021e\3\2\2\2\u0220\u0221\3\2\2\2\u0221\u0223\3\2"+
		"\2\2\u0222\u0220\3\2\2\2\u0223\u0225\7\25\2\2\u0224\u0226\7\37\2\2\u0225"+
		"\u0224\3\2\2\2\u0226\u0227\3\2\2\2\u0227\u0225\3\2\2\2\u0227\u0228\3\2"+
		"\2\2\u0228\27\3\2\2\2\u0229\u022c\5\32\16\2\u022a\u022c\5\34\17\2\u022b"+
		"\u0229\3\2\2\2\u022b\u022a\3\2\2\2\u022c\31\3\2\2\2\u022d\u022f\7\37\2"+
		"\2\u022e\u022d\3\2\2\2\u022f\u0232\3\2\2\2\u0230\u022e\3\2\2\2\u0230\u0231"+
		"\3\2\2\2\u0231\u0233\3\2\2\2\u0232\u0230\3\2\2\2\u0233\u0235\7\26\2\2"+
		"\u0234\u0236\7\37\2\2\u0235\u0234\3\2\2\2\u0236\u0237\3\2\2\2\u0237\u0235"+
		"\3\2\2\2\u0237\u0238\3\2\2\2\u0238\u0239\3\2\2\2\u0239\u023d\7/\2\2\u023a"+
		"\u023c\7\37\2\2\u023b\u023a\3\2\2\2\u023c\u023f\3\2\2\2\u023d\u023b\3"+
		"\2\2\2\u023d\u023e\3\2\2\2\u023e\u0240\3\2\2\2\u023f\u023d\3\2\2\2\u0240"+
		"\u0244\7\16\2\2\u0241\u0243\7\37\2\2\u0242\u0241\3\2\2\2\u0243\u0246\3"+
		"\2\2\2\u0244\u0242\3\2\2\2\u0244\u0245\3\2\2\2\u0245\u0249\3\2\2\2\u0246"+
		"\u0244\3\2\2\2\u0247\u024a\5:\36\2\u0248\u024a\7/\2\2\u0249\u0247\3\2"+
		"\2\2\u0249\u0248\3\2\2\2\u024a\33\3\2\2\2\u024b\u024d\7\37\2\2\u024c\u024b"+
		"\3\2\2\2\u024d\u0250\3\2\2\2\u024e\u024c\3\2\2\2\u024e\u024f\3\2\2\2\u024f"+
		"\u0251\3\2\2\2\u0250\u024e\3\2\2\2\u0251\u0253\7\27\2\2\u0252\u0254\7"+
		"\37\2\2\u0253\u0252\3\2\2\2\u0254\u0255\3\2\2\2\u0255\u0253\3\2\2\2\u0255"+
		"\u0256\3\2\2\2\u0256\u0257\3\2\2\2\u0257\u025b\7/\2\2\u0258\u025a\7\37"+
		"\2\2\u0259\u0258\3\2\2\2\u025a\u025d\3\2\2\2\u025b\u0259\3\2\2\2\u025b"+
		"\u025c\3\2\2\2\u025c\u025e\3\2\2\2\u025d\u025b\3\2\2\2\u025e\u0262\7\16"+
		"\2\2\u025f\u0261\7\37\2\2\u0260\u025f\3\2\2\2\u0261\u0264\3\2\2\2\u0262"+
		"\u0260\3\2\2\2\u0262\u0263\3\2\2\2\u0263\u0267\3\2\2\2\u0264\u0262\3\2"+
		"\2\2\u0265\u0268\5<\37\2\u0266\u0268\7/\2\2\u0267\u0265\3\2\2\2\u0267"+
		"\u0266\3\2\2\2\u0268\35\3\2\2\2\u0269\u026b\7\37\2\2\u026a\u0269\3\2\2"+
		"\2\u026b\u026e\3\2\2\2\u026c\u026a\3\2\2\2\u026c\u026d\3\2\2\2\u026d\u026f"+
		"\3\2\2\2\u026e\u026c\3\2\2\2\u026f\u0273\7\30\2\2\u0270\u0272\7\37\2\2"+
		"\u0271\u0270\3\2\2\2\u0272\u0275\3\2\2\2\u0273\u0271\3\2\2\2\u0273\u0274"+
		"\3\2\2\2\u0274\u0276\3\2\2\2\u0275\u0273\3\2\2\2\u0276\u027a\7\16\2\2"+
		"\u0277\u0279\7\37\2\2\u0278\u0277\3\2\2\2\u0279\u027c\3\2\2\2\u027a\u0278"+
		"\3\2\2\2\u027a\u027b\3\2\2\2\u027b\u027f\3\2\2\2\u027c\u027a\3\2\2\2\u027d"+
		"\u0280\5:\36\2\u027e\u0280\7/\2\2\u027f\u027d\3\2\2\2\u027f\u027e\3\2"+
		"\2\2\u0280\u0284\3\2\2\2\u0281\u0283\7\37\2\2\u0282\u0281\3\2\2\2\u0283"+
		"\u0286\3\2\2\2\u0284\u0282\3\2\2\2\u0284\u0285\3\2\2\2\u0285\u0287\3\2"+
		"\2\2\u0286\u0284\3\2\2\2\u0287\u028b\7\17\2\2\u0288\u028a\7\37\2\2\u0289"+
		"\u0288\3\2\2\2\u028a\u028d\3\2\2\2\u028b\u0289\3\2\2\2\u028b\u028c\3\2"+
		"\2\2\u028c\u0290\3\2\2\2\u028d\u028b\3\2\2\2\u028e\u0291\5:\36\2\u028f"+
		"\u0291\7/\2\2\u0290\u028e\3\2\2\2\u0290\u028f\3\2\2\2\u0291\u0295\3\2"+
		"\2\2\u0292\u0294\7\37\2\2\u0293\u0292\3\2\2\2\u0294\u0297\3\2\2\2\u0295"+
		"\u0293\3\2\2\2\u0295\u0296\3\2\2\2\u0296\u0298\3\2\2\2\u0297\u0295\3\2"+
		"\2\2\u0298\u029c\7\17\2\2\u0299\u029b\7\37\2\2\u029a\u0299\3\2\2\2\u029b"+
		"\u029e\3\2\2\2\u029c\u029a\3\2\2\2\u029c\u029d\3\2\2\2\u029d\u029f\3\2"+
		"\2\2\u029e\u029c\3\2\2\2\u029f\u02a0\7,\2\2\u02a0\37\3\2\2\2\u02a1\u02a3"+
		"\7\37\2\2\u02a2\u02a1\3\2\2\2\u02a3\u02a6\3\2\2\2\u02a4\u02a2\3\2\2\2"+
		"\u02a4\u02a5\3\2\2\2\u02a5\u02a7\3\2\2\2\u02a6\u02a4\3\2\2\2\u02a7\u02a9"+
		"\7\31\2\2\u02a8\u02aa\7\37\2\2\u02a9\u02a8\3\2\2\2\u02aa\u02ab\3\2\2\2"+
		"\u02ab\u02a9\3\2\2\2\u02ab\u02ac\3\2\2\2\u02ac\u02ad\3\2\2\2\u02ad\u02ae"+
		"\7/\2\2\u02ae!\3\2\2\2\u02af\u02b5\5$\23\2\u02b0\u02b5\5&\24\2\u02b1\u02b5"+
		"\5(\25\2\u02b2\u02b5\5*\26\2\u02b3\u02b5\5,\27\2\u02b4\u02af\3\2\2\2\u02b4"+
		"\u02b0\3\2\2\2\u02b4\u02b1\3\2\2\2\u02b4\u02b2\3\2\2\2\u02b4\u02b3\3\2"+
		"\2\2\u02b5#\3\2\2\2\u02b6\u02b8\7\37\2\2\u02b7\u02b6\3\2\2\2\u02b8\u02bb"+
		"\3\2\2\2\u02b9\u02b7\3\2\2\2\u02b9\u02ba\3\2\2\2\u02ba\u02bc\3\2\2\2\u02bb"+
		"\u02b9\3\2\2\2\u02bc\u02be\7\32\2\2\u02bd\u02bf\7\37\2\2\u02be\u02bd\3"+
		"\2\2\2\u02bf\u02c0\3\2\2\2\u02c0\u02be\3\2\2\2\u02c0\u02c1\3\2\2\2\u02c1"+
		"\u02c2\3\2\2\2\u02c2\u02c6\7/\2\2\u02c3\u02c5\7\37\2\2\u02c4\u02c3\3\2"+
		"\2\2\u02c5\u02c8\3\2\2\2\u02c6\u02c4\3\2\2\2\u02c6\u02c7\3\2\2\2\u02c7"+
		"\u02c9\3\2\2\2\u02c8\u02c6\3\2\2\2\u02c9\u02cd\7\16\2\2\u02ca\u02cc\7"+
		"\37\2\2\u02cb\u02ca\3\2\2\2\u02cc\u02cf\3\2\2\2\u02cd\u02cb\3\2\2\2\u02cd"+
		"\u02ce\3\2\2\2\u02ce\u02d0\3\2\2\2\u02cf\u02cd\3\2\2\2\u02d0\u02d1\7,"+
		"\2\2\u02d1%\3\2\2\2\u02d2\u02d4\7\37\2\2\u02d3\u02d2\3\2\2\2\u02d4\u02d7"+
		"\3\2\2\2\u02d5\u02d3\3\2\2\2\u02d5\u02d6\3\2\2\2\u02d6\u02d8\3\2\2\2\u02d7"+
		"\u02d5\3\2\2\2\u02d8\u02da\7\33\2\2\u02d9\u02db\7\37\2\2\u02da\u02d9\3"+
		"\2\2\2\u02db\u02dc\3\2\2\2\u02dc\u02da\3\2\2\2\u02dc\u02dd\3\2\2\2\u02dd"+
		"\u02de\3\2\2\2\u02de\u02e2\7/\2\2\u02df\u02e1\7\37\2\2\u02e0\u02df\3\2"+
		"\2\2\u02e1\u02e4\3\2\2\2\u02e2\u02e0\3\2\2\2\u02e2\u02e3\3\2\2\2\u02e3"+
		"\u02e5\3\2\2\2\u02e4\u02e2\3\2\2\2\u02e5\u02e9\7\16\2\2\u02e6\u02e8\7"+
		"\37\2\2\u02e7\u02e6\3\2\2\2\u02e8\u02eb\3\2\2\2\u02e9\u02e7\3\2\2\2\u02e9"+
		"\u02ea\3\2\2\2\u02ea\u02ee\3\2\2\2\u02eb\u02e9\3\2\2\2\u02ec\u02ef\5:"+
		"\36\2\u02ed\u02ef\7/\2\2\u02ee\u02ec\3\2\2\2\u02ee\u02ed\3\2\2\2\u02ef"+
		"\u02f3\3\2\2\2\u02f0\u02f2\7\37\2\2\u02f1\u02f0\3\2\2\2\u02f2\u02f5\3"+
		"\2\2\2\u02f3\u02f1\3\2\2\2\u02f3\u02f4\3\2\2\2\u02f4\u02f6\3\2\2\2\u02f5"+
		"\u02f3\3\2\2\2\u02f6\u02fa\7\17\2\2\u02f7\u02f9\7\37\2\2\u02f8\u02f7\3"+
		"\2\2\2\u02f9\u02fc\3\2\2\2\u02fa\u02f8\3\2\2\2\u02fa\u02fb\3\2\2\2\u02fb"+
		"\u02ff\3\2\2\2\u02fc\u02fa\3\2\2\2\u02fd\u0300\5:\36\2\u02fe\u0300\7/"+
		"\2\2\u02ff\u02fd\3\2\2\2\u02ff\u02fe\3\2\2\2\u0300\'\3\2\2\2\u0301\u0303"+
		"\7\37\2\2\u0302\u0301\3\2\2\2\u0303\u0306\3\2\2\2\u0304\u0302\3\2\2\2"+
		"\u0304\u0305\3\2\2\2\u0305\u0307\3\2\2\2\u0306\u0304\3\2\2\2\u0307\u0309"+
		"\7\34\2\2\u0308\u030a\7\37\2\2\u0309\u0308\3\2\2\2\u030a\u030b\3\2\2\2"+
		"\u030b\u0309\3\2\2\2\u030b\u030c\3\2\2\2\u030c\u030d\3\2\2\2\u030d\u0311"+
		"\7/\2\2\u030e\u0310\7\37\2\2\u030f\u030e\3\2\2\2\u0310\u0313\3\2\2\2\u0311"+
		"\u030f\3\2\2\2\u0311\u0312\3\2\2\2\u0312\u0314\3\2\2\2\u0313\u0311\3\2"+
		"\2\2\u0314\u0318\7\16\2\2\u0315\u0317\7\37\2\2\u0316\u0315\3\2\2\2\u0317"+
		"\u031a\3\2\2\2\u0318\u0316\3\2\2\2\u0318\u0319\3\2\2\2\u0319\u031b\3\2"+
		"\2\2\u031a\u0318\3\2\2\2\u031b\u031c\7/\2\2\u031c)\3\2\2\2\u031d\u031f"+
		"\7\37\2\2\u031e\u031d\3\2\2\2\u031f\u0322\3\2\2\2\u0320\u031e\3\2\2\2"+
		"\u0320\u0321\3\2\2\2\u0321\u0323\3\2\2\2\u0322\u0320\3\2\2\2\u0323\u0325"+
		"\7\35\2\2\u0324\u0326\7\37\2\2\u0325\u0324\3\2\2\2\u0326\u0327\3\2\2\2"+
		"\u0327\u0325\3\2\2\2\u0327\u0328\3\2\2\2\u0328\u0329\3\2\2\2\u0329\u032d"+
		"\7/\2\2\u032a\u032c\7\37\2\2\u032b\u032a\3\2\2\2\u032c\u032f\3\2\2\2\u032d"+
		"\u032b\3\2\2\2\u032d\u032e\3\2\2\2\u032e\u0330\3\2\2\2\u032f\u032d\3\2"+
		"\2\2\u0330\u0334\7\16\2\2\u0331\u0333\7\37\2\2\u0332\u0331\3\2\2\2\u0333"+
		"\u0336\3\2\2\2\u0334\u0332\3\2\2\2\u0334\u0335\3\2\2\2\u0335\u0339\3\2"+
		"\2\2\u0336\u0334\3\2\2\2\u0337\u033a\5:\36\2\u0338\u033a\7/\2\2\u0339"+
		"\u0337\3\2\2\2\u0339\u0338\3\2\2\2\u033a\u033e\3\2\2\2\u033b\u033d\7\37"+
		"\2\2\u033c\u033b\3\2\2\2\u033d\u0340\3\2\2\2\u033e\u033c\3\2\2\2\u033e"+
		"\u033f\3\2\2\2\u033f\u0341\3\2\2\2\u0340\u033e\3\2\2\2\u0341\u0345\7\17"+
		"\2\2\u0342\u0344\7\37\2\2\u0343\u0342\3\2\2\2\u0344\u0347\3\2\2\2\u0345"+
		"\u0343\3\2\2\2\u0345\u0346\3\2\2\2\u0346\u0348\3\2\2\2\u0347\u0345\3\2"+
		"\2\2\u0348\u0349\7/\2\2\u0349+\3\2\2\2\u034a\u034c\7\37\2\2\u034b\u034a"+
		"\3\2\2\2\u034c\u034f\3\2\2\2\u034d\u034b\3\2\2\2\u034d\u034e\3\2\2\2\u034e"+
		"\u0350\3\2\2\2\u034f\u034d\3\2\2\2\u0350\u0352\7\36\2\2\u0351\u0353\7"+
		"\37\2\2\u0352\u0351\3\2\2\2\u0353\u0354\3\2\2\2\u0354\u0352\3\2\2\2\u0354"+
		"\u0355\3\2\2\2\u0355\u0356\3\2\2\2\u0356\u035a\7/\2\2\u0357\u0359\7\37"+
		"\2\2\u0358\u0357\3\2\2\2\u0359\u035c\3\2\2\2\u035a\u0358\3\2\2\2\u035a"+
		"\u035b\3\2\2\2\u035b\u035d\3\2\2\2\u035c\u035a\3\2\2\2\u035d\u0361\7\16"+
		"\2\2\u035e\u0360\7\37\2\2\u035f\u035e\3\2\2\2\u0360\u0363\3\2\2\2\u0361"+
		"\u035f\3\2\2\2\u0361\u0362\3\2\2\2\u0362\u0364\3\2\2\2\u0363\u0361\3\2"+
		"\2\2\u0364\u0365\5:\36\2\u0365-\3\2\2\2\u0366\u0367\t\2\2\2\u0367/\3\2"+
		"\2\2\u0368\u036f\7(\2\2\u0369\u036f\7)\2\2\u036a\u036f\7*\2\2\u036b\u036f"+
		"\7+\2\2\u036c\u036f\7\'\2\2\u036d\u036f\5\62\32\2\u036e\u0368\3\2\2\2"+
		"\u036e\u0369\3\2\2\2\u036e\u036a\3\2\2\2\u036e\u036b\3\2\2\2\u036e\u036c"+
		"\3\2\2\2\u036e\u036d\3\2\2\2\u036f\61\3\2\2\2\u0370\u0371\7&\2\2\u0371"+
		"\u0372\7\'\2\2\u0372\63\3\2\2\2\u0373\u0375\7\37\2\2\u0374\u0373\3\2\2"+
		"\2\u0375\u0378\3\2\2\2\u0376\u0374\3\2\2\2\u0376\u0377\3\2\2\2\u0377\u037b"+
		"\3\2\2\2\u0378\u0376\3\2\2\2\u0379\u037c\5:\36\2\u037a\u037c\7/\2\2\u037b"+
		"\u0379\3\2\2\2\u037b\u037a\3\2\2\2\u037c\u0380\3\2\2\2\u037d\u037f\7\37"+
		"\2\2\u037e\u037d\3\2\2\2\u037f\u0382\3\2\2\2\u0380\u037e\3\2\2\2\u0380"+
		"\u0381\3\2\2\2\u0381\u0383\3\2\2\2\u0382\u0380\3\2\2\2\u0383\u0387\5\60"+
		"\31\2\u0384\u0386\7\37\2\2\u0385\u0384\3\2\2\2\u0386\u0389\3\2\2\2\u0387"+
		"\u0385\3\2\2\2\u0387\u0388\3\2\2\2\u0388\u038c\3\2\2\2\u0389\u0387\3\2"+
		"\2\2\u038a\u038d\5:\36\2\u038b\u038d\7/\2\2\u038c\u038a\3\2\2\2\u038c"+
		"\u038b\3\2\2\2\u038d\u03a4\3\2\2\2\u038e\u0391\5<\37\2\u038f\u0391\7/"+
		"\2\2\u0390\u038e\3\2\2\2\u0390\u038f\3\2\2\2\u0391\u0395\3\2\2\2\u0392"+
		"\u0394\7\37\2\2\u0393\u0392\3\2\2\2\u0394\u0397\3\2\2\2\u0395\u0393\3"+
		"\2\2\2\u0395\u0396\3\2\2\2\u0396\u0398\3\2\2\2\u0397\u0395\3\2\2\2\u0398"+
		"\u039c\5\60\31\2\u0399\u039b\7\37\2\2\u039a\u0399\3\2\2\2\u039b\u039e"+
		"\3\2\2\2\u039c\u039a\3\2\2\2\u039c\u039d\3\2\2\2\u039d\u03a1\3\2\2\2\u039e"+
		"\u039c\3\2\2\2\u039f\u03a2\5<\37\2\u03a0\u03a2\7/\2\2\u03a1\u039f\3\2"+
		"\2\2\u03a1\u03a0\3\2\2\2\u03a2\u03a4\3\2\2\2\u03a3\u0376\3\2\2\2\u03a3"+
		"\u0390\3\2\2\2\u03a4\65\3\2\2\2\u03a5\u03a7\7\"\2\2\u03a6\u03a5\3\2\2"+
		"\2\u03a6\u03a7\3\2\2\2\u03a7\u03aa\3\2\2\2\u03a8\u03ab\58\35\2\u03a9\u03ab"+
		"\7/\2\2\u03aa\u03a8\3\2\2\2\u03aa\u03a9\3\2\2\2\u03ab\u03b3\3\2\2\2\u03ac"+
		"\u03af\5.\30\2\u03ad\u03b0\5\66\34\2\u03ae\u03b0\7/\2\2\u03af\u03ad\3"+
		"\2\2\2\u03af\u03ae\3\2\2\2\u03b0\u03b2\3\2\2\2\u03b1\u03ac\3\2\2\2\u03b2"+
		"\u03b5\3\2\2\2\u03b3\u03b1\3\2\2\2\u03b3\u03b4\3\2\2\2\u03b4\67\3\2\2"+
		"\2\u03b5\u03b3\3\2\2\2\u03b6\u03b8\7.\2\2\u03b7\u03b6\3\2\2\2\u03b8\u03bb"+
		"\3\2\2\2\u03b9\u03b7\3\2\2\2\u03b9\u03ba\3\2\2\2\u03ba\u03bc\3\2\2\2\u03bb"+
		"\u03b9\3\2\2\2\u03bc\u03be\7-\2\2\u03bd\u03b9\3\2\2\2\u03bd\u03be\3\2"+
		"\2\2\u03be\u03c0\3\2\2\2\u03bf\u03c1\7.\2\2\u03c0\u03bf\3\2\2\2\u03c1"+
		"\u03c2\3\2\2\2\u03c2\u03c0\3\2\2\2\u03c2\u03c3\3\2\2\2\u03c39\3\2\2\2"+
		"\u03c4\u03c7\58\35\2\u03c5\u03c7\7/\2\2\u03c6\u03c4\3\2\2\2\u03c6\u03c5"+
		"\3\2\2\2\u03c7\u03cf\3\2\2\2\u03c8\u03cb\5.\30\2\u03c9\u03cc\58\35\2\u03ca"+
		"\u03cc\7/\2\2\u03cb\u03c9\3\2\2\2\u03cb\u03ca\3\2\2\2\u03cc\u03ce\3\2"+
		"\2\2\u03cd\u03c8\3\2\2\2\u03ce\u03d1\3\2\2\2\u03cf\u03cd\3\2\2\2\u03cf"+
		"\u03d0\3\2\2\2\u03d0;\3\2\2\2\u03d1\u03cf\3\2\2\2\u03d2\u03d4\7.\2\2\u03d3"+
		"\u03d2\3\2\2\2\u03d4\u03d5\3\2\2\2\u03d5\u03d3\3\2\2\2\u03d5\u03d6\3\2"+
		"\2\2\u03d6=\3\2\2\2\u0096AHLSY^mpv|\u0082\u0086\u008b\u0091\u0095\u009a"+
		"\u00a0\u00a4\u00a9\u00b0\u00b8\u00be\u00c6\u00cd\u00d3\u00da\u00e0\u00e8"+
		"\u00ef\u00f5\u00fb\u0102\u0108\u0110\u0115\u011d\u0125\u0128\u012d\u0136"+
		"\u013b\u0142\u0148\u014f\u0156\u015d\u0165\u016c\u0172\u0179\u0180\u0187"+
		"\u018e\u0195\u019b\u01a2\u01a9\u01b0\u01b8\u01bf\u01c5\u01cc\u01d4\u01db"+
		"\u01e1\u01e8\u01ef\u01f6\u01fd\u0202\u0208\u020f\u0216\u021b\u0220\u0227"+
		"\u022b\u0230\u0237\u023d\u0244\u0249\u024e\u0255\u025b\u0262\u0267\u026c"+
		"\u0273\u027a\u027f\u0284\u028b\u0290\u0295\u029c\u02a4\u02ab\u02b4\u02b9"+
		"\u02c0\u02c6\u02cd\u02d5\u02dc\u02e2\u02e9\u02ee\u02f3\u02fa\u02ff\u0304"+
		"\u030b\u0311\u0318\u0320\u0327\u032d\u0334\u0339\u033e\u0345\u034d\u0354"+
		"\u035a\u0361\u036e\u0376\u037b\u0380\u0387\u038c\u0390\u0395\u039c\u03a1"+
		"\u03a3\u03a6\u03aa\u03af\u03b3\u03b9\u03bd\u03c2\u03c6\u03cb\u03cf\u03d5";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}