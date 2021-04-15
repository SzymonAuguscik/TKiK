grammar Graphly;

// body of a program

program : (('\n')* instruction_without_draw ('\n')+)* canvas (('\n')+ instruction ('\n')*)* EOF;

instruction : shape | type_definition | draw | transformation | group | loop | check;

instruction_without_draw : shape | type_definition | transformation | group | loop | check;

// control statements

loop : 'loop' WS+ NAME WS+ 'start' WS+ (ITER|NAME) WS+ 'until' WS+ (ITER|NAME) WS+ 'step' WS+ (ITER|NAME) '\n' ('\t' instruction '\n')* 'end';

check : WS* 'check' WS+ COND '\n' ('\t' instruction '\n')* ('else' WS+ 'check' WS+ COND '\n' ('\t' instruction '\n')*)* ('else' ('\t' instruction '\n')*)? WS* 'end';

// shapes

shape : point | segment | circle | polygon;

point : WS* 'point' WS+ NAME WS* ':' WS* (FLOAT|NAME) WS* ',' WS* (FLOAT|NAME);

segment : WS* 'segment' WS+ NAME WS* ':' WS* NAME WS* ',' WS+ NAME; 

circle : WS*'circle' WS+ NAME WS* ':' WS* NAME WS* ',' WS* (FLOAT|NAME);

polygon : WS* 'polygon' WS+ NAME WS* ':' WS* NAME;

group : WS* 'group' WS+ NAME WS* ':' WS* NAME WS* (',' WS* NAME WS*)*;

groupMember : WS* NAME WS* '[' WS* (ITER|NAME) WS* ']' WS+;

// numerical types

type_definition : num | iterator;

num : WS* 'num' WS+ NAME WS* ':' WS* (SIGNED_FLOAT | NAME);

iterator : WS* 'iterator' WS+ NAME WS* ':' WS* (ITER|NAME);

// methods

canvas : WS* 'canvas' WS* ':' WS* (SIGNED_FLOAT|NAME) WS* ',' WS* (SIGNED_FLOAT|NAME) WS* ',' WS* COLOR;

draw : WS* 'draw' WS+ NAME;

// transformations

transformation : fill | move | place | rotate | scale;

fill : WS* 'fill' WS+ NAME WS* ':' WS* COLOR;

move : WS* 'move' WS+ NAME WS* ':' WS* (SIGNED_FLOAT|NAME) WS* ',' WS* (SIGNED_FLOAT|NAME);

place : WS* 'place' WS+ NAME WS* ':' WS* NAME;

rotate : WS* 'rotate' WS+ NAME WS* ':' WS* (SIGNED_FLOAT|NAME) WS* ',' WS* NAME;

scale : WS* 'scale' WS+ NAME WS* ':' WS* (FLOAT|NAME);

// operators

ARITHMETIC : PLUS | MINUS | MULTIPLICATION | DIVISION | MODULO;

PLUS : '+';

MINUS : '-';

MULTIPLICATION : '*';

DIVISION : '/';

MODULO : '%';

LOGIC : GREATER | LOWER | GT | LT | EQ | NEQ;

NEG : '!';

NEQ : NEG EQ;

EQ : '=';

GREATER : '>';

LOWER : '<';

GT : '>=';

LT : '<=';

COND : WS* ((SIGNED_FLOAT | NAME) WS* LOGIC WS* (SIGNED_FLOAT | NAME)) | ((ITER | NAME) WS* LOGIC WS* (ITER | NAME));

// nonterminal

SIGNED_FLOAT : '-'? (FLOAT);

COLOR : '#'('red' | 'green' | 'yellow' | 'transparent' | 'black' | 'blue' | 'white' | 'orange' | 'pink');

FLOAT : (DIGIT*'.')?DIGIT+;

ITER : DIGIT+;

DIGIT : [0-9];

WS : '\n' | ' ' | '\r' | '\t';

NAME : [A-Z][a-zA-Z0-9_]*;

// TO DO 
// - possible FLOAT - FLOAT problem (e.g. for 5 - 7, it should be positive after all)
// - deal with lack of 'and' and 'or' binary operators
// - deal with multiplication and division
