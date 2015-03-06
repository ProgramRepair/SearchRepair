// Generated from Snippet.g4 by ANTLR 4.4
package antlr.preprocess;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SnippetParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__8=1, T__7=2, T__6=3, T__5=4, T__4=5, T__3=6, T__2=7, T__1=8, T__0=9, 
		BlockComment=10, LineComment=11, CharacterLiteral=12, StringLiteral=13, 
		Int=14, Char=15, Float=16, String=17, Double=18, INT=19, FLOAT=20, STRING=21, 
		ID=22, OR=23, AND=24, LPAREN=25, RPAREN=26, ADDCTIVE=27, DEDUCTIVE=28, 
		MULTIPLY=29, DIVIDE=30, MOD=31, ASSIGN=32, INCRE=33, DECRE=34, ADDSELF=35, 
		DEDUCTSELF=36, MODSELF=37, MULTISELF=38, DIVIDESELF=39, LT=40, LE=41, 
		GT=42, GE=43, EQ=44, NEQ=45, POINTER=46, WS=47;
	public static final String[] tokenNames = {
		"<INVALID>", "']'", "'{'", "','", "'['", "'if'", "'else'", "'return'", 
		"'}'", "';'", "BlockComment", "LineComment", "CharacterLiteral", "StringLiteral", 
		"'int'", "'char'", "'float'", "'char*'", "'double'", "INT", "FLOAT", "STRING", 
		"ID", "'||'", "'&&'", "'('", "')'", "'+'", "'-'", "MULTIPLY", "'/'", "'%'", 
		"'='", "'++'", "'--'", "'+='", "'-='", "'%='", "'*='", "'/='", "'<'", 
		"'<='", "'>'", "'>='", "'=='", "'!='", "POINTER", "WS"
	};
	public static final int
		RULE_prog = 0, RULE_type = 1, RULE_block = 2, RULE_stat = 3, RULE_if_stat = 4, 
		RULE_ifpart = 5, RULE_elseifpart = 6, RULE_elsepart = 7, RULE_elseifblock = 8, 
		RULE_ifblock = 9, RULE_declarationStat = 10, RULE_returnStat = 11, RULE_callStat = 12, 
		RULE_assignStat = 13, RULE_callExpr = 14, RULE_selfIncreStat = 15, RULE_increOperator = 16, 
		RULE_arguments = 17, RULE_assign_expression = 18, RULE_arithmAssignOperator = 19, 
		RULE_condExpr = 20, RULE_or_expression = 21, RULE_and_expression = 22, 
		RULE_term = 23, RULE_arith_expression = 24, RULE_add_expression = 25, 
		RULE_multi_expression = 26, RULE_expr = 27, RULE_addOperator = 28, RULE_multiOperator = 29, 
		RULE_atom = 30, RULE_operator = 31;
	public static final String[] ruleNames = {
		"prog", "type", "block", "stat", "if_stat", "ifpart", "elseifpart", "elsepart", 
		"elseifblock", "ifblock", "declarationStat", "returnStat", "callStat", 
		"assignStat", "callExpr", "selfIncreStat", "increOperator", "arguments", 
		"assign_expression", "arithmAssignOperator", "condExpr", "or_expression", 
		"and_expression", "term", "arith_expression", "add_expression", "multi_expression", 
		"expr", "addOperator", "multiOperator", "atom", "operator"
	};

	@Override
	public String getGrammarFileName() { return "Snippet.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SnippetParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgContext extends ParserRuleContext {
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SnippetListener ) ((SnippetListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SnippetListener ) ((SnippetListener)listener).exitProg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SnippetVisitor ) return ((SnippetVisitor<? extends T>)visitor).visitProg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__2) | (1L << Int) | (1L << Char) | (1L << Float) | (1L << String) | (1L << Double) | (1L << ID) | (1L << POINTER))) != 0)) {
				{
				{
				setState(64); stat();
				}
				}
				setState(69);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode String() { return getToken(SnippetParser.String, 0); }
		public TerminalNode Double() { return getToken(SnippetParser.Double, 0); }
		public TerminalNode Char() { return getToken(SnippetParser.Char, 0); }
		public TerminalNode Float() { return getToken(SnippetParser.Float, 0); }
		public TerminalNode Int() { return getToken(SnippetParser.Int, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SnippetListener ) ((SnippetListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SnippetListener ) ((SnippetListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SnippetVisitor ) return ((SnippetVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Int) | (1L << Char) | (1L << Float) | (1L << String) | (1L << Double))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockContext extends ParserRuleContext {
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SnippetListener ) ((SnippetListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SnippetListener ) ((SnippetListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SnippetVisitor ) return ((SnippetVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72); match(T__7);
			setState(76);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__2) | (1L << Int) | (1L << Char) | (1L << Float) | (1L << String) | (1L << Double) | (1L << ID) | (1L << POINTER))) != 0)) {
				{
				{
				setState(73); stat();
				}
				}
				setState(78);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(79); match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatContext extends ParserRuleContext {
		public CallStatContext callStat() {
			return getRuleContext(CallStatContext.class,0);
		}
		public SelfIncreStatContext selfIncreStat() {
			return getRuleContext(SelfIncreStatContext.class,0);
		}
		public ReturnStatContext returnStat() {
			return getRuleContext(ReturnStatContext.class,0);
		}
		public AssignStatContext assignStat() {
			return getRuleContext(AssignStatContext.class,0);
		}
		public DeclarationStatContext declarationStat() {
			return getRuleContext(DeclarationStatContext.class,0);
		}
		public If_statContext if_stat() {
			return getRuleContext(If_statContext.class,0);
		}
		public StatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SnippetListener ) ((SnippetListener)listener).enterStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SnippetListener ) ((SnippetListener)listener).exitStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SnippetVisitor ) return ((SnippetVisitor<? extends T>)visitor).visitStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_stat);
		try {
			setState(97);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(81); declarationStat();
				setState(82); match(T__0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(84); if_stat();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(85); returnStat();
				setState(86); match(T__0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(88); callStat();
				setState(89); match(T__0);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(91); assignStat();
				setState(92); match(T__0);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(94); selfIncreStat();
				setState(95); match(T__0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class If_statContext extends ParserRuleContext {
		public ElsepartContext elsepart() {
			return getRuleContext(ElsepartContext.class,0);
		}
		public IfpartContext ifpart() {
			return getRuleContext(IfpartContext.class,0);
		}
		public ElseifpartContext elseifpart() {
			return getRuleContext(ElseifpartContext.class,0);
		}
		public If_statContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_stat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SnippetListener ) ((SnippetListener)listener).enterIf_stat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SnippetListener ) ((SnippetListener)listener).exitIf_stat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SnippetVisitor ) return ((SnippetVisitor<? extends T>)visitor).visitIf_stat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_statContext if_stat() throws RecognitionException {
		If_statContext _localctx = new If_statContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_if_stat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99); ifpart();
			setState(101);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(100); elseifpart();
				}
				break;
			}
			setState(104);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(103); elsepart();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfpartContext extends ParserRuleContext {
		public IfblockContext ifblock() {
			return getRuleContext(IfblockContext.class,0);
		}
		public CondExprContext condExpr() {
			return getRuleContext(CondExprContext.class,0);
		}
		public IfpartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifpart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SnippetListener ) ((SnippetListener)listener).enterIfpart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SnippetListener ) ((SnippetListener)listener).exitIfpart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SnippetVisitor ) return ((SnippetVisitor<? extends T>)visitor).visitIfpart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfpartContext ifpart() throws RecognitionException {
		IfpartContext _localctx = new IfpartContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_ifpart);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106); match(T__4);
			setState(107); condExpr();
			setState(108); ifblock();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElseifpartContext extends ParserRuleContext {
		public ElseifblockContext elseifblock(int i) {
			return getRuleContext(ElseifblockContext.class,i);
		}
		public List<ElseifblockContext> elseifblock() {
			return getRuleContexts(ElseifblockContext.class);
		}
		public ElseifpartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseifpart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SnippetListener ) ((SnippetListener)listener).enterElseifpart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SnippetListener ) ((SnippetListener)listener).exitElseifpart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SnippetVisitor ) return ((SnippetVisitor<? extends T>)visitor).visitElseifpart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseifpartContext elseifpart() throws RecognitionException {
		ElseifpartContext _localctx = new ElseifpartContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_elseifpart);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(111); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(110); elseifblock();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(113); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElsepartContext extends ParserRuleContext {
		public IfblockContext ifblock() {
			return getRuleContext(IfblockContext.class,0);
		}
		public ElsepartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elsepart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SnippetListener ) ((SnippetListener)listener).enterElsepart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SnippetListener ) ((SnippetListener)listener).exitElsepart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SnippetVisitor ) return ((SnippetVisitor<? extends T>)visitor).visitElsepart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElsepartContext elsepart() throws RecognitionException {
		ElsepartContext _localctx = new ElsepartContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_elsepart);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115); match(T__3);
			setState(116); ifblock();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElseifblockContext extends ParserRuleContext {
		public IfblockContext ifblock() {
			return getRuleContext(IfblockContext.class,0);
		}
		public CondExprContext condExpr() {
			return getRuleContext(CondExprContext.class,0);
		}
		public ElseifblockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseifblock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SnippetListener ) ((SnippetListener)listener).enterElseifblock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SnippetListener ) ((SnippetListener)listener).exitElseifblock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SnippetVisitor ) return ((SnippetVisitor<? extends T>)visitor).visitElseifblock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseifblockContext elseifblock() throws RecognitionException {
		ElseifblockContext _localctx = new ElseifblockContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_elseifblock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118); match(T__3);
			setState(119); match(T__4);
			setState(120); condExpr();
			setState(121); ifblock();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfblockContext extends ParserRuleContext {
		public StatContext stat() {
			return getRuleContext(StatContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public IfblockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifblock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SnippetListener ) ((SnippetListener)listener).enterIfblock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SnippetListener ) ((SnippetListener)listener).exitIfblock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SnippetVisitor ) return ((SnippetVisitor<? extends T>)visitor).visitIfblock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfblockContext ifblock() throws RecognitionException {
		IfblockContext _localctx = new IfblockContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_ifblock);
		try {
			setState(125);
			switch (_input.LA(1)) {
			case T__4:
			case T__2:
			case Int:
			case Char:
			case Float:
			case String:
			case Double:
			case ID:
			case POINTER:
				enterOuterAlt(_localctx, 1);
				{
				setState(123); stat();
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 2);
				{
				setState(124); block();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclarationStatContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(SnippetParser.INT, 0); }
		public TerminalNode POINTER() { return getToken(SnippetParser.POINTER, 0); }
		public TerminalNode ID() { return getToken(SnippetParser.ID, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public DeclarationStatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarationStat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SnippetListener ) ((SnippetListener)listener).enterDeclarationStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SnippetListener ) ((SnippetListener)listener).exitDeclarationStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SnippetVisitor ) return ((SnippetVisitor<? extends T>)visitor).visitDeclarationStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationStatContext declarationStat() throws RecognitionException {
		DeclarationStatContext _localctx = new DeclarationStatContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_declarationStat);
		int _la;
		try {
			setState(139);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(127); type();
				setState(128); match(ID);
				{
				setState(129); match(T__5);
				setState(130); match(INT);
				setState(131); match(T__8);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(133); type();
				setState(135);
				_la = _input.LA(1);
				if (_la==POINTER) {
					{
					setState(134); match(POINTER);
					}
				}

				setState(137); match(ID);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReturnStatContext extends ParserRuleContext {
		public Arith_expressionContext arith_expression() {
			return getRuleContext(Arith_expressionContext.class,0);
		}
		public ReturnStatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SnippetListener ) ((SnippetListener)listener).enterReturnStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SnippetListener ) ((SnippetListener)listener).exitReturnStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SnippetVisitor ) return ((SnippetVisitor<? extends T>)visitor).visitReturnStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnStatContext returnStat() throws RecognitionException {
		ReturnStatContext _localctx = new ReturnStatContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_returnStat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141); match(T__2);
			{
			setState(142); arith_expression();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CallStatContext extends ParserRuleContext {
		public CallExprContext callExpr() {
			return getRuleContext(CallExprContext.class,0);
		}
		public CallStatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callStat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SnippetListener ) ((SnippetListener)listener).enterCallStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SnippetListener ) ((SnippetListener)listener).exitCallStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SnippetVisitor ) return ((SnippetVisitor<? extends T>)visitor).visitCallStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CallStatContext callStat() throws RecognitionException {
		CallStatContext _localctx = new CallStatContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_callStat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144); callExpr();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignStatContext extends ParserRuleContext {
		public TerminalNode POINTER() { return getToken(SnippetParser.POINTER, 0); }
		public Assign_expressionContext assign_expression() {
			return getRuleContext(Assign_expressionContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(SnippetParser.ASSIGN, 0); }
		public TerminalNode ID() { return getToken(SnippetParser.ID, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ArithmAssignOperatorContext arithmAssignOperator() {
			return getRuleContext(ArithmAssignOperatorContext.class,0);
		}
		public AssignStatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignStat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SnippetListener ) ((SnippetListener)listener).enterAssignStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SnippetListener ) ((SnippetListener)listener).exitAssignStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SnippetVisitor ) return ((SnippetVisitor<? extends T>)visitor).visitAssignStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignStatContext assignStat() throws RecognitionException {
		AssignStatContext _localctx = new AssignStatContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_assignStat);
		int _la;
		try {
			setState(164);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(147);
				_la = _input.LA(1);
				if (_la==POINTER) {
					{
					setState(146); match(POINTER);
					}
				}

				setState(149); match(ID);
				setState(150); match(ASSIGN);
				setState(151); assign_expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(152); type();
				setState(154);
				_la = _input.LA(1);
				if (_la==POINTER) {
					{
					setState(153); match(POINTER);
					}
				}

				setState(156); match(ID);
				setState(157); match(ASSIGN);
				setState(158); assign_expression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(160); match(ID);
				setState(161); arithmAssignOperator();
				setState(162); assign_expression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CallExprContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SnippetParser.ID, 0); }
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public CallExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SnippetListener ) ((SnippetListener)listener).enterCallExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SnippetListener ) ((SnippetListener)listener).exitCallExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SnippetVisitor ) return ((SnippetVisitor<? extends T>)visitor).visitCallExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CallExprContext callExpr() throws RecognitionException {
		CallExprContext _localctx = new CallExprContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_callExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166); match(ID);
			setState(167); arguments();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SelfIncreStatContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SnippetParser.ID, 0); }
		public IncreOperatorContext increOperator() {
			return getRuleContext(IncreOperatorContext.class,0);
		}
		public SelfIncreStatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selfIncreStat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SnippetListener ) ((SnippetListener)listener).enterSelfIncreStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SnippetListener ) ((SnippetListener)listener).exitSelfIncreStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SnippetVisitor ) return ((SnippetVisitor<? extends T>)visitor).visitSelfIncreStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelfIncreStatContext selfIncreStat() throws RecognitionException {
		SelfIncreStatContext _localctx = new SelfIncreStatContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_selfIncreStat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169); match(ID);
			setState(170); increOperator();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IncreOperatorContext extends ParserRuleContext {
		public TerminalNode DECRE() { return getToken(SnippetParser.DECRE, 0); }
		public TerminalNode INCRE() { return getToken(SnippetParser.INCRE, 0); }
		public IncreOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_increOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SnippetListener ) ((SnippetListener)listener).enterIncreOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SnippetListener ) ((SnippetListener)listener).exitIncreOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SnippetVisitor ) return ((SnippetVisitor<? extends T>)visitor).visitIncreOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IncreOperatorContext increOperator() throws RecognitionException {
		IncreOperatorContext _localctx = new IncreOperatorContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_increOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			_la = _input.LA(1);
			if ( !(_la==INCRE || _la==DECRE) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgumentsContext extends ParserRuleContext {
		public Assign_expressionContext assign_expression(int i) {
			return getRuleContext(Assign_expressionContext.class,i);
		}
		public List<Assign_expressionContext> assign_expression() {
			return getRuleContexts(Assign_expressionContext.class);
		}
		public TerminalNode RPAREN() { return getToken(SnippetParser.RPAREN, 0); }
		public TerminalNode LPAREN() { return getToken(SnippetParser.LPAREN, 0); }
		public ArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SnippetListener ) ((SnippetListener)listener).enterArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SnippetListener ) ((SnippetListener)listener).exitArguments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SnippetVisitor ) return ((SnippetVisitor<? extends T>)visitor).visitArguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentsContext arguments() throws RecognitionException {
		ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174); match(LPAREN);
			setState(183);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CharacterLiteral) | (1L << StringLiteral) | (1L << INT) | (1L << FLOAT) | (1L << ID) | (1L << LPAREN))) != 0)) {
				{
				setState(175); assign_expression();
				setState(180);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__6) {
					{
					{
					setState(176); match(T__6);
					setState(177); assign_expression();
					}
					}
					setState(182);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(185); match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Assign_expressionContext extends ParserRuleContext {
		public TerminalNode CharacterLiteral() { return getToken(SnippetParser.CharacterLiteral, 0); }
		public TerminalNode StringLiteral() { return getToken(SnippetParser.StringLiteral, 0); }
		public Arith_expressionContext arith_expression() {
			return getRuleContext(Arith_expressionContext.class,0);
		}
		public Assign_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SnippetListener ) ((SnippetListener)listener).enterAssign_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SnippetListener ) ((SnippetListener)listener).exitAssign_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SnippetVisitor ) return ((SnippetVisitor<? extends T>)visitor).visitAssign_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assign_expressionContext assign_expression() throws RecognitionException {
		Assign_expressionContext _localctx = new Assign_expressionContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_assign_expression);
		try {
			setState(190);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(187); arith_expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(188); match(StringLiteral);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(189); match(CharacterLiteral);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArithmAssignOperatorContext extends ParserRuleContext {
		public TerminalNode DIVIDESELF() { return getToken(SnippetParser.DIVIDESELF, 0); }
		public TerminalNode DEDUCTSELF() { return getToken(SnippetParser.DEDUCTSELF, 0); }
		public TerminalNode MULTISELF() { return getToken(SnippetParser.MULTISELF, 0); }
		public TerminalNode ADDSELF() { return getToken(SnippetParser.ADDSELF, 0); }
		public TerminalNode MODSELF() { return getToken(SnippetParser.MODSELF, 0); }
		public ArithmAssignOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithmAssignOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SnippetListener ) ((SnippetListener)listener).enterArithmAssignOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SnippetListener ) ((SnippetListener)listener).exitArithmAssignOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SnippetVisitor ) return ((SnippetVisitor<? extends T>)visitor).visitArithmAssignOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArithmAssignOperatorContext arithmAssignOperator() throws RecognitionException {
		ArithmAssignOperatorContext _localctx = new ArithmAssignOperatorContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_arithmAssignOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADDSELF) | (1L << DEDUCTSELF) | (1L << MODSELF) | (1L << MULTISELF) | (1L << DIVIDESELF))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CondExprContext extends ParserRuleContext {
		public Or_expressionContext or_expression() {
			return getRuleContext(Or_expressionContext.class,0);
		}
		public CondExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SnippetListener ) ((SnippetListener)listener).enterCondExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SnippetListener ) ((SnippetListener)listener).exitCondExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SnippetVisitor ) return ((SnippetVisitor<? extends T>)visitor).visitCondExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CondExprContext condExpr() throws RecognitionException {
		CondExprContext _localctx = new CondExprContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_condExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194); or_expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Or_expressionContext extends ParserRuleContext {
		public List<TerminalNode> OR() { return getTokens(SnippetParser.OR); }
		public And_expressionContext and_expression() {
			return getRuleContext(And_expressionContext.class,0);
		}
		public Or_expressionContext or_expression(int i) {
			return getRuleContext(Or_expressionContext.class,i);
		}
		public TerminalNode OR(int i) {
			return getToken(SnippetParser.OR, i);
		}
		public List<Or_expressionContext> or_expression() {
			return getRuleContexts(Or_expressionContext.class);
		}
		public Or_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_or_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SnippetListener ) ((SnippetListener)listener).enterOr_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SnippetListener ) ((SnippetListener)listener).exitOr_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SnippetVisitor ) return ((SnippetVisitor<? extends T>)visitor).visitOr_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Or_expressionContext or_expression() throws RecognitionException {
		Or_expressionContext _localctx = new Or_expressionContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_or_expression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(196); and_expression();
			setState(201);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(197); match(OR);
					setState(198); or_expression();
					}
					} 
				}
				setState(203);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class And_expressionContext extends ParserRuleContext {
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public List<TerminalNode> AND() { return getTokens(SnippetParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(SnippetParser.AND, i);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public And_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_and_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SnippetListener ) ((SnippetListener)listener).enterAnd_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SnippetListener ) ((SnippetListener)listener).exitAnd_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SnippetVisitor ) return ((SnippetVisitor<? extends T>)visitor).visitAnd_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final And_expressionContext and_expression() throws RecognitionException {
		And_expressionContext _localctx = new And_expressionContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_and_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(204); term();
			setState(209);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND) {
				{
				{
				setState(205); match(AND);
				setState(206); term();
				}
				}
				setState(211);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TermContext extends ParserRuleContext {
		public AtomContext atom(int i) {
			return getRuleContext(AtomContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(SnippetParser.RPAREN, 0); }
		public OperatorContext operator() {
			return getRuleContext(OperatorContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(SnippetParser.LPAREN, 0); }
		public Or_expressionContext or_expression() {
			return getRuleContext(Or_expressionContext.class,0);
		}
		public List<AtomContext> atom() {
			return getRuleContexts(AtomContext.class);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SnippetListener ) ((SnippetListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SnippetListener ) ((SnippetListener)listener).exitTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SnippetVisitor ) return ((SnippetVisitor<? extends T>)visitor).visitTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_term);
		int _la;
		try {
			setState(222);
			switch (_input.LA(1)) {
			case CharacterLiteral:
			case INT:
			case FLOAT:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(212); atom();
				setState(216);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LT) | (1L << LE) | (1L << GT) | (1L << GE) | (1L << EQ) | (1L << NEQ))) != 0)) {
					{
					setState(213); operator();
					setState(214); atom();
					}
				}

				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 2);
				{
				setState(218); match(LPAREN);
				setState(219); or_expression();
				setState(220); match(RPAREN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Arith_expressionContext extends ParserRuleContext {
		public Add_expressionContext add_expression() {
			return getRuleContext(Add_expressionContext.class,0);
		}
		public Arith_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arith_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SnippetListener ) ((SnippetListener)listener).enterArith_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SnippetListener ) ((SnippetListener)listener).exitArith_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SnippetVisitor ) return ((SnippetVisitor<? extends T>)visitor).visitArith_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Arith_expressionContext arith_expression() throws RecognitionException {
		Arith_expressionContext _localctx = new Arith_expressionContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_arith_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(224); add_expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Add_expressionContext extends ParserRuleContext {
		public AddOperatorContext addOperator(int i) {
			return getRuleContext(AddOperatorContext.class,i);
		}
		public Add_expressionContext add_expression(int i) {
			return getRuleContext(Add_expressionContext.class,i);
		}
		public List<AddOperatorContext> addOperator() {
			return getRuleContexts(AddOperatorContext.class);
		}
		public List<Add_expressionContext> add_expression() {
			return getRuleContexts(Add_expressionContext.class);
		}
		public Multi_expressionContext multi_expression() {
			return getRuleContext(Multi_expressionContext.class,0);
		}
		public Add_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_add_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SnippetListener ) ((SnippetListener)listener).enterAdd_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SnippetListener ) ((SnippetListener)listener).exitAdd_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SnippetVisitor ) return ((SnippetVisitor<? extends T>)visitor).visitAdd_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Add_expressionContext add_expression() throws RecognitionException {
		Add_expressionContext _localctx = new Add_expressionContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_add_expression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(226); multi_expression();
			setState(232);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(227); addOperator();
					setState(228); add_expression();
					}
					} 
				}
				setState(234);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Multi_expressionContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<MultiOperatorContext> multiOperator() {
			return getRuleContexts(MultiOperatorContext.class);
		}
		public MultiOperatorContext multiOperator(int i) {
			return getRuleContext(MultiOperatorContext.class,i);
		}
		public Multi_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multi_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SnippetListener ) ((SnippetListener)listener).enterMulti_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SnippetListener ) ((SnippetListener)listener).exitMulti_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SnippetVisitor ) return ((SnippetVisitor<? extends T>)visitor).visitMulti_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Multi_expressionContext multi_expression() throws RecognitionException {
		Multi_expressionContext _localctx = new Multi_expressionContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_multi_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(235); expr();
			setState(241);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MULTIPLY) | (1L << DIVIDE) | (1L << MOD))) != 0)) {
				{
				{
				setState(236); multiOperator();
				setState(237); expr();
				}
				}
				setState(243);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		public Add_expressionContext add_expression() {
			return getRuleContext(Add_expressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(SnippetParser.RPAREN, 0); }
		public TerminalNode LPAREN() { return getToken(SnippetParser.LPAREN, 0); }
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SnippetListener ) ((SnippetListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SnippetListener ) ((SnippetListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SnippetVisitor ) return ((SnippetVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_expr);
		try {
			setState(249);
			switch (_input.LA(1)) {
			case CharacterLiteral:
			case INT:
			case FLOAT:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(244); atom();
				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 2);
				{
				setState(245); match(LPAREN);
				setState(246); add_expression();
				setState(247); match(RPAREN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AddOperatorContext extends ParserRuleContext {
		public TerminalNode DEDUCTIVE() { return getToken(SnippetParser.DEDUCTIVE, 0); }
		public TerminalNode ADDCTIVE() { return getToken(SnippetParser.ADDCTIVE, 0); }
		public AddOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SnippetListener ) ((SnippetListener)listener).enterAddOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SnippetListener ) ((SnippetListener)listener).exitAddOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SnippetVisitor ) return ((SnippetVisitor<? extends T>)visitor).visitAddOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AddOperatorContext addOperator() throws RecognitionException {
		AddOperatorContext _localctx = new AddOperatorContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_addOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(251);
			_la = _input.LA(1);
			if ( !(_la==ADDCTIVE || _la==DEDUCTIVE) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MultiOperatorContext extends ParserRuleContext {
		public TerminalNode MULTIPLY() { return getToken(SnippetParser.MULTIPLY, 0); }
		public TerminalNode DIVIDE() { return getToken(SnippetParser.DIVIDE, 0); }
		public TerminalNode MOD() { return getToken(SnippetParser.MOD, 0); }
		public MultiOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SnippetListener ) ((SnippetListener)listener).enterMultiOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SnippetListener ) ((SnippetListener)listener).exitMultiOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SnippetVisitor ) return ((SnippetVisitor<? extends T>)visitor).visitMultiOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiOperatorContext multiOperator() throws RecognitionException {
		MultiOperatorContext _localctx = new MultiOperatorContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_multiOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(253);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MULTIPLY) | (1L << DIVIDE) | (1L << MOD))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AtomContext extends ParserRuleContext {
		public TerminalNode FLOAT() { return getToken(SnippetParser.FLOAT, 0); }
		public TerminalNode INT() { return getToken(SnippetParser.INT, 0); }
		public TerminalNode CharacterLiteral() { return getToken(SnippetParser.CharacterLiteral, 0); }
		public TerminalNode ID() { return getToken(SnippetParser.ID, 0); }
		public CallExprContext callExpr() {
			return getRuleContext(CallExprContext.class,0);
		}
		public AtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SnippetListener ) ((SnippetListener)listener).enterAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SnippetListener ) ((SnippetListener)listener).exitAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SnippetVisitor ) return ((SnippetVisitor<? extends T>)visitor).visitAtom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtomContext atom() throws RecognitionException {
		AtomContext _localctx = new AtomContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_atom);
		try {
			setState(260);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(255); match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(256); match(INT);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(257); match(FLOAT);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(258); match(CharacterLiteral);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(259); callExpr();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OperatorContext extends ParserRuleContext {
		public TerminalNode NEQ() { return getToken(SnippetParser.NEQ, 0); }
		public TerminalNode LT() { return getToken(SnippetParser.LT, 0); }
		public TerminalNode LE() { return getToken(SnippetParser.LE, 0); }
		public TerminalNode GT() { return getToken(SnippetParser.GT, 0); }
		public TerminalNode GE() { return getToken(SnippetParser.GE, 0); }
		public TerminalNode EQ() { return getToken(SnippetParser.EQ, 0); }
		public OperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SnippetListener ) ((SnippetListener)listener).enterOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SnippetListener ) ((SnippetListener)listener).exitOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SnippetVisitor ) return ((SnippetVisitor<? extends T>)visitor).visitOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperatorContext operator() throws RecognitionException {
		OperatorContext _localctx = new OperatorContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(262);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LT) | (1L << LE) | (1L << GT) | (1L << GE) | (1L << EQ) | (1L << NEQ))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\61\u010b\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\3\2\7\2D\n\2\f\2\16\2G\13\2\3\3\3\3\3\4\3\4\7\4M\n\4\f\4\16\4P\13"+
		"\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\5\5d\n\5\3\6\3\6\5\6h\n\6\3\6\5\6k\n\6\3\7\3\7\3\7\3\7\3\b\6\br\n"+
		"\b\r\b\16\bs\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\5\13\u0080\n\13"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u008a\n\f\3\f\3\f\5\f\u008e\n\f\3"+
		"\r\3\r\3\r\3\16\3\16\3\17\5\17\u0096\n\17\3\17\3\17\3\17\3\17\3\17\5\17"+
		"\u009d\n\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00a7\n\17\3"+
		"\20\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\23\3\23\3\23\3\23\7\23\u00b5"+
		"\n\23\f\23\16\23\u00b8\13\23\5\23\u00ba\n\23\3\23\3\23\3\24\3\24\3\24"+
		"\5\24\u00c1\n\24\3\25\3\25\3\26\3\26\3\27\3\27\3\27\7\27\u00ca\n\27\f"+
		"\27\16\27\u00cd\13\27\3\30\3\30\3\30\7\30\u00d2\n\30\f\30\16\30\u00d5"+
		"\13\30\3\31\3\31\3\31\3\31\5\31\u00db\n\31\3\31\3\31\3\31\3\31\5\31\u00e1"+
		"\n\31\3\32\3\32\3\33\3\33\3\33\3\33\7\33\u00e9\n\33\f\33\16\33\u00ec\13"+
		"\33\3\34\3\34\3\34\3\34\7\34\u00f2\n\34\f\34\16\34\u00f5\13\34\3\35\3"+
		"\35\3\35\3\35\3\35\5\35\u00fc\n\35\3\36\3\36\3\37\3\37\3 \3 \3 \3 \3 "+
		"\5 \u0107\n \3!\3!\3!\2\2\"\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \""+
		"$&(*,.\60\62\64\668:<>@\2\b\3\2\20\24\3\2#$\3\2%)\3\2\35\36\3\2\37!\3"+
		"\2*/\u010a\2E\3\2\2\2\4H\3\2\2\2\6J\3\2\2\2\bc\3\2\2\2\ne\3\2\2\2\fl\3"+
		"\2\2\2\16q\3\2\2\2\20u\3\2\2\2\22x\3\2\2\2\24\177\3\2\2\2\26\u008d\3\2"+
		"\2\2\30\u008f\3\2\2\2\32\u0092\3\2\2\2\34\u00a6\3\2\2\2\36\u00a8\3\2\2"+
		"\2 \u00ab\3\2\2\2\"\u00ae\3\2\2\2$\u00b0\3\2\2\2&\u00c0\3\2\2\2(\u00c2"+
		"\3\2\2\2*\u00c4\3\2\2\2,\u00c6\3\2\2\2.\u00ce\3\2\2\2\60\u00e0\3\2\2\2"+
		"\62\u00e2\3\2\2\2\64\u00e4\3\2\2\2\66\u00ed\3\2\2\28\u00fb\3\2\2\2:\u00fd"+
		"\3\2\2\2<\u00ff\3\2\2\2>\u0106\3\2\2\2@\u0108\3\2\2\2BD\5\b\5\2CB\3\2"+
		"\2\2DG\3\2\2\2EC\3\2\2\2EF\3\2\2\2F\3\3\2\2\2GE\3\2\2\2HI\t\2\2\2I\5\3"+
		"\2\2\2JN\7\4\2\2KM\5\b\5\2LK\3\2\2\2MP\3\2\2\2NL\3\2\2\2NO\3\2\2\2OQ\3"+
		"\2\2\2PN\3\2\2\2QR\7\n\2\2R\7\3\2\2\2ST\5\26\f\2TU\7\13\2\2Ud\3\2\2\2"+
		"Vd\5\n\6\2WX\5\30\r\2XY\7\13\2\2Yd\3\2\2\2Z[\5\32\16\2[\\\7\13\2\2\\d"+
		"\3\2\2\2]^\5\34\17\2^_\7\13\2\2_d\3\2\2\2`a\5 \21\2ab\7\13\2\2bd\3\2\2"+
		"\2cS\3\2\2\2cV\3\2\2\2cW\3\2\2\2cZ\3\2\2\2c]\3\2\2\2c`\3\2\2\2d\t\3\2"+
		"\2\2eg\5\f\7\2fh\5\16\b\2gf\3\2\2\2gh\3\2\2\2hj\3\2\2\2ik\5\20\t\2ji\3"+
		"\2\2\2jk\3\2\2\2k\13\3\2\2\2lm\7\7\2\2mn\5*\26\2no\5\24\13\2o\r\3\2\2"+
		"\2pr\5\22\n\2qp\3\2\2\2rs\3\2\2\2sq\3\2\2\2st\3\2\2\2t\17\3\2\2\2uv\7"+
		"\b\2\2vw\5\24\13\2w\21\3\2\2\2xy\7\b\2\2yz\7\7\2\2z{\5*\26\2{|\5\24\13"+
		"\2|\23\3\2\2\2}\u0080\5\b\5\2~\u0080\5\6\4\2\177}\3\2\2\2\177~\3\2\2\2"+
		"\u0080\25\3\2\2\2\u0081\u0082\5\4\3\2\u0082\u0083\7\30\2\2\u0083\u0084"+
		"\7\6\2\2\u0084\u0085\7\25\2\2\u0085\u0086\7\3\2\2\u0086\u008e\3\2\2\2"+
		"\u0087\u0089\5\4\3\2\u0088\u008a\7\60\2\2\u0089\u0088\3\2\2\2\u0089\u008a"+
		"\3\2\2\2\u008a\u008b\3\2\2\2\u008b\u008c\7\30\2\2\u008c\u008e\3\2\2\2"+
		"\u008d\u0081\3\2\2\2\u008d\u0087\3\2\2\2\u008e\27\3\2\2\2\u008f\u0090"+
		"\7\t\2\2\u0090\u0091\5\62\32\2\u0091\31\3\2\2\2\u0092\u0093\5\36\20\2"+
		"\u0093\33\3\2\2\2\u0094\u0096\7\60\2\2\u0095\u0094\3\2\2\2\u0095\u0096"+
		"\3\2\2\2\u0096\u0097\3\2\2\2\u0097\u0098\7\30\2\2\u0098\u0099\7\"\2\2"+
		"\u0099\u00a7\5&\24\2\u009a\u009c\5\4\3\2\u009b\u009d\7\60\2\2\u009c\u009b"+
		"\3\2\2\2\u009c\u009d\3\2\2\2\u009d\u009e\3\2\2\2\u009e\u009f\7\30\2\2"+
		"\u009f\u00a0\7\"\2\2\u00a0\u00a1\5&\24\2\u00a1\u00a7\3\2\2\2\u00a2\u00a3"+
		"\7\30\2\2\u00a3\u00a4\5(\25\2\u00a4\u00a5\5&\24\2\u00a5\u00a7\3\2\2\2"+
		"\u00a6\u0095\3\2\2\2\u00a6\u009a\3\2\2\2\u00a6\u00a2\3\2\2\2\u00a7\35"+
		"\3\2\2\2\u00a8\u00a9\7\30\2\2\u00a9\u00aa\5$\23\2\u00aa\37\3\2\2\2\u00ab"+
		"\u00ac\7\30\2\2\u00ac\u00ad\5\"\22\2\u00ad!\3\2\2\2\u00ae\u00af\t\3\2"+
		"\2\u00af#\3\2\2\2\u00b0\u00b9\7\33\2\2\u00b1\u00b6\5&\24\2\u00b2\u00b3"+
		"\7\5\2\2\u00b3\u00b5\5&\24\2\u00b4\u00b2\3\2\2\2\u00b5\u00b8\3\2\2\2\u00b6"+
		"\u00b4\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7\u00ba\3\2\2\2\u00b8\u00b6\3\2"+
		"\2\2\u00b9\u00b1\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb"+
		"\u00bc\7\34\2\2\u00bc%\3\2\2\2\u00bd\u00c1\5\62\32\2\u00be\u00c1\7\17"+
		"\2\2\u00bf\u00c1\7\16\2\2\u00c0\u00bd\3\2\2\2\u00c0\u00be\3\2\2\2\u00c0"+
		"\u00bf\3\2\2\2\u00c1\'\3\2\2\2\u00c2\u00c3\t\4\2\2\u00c3)\3\2\2\2\u00c4"+
		"\u00c5\5,\27\2\u00c5+\3\2\2\2\u00c6\u00cb\5.\30\2\u00c7\u00c8\7\31\2\2"+
		"\u00c8\u00ca\5,\27\2\u00c9\u00c7\3\2\2\2\u00ca\u00cd\3\2\2\2\u00cb\u00c9"+
		"\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc-\3\2\2\2\u00cd\u00cb\3\2\2\2\u00ce"+
		"\u00d3\5\60\31\2\u00cf\u00d0\7\32\2\2\u00d0\u00d2\5\60\31\2\u00d1\u00cf"+
		"\3\2\2\2\u00d2\u00d5\3\2\2\2\u00d3\u00d1\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4"+
		"/\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d6\u00da\5> \2\u00d7\u00d8\5@!\2\u00d8"+
		"\u00d9\5> \2\u00d9\u00db\3\2\2\2\u00da\u00d7\3\2\2\2\u00da\u00db\3\2\2"+
		"\2\u00db\u00e1\3\2\2\2\u00dc\u00dd\7\33\2\2\u00dd\u00de\5,\27\2\u00de"+
		"\u00df\7\34\2\2\u00df\u00e1\3\2\2\2\u00e0\u00d6\3\2\2\2\u00e0\u00dc\3"+
		"\2\2\2\u00e1\61\3\2\2\2\u00e2\u00e3\5\64\33\2\u00e3\63\3\2\2\2\u00e4\u00ea"+
		"\5\66\34\2\u00e5\u00e6\5:\36\2\u00e6\u00e7\5\64\33\2\u00e7\u00e9\3\2\2"+
		"\2\u00e8\u00e5\3\2\2\2\u00e9\u00ec\3\2\2\2\u00ea\u00e8\3\2\2\2\u00ea\u00eb"+
		"\3\2\2\2\u00eb\65\3\2\2\2\u00ec\u00ea\3\2\2\2\u00ed\u00f3\58\35\2\u00ee"+
		"\u00ef\5<\37\2\u00ef\u00f0\58\35\2\u00f0\u00f2\3\2\2\2\u00f1\u00ee\3\2"+
		"\2\2\u00f2\u00f5\3\2\2\2\u00f3\u00f1\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4"+
		"\67\3\2\2\2\u00f5\u00f3\3\2\2\2\u00f6\u00fc\5> \2\u00f7\u00f8\7\33\2\2"+
		"\u00f8\u00f9\5\64\33\2\u00f9\u00fa\7\34\2\2\u00fa\u00fc\3\2\2\2\u00fb"+
		"\u00f6\3\2\2\2\u00fb\u00f7\3\2\2\2\u00fc9\3\2\2\2\u00fd\u00fe\t\5\2\2"+
		"\u00fe;\3\2\2\2\u00ff\u0100\t\6\2\2\u0100=\3\2\2\2\u0101\u0107\7\30\2"+
		"\2\u0102\u0107\7\25\2\2\u0103\u0107\7\26\2\2\u0104\u0107\7\16\2\2\u0105"+
		"\u0107\5\36\20\2\u0106\u0101\3\2\2\2\u0106\u0102\3\2\2\2\u0106\u0103\3"+
		"\2\2\2\u0106\u0104\3\2\2\2\u0106\u0105\3\2\2\2\u0107?\3\2\2\2\u0108\u0109"+
		"\t\7\2\2\u0109A\3\2\2\2\31ENcgjs\177\u0089\u008d\u0095\u009c\u00a6\u00b6"+
		"\u00b9\u00c0\u00cb\u00d3\u00da\u00e0\u00ea\u00f3\u00fb\u0106";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}