funcwoparam(name,block) ::= <<
INNERSCOPEBEGINS
<block>
SCOPEENDS
PUSH <name>
ASSIGN
>>