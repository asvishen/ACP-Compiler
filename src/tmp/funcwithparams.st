funcwithparams(name,param,block) ::= "
INNERSCOPEBEGINS
<param>
<block>
SCOPEENDS 
PUSH <name>
ASSIGN
"

