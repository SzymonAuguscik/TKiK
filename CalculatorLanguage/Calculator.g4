grammar Calculator;

expression : operation ((PLUS | MINUS) operation)*;

operation : number ((TIMES | DIV) number)*;

number : MINUS? DIGIT + ;

DIGIT : [0-9];

PLUS: '+';

MINUS: '-';

TIMES: '*';

DIV: '/';

WHITESPACE: [ \r\n\t] + -> skip;
