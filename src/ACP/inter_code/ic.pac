SCOPEBEGINS
PUSH  INNERSCOPEBEGINS
PUSH "n"
ASSIGN

INNERSCOPEBEGINS
PUSH n
PUSH 1
PUSH SUB

PUSH fact
EXECUTE

PUSH n
PUSH MUL

SCOPEENDS
INNERSCOPEBEGINS
PUSH 1

SCOPEENDS

PUSH n
PUSH 0
PUSH GTN

PUSH IF
EXECUTE

SCOPEENDS 
PUSH "fact"
ASSIGN

PUSH  4
PUSH fact
EXECUTE

PUSH "a"
ASSIGN
INNERSCOPEBEGINS

PUSH "factorial test passed "
SHOW

SCOPEENDS
INNERSCOPEBEGINS

PUSH "test failed "
SHOW


SCOPEENDS

PUSH a
PUSH 24
PUSH EQU

PUSH IF
EXECUTE

SCOPEENDS
