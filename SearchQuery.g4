grammar SearchQuery;

searchEntry: searchQuery+;

searchQuery: searchOperation ' ' searchSource ':"' searchIP '" ' searchType ':"' searchTask '"';

searchOperation: (SHOW|DISPLAY|GET);
searchSource: (SOURCE|SOURCEIP);
searchIP: TEXT;
searchType: (METRIC|GROUP);
searchTask: TEXT;

SHOW: 'SHOW';
DISPLAY: 'DISPLAY';
GET: 'GET';
METRIC: 'metric';
GROUP:'group';

SOURCE: 'source';
SOURCEIP: 'sourceip;';
TEXT: [a-zA-Z.]+;
