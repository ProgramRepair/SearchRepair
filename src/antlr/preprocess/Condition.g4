grammar Condition;
options{
	output=AST;
	rewrite=true;
}

//@parser::members {
//	private Map<String, String> map;
//	public ConditionParser(TokenStream input,  Map<String, String> map) {
//		this(input);
//		this.map = map;
//	}
//}
arith_expression : add_expression';';
add_expression : multi_expression (addOperator add_expression)*;
multi_expression : expr (multiOperator expr)*;
expr : atom | LPAREN add_expression RPAREN;

addOperator : ADDCTIVE | DEDUCTIVE;
multiOperator : MULTIPLY | DIVIDE | MOD;


condExpr : or_expression ';';

or_expression : and_expression (OR or_expression)*;



and_expression : term (AND term)*;



term : atom ( operator atom)? | LPAREN or_expression RPAREN;

atom : ID | INT | FLOAT;

operator : LT | GT | EQ | NEQ | LE | GE;

INT : '0'..'9'+;
FLOAT : ('0'..'9')+ '.' ('0'..'9')*;
STRING : '"' ('a'..'z'|'A'..'Z'|'_'|' ')* '"';
ID : 
('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')* ;
OR : '||';
AND: '&&';
LPAREN : '(';
RPAREN : ')';
ADDCTIVE : '+';
DEDUCTIVE : '-';
MULTIPLY : '*';
DIVIDE : '/';
MOD : '%';

LT : '<';
LE : '<=';
GT : '>';
GE : '>=';
EQ : '==';
NEQ : '!=';

WS : [ \t\r\n]+ -> skip;