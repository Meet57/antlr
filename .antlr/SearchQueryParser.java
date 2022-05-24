// Generated from /home/meet/Meet/MotaData-Search/SearchQuery.g4 by ANTLR 4.8
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SearchQueryParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, SHOW=5, DISPLAY=6, GET=7, METRIC=8, GROUP=9, 
		SOURCE=10, SOURCEIP=11, TEXT=12, ONLYIP=13, WS=14;
	public static final int
		RULE_searchEntry = 0, RULE_searchQuery = 1, RULE_searchOperation = 2, 
		RULE_searchSource = 3, RULE_searchIP = 4, RULE_searchType = 5, RULE_searchTask = 6;
	private static String[] makeRuleNames() {
		return new String[] {
			"searchEntry", "searchQuery", "searchOperation", "searchSource", "searchIP", 
			"searchType", "searchTask"
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

	@Override
	public String getGrammarFileName() { return "SearchQuery.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SearchQueryParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class SearchEntryContext extends ParserRuleContext {
		public SearchQueryContext searchQuery() {
			return getRuleContext(SearchQueryContext.class,0);
		}
		public SearchEntryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_searchEntry; }
	}

	public final SearchEntryContext searchEntry() throws RecognitionException {
		SearchEntryContext _localctx = new SearchEntryContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_searchEntry);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(14);
			searchQuery();
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

	public static class SearchQueryContext extends ParserRuleContext {
		public SearchOperationContext searchOperation() {
			return getRuleContext(SearchOperationContext.class,0);
		}
		public SearchSourceContext searchSource() {
			return getRuleContext(SearchSourceContext.class,0);
		}
		public SearchIPContext searchIP() {
			return getRuleContext(SearchIPContext.class,0);
		}
		public SearchTypeContext searchType() {
			return getRuleContext(SearchTypeContext.class,0);
		}
		public SearchTaskContext searchTask() {
			return getRuleContext(SearchTaskContext.class,0);
		}
		public SearchQueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_searchQuery; }
	}

	public final SearchQueryContext searchQuery() throws RecognitionException {
		SearchQueryContext _localctx = new SearchQueryContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_searchQuery);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(16);
			searchOperation();
			setState(17);
			match(T__0);
			setState(18);
			searchSource();
			setState(19);
			match(T__1);
			setState(20);
			searchIP();
			setState(21);
			match(T__2);
			setState(22);
			searchType();
			setState(23);
			match(T__1);
			setState(24);
			searchTask();
			setState(25);
			match(T__3);
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

	public static class SearchOperationContext extends ParserRuleContext {
		public TerminalNode SHOW() { return getToken(SearchQueryParser.SHOW, 0); }
		public TerminalNode DISPLAY() { return getToken(SearchQueryParser.DISPLAY, 0); }
		public TerminalNode GET() { return getToken(SearchQueryParser.GET, 0); }
		public SearchOperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_searchOperation; }
	}

	public final SearchOperationContext searchOperation() throws RecognitionException {
		SearchOperationContext _localctx = new SearchOperationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_searchOperation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(27);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SHOW) | (1L << DISPLAY) | (1L << GET))) != 0)) ) {
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

	public static class SearchSourceContext extends ParserRuleContext {
		public TerminalNode SOURCE() { return getToken(SearchQueryParser.SOURCE, 0); }
		public TerminalNode SOURCEIP() { return getToken(SearchQueryParser.SOURCEIP, 0); }
		public SearchSourceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_searchSource; }
	}

	public final SearchSourceContext searchSource() throws RecognitionException {
		SearchSourceContext _localctx = new SearchSourceContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_searchSource);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(29);
			_la = _input.LA(1);
			if ( !(_la==SOURCE || _la==SOURCEIP) ) {
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

	public static class SearchIPContext extends ParserRuleContext {
		public TerminalNode ONLYIP() { return getToken(SearchQueryParser.ONLYIP, 0); }
		public SearchIPContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_searchIP; }
	}

	public final SearchIPContext searchIP() throws RecognitionException {
		SearchIPContext _localctx = new SearchIPContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_searchIP);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(31);
			match(ONLYIP);
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

	public static class SearchTypeContext extends ParserRuleContext {
		public TerminalNode METRIC() { return getToken(SearchQueryParser.METRIC, 0); }
		public TerminalNode GROUP() { return getToken(SearchQueryParser.GROUP, 0); }
		public SearchTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_searchType; }
	}

	public final SearchTypeContext searchType() throws RecognitionException {
		SearchTypeContext _localctx = new SearchTypeContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_searchType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(33);
			_la = _input.LA(1);
			if ( !(_la==METRIC || _la==GROUP) ) {
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

	public static class SearchTaskContext extends ParserRuleContext {
		public TerminalNode TEXT() { return getToken(SearchQueryParser.TEXT, 0); }
		public SearchTaskContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_searchTask; }
	}

	public final SearchTaskContext searchTask() throws RecognitionException {
		SearchTaskContext _localctx = new SearchTaskContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_searchTask);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(35);
			match(TEXT);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\20(\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\3\2\3\2\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\2"+
		"\2\t\2\4\6\b\n\f\16\2\5\3\2\7\t\3\2\f\r\3\2\n\13\2 \2\20\3\2\2\2\4\22"+
		"\3\2\2\2\6\35\3\2\2\2\b\37\3\2\2\2\n!\3\2\2\2\f#\3\2\2\2\16%\3\2\2\2\20"+
		"\21\5\4\3\2\21\3\3\2\2\2\22\23\5\6\4\2\23\24\7\3\2\2\24\25\5\b\5\2\25"+
		"\26\7\4\2\2\26\27\5\n\6\2\27\30\7\5\2\2\30\31\5\f\7\2\31\32\7\4\2\2\32"+
		"\33\5\16\b\2\33\34\7\6\2\2\34\5\3\2\2\2\35\36\t\2\2\2\36\7\3\2\2\2\37"+
		" \t\3\2\2 \t\3\2\2\2!\"\7\17\2\2\"\13\3\2\2\2#$\t\4\2\2$\r\3\2\2\2%&\7"+
		"\16\2\2&\17\3\2\2\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}