grammar imp ;


prog: st
    | st ';'prog
    ;

st  : 'skip'
    | 'input' '(' prog ')' //invece di lvar perchè può prendere un insieme di espressioni in input da eseguire
    | 'output' '(' lexp ')' //perchè lvar è stato sostituito con lexp
    | 'while' bexp 'do' prog 'endw'
    | 'if' bexp 'then' prog 'else' prog 'fi'
    | 'var 'ID ':=' exp //modalità di definizione delle variabili
    | 'list 'ID ':=' lexp //modalità di definizione delle liste
    | 'map ' ID ':=' mexp //modalità di def delle map
    | exp // permette di eseguire operazioni senza definire le variabili
    ;
//lvar inglobata in lexp
lexp: ID
    | ID'.'lexp
    | '_'
    | 'push''('lexp','lexp')' //lexp invece di e
    | 'top''('lexp')' //rimossa da expression e inserita in lexp
    | 'pop''('lexp')'
    | 'cons''('lexp','lexp')'
    ;

exp : ID
    | aexp
    | bexp
    | lexp
    | mexp // è stata costruita una grammatica apposita per mexp
    ;

aexp: INT
    | ID // perchè prende il valore (dallo store) di una var che è stata definita
    //abbiamo utilizzato eval di javascript per la valutazione delle espressioni
    //la seguente definizione della grammatica è creata ad hoc per il corretto svolgimento
    //delle operazioni
    | INT aop aexp
    | ID aop aexp
    | '('aexp')'
    | '('aexp')' aop aexp
    ;

aop : '*'
    | '/'
    | '+'
    | '-'
    ;

bexp: BOOL
    | ID
    //uguale per aexp
    | BOOL bop bexp
    | ID bop bexp
    | '('bexp')'
    | '('bexp')' bop bexp
    | '!'bexp
    ;

bop : '&&'
    | '=='
    | '||'
    ;

//da aggiungere al paper
//le prime due operazioni sono il riempimento della stessa
mexp: '['ID ','exp']'
    | '['ID','exp']' mexp
    //questo statement permette di estrarre dalla mappa il valore della chiave
    //dove il primo id è quello di come è stata salvata la mappa nello store e il secondo id è
    //la chiave del valore a cui si vuole accedere
    | ID'('ID')'
    ;

BOOL: 'true'
    | 'false'
    ;

ID  : [a-zA-Z]+ ;

INT : [0-9]+ ;

WS  : [ \t\r\n]+ ->skip ;

SPACE: ' ' ->skip;