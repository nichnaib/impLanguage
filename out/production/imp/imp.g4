grammar imp ;


prog: st
    | st ';'prog
    ;

st  : 'skip'
    | 'input' '(' lvar ')'
    | 'output' '(' lvar ')'
    | 'while' bexp 'do' prog 'endw'
    | 'if' bexp 'then' prog 'else' prog 'fi'
    | ID ':=' exp
    | exp
    ;

lvar: ID
    | ID'.'lvar
    ;

exp : ID
    | aexp
    | bexp
    | lexp
    | mexp
    | mexp'('ID')'
    ;

aexp: INT
    | INT aop aexp
    | '('aexp')'
    | '('aexp')' aop aexp
    ;

aop : '*'
    | '/'
    | '+'
    | '-'
    ;

bexp: BOOL
    | BOOL bop bexp
    | '('bexp')'
    | '('bexp')' bop bexp
    | '!='bexp
    ;

bop : '&&'
    | '=='
    | '||'
    ;

lexp: '_'
    | lvar
    | 'push''('lexp','lexp')'
    | 'top''('lexp')'
    | 'pop''('lexp')'
    | 'cons''('lexp','lexp')'
    ;

mexp: ID ','exp
    | mexp'['ID','exp']'
    ;

BOOL: 'true'
    | 'false'
    ;

ID  : [a-zA-Z]+ ;

INT : [0-9]+ ;

WS  : [ \t\r\n]+ ->skip ;
