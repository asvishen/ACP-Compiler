ifstmt(cond, truestmt, elsestmt) ::= <<
INNERSCOPEBEGINS
<truestmt>
SCOPEENDS
INNERSCOPEBEGINS
<elsestmt>
SCOPEENDS
<cond>
PUSH IF
EXECUTE

>>
