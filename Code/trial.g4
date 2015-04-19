grammar trial;

start : 'function' NAME '(' (params)+ ')'|
		'function' NAME'('')';

params : 'int' NAME ;

NAME : [a-zA-Z] ;

WS : [ \t\n\r] -> skip;