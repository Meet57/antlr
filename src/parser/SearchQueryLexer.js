// Generated from SearchQuery.g4 by ANTLR 4.10.1
// jshint ignore: start
import antlr4 from 'antlr4';


const serializedATN = [4,0,12,87,6,-1,2,0,7,0,2,1,7,1,2,2,7,2,2,3,7,3,2,
4,7,4,2,5,7,5,2,6,7,6,2,7,7,7,2,8,7,8,2,9,7,9,2,10,7,10,2,11,7,11,1,0,1,
0,1,1,1,1,1,1,1,2,1,2,1,2,1,3,1,3,1,4,1,4,1,4,1,4,1,4,1,5,1,5,1,5,1,5,1,
5,1,5,1,5,1,5,1,6,1,6,1,6,1,6,1,7,1,7,1,7,1,7,1,7,1,7,1,7,1,8,1,8,1,8,1,
8,1,8,1,8,1,9,1,9,1,9,1,9,1,9,1,9,1,9,1,10,1,10,1,10,1,10,1,10,1,10,1,10,
1,10,1,10,1,10,1,11,4,11,84,8,11,11,11,12,11,85,0,0,12,1,1,3,2,5,3,7,4,9,
5,11,6,13,7,15,8,17,9,19,10,21,11,23,12,1,0,1,3,0,46,46,65,90,97,122,87,
0,1,1,0,0,0,0,3,1,0,0,0,0,5,1,0,0,0,0,7,1,0,0,0,0,9,1,0,0,0,0,11,1,0,0,0,
0,13,1,0,0,0,0,15,1,0,0,0,0,17,1,0,0,0,0,19,1,0,0,0,0,21,1,0,0,0,0,23,1,
0,0,0,1,25,1,0,0,0,3,27,1,0,0,0,5,30,1,0,0,0,7,33,1,0,0,0,9,35,1,0,0,0,11,
40,1,0,0,0,13,48,1,0,0,0,15,52,1,0,0,0,17,59,1,0,0,0,19,65,1,0,0,0,21,72,
1,0,0,0,23,83,1,0,0,0,25,26,5,32,0,0,26,2,1,0,0,0,27,28,5,58,0,0,28,29,5,
34,0,0,29,4,1,0,0,0,30,31,5,34,0,0,31,32,5,32,0,0,32,6,1,0,0,0,33,34,5,34,
0,0,34,8,1,0,0,0,35,36,5,83,0,0,36,37,5,72,0,0,37,38,5,79,0,0,38,39,5,87,
0,0,39,10,1,0,0,0,40,41,5,68,0,0,41,42,5,73,0,0,42,43,5,83,0,0,43,44,5,80,
0,0,44,45,5,76,0,0,45,46,5,65,0,0,46,47,5,89,0,0,47,12,1,0,0,0,48,49,5,71,
0,0,49,50,5,69,0,0,50,51,5,84,0,0,51,14,1,0,0,0,52,53,5,109,0,0,53,54,5,
101,0,0,54,55,5,116,0,0,55,56,5,114,0,0,56,57,5,105,0,0,57,58,5,99,0,0,58,
16,1,0,0,0,59,60,5,103,0,0,60,61,5,114,0,0,61,62,5,111,0,0,62,63,5,117,0,
0,63,64,5,112,0,0,64,18,1,0,0,0,65,66,5,115,0,0,66,67,5,111,0,0,67,68,5,
117,0,0,68,69,5,114,0,0,69,70,5,99,0,0,70,71,5,101,0,0,71,20,1,0,0,0,72,
73,5,115,0,0,73,74,5,111,0,0,74,75,5,117,0,0,75,76,5,114,0,0,76,77,5,99,
0,0,77,78,5,101,0,0,78,79,5,105,0,0,79,80,5,112,0,0,80,81,5,59,0,0,81,22,
1,0,0,0,82,84,7,0,0,0,83,82,1,0,0,0,84,85,1,0,0,0,85,83,1,0,0,0,85,86,1,
0,0,0,86,24,1,0,0,0,2,0,85,0];


const atn = new antlr4.atn.ATNDeserializer().deserialize(serializedATN);

const decisionsToDFA = atn.decisionToState.map( (ds, index) => new antlr4.dfa.DFA(ds, index) );

export default class SearchQueryLexer extends antlr4.Lexer {

    static grammarFileName = "SearchQuery.g4";
    static channelNames = [ "DEFAULT_TOKEN_CHANNEL", "HIDDEN" ];
	static modeNames = [ "DEFAULT_MODE" ];
	static literalNames = [ null, "' '", "':\"'", "'\" '", "'\"'", "'SHOW'", 
                         "'DISPLAY'", "'GET'", "'metric'", "'group'", "'source'", 
                         "'sourceip;'" ];
	static symbolicNames = [ null, null, null, null, null, "SHOW", "DISPLAY", 
                          "GET", "METRIC", "GROUP", "SOURCE", "SOURCEIP", 
                          "TEXT" ];
	static ruleNames = [ "T__0", "T__1", "T__2", "T__3", "SHOW", "DISPLAY", 
                      "GET", "METRIC", "GROUP", "SOURCE", "SOURCEIP", "TEXT" ];

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



