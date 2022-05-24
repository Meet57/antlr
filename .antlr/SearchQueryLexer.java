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
		T__0=1, T__1=2, T__2=3, T__3=4, SHOW=5, DISPLAY=6, GET=7, METRIC=8, GROUP=9, 
		SOURCE=10, SOURCEIP=11, TEXT=12, ONLYIP=13, WS=14;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "SHOW", "DISPLAY", "GET", "METRIC", "GROUP", 
			"SOURCE", "SOURCEIP", "TEXT", "ONLYIP", "WS", "IP", "OCTATE", "DIGIT", 
			"DOT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "' '", "':\"'", "'\" '", "'\"'", "'show'", "'display'", "'get'", 
			"'metric'", "'group'", "'source'", "'sourceip'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, "SHOW", "DISPLAY", "GET", "METRIC", "GROUP", 
			"SOURCE", "SOURCEIP", "TEXT", "ONLYIP", "WS"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\20z\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6\3\6"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\6\ra\n\r\r\r\16\rb\3\16\6\16f\n\16"+
		"\r\16\16\16g\3\17\6\17k\n\17\r\17\16\17l\3\17\3\17\3\20\3\20\3\21\3\21"+
		"\3\21\3\21\3\22\3\22\3\23\3\23\2\2\24\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21"+
		"\n\23\13\25\f\27\r\31\16\33\17\35\20\37\2!\2#\2%\2\3\2\5\7\2\60\60\62"+
		";C\\c|\u0080\u0080\3\2\62;\4\2\13\f\"\"\2x\2\3\3\2\2\2\2\5\3\2\2\2\2\7"+
		"\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2"+
		"\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2"+
		"\35\3\2\2\2\3\'\3\2\2\2\5)\3\2\2\2\7,\3\2\2\2\t/\3\2\2\2\13\61\3\2\2\2"+
		"\r\66\3\2\2\2\17>\3\2\2\2\21B\3\2\2\2\23I\3\2\2\2\25O\3\2\2\2\27V\3\2"+
		"\2\2\31`\3\2\2\2\33e\3\2\2\2\35j\3\2\2\2\37p\3\2\2\2!r\3\2\2\2#v\3\2\2"+
		"\2%x\3\2\2\2\'(\7\"\2\2(\4\3\2\2\2)*\7<\2\2*+\7$\2\2+\6\3\2\2\2,-\7$\2"+
		"\2-.\7\"\2\2.\b\3\2\2\2/\60\7$\2\2\60\n\3\2\2\2\61\62\7u\2\2\62\63\7j"+
		"\2\2\63\64\7q\2\2\64\65\7y\2\2\65\f\3\2\2\2\66\67\7f\2\2\678\7k\2\289"+
		"\7u\2\29:\7r\2\2:;\7n\2\2;<\7c\2\2<=\7{\2\2=\16\3\2\2\2>?\7i\2\2?@\7g"+
		"\2\2@A\7v\2\2A\20\3\2\2\2BC\7o\2\2CD\7g\2\2DE\7v\2\2EF\7t\2\2FG\7k\2\2"+
		"GH\7e\2\2H\22\3\2\2\2IJ\7i\2\2JK\7t\2\2KL\7q\2\2LM\7w\2\2MN\7r\2\2N\24"+
		"\3\2\2\2OP\7u\2\2PQ\7q\2\2QR\7w\2\2RS\7t\2\2ST\7e\2\2TU\7g\2\2U\26\3\2"+
		"\2\2VW\7u\2\2WX\7q\2\2XY\7w\2\2YZ\7t\2\2Z[\7e\2\2[\\\7g\2\2\\]\7k\2\2"+
		"]^\7r\2\2^\30\3\2\2\2_a\t\2\2\2`_\3\2\2\2ab\3\2\2\2b`\3\2\2\2bc\3\2\2"+
		"\2c\32\3\2\2\2df\t\3\2\2ed\3\2\2\2fg\3\2\2\2ge\3\2\2\2gh\3\2\2\2h\34\3"+
		"\2\2\2ik\t\4\2\2ji\3\2\2\2kl\3\2\2\2lj\3\2\2\2lm\3\2\2\2mn\3\2\2\2no\b"+
		"\17\2\2o\36\3\2\2\2pq\5!\21\2q \3\2\2\2rs\5#\22\2st\5#\22\2tu\5#\22\2"+
		"u\"\3\2\2\2vw\t\3\2\2w$\3\2\2\2xy\7\60\2\2y&\3\2\2\2\6\2bgl\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}