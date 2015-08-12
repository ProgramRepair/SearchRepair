// Generated from Path.g4 by ANTLR 4.4
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
public class PathParser extends Parser {
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
	public static final String[] tokenNames = {
		"<INVALID>", "'!'", "'&'", "'return'", "';'", "','", "'int'", "'char'", 
		"'float'", "'double'", "'='", "INT", "FLOAT", "ID", "'||'", "'&&'", "'('", 
		"')'", "'+'", "'-'", "'*'", "'/'", "'%'", "'++'", "'--'", "'+='", "'-='", 
		"'%='", "'*='", "'/='", "'<'", "'<='", "'>'", "'>='", "'=='", "'!='", 
		"WS", "CharacterLiteral", "StringLiteral"
	};
	public static final int
		RULE_prog = 0, RULE_statement = 1, RULE_selfIncreStat = 2, RULE_selfOperator = 3, 
		RULE_callStat = 4, RULE_assumeStat = 5, RULE_notExpr = 6, RULE_condExpr = 7, 
		RULE_declarationStat = 8, RULE_assignStat = 9, RULE_returnStat = 10, RULE_expr = 11, 
		RULE_convertExpr = 12, RULE_addressExpr = 13, RULE_defExpr = 14, RULE_callExpr = 15, 
		RULE_arguments = 16, RULE_formalArgument = 17, RULE_type = 18, RULE_arithOperator = 19, 
		RULE_assiginOperator = 20, RULE_booleanOperator = 21, RULE_comparator = 22;
	public static final String[] ruleNames = {
		"prog", "statement", "selfIncreStat", "selfOperator", "callStat", "assumeStat", 
		"notExpr", "condExpr", "declarationStat", "assignStat", "returnStat", 
		"expr", "convertExpr", "addressExpr", "defExpr", "callExpr", "arguments", 
		"formalArgument", "type", "arithOperator", "assiginOperator", "booleanOperator", 
		"comparator"
	};

	@Override
	public String getGrammarFileName() { return "Path.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public PathParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgContext extends ParserRuleContext {
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
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
			setState(49);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__3) | (1L << T__2) | (1L << Int) | (1L << Char) | (1L << Float) | (1L << Double) | (1L << INT) | (1L << FLOAT) | (1L << ID) | (1L << LPAREN) | (1L << MULTIPLY) | (1L << CharacterLiteral))) != 0)) {
				{
				{
				setState(46); statement();
				}
				}
				setState(51);
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

	public static class StatementContext extends ParserRuleContext {
		public AssumeStatContext assumeStat() {
			return getRuleContext(AssumeStatContext.class,0);
		}
		public DeclarationStatContext declarationStat() {
			return getRuleContext(DeclarationStatContext.class,0);
		}
		public SelfIncreStatContext selfIncreStat() {
			return getRuleContext(SelfIncreStatContext.class,0);
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
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(58);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(52); declarationStat();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(53); assignStat();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(54); returnStat();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(55); assumeStat();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(56); callStat();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(57); selfIncreStat();
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

	public static class SelfIncreStatContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PathParser.ID, 0); }
		public SelfOperatorContext selfOperator() {
			return getRuleContext(SelfOperatorContext.class,0);
		}
		public SelfIncreStatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selfIncreStat; }
	}

	public final SelfIncreStatContext selfIncreStat() throws RecognitionException {
		SelfIncreStatContext _localctx = new SelfIncreStatContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_selfIncreStat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60); match(ID);
			setState(61); selfOperator();
			setState(62); match(T__1);
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

	public static class SelfOperatorContext extends ParserRuleContext {
		public SelfOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selfOperator; }
	}

	public final SelfOperatorContext selfOperator() throws RecognitionException {
		SelfOperatorContext _localctx = new SelfOperatorContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_selfOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
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
		enterRule(_localctx, 8, RULE_callStat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66); callExpr();
			setState(67); match(T__1);
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

	public static class AssumeStatContext extends ParserRuleContext {
		public CondExprContext condExpr() {
			return getRuleContext(CondExprContext.class,0);
		}
		public NotExprContext notExpr() {
			return getRuleContext(NotExprContext.class,0);
		}
		public AssumeStatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assumeStat; }
	}

	public final AssumeStatContext assumeStat() throws RecognitionException {
		AssumeStatContext _localctx = new AssumeStatContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_assumeStat);
		try {
			setState(75);
			switch (_input.LA(1)) {
			case T__4:
				enterOuterAlt(_localctx, 1);
				{
				setState(69); notExpr();
				setState(70); match(T__1);
				}
				break;
			case T__3:
			case INT:
			case FLOAT:
			case ID:
			case LPAREN:
			case MULTIPLY:
			case CharacterLiteral:
				enterOuterAlt(_localctx, 2);
				{
				setState(72); condExpr();
				setState(73); match(T__1);
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

	public static class NotExprContext extends ParserRuleContext {
		public CondExprContext condExpr() {
			return getRuleContext(CondExprContext.class,0);
		}
		public NotExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_notExpr; }
	}

	public final NotExprContext notExpr() throws RecognitionException {
		NotExprContext _localctx = new NotExprContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_notExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77); match(T__4);
			setState(78); match(LPAREN);
			setState(79); condExpr();
			setState(80); match(RPAREN);
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
		public ComparatorContext comparator() {
			return getRuleContext(ComparatorContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public BooleanOperatorContext booleanOperator() {
			return getRuleContext(BooleanOperatorContext.class,0);
		}
		public CondExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condExpr; }
	}

	public final CondExprContext condExpr() throws RecognitionException {
		CondExprContext _localctx = new CondExprContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_condExpr);
		try {
			setState(90);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(82); expr(0);
				setState(83); booleanOperator();
				setState(84); expr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(86); expr(0);
				setState(87); comparator();
				setState(88); expr(0);
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

	public static class DeclarationStatContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PathParser.ID, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public DeclarationStatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarationStat; }
	}

	public final DeclarationStatContext declarationStat() throws RecognitionException {
		DeclarationStatContext _localctx = new DeclarationStatContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_declarationStat);
		try {
			setState(101);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(92); type();
				setState(93); match(ID);
				setState(94); match(T__1);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(96); type();
				setState(97); match(MULTIPLY);
				setState(98); match(ID);
				setState(99); match(T__1);
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

	public static class AssignStatContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PathParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public CondExprContext condExpr() {
			return getRuleContext(CondExprContext.class,0);
		}
		public TerminalNode StringLiteral() { return getToken(PathParser.StringLiteral, 0); }
		public CallExprContext callExpr() {
			return getRuleContext(CallExprContext.class,0);
		}
		public AssiginOperatorContext assiginOperator() {
			return getRuleContext(AssiginOperatorContext.class,0);
		}
		public AssignStatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignStat; }
	}

	public final AssignStatContext assignStat() throws RecognitionException {
		AssignStatContext _localctx = new AssignStatContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_assignStat);
		try {
			setState(129);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(103); match(ID);
				setState(104); assiginOperator();
				setState(105); expr(0);
				setState(106); match(T__1);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(108); match(MULTIPLY);
				setState(109); match(ID);
				setState(110); assiginOperator();
				setState(111); expr(0);
				setState(112); match(T__1);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(114); match(ID);
				setState(115); assiginOperator();
				setState(116); callExpr();
				setState(117); match(T__1);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(119); match(ID);
				setState(120); assiginOperator();
				setState(121); match(StringLiteral);
				setState(122); match(T__1);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(124); match(ID);
				setState(125); assiginOperator();
				setState(126); condExpr();
				setState(127); match(T__1);
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
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ReturnStatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStat; }
	}

	public final ReturnStatContext returnStat() throws RecognitionException {
		ReturnStatContext _localctx = new ReturnStatContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_returnStat);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131); match(T__2);
			setState(136);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(132); match(LPAREN);
				setState(133); expr(0);
				setState(134); match(RPAREN);
				}
			}

			setState(138); match(T__1);
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
		public TerminalNode ID() { return getToken(PathParser.ID, 0); }
		public ConvertExprContext convertExpr() {
			return getRuleContext(ConvertExprContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public DefExprContext defExpr() {
			return getRuleContext(DefExprContext.class,0);
		}
		public ArithOperatorContext arithOperator() {
			return getRuleContext(ArithOperatorContext.class,0);
		}
		public TerminalNode INT() { return getToken(PathParser.INT, 0); }
		public TerminalNode CharacterLiteral() { return getToken(PathParser.CharacterLiteral, 0); }
		public AddressExprContext addressExpr() {
			return getRuleContext(AddressExprContext.class,0);
		}
		public TerminalNode FLOAT() { return getToken(PathParser.FLOAT, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 22;
		enterRecursionRule(_localctx, 22, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			switch (_input.LA(1)) {
			case ID:
				{
				setState(141); match(ID);
				}
				break;
			case INT:
				{
				setState(142); match(INT);
				}
				break;
			case FLOAT:
				{
				setState(143); match(FLOAT);
				}
				break;
			case CharacterLiteral:
				{
				setState(144); match(CharacterLiteral);
				}
				break;
			case T__3:
				{
				setState(145); addressExpr();
				}
				break;
			case MULTIPLY:
				{
				setState(146); defExpr();
				}
				break;
			case LPAREN:
				{
				setState(147); convertExpr();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(156);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expr);
					setState(150);
					if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
					setState(151); arithOperator();
					setState(152); expr(7);
					}
					} 
				}
				setState(158);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ConvertExprContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PathParser.ID, 0); }
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
		enterRule(_localctx, 24, RULE_convertExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159); match(LPAREN);
			setState(160); type();
			setState(161); match(RPAREN);
			setState(162); match(ID);
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

	public static class AddressExprContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PathParser.ID, 0); }
		public AddressExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addressExpr; }
	}

	public final AddressExprContext addressExpr() throws RecognitionException {
		AddressExprContext _localctx = new AddressExprContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_addressExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164); match(T__3);
			setState(165); match(ID);
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

	public static class DefExprContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PathParser.ID, 0); }
		public DefExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defExpr; }
	}

	public final DefExprContext defExpr() throws RecognitionException {
		DefExprContext _localctx = new DefExprContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_defExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167); match(MULTIPLY);
			setState(168); match(ID);
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
		public TerminalNode ID() { return getToken(PathParser.ID, 0); }
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
			setState(170); match(ID);
			setState(171); arguments();
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
		public List<FormalArgumentContext> formalArgument() {
			return getRuleContexts(FormalArgumentContext.class);
		}
		public FormalArgumentContext formalArgument(int i) {
			return getRuleContext(FormalArgumentContext.class,i);
		}
		public ArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arguments; }
	}

	public final ArgumentsContext arguments() throws RecognitionException {
		ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173); match(LPAREN);
			setState(182);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << FLOAT) | (1L << ID))) != 0)) {
				{
				setState(174); formalArgument();
				setState(179);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(175); match(T__0);
					setState(176); formalArgument();
					}
					}
					setState(181);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(184); match(RPAREN);
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

	public static class FormalArgumentContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PathParser.ID, 0); }
		public TerminalNode INT() { return getToken(PathParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(PathParser.FLOAT, 0); }
		public FormalArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalArgument; }
	}

	public final FormalArgumentContext formalArgument() throws RecognitionException {
		FormalArgumentContext _localctx = new FormalArgumentContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_formalArgument);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << FLOAT) | (1L << ID))) != 0)) ) {
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

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode Char() { return getToken(PathParser.Char, 0); }
		public TerminalNode Float() { return getToken(PathParser.Float, 0); }
		public TerminalNode Int() { return getToken(PathParser.Int, 0); }
		public TerminalNode Double() { return getToken(PathParser.Double, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Int) | (1L << Char) | (1L << Float) | (1L << Double))) != 0)) ) {
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

	public static class ArithOperatorContext extends ParserRuleContext {
		public TerminalNode ADDCTIVE() { return getToken(PathParser.ADDCTIVE, 0); }
		public TerminalNode DIVIDE() { return getToken(PathParser.DIVIDE, 0); }
		public TerminalNode MULTIPLY() { return getToken(PathParser.MULTIPLY, 0); }
		public TerminalNode MOD() { return getToken(PathParser.MOD, 0); }
		public TerminalNode DEDUCTIVE() { return getToken(PathParser.DEDUCTIVE, 0); }
		public ArithOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithOperator; }
	}

	public final ArithOperatorContext arithOperator() throws RecognitionException {
		ArithOperatorContext _localctx = new ArithOperatorContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_arithOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(190);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADDCTIVE) | (1L << DEDUCTIVE) | (1L << MULTIPLY) | (1L << DIVIDE) | (1L << MOD))) != 0)) ) {
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

	public static class AssiginOperatorContext extends ParserRuleContext {
		public TerminalNode MULTISELF() { return getToken(PathParser.MULTISELF, 0); }
		public TerminalNode ASSIGN() { return getToken(PathParser.ASSIGN, 0); }
		public TerminalNode MODSELF() { return getToken(PathParser.MODSELF, 0); }
		public TerminalNode DEDUCTSELF() { return getToken(PathParser.DEDUCTSELF, 0); }
		public TerminalNode ADDSELF() { return getToken(PathParser.ADDSELF, 0); }
		public TerminalNode DIVIDESELF() { return getToken(PathParser.DIVIDESELF, 0); }
		public AssiginOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assiginOperator; }
	}

	public final AssiginOperatorContext assiginOperator() throws RecognitionException {
		AssiginOperatorContext _localctx = new AssiginOperatorContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_assiginOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ASSIGN) | (1L << ADDSELF) | (1L << DEDUCTSELF) | (1L << MODSELF) | (1L << MULTISELF) | (1L << DIVIDESELF))) != 0)) ) {
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

	public static class BooleanOperatorContext extends ParserRuleContext {
		public TerminalNode AND() { return getToken(PathParser.AND, 0); }
		public TerminalNode OR() { return getToken(PathParser.OR, 0); }
		public BooleanOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanOperator; }
	}

	public final BooleanOperatorContext booleanOperator() throws RecognitionException {
		BooleanOperatorContext _localctx = new BooleanOperatorContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_booleanOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
			_la = _input.LA(1);
			if ( !(_la==OR || _la==AND) ) {
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

	public static class ComparatorContext extends ParserRuleContext {
		public TerminalNode NEQ() { return getToken(PathParser.NEQ, 0); }
		public TerminalNode GE() { return getToken(PathParser.GE, 0); }
		public TerminalNode LT() { return getToken(PathParser.LT, 0); }
		public TerminalNode GT() { return getToken(PathParser.GT, 0); }
		public TerminalNode LE() { return getToken(PathParser.LE, 0); }
		public TerminalNode EQ() { return getToken(PathParser.EQ, 0); }
		public ComparatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparator; }
	}

	public final ComparatorContext comparator() throws RecognitionException {
		ComparatorContext _localctx = new ComparatorContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_comparator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(196);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 11: return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return precpred(_ctx, 6);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3(\u00c9\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\3\2\7\2\62"+
		"\n\2\f\2\16\2\65\13\2\3\3\3\3\3\3\3\3\3\3\3\3\5\3=\n\3\3\4\3\4\3\4\3\4"+
		"\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\5\7N\n\7\3\b\3\b\3\b\3\b"+
		"\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t]\n\t\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\5\nh\n\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\5\13\u0084\n\13\3\f\3\f\3\f\3\f\3\f\5\f\u008b\n\f\3\f\3\f\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u0097\n\r\3\r\3\r\3\r\3\r\7\r\u009d"+
		"\n\r\f\r\16\r\u00a0\13\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\20"+
		"\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\22\3\22\7\22\u00b4\n\22\f\22\16"+
		"\22\u00b7\13\22\5\22\u00b9\n\22\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25"+
		"\3\26\3\26\3\27\3\27\3\30\3\30\3\30\2\3\30\31\2\4\6\b\n\f\16\20\22\24"+
		"\26\30\32\34\36 \"$&(*,.\2\t\3\2\31\32\3\2\r\17\3\2\b\13\3\2\24\30\4\2"+
		"\f\f\33\37\3\2\20\21\3\2 %\u00c8\2\63\3\2\2\2\4<\3\2\2\2\6>\3\2\2\2\b"+
		"B\3\2\2\2\nD\3\2\2\2\fM\3\2\2\2\16O\3\2\2\2\20\\\3\2\2\2\22g\3\2\2\2\24"+
		"\u0083\3\2\2\2\26\u0085\3\2\2\2\30\u0096\3\2\2\2\32\u00a1\3\2\2\2\34\u00a6"+
		"\3\2\2\2\36\u00a9\3\2\2\2 \u00ac\3\2\2\2\"\u00af\3\2\2\2$\u00bc\3\2\2"+
		"\2&\u00be\3\2\2\2(\u00c0\3\2\2\2*\u00c2\3\2\2\2,\u00c4\3\2\2\2.\u00c6"+
		"\3\2\2\2\60\62\5\4\3\2\61\60\3\2\2\2\62\65\3\2\2\2\63\61\3\2\2\2\63\64"+
		"\3\2\2\2\64\3\3\2\2\2\65\63\3\2\2\2\66=\5\22\n\2\67=\5\24\13\28=\5\26"+
		"\f\29=\5\f\7\2:=\5\n\6\2;=\5\6\4\2<\66\3\2\2\2<\67\3\2\2\2<8\3\2\2\2<"+
		"9\3\2\2\2<:\3\2\2\2<;\3\2\2\2=\5\3\2\2\2>?\7\17\2\2?@\5\b\5\2@A\7\6\2"+
		"\2A\7\3\2\2\2BC\t\2\2\2C\t\3\2\2\2DE\5 \21\2EF\7\6\2\2F\13\3\2\2\2GH\5"+
		"\16\b\2HI\7\6\2\2IN\3\2\2\2JK\5\20\t\2KL\7\6\2\2LN\3\2\2\2MG\3\2\2\2M"+
		"J\3\2\2\2N\r\3\2\2\2OP\7\3\2\2PQ\7\22\2\2QR\5\20\t\2RS\7\23\2\2S\17\3"+
		"\2\2\2TU\5\30\r\2UV\5,\27\2VW\5\30\r\2W]\3\2\2\2XY\5\30\r\2YZ\5.\30\2"+
		"Z[\5\30\r\2[]\3\2\2\2\\T\3\2\2\2\\X\3\2\2\2]\21\3\2\2\2^_\5&\24\2_`\7"+
		"\17\2\2`a\7\6\2\2ah\3\2\2\2bc\5&\24\2cd\7\26\2\2de\7\17\2\2ef\7\6\2\2"+
		"fh\3\2\2\2g^\3\2\2\2gb\3\2\2\2h\23\3\2\2\2ij\7\17\2\2jk\5*\26\2kl\5\30"+
		"\r\2lm\7\6\2\2m\u0084\3\2\2\2no\7\26\2\2op\7\17\2\2pq\5*\26\2qr\5\30\r"+
		"\2rs\7\6\2\2s\u0084\3\2\2\2tu\7\17\2\2uv\5*\26\2vw\5 \21\2wx\7\6\2\2x"+
		"\u0084\3\2\2\2yz\7\17\2\2z{\5*\26\2{|\7(\2\2|}\7\6\2\2}\u0084\3\2\2\2"+
		"~\177\7\17\2\2\177\u0080\5*\26\2\u0080\u0081\5\20\t\2\u0081\u0082\7\6"+
		"\2\2\u0082\u0084\3\2\2\2\u0083i\3\2\2\2\u0083n\3\2\2\2\u0083t\3\2\2\2"+
		"\u0083y\3\2\2\2\u0083~\3\2\2\2\u0084\25\3\2\2\2\u0085\u008a\7\5\2\2\u0086"+
		"\u0087\7\22\2\2\u0087\u0088\5\30\r\2\u0088\u0089\7\23\2\2\u0089\u008b"+
		"\3\2\2\2\u008a\u0086\3\2\2\2\u008a\u008b\3\2\2\2\u008b\u008c\3\2\2\2\u008c"+
		"\u008d\7\6\2\2\u008d\27\3\2\2\2\u008e\u008f\b\r\1\2\u008f\u0097\7\17\2"+
		"\2\u0090\u0097\7\r\2\2\u0091\u0097\7\16\2\2\u0092\u0097\7\'\2\2\u0093"+
		"\u0097\5\34\17\2\u0094\u0097\5\36\20\2\u0095\u0097\5\32\16\2\u0096\u008e"+
		"\3\2\2\2\u0096\u0090\3\2\2\2\u0096\u0091\3\2\2\2\u0096\u0092\3\2\2\2\u0096"+
		"\u0093\3\2\2\2\u0096\u0094\3\2\2\2\u0096\u0095\3\2\2\2\u0097\u009e\3\2"+
		"\2\2\u0098\u0099\f\b\2\2\u0099\u009a\5(\25\2\u009a\u009b\5\30\r\t\u009b"+
		"\u009d\3\2\2\2\u009c\u0098\3\2\2\2\u009d\u00a0\3\2\2\2\u009e\u009c\3\2"+
		"\2\2\u009e\u009f\3\2\2\2\u009f\31\3\2\2\2\u00a0\u009e\3\2\2\2\u00a1\u00a2"+
		"\7\22\2\2\u00a2\u00a3\5&\24\2\u00a3\u00a4\7\23\2\2\u00a4\u00a5\7\17\2"+
		"\2\u00a5\33\3\2\2\2\u00a6\u00a7\7\4\2\2\u00a7\u00a8\7\17\2\2\u00a8\35"+
		"\3\2\2\2\u00a9\u00aa\7\26\2\2\u00aa\u00ab\7\17\2\2\u00ab\37\3\2\2\2\u00ac"+
		"\u00ad\7\17\2\2\u00ad\u00ae\5\"\22\2\u00ae!\3\2\2\2\u00af\u00b8\7\22\2"+
		"\2\u00b0\u00b5\5$\23\2\u00b1\u00b2\7\7\2\2\u00b2\u00b4\5$\23\2\u00b3\u00b1"+
		"\3\2\2\2\u00b4\u00b7\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6"+
		"\u00b9\3\2\2\2\u00b7\u00b5\3\2\2\2\u00b8\u00b0\3\2\2\2\u00b8\u00b9\3\2"+
		"\2\2\u00b9\u00ba\3\2\2\2\u00ba\u00bb\7\23\2\2\u00bb#\3\2\2\2\u00bc\u00bd"+
		"\t\3\2\2\u00bd%\3\2\2\2\u00be\u00bf\t\4\2\2\u00bf\'\3\2\2\2\u00c0\u00c1"+
		"\t\5\2\2\u00c1)\3\2\2\2\u00c2\u00c3\t\6\2\2\u00c3+\3\2\2\2\u00c4\u00c5"+
		"\t\7\2\2\u00c5-\3\2\2\2\u00c6\u00c7\t\b\2\2\u00c7/\3\2\2\2\r\63<M\\g\u0083"+
		"\u008a\u0096\u009e\u00b5\u00b8";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}