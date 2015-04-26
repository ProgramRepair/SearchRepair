// Generated from Snippet.g4 by ANTLR 4.2.2
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
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__8=1, T__7=2, T__6=3, T__5=4, T__4=5, T__3=6, T__2=7, T__1=8, T__0=9, 
		BlockComment=10, LineComment=11, CharacterLiteral=12, StringLiteral=13, 
		Int=14, Char=15, Float=16, String=17, UnSigned=18, Double=19, INT=20, 
		FLOAT=21, STRING=22, ID=23, OR=24, AND=25, LPAREN=26, RPAREN=27, ADDCTIVE=28, 
		DEDUCTIVE=29, MULTIPLY=30, DIVIDE=31, MOD=32, ASSIGN=33, INCRE=34, DECRE=35, 
		ADDSELF=36, DEDUCTSELF=37, MODSELF=38, MULTISELF=39, DIVIDESELF=40, LT=41, 
		LE=42, GT=43, GE=44, EQ=45, NEQ=46, POINTER=47, WS=48;
	public static final String[] tokenNames = {
		"<INVALID>", "'else'", "'return'", "'['", "';'", "'{'", "','", "']'", 
		"'}'", "'if'", "BlockComment", "LineComment", "CharacterLiteral", "StringLiteral", 
		"'int'", "'char'", "'float'", "'char*'", "'unsigned'", "'double'", "INT", 
		"FLOAT", "STRING", "ID", "'||'", "'&&'", "'('", "')'", "'+'", "'-'", "MULTIPLY", 
		"'/'", "'%'", "'='", "'++'", "'--'", "'+='", "'-='", "'%='", "'*='", "'/='", 
		"'<'", "'<='", "'>'", "'>='", "'=='", "'!='", "POINTER", "WS"
	};
	public static final int
		RULE_prog = 0, RULE_type = 1, RULE_block = 2, RULE_stat = 3, RULE_if_stat = 4, 
		RULE_ifpart = 5, RULE_elseifpart = 6, RULE_elsepart = 7, RULE_elseifblock = 8, 
		RULE_ifblock = 9, RULE_declarationStat = 10, RULE_returnStat = 11, RULE_callStat = 12, 
		RULE_assignStat = 13, RULE_callExpr = 14, RULE_selfIncreStat = 15, RULE_increOperator = 16, 
		RULE_arguments = 17, RULE_assign_expression = 18, RULE_convertExpr = 19, 
		RULE_arithmAssignOperator = 20, RULE_condExpr = 21, RULE_or_expression = 22, 
		RULE_and_expression = 23, RULE_term = 24, RULE_arith_expression = 25, 
		RULE_add_expression = 26, RULE_multi_expression = 27, RULE_expr = 28, 
		RULE_addOperator = 29, RULE_multiOperator = 30, RULE_atom = 31, RULE_operator = 32;
	public static final String[] ruleNames = {
		"prog", "type", "block", "stat", "if_stat", "ifpart", "elseifpart", "elsepart", 
		"elseifblock", "ifblock", "declarationStat", "returnStat", "callStat", 
		"assignStat", "callExpr", "selfIncreStat", "increOperator", "arguments", 
		"assign_expression", "convertExpr", "arithmAssignOperator", "condExpr", 
		"or_expression", "and_expression", "term", "arith_expression", "add_expression", 
		"multi_expression", "expr", "addOperator", "multiOperator", "atom", "operator"
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
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 2) | (1L << 9) | (1L << Int) | (1L << Char) | (1L << Float) | (1L << String) | (1L << UnSigned) | (1L << Double) | (1L << ID) | (1L << POINTER))) != 0)) {
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
		public TerminalNode Char() { return getToken(SnippetParser.Char, 0); }
		public TerminalNode String() { return getToken(SnippetParser.String, 0); }
		public TerminalNode Float() { return getToken(SnippetParser.Float, 0); }
		public TerminalNode Int() { return getToken(SnippetParser.Int, 0); }
		public TerminalNode Double() { return getToken(SnippetParser.Double, 0); }
		public TerminalNode UnSigned() { return getToken(SnippetParser.UnSigned, 0); }
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
			setState(74); match(5);
			setState(78);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 2) | (1L << 9) | (1L << Int) | (1L << Char) | (1L << Float) | (1L << String) | (1L << UnSigned) | (1L << Double) | (1L << ID) | (1L << POINTER))) != 0)) {
				{
				{
				setState(75); stat();
				}
				}
				setState(80);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(81); match(8);
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
			setState(99);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(83); declarationStat();
				setState(84); match(4);
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
				setState(88); match(4);
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(90); callStat();
				setState(91); match(4);
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(93); assignStat();
				setState(94); match(4);
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(96); selfIncreStat();
				setState(97); match(4);
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
			setState(101); ifpart();
			setState(103);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(102); elseifpart();
				}
				break;
			}
			setState(106);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(105); elsepart();
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
		enterRule(_localctx, 10, RULE_ifpart);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108); match(9);
			setState(109); condExpr();
			setState(110); ifblock();
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
		enterRule(_localctx, 12, RULE_elseifpart);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(113); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(112); elseifblock();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(115); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			} while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER );
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
		enterRule(_localctx, 14, RULE_elsepart);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117); match(1);
			setState(118); ifblock();
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
		enterRule(_localctx, 16, RULE_elseifblock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120); match(1);
			setState(121); match(9);
			setState(122); condExpr();
			setState(123); ifblock();
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
		enterRule(_localctx, 18, RULE_ifblock);
		try {
			setState(127);
			switch (_input.LA(1)) {
			case 2:
			case 9:
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
				setState(125); stat();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 2);
				{
				setState(126); block();
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
		public TerminalNode POINTER() { return getToken(SnippetParser.POINTER, 0); }
		public TerminalNode ID() { return getToken(SnippetParser.ID, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode INT() { return getToken(SnippetParser.INT, 0); }
		public DeclarationStatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarationStat; }
	}

	public final DeclarationStatContext declarationStat() throws RecognitionException {
		DeclarationStatContext _localctx = new DeclarationStatContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_declarationStat);
		int _la;
		try {
			setState(141);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(129); type();
				setState(130); match(ID);
				{
				setState(131); match(3);
				setState(132); match(INT);
				setState(133); match(7);
				}
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(135); type();
				setState(137);
				_la = _input.LA(1);
				if (_la==POINTER) {
					{
					setState(136); match(POINTER);
					}
				}

				setState(139); match(ID);
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
		enterRule(_localctx, 22, RULE_returnStat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143); match(2);
			{
			setState(144); arith_expression();
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
		enterRule(_localctx, 24, RULE_callStat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146); callExpr();
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
		public TerminalNode ID() { return getToken(SnippetParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(SnippetParser.ASSIGN, 0); }
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
		enterRule(_localctx, 26, RULE_assignStat);
		int _la;
		try {
			setState(166);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(149);
				_la = _input.LA(1);
				if (_la==POINTER) {
					{
					setState(148); match(POINTER);
					}
				}

				setState(151); match(ID);
				setState(152); match(ASSIGN);
				setState(153); assign_expression();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(154); type();
				setState(156);
				_la = _input.LA(1);
				if (_la==POINTER) {
					{
					setState(155); match(POINTER);
					}
				}

				setState(158); match(ID);
				setState(159); match(ASSIGN);
				setState(160); assign_expression();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(162); match(ID);
				setState(163); arithmAssignOperator();
				setState(164); assign_expression();
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
	}

	public final CallExprContext callExpr() throws RecognitionException {
		CallExprContext _localctx = new CallExprContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_callExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168); match(ID);
			setState(169); arguments();
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
	}

	public final SelfIncreStatContext selfIncreStat() throws RecognitionException {
		SelfIncreStatContext _localctx = new SelfIncreStatContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_selfIncreStat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171); match(ID);
			setState(172); increOperator();
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
		public TerminalNode INCRE() { return getToken(SnippetParser.INCRE, 0); }
		public TerminalNode DECRE() { return getToken(SnippetParser.DECRE, 0); }
		public IncreOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_increOperator; }
	}

	public final IncreOperatorContext increOperator() throws RecognitionException {
		IncreOperatorContext _localctx = new IncreOperatorContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_increOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
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
		public TerminalNode LPAREN() { return getToken(SnippetParser.LPAREN, 0); }
		public List<Assign_expressionContext> assign_expression() {
			return getRuleContexts(Assign_expressionContext.class);
		}
		public TerminalNode RPAREN() { return getToken(SnippetParser.RPAREN, 0); }
		public ArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arguments; }
	}

	public final ArgumentsContext arguments() throws RecognitionException {
		ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176); match(LPAREN);
			setState(185);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CharacterLiteral) | (1L << StringLiteral) | (1L << INT) | (1L << FLOAT) | (1L << ID) | (1L << LPAREN))) != 0)) {
				{
				setState(177); assign_expression();
				setState(182);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==6) {
					{
					{
					setState(178); match(6);
					setState(179); assign_expression();
					}
					}
					setState(184);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(187); match(RPAREN);
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
		public ConvertExprContext convertExpr() {
			return getRuleContext(ConvertExprContext.class,0);
		}
		public Arith_expressionContext arith_expression() {
			return getRuleContext(Arith_expressionContext.class,0);
		}
		public TerminalNode StringLiteral() { return getToken(SnippetParser.StringLiteral, 0); }
		public TerminalNode CharacterLiteral() { return getToken(SnippetParser.CharacterLiteral, 0); }
		public Assign_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign_expression; }
	}

	public final Assign_expressionContext assign_expression() throws RecognitionException {
		Assign_expressionContext _localctx = new Assign_expressionContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_assign_expression);
		try {
			setState(193);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(189); arith_expression();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(190); match(StringLiteral);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(191); match(CharacterLiteral);
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(192); convertExpr();
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

	public static class ConvertExprContext extends ParserRuleContext {
		public Assign_expressionContext assign_expression() {
			return getRuleContext(Assign_expressionContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ConvertExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_convertExpr; }
	}

	public final ConvertExprContext convertExpr() throws RecognitionException {
		ConvertExprContext _localctx = new ConvertExprContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_convertExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(195); match(LPAREN);
			setState(196); type();
			setState(197); match(RPAREN);
			setState(198); assign_expression();
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
		public TerminalNode MULTISELF() { return getToken(SnippetParser.MULTISELF, 0); }
		public TerminalNode MODSELF() { return getToken(SnippetParser.MODSELF, 0); }
		public TerminalNode DEDUCTSELF() { return getToken(SnippetParser.DEDUCTSELF, 0); }
		public TerminalNode ADDSELF() { return getToken(SnippetParser.ADDSELF, 0); }
		public TerminalNode DIVIDESELF() { return getToken(SnippetParser.DIVIDESELF, 0); }
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
			setState(200);
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
			setState(202); or_expression();
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
		public List<TerminalNode> OR() { return getTokens(SnippetParser.OR); }
		public TerminalNode OR(int i) {
			return getToken(SnippetParser.OR, i);
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
			setState(204); and_expression();
			setState(209);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(205); match(OR);
					setState(206); or_expression();
					}
					} 
				}
				setState(211);
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
			return getToken(SnippetParser.AND, i);
		}
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public List<TerminalNode> AND() { return getTokens(SnippetParser.AND); }
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
			setState(212); term();
			setState(217);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND) {
				{
				{
				setState(213); match(AND);
				setState(214); term();
				}
				}
				setState(219);
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
		public TerminalNode LPAREN() { return getToken(SnippetParser.LPAREN, 0); }
		public OperatorContext operator() {
			return getRuleContext(OperatorContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(SnippetParser.RPAREN, 0); }
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
			setState(230);
			switch (_input.LA(1)) {
			case CharacterLiteral:
			case INT:
			case FLOAT:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(220); atom();
				setState(224);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LT) | (1L << LE) | (1L << GT) | (1L << GE) | (1L << EQ) | (1L << NEQ))) != 0)) {
					{
					setState(221); operator();
					setState(222); atom();
					}
				}

				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 2);
				{
				setState(226); match(LPAREN);
				setState(227); or_expression();
				setState(228); match(RPAREN);
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
			setState(232); add_expression();
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
			setState(234); multi_expression();
			setState(240);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(235); addOperator();
					setState(236); add_expression();
					}
					} 
				}
				setState(242);
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
			setState(243); expr();
			setState(249);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MULTIPLY) | (1L << DIVIDE) | (1L << MOD))) != 0)) {
				{
				{
				setState(244); multiOperator();
				setState(245); expr();
				}
				}
				setState(251);
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
		public TerminalNode LPAREN() { return getToken(SnippetParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(SnippetParser.RPAREN, 0); }
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
			setState(257);
			switch (_input.LA(1)) {
			case CharacterLiteral:
			case INT:
			case FLOAT:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(252); atom();
				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 2);
				{
				setState(253); match(LPAREN);
				setState(254); add_expression();
				setState(255); match(RPAREN);
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
		public TerminalNode ADDCTIVE() { return getToken(SnippetParser.ADDCTIVE, 0); }
		public TerminalNode DEDUCTIVE() { return getToken(SnippetParser.DEDUCTIVE, 0); }
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
			setState(259);
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
		public TerminalNode DIVIDE() { return getToken(SnippetParser.DIVIDE, 0); }
		public TerminalNode MULTIPLY() { return getToken(SnippetParser.MULTIPLY, 0); }
		public TerminalNode MOD() { return getToken(SnippetParser.MOD, 0); }
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
			setState(261);
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
		public TerminalNode ID() { return getToken(SnippetParser.ID, 0); }
		public CallExprContext callExpr() {
			return getRuleContext(CallExprContext.class,0);
		}
		public TerminalNode INT() { return getToken(SnippetParser.INT, 0); }
		public TerminalNode CharacterLiteral() { return getToken(SnippetParser.CharacterLiteral, 0); }
		public TerminalNode FLOAT() { return getToken(SnippetParser.FLOAT, 0); }
		public AtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atom; }
	}

	public final AtomContext atom() throws RecognitionException {
		AtomContext _localctx = new AtomContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_atom);
		try {
			setState(268);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(263); match(ID);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(264); match(INT);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(265); match(FLOAT);
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(266); match(CharacterLiteral);
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(267); callExpr();
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
		public TerminalNode GE() { return getToken(SnippetParser.GE, 0); }
		public TerminalNode LT() { return getToken(SnippetParser.LT, 0); }
		public TerminalNode GT() { return getToken(SnippetParser.GT, 0); }
		public TerminalNode LE() { return getToken(SnippetParser.LE, 0); }
		public TerminalNode EQ() { return getToken(SnippetParser.EQ, 0); }
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
			setState(270);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\62\u0113\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\3\2\7\2F\n\2\f\2\16\2I\13\2\3\3\3\3\3\4\3\4\7\4O\n\4\f\4\16"+
		"\4R\13\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\5\5f\n\5\3\6\3\6\5\6j\n\6\3\6\5\6m\n\6\3\7\3\7\3\7\3\7\3\b"+
		"\6\bt\n\b\r\b\16\bu\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\5\13\u0082"+
		"\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u008c\n\f\3\f\3\f\5\f\u0090"+
		"\n\f\3\r\3\r\3\r\3\16\3\16\3\17\5\17\u0098\n\17\3\17\3\17\3\17\3\17\3"+
		"\17\5\17\u009f\n\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00a9"+
		"\n\17\3\20\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\23\3\23\3\23\3\23\7\23"+
		"\u00b7\n\23\f\23\16\23\u00ba\13\23\5\23\u00bc\n\23\3\23\3\23\3\24\3\24"+
		"\3\24\3\24\5\24\u00c4\n\24\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\27\3\27"+
		"\3\30\3\30\3\30\7\30\u00d2\n\30\f\30\16\30\u00d5\13\30\3\31\3\31\3\31"+
		"\7\31\u00da\n\31\f\31\16\31\u00dd\13\31\3\32\3\32\3\32\3\32\5\32\u00e3"+
		"\n\32\3\32\3\32\3\32\3\32\5\32\u00e9\n\32\3\33\3\33\3\34\3\34\3\34\3\34"+
		"\7\34\u00f1\n\34\f\34\16\34\u00f4\13\34\3\35\3\35\3\35\3\35\7\35\u00fa"+
		"\n\35\f\35\16\35\u00fd\13\35\3\36\3\36\3\36\3\36\3\36\5\36\u0104\n\36"+
		"\3\37\3\37\3 \3 \3!\3!\3!\3!\3!\5!\u010f\n!\3\"\3\"\3\"\2\2#\2\4\6\b\n"+
		"\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@B\2\b\3\2\20\25"+
		"\3\2$%\3\2&*\3\2\36\37\3\2 \"\3\2+\60\u0112\2G\3\2\2\2\4J\3\2\2\2\6L\3"+
		"\2\2\2\be\3\2\2\2\ng\3\2\2\2\fn\3\2\2\2\16s\3\2\2\2\20w\3\2\2\2\22z\3"+
		"\2\2\2\24\u0081\3\2\2\2\26\u008f\3\2\2\2\30\u0091\3\2\2\2\32\u0094\3\2"+
		"\2\2\34\u00a8\3\2\2\2\36\u00aa\3\2\2\2 \u00ad\3\2\2\2\"\u00b0\3\2\2\2"+
		"$\u00b2\3\2\2\2&\u00c3\3\2\2\2(\u00c5\3\2\2\2*\u00ca\3\2\2\2,\u00cc\3"+
		"\2\2\2.\u00ce\3\2\2\2\60\u00d6\3\2\2\2\62\u00e8\3\2\2\2\64\u00ea\3\2\2"+
		"\2\66\u00ec\3\2\2\28\u00f5\3\2\2\2:\u0103\3\2\2\2<\u0105\3\2\2\2>\u0107"+
		"\3\2\2\2@\u010e\3\2\2\2B\u0110\3\2\2\2DF\5\b\5\2ED\3\2\2\2FI\3\2\2\2G"+
		"E\3\2\2\2GH\3\2\2\2H\3\3\2\2\2IG\3\2\2\2JK\t\2\2\2K\5\3\2\2\2LP\7\7\2"+
		"\2MO\5\b\5\2NM\3\2\2\2OR\3\2\2\2PN\3\2\2\2PQ\3\2\2\2QS\3\2\2\2RP\3\2\2"+
		"\2ST\7\n\2\2T\7\3\2\2\2UV\5\26\f\2VW\7\6\2\2Wf\3\2\2\2Xf\5\n\6\2YZ\5\30"+
		"\r\2Z[\7\6\2\2[f\3\2\2\2\\]\5\32\16\2]^\7\6\2\2^f\3\2\2\2_`\5\34\17\2"+
		"`a\7\6\2\2af\3\2\2\2bc\5 \21\2cd\7\6\2\2df\3\2\2\2eU\3\2\2\2eX\3\2\2\2"+
		"eY\3\2\2\2e\\\3\2\2\2e_\3\2\2\2eb\3\2\2\2f\t\3\2\2\2gi\5\f\7\2hj\5\16"+
		"\b\2ih\3\2\2\2ij\3\2\2\2jl\3\2\2\2km\5\20\t\2lk\3\2\2\2lm\3\2\2\2m\13"+
		"\3\2\2\2no\7\13\2\2op\5,\27\2pq\5\24\13\2q\r\3\2\2\2rt\5\22\n\2sr\3\2"+
		"\2\2tu\3\2\2\2us\3\2\2\2uv\3\2\2\2v\17\3\2\2\2wx\7\3\2\2xy\5\24\13\2y"+
		"\21\3\2\2\2z{\7\3\2\2{|\7\13\2\2|}\5,\27\2}~\5\24\13\2~\23\3\2\2\2\177"+
		"\u0082\5\b\5\2\u0080\u0082\5\6\4\2\u0081\177\3\2\2\2\u0081\u0080\3\2\2"+
		"\2\u0082\25\3\2\2\2\u0083\u0084\5\4\3\2\u0084\u0085\7\31\2\2\u0085\u0086"+
		"\7\5\2\2\u0086\u0087\7\26\2\2\u0087\u0088\7\t\2\2\u0088\u0090\3\2\2\2"+
		"\u0089\u008b\5\4\3\2\u008a\u008c\7\61\2\2\u008b\u008a\3\2\2\2\u008b\u008c"+
		"\3\2\2\2\u008c\u008d\3\2\2\2\u008d\u008e\7\31\2\2\u008e\u0090\3\2\2\2"+
		"\u008f\u0083\3\2\2\2\u008f\u0089\3\2\2\2\u0090\27\3\2\2\2\u0091\u0092"+
		"\7\4\2\2\u0092\u0093\5\64\33\2\u0093\31\3\2\2\2\u0094\u0095\5\36\20\2"+
		"\u0095\33\3\2\2\2\u0096\u0098\7\61\2\2\u0097\u0096\3\2\2\2\u0097\u0098"+
		"\3\2\2\2\u0098\u0099\3\2\2\2\u0099\u009a\7\31\2\2\u009a\u009b\7#\2\2\u009b"+
		"\u00a9\5&\24\2\u009c\u009e\5\4\3\2\u009d\u009f\7\61\2\2\u009e\u009d\3"+
		"\2\2\2\u009e\u009f\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\u00a1\7\31\2\2\u00a1"+
		"\u00a2\7#\2\2\u00a2\u00a3\5&\24\2\u00a3\u00a9\3\2\2\2\u00a4\u00a5\7\31"+
		"\2\2\u00a5\u00a6\5*\26\2\u00a6\u00a7\5&\24\2\u00a7\u00a9\3\2\2\2\u00a8"+
		"\u0097\3\2\2\2\u00a8\u009c\3\2\2\2\u00a8\u00a4\3\2\2\2\u00a9\35\3\2\2"+
		"\2\u00aa\u00ab\7\31\2\2\u00ab\u00ac\5$\23\2\u00ac\37\3\2\2\2\u00ad\u00ae"+
		"\7\31\2\2\u00ae\u00af\5\"\22\2\u00af!\3\2\2\2\u00b0\u00b1\t\3\2\2\u00b1"+
		"#\3\2\2\2\u00b2\u00bb\7\34\2\2\u00b3\u00b8\5&\24\2\u00b4\u00b5\7\b\2\2"+
		"\u00b5\u00b7\5&\24\2\u00b6\u00b4\3\2\2\2\u00b7\u00ba\3\2\2\2\u00b8\u00b6"+
		"\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9\u00bc\3\2\2\2\u00ba\u00b8\3\2\2\2\u00bb"+
		"\u00b3\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\u00be\7\35"+
		"\2\2\u00be%\3\2\2\2\u00bf\u00c4\5\64\33\2\u00c0\u00c4\7\17\2\2\u00c1\u00c4"+
		"\7\16\2\2\u00c2\u00c4\5(\25\2\u00c3\u00bf\3\2\2\2\u00c3\u00c0\3\2\2\2"+
		"\u00c3\u00c1\3\2\2\2\u00c3\u00c2\3\2\2\2\u00c4\'\3\2\2\2\u00c5\u00c6\7"+
		"\34\2\2\u00c6\u00c7\5\4\3\2\u00c7\u00c8\7\35\2\2\u00c8\u00c9\5&\24\2\u00c9"+
		")\3\2\2\2\u00ca\u00cb\t\4\2\2\u00cb+\3\2\2\2\u00cc\u00cd\5.\30\2\u00cd"+
		"-\3\2\2\2\u00ce\u00d3\5\60\31\2\u00cf\u00d0\7\32\2\2\u00d0\u00d2\5.\30"+
		"\2\u00d1\u00cf\3\2\2\2\u00d2\u00d5\3\2\2\2\u00d3\u00d1\3\2\2\2\u00d3\u00d4"+
		"\3\2\2\2\u00d4/\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d6\u00db\5\62\32\2\u00d7"+
		"\u00d8\7\33\2\2\u00d8\u00da\5\62\32\2\u00d9\u00d7\3\2\2\2\u00da\u00dd"+
		"\3\2\2\2\u00db\u00d9\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc\61\3\2\2\2\u00dd"+
		"\u00db\3\2\2\2\u00de\u00e2\5@!\2\u00df\u00e0\5B\"\2\u00e0\u00e1\5@!\2"+
		"\u00e1\u00e3\3\2\2\2\u00e2\u00df\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3\u00e9"+
		"\3\2\2\2\u00e4\u00e5\7\34\2\2\u00e5\u00e6\5.\30\2\u00e6\u00e7\7\35\2\2"+
		"\u00e7\u00e9\3\2\2\2\u00e8\u00de\3\2\2\2\u00e8\u00e4\3\2\2\2\u00e9\63"+
		"\3\2\2\2\u00ea\u00eb\5\66\34\2\u00eb\65\3\2\2\2\u00ec\u00f2\58\35\2\u00ed"+
		"\u00ee\5<\37\2\u00ee\u00ef\5\66\34\2\u00ef\u00f1\3\2\2\2\u00f0\u00ed\3"+
		"\2\2\2\u00f1\u00f4\3\2\2\2\u00f2\u00f0\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3"+
		"\67\3\2\2\2\u00f4\u00f2\3\2\2\2\u00f5\u00fb\5:\36\2\u00f6\u00f7\5> \2"+
		"\u00f7\u00f8\5:\36\2\u00f8\u00fa\3\2\2\2\u00f9\u00f6\3\2\2\2\u00fa\u00fd"+
		"\3\2\2\2\u00fb\u00f9\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fc9\3\2\2\2\u00fd"+
		"\u00fb\3\2\2\2\u00fe\u0104\5@!\2\u00ff\u0100\7\34\2\2\u0100\u0101\5\66"+
		"\34\2\u0101\u0102\7\35\2\2\u0102\u0104\3\2\2\2\u0103\u00fe\3\2\2\2\u0103"+
		"\u00ff\3\2\2\2\u0104;\3\2\2\2\u0105\u0106\t\5\2\2\u0106=\3\2\2\2\u0107"+
		"\u0108\t\6\2\2\u0108?\3\2\2\2\u0109\u010f\7\31\2\2\u010a\u010f\7\26\2"+
		"\2\u010b\u010f\7\27\2\2\u010c\u010f\7\16\2\2\u010d\u010f\5\36\20\2\u010e"+
		"\u0109\3\2\2\2\u010e\u010a\3\2\2\2\u010e\u010b\3\2\2\2\u010e\u010c\3\2"+
		"\2\2\u010e\u010d\3\2\2\2\u010fA\3\2\2\2\u0110\u0111\t\7\2\2\u0111C\3\2"+
		"\2\2\31GPeilu\u0081\u008b\u008f\u0097\u009e\u00a8\u00b8\u00bb\u00c3\u00d3"+
		"\u00db\u00e2\u00e8\u00f2\u00fb\u0103\u010e";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}