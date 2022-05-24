// Generated from SearchQuery.g4 by ANTLR 4.10.1
// jshint ignore: start
import antlr4 from 'antlr4';
import SearchQueryListener from './SearchQueryListener.js';
const serializedATN = [4,1,15,41,2,0,7,0,2,1,7,1,2,2,7,2,2,3,7,3,2,4,7,4,
2,5,7,5,2,6,7,6,1,0,4,0,16,8,0,11,0,12,0,17,1,1,1,1,1,1,1,1,1,1,1,1,1,1,
1,1,1,1,1,1,1,1,1,2,1,2,1,3,1,3,1,4,1,4,1,5,1,5,1,6,1,6,1,6,0,0,7,0,2,4,
6,8,10,12,0,3,1,0,6,8,1,0,12,13,1,0,9,10,34,0,15,1,0,0,0,2,19,1,0,0,0,4,
30,1,0,0,0,6,32,1,0,0,0,8,34,1,0,0,0,10,36,1,0,0,0,12,38,1,0,0,0,14,16,3,
2,1,0,15,14,1,0,0,0,16,17,1,0,0,0,17,15,1,0,0,0,17,18,1,0,0,0,18,1,1,0,0,
0,19,20,3,4,2,0,20,21,5,1,0,0,21,22,3,6,3,0,22,23,5,2,0,0,23,24,3,8,4,0,
24,25,5,3,0,0,25,26,3,10,5,0,26,27,5,2,0,0,27,28,3,12,6,0,28,29,5,4,0,0,
29,3,1,0,0,0,30,31,7,0,0,0,31,5,1,0,0,0,32,33,7,1,0,0,33,7,1,0,0,0,34,35,
5,5,0,0,35,9,1,0,0,0,36,37,7,2,0,0,37,11,1,0,0,0,38,39,5,14,0,0,39,13,1,
0,0,0,1,17];


const atn = new antlr4.atn.ATNDeserializer().deserialize(serializedATN);

const decisionsToDFA = atn.decisionToState.map( (ds, index) => new antlr4.dfa.DFA(ds, index) );

const sharedContextCache = new antlr4.PredictionContextCache();

export default class SearchQueryParser extends antlr4.Parser {

    static grammarFileName = "SearchQuery.g4";
    static literalNames = [ null, "' '", "':\"'", "'\" '", "'\"'", null, 
                            "'show'", "'display'", "'get'", "'log'", "'metric'", 
                            "'group'", "'source'", "'sourceip'" ];
    static symbolicNames = [ null, null, null, null, null, "ONLYIP", "SHOW", 
                             "DISPLAY", "GET", "LOG", "METRIC", "GROUP", 
                             "SOURCE", "SOURCEIP", "TASK", "WS" ];
    static ruleNames = [ "searchEntry", "searchQuery", "searchOperation", 
                         "searchSource", "searchIP", "searchType", "searchTask" ];

    constructor(input) {
        super(input);
        this._interp = new antlr4.atn.ParserATNSimulator(this, atn, decisionsToDFA, sharedContextCache);
        this.ruleNames = SearchQueryParser.ruleNames;
        this.literalNames = SearchQueryParser.literalNames;
        this.symbolicNames = SearchQueryParser.symbolicNames;
    }

    get atn() {
        return atn;
    }



	searchEntry() {
	    let localctx = new SearchEntryContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 0, SearchQueryParser.RULE_searchEntry);
	    var _la = 0; // Token type
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 15; 
	        this._errHandler.sync(this);
	        _la = this._input.LA(1);
	        do {
	            this.state = 14;
	            this.searchQuery();
	            this.state = 17; 
	            this._errHandler.sync(this);
	            _la = this._input.LA(1);
	        } while((((_la) & ~0x1f) == 0 && ((1 << _la) & ((1 << SearchQueryParser.SHOW) | (1 << SearchQueryParser.DISPLAY) | (1 << SearchQueryParser.GET))) !== 0));
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	searchQuery() {
	    let localctx = new SearchQueryContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 2, SearchQueryParser.RULE_searchQuery);
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 19;
	        this.searchOperation();
	        this.state = 20;
	        this.match(SearchQueryParser.T__0);
	        this.state = 21;
	        this.searchSource();
	        this.state = 22;
	        this.match(SearchQueryParser.T__1);
	        this.state = 23;
	        this.searchIP();
	        this.state = 24;
	        this.match(SearchQueryParser.T__2);
	        this.state = 25;
	        this.searchType();
	        this.state = 26;
	        this.match(SearchQueryParser.T__1);
	        this.state = 27;
	        this.searchTask();
	        this.state = 28;
	        this.match(SearchQueryParser.T__3);
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	searchOperation() {
	    let localctx = new SearchOperationContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 4, SearchQueryParser.RULE_searchOperation);
	    var _la = 0; // Token type
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 30;
	        _la = this._input.LA(1);
	        if(!((((_la) & ~0x1f) == 0 && ((1 << _la) & ((1 << SearchQueryParser.SHOW) | (1 << SearchQueryParser.DISPLAY) | (1 << SearchQueryParser.GET))) !== 0))) {
	        this._errHandler.recoverInline(this);
	        }
	        else {
	        	this._errHandler.reportMatch(this);
	            this.consume();
	        }
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	searchSource() {
	    let localctx = new SearchSourceContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 6, SearchQueryParser.RULE_searchSource);
	    var _la = 0; // Token type
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 32;
	        _la = this._input.LA(1);
	        if(!(_la===SearchQueryParser.SOURCE || _la===SearchQueryParser.SOURCEIP)) {
	        this._errHandler.recoverInline(this);
	        }
	        else {
	        	this._errHandler.reportMatch(this);
	            this.consume();
	        }
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	searchIP() {
	    let localctx = new SearchIPContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 8, SearchQueryParser.RULE_searchIP);
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 34;
	        this.match(SearchQueryParser.ONLYIP);
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	searchType() {
	    let localctx = new SearchTypeContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 10, SearchQueryParser.RULE_searchType);
	    var _la = 0; // Token type
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 36;
	        _la = this._input.LA(1);
	        if(!(_la===SearchQueryParser.LOG || _la===SearchQueryParser.METRIC)) {
	        this._errHandler.recoverInline(this);
	        }
	        else {
	        	this._errHandler.reportMatch(this);
	            this.consume();
	        }
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	searchTask() {
	    let localctx = new SearchTaskContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 12, SearchQueryParser.RULE_searchTask);
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 38;
	        this.match(SearchQueryParser.TASK);
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}


}

SearchQueryParser.EOF = antlr4.Token.EOF;
SearchQueryParser.T__0 = 1;
SearchQueryParser.T__1 = 2;
SearchQueryParser.T__2 = 3;
SearchQueryParser.T__3 = 4;
SearchQueryParser.ONLYIP = 5;
SearchQueryParser.SHOW = 6;
SearchQueryParser.DISPLAY = 7;
SearchQueryParser.GET = 8;
SearchQueryParser.LOG = 9;
SearchQueryParser.METRIC = 10;
SearchQueryParser.GROUP = 11;
SearchQueryParser.SOURCE = 12;
SearchQueryParser.SOURCEIP = 13;
SearchQueryParser.TASK = 14;
SearchQueryParser.WS = 15;

SearchQueryParser.RULE_searchEntry = 0;
SearchQueryParser.RULE_searchQuery = 1;
SearchQueryParser.RULE_searchOperation = 2;
SearchQueryParser.RULE_searchSource = 3;
SearchQueryParser.RULE_searchIP = 4;
SearchQueryParser.RULE_searchType = 5;
SearchQueryParser.RULE_searchTask = 6;

class SearchEntryContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = SearchQueryParser.RULE_searchEntry;
    }

	searchQuery = function(i) {
	    if(i===undefined) {
	        i = null;
	    }
	    if(i===null) {
	        return this.getTypedRuleContexts(SearchQueryContext);
	    } else {
	        return this.getTypedRuleContext(SearchQueryContext,i);
	    }
	};

	enterRule(listener) {
	    if(listener instanceof SearchQueryListener ) {
	        listener.enterSearchEntry(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof SearchQueryListener ) {
	        listener.exitSearchEntry(this);
		}
	}


}



class SearchQueryContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = SearchQueryParser.RULE_searchQuery;
    }

	searchOperation() {
	    return this.getTypedRuleContext(SearchOperationContext,0);
	};

	searchSource() {
	    return this.getTypedRuleContext(SearchSourceContext,0);
	};

	searchIP() {
	    return this.getTypedRuleContext(SearchIPContext,0);
	};

	searchType() {
	    return this.getTypedRuleContext(SearchTypeContext,0);
	};

	searchTask() {
	    return this.getTypedRuleContext(SearchTaskContext,0);
	};

	enterRule(listener) {
	    if(listener instanceof SearchQueryListener ) {
	        listener.enterSearchQuery(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof SearchQueryListener ) {
	        listener.exitSearchQuery(this);
		}
	}


}



class SearchOperationContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = SearchQueryParser.RULE_searchOperation;
    }

	SHOW() {
	    return this.getToken(SearchQueryParser.SHOW, 0);
	};

	DISPLAY() {
	    return this.getToken(SearchQueryParser.DISPLAY, 0);
	};

	GET() {
	    return this.getToken(SearchQueryParser.GET, 0);
	};

	enterRule(listener) {
	    if(listener instanceof SearchQueryListener ) {
	        listener.enterSearchOperation(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof SearchQueryListener ) {
	        listener.exitSearchOperation(this);
		}
	}


}



class SearchSourceContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = SearchQueryParser.RULE_searchSource;
    }

	SOURCE() {
	    return this.getToken(SearchQueryParser.SOURCE, 0);
	};

	SOURCEIP() {
	    return this.getToken(SearchQueryParser.SOURCEIP, 0);
	};

	enterRule(listener) {
	    if(listener instanceof SearchQueryListener ) {
	        listener.enterSearchSource(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof SearchQueryListener ) {
	        listener.exitSearchSource(this);
		}
	}


}



class SearchIPContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = SearchQueryParser.RULE_searchIP;
    }

	ONLYIP() {
	    return this.getToken(SearchQueryParser.ONLYIP, 0);
	};

	enterRule(listener) {
	    if(listener instanceof SearchQueryListener ) {
	        listener.enterSearchIP(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof SearchQueryListener ) {
	        listener.exitSearchIP(this);
		}
	}


}



class SearchTypeContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = SearchQueryParser.RULE_searchType;
    }

	METRIC() {
	    return this.getToken(SearchQueryParser.METRIC, 0);
	};

	LOG() {
	    return this.getToken(SearchQueryParser.LOG, 0);
	};

	enterRule(listener) {
	    if(listener instanceof SearchQueryListener ) {
	        listener.enterSearchType(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof SearchQueryListener ) {
	        listener.exitSearchType(this);
		}
	}


}



class SearchTaskContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = SearchQueryParser.RULE_searchTask;
    }

	TASK() {
	    return this.getToken(SearchQueryParser.TASK, 0);
	};

	enterRule(listener) {
	    if(listener instanceof SearchQueryListener ) {
	        listener.enterSearchTask(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof SearchQueryListener ) {
	        listener.exitSearchTask(this);
		}
	}


}




SearchQueryParser.SearchEntryContext = SearchEntryContext; 
SearchQueryParser.SearchQueryContext = SearchQueryContext; 
SearchQueryParser.SearchOperationContext = SearchOperationContext; 
SearchQueryParser.SearchSourceContext = SearchSourceContext; 
SearchQueryParser.SearchIPContext = SearchIPContext; 
SearchQueryParser.SearchTypeContext = SearchTypeContext; 
SearchQueryParser.SearchTaskContext = SearchTaskContext; 
