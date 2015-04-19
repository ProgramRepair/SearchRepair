// Generated from Path.g4 by ANTLR 4.2.2
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
		RULE_prog = 0, RULE_statement = 1, RULE_callStat = 2, RULE_assumeStat = 3, 
		RULE_notExpr = 4, RULE_condExpr = 5, RULE_declarationStat = 6, RULE_assignStat = 7, 
		RULE_returnStat = 8, RULE_expr = 9, RULE_convertExpr = 10, RULE_addressExpr = 11, 
		RULE_defExpr = 12, RULE_callExpr = 13, RULE_arguments = 14, RULE_formalArgument = 15, 
		RULE_type = 16, RULE_arithOperator = 17, RULE_assiginOperator = 18, RULE_booleanOperator = 19, 
		RULE_comparator = 20;
	public static final String[] ruleNames = {
		"prog", "statement", "callStat", "assumeStat", "notExpr", "condExpr", 
		"declarationStat", "assignStat", "returnStat", "expr", "convertExpr", 
		"addressExpr", "defExpr", "callExpr", "arguments", "formalArgument", "type", 
		"arithOperator", "assiginOperator", "booleanOperator", "comparator"
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
			setState(45);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << 2) | (1L << 3) | (1L << Int) | (1L << Char) | (1L << Float) | (1L << Double) | (1L << INT) | (1L << FLOAT) | (1L << ID) | (1L << LPAREN) | (1L << MULTIPLY) | (1L << CharacterLiteral))) != 0)) {
				{
				{
				setState(42); statement();
				}
				}
				setState(47);
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
			setState(53);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(48); declarationStat();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(49); assignStat();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(50); returnStat();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(51); assumeStat();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(52); callStat();
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
		enterRule(_localctx, 4, RULE_callStat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55); callExpr();
			setState(56); match(4);
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
		enterRule(_localctx, 6, RULE_assumeStat);
		try {
			setState(64);
			switch (_input.LA(1)) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(58); notExpr();
				setState(59); match(4);
				}
				break;
			case 2:
			case INT:
			case FLOAT:
			case ID:
			case LPAREN:
			case MULTIPLY:
			case CharacterLiteral:
				enterOuterAlt(_localctx, 2);
				{
				setState(61); condExpr();
				setState(62); match(4);
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
		enterRule(_localctx, 8, RULE_notExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66); match(1);
			setState(67); match(LPAREN);
			setState(68); condExpr();
			setState(69); match(RPAREN);
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
		enterRule(_localctx, 10, RULE_condExpr);
		try {
			setState(79);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(71); expr(0);
				setState(72); booleanOperator();
				setState(73); expr(0);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(75); expr(0);
				setState(76); comparator();
				setState(77); expr(0);
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
		enterRule(_localctx, 12, RULE_declarationStat);
		try {
			setState(90);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(81); type();
				setState(82); match(ID);
				setState(83); match(4);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(85); type();
				setState(86); match(MULTIPLY);
				setState(87); match(ID);
				setState(88); match(4);
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
		enterRule(_localctx, 14, RULE_assignStat);
		try {
			setState(118);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(92); match(ID);
				setState(93); assiginOperator();
				setState(94); expr(0);
				setState(95); match(4);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(97); match(MULTIPLY);
				setState(98); match(ID);
				setState(99); assiginOperator();
				setState(100); expr(0);
				setState(101); match(4);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(103); match(ID);
				setState(104); assiginOperator();
				setState(105); callExpr();
				setState(106); match(4);
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(108); match(ID);
				setState(109); assiginOperator();
				setState(110); match(StringLiteral);
				setState(111); match(4);
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(113); match(ID);
				setState(114); assiginOperator();
				setState(115); condExpr();
				setState(116); match(4);
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
		enterRule(_localctx, 16, RULE_returnStat);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120); match(3);
			setState(125);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(121); match(LPAREN);
				setState(122); expr(0);
				setState(123); match(RPAREN);
				}
			}

			setState(127); match(4);
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
		int _startState = 18;
		enterRecursionRule(_localctx, 18, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			switch (_input.LA(1)) {
			case ID:
				{
				setState(130); match(ID);
				}
				break;
			case INT:
				{
				setState(131); match(INT);
				}
				break;
			case FLOAT:
				{
				setState(132); match(FLOAT);
				}
				break;
			case CharacterLiteral:
				{
				setState(133); match(CharacterLiteral);
				}
				break;
			case 2:
				{
				setState(134); addressExpr();
				}
				break;
			case MULTIPLY:
				{
				setState(135); defExpr();
				}
				break;
			case LPAREN:
				{
				setState(136); convertExpr();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(145);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expr);
					setState(139);
					if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
					setState(140); arithOperator();
					setState(141); expr(7);
					}
					} 
				}
				setState(147);
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
		enterRule(_localctx, 20, RULE_convertExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148); match(LPAREN);
			setState(149); type();
			setState(150); match(RPAREN);
			setState(151); match(ID);
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
		enterRule(_localctx, 22, RULE_addressExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153); match(2);
			setState(154); match(ID);
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
		enterRule(_localctx, 24, RULE_defExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156); match(MULTIPLY);
			setState(157); match(ID);
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
		enterRule(_localctx, 26, RULE_callExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159); match(ID);
			setState(160); arguments();
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
		enterRule(_localctx, 28, RULE_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162); match(LPAREN);
			setState(171);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << FLOAT) | (1L << ID))) != 0)) {
				{
				setState(163); formalArgument();
				setState(168);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==5) {
					{
					{
					setState(164); match(5);
					setState(165); formalArgument();
					}
					}
					setState(170);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(173); match(RPAREN);
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
		enterRule(_localctx, 30, RULE_formalArgument);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
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
		enterRule(_localctx, 32, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
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
		enterRule(_localctx, 34, RULE_arithOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
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
		enterRule(_localctx, 36, RULE_assiginOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
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
		enterRule(_localctx, 38, RULE_booleanOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
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
		enterRule(_localctx, 40, RULE_comparator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
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
		case 9: return expr_sempred((ExprContext)_localctx, predIndex);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3(\u00be\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\7\2.\n\2\f\2\16\2\61\13\2"+
		"\3\3\3\3\3\3\3\3\3\3\5\38\n\3\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\5\5"+
		"C\n\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7R\n\7\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b]\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\5\ty\n\t\3\n\3\n\3\n\3\n\3\n\5\n\u0080\n\n\3\n\3\n\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\5\13\u008c\n\13\3\13\3\13\3\13\3\13\7\13"+
		"\u0092\n\13\f\13\16\13\u0095\13\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\16"+
		"\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\20\3\20\7\20\u00a9\n\20\f\20\16"+
		"\20\u00ac\13\20\5\20\u00ae\n\20\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23"+
		"\3\24\3\24\3\25\3\25\3\26\3\26\3\26\2\3\24\27\2\4\6\b\n\f\16\20\22\24"+
		"\26\30\32\34\36 \"$&(*\2\b\3\2\r\17\3\2\b\13\3\2\24\30\4\2\f\f\33\37\3"+
		"\2\20\21\3\2 %\u00be\2/\3\2\2\2\4\67\3\2\2\2\69\3\2\2\2\bB\3\2\2\2\nD"+
		"\3\2\2\2\fQ\3\2\2\2\16\\\3\2\2\2\20x\3\2\2\2\22z\3\2\2\2\24\u008b\3\2"+
		"\2\2\26\u0096\3\2\2\2\30\u009b\3\2\2\2\32\u009e\3\2\2\2\34\u00a1\3\2\2"+
		"\2\36\u00a4\3\2\2\2 \u00b1\3\2\2\2\"\u00b3\3\2\2\2$\u00b5\3\2\2\2&\u00b7"+
		"\3\2\2\2(\u00b9\3\2\2\2*\u00bb\3\2\2\2,.\5\4\3\2-,\3\2\2\2.\61\3\2\2\2"+
		"/-\3\2\2\2/\60\3\2\2\2\60\3\3\2\2\2\61/\3\2\2\2\628\5\16\b\2\638\5\20"+
		"\t\2\648\5\22\n\2\658\5\b\5\2\668\5\6\4\2\67\62\3\2\2\2\67\63\3\2\2\2"+
		"\67\64\3\2\2\2\67\65\3\2\2\2\67\66\3\2\2\28\5\3\2\2\29:\5\34\17\2:;\7"+
		"\6\2\2;\7\3\2\2\2<=\5\n\6\2=>\7\6\2\2>C\3\2\2\2?@\5\f\7\2@A\7\6\2\2AC"+
		"\3\2\2\2B<\3\2\2\2B?\3\2\2\2C\t\3\2\2\2DE\7\3\2\2EF\7\22\2\2FG\5\f\7\2"+
		"GH\7\23\2\2H\13\3\2\2\2IJ\5\24\13\2JK\5(\25\2KL\5\24\13\2LR\3\2\2\2MN"+
		"\5\24\13\2NO\5*\26\2OP\5\24\13\2PR\3\2\2\2QI\3\2\2\2QM\3\2\2\2R\r\3\2"+
		"\2\2ST\5\"\22\2TU\7\17\2\2UV\7\6\2\2V]\3\2\2\2WX\5\"\22\2XY\7\26\2\2Y"+
		"Z\7\17\2\2Z[\7\6\2\2[]\3\2\2\2\\S\3\2\2\2\\W\3\2\2\2]\17\3\2\2\2^_\7\17"+
		"\2\2_`\5&\24\2`a\5\24\13\2ab\7\6\2\2by\3\2\2\2cd\7\26\2\2de\7\17\2\2e"+
		"f\5&\24\2fg\5\24\13\2gh\7\6\2\2hy\3\2\2\2ij\7\17\2\2jk\5&\24\2kl\5\34"+
		"\17\2lm\7\6\2\2my\3\2\2\2no\7\17\2\2op\5&\24\2pq\7(\2\2qr\7\6\2\2ry\3"+
		"\2\2\2st\7\17\2\2tu\5&\24\2uv\5\f\7\2vw\7\6\2\2wy\3\2\2\2x^\3\2\2\2xc"+
		"\3\2\2\2xi\3\2\2\2xn\3\2\2\2xs\3\2\2\2y\21\3\2\2\2z\177\7\5\2\2{|\7\22"+
		"\2\2|}\5\24\13\2}~\7\23\2\2~\u0080\3\2\2\2\177{\3\2\2\2\177\u0080\3\2"+
		"\2\2\u0080\u0081\3\2\2\2\u0081\u0082\7\6\2\2\u0082\23\3\2\2\2\u0083\u0084"+
		"\b\13\1\2\u0084\u008c\7\17\2\2\u0085\u008c\7\r\2\2\u0086\u008c\7\16\2"+
		"\2\u0087\u008c\7\'\2\2\u0088\u008c\5\30\r\2\u0089\u008c\5\32\16\2\u008a"+
		"\u008c\5\26\f\2\u008b\u0083\3\2\2\2\u008b\u0085\3\2\2\2\u008b\u0086\3"+
		"\2\2\2\u008b\u0087\3\2\2\2\u008b\u0088\3\2\2\2\u008b\u0089\3\2\2\2\u008b"+
		"\u008a\3\2\2\2\u008c\u0093\3\2\2\2\u008d\u008e\f\b\2\2\u008e\u008f\5$"+
		"\23\2\u008f\u0090\5\24\13\t\u0090\u0092\3\2\2\2\u0091\u008d\3\2\2\2\u0092"+
		"\u0095\3\2\2\2\u0093\u0091\3\2\2\2\u0093\u0094\3\2\2\2\u0094\25\3\2\2"+
		"\2\u0095\u0093\3\2\2\2\u0096\u0097\7\22\2\2\u0097\u0098\5\"\22\2\u0098"+
		"\u0099\7\23\2\2\u0099\u009a\7\17\2\2\u009a\27\3\2\2\2\u009b\u009c\7\4"+
		"\2\2\u009c\u009d\7\17\2\2\u009d\31\3\2\2\2\u009e\u009f\7\26\2\2\u009f"+
		"\u00a0\7\17\2\2\u00a0\33\3\2\2\2\u00a1\u00a2\7\17\2\2\u00a2\u00a3\5\36"+
		"\20\2\u00a3\35\3\2\2\2\u00a4\u00ad\7\22\2\2\u00a5\u00aa\5 \21\2\u00a6"+
		"\u00a7\7\7\2\2\u00a7\u00a9\5 \21\2\u00a8\u00a6\3\2\2\2\u00a9\u00ac\3\2"+
		"\2\2\u00aa\u00a8\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00ae\3\2\2\2\u00ac"+
		"\u00aa\3\2\2\2\u00ad\u00a5\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae\u00af\3\2"+
		"\2\2\u00af\u00b0\7\23\2\2\u00b0\37\3\2\2\2\u00b1\u00b2\t\2\2\2\u00b2!"+
		"\3\2\2\2\u00b3\u00b4\t\3\2\2\u00b4#\3\2\2\2\u00b5\u00b6\t\4\2\2\u00b6"+
		"%\3\2\2\2\u00b7\u00b8\t\5\2\2\u00b8\'\3\2\2\2\u00b9\u00ba\t\6\2\2\u00ba"+
		")\3\2\2\2\u00bb\u00bc\t\7\2\2\u00bc+\3\2\2\2\r/\67BQ\\x\177\u008b\u0093"+
		"\u00aa\u00ad";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}