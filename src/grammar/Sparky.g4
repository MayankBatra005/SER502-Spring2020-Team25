grammar Sparky;


//prog : LIVE declare* ball DIE;
prog: declare* ball;
ball : expression* ;

declare
:
datatype STUFF EQUALTO assignedstuff SEMICOLON
|  datatype STUFF SEMICOLON
;
		

/*
expression: loopum SEMICOLON| expression PLUS term SEMICOLON
				| expression MINUS term SEMICOLON| term  SEMICOLON| assignment| yesnostatement;
*/
// removing left recursion by alpha-beta rule.

expression 
: 
assignment e1 
| loopum SEMICOLON e1 
| term  SEMICOLON e1
;
e1
: PLUS term SEMICOLON e1
| MINUS term SEMICOLON e1 
| yesnostatement e1 
|
;




loopum 
:IF term2 THEN  in_loop (ELSE  term2)? FI 
|  WHILE  term2 LOOP in_loop  POOL
;

               

/*term: term MUL term2
      |term DIV term2 | NUMBER | STUFF; */
// removing left recursion by alpha-beta rule.

term 
: NUMBER term1 
| STUFF term1
;

term1
: MUL term2 term1 
| DIV term2 term1
|
;


term2
: LSmoothBrace yesnostatement RSmoothBrace
;

in_loop
: LCurlyBrace expression SEMICOLON RCurlyBrace
;			 


assignedstuff
: NUMBER
| BOOLEANVALUE
;

assignment
: STUFF EQUALTO expression
;

//YESNOSTATEMENT
yesnostatement
: BOOLEANVALUE
| expression YESNOOPERATOR expression
;

//primitive types
datatype
: YUPNUP 
| INTEGER 
| STRING 
| DOUBLE 
| DECIMAL 
| CHAR
;

YUPNUP
: 'boolean'
;

INTEGER
: 'int'
;

STRING
: 'string'
;
DOUBLE
: 'double'
;
DECIMAL
: 'float'
;
CHAR 
: 'char'
;

//NUMBER
NUMBER
: [0-9]+
;

//STUFF
STUFF
: [a-zA-Z_] [a-zA-Z_0-9]*
;

//BOOLEANVALUE
BOOLEANVALUE
: YUP
|NOPE
;

YUP
: 'true'
;
NOPE
: 'false'
;

//IFTE
IF 
: 'if'
;
ELSE
:'else'
;
// Correcting code for while 

statement
	:	statementWithoutTrailingSubstatement
	|	labeledStatement
	|	ifThenStatement
	|	ifThenElseStatement
	|	whileStatement
	|	forStatement
	;

whileStatement
	:	'while' '(' expression ')' statement
	;

expression
	:	lambdaExpression
	|	assignmentExpression
	;


WHILE : 'while';
// Test while 
WHILE
: 'while'
;

//Separators
LSmoothBrace 
: '('
;
RSmoothBrace 
: ')'
;
LCurlyBrace  
: '{'
;
RCurlyBrace  
: '}'
;
LSquareBrace 
: '['
;
RSquareBrace 
: ']'
;
SEMICOLON    
: ';'
;
COMMA        
:  ','
;

//Operators
YESNOOPERATOR
: ASSEQ
| LESS_THAN
| MORE_THAN 
| LESS_THAN_EQ 
| MORE_THAN_EQ 
;
EQUALTO 
: '='
;
ASSEQ 
: '=='
;
PLUS
: '+'
;
MINUS 
: '-'
;
MUL 
: '*'
;
DIV 
: '/'
;
LESS_THAN 
: '<'
;
MORE_THAN
: '>'
;
LESS_THAN_EQ 
: '<='
;
MORE_THAN_EQ 
: '>='
;

WS
: [ \t\r\n\f]+ -> skip
;


LIVE
: L I V E
;
DIE
: D I E
;
FI
: F I
;
THEN 
: T H E N
;
LOOP 
: L O O P
; 
POOL 
: P O O L
;
fragment T
: [tT]
;
fragment H
: [hH]
;
fragment E
: [eE]
;
fragment N
: [nN]
;
fragment I
: [iI]
;
fragment L
: [lL]
;
fragment O
: [oO]
;
fragment P
: [pP]
;
fragment F
: [fF]
;
fragment V
: [vV]
;
fragment D
: [dD]
;
