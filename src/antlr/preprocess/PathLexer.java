// Generated from Path.g4 by ANTLR 4.4
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
public class PathLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__4=1, T__3=2, T__2=3, T__1=4, T__0=5, Int=6, Char=7, Float=8, Double=9, 
		ASSIGN=10, INT=11, FLOAT=12, ID=13, OR=14, AND=15, LPAREN=16, RPAREN=17, 
		ADDCTIVE=18, DEDUCTIVE=19, MULTIPLY=20, DIVIDE=21, MOD=22, INCRE=23, DECRE=24, 
		ADDSELF=25, DEDUCTSELF=26, MODSELF=27, MULTISELF=28, DIVIDESELF=29, LT=30, 
		LE=31, GT=32, GE=33, EQ=34, NEQ=35, WS=36, CharacterLiteral=37, StringLiteral=38;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", 
		"'\r'", "'\\u000E'", "'\\u000F'", "'\\u0010'", "'\\u0011'", "'\\u0012'", 
		"'\\u0013'", "'\\u0014'", "'\\u0015'", "'\\u0016'", "'\\u0017'", "'\\u0018'", 
		"'\\u0019'", "'\\u001A'", "'\\u001B'", "'\\u001C'", "'\\u001D'", "'\\u001E'", 
		"'\\u001F'", "' '", "'!'", "'\"'", "'#'", "'$'", "'%'", "'&'"
	};
	public static final String[] ruleNames = {
		"T__4", "T__3", "T__2", "T__1", "T__0", "Int", "Char", "Float", "Double", 
		"ASSIGN", "INT", "FLOAT", "ID", "OR", "AND", "LPAREN", "RPAREN", "ADDCTIVE", 
		"DEDUCTIVE", "MULTIPLY", "DIVIDE", "MOD", "INCRE", "DECRE", "ADDSELF", 
		"DEDUCTSELF", "MODSELF", "MULTISELF", "DIVIDESELF", "LT", "LE", "GT", 
		"GE", "EQ", "NEQ", "WS", "CharacterLiteral", "StringLiteral", "SCharSequence", 
		"SChar", "EscapeSequence"
	};


	public PathLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Path.g4"; }

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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2(\u00ea\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\3\2\3\2"+
		"\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\7\3"+
		"\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\13\3\13\3\f\6\f~\n\f\r\f\16\f\177\3\r\6\r\u0083\n\r\r\r\16\r\u0084"+
		"\3\r\3\r\7\r\u0089\n\r\f\r\16\r\u008c\13\r\3\16\3\16\7\16\u0090\n\16\f"+
		"\16\16\16\u0093\13\16\3\17\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\22\3\22"+
		"\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\30\3\31"+
		"\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3\33\3\34\3\34\3\34\3\35\3\35\3\35"+
		"\3\36\3\36\3\36\3\37\3\37\3 \3 \3 \3!\3!\3\"\3\"\3\"\3#\3#\3#\3$\3$\3"+
		"$\3%\6%\u00cf\n%\r%\16%\u00d0\3%\3%\3&\3&\3&\3&\3\'\3\'\5\'\u00db\n\'"+
		"\3\'\3\'\3(\6(\u00e0\n(\r(\16(\u00e1\3)\3)\5)\u00e6\n)\3*\3*\3*\2\2+\3"+
		"\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37"+
		"\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37="+
		" ?!A\"C#E$G%I&K\'M(O\2Q\2S\2\3\2\7\5\2C\\aac|\6\2\62;C\\aac|\5\2\13\f"+
		"\17\17\"\"\6\2\f\f\17\17$$^^\f\2$$))AA^^cdhhppttvvxx\u00ee\2\3\3\2\2\2"+
		"\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2"+
		"\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2"+
		"\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2"+
		"\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2"+
		"\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2"+
		"\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2"+
		"\2K\3\2\2\2\2M\3\2\2\2\3U\3\2\2\2\5W\3\2\2\2\7Y\3\2\2\2\t`\3\2\2\2\13"+
		"b\3\2\2\2\rd\3\2\2\2\17h\3\2\2\2\21m\3\2\2\2\23s\3\2\2\2\25z\3\2\2\2\27"+
		"}\3\2\2\2\31\u0082\3\2\2\2\33\u008d\3\2\2\2\35\u0094\3\2\2\2\37\u0097"+
		"\3\2\2\2!\u009a\3\2\2\2#\u009c\3\2\2\2%\u009e\3\2\2\2\'\u00a0\3\2\2\2"+
		")\u00a2\3\2\2\2+\u00a4\3\2\2\2-\u00a6\3\2\2\2/\u00a8\3\2\2\2\61\u00ab"+
		"\3\2\2\2\63\u00ae\3\2\2\2\65\u00b1\3\2\2\2\67\u00b4\3\2\2\29\u00b7\3\2"+
		"\2\2;\u00ba\3\2\2\2=\u00bd\3\2\2\2?\u00bf\3\2\2\2A\u00c2\3\2\2\2C\u00c4"+
		"\3\2\2\2E\u00c7\3\2\2\2G\u00ca\3\2\2\2I\u00ce\3\2\2\2K\u00d4\3\2\2\2M"+
		"\u00d8\3\2\2\2O\u00df\3\2\2\2Q\u00e5\3\2\2\2S\u00e7\3\2\2\2UV\7#\2\2V"+
		"\4\3\2\2\2WX\7(\2\2X\6\3\2\2\2YZ\7t\2\2Z[\7g\2\2[\\\7v\2\2\\]\7w\2\2]"+
		"^\7t\2\2^_\7p\2\2_\b\3\2\2\2`a\7=\2\2a\n\3\2\2\2bc\7.\2\2c\f\3\2\2\2d"+
		"e\7k\2\2ef\7p\2\2fg\7v\2\2g\16\3\2\2\2hi\7e\2\2ij\7j\2\2jk\7c\2\2kl\7"+
		"t\2\2l\20\3\2\2\2mn\7h\2\2no\7n\2\2op\7q\2\2pq\7c\2\2qr\7v\2\2r\22\3\2"+
		"\2\2st\7f\2\2tu\7q\2\2uv\7w\2\2vw\7d\2\2wx\7n\2\2xy\7g\2\2y\24\3\2\2\2"+
		"z{\7?\2\2{\26\3\2\2\2|~\4\62;\2}|\3\2\2\2~\177\3\2\2\2\177}\3\2\2\2\177"+
		"\u0080\3\2\2\2\u0080\30\3\2\2\2\u0081\u0083\4\62;\2\u0082\u0081\3\2\2"+
		"\2\u0083\u0084\3\2\2\2\u0084\u0082\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u0086"+
		"\3\2\2\2\u0086\u008a\7\60\2\2\u0087\u0089\4\62;\2\u0088\u0087\3\2\2\2"+
		"\u0089\u008c\3\2\2\2\u008a\u0088\3\2\2\2\u008a\u008b\3\2\2\2\u008b\32"+
		"\3\2\2\2\u008c\u008a\3\2\2\2\u008d\u0091\t\2\2\2\u008e\u0090\t\3\2\2\u008f"+
		"\u008e\3\2\2\2\u0090\u0093\3\2\2\2\u0091\u008f\3\2\2\2\u0091\u0092\3\2"+
		"\2\2\u0092\34\3\2\2\2\u0093\u0091\3\2\2\2\u0094\u0095\7~\2\2\u0095\u0096"+
		"\7~\2\2\u0096\36\3\2\2\2\u0097\u0098\7(\2\2\u0098\u0099\7(\2\2\u0099 "+
		"\3\2\2\2\u009a\u009b\7*\2\2\u009b\"\3\2\2\2\u009c\u009d\7+\2\2\u009d$"+
		"\3\2\2\2\u009e\u009f\7-\2\2\u009f&\3\2\2\2\u00a0\u00a1\7/\2\2\u00a1(\3"+
		"\2\2\2\u00a2\u00a3\7,\2\2\u00a3*\3\2\2\2\u00a4\u00a5\7\61\2\2\u00a5,\3"+
		"\2\2\2\u00a6\u00a7\7\'\2\2\u00a7.\3\2\2\2\u00a8\u00a9\7-\2\2\u00a9\u00aa"+
		"\7-\2\2\u00aa\60\3\2\2\2\u00ab\u00ac\7/\2\2\u00ac\u00ad\7/\2\2\u00ad\62"+
		"\3\2\2\2\u00ae\u00af\7-\2\2\u00af\u00b0\7?\2\2\u00b0\64\3\2\2\2\u00b1"+
		"\u00b2\7/\2\2\u00b2\u00b3\7?\2\2\u00b3\66\3\2\2\2\u00b4\u00b5\7\'\2\2"+
		"\u00b5\u00b6\7?\2\2\u00b68\3\2\2\2\u00b7\u00b8\7,\2\2\u00b8\u00b9\7?\2"+
		"\2\u00b9:\3\2\2\2\u00ba\u00bb\7\61\2\2\u00bb\u00bc\7?\2\2\u00bc<\3\2\2"+
		"\2\u00bd\u00be\7>\2\2\u00be>\3\2\2\2\u00bf\u00c0\7>\2\2\u00c0\u00c1\7"+
		"?\2\2\u00c1@\3\2\2\2\u00c2\u00c3\7@\2\2\u00c3B\3\2\2\2\u00c4\u00c5\7@"+
		"\2\2\u00c5\u00c6\7?\2\2\u00c6D\3\2\2\2\u00c7\u00c8\7?\2\2\u00c8\u00c9"+
		"\7?\2\2\u00c9F\3\2\2\2\u00ca\u00cb\7#\2\2\u00cb\u00cc\7?\2\2\u00ccH\3"+
		"\2\2\2\u00cd\u00cf\t\4\2\2\u00ce\u00cd\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0"+
		"\u00ce\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2\u00d3\b%"+
		"\2\2\u00d3J\3\2\2\2\u00d4\u00d5\7)\2\2\u00d5\u00d6\5Q)\2\u00d6\u00d7\7"+
		")\2\2\u00d7L\3\2\2\2\u00d8\u00da\7$\2\2\u00d9\u00db\5O(\2\u00da\u00d9"+
		"\3\2\2\2\u00da\u00db\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc\u00dd\7$\2\2\u00dd"+
		"N\3\2\2\2\u00de\u00e0\5Q)\2\u00df\u00de\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1"+
		"\u00df\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2P\3\2\2\2\u00e3\u00e6\n\5\2\2"+
		"\u00e4\u00e6\5S*\2\u00e5\u00e3\3\2\2\2\u00e5\u00e4\3\2\2\2\u00e6R\3\2"+
		"\2\2\u00e7\u00e8\7^\2\2\u00e8\u00e9\t\6\2\2\u00e9T\3\2\2\2\13\2\177\u0084"+
		"\u008a\u0091\u00d0\u00da\u00e1\u00e5\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}