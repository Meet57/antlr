// Generated from /home/meet/Meet/MotaData-Search/SearchQuery.g4 by ANTLR 4.8
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SearchQueryLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, ONLYIP=5, SHOW=6, DISPLAY=7, GET=8, LOG=9, 
		METRIC=10, GROUP=11, SOURCE=12, SOURCEIP=13, TASK=14, WS=15;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "DIGIT", "OCTATE", "IP", "TEXT", "ONLYIP", 
			"SHOW", "DISPLAY", "GET", "LOG", "METRIC", "GROUP", "SOURCE", "SOURCEIP", 
			"TASK", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "' '", "':\"'", "'\" '", "'\"'", null, "'show'", "'display'", "'get'", 
			"'log'", "'metric'", "'group'", "'source'", "'sourceip'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, "ONLYIP", "SHOW", "DISPLAY", "GET", "LOG", 
			"METRIC", "GROUP", "SOURCE", "SOURCEIP", "TASK", "WS"
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


	public SearchQueryLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "SearchQuery.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\21\u008c\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\6"+
		"\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7>\n\7\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\t\6\tI\n\t\r\t\16\tJ\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3"+
		"\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3"+
		"\23\6\23\u0082\n\23\r\23\16\23\u0083\3\24\6\24\u0087\n\24\r\24\16\24\u0088"+
		"\3\24\3\24\2\2\25\3\3\5\4\7\5\t\6\13\2\r\2\17\2\21\2\23\7\25\b\27\t\31"+
		"\n\33\13\35\f\37\r!\16#\17%\20\'\21\3\2\5\3\2\62;\7\2\60\60\62;C\\c|\u0080"+
		"\u0080\4\2\13\f\"\"\2\u008c\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3"+
		"\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2"+
		"\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2"+
		"\2\2\3)\3\2\2\2\5+\3\2\2\2\7.\3\2\2\2\t\61\3\2\2\2\13\63\3\2\2\2\r=\3"+
		"\2\2\2\17?\3\2\2\2\21H\3\2\2\2\23L\3\2\2\2\25N\3\2\2\2\27S\3\2\2\2\31"+
		"[\3\2\2\2\33_\3\2\2\2\35c\3\2\2\2\37j\3\2\2\2!p\3\2\2\2#w\3\2\2\2%\u0081"+
		"\3\2\2\2\'\u0086\3\2\2\2)*\7\"\2\2*\4\3\2\2\2+,\7<\2\2,-\7$\2\2-\6\3\2"+
		"\2\2./\7$\2\2/\60\7\"\2\2\60\b\3\2\2\2\61\62\7$\2\2\62\n\3\2\2\2\63\64"+
		"\t\2\2\2\64\f\3\2\2\2\65\66\5\13\6\2\66\67\5\13\6\2\678\5\13\6\28>\3\2"+
		"\2\29:\5\13\6\2:;\5\13\6\2;>\3\2\2\2<>\5\13\6\2=\65\3\2\2\2=9\3\2\2\2"+
		"=<\3\2\2\2>\16\3\2\2\2?@\5\r\7\2@A\7\60\2\2AB\5\r\7\2BC\7\60\2\2CD\5\r"+
		"\7\2DE\7\60\2\2EF\5\r\7\2F\20\3\2\2\2GI\t\3\2\2HG\3\2\2\2IJ\3\2\2\2JH"+
		"\3\2\2\2JK\3\2\2\2K\22\3\2\2\2LM\5\17\b\2M\24\3\2\2\2NO\7u\2\2OP\7j\2"+
		"\2PQ\7q\2\2QR\7y\2\2R\26\3\2\2\2ST\7f\2\2TU\7k\2\2UV\7u\2\2VW\7r\2\2W"+
		"X\7n\2\2XY\7c\2\2YZ\7{\2\2Z\30\3\2\2\2[\\\7i\2\2\\]\7g\2\2]^\7v\2\2^\32"+
		"\3\2\2\2_`\7n\2\2`a\7q\2\2ab\7i\2\2b\34\3\2\2\2cd\7o\2\2de\7g\2\2ef\7"+
		"v\2\2fg\7t\2\2gh\7k\2\2hi\7e\2\2i\36\3\2\2\2jk\7i\2\2kl\7t\2\2lm\7q\2"+
		"\2mn\7w\2\2no\7r\2\2o \3\2\2\2pq\7u\2\2qr\7q\2\2rs\7w\2\2st\7t\2\2tu\7"+
		"e\2\2uv\7g\2\2v\"\3\2\2\2wx\7u\2\2xy\7q\2\2yz\7w\2\2z{\7t\2\2{|\7e\2\2"+
		"|}\7g\2\2}~\7k\2\2~\177\7r\2\2\177$\3\2\2\2\u0080\u0082\t\3\2\2\u0081"+
		"\u0080\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u0081\3\2\2\2\u0083\u0084\3\2"+
		"\2\2\u0084&\3\2\2\2\u0085\u0087\t\4\2\2\u0086\u0085\3\2\2\2\u0087\u0088"+
		"\3\2\2\2\u0088\u0086\3\2\2\2\u0088\u0089\3\2\2\2\u0089\u008a\3\2\2\2\u008a"+
		"\u008b\b\24\2\2\u008b(\3\2\2\2\7\2=J\u0083\u0088\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}