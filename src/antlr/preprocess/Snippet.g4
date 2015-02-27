grammar Snippet;

prog : statement*;

statement
	: declarationStat
	| assignStat
	| returnStat
	| exprStat
	; 

declarationStat
	: type ID ('[' INT ']') ';'
	| type '*' ID ';'
	| type ID ';'
	;

assignStat
	: type? ID '=' expr  ';'
	| type? '*' ID '=' (Address | StringLiteral) ';'
	;
	
returnStat
	: 'return' ID ';'
	;
	
exprStat
	: CallExpr ';'
	| expr ';'
	;

expr 
	: ID 
	| INT
	| expr addictiveOperator expr
	| expr multiOperater expr
	| FLOAT
	| CharacterLiteral
	| StringLiteral
	;
	
Address: '&' ID;

	



	
CallExpr : ID '(' (ID | FLOAT | INT )* ')';

type
	: Int
	| Char
	| Float
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

Int : 'int';

Char : 'char';

Float : 'float';


ID : ('a'..'z' |'A'..'Z'|'_')('a'..'z' |'A'..'Z'|'_' | '0'..'9')*;

INT: ('0'..'9')+;
FLOAT: ('0'..'9')+('.')('0'..'9')+;

WS : [ \t\r\n]+ -> skip;


CharacterLiteral 
	: '\'' (Character) '\''
	;	
	
	
StringLiteral
	: '"' (Character)* '"' 
	;


Character : [0-9|a-z|A-Z];


	

	
