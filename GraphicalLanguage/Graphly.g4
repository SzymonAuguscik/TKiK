grammar Graphly;

WS : '\n' | ' ' | '\t';

CR : '\r' -> skip;

COM_SIGN : '--' ~[\r\n]* -> skip;

// body of a program

program : (('\n')* instruction ('\n')+)* canvas (('\n')+ instruction ('\n')*)* EOF;

instruction : shape | type_definition | draw | transformation | group | loop | check | WS*;

// control statements
block : (WS* instruction '\n')*;

loop : 'loop' WS+ name=NAME WS+ 'start' WS+ start=expr WS+ 'until' WS+ until=expr WS+ 'step' WS+ step=expr WS+ 'then' '\n' block WS* 'end';

check : WS* 'check' WS+ condition_block ('else' WS+ 'check' WS+ condition_block)* WS* ('else' WS+ 'then' '\n' block)? WS* 'end';

condition_block : expr WS+ 'then' '\n' WS* block;

// shapes

shape : point | segment | circle | polygon;

point : WS* 'point' WS+ NAME WS* ':' WS* x=expr WS* ',' WS* y=expr;

segment : WS* 'segment' WS+ NAME WS* ':' WS* NAME WS* ',' WS+ NAME; 

circle : WS*'circle' WS+ NAME WS* ':' WS* NAME WS* ',' WS* expr;

polygon : WS* 'polygon' WS+ NAME WS* ':' WS* NAME;

group : WS* 'group' WS+ NAME WS* ':' WS* NAME WS* (',' WS* NAME WS*)*;

groupMember : WS* NAME WS* '[' WS* expr WS* ']' WS+;

// numerical types

type_definition : num | iterator;

num : WS* 'num' WS+ NAME WS* ':' WS* expr;

iterator : WS* 'iterator' WS+ NAME WS* ':' WS* expr;

// methods

canvas : WS* 'canvas' WS* ':' WS* x=expr WS* ',' WS* y=expr WS* ',' WS* COLOR;

draw : WS* 'draw' WS+ NAME;

// transformations

transformation : fill | move | place | rotate | scale;

fill : WS* 'fill' WS+ NAME WS* ':' WS* COLOR;

move : WS* 'move' WS+ NAME WS* ':' WS* dx=expr WS* ',' WS* dy=expr;

place : WS* 'place' WS+ NAME WS* ':' WS* NAME;

rotate : WS* 'rotate' WS+ NAME WS* ':' WS* angle=expr WS* ',' WS* NAME;

scale : WS* 'scale' WS+ NAME WS* ':' WS* k=expr WS* ',' WS* NAME;

// expresion

expr  : '(' WS* expr WS* ')'                                         #parenExpr
      | op=('^'|'_'|'~') WS* expr                                    #roundingOpExpr
      | '-' WS* expr                                                 #minusOpExpr
      | left=expr WS* op=('*'|'/'|'%') WS* right=expr                #arithmeticOpExpr
      | left=expr WS* op=('+'|'-') WS* right=expr                    #arithmeticOpExpr
      | left=expr WS* op=('<='|'>'|'>='|'<'|'='|'!=') WS* right=expr #booleanOpExpr
      | '!' WS* expr                                                 #negationOpExpr
      | left=expr WS* op='&' WS* right=expr                          #booleanOpExpr
      | left=expr WS* op='|' WS* right=expr                          #booleanOpExpr
      | atom                                                         #atomExpr
      ;

atom : itr  #intAtom
     | flt  #fltAtom
     | NAME #varAtom
     ;

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

// nonterminal

COLOR : '#'[a-z]+;

flt : (DIGIT*DOT)?DIGIT+;

DOT : '.';

DIGIT : [0-9];

NAME : [A-Z][a-zA-Z0-9_]*;

itr : DIGIT+;

// TO DO 
// - deal with lack of 'and' and 'or' binary operators
// - deal with multiplication and division
// - problem with loop/check - possibility to draw before canvas
// - think about transparent color
