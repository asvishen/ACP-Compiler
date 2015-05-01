grammar Integrate;

start: '<<' func + '>>' ; 

func :	'function' ID '(' params ')' '<<' (block)+ '>>'   #funcwithparam
		|'function' ID'(' ')' '<<'(block)+'>>'						#funcwithoutparam
		|'main()''<<' block'>>'									#main
		|(block)+											#justAnotherBlock
		;
params : Datatype ID;


ifstmt : 'if' '(' compexpr ')' '<<'(block)+'>>' 						#ifonly
	| 'if' '(' compexpr ')' '<<'(block)+'>>' 'else' elsepart			#ifwithout
	;
	
whilestmt: 'while' '(' compexpr+ ')' '<<'(block)+'>>' 				
	; 

elsepart: '<<'(block)+'>>'
		;

//compoundstmt :  '<<' type stmtlist '>>';

//compexpr : compexpr 'or' andcomp | andcomp;								
//	
//
//andcomp : andcomp 'and' relexpr | relexpr ; 
	

compexpr : sumexpr CMPOP sumexpr 		#comp
	;
	
CMPOP : '<=' 
	|'>=' 
	|'<' 
	| '>' 
	| '!=' 
	| '=='
	;

block : 	 assignmentStatment
			| ifstmt
			| whilestmt
			| call
			| returnstmt
			| printstmt
			;

printstmt : 'print' '[' ID+ ']' ';';

returnstmt : 'return' sumexpr';'
		;

call : ID '(' sumexpr ')' 			
	;

assignmentStatment : Datatype ID '=' sumexpr';' #assign
					;
						

sumexpr : sumexpr '+' term 				#add		
			| sumexpr '-' term			#sub
			|term						#gototerm
			;						

term :  term '*' factor 				#mul			
		| term '/' factor				#div
		| factor						#gotofactor
		; 								

factor : ID 							#id							
		| NumberValue					#number
		| BooleanValue					#boolean
		| call							#callfunc
		;
	
NumberValue : [0-9]+;

BooleanValue : 'YES' 
				| 'NO';

Datatype : 'int'
			|'boolean';

ID : [a-zA-Z0-9]+;

WS : [ \t\r\n]+ -> skip;