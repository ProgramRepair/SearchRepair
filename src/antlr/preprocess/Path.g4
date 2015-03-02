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
	: callExpr ';'
	;
	

assumeStat
	: expr comparator expr ';'
	;
	
declarationStat
	: type ID ';'
	| type '*' ID ';'
	;

assignStat
	: ID assiginOperator expr  ';'
	| '*' ID assiginOperator expr  ';'
	| ID assiginOperator callExpr ';'
	| ID assiginOperator StringLiteral ';'
	;
		
returnStat
	: 'return' '('expr ')' ';'
	;
	

expr 
	: ID 
	| INT
	| expr arithOperator expr
	| FLOAT
	| CharacterLiteral
	//| StringLiteral
	| addressExpr
	| defExpr
	;
	

	
addressExpr: '&' ID;
defExpr : '*' ID;

	
	
callExpr : ID arguments;

arguments:
	'(' (formalArgument(',' formalArgument)*)? ')';

formalArgument
	: ID
	| FLOAT
	| INT
	;



type
	: Int
	| Char
	| Float
	| Double
	;

arithOperator: ADDCTIVE | DEDUCTIVE | MULTIPLY | DIVIDE | MOD;
assiginOperator : ADDSELF | DEDUCTSELF | MODSELF | MULTISELF | DIVIDESELF | ASSIGN;
	
	



comparator : LT | GT | EQ | NEQ | LE | GE; 


Int : 'int';

Char : 'char';

Float : 'float';


Double : 'double';

ASSIGN : '=';



INT : '0'..'9'+;


FLOAT : ('0'..'9')+ '.' ('0'..'9')*;


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
	: '\'' (SChar) '\''
	;	
	
	
StringLiteral
	: '"' SCharSequence? '"' 
	;




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



