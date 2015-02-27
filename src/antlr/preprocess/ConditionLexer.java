// Generated from Condition.g4 by ANTLR 4.4
package antlr.preprocess;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ConditionLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, INT=2, FLOAT=3, STRING=4, ID=5, OR=6, AND=7, LPAREN=8, RPAREN=9, 
		ADDCTIVE=10, DEDUCTIVE=11, MULTIPLY=12, DIVIDE=13, MOD=14, LT=15, LE=16, 
		GT=17, GE=18, EQ=19, NEQ=20, WS=21;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", 
		"'\r'", "'\\u000E'", "'\\u000F'", "'\\u0010'", "'\\u0011'", "'\\u0012'", 
		"'\\u0013'", "'\\u0014'", "'\\u0015'"
	};
	public static final String[] ruleNames = {
		"T__0", "INT", "FLOAT", "STRING", "ID", "OR", "AND", "LPAREN", "RPAREN", 
		"ADDCTIVE", "DEDUCTIVE", "MULTIPLY", "DIVIDE", "MOD", "LT", "LE", "GT", 
		"GE", "EQ", "NEQ", "WS"
	};


	public ConditionLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Condition.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\27{\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\3\2\3\3\6\3\61\n\3\r\3\16"+
		"\3\62\3\4\6\4\66\n\4\r\4\16\4\67\3\4\3\4\7\4<\n\4\f\4\16\4?\13\4\3\5\3"+
		"\5\7\5C\n\5\f\5\16\5F\13\5\3\5\3\5\3\6\3\6\7\6L\n\6\f\6\16\6O\13\6\3\7"+
		"\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3"+
		"\16\3\17\3\17\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\23\3\23\3\23\3\24\3"+
		"\24\3\24\3\25\3\25\3\25\3\26\6\26v\n\26\r\26\16\26w\3\26\3\26\2\2\27\3"+
		"\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37"+
		"\21!\22#\23%\24\'\25)\26+\27\3\2\6\6\2\"\"C\\aac|\5\2C\\aac|\6\2\62;C"+
		"\\aac|\5\2\13\f\17\17\"\"\u0080\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2"+
		"\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2"+
		"\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2"+
		"\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2"+
		"\2+\3\2\2\2\3-\3\2\2\2\5\60\3\2\2\2\7\65\3\2\2\2\t@\3\2\2\2\13I\3\2\2"+
		"\2\rP\3\2\2\2\17S\3\2\2\2\21V\3\2\2\2\23X\3\2\2\2\25Z\3\2\2\2\27\\\3\2"+
		"\2\2\31^\3\2\2\2\33`\3\2\2\2\35b\3\2\2\2\37d\3\2\2\2!f\3\2\2\2#i\3\2\2"+
		"\2%k\3\2\2\2\'n\3\2\2\2)q\3\2\2\2+u\3\2\2\2-.\7=\2\2.\4\3\2\2\2/\61\4"+
		"\62;\2\60/\3\2\2\2\61\62\3\2\2\2\62\60\3\2\2\2\62\63\3\2\2\2\63\6\3\2"+
		"\2\2\64\66\4\62;\2\65\64\3\2\2\2\66\67\3\2\2\2\67\65\3\2\2\2\678\3\2\2"+
		"\289\3\2\2\29=\7\60\2\2:<\4\62;\2;:\3\2\2\2<?\3\2\2\2=;\3\2\2\2=>\3\2"+
		"\2\2>\b\3\2\2\2?=\3\2\2\2@D\7$\2\2AC\t\2\2\2BA\3\2\2\2CF\3\2\2\2DB\3\2"+
		"\2\2DE\3\2\2\2EG\3\2\2\2FD\3\2\2\2GH\7$\2\2H\n\3\2\2\2IM\t\3\2\2JL\t\4"+
		"\2\2KJ\3\2\2\2LO\3\2\2\2MK\3\2\2\2MN\3\2\2\2N\f\3\2\2\2OM\3\2\2\2PQ\7"+
		"~\2\2QR\7~\2\2R\16\3\2\2\2ST\7(\2\2TU\7(\2\2U\20\3\2\2\2VW\7*\2\2W\22"+
		"\3\2\2\2XY\7+\2\2Y\24\3\2\2\2Z[\7-\2\2[\26\3\2\2\2\\]\7/\2\2]\30\3\2\2"+
		"\2^_\7,\2\2_\32\3\2\2\2`a\7\61\2\2a\34\3\2\2\2bc\7\'\2\2c\36\3\2\2\2d"+
		"e\7>\2\2e \3\2\2\2fg\7>\2\2gh\7?\2\2h\"\3\2\2\2ij\7@\2\2j$\3\2\2\2kl\7"+
		"@\2\2lm\7?\2\2m&\3\2\2\2no\7?\2\2op\7?\2\2p(\3\2\2\2qr\7#\2\2rs\7?\2\2"+
		"s*\3\2\2\2tv\t\5\2\2ut\3\2\2\2vw\3\2\2\2wu\3\2\2\2wx\3\2\2\2xy\3\2\2\2"+
		"yz\b\26\2\2z,\3\2\2\2\t\2\62\67=DMw\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}