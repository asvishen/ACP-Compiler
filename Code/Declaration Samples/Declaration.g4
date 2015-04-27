grammar Declaration;


declStatement : Datatype ID ';'			#declare	
				;

assignmentStatment : ID '=' expression';'#assign
					;

expression :BooleanValue				#bool
			|sumexpr					#gotosumexp
			;							

sumexpr : sumexpr '+' term 				#add		
			| sumexpr '-' term			#sub
			|term						#gototerm
			;						

term :  term '*' factor 				#mul			
		| term '/' factor				#div
		|factor							#gotofactor
		; 								

factor : ID 							#id							
		| NumberValue					#number
		;
	
NumberValue : [0-9]+;

BooleanValue : 'YES' 
				| 'NO';

Datatype : 'int'
			|'boolean';

ID : [a-zA-Z0-9]+;