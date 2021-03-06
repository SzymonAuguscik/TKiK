// Generated from c:\Users\Asus\Desktop\semestr6\TKiK\GraphicalLanguage\Graphly.g4 by ANTLR 4.8
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GraphlyLexer extends Lexer {
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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
			"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "T__23", "T__24", 
			"T__25", "T__26", "T__27", "WS", "COM_SIGN", "PLUS", "MINUS", "MULTIPLICATION", 
			"DIVISION", "MODULO", "NEG", "EQ", "GREATER", "LOWER", "GT", "LT", "COLOR", 
			"DOT", "DIGIT", "NAME"
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


	public GraphlyLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Graphly.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2/\u012a\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b"+
		"\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\16"+
		"\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30"+
		"\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\36\3\36\3\37\3\37\3\37\3\37\7\37\u00fb\n\37\f\37"+
		"\16\37\u00fe\13\37\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&"+
		"\3&\3\'\3\'\3(\3(\3)\3)\3)\3*\3*\3*\3+\3+\6+\u011c\n+\r+\16+\u011d\3,"+
		"\3,\3-\3-\3.\3.\7.\u0126\n.\f.\16.\u0129\13.\2\2/\3\3\5\4\7\5\t\6\13\7"+
		"\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25"+
		")\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O"+
		")Q*S+U,W-Y.[/\3\2\b\5\2\13\f\17\17\"\"\4\2\f\f\17\17\3\2c|\3\2\62;\3\2"+
		"C\\\6\2\62;C\\aac|\2\u012c\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2"+
		"\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2"+
		"\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3"+
		"\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2"+
		"\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67"+
		"\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2"+
		"\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2"+
		"\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\3]"+
		"\3\2\2\2\5_\3\2\2\2\7d\3\2\2\2\tj\3\2\2\2\13p\3\2\2\2\ru\3\2\2\2\17z\3"+
		"\2\2\2\21~\3\2\2\2\23\u0084\3\2\2\2\25\u0089\3\2\2\2\27\u0093\3\2\2\2"+
		"\31\u0099\3\2\2\2\33\u009b\3\2\2\2\35\u009d\3\2\2\2\37\u00a5\3\2\2\2!"+
		"\u00ac\3\2\2\2#\u00b4\3\2\2\2%\u00ba\3\2\2\2\'\u00bc\3\2\2\2)\u00be\3"+
		"\2\2\2+\u00c2\3\2\2\2-\u00cb\3\2\2\2/\u00d2\3\2\2\2\61\u00d7\3\2\2\2\63"+
		"\u00dc\3\2\2\2\65\u00e1\3\2\2\2\67\u00e7\3\2\2\29\u00ee\3\2\2\2;\u00f4"+
		"\3\2\2\2=\u00f6\3\2\2\2?\u0101\3\2\2\2A\u0103\3\2\2\2C\u0105\3\2\2\2E"+
		"\u0107\3\2\2\2G\u0109\3\2\2\2I\u010b\3\2\2\2K\u010d\3\2\2\2M\u010f\3\2"+
		"\2\2O\u0111\3\2\2\2Q\u0113\3\2\2\2S\u0116\3\2\2\2U\u0119\3\2\2\2W\u011f"+
		"\3\2\2\2Y\u0121\3\2\2\2[\u0123\3\2\2\2]^\7\f\2\2^\4\3\2\2\2_`\7n\2\2`"+
		"a\7q\2\2ab\7q\2\2bc\7r\2\2c\6\3\2\2\2de\7u\2\2ef\7v\2\2fg\7c\2\2gh\7t"+
		"\2\2hi\7v\2\2i\b\3\2\2\2jk\7w\2\2kl\7p\2\2lm\7v\2\2mn\7k\2\2no\7n\2\2"+
		"o\n\3\2\2\2pq\7u\2\2qr\7v\2\2rs\7g\2\2st\7r\2\2t\f\3\2\2\2uv\7v\2\2vw"+
		"\7j\2\2wx\7g\2\2xy\7p\2\2y\16\3\2\2\2z{\7g\2\2{|\7p\2\2|}\7f\2\2}\20\3"+
		"\2\2\2~\177\7e\2\2\177\u0080\7j\2\2\u0080\u0081\7g\2\2\u0081\u0082\7e"+
		"\2\2\u0082\u0083\7m\2\2\u0083\22\3\2\2\2\u0084\u0085\7g\2\2\u0085\u0086"+
		"\7n\2\2\u0086\u0087\7u\2\2\u0087\u0088\7g\2\2\u0088\24\3\2\2\2\u0089\u008a"+
		"\7g\2\2\u008a\u008b\7n\2\2\u008b\u008c\7u\2\2\u008c\u008d\7g\2\2\u008d"+
		"\u008e\7\"\2\2\u008e\u008f\7v\2\2\u008f\u0090\7j\2\2\u0090\u0091\7g\2"+
		"\2\u0091\u0092\7p\2\2\u0092\26\3\2\2\2\u0093\u0094\7r\2\2\u0094\u0095"+
		"\7q\2\2\u0095\u0096\7k\2\2\u0096\u0097\7p\2\2\u0097\u0098\7v\2\2\u0098"+
		"\30\3\2\2\2\u0099\u009a\7<\2\2\u009a\32\3\2\2\2\u009b\u009c\7.\2\2\u009c"+
		"\34\3\2\2\2\u009d\u009e\7u\2\2\u009e\u009f\7g\2\2\u009f\u00a0\7i\2\2\u00a0"+
		"\u00a1\7o\2\2\u00a1\u00a2\7g\2\2\u00a2\u00a3\7p\2\2\u00a3\u00a4\7v\2\2"+
		"\u00a4\36\3\2\2\2\u00a5\u00a6\7e\2\2\u00a6\u00a7\7k\2\2\u00a7\u00a8\7"+
		"t\2\2\u00a8\u00a9\7e\2\2\u00a9\u00aa\7n\2\2\u00aa\u00ab\7g\2\2\u00ab "+
		"\3\2\2\2\u00ac\u00ad\7r\2\2\u00ad\u00ae\7q\2\2\u00ae\u00af\7n\2\2\u00af"+
		"\u00b0\7{\2\2\u00b0\u00b1\7i\2\2\u00b1\u00b2\7q\2\2\u00b2\u00b3\7p\2\2"+
		"\u00b3\"\3\2\2\2\u00b4\u00b5\7i\2\2\u00b5\u00b6\7t\2\2\u00b6\u00b7\7q"+
		"\2\2\u00b7\u00b8\7w\2\2\u00b8\u00b9\7r\2\2\u00b9$\3\2\2\2\u00ba\u00bb"+
		"\7]\2\2\u00bb&\3\2\2\2\u00bc\u00bd\7_\2\2\u00bd(\3\2\2\2\u00be\u00bf\7"+
		"p\2\2\u00bf\u00c0\7w\2\2\u00c0\u00c1\7o\2\2\u00c1*\3\2\2\2\u00c2\u00c3"+
		"\7k\2\2\u00c3\u00c4\7v\2\2\u00c4\u00c5\7g\2\2\u00c5\u00c6\7t\2\2\u00c6"+
		"\u00c7\7c\2\2\u00c7\u00c8\7v\2\2\u00c8\u00c9\7q\2\2\u00c9\u00ca\7t\2\2"+
		"\u00ca,\3\2\2\2\u00cb\u00cc\7e\2\2\u00cc\u00cd\7c\2\2\u00cd\u00ce\7p\2"+
		"\2\u00ce\u00cf\7x\2\2\u00cf\u00d0\7c\2\2\u00d0\u00d1\7u\2\2\u00d1.\3\2"+
		"\2\2\u00d2\u00d3\7f\2\2\u00d3\u00d4\7t\2\2\u00d4\u00d5\7c\2\2\u00d5\u00d6"+
		"\7y\2\2\u00d6\60\3\2\2\2\u00d7\u00d8\7h\2\2\u00d8\u00d9\7k\2\2\u00d9\u00da"+
		"\7n\2\2\u00da\u00db\7n\2\2\u00db\62\3\2\2\2\u00dc\u00dd\7o\2\2\u00dd\u00de"+
		"\7q\2\2\u00de\u00df\7x\2\2\u00df\u00e0\7g\2\2\u00e0\64\3\2\2\2\u00e1\u00e2"+
		"\7r\2\2\u00e2\u00e3\7n\2\2\u00e3\u00e4\7c\2\2\u00e4\u00e5\7e\2\2\u00e5"+
		"\u00e6\7g\2\2\u00e6\66\3\2\2\2\u00e7\u00e8\7t\2\2\u00e8\u00e9\7q\2\2\u00e9"+
		"\u00ea\7v\2\2\u00ea\u00eb\7c\2\2\u00eb\u00ec\7v\2\2\u00ec\u00ed\7g\2\2"+
		"\u00ed8\3\2\2\2\u00ee\u00ef\7u\2\2\u00ef\u00f0\7e\2\2\u00f0\u00f1\7c\2"+
		"\2\u00f1\u00f2\7n\2\2\u00f2\u00f3\7g\2\2\u00f3:\3\2\2\2\u00f4\u00f5\t"+
		"\2\2\2\u00f5<\3\2\2\2\u00f6\u00f7\7/\2\2\u00f7\u00f8\7/\2\2\u00f8\u00fc"+
		"\3\2\2\2\u00f9\u00fb\n\3\2\2\u00fa\u00f9\3\2\2\2\u00fb\u00fe\3\2\2\2\u00fc"+
		"\u00fa\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fd\u00ff\3\2\2\2\u00fe\u00fc\3\2"+
		"\2\2\u00ff\u0100\b\37\2\2\u0100>\3\2\2\2\u0101\u0102\7-\2\2\u0102@\3\2"+
		"\2\2\u0103\u0104\7/\2\2\u0104B\3\2\2\2\u0105\u0106\7,\2\2\u0106D\3\2\2"+
		"\2\u0107\u0108\7\61\2\2\u0108F\3\2\2\2\u0109\u010a\7\'\2\2\u010aH\3\2"+
		"\2\2\u010b\u010c\7#\2\2\u010cJ\3\2\2\2\u010d\u010e\7?\2\2\u010eL\3\2\2"+
		"\2\u010f\u0110\7@\2\2\u0110N\3\2\2\2\u0111\u0112\7>\2\2\u0112P\3\2\2\2"+
		"\u0113\u0114\7@\2\2\u0114\u0115\7?\2\2\u0115R\3\2\2\2\u0116\u0117\7>\2"+
		"\2\u0117\u0118\7?\2\2\u0118T\3\2\2\2\u0119\u011b\7%\2\2\u011a\u011c\t"+
		"\4\2\2\u011b\u011a\3\2\2\2\u011c\u011d\3\2\2\2\u011d\u011b\3\2\2\2\u011d"+
		"\u011e\3\2\2\2\u011eV\3\2\2\2\u011f\u0120\7\60\2\2\u0120X\3\2\2\2\u0121"+
		"\u0122\t\5\2\2\u0122Z\3\2\2\2\u0123\u0127\t\6\2\2\u0124\u0126\t\7\2\2"+
		"\u0125\u0124\3\2\2\2\u0126\u0129\3\2\2\2\u0127\u0125\3\2\2\2\u0127\u0128"+
		"\3\2\2\2\u0128\\\3\2\2\2\u0129\u0127\3\2\2\2\6\2\u00fc\u011d\u0127\3\b"+
		"\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}