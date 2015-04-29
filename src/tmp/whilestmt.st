whilestmt(cond, block) ::= <<
INNERSCOPEBEGINS
<block>
SCOPEENDS
INNERSCOPEBEGINS
<cond>
SCOPEENDS
>>