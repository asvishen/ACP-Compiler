grammar functionGrammar;

start: func; 

func :	'function' ID '(' params (','params)* ')' '<<'(block)+'>>'|
		'function' ID'(' ')' '<<'(block)+'>>'|
		'main()''<<'(block)+'>>';

params : Datatype ID;


ifstmt : 'if' '(' compexpr ')' '<<'(block)+'>>' 
	| 'if' '(' compexpr ')' '<<'(block)+'>>' 'else' '<<'(block)+'>>';
	
whilestmt: 'while' '(' compexpr ')' '<<'(block)+'>>' 
	; 

//compoundstmt :  '<<' type stmtlist '>>';


block : declStatement
			|assignmentStatment
			|ifstmt
			|whilestmt
			| ID'()'';'
			|'return' ID';'
			;


					
declStatement : Datatype ID ';';

assignmentStatment : ID '=' expression';';

expression : ID
			|NumberValue
			|BooleanValue
			|sumexpr;
	
compexpr : compexpr 'or' andcomp | andcomp;
	

andcomp : andcomp 'and' relexpr | relexpr ; 
	

relexpr : sumexpr CMPOP sumexpr 
	;

CMPOP : '<=' 
	|'>=' 
	|'<' 
	| '>' 
	| '!=' 
	| '=='
	;

sumexpr : sumexpr '+' term | sumexpr '-' term | term 
	;

term :  term '*' factor | term '/' factor | factor 
	;

factor : ID 
	| NumberValue;

//ID : NONDIGIT DIGIT | NONDIGIT
//	  ;
//
//NONDIGIT :  [a-zA-Z]+
//	;
////
//DIGIT : [0-9]+
//	;

//immutable : '(' compexpr ')' 
//	| constant ;

//constant : 'YES' 
//	| 'NO';


//		|ifStatement
//			|whileStatment
			

			
Datatype : 'int'
			|'boolean';
			
operator :   '+'
			|'*'
			|'/'
			|'%'
			|'=';
			
ID : [a-zA-Z0-9]+;
			
NumberValue : [0-9]+;

BooleanValue : 'YES' 
	| 'NO';
			
WS : [ \t\r\n]+ -> skip;