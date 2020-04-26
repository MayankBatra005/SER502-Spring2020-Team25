grammar Sparky;


program: LIVE ball DIE;
ball: expression* | declare* expression*;

declare:
(datatype STUFF EQUALTO NUMBER SEMICOLON)|
(datatype STUFF SEMICOLON)|
(HAINA STUFF EQUALTO booleanvalue SEMICOLON)|
(HAINA STUFF SEMICOLON)| stringdatatype STUFF EQUALTO STRINGLITERAL SEMICOLON | stringdatatype STUFF SEMICOLON;

expression
 : assignment
 | ifte
 | loopum
 |ternary_operator
 |print;

assignment
 : STUFF EQUALTO expr SEMICOLON |
 STUFF EQUALTO yesnostatement SEMICOLON
 ;

ifte
 : IF yesnostatement in_loop ('warna' in_loop)? FI
 ;


loopum : loop_for|loop_while | loop_for_range;
loop_for: 'for' LSmoothBrace for_declare? ';' for_expression? ';' for_expr? RSmoothBrace in_loop;


										
										  
																														
loop_while
 : WHILE yesnostatement in_loop
 ;
 
 loop_for_range: 'for'  STUFF 'in' 'range' LSmoothBrace NUMBER COMMA NUMBER RSmoothBrace LCurlyBrace in_loop RCurlyBrace;
  
 
 
	
												  
 
 
 
in_loop: LCurlyBrace ball RCurlyBrace| expression;												
for_expr: STUFF EQUALTO expr;
for_expression :expr YESNOOPERATOR expr;
for_declare:datatype STUFF EQUALTO NUMBER;

term: NUMBER | STUFF | STUFF op=(MUL | DIV) term | NUMBER  op=(MUL | DIV) term;
expr: term | term op=(PLUS | MINUS) expr | NOT expr;
yesnostatement : booleanvalue | expr YESNOOPERATOR expr |yesnostatement ANDOROPERATOR yesnostatement;
ANDOROPERATOR: AND|OR;
					  
												   
		  
								 
									   
AND: 'and';
OR: 'or';
NOT:'not';


ternary_operator: yesnostatement '?' in_loop ':' in_loop;
		 
		 
		 
		   


							   
			   
print:'print' LSmoothBrace expr RSmoothBrace SEMICOLON;


LIVE: 'Live';
DIE: 'Die';
FI: 'fi';


			   
				 
				 
				 
				  
	
	
	
	
	
	
	
	











							  


							  
		   
			 


		  
			  


				




				   
				   
				  
				  

				
			



































YESNOOPERATOR: ASSEQ| LESS_THAN| MORE_THAN | LESS_THAN_EQ | MORE_THAN_EQ ;
EQUALTO : '=';
ASSEQ : '==';
LESS_THAN : '<';
MORE_THAN: '>';
LESS_THAN_EQ : '<=';
MORE_THAN_EQ : '>=';

warna :'else';

PLUS : '+';
MINUS :'-';
MUL : '*';
DIV : '/';
SEMICOLON : ';';
COMMA : ',';

LSmoothBrace : '(';
RSmoothBrace : ')';
LCurlyBrace : '{';
RCurlyBrace : '}';
DQ: '"';

STRINGLITERAL: DQ (~["\\\r\n])* DQ;



HAINA: 'haina';
haina:'bool';
datatype: INTEGER| DOUBLE | DECIMAL | CHAR | HAINA;
stringdatatype: STRING;

INTEGER: 'int';
STRING: 'string';
DOUBLE: 'double';
DECIMAL: 'float';
CHAR : 'char';


IF : 'if';

WHILE : 'while';

STUFF:[a-zA-Z_] [a-zA-Z_0-9]*;

NUMBER:[0-9]+;









WS: [ \t\r\n] -> skip;

booleanvalue: 'yup' | 'nope'; 
yup:'true';
nope:'false';
