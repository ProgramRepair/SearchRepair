grammar Function;

prog : function;
function
	: type ID parameters block
	;

type
	: Int
	| Char
	| Float
	| String
	;
	
parameters 
	: LPAREN (formalParameter(',' formalParameter)*)? RPAREN
	;
	
formalParameter
	: type ID
	;	
	
 
 block : '{' stat* '}';



 stat
 	: declarationStat ';' 
 	| if_stat
 	| returnStat ';'
 	| callStat ';'
 	| assignStat ';'
 	| selfIncreStat ';'
 	;

if_stat
 : 'if'  condExpr (stat | block) ('else' 'if' condExpr (stat | block))* ('else' (stat | block))?
 ;
 
 declarationStat
	: type ID 
	| type ID ('[' INT ']') 
	;
	
returnStat
	: 'return' ( arith_expression )
	;
	
callStat
	: callExpr
	;
	
assignStat
	: ID ASSIGN assign_expression
	| type ID ASSIGN assign_expression
	| POINTER ID ASSIGN assign_expression
	| type POINTER ID ASSIGN assign_expression
	| ID arithmAssignOperator assign_expression
	| POINTER ID arithmAssignOperator assign_expression
	;
	
	
callExpr : ID arguments;

selfIncreStat: ID increOperator;

increOperator: INCRE | DECRE;

arguments:
	LPAREN (assign_expression(',' assign_expression)*)? RPAREN;
	
assign_expression 
	: arith_expression
	| StringLiteral
	| CharacterLiteral
	;

arithmAssignOperator : ADDSELF | DEDUCTSELF | MODSELF | MULTISELF | DIVIDESELF;	


 
 condExpr : or_expression ;
or_expression : and_expression (OR or_expression)*;
and_expression : term (AND term)*;
term : atom ( operator atom)? | LPAREN or_expression RPAREN;

arith_expression : add_expression;
add_expression : multi_expression (addOperator add_expression)*;
multi_expression : expr (multiOperator expr)*;
expr : atom | LPAREN add_expression RPAREN;
addOperator : ADDCTIVE | DEDUCTIVE;
multiOperator : MULTIPLY | DIVIDE | MOD;

atom : ID | INT | FLOAT | CharacterLiteral;
operator : LT | GT | EQ | NEQ | LE | GE;


BlockComment
    :   '/*' .*? '*/'
        -> skip
    ;

LineComment
    :   '//' ~[\r\n]*
        -> skip
    ;
	
	
CharacterLiteral 
	: '\'' (SChar) '\''
	;	
	
	
StringLiteral
    :    '"' SCharSequence? '"'
    ;	




Int : 'int';

Char : 'char';

Float : 'float';

String : 'char*';

Double : 'double';

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

ASSIGN : '=';
POINTER : '*';


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


