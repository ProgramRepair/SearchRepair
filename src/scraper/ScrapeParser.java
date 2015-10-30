// Generated from Scrape.g4 by ANTLR 4.4
package scraper;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ScrapeParser extends Parser {
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
	public static final String[] tokenNames = {
		"<INVALID>", "'else'", "'return'", "'['", "';'", "'{'", "','", "']'", 
		"'}'", "'if'", "'for'", "BlockComment", "LineComment", "CharacterLiteral", 
		"StringLiteral", "'int'", "'char'", "'float'", "'char*'", "'unsigned'", 
		"'double'", "INT", "FLOAT", "STRING", "ID", "'||'", "'&&'", "'('", "')'", 
		"'+'", "'-'", "MULTIPLY", "'/'", "'%'", "'='", "'++'", "'--'", "'+='", 
		"'-='", "'%='", "'*='", "'/='", "'<'", "'<='", "'>'", "'>='", "'=='", 
		"'!='", "POINTER", "WS"
	};
	public static final int
		RULE_prog = 0, RULE_type = 1, RULE_block = 2, RULE_stat = 3, RULE_if_stat = 4, 
		RULE_forStat = 5, RULE_ifpart = 6, RULE_elseifpart = 7, RULE_elsepart = 8, 
		RULE_elseifblock = 9, RULE_ifblock = 10, RULE_declarationStat = 11, RULE_returnStat = 12, 
		RULE_callStat = 13, RULE_assignStat = 14, RULE_callExpr = 15, RULE_selfIncreStat = 16, 
		RULE_increOperator = 17, RULE_arguments = 18, RULE_assign_expression = 19, 
		RULE_arithmAssignOperator = 20, RULE_condExpr = 21, RULE_or_expression = 22, 
		RULE_and_expression = 23, RULE_term = 24, RULE_arith_expression = 25, 
		RULE_add_expression = 26, RULE_multi_expression = 27, RULE_expr = 28, 
		RULE_addOperator = 29, RULE_multiOperator = 30, RULE_atom = 31, RULE_operator = 32;
	public static final String[] ruleNames = {
		"prog", "type", "block", "stat", "if_stat", "forStat", "ifpart", "elseifpart", 
		"elsepart", "elseifblock", "ifblock", "declarationStat", "returnStat", 
		"callStat", "assignStat", "callExpr", "selfIncreStat", "increOperator", 
		"arguments", "assign_expression", "arithmAssignOperator", "condExpr", 
		"or_expression", "and_expression", "term", "arith_expression", "add_expression", 
		"multi_expression", "expr", "addOperator", "multiOperator", "atom", "operator"
	};

	@Override
	public String getGrammarFileName() { return "Scrape.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ScrapeParser(TokenStream input) {
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
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__1) | (1L << T__0) | (1L << Int) | (1L << Char) | (1L << Float) | (1L << String) | (1L << UnSigned) | (1L << Double) | (1L << ID) | (1L << POINTER))) != 0)) {
				{
				{
				setState(66); stat();
				}
				}
				setState(71);
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
		public TerminalNode Char() { return getToken(ScrapeParser.Char, 0); }
		public TerminalNode String() { return getToken(ScrapeParser.String, 0); }
		public TerminalNode Float() { return getToken(ScrapeParser.Float, 0); }
		public TerminalNode Int() { return getToken(ScrapeParser.Int, 0); }
		public TerminalNode Double() { return getToken(ScrapeParser.Double, 0); }
		public TerminalNode UnSigned() { return getToken(ScrapeParser.UnSigned, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Int) | (1L << Char) | (1L << Float) | (1L << String) | (1L << UnSigned) | (1L << Double))) != 0)) ) {
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
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74); match(T__5);
			setState(78);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__1) | (1L << T__0) | (1L << Int) | (1L << Char) | (1L << Float) | (1L << String) | (1L << UnSigned) | (1L << Double) | (1L << ID) | (1L << POINTER))) != 0)) {
				{
				{
				setState(75); stat();
				}
				}
				setState(80);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(81); match(T__2);
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
		public DeclarationStatContext declarationStat() {
			return getRuleContext(DeclarationStatContext.class,0);
		}
		public SelfIncreStatContext selfIncreStat() {
			return getRuleContext(SelfIncreStatContext.class,0);
		}
		public ForStatContext forStat() {
			return getRuleContext(ForStatContext.class,0);
		}
		public If_statContext if_stat() {
			return getRuleContext(If_statContext.class,0);
		}
		public CallStatContext callStat() {
			return getRuleContext(CallStatContext.class,0);
		}
		public ReturnStatContext returnStat() {
			return getRuleContext(ReturnStatContext.class,0);
		}
		public AssignStatContext assignStat() {
			return getRuleContext(AssignStatContext.class,0);
		}
		public StatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat; }
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_stat);
		try {
			setState(100);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(83); declarationStat();
				setState(84); match(T__6);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(86); if_stat();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(87); returnStat();
				setState(88); match(T__6);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(90); callStat();
				setState(91); match(T__6);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(93); assignStat();
				setState(94); match(T__6);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(96); selfIncreStat();
				setState(97); match(T__6);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(99); forStat();
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
		public ElseifpartContext elseifpart() {
			return getRuleContext(ElseifpartContext.class,0);
		}
		public IfpartContext ifpart() {
			return getRuleContext(IfpartContext.class,0);
		}
		public ElsepartContext elsepart() {
			return getRuleContext(ElsepartContext.class,0);
		}
		public If_statContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_stat; }
	}

	public final If_statContext if_stat() throws RecognitionException {
		If_statContext _localctx = new If_statContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_if_stat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102); ifpart();
			setState(104);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(103); elseifpart();
				}
				break;
			}
			setState(107);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(106); elsepart();
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

	public static class ForStatContext extends ParserRuleContext {
		public CondExprContext condExpr() {
			return getRuleContext(CondExprContext.class,0);
		}
		public StatContext stat() {
			return getRuleContext(StatContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public AssignStatContext assignStat() {
			return getRuleContext(AssignStatContext.class,0);
		}
		public ForStatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStat; }
	}

	public final ForStatContext forStat() throws RecognitionException {
		ForStatContext _localctx = new ForStatContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_forStat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109); match(T__0);
			setState(110); match(LPAREN);
			setState(111); assignStat();
			setState(112); match(T__6);
			setState(113); condExpr();
			setState(114); match(T__6);
			setState(115); stat();
			setState(116); match(RPAREN);
			setState(117); block();
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
		public CondExprContext condExpr() {
			return getRuleContext(CondExprContext.class,0);
		}
		public IfblockContext ifblock() {
			return getRuleContext(IfblockContext.class,0);
		}
		public IfpartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifpart; }
	}

	public final IfpartContext ifpart() throws RecognitionException {
		IfpartContext _localctx = new IfpartContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_ifpart);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119); match(T__1);
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
	}

	public final ElseifpartContext elseifpart() throws RecognitionException {
		ElseifpartContext _localctx = new ElseifpartContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_elseifpart);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(124); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(123); elseifblock();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(126); 
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
	}

	public final ElsepartContext elsepart() throws RecognitionException {
		ElsepartContext _localctx = new ElsepartContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_elsepart);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128); match(T__9);
			setState(129); ifblock();
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
		public CondExprContext condExpr() {
			return getRuleContext(CondExprContext.class,0);
		}
		public IfblockContext ifblock() {
			return getRuleContext(IfblockContext.class,0);
		}
		public ElseifblockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseifblock; }
	}

	public final ElseifblockContext elseifblock() throws RecognitionException {
		ElseifblockContext _localctx = new ElseifblockContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_elseifblock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131); match(T__9);
			setState(132); match(T__1);
			setState(133); condExpr();
			setState(134); ifblock();
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
	}

	public final IfblockContext ifblock() throws RecognitionException {
		IfblockContext _localctx = new IfblockContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_ifblock);
		try {
			setState(138);
			switch (_input.LA(1)) {
			case T__8:
			case T__1:
			case T__0:
			case Int:
			case Char:
			case Float:
			case String:
			case UnSigned:
			case Double:
			case ID:
			case POINTER:
				enterOuterAlt(_localctx, 1);
				{
				setState(136); stat();
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 2);
				{
				setState(137); block();
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
		public TerminalNode POINTER() { return getToken(ScrapeParser.POINTER, 0); }
		public TerminalNode ID() { return getToken(ScrapeParser.ID, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode INT() { return getToken(ScrapeParser.INT, 0); }
		public DeclarationStatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarationStat; }
	}

	public final DeclarationStatContext declarationStat() throws RecognitionException {
		DeclarationStatContext _localctx = new DeclarationStatContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_declarationStat);
		int _la;
		try {
			setState(152);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(140); type();
				setState(141); match(ID);
				{
				setState(142); match(T__7);
				setState(143); match(INT);
				setState(144); match(T__3);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(146); type();
				setState(148);
				_la = _input.LA(1);
				if (_la==POINTER) {
					{
					setState(147); match(POINTER);
					}
				}

				setState(150); match(ID);
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
	}

	public final ReturnStatContext returnStat() throws RecognitionException {
		ReturnStatContext _localctx = new ReturnStatContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_returnStat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154); match(T__8);
			{
			setState(155); arith_expression();
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
	}

	public final CallStatContext callStat() throws RecognitionException {
		CallStatContext _localctx = new CallStatContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_callStat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157); callExpr();
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
		public TerminalNode POINTER() { return getToken(ScrapeParser.POINTER, 0); }
		public TerminalNode ID() { return getToken(ScrapeParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(ScrapeParser.ASSIGN, 0); }
		public ArithmAssignOperatorContext arithmAssignOperator() {
			return getRuleContext(ArithmAssignOperatorContext.class,0);
		}
		public Assign_expressionContext assign_expression() {
			return getRuleContext(Assign_expressionContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public AssignStatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignStat; }
	}

	public final AssignStatContext assignStat() throws RecognitionException {
		AssignStatContext _localctx = new AssignStatContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_assignStat);
		int _la;
		try {
			setState(177);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(160);
				_la = _input.LA(1);
				if (_la==POINTER) {
					{
					setState(159); match(POINTER);
					}
				}

				setState(162); match(ID);
				setState(163); match(ASSIGN);
				setState(164); assign_expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(165); type();
				setState(167);
				_la = _input.LA(1);
				if (_la==POINTER) {
					{
					setState(166); match(POINTER);
					}
				}

				setState(169); match(ID);
				setState(170); match(ASSIGN);
				setState(171); assign_expression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(173); match(ID);
				setState(174); arithmAssignOperator();
				setState(175); assign_expression();
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
		public TerminalNode ID() { return getToken(ScrapeParser.ID, 0); }
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public CallExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callExpr; }
	}

	public final CallExprContext callExpr() throws RecognitionException {
		CallExprContext _localctx = new CallExprContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_callExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179); match(ID);
			setState(180); arguments();
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
		public TerminalNode ID() { return getToken(ScrapeParser.ID, 0); }
		public IncreOperatorContext increOperator() {
			return getRuleContext(IncreOperatorContext.class,0);
		}
		public SelfIncreStatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selfIncreStat; }
	}

	public final SelfIncreStatContext selfIncreStat() throws RecognitionException {
		SelfIncreStatContext _localctx = new SelfIncreStatContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_selfIncreStat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(182); match(ID);
			setState(183); increOperator();
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
		public TerminalNode INCRE() { return getToken(ScrapeParser.INCRE, 0); }
		public TerminalNode DECRE() { return getToken(ScrapeParser.DECRE, 0); }
		public IncreOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_increOperator; }
	}

	public final IncreOperatorContext increOperator() throws RecognitionException {
		IncreOperatorContext _localctx = new IncreOperatorContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_increOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
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
		public TerminalNode LPAREN() { return getToken(ScrapeParser.LPAREN, 0); }
		public List<Assign_expressionContext> assign_expression() {
			return getRuleContexts(Assign_expressionContext.class);
		}
		public TerminalNode RPAREN() { return getToken(ScrapeParser.RPAREN, 0); }
		public ArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arguments; }
	}

	public final ArgumentsContext arguments() throws RecognitionException {
		ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(187); match(LPAREN);
			setState(196);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CharacterLiteral) | (1L << StringLiteral) | (1L << INT) | (1L << FLOAT) | (1L << ID) | (1L << LPAREN))) != 0)) {
				{
				setState(188); assign_expression();
				setState(193);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__4) {
					{
					{
					setState(189); match(T__4);
					setState(190); assign_expression();
					}
					}
					setState(195);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(198); match(RPAREN);
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
		public Arith_expressionContext arith_expression() {
			return getRuleContext(Arith_expressionContext.class,0);
		}
		public TerminalNode StringLiteral() { return getToken(ScrapeParser.StringLiteral, 0); }
		public TerminalNode CharacterLiteral() { return getToken(ScrapeParser.CharacterLiteral, 0); }
		public Assign_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign_expression; }
	}

	public final Assign_expressionContext assign_expression() throws RecognitionException {
		Assign_expressionContext _localctx = new Assign_expressionContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_assign_expression);
		try {
			setState(203);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(200); arith_expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(201); match(StringLiteral);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(202); match(CharacterLiteral);
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
		public TerminalNode MULTISELF() { return getToken(ScrapeParser.MULTISELF, 0); }
		public TerminalNode MODSELF() { return getToken(ScrapeParser.MODSELF, 0); }
		public TerminalNode DEDUCTSELF() { return getToken(ScrapeParser.DEDUCTSELF, 0); }
		public TerminalNode ADDSELF() { return getToken(ScrapeParser.ADDSELF, 0); }
		public TerminalNode DIVIDESELF() { return getToken(ScrapeParser.DIVIDESELF, 0); }
		public ArithmAssignOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithmAssignOperator; }
	}

	public final ArithmAssignOperatorContext arithmAssignOperator() throws RecognitionException {
		ArithmAssignOperatorContext _localctx = new ArithmAssignOperatorContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_arithmAssignOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
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
	}

	public final CondExprContext condExpr() throws RecognitionException {
		CondExprContext _localctx = new CondExprContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_condExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(207); or_expression();
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
		public Or_expressionContext or_expression(int i) {
			return getRuleContext(Or_expressionContext.class,i);
		}
		public List<TerminalNode> OR() { return getTokens(ScrapeParser.OR); }
		public TerminalNode OR(int i) {
			return getToken(ScrapeParser.OR, i);
		}
		public And_expressionContext and_expression() {
			return getRuleContext(And_expressionContext.class,0);
		}
		public List<Or_expressionContext> or_expression() {
			return getRuleContexts(Or_expressionContext.class);
		}
		public Or_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_or_expression; }
	}

	public final Or_expressionContext or_expression() throws RecognitionException {
		Or_expressionContext _localctx = new Or_expressionContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_or_expression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(209); and_expression();
			setState(214);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(210); match(OR);
					setState(211); or_expression();
					}
					} 
				}
				setState(216);
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
		public TerminalNode AND(int i) {
			return getToken(ScrapeParser.AND, i);
		}
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public List<TerminalNode> AND() { return getTokens(ScrapeParser.AND); }
		public And_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_and_expression; }
	}

	public final And_expressionContext and_expression() throws RecognitionException {
		And_expressionContext _localctx = new And_expressionContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_and_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(217); term();
			setState(222);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND) {
				{
				{
				setState(218); match(AND);
				setState(219); term();
				}
				}
				setState(224);
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
		public TerminalNode LPAREN() { return getToken(ScrapeParser.LPAREN, 0); }
		public OperatorContext operator() {
			return getRuleContext(OperatorContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(ScrapeParser.RPAREN, 0); }
		public List<AtomContext> atom() {
			return getRuleContexts(AtomContext.class);
		}
		public Or_expressionContext or_expression() {
			return getRuleContext(Or_expressionContext.class,0);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_term);
		int _la;
		try {
			setState(235);
			switch (_input.LA(1)) {
			case CharacterLiteral:
			case INT:
			case FLOAT:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(225); atom();
				setState(229);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LT) | (1L << LE) | (1L << GT) | (1L << GE) | (1L << EQ) | (1L << NEQ))) != 0)) {
					{
					setState(226); operator();
					setState(227); atom();
					}
				}

				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 2);
				{
				setState(231); match(LPAREN);
				setState(232); or_expression();
				setState(233); match(RPAREN);
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
	}

	public final Arith_expressionContext arith_expression() throws RecognitionException {
		Arith_expressionContext _localctx = new Arith_expressionContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_arith_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237); add_expression();
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
		public Multi_expressionContext multi_expression() {
			return getRuleContext(Multi_expressionContext.class,0);
		}
		public List<AddOperatorContext> addOperator() {
			return getRuleContexts(AddOperatorContext.class);
		}
		public List<Add_expressionContext> add_expression() {
			return getRuleContexts(Add_expressionContext.class);
		}
		public Add_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_add_expression; }
	}

	public final Add_expressionContext add_expression() throws RecognitionException {
		Add_expressionContext _localctx = new Add_expressionContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_add_expression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(239); multi_expression();
			setState(245);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(240); addOperator();
					setState(241); add_expression();
					}
					} 
				}
				setState(247);
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
	}

	public final Multi_expressionContext multi_expression() throws RecognitionException {
		Multi_expressionContext _localctx = new Multi_expressionContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_multi_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(248); expr();
			setState(254);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MULTIPLY) | (1L << DIVIDE) | (1L << MOD))) != 0)) {
				{
				{
				setState(249); multiOperator();
				setState(250); expr();
				}
				}
				setState(256);
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
		public TerminalNode LPAREN() { return getToken(ScrapeParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(ScrapeParser.RPAREN, 0); }
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public Add_expressionContext add_expression() {
			return getRuleContext(Add_expressionContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_expr);
		try {
			setState(262);
			switch (_input.LA(1)) {
			case CharacterLiteral:
			case INT:
			case FLOAT:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(257); atom();
				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 2);
				{
				setState(258); match(LPAREN);
				setState(259); add_expression();
				setState(260); match(RPAREN);
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
		public TerminalNode ADDCTIVE() { return getToken(ScrapeParser.ADDCTIVE, 0); }
		public TerminalNode DEDUCTIVE() { return getToken(ScrapeParser.DEDUCTIVE, 0); }
		public AddOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addOperator; }
	}

	public final AddOperatorContext addOperator() throws RecognitionException {
		AddOperatorContext _localctx = new AddOperatorContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_addOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(264);
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
		public TerminalNode DIVIDE() { return getToken(ScrapeParser.DIVIDE, 0); }
		public TerminalNode MULTIPLY() { return getToken(ScrapeParser.MULTIPLY, 0); }
		public TerminalNode MOD() { return getToken(ScrapeParser.MOD, 0); }
		public MultiOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiOperator; }
	}

	public final MultiOperatorContext multiOperator() throws RecognitionException {
		MultiOperatorContext _localctx = new MultiOperatorContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_multiOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(266);
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
		public TerminalNode ID() { return getToken(ScrapeParser.ID, 0); }
		public CallExprContext callExpr() {
			return getRuleContext(CallExprContext.class,0);
		}
		public TerminalNode INT() { return getToken(ScrapeParser.INT, 0); }
		public TerminalNode CharacterLiteral() { return getToken(ScrapeParser.CharacterLiteral, 0); }
		public TerminalNode FLOAT() { return getToken(ScrapeParser.FLOAT, 0); }
		public AtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atom; }
	}

	public final AtomContext atom() throws RecognitionException {
		AtomContext _localctx = new AtomContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_atom);
		try {
			setState(273);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(268); match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(269); match(INT);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(270); match(FLOAT);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(271); match(CharacterLiteral);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(272); callExpr();
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
		public TerminalNode NEQ() { return getToken(ScrapeParser.NEQ, 0); }
		public TerminalNode GE() { return getToken(ScrapeParser.GE, 0); }
		public TerminalNode LT() { return getToken(ScrapeParser.LT, 0); }
		public TerminalNode GT() { return getToken(ScrapeParser.GT, 0); }
		public TerminalNode LE() { return getToken(ScrapeParser.LE, 0); }
		public TerminalNode EQ() { return getToken(ScrapeParser.EQ, 0); }
		public OperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operator; }
	}

	public final OperatorContext operator() throws RecognitionException {
		OperatorContext _localctx = new OperatorContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(275);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\63\u0118\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\3\2\7\2F\n\2\f\2\16\2I\13\2\3\3\3\3\3\4\3\4\7\4O\n\4\f\4\16"+
		"\4R\13\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\5\5g\n\5\3\6\3\6\5\6k\n\6\3\6\5\6n\n\6\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\6\t\177\n\t\r\t\16\t\u0080"+
		"\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\5\f\u008d\n\f\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\5\r\u0097\n\r\3\r\3\r\5\r\u009b\n\r\3\16\3\16\3"+
		"\16\3\17\3\17\3\20\5\20\u00a3\n\20\3\20\3\20\3\20\3\20\3\20\5\20\u00aa"+
		"\n\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u00b4\n\20\3\21\3\21"+
		"\3\21\3\22\3\22\3\22\3\23\3\23\3\24\3\24\3\24\3\24\7\24\u00c2\n\24\f\24"+
		"\16\24\u00c5\13\24\5\24\u00c7\n\24\3\24\3\24\3\25\3\25\3\25\5\25\u00ce"+
		"\n\25\3\26\3\26\3\27\3\27\3\30\3\30\3\30\7\30\u00d7\n\30\f\30\16\30\u00da"+
		"\13\30\3\31\3\31\3\31\7\31\u00df\n\31\f\31\16\31\u00e2\13\31\3\32\3\32"+
		"\3\32\3\32\5\32\u00e8\n\32\3\32\3\32\3\32\3\32\5\32\u00ee\n\32\3\33\3"+
		"\33\3\34\3\34\3\34\3\34\7\34\u00f6\n\34\f\34\16\34\u00f9\13\34\3\35\3"+
		"\35\3\35\3\35\7\35\u00ff\n\35\f\35\16\35\u0102\13\35\3\36\3\36\3\36\3"+
		"\36\3\36\5\36\u0109\n\36\3\37\3\37\3 \3 \3!\3!\3!\3!\3!\5!\u0114\n!\3"+
		"\"\3\"\3\"\2\2#\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62"+
		"\64\668:<>@B\2\b\3\2\21\26\3\2%&\3\2\'+\3\2\37 \3\2!#\3\2,\61\u0117\2"+
		"G\3\2\2\2\4J\3\2\2\2\6L\3\2\2\2\bf\3\2\2\2\nh\3\2\2\2\fo\3\2\2\2\16y\3"+
		"\2\2\2\20~\3\2\2\2\22\u0082\3\2\2\2\24\u0085\3\2\2\2\26\u008c\3\2\2\2"+
		"\30\u009a\3\2\2\2\32\u009c\3\2\2\2\34\u009f\3\2\2\2\36\u00b3\3\2\2\2 "+
		"\u00b5\3\2\2\2\"\u00b8\3\2\2\2$\u00bb\3\2\2\2&\u00bd\3\2\2\2(\u00cd\3"+
		"\2\2\2*\u00cf\3\2\2\2,\u00d1\3\2\2\2.\u00d3\3\2\2\2\60\u00db\3\2\2\2\62"+
		"\u00ed\3\2\2\2\64\u00ef\3\2\2\2\66\u00f1\3\2\2\28\u00fa\3\2\2\2:\u0108"+
		"\3\2\2\2<\u010a\3\2\2\2>\u010c\3\2\2\2@\u0113\3\2\2\2B\u0115\3\2\2\2D"+
		"F\5\b\5\2ED\3\2\2\2FI\3\2\2\2GE\3\2\2\2GH\3\2\2\2H\3\3\2\2\2IG\3\2\2\2"+
		"JK\t\2\2\2K\5\3\2\2\2LP\7\7\2\2MO\5\b\5\2NM\3\2\2\2OR\3\2\2\2PN\3\2\2"+
		"\2PQ\3\2\2\2QS\3\2\2\2RP\3\2\2\2ST\7\n\2\2T\7\3\2\2\2UV\5\30\r\2VW\7\6"+
		"\2\2Wg\3\2\2\2Xg\5\n\6\2YZ\5\32\16\2Z[\7\6\2\2[g\3\2\2\2\\]\5\34\17\2"+
		"]^\7\6\2\2^g\3\2\2\2_`\5\36\20\2`a\7\6\2\2ag\3\2\2\2bc\5\"\22\2cd\7\6"+
		"\2\2dg\3\2\2\2eg\5\f\7\2fU\3\2\2\2fX\3\2\2\2fY\3\2\2\2f\\\3\2\2\2f_\3"+
		"\2\2\2fb\3\2\2\2fe\3\2\2\2g\t\3\2\2\2hj\5\16\b\2ik\5\20\t\2ji\3\2\2\2"+
		"jk\3\2\2\2km\3\2\2\2ln\5\22\n\2ml\3\2\2\2mn\3\2\2\2n\13\3\2\2\2op\7\f"+
		"\2\2pq\7\35\2\2qr\5\36\20\2rs\7\6\2\2st\5,\27\2tu\7\6\2\2uv\5\b\5\2vw"+
		"\7\36\2\2wx\5\6\4\2x\r\3\2\2\2yz\7\13\2\2z{\5,\27\2{|\5\26\f\2|\17\3\2"+
		"\2\2}\177\5\24\13\2~}\3\2\2\2\177\u0080\3\2\2\2\u0080~\3\2\2\2\u0080\u0081"+
		"\3\2\2\2\u0081\21\3\2\2\2\u0082\u0083\7\3\2\2\u0083\u0084\5\26\f\2\u0084"+
		"\23\3\2\2\2\u0085\u0086\7\3\2\2\u0086\u0087\7\13\2\2\u0087\u0088\5,\27"+
		"\2\u0088\u0089\5\26\f\2\u0089\25\3\2\2\2\u008a\u008d\5\b\5\2\u008b\u008d"+
		"\5\6\4\2\u008c\u008a\3\2\2\2\u008c\u008b\3\2\2\2\u008d\27\3\2\2\2\u008e"+
		"\u008f\5\4\3\2\u008f\u0090\7\32\2\2\u0090\u0091\7\5\2\2\u0091\u0092\7"+
		"\27\2\2\u0092\u0093\7\t\2\2\u0093\u009b\3\2\2\2\u0094\u0096\5\4\3\2\u0095"+
		"\u0097\7\62\2\2\u0096\u0095\3\2\2\2\u0096\u0097\3\2\2\2\u0097\u0098\3"+
		"\2\2\2\u0098\u0099\7\32\2\2\u0099\u009b\3\2\2\2\u009a\u008e\3\2\2\2\u009a"+
		"\u0094\3\2\2\2\u009b\31\3\2\2\2\u009c\u009d\7\4\2\2\u009d\u009e\5\64\33"+
		"\2\u009e\33\3\2\2\2\u009f\u00a0\5 \21\2\u00a0\35\3\2\2\2\u00a1\u00a3\7"+
		"\62\2\2\u00a2\u00a1\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4"+
		"\u00a5\7\32\2\2\u00a5\u00a6\7$\2\2\u00a6\u00b4\5(\25\2\u00a7\u00a9\5\4"+
		"\3\2\u00a8\u00aa\7\62\2\2\u00a9\u00a8\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa"+
		"\u00ab\3\2\2\2\u00ab\u00ac\7\32\2\2\u00ac\u00ad\7$\2\2\u00ad\u00ae\5("+
		"\25\2\u00ae\u00b4\3\2\2\2\u00af\u00b0\7\32\2\2\u00b0\u00b1\5*\26\2\u00b1"+
		"\u00b2\5(\25\2\u00b2\u00b4\3\2\2\2\u00b3\u00a2\3\2\2\2\u00b3\u00a7\3\2"+
		"\2\2\u00b3\u00af\3\2\2\2\u00b4\37\3\2\2\2\u00b5\u00b6\7\32\2\2\u00b6\u00b7"+
		"\5&\24\2\u00b7!\3\2\2\2\u00b8\u00b9\7\32\2\2\u00b9\u00ba\5$\23\2\u00ba"+
		"#\3\2\2\2\u00bb\u00bc\t\3\2\2\u00bc%\3\2\2\2\u00bd\u00c6\7\35\2\2\u00be"+
		"\u00c3\5(\25\2\u00bf\u00c0\7\b\2\2\u00c0\u00c2\5(\25\2\u00c1\u00bf\3\2"+
		"\2\2\u00c2\u00c5\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4"+
		"\u00c7\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c6\u00be\3\2\2\2\u00c6\u00c7\3\2"+
		"\2\2\u00c7\u00c8\3\2\2\2\u00c8\u00c9\7\36\2\2\u00c9\'\3\2\2\2\u00ca\u00ce"+
		"\5\64\33\2\u00cb\u00ce\7\20\2\2\u00cc\u00ce\7\17\2\2\u00cd\u00ca\3\2\2"+
		"\2\u00cd\u00cb\3\2\2\2\u00cd\u00cc\3\2\2\2\u00ce)\3\2\2\2\u00cf\u00d0"+
		"\t\4\2\2\u00d0+\3\2\2\2\u00d1\u00d2\5.\30\2\u00d2-\3\2\2\2\u00d3\u00d8"+
		"\5\60\31\2\u00d4\u00d5\7\33\2\2\u00d5\u00d7\5.\30\2\u00d6\u00d4\3\2\2"+
		"\2\u00d7\u00da\3\2\2\2\u00d8\u00d6\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9/"+
		"\3\2\2\2\u00da\u00d8\3\2\2\2\u00db\u00e0\5\62\32\2\u00dc\u00dd\7\34\2"+
		"\2\u00dd\u00df\5\62\32\2\u00de\u00dc\3\2\2\2\u00df\u00e2\3\2\2\2\u00e0"+
		"\u00de\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1\61\3\2\2\2\u00e2\u00e0\3\2\2"+
		"\2\u00e3\u00e7\5@!\2\u00e4\u00e5\5B\"\2\u00e5\u00e6\5@!\2\u00e6\u00e8"+
		"\3\2\2\2\u00e7\u00e4\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8\u00ee\3\2\2\2\u00e9"+
		"\u00ea\7\35\2\2\u00ea\u00eb\5.\30\2\u00eb\u00ec\7\36\2\2\u00ec\u00ee\3"+
		"\2\2\2\u00ed\u00e3\3\2\2\2\u00ed\u00e9\3\2\2\2\u00ee\63\3\2\2\2\u00ef"+
		"\u00f0\5\66\34\2\u00f0\65\3\2\2\2\u00f1\u00f7\58\35\2\u00f2\u00f3\5<\37"+
		"\2\u00f3\u00f4\5\66\34\2\u00f4\u00f6\3\2\2\2\u00f5\u00f2\3\2\2\2\u00f6"+
		"\u00f9\3\2\2\2\u00f7\u00f5\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f8\67\3\2\2"+
		"\2\u00f9\u00f7\3\2\2\2\u00fa\u0100\5:\36\2\u00fb\u00fc\5> \2\u00fc\u00fd"+
		"\5:\36\2\u00fd\u00ff\3\2\2\2\u00fe\u00fb\3\2\2\2\u00ff\u0102\3\2\2\2\u0100"+
		"\u00fe\3\2\2\2\u0100\u0101\3\2\2\2\u01019\3\2\2\2\u0102\u0100\3\2\2\2"+
		"\u0103\u0109\5@!\2\u0104\u0105\7\35\2\2\u0105\u0106\5\66\34\2\u0106\u0107"+
		"\7\36\2\2\u0107\u0109\3\2\2\2\u0108\u0103\3\2\2\2\u0108\u0104\3\2\2\2"+
		"\u0109;\3\2\2\2\u010a\u010b\t\5\2\2\u010b=\3\2\2\2\u010c\u010d\t\6\2\2"+
		"\u010d?\3\2\2\2\u010e\u0114\7\32\2\2\u010f\u0114\7\27\2\2\u0110\u0114"+
		"\7\30\2\2\u0111\u0114\7\17\2\2\u0112\u0114\5 \21\2\u0113\u010e\3\2\2\2"+
		"\u0113\u010f\3\2\2\2\u0113\u0110\3\2\2\2\u0113\u0111\3\2\2\2\u0113\u0112"+
		"\3\2\2\2\u0114A\3\2\2\2\u0115\u0116\t\7\2\2\u0116C\3\2\2\2\31GPfjm\u0080"+
		"\u008c\u0096\u009a\u00a2\u00a9\u00b3\u00c3\u00c6\u00cd\u00d8\u00e0\u00e7"+
		"\u00ed\u00f7\u0100\u0108\u0113";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}