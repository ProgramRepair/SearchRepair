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
		T__8=1, T__7=2, T__6=3, T__5=4, T__4=5, T__3=6, T__2=7, T__1=8, T__0=9, 
		BlockComment=10, LineComment=11, CharacterLiteral=12, StringLiteral=13, 
		Int=14, Char=15, Float=16, String=17, Double=18, INT=19, FLOAT=20, STRING=21, 
		ID=22, OR=23, AND=24, LPAREN=25, RPAREN=26, ADDCTIVE=27, DEDUCTIVE=28, 
		MULTIPLY=29, DIVIDE=30, MOD=31, ASSIGN=32, POINTER=33, INCRE=34, DECRE=35, 
		ADDSELF=36, DEDUCTSELF=37, MODSELF=38, MULTISELF=39, DIVIDESELF=40, LT=41, 
		LE=42, GT=43, GE=44, EQ=45, NEQ=46, WS=47;
	public static final String[] tokenNames = {
		"<INVALID>", "']'", "'{'", "','", "'['", "'if'", "'else'", "'return'", 
		"'}'", "';'", "BlockComment", "LineComment", "CharacterLiteral", "StringLiteral", 
		"'int'", "'char'", "'float'", "'char*'", "'double'", "INT", "FLOAT", "STRING", 
		"ID", "'||'", "'&&'", "'('", "')'", "'+'", "'-'", "MULTIPLY", "'/'", "'%'", 
		"'='", "POINTER", "'++'", "'--'", "'+='", "'-='", "'%='", "'*='", "'/='", 
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitProg(this);
		}
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
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitFunction(this);
		}
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
		public TerminalNode String() { return getToken(FunctionParser.String, 0); }
		public TerminalNode Char() { return getToken(FunctionParser.Char, 0); }
		public TerminalNode Float() { return getToken(FunctionParser.Float, 0); }
		public TerminalNode Int() { return getToken(FunctionParser.Int, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitType(this);
		}
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
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Int) | (1L << Char) | (1L << Float) | (1L << String))) != 0)) ) {
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
		public TerminalNode RPAREN() { return getToken(FunctionParser.RPAREN, 0); }
		public TerminalNode LPAREN() { return getToken(FunctionParser.LPAREN, 0); }
		public FormalParameterContext formalParameter(int i) {
			return getRuleContext(FormalParameterContext.class,i);
		}
		public ParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitParameters(this);
		}
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
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Int) | (1L << Char) | (1L << Float) | (1L << String))) != 0)) {
				{
				setState(70); formalParameter();
				setState(75);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__6) {
					{
					{
					setState(71); match(T__6);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterFormalParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitFormalParameter(this);
		}
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitBlock(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85); match(T__7);
			setState(89);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__2) | (1L << Int) | (1L << Char) | (1L << Float) | (1L << String) | (1L << ID) | (1L << POINTER))) != 0)) {
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
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitStat(this);
		}
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
				setState(95); match(T__0);
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
				setState(99); match(T__0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(101); callStat();
				setState(102); match(T__0);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(104); assignStat();
				setState(105); match(T__0);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(107); selfIncreStat();
				setState(108); match(T__0);
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
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public CondExprContext condExpr(int i) {
			return getRuleContext(CondExprContext.class,i);
		}
		public List<CondExprContext> condExpr() {
			return getRuleContexts(CondExprContext.class);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterIf_stat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitIf_stat(this);
		}
	}

	public final If_statContext if_stat() throws RecognitionException {
		If_statContext _localctx = new If_statContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_if_stat);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(112); match(T__4);
			setState(113); condExpr();
			setState(116);
			switch (_input.LA(1)) {
			case T__4:
			case T__2:
			case Int:
			case Char:
			case Float:
			case String:
			case ID:
			case POINTER:
				{
				setState(114); stat();
				}
				break;
			case T__7:
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
					setState(118); match(T__3);
					setState(119); match(T__4);
					setState(120); condExpr();
					setState(123);
					switch (_input.LA(1)) {
					case T__4:
					case T__2:
					case Int:
					case Char:
					case Float:
					case String:
					case ID:
					case POINTER:
						{
						setState(121); stat();
						}
						break;
					case T__7:
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
				setState(130); match(T__3);
				setState(133);
				switch (_input.LA(1)) {
				case T__4:
				case T__2:
				case Int:
				case Char:
				case Float:
				case String:
				case ID:
				case POINTER:
					{
					setState(131); stat();
					}
					break;
				case T__7:
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
		public TerminalNode INT() { return getToken(FunctionParser.INT, 0); }
		public TerminalNode ID() { return getToken(FunctionParser.ID, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public DeclarationStatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarationStat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterDeclarationStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitDeclarationStat(this);
		}
	}

	public final DeclarationStatContext declarationStat() throws RecognitionException {
		DeclarationStatContext _localctx = new DeclarationStatContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_declarationStat);
		try {
			setState(146);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(137); type();
				setState(138); match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(140); type();
				setState(141); match(ID);
				{
				setState(142); match(T__5);
				setState(143); match(INT);
				setState(144); match(T__8);
				}
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
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterReturnStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitReturnStat(this);
		}
	}

	public final ReturnStatContext returnStat() throws RecognitionException {
		ReturnStatContext _localctx = new ReturnStatContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_returnStat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148); match(T__2);
			{
			setState(149); arith_expression();
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
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterCallStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitCallStat(this);
		}
	}

	public final CallStatContext callStat() throws RecognitionException {
		CallStatContext _localctx = new CallStatContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_callStat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151); callExpr();
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
		public TerminalNode POINTER() { return getToken(FunctionParser.POINTER, 0); }
		public Assign_expressionContext assign_expression() {
			return getRuleContext(Assign_expressionContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(FunctionParser.ASSIGN, 0); }
		public TerminalNode ID() { return getToken(FunctionParser.ID, 0); }
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
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterAssignStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitAssignStat(this);
		}
	}

	public final AssignStatContext assignStat() throws RecognitionException {
		AssignStatContext _localctx = new AssignStatContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_assignStat);
		try {
			setState(180);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(153); match(ID);
				setState(154); match(ASSIGN);
				setState(155); assign_expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(156); type();
				setState(157); match(ID);
				setState(158); match(ASSIGN);
				setState(159); assign_expression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(161); match(POINTER);
				setState(162); match(ID);
				setState(163); match(ASSIGN);
				setState(164); assign_expression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(165); type();
				setState(166); match(POINTER);
				setState(167); match(ID);
				setState(168); match(ASSIGN);
				setState(169); assign_expression();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(171); match(ID);
				setState(172); arithmAssignOperator();
				setState(173); assign_expression();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(175); match(POINTER);
				setState(176); match(ID);
				setState(177); arithmAssignOperator();
				setState(178); assign_expression();
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterCallExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitCallExpr(this);
		}
	}

	public final CallExprContext callExpr() throws RecognitionException {
		CallExprContext _localctx = new CallExprContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_callExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(182); match(ID);
			setState(183); arguments();
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterSelfIncreStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitSelfIncreStat(this);
		}
	}

	public final SelfIncreStatContext selfIncreStat() throws RecognitionException {
		SelfIncreStatContext _localctx = new SelfIncreStatContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_selfIncreStat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(185); match(ID);
			setState(186); increOperator();
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
		public TerminalNode DECRE() { return getToken(FunctionParser.DECRE, 0); }
		public TerminalNode INCRE() { return getToken(FunctionParser.INCRE, 0); }
		public IncreOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_increOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterIncreOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitIncreOperator(this);
		}
	}

	public final IncreOperatorContext increOperator() throws RecognitionException {
		IncreOperatorContext _localctx = new IncreOperatorContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_increOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
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
		public TerminalNode RPAREN() { return getToken(FunctionParser.RPAREN, 0); }
		public TerminalNode LPAREN() { return getToken(FunctionParser.LPAREN, 0); }
		public ArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitArguments(this);
		}
	}

	public final ArgumentsContext arguments() throws RecognitionException {
		ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(190); match(LPAREN);
			setState(199);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CharacterLiteral) | (1L << StringLiteral) | (1L << INT) | (1L << FLOAT) | (1L << ID) | (1L << LPAREN))) != 0)) {
				{
				setState(191); assign_expression();
				setState(196);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__6) {
					{
					{
					setState(192); match(T__6);
					setState(193); assign_expression();
					}
					}
					setState(198);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(201); match(RPAREN);
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
		public TerminalNode CharacterLiteral() { return getToken(FunctionParser.CharacterLiteral, 0); }
		public TerminalNode StringLiteral() { return getToken(FunctionParser.StringLiteral, 0); }
		public Arith_expressionContext arith_expression() {
			return getRuleContext(Arith_expressionContext.class,0);
		}
		public Assign_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterAssign_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitAssign_expression(this);
		}
	}

	public final Assign_expressionContext assign_expression() throws RecognitionException {
		Assign_expressionContext _localctx = new Assign_expressionContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_assign_expression);
		try {
			setState(206);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(203); arith_expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(204); match(StringLiteral);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(205); match(CharacterLiteral);
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
		public TerminalNode DIVIDESELF() { return getToken(FunctionParser.DIVIDESELF, 0); }
		public TerminalNode DEDUCTSELF() { return getToken(FunctionParser.DEDUCTSELF, 0); }
		public TerminalNode MULTISELF() { return getToken(FunctionParser.MULTISELF, 0); }
		public TerminalNode ADDSELF() { return getToken(FunctionParser.ADDSELF, 0); }
		public TerminalNode MODSELF() { return getToken(FunctionParser.MODSELF, 0); }
		public ArithmAssignOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithmAssignOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterArithmAssignOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitArithmAssignOperator(this);
		}
	}

	public final ArithmAssignOperatorContext arithmAssignOperator() throws RecognitionException {
		ArithmAssignOperatorContext _localctx = new ArithmAssignOperatorContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_arithmAssignOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(208);
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
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterCondExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitCondExpr(this);
		}
	}

	public final CondExprContext condExpr() throws RecognitionException {
		CondExprContext _localctx = new CondExprContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_condExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210); or_expression();
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
		public List<TerminalNode> OR() { return getTokens(FunctionParser.OR); }
		public And_expressionContext and_expression() {
			return getRuleContext(And_expressionContext.class,0);
		}
		public Or_expressionContext or_expression(int i) {
			return getRuleContext(Or_expressionContext.class,i);
		}
		public TerminalNode OR(int i) {
			return getToken(FunctionParser.OR, i);
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
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterOr_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitOr_expression(this);
		}
	}

	public final Or_expressionContext or_expression() throws RecognitionException {
		Or_expressionContext _localctx = new Or_expressionContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_or_expression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(212); and_expression();
			setState(217);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(213); match(OR);
					setState(214); or_expression();
					}
					} 
				}
				setState(219);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
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
		public List<TerminalNode> AND() { return getTokens(FunctionParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(FunctionParser.AND, i);
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
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterAnd_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitAnd_expression(this);
		}
	}

	public final And_expressionContext and_expression() throws RecognitionException {
		And_expressionContext _localctx = new And_expressionContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_and_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(220); term();
			setState(225);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND) {
				{
				{
				setState(221); match(AND);
				setState(222); term();
				}
				}
				setState(227);
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
		public TerminalNode RPAREN() { return getToken(FunctionParser.RPAREN, 0); }
		public OperatorContext operator() {
			return getRuleContext(OperatorContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(FunctionParser.LPAREN, 0); }
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
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitTerm(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_term);
		int _la;
		try {
			setState(238);
			switch (_input.LA(1)) {
			case CharacterLiteral:
			case INT:
			case FLOAT:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(228); atom();
				setState(232);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LT) | (1L << LE) | (1L << GT) | (1L << GE) | (1L << EQ) | (1L << NEQ))) != 0)) {
					{
					setState(229); operator();
					setState(230); atom();
					}
				}

				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 2);
				{
				setState(234); match(LPAREN);
				setState(235); or_expression();
				setState(236); match(RPAREN);
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
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterArith_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitArith_expression(this);
		}
	}

	public final Arith_expressionContext arith_expression() throws RecognitionException {
		Arith_expressionContext _localctx = new Arith_expressionContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_arith_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(240); add_expression();
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
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterAdd_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitAdd_expression(this);
		}
	}

	public final Add_expressionContext add_expression() throws RecognitionException {
		Add_expressionContext _localctx = new Add_expressionContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_add_expression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(242); multi_expression();
			setState(248);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(243); addOperator();
					setState(244); add_expression();
					}
					} 
				}
				setState(250);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
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
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterMulti_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitMulti_expression(this);
		}
	}

	public final Multi_expressionContext multi_expression() throws RecognitionException {
		Multi_expressionContext _localctx = new Multi_expressionContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_multi_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(251); expr();
			setState(257);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MULTIPLY) | (1L << DIVIDE) | (1L << MOD))) != 0)) {
				{
				{
				setState(252); multiOperator();
				setState(253); expr();
				}
				}
				setState(259);
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
		public TerminalNode RPAREN() { return getToken(FunctionParser.RPAREN, 0); }
		public TerminalNode LPAREN() { return getToken(FunctionParser.LPAREN, 0); }
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_expr);
		try {
			setState(265);
			switch (_input.LA(1)) {
			case CharacterLiteral:
			case INT:
			case FLOAT:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(260); atom();
				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 2);
				{
				setState(261); match(LPAREN);
				setState(262); add_expression();
				setState(263); match(RPAREN);
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
		public TerminalNode DEDUCTIVE() { return getToken(FunctionParser.DEDUCTIVE, 0); }
		public TerminalNode ADDCTIVE() { return getToken(FunctionParser.ADDCTIVE, 0); }
		public AddOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterAddOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitAddOperator(this);
		}
	}

	public final AddOperatorContext addOperator() throws RecognitionException {
		AddOperatorContext _localctx = new AddOperatorContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_addOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(267);
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
		public TerminalNode MULTIPLY() { return getToken(FunctionParser.MULTIPLY, 0); }
		public TerminalNode DIVIDE() { return getToken(FunctionParser.DIVIDE, 0); }
		public TerminalNode MOD() { return getToken(FunctionParser.MOD, 0); }
		public MultiOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterMultiOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitMultiOperator(this);
		}
	}

	public final MultiOperatorContext multiOperator() throws RecognitionException {
		MultiOperatorContext _localctx = new MultiOperatorContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_multiOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(269);
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
		public TerminalNode FLOAT() { return getToken(FunctionParser.FLOAT, 0); }
		public TerminalNode INT() { return getToken(FunctionParser.INT, 0); }
		public TerminalNode CharacterLiteral() { return getToken(FunctionParser.CharacterLiteral, 0); }
		public TerminalNode ID() { return getToken(FunctionParser.ID, 0); }
		public AtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitAtom(this);
		}
	}

	public final AtomContext atom() throws RecognitionException {
		AtomContext _localctx = new AtomContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_atom);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(271);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CharacterLiteral) | (1L << INT) | (1L << FLOAT) | (1L << ID))) != 0)) ) {
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

	public static class OperatorContext extends ParserRuleContext {
		public TerminalNode NEQ() { return getToken(FunctionParser.NEQ, 0); }
		public TerminalNode LT() { return getToken(FunctionParser.LT, 0); }
		public TerminalNode LE() { return getToken(FunctionParser.LE, 0); }
		public TerminalNode GT() { return getToken(FunctionParser.GT, 0); }
		public TerminalNode GE() { return getToken(FunctionParser.GE, 0); }
		public TerminalNode EQ() { return getToken(FunctionParser.EQ, 0); }
		public OperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitOperator(this);
		}
	}

	public final OperatorContext operator() throws RecognitionException {
		OperatorContext _localctx = new OperatorContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(273);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\61\u0116\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\3\2\3\2\3"+
		"\3\3\3\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\5\7\5L\n\5\f\5\16\5O\13\5\5\5"+
		"Q\n\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\7\7Z\n\7\f\7\16\7]\13\7\3\7\3\7\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\bq\n\b"+
		"\3\t\3\t\3\t\3\t\5\tw\n\t\3\t\3\t\3\t\3\t\3\t\5\t~\n\t\7\t\u0080\n\t\f"+
		"\t\16\t\u0083\13\t\3\t\3\t\3\t\5\t\u0088\n\t\5\t\u008a\n\t\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u0095\n\n\3\13\3\13\3\13\3\f\3\f\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00b7\n\r\3\16\3\16\3\16\3\17\3\17"+
		"\3\17\3\20\3\20\3\21\3\21\3\21\3\21\7\21\u00c5\n\21\f\21\16\21\u00c8\13"+
		"\21\5\21\u00ca\n\21\3\21\3\21\3\22\3\22\3\22\5\22\u00d1\n\22\3\23\3\23"+
		"\3\24\3\24\3\25\3\25\3\25\7\25\u00da\n\25\f\25\16\25\u00dd\13\25\3\26"+
		"\3\26\3\26\7\26\u00e2\n\26\f\26\16\26\u00e5\13\26\3\27\3\27\3\27\3\27"+
		"\5\27\u00eb\n\27\3\27\3\27\3\27\3\27\5\27\u00f1\n\27\3\30\3\30\3\31\3"+
		"\31\3\31\3\31\7\31\u00f9\n\31\f\31\16\31\u00fc\13\31\3\32\3\32\3\32\3"+
		"\32\7\32\u0102\n\32\f\32\16\32\u0105\13\32\3\33\3\33\3\33\3\33\3\33\5"+
		"\33\u010c\n\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3\37\2\2 \2\4\6"+
		"\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<\2\t\3\2\20\23"+
		"\3\2$%\3\2&*\3\2\35\36\3\2\37!\5\2\16\16\25\26\30\30\3\2+\60\u0115\2>"+
		"\3\2\2\2\4@\3\2\2\2\6E\3\2\2\2\bG\3\2\2\2\nT\3\2\2\2\fW\3\2\2\2\16p\3"+
		"\2\2\2\20r\3\2\2\2\22\u0094\3\2\2\2\24\u0096\3\2\2\2\26\u0099\3\2\2\2"+
		"\30\u00b6\3\2\2\2\32\u00b8\3\2\2\2\34\u00bb\3\2\2\2\36\u00be\3\2\2\2 "+
		"\u00c0\3\2\2\2\"\u00d0\3\2\2\2$\u00d2\3\2\2\2&\u00d4\3\2\2\2(\u00d6\3"+
		"\2\2\2*\u00de\3\2\2\2,\u00f0\3\2\2\2.\u00f2\3\2\2\2\60\u00f4\3\2\2\2\62"+
		"\u00fd\3\2\2\2\64\u010b\3\2\2\2\66\u010d\3\2\2\28\u010f\3\2\2\2:\u0111"+
		"\3\2\2\2<\u0113\3\2\2\2>?\5\4\3\2?\3\3\2\2\2@A\5\6\4\2AB\7\30\2\2BC\5"+
		"\b\5\2CD\5\f\7\2D\5\3\2\2\2EF\t\2\2\2F\7\3\2\2\2GP\7\33\2\2HM\5\n\6\2"+
		"IJ\7\5\2\2JL\5\n\6\2KI\3\2\2\2LO\3\2\2\2MK\3\2\2\2MN\3\2\2\2NQ\3\2\2\2"+
		"OM\3\2\2\2PH\3\2\2\2PQ\3\2\2\2QR\3\2\2\2RS\7\34\2\2S\t\3\2\2\2TU\5\6\4"+
		"\2UV\7\30\2\2V\13\3\2\2\2W[\7\4\2\2XZ\5\16\b\2YX\3\2\2\2Z]\3\2\2\2[Y\3"+
		"\2\2\2[\\\3\2\2\2\\^\3\2\2\2][\3\2\2\2^_\7\n\2\2_\r\3\2\2\2`a\5\22\n\2"+
		"ab\7\13\2\2bq\3\2\2\2cq\5\20\t\2de\5\24\13\2ef\7\13\2\2fq\3\2\2\2gh\5"+
		"\26\f\2hi\7\13\2\2iq\3\2\2\2jk\5\30\r\2kl\7\13\2\2lq\3\2\2\2mn\5\34\17"+
		"\2no\7\13\2\2oq\3\2\2\2p`\3\2\2\2pc\3\2\2\2pd\3\2\2\2pg\3\2\2\2pj\3\2"+
		"\2\2pm\3\2\2\2q\17\3\2\2\2rs\7\7\2\2sv\5&\24\2tw\5\16\b\2uw\5\f\7\2vt"+
		"\3\2\2\2vu\3\2\2\2w\u0081\3\2\2\2xy\7\b\2\2yz\7\7\2\2z}\5&\24\2{~\5\16"+
		"\b\2|~\5\f\7\2}{\3\2\2\2}|\3\2\2\2~\u0080\3\2\2\2\177x\3\2\2\2\u0080\u0083"+
		"\3\2\2\2\u0081\177\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u0089\3\2\2\2\u0083"+
		"\u0081\3\2\2\2\u0084\u0087\7\b\2\2\u0085\u0088\5\16\b\2\u0086\u0088\5"+
		"\f\7\2\u0087\u0085\3\2\2\2\u0087\u0086\3\2\2\2\u0088\u008a\3\2\2\2\u0089"+
		"\u0084\3\2\2\2\u0089\u008a\3\2\2\2\u008a\21\3\2\2\2\u008b\u008c\5\6\4"+
		"\2\u008c\u008d\7\30\2\2\u008d\u0095\3\2\2\2\u008e\u008f\5\6\4\2\u008f"+
		"\u0090\7\30\2\2\u0090\u0091\7\6\2\2\u0091\u0092\7\25\2\2\u0092\u0093\7"+
		"\3\2\2\u0093\u0095\3\2\2\2\u0094\u008b\3\2\2\2\u0094\u008e\3\2\2\2\u0095"+
		"\23\3\2\2\2\u0096\u0097\7\t\2\2\u0097\u0098\5.\30\2\u0098\25\3\2\2\2\u0099"+
		"\u009a\5\32\16\2\u009a\27\3\2\2\2\u009b\u009c\7\30\2\2\u009c\u009d\7\""+
		"\2\2\u009d\u00b7\5\"\22\2\u009e\u009f\5\6\4\2\u009f\u00a0\7\30\2\2\u00a0"+
		"\u00a1\7\"\2\2\u00a1\u00a2\5\"\22\2\u00a2\u00b7\3\2\2\2\u00a3\u00a4\7"+
		"#\2\2\u00a4\u00a5\7\30\2\2\u00a5\u00a6\7\"\2\2\u00a6\u00b7\5\"\22\2\u00a7"+
		"\u00a8\5\6\4\2\u00a8\u00a9\7#\2\2\u00a9\u00aa\7\30\2\2\u00aa\u00ab\7\""+
		"\2\2\u00ab\u00ac\5\"\22\2\u00ac\u00b7\3\2\2\2\u00ad\u00ae\7\30\2\2\u00ae"+
		"\u00af\5$\23\2\u00af\u00b0\5\"\22\2\u00b0\u00b7\3\2\2\2\u00b1\u00b2\7"+
		"#\2\2\u00b2\u00b3\7\30\2\2\u00b3\u00b4\5$\23\2\u00b4\u00b5\5\"\22\2\u00b5"+
		"\u00b7\3\2\2\2\u00b6\u009b\3\2\2\2\u00b6\u009e\3\2\2\2\u00b6\u00a3\3\2"+
		"\2\2\u00b6\u00a7\3\2\2\2\u00b6\u00ad\3\2\2\2\u00b6\u00b1\3\2\2\2\u00b7"+
		"\31\3\2\2\2\u00b8\u00b9\7\30\2\2\u00b9\u00ba\5 \21\2\u00ba\33\3\2\2\2"+
		"\u00bb\u00bc\7\30\2\2\u00bc\u00bd\5\36\20\2\u00bd\35\3\2\2\2\u00be\u00bf"+
		"\t\3\2\2\u00bf\37\3\2\2\2\u00c0\u00c9\7\33\2\2\u00c1\u00c6\5\"\22\2\u00c2"+
		"\u00c3\7\5\2\2\u00c3\u00c5\5\"\22\2\u00c4\u00c2\3\2\2\2\u00c5\u00c8\3"+
		"\2\2\2\u00c6\u00c4\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7\u00ca\3\2\2\2\u00c8"+
		"\u00c6\3\2\2\2\u00c9\u00c1\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00cb\3\2"+
		"\2\2\u00cb\u00cc\7\34\2\2\u00cc!\3\2\2\2\u00cd\u00d1\5.\30\2\u00ce\u00d1"+
		"\7\17\2\2\u00cf\u00d1\7\16\2\2\u00d0\u00cd\3\2\2\2\u00d0\u00ce\3\2\2\2"+
		"\u00d0\u00cf\3\2\2\2\u00d1#\3\2\2\2\u00d2\u00d3\t\4\2\2\u00d3%\3\2\2\2"+
		"\u00d4\u00d5\5(\25\2\u00d5\'\3\2\2\2\u00d6\u00db\5*\26\2\u00d7\u00d8\7"+
		"\31\2\2\u00d8\u00da\5(\25\2\u00d9\u00d7\3\2\2\2\u00da\u00dd\3\2\2\2\u00db"+
		"\u00d9\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc)\3\2\2\2\u00dd\u00db\3\2\2\2"+
		"\u00de\u00e3\5,\27\2\u00df\u00e0\7\32\2\2\u00e0\u00e2\5,\27\2\u00e1\u00df"+
		"\3\2\2\2\u00e2\u00e5\3\2\2\2\u00e3\u00e1\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4"+
		"+\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e6\u00ea\5:\36\2\u00e7\u00e8\5<\37\2"+
		"\u00e8\u00e9\5:\36\2\u00e9\u00eb\3\2\2\2\u00ea\u00e7\3\2\2\2\u00ea\u00eb"+
		"\3\2\2\2\u00eb\u00f1\3\2\2\2\u00ec\u00ed\7\33\2\2\u00ed\u00ee\5(\25\2"+
		"\u00ee\u00ef\7\34\2\2\u00ef\u00f1\3\2\2\2\u00f0\u00e6\3\2\2\2\u00f0\u00ec"+
		"\3\2\2\2\u00f1-\3\2\2\2\u00f2\u00f3\5\60\31\2\u00f3/\3\2\2\2\u00f4\u00fa"+
		"\5\62\32\2\u00f5\u00f6\5\66\34\2\u00f6\u00f7\5\60\31\2\u00f7\u00f9\3\2"+
		"\2\2\u00f8\u00f5\3\2\2\2\u00f9\u00fc\3\2\2\2\u00fa\u00f8\3\2\2\2\u00fa"+
		"\u00fb\3\2\2\2\u00fb\61\3\2\2\2\u00fc\u00fa\3\2\2\2\u00fd\u0103\5\64\33"+
		"\2\u00fe\u00ff\58\35\2\u00ff\u0100\5\64\33\2\u0100\u0102\3\2\2\2\u0101"+
		"\u00fe\3\2\2\2\u0102\u0105\3\2\2\2\u0103\u0101\3\2\2\2\u0103\u0104\3\2"+
		"\2\2\u0104\63\3\2\2\2\u0105\u0103\3\2\2\2\u0106\u010c\5:\36\2\u0107\u0108"+
		"\7\33\2\2\u0108\u0109\5\60\31\2\u0109\u010a\7\34\2\2\u010a\u010c\3\2\2"+
		"\2\u010b\u0106\3\2\2\2\u010b\u0107\3\2\2\2\u010c\65\3\2\2\2\u010d\u010e"+
		"\t\5\2\2\u010e\67\3\2\2\2\u010f\u0110\t\6\2\2\u01109\3\2\2\2\u0111\u0112"+
		"\t\7\2\2\u0112;\3\2\2\2\u0113\u0114\t\b\2\2\u0114=\3\2\2\2\27MP[pv}\u0081"+
		"\u0087\u0089\u0094\u00b6\u00c6\u00c9\u00d0\u00db\u00e3\u00ea\u00f0\u00fa"+
		"\u0103\u010b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}