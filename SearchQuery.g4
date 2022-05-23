grammar SearchQuery;

searchEntry: searchQuery+;

searchQuery:
	searchOperation ' ' searchSource ':"' searchIP '" ' searchType ':"' searchTask '"';

searchOperation: (SHOW | DISPLAY | GET);
searchSource: (SOURCE | SOURCEIP);
searchIP: TEXT;
searchType: (METRIC | GROUP);
searchTask: TEXT;

SHOW: 'show';
DISPLAY: 'display';
GET: 'get';
METRIC: 'metric';
GROUP: 'group';

SOURCE: 'source';
SOURCEIP: 'sourceip';
TEXT: [.a-zA-Z0-9~]+;

WS: [ \n\t]+ -> skip;
