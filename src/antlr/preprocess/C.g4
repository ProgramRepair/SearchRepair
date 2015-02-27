grammar C;

prog : function+;
program
	: declaration+
	;
	
declaration
	: variable | function
	;
	
variable
	: type ID ';'
	;

type
	: 'int'
	| 'char'
	;
	
function
	: type ID parameters block
	;
	
parameters
	: '('(formalParameter(',' formalParameter)*)?')'
	;
	
formalParameter
	: type ID
	;

block
	: '{' variable* statement* '}'
	;
	
statement
	: forStat | ifStat | expr ';' | block | assignStat ';' | returnStat ';'|';'
	;
	
returnStat
	: 'return' expr
	;
	
ifStat
	: 'if' '(' condExpr ')' statement ('else' statement)?
	;

forStat
	: 'for' '(' assignStat ';' condExpr ';' assignStat ')' block
	;
	
assignStat
	: type? ID '=' expr
	;

expr 
	: ID 
	| INT
	| expr addictiveOperator expr
	| expr multiOperater expr
	;

condExpr
	: aexpr(('==' | '!=') aexpr)?
	;
	
aexpr
	: mexpr addictiveOperator mexpr
	;

mexpr
	: atom ((multiOperater) atom)*
	;

addictiveOperator
	: '+'
	| '-'
	;
	
multiOperater
	: '*'
	| '/'
	| '%'
	;

atom
	: ID
	| INT
	| '(' expr ')'
	;

ID : ('a'..'z' |'A'..'Z'|'_')('a'..'z' |'A'..'Z'|'_')*;
INT: ('0'..'9')+;
WS : [ \t\r\n]+ -> skip;
	
























	