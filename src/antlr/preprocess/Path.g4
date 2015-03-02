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
	: type ID ';'
	;

assignStat
	: ID assiginOperator expr  ';'
	| POINTER ID assiginOperator expr  ';'
	| ID assiginOperator callExpr ';'
	;
		
returnStat
	: 'return' '('expr ');'
	;
	

expr 
	: ID 
	| INT
	| expr arithOperator expr
	| FLOAT
	| CharacterLiteral
	| StringLiteral
	| addressExpr
	| defExpr
	;
	

	
addressExpr: '&' ID;
defExpr : POINTER ID;

	
	
callExpr : ID arguments;

arguments:
	'(' (expr(',' expr)*)? ')';



type
	: Int
	| Char
	| Float
	| Double
	| String
	;

arithOperator: ADDCTIVE | DEDUCTIVE | MULTIPLY | DIVIDE | MOD;
assiginOperator : ADDSELF | DEDUCTSELF | MODSELF | MULTISELF | DIVIDESELF | ASSIGN;
	
	



comparator : LT | GT | EQ | NEQ | LE | GE; 


Int : 'int';

Char : 'char';

Float : 'float';

String : 'char*';

Double : 'double';

ASSIGN : '=';
POINTER : '*';

INT : '0'..'9'+;
FLOAT : ('0'..'9')+ '.' ('0'..'9')*;
STRING : '"' ('a'..'z'|'A'..'Z'|'_'|' ')* '"';
ID : ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*;
OR : '||';
AND: '&&';
LPAREN : '(';
RPAREN : ')';
ADDCTIVE : '+';
DEDUCTIVE : '-';
MULTIPLY : '*';
DIVIDE : '/';
MOD : '%';
INCRE: '++';
DECRE: '--';
ADDSELF: '+=';
DEDUCTSELF: '-=';
MODSELF: '%=';
MULTISELF: '*=';
DIVIDESELF: '/=';



LT : '<';
LE : '<=';
GT : '>';
GE : '>=';
EQ : '==';
NEQ : '!=';


WS : [ \t\r\n]+ -> skip;


CharacterLiteral 
	: '\'' (Character) '\''
	;	
	
	
StringLiteral
	: '"' (Character)* '"' 
	;

fragment
Character : [0-9|a-z|A-Z];

fragment   
SCharSequence
    :   SChar+
    ;
 fragment
 SChar
    :   ~["\\\r\n]
    |   EscapeSequence
    ;
fragment
EscapeSequence:  '\\' ['"?abfnrtv\\];



