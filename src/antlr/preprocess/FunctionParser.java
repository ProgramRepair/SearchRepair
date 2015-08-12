// Generated from Function.g4 by ANTLR 4.4
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
public class FunctionParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__9=1, T__8=2, T__7=3, T__6=4, T__5=5, T__4=6, T__3=7, T__2=8, T__1=9, 
		T__0=10, BlockComment=11, LineComment=12, CharacterLiteral=13, StringLiteral=14, 
		Int=15, Char=16, Float=17, Double=18, INT=19, FLOAT=20, STRING=21, ID=22, 
		OR=23, AND=24, LPAREN=25, RPAREN=26, ADDCTIVE=27, DEDUCTIVE=28, MULTIPLY=29, 
		DIVIDE=30, MOD=31, ASSIGN=32, INCRE=33, DECRE=34, ADDSELF=35, DEDUCTSELF=36, 
		MODSELF=37, MULTISELF=38, DIVIDESELF=39, LT=40, LE=41, GT=42, GE=43, EQ=44, 
		NEQ=45, WS=46;
	public static final String[] tokenNames = {
		"<INVALID>", "'&'", "'else'", "'return'", "'['", "';'", "'{'", "','", 
		"']'", "'}'", "'if'", "BlockComment", "LineComment", "CharacterLiteral", 
		"StringLiteral", "'int'", "'char'", "'float'", "'double'", "INT", "FLOAT", 
		"STRING", "ID", "'||'", "'&&'", "'('", "')'", "'+'", "'-'", "'*'", "'/'", 
		"'%'", "'='", "'++'", "'--'", "'+='", "'-='", "'%='", "'*='", "'/='", 
		"'<'", "'<='", "'>'", "'>='", "'=='", "'!='", "WS"
	};
	public static final int
		RULE_prog = 0, RULE_function = 1, RULE_type = 2, RULE_parameters = 3, 
		RULE_formalParameter = 4, RULE_block = 5, RULE_stat = 6, RULE_if_stat = 7, 
		RULE_declarationStat = 8, RULE_returnStat = 9, RULE_callStat = 10, RULE_assignStat = 11, 
		RULE_callExpr = 12, RULE_selfIncreStat = 13, RULE_increOperator = 14, 
		RULE_arguments = 15, RULE_assign_expression = 16, RULE_arithmAssignOperator = 17, 
		RULE_condExpr = 18, RULE_or_expression = 19, RULE_and_expression = 20, 
		RULE_term = 21, RULE_arith_expression = 22, RULE_add_expression = 23, 
		RULE_multi_expression = 24, RULE_expr = 25, RULE_addOperator = 26, RULE_multiOperator = 27, 
		RULE_atom = 28, RULE_operator = 29;
	public static final String[] ruleNames = {
		"prog", "function", "type", "parameters", "formalParameter", "block", 
		"stat", "if_stat", "declarationStat", "returnStat", "callStat", "assignStat", 
		"callExpr", "selfIncreStat", "increOperator", "arguments", "assign_expression", 
		"arithmAssignOperator", "condExpr", "or_expression", "and_expression", 
		"term", "arith_expression", "add_expression", "multi_expression", "expr", 
		"addOperator", "multiOperator", "atom", "operator"
	};

	@Override
	public String getGrammarFileName() { return "Function.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public FunctionParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgContext extends ParserRuleContext {
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60); function();
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

	public static class FunctionContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(FunctionParser.ID, 0); }
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_function);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62); type();
			setState(63); match(ID);
			setState(64); parameters();
			setState(65); block();
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
		public TerminalNode Char() { return getToken(FunctionParser.Char, 0); }
		public TerminalNode Float() { return getToken(FunctionParser.Float, 0); }
		public TerminalNode Int() { return getToken(FunctionParser.Int, 0); }
		public TerminalNode Double() { return getToken(FunctionParser.Double, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
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

	public static class ParametersContext extends ParserRuleContext {
		public List<FormalParameterContext> formalParameter() {
			return getRuleContexts(FormalParameterContext.class);
		}
		public TerminalNode LPAREN() { return getToken(FunctionParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(FunctionParser.RPAREN, 0); }
		public FormalParameterContext formalParameter(int i) {
			return getRuleContext(FormalParameterContext.class,i);
		}
		public ParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameters; }
	}

	public final ParametersContext parameters() throws RecognitionException {
		ParametersContext _localctx = new ParametersContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_parameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69); match(LPAREN);
			setState(78);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Int) | (1L << Char) | (1L << Float) | (1L << Double))) != 0)) {
				{
				setState(70); formalParameter();
				setState(75);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(71); match(T__3);
					setState(72); formalParameter();
					}
					}
					setState(77);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

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

	public static class FormalParameterContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(FunctionParser.ID, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public FormalParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameter; }
	}

	public final FormalParameterContext formalParameter() throws RecognitionException {
		FormalParameterContext _localctx = new FormalParameterContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_formalParameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82); type();
			setState(83); match(ID);
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
		enterRule(_localctx, 10, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85); match(T__4);
			setState(89);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << T__0) | (1L << Int) | (1L << Char) | (1L << Float) | (1L << Double) | (1L << ID) | (1L << MULTIPLY))) != 0)) {
				{
				{
				setState(86); stat();
				}
				}
				setState(91);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(92); match(T__1);
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
		enterRule(_localctx, 12, RULE_stat);
		try {
			setState(110);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(94); declarationStat();
				setState(95); match(T__5);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(97); if_stat();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(98); returnStat();
				setState(99); match(T__5);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(101); callStat();
				setState(102); match(T__5);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(104); assignStat();
				setState(105); match(T__5);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(107); selfIncreStat();
				setState(108); match(T__5);
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
		public CondExprContext condExpr(int i) {
			return getRuleContext(CondExprContext.class,i);
		}
		public List<CondExprContext> condExpr() {
			return getRuleContexts(CondExprContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public If_statContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_stat; }
	}

	public final If_statContext if_stat() throws RecognitionException {
		If_statContext _localctx = new If_statContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_if_stat);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(112); match(T__0);
			setState(113); condExpr();
			setState(116);
			switch (_input.LA(1)) {
			case T__7:
			case T__0:
			case Int:
			case Char:
			case Float:
			case Double:
			case ID:
			case MULTIPLY:
				{
				setState(114); stat();
				}
				break;
			case T__4:
				{
				setState(115); block();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(127);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(118); match(T__8);
					setState(119); match(T__0);
					setState(120); condExpr();
					setState(123);
					switch (_input.LA(1)) {
					case T__7:
					case T__0:
					case Int:
					case Char:
					case Float:
					case Double:
					case ID:
					case MULTIPLY:
						{
						setState(121); stat();
						}
						break;
					case T__4:
						{
						setState(122); block();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					} 
				}
				setState(129);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			setState(135);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(130); match(T__8);
				setState(133);
				switch (_input.LA(1)) {
				case T__7:
				case T__0:
				case Int:
				case Char:
				case Float:
				case Double:
				case ID:
				case MULTIPLY:
					{
					setState(131); stat();
					}
					break;
				case T__4:
					{
					setState(132); block();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
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

	public static class DeclarationStatContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(FunctionParser.ID); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID(int i) {
			return getToken(FunctionParser.ID, i);
		}
		public TerminalNode INT() { return getToken(FunctionParser.INT, 0); }
		public DeclarationStatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarationStat; }
	}

	public final DeclarationStatContext declarationStat() throws RecognitionException {
		DeclarationStatContext _localctx = new DeclarationStatContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_declarationStat);
		int _la;
		try {
			setState(156);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(137); type();
				{
				setState(138); match(ID);
				}
				setState(143);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(139); match(T__3);
					setState(140); match(ID);
					}
					}
					setState(145);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(146); type();
				setState(147); match(ID);
				{
				setState(148); match(T__6);
				setState(149); match(INT);
				setState(150); match(T__2);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(152); type();
				setState(153); match(MULTIPLY);
				setState(154); match(ID);
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
		enterRule(_localctx, 18, RULE_returnStat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158); match(T__7);
			{
			setState(159); arith_expression();
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
		enterRule(_localctx, 20, RULE_callStat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161); callExpr();
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
		public TerminalNode ID() { return getToken(FunctionParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(FunctionParser.ASSIGN, 0); }
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
		enterRule(_localctx, 22, RULE_assignStat);
		try {
			setState(184);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(163); match(ID);
				setState(164); match(ASSIGN);
				setState(165); assign_expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(166); type();
				setState(167); match(ID);
				setState(168); match(ASSIGN);
				setState(169); assign_expression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(171); match(MULTIPLY);
				setState(172); match(ID);
				setState(173); match(ASSIGN);
				setState(174); assign_expression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(175); match(ID);
				setState(176); arithmAssignOperator();
				setState(177); assign_expression();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(179); match(MULTIPLY);
				setState(180); match(ID);
				setState(181); arithmAssignOperator();
				setState(182); assign_expression();
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
		public TerminalNode ID() { return getToken(FunctionParser.ID, 0); }
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
		enterRule(_localctx, 24, RULE_callExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186); match(ID);
			setState(187); arguments();
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
		public TerminalNode ID() { return getToken(FunctionParser.ID, 0); }
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
		enterRule(_localctx, 26, RULE_selfIncreStat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189); match(ID);
			setState(190); increOperator();
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
		public TerminalNode INCRE() { return getToken(FunctionParser.INCRE, 0); }
		public TerminalNode DECRE() { return getToken(FunctionParser.DECRE, 0); }
		public IncreOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_increOperator; }
	}

	public final IncreOperatorContext increOperator() throws RecognitionException {
		IncreOperatorContext _localctx = new IncreOperatorContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_increOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
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
		public TerminalNode LPAREN() { return getToken(FunctionParser.LPAREN, 0); }
		public List<Assign_expressionContext> assign_expression() {
			return getRuleContexts(Assign_expressionContext.class);
		}
		public TerminalNode RPAREN() { return getToken(FunctionParser.RPAREN, 0); }
		public ArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arguments; }
	}

	public final ArgumentsContext arguments() throws RecognitionException {
		ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194); match(LPAREN);
			setState(203);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__9) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << INT) | (1L << FLOAT) | (1L << ID) | (1L << LPAREN))) != 0)) {
				{
				setState(195); assign_expression();
				setState(200);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(196); match(T__3);
					setState(197); assign_expression();
					}
					}
					setState(202);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(205); match(RPAREN);
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
		public TerminalNode ID() { return getToken(FunctionParser.ID, 0); }
		public Arith_expressionContext arith_expression() {
			return getRuleContext(Arith_expressionContext.class,0);
		}
		public TerminalNode StringLiteral() { return getToken(FunctionParser.StringLiteral, 0); }
		public TerminalNode CharacterLiteral() { return getToken(FunctionParser.CharacterLiteral, 0); }
		public Assign_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign_expression; }
	}

	public final Assign_expressionContext assign_expression() throws RecognitionException {
		Assign_expressionContext _localctx = new Assign_expressionContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_assign_expression);
		try {
			setState(212);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(207); arith_expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(208); match(StringLiteral);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(209); match(CharacterLiteral);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(210); match(T__9);
				setState(211); match(ID);
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
		public TerminalNode MULTISELF() { return getToken(FunctionParser.MULTISELF, 0); }
		public TerminalNode MODSELF() { return getToken(FunctionParser.MODSELF, 0); }
		public TerminalNode DEDUCTSELF() { return getToken(FunctionParser.DEDUCTSELF, 0); }
		public TerminalNode ADDSELF() { return getToken(FunctionParser.ADDSELF, 0); }
		public TerminalNode DIVIDESELF() { return getToken(FunctionParser.DIVIDESELF, 0); }
		public ArithmAssignOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithmAssignOperator; }
	}

	public final ArithmAssignOperatorContext arithmAssignOperator() throws RecognitionException {
		ArithmAssignOperatorContext _localctx = new ArithmAssignOperatorContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_arithmAssignOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
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
		enterRule(_localctx, 36, RULE_condExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(216); or_expression();
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
		public List<TerminalNode> OR() { return getTokens(FunctionParser.OR); }
		public TerminalNode OR(int i) {
			return getToken(FunctionParser.OR, i);
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
		enterRule(_localctx, 38, RULE_or_expression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(218); and_expression();
			setState(223);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(219); match(OR);
					setState(220); or_expression();
					}
					} 
				}
				setState(225);
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
			return getToken(FunctionParser.AND, i);
		}
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public List<TerminalNode> AND() { return getTokens(FunctionParser.AND); }
		public And_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_and_expression; }
	}

	public final And_expressionContext and_expression() throws RecognitionException {
		And_expressionContext _localctx = new And_expressionContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_and_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(226); term();
			setState(231);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND) {
				{
				{
				setState(227); match(AND);
				setState(228); term();
				}
				}
				setState(233);
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
		public TerminalNode LPAREN() { return getToken(FunctionParser.LPAREN, 0); }
		public OperatorContext operator() {
			return getRuleContext(OperatorContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(FunctionParser.RPAREN, 0); }
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
		enterRule(_localctx, 42, RULE_term);
		int _la;
		try {
			setState(244);
			switch (_input.LA(1)) {
			case CharacterLiteral:
			case INT:
			case FLOAT:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(234); atom();
				setState(238);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LT) | (1L << LE) | (1L << GT) | (1L << GE) | (1L << EQ) | (1L << NEQ))) != 0)) {
					{
					setState(235); operator();
					setState(236); atom();
					}
				}

				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 2);
				{
				setState(240); match(LPAREN);
				setState(241); or_expression();
				setState(242); match(RPAREN);
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
		enterRule(_localctx, 44, RULE_arith_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(246); add_expression();
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
		enterRule(_localctx, 46, RULE_add_expression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(248); multi_expression();
			setState(254);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(249); addOperator();
					setState(250); add_expression();
					}
					} 
				}
				setState(256);
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
		enterRule(_localctx, 48, RULE_multi_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(257); expr();
			setState(263);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MULTIPLY) | (1L << DIVIDE) | (1L << MOD))) != 0)) {
				{
				{
				setState(258); multiOperator();
				setState(259); expr();
				}
				}
				setState(265);
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
		public TerminalNode LPAREN() { return getToken(FunctionParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(FunctionParser.RPAREN, 0); }
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
		enterRule(_localctx, 50, RULE_expr);
		try {
			setState(271);
			switch (_input.LA(1)) {
			case CharacterLiteral:
			case INT:
			case FLOAT:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(266); atom();
				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 2);
				{
				setState(267); match(LPAREN);
				setState(268); add_expression();
				setState(269); match(RPAREN);
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
		public TerminalNode ADDCTIVE() { return getToken(FunctionParser.ADDCTIVE, 0); }
		public TerminalNode DEDUCTIVE() { return getToken(FunctionParser.DEDUCTIVE, 0); }
		public AddOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addOperator; }
	}

	public final AddOperatorContext addOperator() throws RecognitionException {
		AddOperatorContext _localctx = new AddOperatorContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_addOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(273);
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
		public TerminalNode DIVIDE() { return getToken(FunctionParser.DIVIDE, 0); }
		public TerminalNode MULTIPLY() { return getToken(FunctionParser.MULTIPLY, 0); }
		public TerminalNode MOD() { return getToken(FunctionParser.MOD, 0); }
		public MultiOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiOperator; }
	}

	public final MultiOperatorContext multiOperator() throws RecognitionException {
		MultiOperatorContext _localctx = new MultiOperatorContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_multiOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(275);
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
		public TerminalNode ID() { return getToken(FunctionParser.ID, 0); }
		public CallExprContext callExpr() {
			return getRuleContext(CallExprContext.class,0);
		}
		public TerminalNode INT() { return getToken(FunctionParser.INT, 0); }
		public TerminalNode CharacterLiteral() { return getToken(FunctionParser.CharacterLiteral, 0); }
		public TerminalNode FLOAT() { return getToken(FunctionParser.FLOAT, 0); }
		public AtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atom; }
	}

	public final AtomContext atom() throws RecognitionException {
		AtomContext _localctx = new AtomContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_atom);
		try {
			setState(282);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(277); match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(278); match(INT);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(279); match(FLOAT);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(280); match(CharacterLiteral);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(281); callExpr();
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
		public TerminalNode NEQ() { return getToken(FunctionParser.NEQ, 0); }
		public TerminalNode GE() { return getToken(FunctionParser.GE, 0); }
		public TerminalNode LT() { return getToken(FunctionParser.LT, 0); }
		public TerminalNode GT() { return getToken(FunctionParser.GT, 0); }
		public TerminalNode LE() { return getToken(FunctionParser.LE, 0); }
		public TerminalNode EQ() { return getToken(FunctionParser.EQ, 0); }
		public OperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operator; }
	}

	public final OperatorContext operator() throws RecognitionException {
		OperatorContext _localctx = new OperatorContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(284);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\60\u0121\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\3\2\3\2\3"+
		"\3\3\3\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\5\7\5L\n\5\f\5\16\5O\13\5\5\5"+
		"Q\n\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\7\7Z\n\7\f\7\16\7]\13\7\3\7\3\7\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\bq\n\b"+
		"\3\t\3\t\3\t\3\t\5\tw\n\t\3\t\3\t\3\t\3\t\3\t\5\t~\n\t\7\t\u0080\n\t\f"+
		"\t\16\t\u0083\13\t\3\t\3\t\3\t\5\t\u0088\n\t\5\t\u008a\n\t\3\n\3\n\3\n"+
		"\3\n\7\n\u0090\n\n\f\n\16\n\u0093\13\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\5\n\u009f\n\n\3\13\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00bb"+
		"\n\r\3\16\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\21\3\21\3\21\3\21\7\21"+
		"\u00c9\n\21\f\21\16\21\u00cc\13\21\5\21\u00ce\n\21\3\21\3\21\3\22\3\22"+
		"\3\22\3\22\3\22\5\22\u00d7\n\22\3\23\3\23\3\24\3\24\3\25\3\25\3\25\7\25"+
		"\u00e0\n\25\f\25\16\25\u00e3\13\25\3\26\3\26\3\26\7\26\u00e8\n\26\f\26"+
		"\16\26\u00eb\13\26\3\27\3\27\3\27\3\27\5\27\u00f1\n\27\3\27\3\27\3\27"+
		"\3\27\5\27\u00f7\n\27\3\30\3\30\3\31\3\31\3\31\3\31\7\31\u00ff\n\31\f"+
		"\31\16\31\u0102\13\31\3\32\3\32\3\32\3\32\7\32\u0108\n\32\f\32\16\32\u010b"+
		"\13\32\3\33\3\33\3\33\3\33\3\33\5\33\u0112\n\33\3\34\3\34\3\35\3\35\3"+
		"\36\3\36\3\36\3\36\3\36\5\36\u011d\n\36\3\37\3\37\3\37\2\2 \2\4\6\b\n"+
		"\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<\2\b\3\2\21\24\3"+
		"\2#$\3\2%)\3\2\35\36\3\2\37!\3\2*/\u0126\2>\3\2\2\2\4@\3\2\2\2\6E\3\2"+
		"\2\2\bG\3\2\2\2\nT\3\2\2\2\fW\3\2\2\2\16p\3\2\2\2\20r\3\2\2\2\22\u009e"+
		"\3\2\2\2\24\u00a0\3\2\2\2\26\u00a3\3\2\2\2\30\u00ba\3\2\2\2\32\u00bc\3"+
		"\2\2\2\34\u00bf\3\2\2\2\36\u00c2\3\2\2\2 \u00c4\3\2\2\2\"\u00d6\3\2\2"+
		"\2$\u00d8\3\2\2\2&\u00da\3\2\2\2(\u00dc\3\2\2\2*\u00e4\3\2\2\2,\u00f6"+
		"\3\2\2\2.\u00f8\3\2\2\2\60\u00fa\3\2\2\2\62\u0103\3\2\2\2\64\u0111\3\2"+
		"\2\2\66\u0113\3\2\2\28\u0115\3\2\2\2:\u011c\3\2\2\2<\u011e\3\2\2\2>?\5"+
		"\4\3\2?\3\3\2\2\2@A\5\6\4\2AB\7\30\2\2BC\5\b\5\2CD\5\f\7\2D\5\3\2\2\2"+
		"EF\t\2\2\2F\7\3\2\2\2GP\7\33\2\2HM\5\n\6\2IJ\7\t\2\2JL\5\n\6\2KI\3\2\2"+
		"\2LO\3\2\2\2MK\3\2\2\2MN\3\2\2\2NQ\3\2\2\2OM\3\2\2\2PH\3\2\2\2PQ\3\2\2"+
		"\2QR\3\2\2\2RS\7\34\2\2S\t\3\2\2\2TU\5\6\4\2UV\7\30\2\2V\13\3\2\2\2W["+
		"\7\b\2\2XZ\5\16\b\2YX\3\2\2\2Z]\3\2\2\2[Y\3\2\2\2[\\\3\2\2\2\\^\3\2\2"+
		"\2][\3\2\2\2^_\7\13\2\2_\r\3\2\2\2`a\5\22\n\2ab\7\7\2\2bq\3\2\2\2cq\5"+
		"\20\t\2de\5\24\13\2ef\7\7\2\2fq\3\2\2\2gh\5\26\f\2hi\7\7\2\2iq\3\2\2\2"+
		"jk\5\30\r\2kl\7\7\2\2lq\3\2\2\2mn\5\34\17\2no\7\7\2\2oq\3\2\2\2p`\3\2"+
		"\2\2pc\3\2\2\2pd\3\2\2\2pg\3\2\2\2pj\3\2\2\2pm\3\2\2\2q\17\3\2\2\2rs\7"+
		"\f\2\2sv\5&\24\2tw\5\16\b\2uw\5\f\7\2vt\3\2\2\2vu\3\2\2\2w\u0081\3\2\2"+
		"\2xy\7\4\2\2yz\7\f\2\2z}\5&\24\2{~\5\16\b\2|~\5\f\7\2}{\3\2\2\2}|\3\2"+
		"\2\2~\u0080\3\2\2\2\177x\3\2\2\2\u0080\u0083\3\2\2\2\u0081\177\3\2\2\2"+
		"\u0081\u0082\3\2\2\2\u0082\u0089\3\2\2\2\u0083\u0081\3\2\2\2\u0084\u0087"+
		"\7\4\2\2\u0085\u0088\5\16\b\2\u0086\u0088\5\f\7\2\u0087\u0085\3\2\2\2"+
		"\u0087\u0086\3\2\2\2\u0088\u008a\3\2\2\2\u0089\u0084\3\2\2\2\u0089\u008a"+
		"\3\2\2\2\u008a\21\3\2\2\2\u008b\u008c\5\6\4\2\u008c\u0091\7\30\2\2\u008d"+
		"\u008e\7\t\2\2\u008e\u0090\7\30\2\2\u008f\u008d\3\2\2\2\u0090\u0093\3"+
		"\2\2\2\u0091\u008f\3\2\2\2\u0091\u0092\3\2\2\2\u0092\u009f\3\2\2\2\u0093"+
		"\u0091\3\2\2\2\u0094\u0095\5\6\4\2\u0095\u0096\7\30\2\2\u0096\u0097\7"+
		"\6\2\2\u0097\u0098\7\25\2\2\u0098\u0099\7\n\2\2\u0099\u009f\3\2\2\2\u009a"+
		"\u009b\5\6\4\2\u009b\u009c\7\37\2\2\u009c\u009d\7\30\2\2\u009d\u009f\3"+
		"\2\2\2\u009e\u008b\3\2\2\2\u009e\u0094\3\2\2\2\u009e\u009a\3\2\2\2\u009f"+
		"\23\3\2\2\2\u00a0\u00a1\7\5\2\2\u00a1\u00a2\5.\30\2\u00a2\25\3\2\2\2\u00a3"+
		"\u00a4\5\32\16\2\u00a4\27\3\2\2\2\u00a5\u00a6\7\30\2\2\u00a6\u00a7\7\""+
		"\2\2\u00a7\u00bb\5\"\22\2\u00a8\u00a9\5\6\4\2\u00a9\u00aa\7\30\2\2\u00aa"+
		"\u00ab\7\"\2\2\u00ab\u00ac\5\"\22\2\u00ac\u00bb\3\2\2\2\u00ad\u00ae\7"+
		"\37\2\2\u00ae\u00af\7\30\2\2\u00af\u00b0\7\"\2\2\u00b0\u00bb\5\"\22\2"+
		"\u00b1\u00b2\7\30\2\2\u00b2\u00b3\5$\23\2\u00b3\u00b4\5\"\22\2\u00b4\u00bb"+
		"\3\2\2\2\u00b5\u00b6\7\37\2\2\u00b6\u00b7\7\30\2\2\u00b7\u00b8\5$\23\2"+
		"\u00b8\u00b9\5\"\22\2\u00b9\u00bb\3\2\2\2\u00ba\u00a5\3\2\2\2\u00ba\u00a8"+
		"\3\2\2\2\u00ba\u00ad\3\2\2\2\u00ba\u00b1\3\2\2\2\u00ba\u00b5\3\2\2\2\u00bb"+
		"\31\3\2\2\2\u00bc\u00bd\7\30\2\2\u00bd\u00be\5 \21\2\u00be\33\3\2\2\2"+
		"\u00bf\u00c0\7\30\2\2\u00c0\u00c1\5\36\20\2\u00c1\35\3\2\2\2\u00c2\u00c3"+
		"\t\3\2\2\u00c3\37\3\2\2\2\u00c4\u00cd\7\33\2\2\u00c5\u00ca\5\"\22\2\u00c6"+
		"\u00c7\7\t\2\2\u00c7\u00c9\5\"\22\2\u00c8\u00c6\3\2\2\2\u00c9\u00cc\3"+
		"\2\2\2\u00ca\u00c8\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb\u00ce\3\2\2\2\u00cc"+
		"\u00ca\3\2\2\2\u00cd\u00c5\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce\u00cf\3\2"+
		"\2\2\u00cf\u00d0\7\34\2\2\u00d0!\3\2\2\2\u00d1\u00d7\5.\30\2\u00d2\u00d7"+
		"\7\20\2\2\u00d3\u00d7\7\17\2\2\u00d4\u00d5\7\3\2\2\u00d5\u00d7\7\30\2"+
		"\2\u00d6\u00d1\3\2\2\2\u00d6\u00d2\3\2\2\2\u00d6\u00d3\3\2\2\2\u00d6\u00d4"+
		"\3\2\2\2\u00d7#\3\2\2\2\u00d8\u00d9\t\4\2\2\u00d9%\3\2\2\2\u00da\u00db"+
		"\5(\25\2\u00db\'\3\2\2\2\u00dc\u00e1\5*\26\2\u00dd\u00de\7\31\2\2\u00de"+
		"\u00e0\5(\25\2\u00df\u00dd\3\2\2\2\u00e0\u00e3\3\2\2\2\u00e1\u00df\3\2"+
		"\2\2\u00e1\u00e2\3\2\2\2\u00e2)\3\2\2\2\u00e3\u00e1\3\2\2\2\u00e4\u00e9"+
		"\5,\27\2\u00e5\u00e6\7\32\2\2\u00e6\u00e8\5,\27\2\u00e7\u00e5\3\2\2\2"+
		"\u00e8\u00eb\3\2\2\2\u00e9\u00e7\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea+\3"+
		"\2\2\2\u00eb\u00e9\3\2\2\2\u00ec\u00f0\5:\36\2\u00ed\u00ee\5<\37\2\u00ee"+
		"\u00ef\5:\36\2\u00ef\u00f1\3\2\2\2\u00f0\u00ed\3\2\2\2\u00f0\u00f1\3\2"+
		"\2\2\u00f1\u00f7\3\2\2\2\u00f2\u00f3\7\33\2\2\u00f3\u00f4\5(\25\2\u00f4"+
		"\u00f5\7\34\2\2\u00f5\u00f7\3\2\2\2\u00f6\u00ec\3\2\2\2\u00f6\u00f2\3"+
		"\2\2\2\u00f7-\3\2\2\2\u00f8\u00f9\5\60\31\2\u00f9/\3\2\2\2\u00fa\u0100"+
		"\5\62\32\2\u00fb\u00fc\5\66\34\2\u00fc\u00fd\5\60\31\2\u00fd\u00ff\3\2"+
		"\2\2\u00fe\u00fb\3\2\2\2\u00ff\u0102\3\2\2\2\u0100\u00fe\3\2\2\2\u0100"+
		"\u0101\3\2\2\2\u0101\61\3\2\2\2\u0102\u0100\3\2\2\2\u0103\u0109\5\64\33"+
		"\2\u0104\u0105\58\35\2\u0105\u0106\5\64\33\2\u0106\u0108\3\2\2\2\u0107"+
		"\u0104\3\2\2\2\u0108\u010b\3\2\2\2\u0109\u0107\3\2\2\2\u0109\u010a\3\2"+
		"\2\2\u010a\63\3\2\2\2\u010b\u0109\3\2\2\2\u010c\u0112\5:\36\2\u010d\u010e"+
		"\7\33\2\2\u010e\u010f\5\60\31\2\u010f\u0110\7\34\2\2\u0110\u0112\3\2\2"+
		"\2\u0111\u010c\3\2\2\2\u0111\u010d\3\2\2\2\u0112\65\3\2\2\2\u0113\u0114"+
		"\t\5\2\2\u0114\67\3\2\2\2\u0115\u0116\t\6\2\2\u01169\3\2\2\2\u0117\u011d"+
		"\7\30\2\2\u0118\u011d\7\25\2\2\u0119\u011d\7\26\2\2\u011a\u011d\7\17\2"+
		"\2\u011b\u011d\5\32\16\2\u011c\u0117\3\2\2\2\u011c\u0118\3\2\2\2\u011c"+
		"\u0119\3\2\2\2\u011c\u011a\3\2\2\2\u011c\u011b\3\2\2\2\u011d;\3\2\2\2"+
		"\u011e\u011f\t\7\2\2\u011f=\3\2\2\2\31MP[pv}\u0081\u0087\u0089\u0091\u009e"+
		"\u00ba\u00ca\u00cd\u00d6\u00e1\u00e9\u00f0\u00f6\u0100\u0109\u0111\u011c";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}