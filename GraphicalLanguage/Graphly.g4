grammar Graphly;

WS 				
	:
	'\n' 
	| ' ' 
	| '\t'
	;

CR
	: 
	'\r' -> skip;

COM_SIGN 		
	: 
	'--' ~[\r\n]* -> skip;

// body of a program

program
	:
	(('\n')* instruction WS* (COM_SIGN)? ('\n')+)* 
	canvas WS* (COM_SIGN)?
	(('\n')+ instruction WS* (COM_SIGN)? ('\n')*)* 
	EOF
	;

instruction 
	: 
	shape 
	| type_definition 
	| draw 
	| transformation 
	| group 
	| loop 
	| check
	| assign
	| WS*
	;

// control statements
block 			
	: 
	(WS* instruction WS* '\n')*
	;

loop
	: 
	'loop' WS+
	name=NAME WS+ 
	'start' WS+ start=expr WS+ 
	'until' WS+ until=expr WS+ 
	'step' WS+ step=expr WS+ 
	'then' WS* '\n' 
	block WS* 
	'end'
	;

check 
	: 
	WS* 'check' WS+ condition_block 
	('else' WS+ 'check' WS+ condition_block)* WS* 
	('else' WS+ 'then' '\n' block)? WS* 
	'end'
	;

condition_block 
	: 
	expr WS+ 
	'then' '\n' WS* 
	block
	;

// shapes

shape 
	: 
	point 
	| segment 
	| circle 
	| polygon
	;

point 
	: 
	WS* 'point' WS+ NAME WS* ':' 
	WS* x=expr WS* ',' WS* y=expr
	;

segment 
	: 
	WS* 'segment' WS+ NAME WS* ':' 
	WS* NAME WS* ',' WS+ NAME
	; 

circle 
	: 
	WS*'circle' WS+ NAME WS* ':' 
	WS* NAME WS* ',' WS* expr
	;

polygon 
	: 
	WS* 'polygon' WS+ NAME WS* ':' 
	WS* NAME
	;

groupMember 
	: 
	WS* NAME WS* '[' WS* expr WS* ']'
	;
	
transformable
	:
	NAME 
	| groupMember
	;

group 
	: 
	WS* 'group' WS* '<' WS* TYPE WS* '>' WS+ NAME WS* ':' 
	WS* NAME WS* (',' WS* NAME WS*)*
	;

// numerical types

type_definition 
	: 
	num 
	| iterator
	;

num 
	: 
	WS* 'num' WS+ NAME WS* ':' 
	WS* expr
	;

iterator 
	: 
	WS* 'iterator' WS+ NAME WS* ':'
	WS* expr
	;

// methods

canvas 
	: 
	WS* 'canvas' WS* ':'
	WS* x=expr WS* ',' WS* y=expr WS* ',' WS* COLOR
	;

draw 
	: 
	WS* 'draw' WS+ arg=transformable
	;

// transformations

transformation 
	: 
	fill 
	| move 
	| place 
	| rotate 
	| scale
	;

fill 
	: 
	WS* 'fill' WS+ arg=transformable WS* ':'
	WS* COLOR
	;

move 
	: 
	WS* 'move' WS+ arg=transformable WS* ':' 
	WS* dx=expr WS* ',' WS* dy=expr
	;

place 
	: 
	WS* 'place' WS+ arg1=transformable WS* ':' 
	WS* arg2=transformable
	;

rotate 
	: 
	WS* 'rotate' WS+ arg1=transformable WS* ':' 
	WS* angle=expr WS* ',' WS* arg2=transformable
	;

scale 
	: 
	WS* 'scale' WS+ arg1=transformable WS* ':' 
	WS* k=expr WS* ',' WS* arg2=transformable
	;

assign
	:
	WS* 'assign' WS+ arg1=transformable WS* ':' WS* arg2=transformable #copyAssign
	| WS* 'assign' WS+ arg1=transformable WS* ':' WS* arg2=expr        #numAssign
	;

// expression

expr  
	: 
	'(' WS* expr WS* ')'                                           #parenExpr
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

atom 
	: 
	itr    #intAtom
    | flt  #fltAtom
    | NAME #varAtom
    ;

// operators

arithmetic 
	: 
	PLUS 
	| MINUS 
    | MULTIPLICATION 
	| DIVISION 
	| MODULO
	;

PLUS 
	: 
	'+'
	;

MINUS 
	: 
	'-'
	;

MULTIPLICATION 
	: 
	'*'
	;

DIVISION 
	: 
	'/'
	;

MODULO 
	: 
	'%'
	;

logic 
	: 
	GREATER 
	| LOWER 
	| GT 
	| LT 
	| EQ 
	| neq
	;

NEG 
	: 
	'!'
	;

neq 
	: 
	NEG EQ
	;

EQ 
	: 
	'='
	;

GREATER 
	: 
	'>'
	;

LOWER 
	: 
	'<'
	;

GT 
	: 
	'>='
	;

LT 
	: 
	'<='
	;

// terminal

TYPE
	:
	'points'
	| 'segments'
	| 'circles'
	| 'shapes'
	| 'polygons'
	;

COLOR 
	:
	'#'[a-z]+
	;

flt 
	: 
	(DIGIT*DOT)?DIGIT+
	;

DOT 
	: 
	'.'
	;

DIGIT 
	: 
	[0-9]
	;

NAME 
	: 
	[A-Z][a-zA-Z0-9_]*
	;

itr 
	: 
	DIGIT+
	;
