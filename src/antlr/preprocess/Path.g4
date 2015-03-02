grammar Path;

prog : statement*;


statement
	: declarationStat
	| assignStat
	| returnStat
	| assumeStat
	| callStat
	;
	
callStat
	: callExpr
	;
	

 

assumeStat
	: expr comparator expr ';'
	;
	
declarationStat
	: type '*' ID ';'
	| type ID ';'
	;

assignStat
	: ID '=' expr  ';'
	| '*' ID '=' expr  ';'
	| ID '=' callExpr ';'
	;
	
	
	
returnStat
	: 'return' '('(ID | INT | FLOAT )');'
	;
	

expr 
	: ID 
	| INT
	| expr addictiveOperator expr
	| expr multiOperater expr
	| FLOAT
	| CharacterLiteral
	| StringLiteral
	| addressExpr
	| defExpr
	;
	
addressExpr: '&' ID;
defExpr : '*' ID;

	



	
callExpr : ID '(' (ID | FLOAT | INT )* ')';

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

comparator
	: '>'
	| '>='
	| '<'
	| '<='
	| '=='
	| '!='
	;

Int : 'int';

Char : 'char';

Float : 'float';


ID : ('a'..'z' |'A'..'Z'|'_'|'|')('a'..'z' |'A'..'Z'|'_' | '0'..'9')*;

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
