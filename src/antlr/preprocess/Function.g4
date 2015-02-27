grammar Function;


function
	: type ID parameters block 
	;
	
type
	: Int
	| Char
	| Float
	| String
	| Double
	;
	
parameters
	: LPAREN (formalParameter(',' formalParameter)*)? RPAREN
	;
	
formalParameter
	: type ID
	;


block
	: '{' statement* '}'
	;
	
statement
	: declarationStat ';'
	| assignStat ';'
	| returnStat ';'
	| callStat ';'
	| ifBlock 
	| selfIncreStat ';'
	;
	
	
selfIncreStat: ID increOperator;

increOperator: INCRE | DECRE;	
	
ifBlock: ifPart elseifPart* elsePart?;

ifPart : 'if' '('condExpr ')' (statement | block);



elseifPart : 'else if' '(' condExpr ')' (statement | block);

elsePart : 'else' (statement | block);



	
declarationStat
	: type ID 
	| type ID ('[' INT ']') ';'
	;

assignStat
	: ID ASSIGN assign_expression
	| type ID ASSIGN assign_expression
	| POINTER ID ASSIGN assign_expression
	| type POINTER ID ASSIGN assign_expression
	| ID arithmAssignOperator assign_expression
	| POINTER ID arithmAssignOperator assign_expression
	;
	
assign_expression 
	: arith_expression
	| StringLiteral
	| CharacterLiteral
	;

arithmAssignOperator : ADDSELF | DEDUCTSELF | MODSELF | MULTISELF | DIVIDESELF;	
	
returnStat
	: 'return' ( arith_expression )
	;

callStat
	: callExpr
	;
	
	
	
addressExpr: '&' ID;
defExpr : POINTER ID;

	
callExpr : ID arguments;

arguments:
	LPAREN (assign_expression(',' assign_expression)*)? RPAREN;



arith_expression : add_expression;
add_expression : multi_expression (addOperator add_expression)*;
multi_expression : expr (multiOperator expr)*;
expr : atom | LPAREN add_expression RPAREN;

addOperator : ADDCTIVE | DEDUCTIVE;
multiOperator : MULTIPLY | DIVIDE | MOD;

condExpr: or_expression;

or_expression: and_expression (OR or_expression)*;

and_expression : term (AND term)*;

term : atom ( condOperator atom)? | LPAREN or_expression RPAREN;

atom : ID | INT | FLOAT;

condOperator : LT | GT | EQ | NEQ | LE | GE;
	
	


ASSIGN : '=';
POINTER : '*';

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

Int : 'int';

Char : 'char';

Float : 'float';

String : 'char*';

Double : 'double';



ID : ('a'..'z' |'A'..'Z'|'_'|'|')('a'..'z' |'A'..'Z'|'_' | '0'..'9')*;

INT : '0'..'9'+;
FLOAT : ('0'..'9')+ '.' ('0'..'9')+;





OR : '||';
AND: '&&';
LPAREN : '(';
RPAREN : ')';

LT : '<';
LE : '<=';
GT : '>';
GE : '>=';
EQ : '==';
NEQ : '!=';

WS : [ \t\r\n]+ -> skip;


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
fragment    
SCharSequence
    :   SChar+
    ;
fragment
 SChar
    :   ~["\\\r\n]
    |   EscapeSequence
    ;
EscapeSequence:  '\\' ['"?abfnrtv\\];



