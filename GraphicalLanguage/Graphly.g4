grammar Graphly;

WS : '\n' | ' ' | '\r' | '\t';

COM_SIGN : '--' ~[\r\n]* -> skip;

// body of a program

program : (('\n')* instruction_without_draw ('\n')+)* canvas (('\n')+ instruction ('\n')*)* EOF;

instruction : shape | type_definition | draw | transformation | group | loop | check | WS*;

instruction_without_draw : shape | type_definition | transformation | group | loop | check | WS*;

// control statements

loop : 'loop' WS+ NAME WS+ 'start' WS+ (itr|NAME) WS+ 'until' WS+ (itr|NAME) WS+ 'step' WS+ (itr|NAME) WS+ 'then' '\n' (WS* instruction '\n')* WS* 'end';

check : WS* 'check' WS+ cond WS+ 'then' '\n' WS* (WS* instruction '\n')* ('else' WS+ 'check' WS+ cond WS+ 'then' '\n' WS* (WS* instruction '\n')*)* ('else then' '\n' (WS* instruction '\n')*)? WS* 'end';

// shapes

shape : point | segment | circle | polygon;

point : WS* 'point' WS+ NAME WS* ':' WS* operation_flt WS* ',' WS* operation_flt;

segment : WS* 'segment' WS+ NAME WS* ':' WS* NAME WS* ',' WS+ NAME; 

circle : WS*'circle' WS+ NAME WS* ':' WS* NAME WS* ',' WS* operation_flt;

polygon : WS* 'polygon' WS+ NAME WS* ':' WS* NAME;

group : WS* 'group' WS+ NAME WS* ':' WS* NAME WS* (',' WS* NAME WS*)*;

groupMember : WS* NAME WS* '[' WS* (itr|NAME) WS* ']' WS+;

// numerical types

type_definition : num | iterator;

num : WS* 'num' WS+ NAME WS* ':' WS* (signed_flt|NAME);

iterator : WS* 'iterator' WS+ NAME WS* ':' WS* (itr|NAME);

// methods

canvas : WS* 'canvas' WS* ':' WS* (signed_flt|NAME) WS* ',' WS* (signed_flt|NAME) WS* ',' WS* color;

draw : WS* 'draw' WS+ NAME;

// transformations

transformation : fill | move | place | rotate | scale;

fill : WS* 'fill' WS+ NAME WS* ':' WS* color;

move : WS* 'move' WS+ NAME WS* ':' WS* (signed_flt|NAME) WS* ',' WS* (signed_flt|NAME);

place : WS* 'place' WS+ NAME WS* ':' WS* NAME;

rotate : WS* 'rotate' WS+ NAME WS* ':' WS* (signed_flt|NAME) WS* ',' WS* NAME;

scale : WS* 'scale' WS+ NAME WS* ':' WS* operation_flt;

// operators

arithmetic : PLUS | MINUS | MULTIPLICATION | DIVISION | MODULO;

PLUS : '+';

MINUS : '-';

MULTIPLICATION : '*';

DIVISION : '/';

MODULO : '%';

logic : GREATER | LOWER | GT | LT | EQ | neq;

NEG : '!';

neq : NEG EQ;

EQ : '=';

GREATER : '>';

LOWER : '<';

GT : '>=';

LT : '<=';

cond : WS* ((signed_flt | NAME) WS* logic WS* (signed_flt | NAME)) | ((itr | NAME) WS* logic WS* (itr | NAME));

// nonterminal

signed_flt : '-'? (flt|NAME) (arithmetic (signed_flt|NAME))*;

color : '#'('red' | 'green' | 'yellow' | 'transparent' | 'black' | 'blue' | 'white' | 'orange' | 'pink');

flt : (DIGIT*DOT)?DIGIT+;

operation_flt : (flt|NAME) (arithmetic (flt|NAME))*;

DOT : '.';

DIGIT : [0-9];

NAME : [A-Z][a-zA-Z0-9_]*;

itr : DIGIT+;

// TO DO 
// - deal with lack of 'and' and 'or' binary operators
// - deal with multiplication and division
// - problem with loop/check - possibility to draw before canvas
