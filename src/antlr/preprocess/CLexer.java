// Generated from C.g4 by ANTLR 4.2.2
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
public class CLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__19=1, T__18=2, T__17=3, T__16=4, T__15=5, T__14=6, T__13=7, T__12=8, 
		T__11=9, T__10=10, T__9=11, T__8=12, T__7=13, T__6=14, T__5=15, T__4=16, 
		T__3=17, T__2=18, T__1=19, T__0=20, ID=21, INT=22, WS=23;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'/'", "'char'", "'return'", "'!='", "'{'", "';'", "'=='", "'='", "'}'", 
		"'for'", "'if'", "'%'", "'int'", "'else'", "'('", "')'", "'*'", "'+'", 
		"','", "'-'", "ID", "INT", "WS"
	};
	public static final String[] ruleNames = {
		"T__19", "T__18", "T__17", "T__16", "T__15", "T__14", "T__13", "T__12", 
		"T__11", "T__10", "T__9", "T__8", "T__7", "T__6", "T__5", "T__4", "T__3", 
		"T__2", "T__1", "T__0", "ID", "INT", "WS"
	};


	public CLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "C.g4"; }

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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\31~\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\3\2\3\2\3"+
		"\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\7"+
		"\3\7\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\r\3"+
		"\r\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\21\3\21\3"+
		"\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\7\26n\n\26\f\26\16\26"+
		"q\13\26\3\27\6\27t\n\27\r\27\16\27u\3\30\6\30y\n\30\r\30\16\30z\3\30\3"+
		"\30\2\2\31\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33"+
		"\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\3\2\4\5\2C\\aac|\5\2"+
		"\13\f\17\17\"\"\u0080\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2"+
		"\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25"+
		"\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2"+
		"\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2"+
		"\2\2-\3\2\2\2\2/\3\2\2\2\3\61\3\2\2\2\5\63\3\2\2\2\78\3\2\2\2\t?\3\2\2"+
		"\2\13B\3\2\2\2\rD\3\2\2\2\17F\3\2\2\2\21I\3\2\2\2\23K\3\2\2\2\25M\3\2"+
		"\2\2\27Q\3\2\2\2\31T\3\2\2\2\33V\3\2\2\2\35Z\3\2\2\2\37_\3\2\2\2!a\3\2"+
		"\2\2#c\3\2\2\2%e\3\2\2\2\'g\3\2\2\2)i\3\2\2\2+k\3\2\2\2-s\3\2\2\2/x\3"+
		"\2\2\2\61\62\7\61\2\2\62\4\3\2\2\2\63\64\7e\2\2\64\65\7j\2\2\65\66\7c"+
		"\2\2\66\67\7t\2\2\67\6\3\2\2\289\7t\2\29:\7g\2\2:;\7v\2\2;<\7w\2\2<=\7"+
		"t\2\2=>\7p\2\2>\b\3\2\2\2?@\7#\2\2@A\7?\2\2A\n\3\2\2\2BC\7}\2\2C\f\3\2"+
		"\2\2DE\7=\2\2E\16\3\2\2\2FG\7?\2\2GH\7?\2\2H\20\3\2\2\2IJ\7?\2\2J\22\3"+
		"\2\2\2KL\7\177\2\2L\24\3\2\2\2MN\7h\2\2NO\7q\2\2OP\7t\2\2P\26\3\2\2\2"+
		"QR\7k\2\2RS\7h\2\2S\30\3\2\2\2TU\7\'\2\2U\32\3\2\2\2VW\7k\2\2WX\7p\2\2"+
		"XY\7v\2\2Y\34\3\2\2\2Z[\7g\2\2[\\\7n\2\2\\]\7u\2\2]^\7g\2\2^\36\3\2\2"+
		"\2_`\7*\2\2` \3\2\2\2ab\7+\2\2b\"\3\2\2\2cd\7,\2\2d$\3\2\2\2ef\7-\2\2"+
		"f&\3\2\2\2gh\7.\2\2h(\3\2\2\2ij\7/\2\2j*\3\2\2\2ko\t\2\2\2ln\t\2\2\2m"+
		"l\3\2\2\2nq\3\2\2\2om\3\2\2\2op\3\2\2\2p,\3\2\2\2qo\3\2\2\2rt\4\62;\2"+
		"sr\3\2\2\2tu\3\2\2\2us\3\2\2\2uv\3\2\2\2v.\3\2\2\2wy\t\3\2\2xw\3\2\2\2"+
		"yz\3\2\2\2zx\3\2\2\2z{\3\2\2\2{|\3\2\2\2|}\b\30\2\2}\60\3\2\2\2\6\2ou"+
		"z\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}