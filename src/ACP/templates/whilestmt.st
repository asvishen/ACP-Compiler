whilestmt(cond, block) ::= <<
WHILE
INNERSCOPEBEGINS
<block>
SCOPEENDS
INNERSCOPEBEGINS
<cond>
SCOPEENDS

>>