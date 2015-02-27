// Generated from IfBlockTest.g4 by ANTLR 4.4
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
public class IfBlockTestParser extends Parser {
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
		RULE_function = 0, RULE_type = 1, RULE_parameters = 2, RULE_formalParameter = 3, 
		RULE_block = 4, RULE_stat = 5, RULE_if_stat = 6, RULE_declarationStat = 7, 
		RULE_returnStat = 8, RULE_callStat = 9, RULE_assignStat = 10, RULE_callExpr = 11, 
		RULE_selfIncreStat = 12, RULE_increOperator = 13, RULE_arguments = 14, 
		RULE_assign_expression = 15, RULE_arithmAssignOperator = 16, RULE_condExpr = 17, 
		RULE_or_expression = 18, RULE_and_expression = 19, RULE_term = 20, RULE_arith_expression = 21, 
		RULE_add_expression = 22, RULE_multi_expression = 23, RULE_expr = 24, 
		RULE_addOperator = 25, RULE_multiOperator = 26, RULE_atom = 27, RULE_operator = 28;
	public static final String[] ruleNames = {
		"function", "type", "parameters", "formalParameter", "block", "stat", 
		"if_stat", "declarationStat", "returnStat", "callStat", "assignStat", 
		"callExpr", "selfIncreStat", "increOperator", "arguments", "assign_expression", 
		"arithmAssignOperator", "condExpr", "or_expression", "and_expression", 
		"term", "arith_expression", "add_expression", "multi_expression", "expr", 
		"addOperator", "multiOperator", "atom", "operator"
	};

	@Override
	public String getGrammarFileName() { return "IfBlockTest.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public IfBlockTestParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class FunctionContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(IfBlockTestParser.ID, 0); }
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
			if ( listener instanceof IfBlockTestListener ) ((IfBlockTestListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IfBlockTestListener ) ((IfBlockTestListener)listener).exitFunction(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_function);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58); type();
			setState(59); match(ID);
			setState(60); parameters();
			setState(61); block();
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
		public TerminalNode String() { return getToken(IfBlockTestParser.String, 0); }
		public TerminalNode Double() { return getToken(IfBlockTestParser.Double, 0); }
		public TerminalNode Char() { return getToken(IfBlockTestParser.Char, 0); }
		public TerminalNode Float() { return getToken(IfBlockTestParser.Float, 0); }
		public TerminalNode Int() { return getToken(IfBlockTestParser.Int, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IfBlockTestListener ) ((IfBlockTestListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IfBlockTestListener ) ((IfBlockTestListener)listener).exitType(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
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

	public static class ParametersContext extends ParserRuleContext {
		public List<FormalParameterContext> formalParameter() {
			return getRuleContexts(FormalParameterContext.class);
		}
		public TerminalNode RPAREN() { return getToken(IfBlockTestParser.RPAREN, 0); }
		public TerminalNode LPAREN() { return getToken(IfBlockTestParser.LPAREN, 0); }
		public FormalParameterContext formalParameter(int i) {
			return getRuleContext(FormalParameterContext.class,i);
		}
		public ParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IfBlockTestListener ) ((IfBlockTestListener)listener).enterParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IfBlockTestListener ) ((IfBlockTestListener)listener).exitParameters(this);
		}
	}

	public final ParametersContext parameters() throws RecognitionException {
		ParametersContext _localctx = new ParametersContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_parameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65); match(LPAREN);
			setState(74);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Int) | (1L << Char) | (1L << Float) | (1L << String) | (1L << Double))) != 0)) {
				{
				setState(66); formalParameter();
				setState(71);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__6) {
					{
					{
					setState(67); match(T__6);
					setState(68); formalParameter();
					}
					}
					setState(73);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(76); match(RPAREN);
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
		public TerminalNode ID() { return getToken(IfBlockTestParser.ID, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public FormalParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IfBlockTestListener ) ((IfBlockTestListener)listener).enterFormalParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IfBlockTestListener ) ((IfBlockTestListener)listener).exitFormalParameter(this);
		}
	}

	public final FormalParameterContext formalParameter() throws RecognitionException {
		FormalParameterContext _localctx = new FormalParameterContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_formalParameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78); type();
			setState(79); match(ID);
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
			if ( listener instanceof IfBlockTestListener ) ((IfBlockTestListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IfBlockTestListener ) ((IfBlockTestListener)listener).exitBlock(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81); match(T__7);
			setState(85);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__2) | (1L << Int) | (1L << Char) | (1L << Float) | (1L << String) | (1L << Double) | (1L << ID) | (1L << POINTER))) != 0)) {
				{
				{
				setState(82); stat();
				}
				}
				setState(87);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(88); match(T__1);
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
			if ( listener instanceof IfBlockTestListener ) ((IfBlockTestListener)listener).enterStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IfBlockTestListener ) ((IfBlockTestListener)listener).exitStat(this);
		}
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_stat);
		try {
			setState(106);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(90); declarationStat();
				setState(91); match(T__0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(93); if_stat();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(94); returnStat();
				setState(95); match(T__0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(97); callStat();
				setState(98); match(T__0);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(100); assignStat();
				setState(101); match(T__0);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(103); selfIncreStat();
				setState(104); match(T__0);
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
			if ( listener instanceof IfBlockTestListener ) ((IfBlockTestListener)listener).enterIf_stat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IfBlockTestListener ) ((IfBlockTestListener)listener).exitIf_stat(this);
		}
	}

	public final If_statContext if_stat() throws RecognitionException {
		If_statContext _localctx = new If_statContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_if_stat);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(108); match(T__4);
			setState(109); condExpr();
			setState(112);
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
				{
				setState(110); stat();
				}
				break;
			case T__7:
				{
				setState(111); block();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(123);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(114); match(T__3);
					setState(115); match(T__4);
					setState(116); condExpr();
					setState(119);
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
						{
						setState(117); stat();
						}
						break;
					case T__7:
						{
						setState(118); block();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					} 
				}
				setState(125);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			setState(131);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(126); match(T__3);
				setState(129);
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
					{
					setState(127); stat();
					}
					break;
				case T__7:
					{
					setState(128); block();
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
		public TerminalNode INT() { return getToken(IfBlockTestParser.INT, 0); }
		public TerminalNode ID() { return getToken(IfBlockTestParser.ID, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public DeclarationStatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarationStat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IfBlockTestListener ) ((IfBlockTestListener)listener).enterDeclarationStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IfBlockTestListener ) ((IfBlockTestListener)listener).exitDeclarationStat(this);
		}
	}

	public final DeclarationStatContext declarationStat() throws RecognitionException {
		DeclarationStatContext _localctx = new DeclarationStatContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_declarationStat);
		try {
			setState(142);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(133); type();
				setState(134); match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(136); type();
				setState(137); match(ID);
				{
				setState(138); match(T__5);
				setState(139); match(INT);
				setState(140); match(T__8);
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
			if ( listener instanceof IfBlockTestListener ) ((IfBlockTestListener)listener).enterReturnStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IfBlockTestListener ) ((IfBlockTestListener)listener).exitReturnStat(this);
		}
	}

	public final ReturnStatContext returnStat() throws RecognitionException {
		ReturnStatContext _localctx = new ReturnStatContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_returnStat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144); match(T__2);
			{
			setState(145); arith_expression();
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
			if ( listener instanceof IfBlockTestListener ) ((IfBlockTestListener)listener).enterCallStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IfBlockTestListener ) ((IfBlockTestListener)listener).exitCallStat(this);
		}
	}

	public final CallStatContext callStat() throws RecognitionException {
		CallStatContext _localctx = new CallStatContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_callStat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147); callExpr();
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
		public TerminalNode POINTER() { return getToken(IfBlockTestParser.POINTER, 0); }
		public Assign_expressionContext assign_expression() {
			return getRuleContext(Assign_expressionContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(IfBlockTestParser.ASSIGN, 0); }
		public TerminalNode ID() { return getToken(IfBlockTestParser.ID, 0); }
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
			if ( listener instanceof IfBlockTestListener ) ((IfBlockTestListener)listener).enterAssignStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IfBlockTestListener ) ((IfBlockTestListener)listener).exitAssignStat(this);
		}
	}

	public final AssignStatContext assignStat() throws RecognitionException {
		AssignStatContext _localctx = new AssignStatContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_assignStat);
		try {
			setState(176);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(149); match(ID);
				setState(150); match(ASSIGN);
				setState(151); assign_expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(152); type();
				setState(153); match(ID);
				setState(154); match(ASSIGN);
				setState(155); assign_expression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(157); match(POINTER);
				setState(158); match(ID);
				setState(159); match(ASSIGN);
				setState(160); assign_expression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(161); type();
				setState(162); match(POINTER);
				setState(163); match(ID);
				setState(164); match(ASSIGN);
				setState(165); assign_expression();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(167); match(ID);
				setState(168); arithmAssignOperator();
				setState(169); assign_expression();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(171); match(POINTER);
				setState(172); match(ID);
				setState(173); arithmAssignOperator();
				setState(174); assign_expression();
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
		public TerminalNode ID() { return getToken(IfBlockTestParser.ID, 0); }
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public CallExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IfBlockTestListener ) ((IfBlockTestListener)listener).enterCallExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IfBlockTestListener ) ((IfBlockTestListener)listener).exitCallExpr(this);
		}
	}

	public final CallExprContext callExpr() throws RecognitionException {
		CallExprContext _localctx = new CallExprContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_callExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178); match(ID);
			setState(179); arguments();
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
		public TerminalNode ID() { return getToken(IfBlockTestParser.ID, 0); }
		public IncreOperatorContext increOperator() {
			return getRuleContext(IncreOperatorContext.class,0);
		}
		public SelfIncreStatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selfIncreStat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IfBlockTestListener ) ((IfBlockTestListener)listener).enterSelfIncreStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IfBlockTestListener ) ((IfBlockTestListener)listener).exitSelfIncreStat(this);
		}
	}

	public final SelfIncreStatContext selfIncreStat() throws RecognitionException {
		SelfIncreStatContext _localctx = new SelfIncreStatContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_selfIncreStat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181); match(ID);
			setState(182); increOperator();
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
		public TerminalNode DECRE() { return getToken(IfBlockTestParser.DECRE, 0); }
		public TerminalNode INCRE() { return getToken(IfBlockTestParser.INCRE, 0); }
		public IncreOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_increOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IfBlockTestListener ) ((IfBlockTestListener)listener).enterIncreOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IfBlockTestListener ) ((IfBlockTestListener)listener).exitIncreOperator(this);
		}
	}

	public final IncreOperatorContext increOperator() throws RecognitionException {
		IncreOperatorContext _localctx = new IncreOperatorContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_increOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
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
		public TerminalNode RPAREN() { return getToken(IfBlockTestParser.RPAREN, 0); }
		public TerminalNode LPAREN() { return getToken(IfBlockTestParser.LPAREN, 0); }
		public ArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IfBlockTestListener ) ((IfBlockTestListener)listener).enterArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IfBlockTestListener ) ((IfBlockTestListener)listener).exitArguments(this);
		}
	}

	public final ArgumentsContext arguments() throws RecognitionException {
		ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186); match(LPAREN);
			setState(195);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CharacterLiteral) | (1L << StringLiteral) | (1L << INT) | (1L << FLOAT) | (1L << ID) | (1L << LPAREN))) != 0)) {
				{
				setState(187); assign_expression();
				setState(192);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__6) {
					{
					{
					setState(188); match(T__6);
					setState(189); assign_expression();
					}
					}
					setState(194);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(197); match(RPAREN);
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
		public TerminalNode CharacterLiteral() { return getToken(IfBlockTestParser.CharacterLiteral, 0); }
		public TerminalNode StringLiteral() { return getToken(IfBlockTestParser.StringLiteral, 0); }
		public Arith_expressionContext arith_expression() {
			return getRuleContext(Arith_expressionContext.class,0);
		}
		public Assign_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IfBlockTestListener ) ((IfBlockTestListener)listener).enterAssign_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IfBlockTestListener ) ((IfBlockTestListener)listener).exitAssign_expression(this);
		}
	}

	public final Assign_expressionContext assign_expression() throws RecognitionException {
		Assign_expressionContext _localctx = new Assign_expressionContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_assign_expression);
		try {
			setState(202);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(199); arith_expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(200); match(StringLiteral);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(201); match(CharacterLiteral);
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
		public TerminalNode DIVIDESELF() { return getToken(IfBlockTestParser.DIVIDESELF, 0); }
		public TerminalNode DEDUCTSELF() { return getToken(IfBlockTestParser.DEDUCTSELF, 0); }
		public TerminalNode MULTISELF() { return getToken(IfBlockTestParser.MULTISELF, 0); }
		public TerminalNode ADDSELF() { return getToken(IfBlockTestParser.ADDSELF, 0); }
		public TerminalNode MODSELF() { return getToken(IfBlockTestParser.MODSELF, 0); }
		public ArithmAssignOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithmAssignOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IfBlockTestListener ) ((IfBlockTestListener)listener).enterArithmAssignOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IfBlockTestListener ) ((IfBlockTestListener)listener).exitArithmAssignOperator(this);
		}
	}

	public final ArithmAssignOperatorContext arithmAssignOperator() throws RecognitionException {
		ArithmAssignOperatorContext _localctx = new ArithmAssignOperatorContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_arithmAssignOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
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
			if ( listener instanceof IfBlockTestListener ) ((IfBlockTestListener)listener).enterCondExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IfBlockTestListener ) ((IfBlockTestListener)listener).exitCondExpr(this);
		}
	}

	public final CondExprContext condExpr() throws RecognitionException {
		CondExprContext _localctx = new CondExprContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_condExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(206); or_expression();
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
		public List<TerminalNode> OR() { return getTokens(IfBlockTestParser.OR); }
		public And_expressionContext and_expression() {
			return getRuleContext(And_expressionContext.class,0);
		}
		public Or_expressionContext or_expression(int i) {
			return getRuleContext(Or_expressionContext.class,i);
		}
		public TerminalNode OR(int i) {
			return getToken(IfBlockTestParser.OR, i);
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
			if ( listener instanceof IfBlockTestListener ) ((IfBlockTestListener)listener).enterOr_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IfBlockTestListener ) ((IfBlockTestListener)listener).exitOr_expression(this);
		}
	}

	public final Or_expressionContext or_expression() throws RecognitionException {
		Or_expressionContext _localctx = new Or_expressionContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_or_expression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(208); and_expression();
			setState(213);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(209); match(OR);
					setState(210); or_expression();
					}
					} 
				}
				setState(215);
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
		public List<TerminalNode> AND() { return getTokens(IfBlockTestParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(IfBlockTestParser.AND, i);
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
			if ( listener instanceof IfBlockTestListener ) ((IfBlockTestListener)listener).enterAnd_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IfBlockTestListener ) ((IfBlockTestListener)listener).exitAnd_expression(this);
		}
	}

	public final And_expressionContext and_expression() throws RecognitionException {
		And_expressionContext _localctx = new And_expressionContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_and_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(216); term();
			setState(221);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND) {
				{
				{
				setState(217); match(AND);
				setState(218); term();
				}
				}
				setState(223);
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
		public TerminalNode RPAREN() { return getToken(IfBlockTestParser.RPAREN, 0); }
		public OperatorContext operator() {
			return getRuleContext(OperatorContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(IfBlockTestParser.LPAREN, 0); }
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
			if ( listener instanceof IfBlockTestListener ) ((IfBlockTestListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IfBlockTestListener ) ((IfBlockTestListener)listener).exitTerm(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_term);
		int _la;
		try {
			setState(234);
			switch (_input.LA(1)) {
			case CharacterLiteral:
			case INT:
			case FLOAT:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(224); atom();
				setState(228);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LT) | (1L << LE) | (1L << GT) | (1L << GE) | (1L << EQ) | (1L << NEQ))) != 0)) {
					{
					setState(225); operator();
					setState(226); atom();
					}
				}

				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 2);
				{
				setState(230); match(LPAREN);
				setState(231); or_expression();
				setState(232); match(RPAREN);
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
			if ( listener instanceof IfBlockTestListener ) ((IfBlockTestListener)listener).enterArith_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IfBlockTestListener ) ((IfBlockTestListener)listener).exitArith_expression(this);
		}
	}

	public final Arith_expressionContext arith_expression() throws RecognitionException {
		Arith_expressionContext _localctx = new Arith_expressionContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_arith_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(236); add_expression();
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
			if ( listener instanceof IfBlockTestListener ) ((IfBlockTestListener)listener).enterAdd_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IfBlockTestListener ) ((IfBlockTestListener)listener).exitAdd_expression(this);
		}
	}

	public final Add_expressionContext add_expression() throws RecognitionException {
		Add_expressionContext _localctx = new Add_expressionContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_add_expression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(238); multi_expression();
			setState(244);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(239); addOperator();
					setState(240); add_expression();
					}
					} 
				}
				setState(246);
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
			if ( listener instanceof IfBlockTestListener ) ((IfBlockTestListener)listener).enterMulti_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IfBlockTestListener ) ((IfBlockTestListener)listener).exitMulti_expression(this);
		}
	}

	public final Multi_expressionContext multi_expression() throws RecognitionException {
		Multi_expressionContext _localctx = new Multi_expressionContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_multi_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(247); expr();
			setState(253);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MULTIPLY) | (1L << DIVIDE) | (1L << MOD))) != 0)) {
				{
				{
				setState(248); multiOperator();
				setState(249); expr();
				}
				}
				setState(255);
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
		public TerminalNode RPAREN() { return getToken(IfBlockTestParser.RPAREN, 0); }
		public TerminalNode LPAREN() { return getToken(IfBlockTestParser.LPAREN, 0); }
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IfBlockTestListener ) ((IfBlockTestListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IfBlockTestListener ) ((IfBlockTestListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_expr);
		try {
			setState(261);
			switch (_input.LA(1)) {
			case CharacterLiteral:
			case INT:
			case FLOAT:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(256); atom();
				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 2);
				{
				setState(257); match(LPAREN);
				setState(258); add_expression();
				setState(259); match(RPAREN);
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
		public TerminalNode DEDUCTIVE() { return getToken(IfBlockTestParser.DEDUCTIVE, 0); }
		public TerminalNode ADDCTIVE() { return getToken(IfBlockTestParser.ADDCTIVE, 0); }
		public AddOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IfBlockTestListener ) ((IfBlockTestListener)listener).enterAddOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IfBlockTestListener ) ((IfBlockTestListener)listener).exitAddOperator(this);
		}
	}

	public final AddOperatorContext addOperator() throws RecognitionException {
		AddOperatorContext _localctx = new AddOperatorContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_addOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(263);
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
		public TerminalNode MULTIPLY() { return getToken(IfBlockTestParser.MULTIPLY, 0); }
		public TerminalNode DIVIDE() { return getToken(IfBlockTestParser.DIVIDE, 0); }
		public TerminalNode MOD() { return getToken(IfBlockTestParser.MOD, 0); }
		public MultiOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IfBlockTestListener ) ((IfBlockTestListener)listener).enterMultiOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IfBlockTestListener ) ((IfBlockTestListener)listener).exitMultiOperator(this);
		}
	}

	public final MultiOperatorContext multiOperator() throws RecognitionException {
		MultiOperatorContext _localctx = new MultiOperatorContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_multiOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(265);
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
		public TerminalNode FLOAT() { return getToken(IfBlockTestParser.FLOAT, 0); }
		public TerminalNode INT() { return getToken(IfBlockTestParser.INT, 0); }
		public TerminalNode CharacterLiteral() { return getToken(IfBlockTestParser.CharacterLiteral, 0); }
		public TerminalNode ID() { return getToken(IfBlockTestParser.ID, 0); }
		public AtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IfBlockTestListener ) ((IfBlockTestListener)listener).enterAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IfBlockTestListener ) ((IfBlockTestListener)listener).exitAtom(this);
		}
	}

	public final AtomContext atom() throws RecognitionException {
		AtomContext _localctx = new AtomContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_atom);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(267);
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
		public TerminalNode NEQ() { return getToken(IfBlockTestParser.NEQ, 0); }
		public TerminalNode LT() { return getToken(IfBlockTestParser.LT, 0); }
		public TerminalNode LE() { return getToken(IfBlockTestParser.LE, 0); }
		public TerminalNode GT() { return getToken(IfBlockTestParser.GT, 0); }
		public TerminalNode GE() { return getToken(IfBlockTestParser.GE, 0); }
		public TerminalNode EQ() { return getToken(IfBlockTestParser.EQ, 0); }
		public OperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IfBlockTestListener ) ((IfBlockTestListener)listener).enterOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IfBlockTestListener ) ((IfBlockTestListener)listener).exitOperator(this);
		}
	}

	public final OperatorContext operator() throws RecognitionException {
		OperatorContext _localctx = new OperatorContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(269);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\61\u0112\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\3\2\3\2\3\2\3\2\3\2"+
		"\3\3\3\3\3\4\3\4\3\4\3\4\7\4H\n\4\f\4\16\4K\13\4\5\4M\n\4\3\4\3\4\3\5"+
		"\3\5\3\5\3\6\3\6\7\6V\n\6\f\6\16\6Y\13\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7m\n\7\3\b\3\b\3\b\3\b\5"+
		"\bs\n\b\3\b\3\b\3\b\3\b\3\b\5\bz\n\b\7\b|\n\b\f\b\16\b\177\13\b\3\b\3"+
		"\b\3\b\5\b\u0084\n\b\5\b\u0086\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\5\t\u0091\n\t\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\5\f\u00b3\n\f\3\r\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\20\3\20\3\20"+
		"\3\20\7\20\u00c1\n\20\f\20\16\20\u00c4\13\20\5\20\u00c6\n\20\3\20\3\20"+
		"\3\21\3\21\3\21\5\21\u00cd\n\21\3\22\3\22\3\23\3\23\3\24\3\24\3\24\7\24"+
		"\u00d6\n\24\f\24\16\24\u00d9\13\24\3\25\3\25\3\25\7\25\u00de\n\25\f\25"+
		"\16\25\u00e1\13\25\3\26\3\26\3\26\3\26\5\26\u00e7\n\26\3\26\3\26\3\26"+
		"\3\26\5\26\u00ed\n\26\3\27\3\27\3\30\3\30\3\30\3\30\7\30\u00f5\n\30\f"+
		"\30\16\30\u00f8\13\30\3\31\3\31\3\31\3\31\7\31\u00fe\n\31\f\31\16\31\u0101"+
		"\13\31\3\32\3\32\3\32\3\32\3\32\5\32\u0108\n\32\3\33\3\33\3\34\3\34\3"+
		"\35\3\35\3\36\3\36\3\36\2\2\37\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36"+
		" \"$&(*,.\60\62\64\668:\2\t\3\2\20\24\3\2$%\3\2&*\3\2\35\36\3\2\37!\5"+
		"\2\16\16\25\26\30\30\3\2+\60\u0112\2<\3\2\2\2\4A\3\2\2\2\6C\3\2\2\2\b"+
		"P\3\2\2\2\nS\3\2\2\2\fl\3\2\2\2\16n\3\2\2\2\20\u0090\3\2\2\2\22\u0092"+
		"\3\2\2\2\24\u0095\3\2\2\2\26\u00b2\3\2\2\2\30\u00b4\3\2\2\2\32\u00b7\3"+
		"\2\2\2\34\u00ba\3\2\2\2\36\u00bc\3\2\2\2 \u00cc\3\2\2\2\"\u00ce\3\2\2"+
		"\2$\u00d0\3\2\2\2&\u00d2\3\2\2\2(\u00da\3\2\2\2*\u00ec\3\2\2\2,\u00ee"+
		"\3\2\2\2.\u00f0\3\2\2\2\60\u00f9\3\2\2\2\62\u0107\3\2\2\2\64\u0109\3\2"+
		"\2\2\66\u010b\3\2\2\28\u010d\3\2\2\2:\u010f\3\2\2\2<=\5\4\3\2=>\7\30\2"+
		"\2>?\5\6\4\2?@\5\n\6\2@\3\3\2\2\2AB\t\2\2\2B\5\3\2\2\2CL\7\33\2\2DI\5"+
		"\b\5\2EF\7\5\2\2FH\5\b\5\2GE\3\2\2\2HK\3\2\2\2IG\3\2\2\2IJ\3\2\2\2JM\3"+
		"\2\2\2KI\3\2\2\2LD\3\2\2\2LM\3\2\2\2MN\3\2\2\2NO\7\34\2\2O\7\3\2\2\2P"+
		"Q\5\4\3\2QR\7\30\2\2R\t\3\2\2\2SW\7\4\2\2TV\5\f\7\2UT\3\2\2\2VY\3\2\2"+
		"\2WU\3\2\2\2WX\3\2\2\2XZ\3\2\2\2YW\3\2\2\2Z[\7\n\2\2[\13\3\2\2\2\\]\5"+
		"\20\t\2]^\7\13\2\2^m\3\2\2\2_m\5\16\b\2`a\5\22\n\2ab\7\13\2\2bm\3\2\2"+
		"\2cd\5\24\13\2de\7\13\2\2em\3\2\2\2fg\5\26\f\2gh\7\13\2\2hm\3\2\2\2ij"+
		"\5\32\16\2jk\7\13\2\2km\3\2\2\2l\\\3\2\2\2l_\3\2\2\2l`\3\2\2\2lc\3\2\2"+
		"\2lf\3\2\2\2li\3\2\2\2m\r\3\2\2\2no\7\7\2\2or\5$\23\2ps\5\f\7\2qs\5\n"+
		"\6\2rp\3\2\2\2rq\3\2\2\2s}\3\2\2\2tu\7\b\2\2uv\7\7\2\2vy\5$\23\2wz\5\f"+
		"\7\2xz\5\n\6\2yw\3\2\2\2yx\3\2\2\2z|\3\2\2\2{t\3\2\2\2|\177\3\2\2\2}{"+
		"\3\2\2\2}~\3\2\2\2~\u0085\3\2\2\2\177}\3\2\2\2\u0080\u0083\7\b\2\2\u0081"+
		"\u0084\5\f\7\2\u0082\u0084\5\n\6\2\u0083\u0081\3\2\2\2\u0083\u0082\3\2"+
		"\2\2\u0084\u0086\3\2\2\2\u0085\u0080\3\2\2\2\u0085\u0086\3\2\2\2\u0086"+
		"\17\3\2\2\2\u0087\u0088\5\4\3\2\u0088\u0089\7\30\2\2\u0089\u0091\3\2\2"+
		"\2\u008a\u008b\5\4\3\2\u008b\u008c\7\30\2\2\u008c\u008d\7\6\2\2\u008d"+
		"\u008e\7\25\2\2\u008e\u008f\7\3\2\2\u008f\u0091\3\2\2\2\u0090\u0087\3"+
		"\2\2\2\u0090\u008a\3\2\2\2\u0091\21\3\2\2\2\u0092\u0093\7\t\2\2\u0093"+
		"\u0094\5,\27\2\u0094\23\3\2\2\2\u0095\u0096\5\30\r\2\u0096\25\3\2\2\2"+
		"\u0097\u0098\7\30\2\2\u0098\u0099\7\"\2\2\u0099\u00b3\5 \21\2\u009a\u009b"+
		"\5\4\3\2\u009b\u009c\7\30\2\2\u009c\u009d\7\"\2\2\u009d\u009e\5 \21\2"+
		"\u009e\u00b3\3\2\2\2\u009f\u00a0\7#\2\2\u00a0\u00a1\7\30\2\2\u00a1\u00a2"+
		"\7\"\2\2\u00a2\u00b3\5 \21\2\u00a3\u00a4\5\4\3\2\u00a4\u00a5\7#\2\2\u00a5"+
		"\u00a6\7\30\2\2\u00a6\u00a7\7\"\2\2\u00a7\u00a8\5 \21\2\u00a8\u00b3\3"+
		"\2\2\2\u00a9\u00aa\7\30\2\2\u00aa\u00ab\5\"\22\2\u00ab\u00ac\5 \21\2\u00ac"+
		"\u00b3\3\2\2\2\u00ad\u00ae\7#\2\2\u00ae\u00af\7\30\2\2\u00af\u00b0\5\""+
		"\22\2\u00b0\u00b1\5 \21\2\u00b1\u00b3\3\2\2\2\u00b2\u0097\3\2\2\2\u00b2"+
		"\u009a\3\2\2\2\u00b2\u009f\3\2\2\2\u00b2\u00a3\3\2\2\2\u00b2\u00a9\3\2"+
		"\2\2\u00b2\u00ad\3\2\2\2\u00b3\27\3\2\2\2\u00b4\u00b5\7\30\2\2\u00b5\u00b6"+
		"\5\36\20\2\u00b6\31\3\2\2\2\u00b7\u00b8\7\30\2\2\u00b8\u00b9\5\34\17\2"+
		"\u00b9\33\3\2\2\2\u00ba\u00bb\t\3\2\2\u00bb\35\3\2\2\2\u00bc\u00c5\7\33"+
		"\2\2\u00bd\u00c2\5 \21\2\u00be\u00bf\7\5\2\2\u00bf\u00c1\5 \21\2\u00c0"+
		"\u00be\3\2\2\2\u00c1\u00c4\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c2\u00c3\3\2"+
		"\2\2\u00c3\u00c6\3\2\2\2\u00c4\u00c2\3\2\2\2\u00c5\u00bd\3\2\2\2\u00c5"+
		"\u00c6\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7\u00c8\7\34\2\2\u00c8\37\3\2\2"+
		"\2\u00c9\u00cd\5,\27\2\u00ca\u00cd\7\17\2\2\u00cb\u00cd\7\16\2\2\u00cc"+
		"\u00c9\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cc\u00cb\3\2\2\2\u00cd!\3\2\2\2"+
		"\u00ce\u00cf\t\4\2\2\u00cf#\3\2\2\2\u00d0\u00d1\5&\24\2\u00d1%\3\2\2\2"+
		"\u00d2\u00d7\5(\25\2\u00d3\u00d4\7\31\2\2\u00d4\u00d6\5&\24\2\u00d5\u00d3"+
		"\3\2\2\2\u00d6\u00d9\3\2\2\2\u00d7\u00d5\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8"+
		"\'\3\2\2\2\u00d9\u00d7\3\2\2\2\u00da\u00df\5*\26\2\u00db\u00dc\7\32\2"+
		"\2\u00dc\u00de\5*\26\2\u00dd\u00db\3\2\2\2\u00de\u00e1\3\2\2\2\u00df\u00dd"+
		"\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0)\3\2\2\2\u00e1\u00df\3\2\2\2\u00e2"+
		"\u00e6\58\35\2\u00e3\u00e4\5:\36\2\u00e4\u00e5\58\35\2\u00e5\u00e7\3\2"+
		"\2\2\u00e6\u00e3\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7\u00ed\3\2\2\2\u00e8"+
		"\u00e9\7\33\2\2\u00e9\u00ea\5&\24\2\u00ea\u00eb\7\34\2\2\u00eb\u00ed\3"+
		"\2\2\2\u00ec\u00e2\3\2\2\2\u00ec\u00e8\3\2\2\2\u00ed+\3\2\2\2\u00ee\u00ef"+
		"\5.\30\2\u00ef-\3\2\2\2\u00f0\u00f6\5\60\31\2\u00f1\u00f2\5\64\33\2\u00f2"+
		"\u00f3\5.\30\2\u00f3\u00f5\3\2\2\2\u00f4\u00f1\3\2\2\2\u00f5\u00f8\3\2"+
		"\2\2\u00f6\u00f4\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7/\3\2\2\2\u00f8\u00f6"+
		"\3\2\2\2\u00f9\u00ff\5\62\32\2\u00fa\u00fb\5\66\34\2\u00fb\u00fc\5\62"+
		"\32\2\u00fc\u00fe\3\2\2\2\u00fd\u00fa\3\2\2\2\u00fe\u0101\3\2\2\2\u00ff"+
		"\u00fd\3\2\2\2\u00ff\u0100\3\2\2\2\u0100\61\3\2\2\2\u0101\u00ff\3\2\2"+
		"\2\u0102\u0108\58\35\2\u0103\u0104\7\33\2\2\u0104\u0105\5.\30\2\u0105"+
		"\u0106\7\34\2\2\u0106\u0108\3\2\2\2\u0107\u0102\3\2\2\2\u0107\u0103\3"+
		"\2\2\2\u0108\63\3\2\2\2\u0109\u010a\t\5\2\2\u010a\65\3\2\2\2\u010b\u010c"+
		"\t\6\2\2\u010c\67\3\2\2\2\u010d\u010e\t\7\2\2\u010e9\3\2\2\2\u010f\u0110"+
		"\t\b\2\2\u0110;\3\2\2\2\27ILWlry}\u0083\u0085\u0090\u00b2\u00c2\u00c5"+
		"\u00cc\u00d7\u00df\u00e6\u00ec\u00f6\u00ff\u0107";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}