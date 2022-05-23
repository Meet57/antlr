// Generated from SearchQuery.g4 by ANTLR 4.10.1
// jshint ignore: start
import antlr4 from 'antlr4';


const serializedATN = [4,0,13,95,6,-1,2,0,7,0,2,1,7,1,2,2,7,2,2,3,7,3,2,
4,7,4,2,5,7,5,2,6,7,6,2,7,7,7,2,8,7,8,2,9,7,9,2,10,7,10,2,11,7,11,2,12,7,
12,1,0,1,0,1,1,1,1,1,1,1,2,1,2,1,2,1,3,1,3,1,4,1,4,1,4,1,4,1,4,1,5,1,5,1,
5,1,5,1,5,1,5,1,5,1,5,1,6,1,6,1,6,1,6,1,7,1,7,1,7,1,7,1,7,1,7,1,7,1,8,1,
8,1,8,1,8,1,8,1,8,1,9,1,9,1,9,1,9,1,9,1,9,1,9,1,10,1,10,1,10,1,10,1,10,1,
10,1,10,1,10,1,10,1,11,4,11,85,8,11,11,11,12,11,86,1,12,4,12,90,8,12,11,
12,12,12,91,1,12,1,12,0,0,13,1,1,3,2,5,3,7,4,9,5,11,6,13,7,15,8,17,9,19,
10,21,11,23,12,25,13,1,0,2,5,0,46,46,48,57,65,90,97,122,126,126,2,0,9,10,
32,32,96,0,1,1,0,0,0,0,3,1,0,0,0,0,5,1,0,0,0,0,7,1,0,0,0,0,9,1,0,0,0,0,11,
1,0,0,0,0,13,1,0,0,0,0,15,1,0,0,0,0,17,1,0,0,0,0,19,1,0,0,0,0,21,1,0,0,0,
0,23,1,0,0,0,0,25,1,0,0,0,1,27,1,0,0,0,3,29,1,0,0,0,5,32,1,0,0,0,7,35,1,
0,0,0,9,37,1,0,0,0,11,42,1,0,0,0,13,50,1,0,0,0,15,54,1,0,0,0,17,61,1,0,0,
0,19,67,1,0,0,0,21,74,1,0,0,0,23,84,1,0,0,0,25,89,1,0,0,0,27,28,5,32,0,0,
28,2,1,0,0,0,29,30,5,58,0,0,30,31,5,34,0,0,31,4,1,0,0,0,32,33,5,34,0,0,33,
34,5,32,0,0,34,6,1,0,0,0,35,36,5,34,0,0,36,8,1,0,0,0,37,38,5,115,0,0,38,
39,5,104,0,0,39,40,5,111,0,0,40,41,5,119,0,0,41,10,1,0,0,0,42,43,5,100,0,
0,43,44,5,105,0,0,44,45,5,115,0,0,45,46,5,112,0,0,46,47,5,108,0,0,47,48,
5,97,0,0,48,49,5,121,0,0,49,12,1,0,0,0,50,51,5,103,0,0,51,52,5,101,0,0,52,
53,5,116,0,0,53,14,1,0,0,0,54,55,5,109,0,0,55,56,5,101,0,0,56,57,5,116,0,
0,57,58,5,114,0,0,58,59,5,105,0,0,59,60,5,99,0,0,60,16,1,0,0,0,61,62,5,103,
0,0,62,63,5,114,0,0,63,64,5,111,0,0,64,65,5,117,0,0,65,66,5,112,0,0,66,18,
1,0,0,0,67,68,5,115,0,0,68,69,5,111,0,0,69,70,5,117,0,0,70,71,5,114,0,0,
71,72,5,99,0,0,72,73,5,101,0,0,73,20,1,0,0,0,74,75,5,115,0,0,75,76,5,111,
0,0,76,77,5,117,0,0,77,78,5,114,0,0,78,79,5,99,0,0,79,80,5,101,0,0,80,81,
5,105,0,0,81,82,5,112,0,0,82,22,1,0,0,0,83,85,7,0,0,0,84,83,1,0,0,0,85,86,
1,0,0,0,86,84,1,0,0,0,86,87,1,0,0,0,87,24,1,0,0,0,88,90,7,1,0,0,89,88,1,
0,0,0,90,91,1,0,0,0,91,89,1,0,0,0,91,92,1,0,0,0,92,93,1,0,0,0,93,94,6,12,
0,0,94,26,1,0,0,0,3,0,86,91,1,6,0,0];


const atn = new antlr4.atn.ATNDeserializer().deserialize(serializedATN);

const decisionsToDFA = atn.decisionToState.map( (ds, index) => new antlr4.dfa.DFA(ds, index) );

export default class SearchQueryLexer extends antlr4.Lexer {

    static grammarFileName = "SearchQuery.g4";
    static channelNames = [ "DEFAULT_TOKEN_CHANNEL", "HIDDEN" ];
	static modeNames = [ "DEFAULT_MODE" ];
	static literalNames = [ null, "' '", "':\"'", "'\" '", "'\"'", "'show'", 
                         "'display'", "'get'", "'metric'", "'group'", "'source'", 
                         "'sourceip'" ];
	static symbolicNames = [ null, null, null, null, null, "SHOW", "DISPLAY", 
                          "GET", "METRIC", "GROUP", "SOURCE", "SOURCEIP", 
                          "TEXT", "WS" ];
	static ruleNames = [ "T__0", "T__1", "T__2", "T__3", "SHOW", "DISPLAY", 
                      "GET", "METRIC", "GROUP", "SOURCE", "SOURCEIP", "TEXT", 
                      "WS" ];

    constructor(input) {
        super(input)
        this._interp = new antlr4.atn.LexerATNSimulator(this, atn, decisionsToDFA, new antlr4.PredictionContextCache());
    }

    get atn() {
        return atn;
    }
}

SearchQueryLexer.EOF = antlr4.Token.EOF;
SearchQueryLexer.T__0 = 1;
SearchQueryLexer.T__1 = 2;
SearchQueryLexer.T__2 = 3;
SearchQueryLexer.T__3 = 4;
SearchQueryLexer.SHOW = 5;
SearchQueryLexer.DISPLAY = 6;
SearchQueryLexer.GET = 7;
SearchQueryLexer.METRIC = 8;
SearchQueryLexer.GROUP = 9;
SearchQueryLexer.SOURCE = 10;
SearchQueryLexer.SOURCEIP = 11;
SearchQueryLexer.TEXT = 12;
SearchQueryLexer.WS = 13;



