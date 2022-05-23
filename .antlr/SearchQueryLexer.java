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
		SOURCE=10, SOURCEIP=11, TEXT=12;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "SHOW", "DISPLAY", "GET", "METRIC", "GROUP", 
			"SOURCE", "SOURCEIP", "TEXT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "' '", "':\"'", "'\" '", "'\"'", "'SHOW'", "'DISPLAY'", "'GET'", 
			"'metric'", "'group'", "'source'", "'sourceip;'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, "SHOW", "DISPLAY", "GET", "METRIC", "GROUP", 
			"SOURCE", "SOURCEIP", "TEXT"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\16Y\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3"+
		"\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\6\rV\n\r\r\r\16\rW\2"+
		"\2\16\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\3\2\3\5"+
		"\2\60\60C\\c|\2Y\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13"+
		"\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2"+
		"\2\2\27\3\2\2\2\2\31\3\2\2\2\3\33\3\2\2\2\5\35\3\2\2\2\7 \3\2\2\2\t#\3"+
		"\2\2\2\13%\3\2\2\2\r*\3\2\2\2\17\62\3\2\2\2\21\66\3\2\2\2\23=\3\2\2\2"+
		"\25C\3\2\2\2\27J\3\2\2\2\31U\3\2\2\2\33\34\7\"\2\2\34\4\3\2\2\2\35\36"+
		"\7<\2\2\36\37\7$\2\2\37\6\3\2\2\2 !\7$\2\2!\"\7\"\2\2\"\b\3\2\2\2#$\7"+
		"$\2\2$\n\3\2\2\2%&\7U\2\2&\'\7J\2\2\'(\7Q\2\2()\7Y\2\2)\f\3\2\2\2*+\7"+
		"F\2\2+,\7K\2\2,-\7U\2\2-.\7R\2\2./\7N\2\2/\60\7C\2\2\60\61\7[\2\2\61\16"+
		"\3\2\2\2\62\63\7I\2\2\63\64\7G\2\2\64\65\7V\2\2\65\20\3\2\2\2\66\67\7"+
		"o\2\2\678\7g\2\289\7v\2\29:\7t\2\2:;\7k\2\2;<\7e\2\2<\22\3\2\2\2=>\7i"+
		"\2\2>?\7t\2\2?@\7q\2\2@A\7w\2\2AB\7r\2\2B\24\3\2\2\2CD\7u\2\2DE\7q\2\2"+
		"EF\7w\2\2FG\7t\2\2GH\7e\2\2HI\7g\2\2I\26\3\2\2\2JK\7u\2\2KL\7q\2\2LM\7"+
		"w\2\2MN\7t\2\2NO\7e\2\2OP\7g\2\2PQ\7k\2\2QR\7r\2\2RS\7=\2\2S\30\3\2\2"+
		"\2TV\t\2\2\2UT\3\2\2\2VW\3\2\2\2WU\3\2\2\2WX\3\2\2\2X\32\3\2\2\2\4\2W"+
		"\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}