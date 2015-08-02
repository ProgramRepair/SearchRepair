// Generated from Scrape.g4 by ANTLR 4.4
package scraper;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ScrapeLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__9=1, T__8=2, T__7=3, T__6=4, T__5=5, T__4=6, T__3=7, T__2=8, T__1=9, 
		T__0=10, BlockComment=11, LineComment=12, CharacterLiteral=13, StringLiteral=14, 
		Int=15, Char=16, Float=17, String=18, UnSigned=19, Double=20, INT=21, 
		FLOAT=22, STRING=23, ID=24, OR=25, AND=26, LPAREN=27, RPAREN=28, ADDCTIVE=29, 
		DEDUCTIVE=30, MULTIPLY=31, DIVIDE=32, MOD=33, ASSIGN=34, INCRE=35, DECRE=36, 
		ADDSELF=37, DEDUCTSELF=38, MODSELF=39, MULTISELF=40, DIVIDESELF=41, LT=42, 
		LE=43, GT=44, GE=45, EQ=46, NEQ=47, POINTER=48, WS=49;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", 
		"'\r'", "'\\u000E'", "'\\u000F'", "'\\u0010'", "'\\u0011'", "'\\u0012'", 
		"'\\u0013'", "'\\u0014'", "'\\u0015'", "'\\u0016'", "'\\u0017'", "'\\u0018'", 
		"'\\u0019'", "'\\u001A'", "'\\u001B'", "'\\u001C'", "'\\u001D'", "'\\u001E'", 
		"'\\u001F'", "' '", "'!'", "'\"'", "'#'", "'$'", "'%'", "'&'", "'''", 
		"'('", "')'", "'*'", "'+'", "','", "'-'", "'.'", "'/'", "'0'", "'1'"
	};
	public static final String[] ruleNames = {
		"T__9", "T__8", "T__7", "T__6", "T__5", "T__4", "T__3", "T__2", "T__1", 
		"T__0", "BlockComment", "LineComment", "CharacterLiteral", "StringLiteral", 
		"Int", "Char", "Float", "String", "UnSigned", "Double", "INT", "FLOAT", 
		"STRING", "ID", "OR", "AND", "LPAREN", "RPAREN", "ADDCTIVE", "DEDUCTIVE", 
		"MULTIPLY", "DIVIDE", "MOD", "ASSIGN", "INCRE", "DECRE", "ADDSELF", "DEDUCTSELF", 
		"MODSELF", "MULTISELF", "DIVIDESELF", "LT", "LE", "GT", "GE", "EQ", "NEQ", 
		"POINTER", "WS", "SCharSequence", "SChar", "EscapeSequence"
	};


	public ScrapeLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Scrape.g4"; }

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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\63\u0146\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3"+
		"\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\13\3"+
		"\13\3\f\3\f\3\f\3\f\7\f\u008f\n\f\f\f\16\f\u0092\13\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\r\3\r\3\r\3\r\7\r\u009d\n\r\f\r\16\r\u00a0\13\r\3\r\3\r\3\16\3"+
		"\16\3\16\3\16\3\17\3\17\5\17\u00aa\n\17\3\17\3\17\3\20\3\20\3\20\3\20"+
		"\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\26\5\26\u00d4\n\26\3\26\6\26\u00d7\n\26\r"+
		"\26\16\26\u00d8\3\27\6\27\u00dc\n\27\r\27\16\27\u00dd\3\27\3\27\7\27\u00e2"+
		"\n\27\f\27\16\27\u00e5\13\27\3\30\3\30\7\30\u00e9\n\30\f\30\16\30\u00ec"+
		"\13\30\3\30\3\30\3\31\3\31\7\31\u00f2\n\31\f\31\16\31\u00f5\13\31\3\32"+
		"\3\32\3\32\3\33\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3"+
		" \3!\3!\3\"\3\"\3#\3#\3$\3$\3$\3%\3%\3%\3&\3&\3&\3\'\3\'\3\'\3(\3(\3("+
		"\3)\3)\3)\3*\3*\3*\3+\3+\3,\3,\3,\3-\3-\3.\3.\3.\3/\3/\3/\3\60\3\60\3"+
		"\60\3\61\3\61\3\62\6\62\u0135\n\62\r\62\16\62\u0136\3\62\3\62\3\63\6\63"+
		"\u013c\n\63\r\63\16\63\u013d\3\64\3\64\5\64\u0142\n\64\3\65\3\65\3\65"+
		"\3\u0090\2\66\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16"+
		"\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34"+
		"\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\2g\2"+
		"i\2\3\2\t\4\2\f\f\17\17\6\2\"\"C\\aac|\5\2C\\aac|\6\2\62;C\\aac|\5\2\13"+
		"\f\17\17\"\"\6\2\f\f\17\17$$^^\f\2$$))AA^^cdhhppttvvxx\u014e\2\3\3\2\2"+
		"\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3"+
		"\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2"+
		"\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2"+
		"\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2"+
		"\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3"+
		"\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2"+
		"\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2"+
		"W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3"+
		"\2\2\2\3k\3\2\2\2\5m\3\2\2\2\7o\3\2\2\2\tq\3\2\2\2\13s\3\2\2\2\rw\3\2"+
		"\2\2\17z\3\2\2\2\21\177\3\2\2\2\23\u0086\3\2\2\2\25\u0088\3\2\2\2\27\u008a"+
		"\3\2\2\2\31\u0098\3\2\2\2\33\u00a3\3\2\2\2\35\u00a7\3\2\2\2\37\u00ad\3"+
		"\2\2\2!\u00b1\3\2\2\2#\u00b6\3\2\2\2%\u00bc\3\2\2\2\'\u00c2\3\2\2\2)\u00cb"+
		"\3\2\2\2+\u00d3\3\2\2\2-\u00db\3\2\2\2/\u00e6\3\2\2\2\61\u00ef\3\2\2\2"+
		"\63\u00f6\3\2\2\2\65\u00f9\3\2\2\2\67\u00fc\3\2\2\29\u00fe\3\2\2\2;\u0100"+
		"\3\2\2\2=\u0102\3\2\2\2?\u0104\3\2\2\2A\u0106\3\2\2\2C\u0108\3\2\2\2E"+
		"\u010a\3\2\2\2G\u010c\3\2\2\2I\u010f\3\2\2\2K\u0112\3\2\2\2M\u0115\3\2"+
		"\2\2O\u0118\3\2\2\2Q\u011b\3\2\2\2S\u011e\3\2\2\2U\u0121\3\2\2\2W\u0123"+
		"\3\2\2\2Y\u0126\3\2\2\2[\u0128\3\2\2\2]\u012b\3\2\2\2_\u012e\3\2\2\2a"+
		"\u0131\3\2\2\2c\u0134\3\2\2\2e\u013b\3\2\2\2g\u0141\3\2\2\2i\u0143\3\2"+
		"\2\2kl\7_\2\2l\4\3\2\2\2mn\7}\2\2n\6\3\2\2\2op\7.\2\2p\b\3\2\2\2qr\7]"+
		"\2\2r\n\3\2\2\2st\7h\2\2tu\7q\2\2uv\7t\2\2v\f\3\2\2\2wx\7k\2\2xy\7h\2"+
		"\2y\16\3\2\2\2z{\7g\2\2{|\7n\2\2|}\7u\2\2}~\7g\2\2~\20\3\2\2\2\177\u0080"+
		"\7t\2\2\u0080\u0081\7g\2\2\u0081\u0082\7v\2\2\u0082\u0083\7w\2\2\u0083"+
		"\u0084\7t\2\2\u0084\u0085\7p\2\2\u0085\22\3\2\2\2\u0086\u0087\7\177\2"+
		"\2\u0087\24\3\2\2\2\u0088\u0089\7=\2\2\u0089\26\3\2\2\2\u008a\u008b\7"+
		"\61\2\2\u008b\u008c\7,\2\2\u008c\u0090\3\2\2\2\u008d\u008f\13\2\2\2\u008e"+
		"\u008d\3\2\2\2\u008f\u0092\3\2\2\2\u0090\u0091\3\2\2\2\u0090\u008e\3\2"+
		"\2\2\u0091\u0093\3\2\2\2\u0092\u0090\3\2\2\2\u0093\u0094\7,\2\2\u0094"+
		"\u0095\7\61\2\2\u0095\u0096\3\2\2\2\u0096\u0097\b\f\2\2\u0097\30\3\2\2"+
		"\2\u0098\u0099\7\61\2\2\u0099\u009a\7\61\2\2\u009a\u009e\3\2\2\2\u009b"+
		"\u009d\n\2\2\2\u009c\u009b\3\2\2\2\u009d\u00a0\3\2\2\2\u009e\u009c\3\2"+
		"\2\2\u009e\u009f\3\2\2\2\u009f\u00a1\3\2\2\2\u00a0\u009e\3\2\2\2\u00a1"+
		"\u00a2\b\r\2\2\u00a2\32\3\2\2\2\u00a3\u00a4\7)\2\2\u00a4\u00a5\5g\64\2"+
		"\u00a5\u00a6\7)\2\2\u00a6\34\3\2\2\2\u00a7\u00a9\7$\2\2\u00a8\u00aa\5"+
		"e\63\2\u00a9\u00a8\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab"+
		"\u00ac\7$\2\2\u00ac\36\3\2\2\2\u00ad\u00ae\7k\2\2\u00ae\u00af\7p\2\2\u00af"+
		"\u00b0\7v\2\2\u00b0 \3\2\2\2\u00b1\u00b2\7e\2\2\u00b2\u00b3\7j\2\2\u00b3"+
		"\u00b4\7c\2\2\u00b4\u00b5\7t\2\2\u00b5\"\3\2\2\2\u00b6\u00b7\7h\2\2\u00b7"+
		"\u00b8\7n\2\2\u00b8\u00b9\7q\2\2\u00b9\u00ba\7c\2\2\u00ba\u00bb\7v\2\2"+
		"\u00bb$\3\2\2\2\u00bc\u00bd\7e\2\2\u00bd\u00be\7j\2\2\u00be\u00bf\7c\2"+
		"\2\u00bf\u00c0\7t\2\2\u00c0\u00c1\7,\2\2\u00c1&\3\2\2\2\u00c2\u00c3\7"+
		"w\2\2\u00c3\u00c4\7p\2\2\u00c4\u00c5\7u\2\2\u00c5\u00c6\7k\2\2\u00c6\u00c7"+
		"\7i\2\2\u00c7\u00c8\7p\2\2\u00c8\u00c9\7g\2\2\u00c9\u00ca\7f\2\2\u00ca"+
		"(\3\2\2\2\u00cb\u00cc\7f\2\2\u00cc\u00cd\7q\2\2\u00cd\u00ce\7w\2\2\u00ce"+
		"\u00cf\7d\2\2\u00cf\u00d0\7n\2\2\u00d0\u00d1\7g\2\2\u00d1*\3\2\2\2\u00d2"+
		"\u00d4\7/\2\2\u00d3\u00d2\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4\u00d6\3\2"+
		"\2\2\u00d5\u00d7\4\62;\2\u00d6\u00d5\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8"+
		"\u00d6\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9,\3\2\2\2\u00da\u00dc\4\62;\2"+
		"\u00db\u00da\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd\u00db\3\2\2\2\u00dd\u00de"+
		"\3\2\2\2\u00de\u00df\3\2\2\2\u00df\u00e3\7\60\2\2\u00e0\u00e2\4\62;\2"+
		"\u00e1\u00e0\3\2\2\2\u00e2\u00e5\3\2\2\2\u00e3\u00e1\3\2\2\2\u00e3\u00e4"+
		"\3\2\2\2\u00e4.\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e6\u00ea\7$\2\2\u00e7\u00e9"+
		"\t\3\2\2\u00e8\u00e7\3\2\2\2\u00e9\u00ec\3\2\2\2\u00ea\u00e8\3\2\2\2\u00ea"+
		"\u00eb\3\2\2\2\u00eb\u00ed\3\2\2\2\u00ec\u00ea\3\2\2\2\u00ed\u00ee\7$"+
		"\2\2\u00ee\60\3\2\2\2\u00ef\u00f3\t\4\2\2\u00f0\u00f2\t\5\2\2\u00f1\u00f0"+
		"\3\2\2\2\u00f2\u00f5\3\2\2\2\u00f3\u00f1\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4"+
		"\62\3\2\2\2\u00f5\u00f3\3\2\2\2\u00f6\u00f7\7~\2\2\u00f7\u00f8\7~\2\2"+
		"\u00f8\64\3\2\2\2\u00f9\u00fa\7(\2\2\u00fa\u00fb\7(\2\2\u00fb\66\3\2\2"+
		"\2\u00fc\u00fd\7*\2\2\u00fd8\3\2\2\2\u00fe\u00ff\7+\2\2\u00ff:\3\2\2\2"+
		"\u0100\u0101\7-\2\2\u0101<\3\2\2\2\u0102\u0103\7/\2\2\u0103>\3\2\2\2\u0104"+
		"\u0105\7,\2\2\u0105@\3\2\2\2\u0106\u0107\7\61\2\2\u0107B\3\2\2\2\u0108"+
		"\u0109\7\'\2\2\u0109D\3\2\2\2\u010a\u010b\7?\2\2\u010bF\3\2\2\2\u010c"+
		"\u010d\7-\2\2\u010d\u010e\7-\2\2\u010eH\3\2\2\2\u010f\u0110\7/\2\2\u0110"+
		"\u0111\7/\2\2\u0111J\3\2\2\2\u0112\u0113\7-\2\2\u0113\u0114\7?\2\2\u0114"+
		"L\3\2\2\2\u0115\u0116\7/\2\2\u0116\u0117\7?\2\2\u0117N\3\2\2\2\u0118\u0119"+
		"\7\'\2\2\u0119\u011a\7?\2\2\u011aP\3\2\2\2\u011b\u011c\7,\2\2\u011c\u011d"+
		"\7?\2\2\u011dR\3\2\2\2\u011e\u011f\7\61\2\2\u011f\u0120\7?\2\2\u0120T"+
		"\3\2\2\2\u0121\u0122\7>\2\2\u0122V\3\2\2\2\u0123\u0124\7>\2\2\u0124\u0125"+
		"\7?\2\2\u0125X\3\2\2\2\u0126\u0127\7@\2\2\u0127Z\3\2\2\2\u0128\u0129\7"+
		"@\2\2\u0129\u012a\7?\2\2\u012a\\\3\2\2\2\u012b\u012c\7?\2\2\u012c\u012d"+
		"\7?\2\2\u012d^\3\2\2\2\u012e\u012f\7#\2\2\u012f\u0130\7?\2\2\u0130`\3"+
		"\2\2\2\u0131\u0132\7,\2\2\u0132b\3\2\2\2\u0133\u0135\t\6\2\2\u0134\u0133"+
		"\3\2\2\2\u0135\u0136\3\2\2\2\u0136\u0134\3\2\2\2\u0136\u0137\3\2\2\2\u0137"+
		"\u0138\3\2\2\2\u0138\u0139\b\62\2\2\u0139d\3\2\2\2\u013a\u013c\5g\64\2"+
		"\u013b\u013a\3\2\2\2\u013c\u013d\3\2\2\2\u013d\u013b\3\2\2\2\u013d\u013e"+
		"\3\2\2\2\u013ef\3\2\2\2\u013f\u0142\n\7\2\2\u0140\u0142\5i\65\2\u0141"+
		"\u013f\3\2\2\2\u0141\u0140\3\2\2\2\u0142h\3\2\2\2\u0143\u0144\7^\2\2\u0144"+
		"\u0145\t\b\2\2\u0145j\3\2\2\2\17\2\u0090\u009e\u00a9\u00d3\u00d8\u00dd"+
		"\u00e3\u00ea\u00f3\u0136\u013d\u0141\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}