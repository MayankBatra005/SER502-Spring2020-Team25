grammar Sparky;

program: LIVE ball DIE;
ball: expression* | declare* expression*;


declare:
(datatype STUFF EQUALTO NUMBER SEMICOLON)|
(datatype STUFF SEMICOLON)|
(HAINA STUFF EQUALTO BOOLEANVALUE SEMICOLON)|
(HAINA STUFF SEMICOLON)| stringdatatype STUFF EQUALTO STRINGLITERAL SEMICOLON | stringdatatype STUFF SEMICOLON;
		

/*
expression: loopum SEMICOLON| expression PLUS term SEMICOLON
				| expression MINUS term SEMICOLON| term  SEMICOLON| assignment| yesnostatement;
*/
// removing left recursion by alpha-beta rule.

expression1 
: 
assignment e1 
| loopum SEMICOLON e1 
| term  SEMICOLON e1
;
expression
 : assignment
 | ifte
 | loopum
  |ternary_operator
  |print;
  
e1
: PLUS term SEMICOLON e1
| MINUS term SEMICOLON e1 
| yesnostatement e1 
|
;


loopum : loop_for|loop_while | loop_for_range;

loop_for: 'for' LSmoothBrace for_declare? ';' for_expression? ';' for_expr? RSmoothBrace in_loop;
for_expr: STUFF EQUALTO expr;
for_expression :expr YESNOOPERATOR expr;
for_declare:datatype STUFF EQUALTO NUMBER;

loop_for_range: 'for'  STUFF 'in' 'range' LSmoothBrace NUMBER COMMA NUMBER RSmoothBrace LCurlyBrace in_loop RCurlyBrace;

loop_while
 : WHILE yesnostatement in_loop
 ;

loopum1 
:IF term2 THEN  in_loop (ELSE  term2)? FI 
|  WHILE  term2 LOOP in_loop  POOL
;

ifte
 : IF yesnostatement in_loop ('warna' in_loop)? FI
 ;

 ternary_operator: IF yesnostatement '?' in_loop ':' in_loop;              

/*term: term MUL term2
      |term DIV term2 | NUMBER | STUFF; */
// removing left recursion by alpha-beta rule.

term: NUMBER | STUFF | STUFF op=(MUL | DIV) term | NUMBER  op=(MUL | DIV) term;
expr: term | term op=(PLUS | MINUS) expr | NOT expr;
yesnostatement : booleanvalue | expr YESNOOPERATOR expr |yesnostatement ANDOROPERATOR yesnostatement;
ANDOROPERATOR: AND|OR;



term1
: MUL term2 term1 
| DIV term2 term1
|
;


 

term2
: LSmoothBrace yesnostatement RSmoothBrace
;

in_loop: LCurlyBrace ball RCurlyBrace| expression;				 


assignedstuff
: NUMBER
| BOOLEANVALUE
;
assignment
 : STUFF EQUALTO expr SEMICOLON
 ;
//YESNOSTATEMENT
yesnostatement
: BOOLEANVALUE
| expression YESNOOPERATOR expression
;

AND: 'and';
OR: 'or';
NOT:'not';

//primitive types
datatype
:  
| INTEGER 
| DOUBLE 
| DECIMAL 
| CHAR
;
stringdatatype: STRING;
HAINA: 'haina';
haina:'bool';






print:'print' LSmoothBrace expr RSmoothBrace SEMICOLON;


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
: 'yup'
|'nope'
;

yup
: 'true'
;
nope
: 'false'
;

//IFTE
IF 
: 'if'
;
warna 
:
'else'
;

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

DQ: '"';

STRINGLITERAL: DQ (~["\\\r\n])* DQ;

WS
: [ \t\r\n\f]+ -> skip
;

LIVE: 'Live';
DIE: 'Die';
FI: 'fi';

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
