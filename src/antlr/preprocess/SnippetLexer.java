// Generated from Snippet.g4 by ANTLR 4.2.2
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
public class SnippetLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__9=1, T__8=2, T__7=3, T__6=4, T__5=5, T__4=6, T__3=7, T__2=8, T__1=9, 
		T__0=10, Address=11, CallExpr=12, Int=13, Char=14, Float=15, ID=16, INT=17, 
		FLOAT=18, WS=19, CharacterLiteral=20, StringLiteral=21, Character=22;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'/'", "'%'", "'return'", "'*'", "'+'", "';'", "'['", "'-'", "'='", "']'", 
		"Address", "CallExpr", "'int'", "'char'", "'float'", "ID", "INT", "FLOAT", 
		"WS", "CharacterLiteral", "StringLiteral", "Character"
	};
	public static final String[] ruleNames = {
		"T__9", "T__8", "T__7", "T__6", "T__5", "T__4", "T__3", "T__2", "T__1", 
		"T__0", "Address", "CallExpr", "Int", "Char", "Float", "ID", "INT", "FLOAT", 
		"WS", "CharacterLiteral", "StringLiteral", "Character"
	};


	public SnippetLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Snippet.g4"; }

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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\30\u0093\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\3\2\3\2\3\3\3"+
		"\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t"+
		"\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\7\rQ\n\r\f\r\16\rT"+
		"\13\r\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3"+
		"\20\3\20\3\20\3\20\3\21\3\21\7\21i\n\21\f\21\16\21l\13\21\3\22\6\22o\n"+
		"\22\r\22\16\22p\3\23\6\23t\n\23\r\23\16\23u\3\23\3\23\6\23z\n\23\r\23"+
		"\16\23{\3\24\6\24\177\n\24\r\24\16\24\u0080\3\24\3\24\3\25\3\25\3\25\3"+
		"\25\3\26\3\26\7\26\u008b\n\26\f\26\16\26\u008e\13\26\3\26\3\26\3\27\3"+
		"\27\2\2\30\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33"+
		"\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30\3\2\6\5\2C\\aac|\6\2\62;"+
		"C\\aac|\5\2\13\f\17\17\"\"\6\2\62;C\\c|~~\u009b\2\3\3\2\2\2\2\5\3\2\2"+
		"\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21"+
		"\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2"+
		"\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3"+
		"\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\3/\3\2\2\2\5\61\3\2\2\2\7\63\3"+
		"\2\2\2\t:\3\2\2\2\13<\3\2\2\2\r>\3\2\2\2\17@\3\2\2\2\21B\3\2\2\2\23D\3"+
		"\2\2\2\25F\3\2\2\2\27H\3\2\2\2\31K\3\2\2\2\33W\3\2\2\2\35[\3\2\2\2\37"+
		"`\3\2\2\2!f\3\2\2\2#n\3\2\2\2%s\3\2\2\2\'~\3\2\2\2)\u0084\3\2\2\2+\u0088"+
		"\3\2\2\2-\u0091\3\2\2\2/\60\7\61\2\2\60\4\3\2\2\2\61\62\7\'\2\2\62\6\3"+
		"\2\2\2\63\64\7t\2\2\64\65\7g\2\2\65\66\7v\2\2\66\67\7w\2\2\678\7t\2\2"+
		"89\7p\2\29\b\3\2\2\2:;\7,\2\2;\n\3\2\2\2<=\7-\2\2=\f\3\2\2\2>?\7=\2\2"+
		"?\16\3\2\2\2@A\7]\2\2A\20\3\2\2\2BC\7/\2\2C\22\3\2\2\2DE\7?\2\2E\24\3"+
		"\2\2\2FG\7_\2\2G\26\3\2\2\2HI\7(\2\2IJ\5!\21\2J\30\3\2\2\2KL\5!\21\2L"+
		"R\7*\2\2MQ\5!\21\2NQ\5%\23\2OQ\5#\22\2PM\3\2\2\2PN\3\2\2\2PO\3\2\2\2Q"+
		"T\3\2\2\2RP\3\2\2\2RS\3\2\2\2SU\3\2\2\2TR\3\2\2\2UV\7+\2\2V\32\3\2\2\2"+
		"WX\7k\2\2XY\7p\2\2YZ\7v\2\2Z\34\3\2\2\2[\\\7e\2\2\\]\7j\2\2]^\7c\2\2^"+
		"_\7t\2\2_\36\3\2\2\2`a\7h\2\2ab\7n\2\2bc\7q\2\2cd\7c\2\2de\7v\2\2e \3"+
		"\2\2\2fj\t\2\2\2gi\t\3\2\2hg\3\2\2\2il\3\2\2\2jh\3\2\2\2jk\3\2\2\2k\""+
		"\3\2\2\2lj\3\2\2\2mo\4\62;\2nm\3\2\2\2op\3\2\2\2pn\3\2\2\2pq\3\2\2\2q"+
		"$\3\2\2\2rt\4\62;\2sr\3\2\2\2tu\3\2\2\2us\3\2\2\2uv\3\2\2\2vw\3\2\2\2"+
		"wy\7\60\2\2xz\4\62;\2yx\3\2\2\2z{\3\2\2\2{y\3\2\2\2{|\3\2\2\2|&\3\2\2"+
		"\2}\177\t\4\2\2~}\3\2\2\2\177\u0080\3\2\2\2\u0080~\3\2\2\2\u0080\u0081"+
		"\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u0083\b\24\2\2\u0083(\3\2\2\2\u0084"+
		"\u0085\7)\2\2\u0085\u0086\5-\27\2\u0086\u0087\7)\2\2\u0087*\3\2\2\2\u0088"+
		"\u008c\7$\2\2\u0089\u008b\5-\27\2\u008a\u0089\3\2\2\2\u008b\u008e\3\2"+
		"\2\2\u008c\u008a\3\2\2\2\u008c\u008d\3\2\2\2\u008d\u008f\3\2\2\2\u008e"+
		"\u008c\3\2\2\2\u008f\u0090\7$\2\2\u0090,\3\2\2\2\u0091\u0092\t\5\2\2\u0092"+
		".\3\2\2\2\13\2PRjpu{\u0080\u008c\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}