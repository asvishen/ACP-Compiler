grammar ACP;

start: func+;

func 	:	'function' ID '(' params ')' '<<' (block)+ '>>'   		#funcwithparam
		|'function' ID'(' ')' '<<'(block)+'>>'			  			#funcwithoutparam
		|(block)+										  			#justAnotherBlock
		;
params : Datatype ID;


ifstmt : 'if' '(' compexpr ')' '<<'(block)+'>>' 					#ifonly
	| 'if' '(' compexpr ')' '<<'(block)+'>>' 'else' elsepart		#ifwithout
	;
	
whilestmt: 'while' '(' compexpr ')' '<<'(block)+'>>' 				
	; 

elsepart: '<<'(block)+'>>'
		;


compexpr : compexpr 'or' andcomp  									#or
			|andcomp												#orwithout
		;								

andcomp : andcomp 'and' relexpr 									#and
			|relexpr 												#andwithout
		; 
	

relexpr : sumexpr CMPOP sumexpr 									#comp
	;
	
CMPOP : '<=' 
	|'>=' 
	|'<' 
	| '>'  
	| '=='
	;

block : 	 assignmentStatment
			| ifstmt
			| whilestmt
			| call
			| returnstmt
			| printstmt
			| stackdecl
			| stackoperation
			;

printstmt : 'print' '[' ID+ ']' ';' 	#printString
			| 'print' ID ';'					#printvariable
			;

returnstmt : 'return' sumexpr';'
		;

call : ID '(' sumexpr ')'						#simplecall
			//| ID '=' ID'(' sumexpr ')'';'			#complexcall
	;

stackdecl: 'stack' ID';';

stackoperation: ID'.' 'push' '(' factor ')' ';'			#stackpush
				|ID'.' 'pop' '(' ')' ';'				#stackpop
				|ID'.' 'show' '(' ')' ';'				#stackshow
				;
	
assignmentStatment : Datatype ID '=' sumexpr';' 					#assign
					| ID '=' sumexpr';'								#assignIncrDecr
					;
						

sumexpr : sumexpr '+' term 											#add		
			| sumexpr '-' term										#sub
			|term													#gototerm
			;						

term :  term '*' factor 											#mul			
		| term '/' factor											#div
		| factor													#gotofactor
		; 								

factor : ID 														#id							
		| NumberValue												#number
		| BooleanValue												#boolean
		| call														#callfunc
		;
	
NumberValue : [0-9]+;

BooleanValue : 'YES' 
				| 'NO';

Datatype : 'int'
			|'boolean'
			;

ID : [a-zA-Z0-9]+;

WS : [ \t\r\n]+ -> skip;