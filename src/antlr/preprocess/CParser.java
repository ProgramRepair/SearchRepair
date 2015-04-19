// Generated from C.g4 by ANTLR 4.2.2
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
public class CParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__19=1, T__18=2, T__17=3, T__16=4, T__15=5, T__14=6, T__13=7, T__12=8, 
		T__11=9, T__10=10, T__9=11, T__8=12, T__7=13, T__6=14, T__5=15, T__4=16, 
		T__3=17, T__2=18, T__1=19, T__0=20, ID=21, INT=22, WS=23;
	public static final String[] tokenNames = {
		"<INVALID>", "'/'", "'char'", "'return'", "'!='", "'{'", "';'", "'=='", 
		"'='", "'}'", "'for'", "'if'", "'%'", "'int'", "'else'", "'('", "')'", 
		"'*'", "'+'", "','", "'-'", "ID", "INT", "WS"
	};
	public static final int
		RULE_prog = 0, RULE_program = 1, RULE_declaration = 2, RULE_variable = 3, 
		RULE_type = 4, RULE_function = 5, RULE_parameters = 6, RULE_formalParameter = 7, 
		RULE_block = 8, RULE_statement = 9, RULE_returnStat = 10, RULE_ifStat = 11, 
		RULE_forStat = 12, RULE_assignStat = 13, RULE_expr = 14, RULE_condExpr = 15, 
		RULE_aexpr = 16, RULE_mexpr = 17, RULE_addictiveOperator = 18, RULE_multiOperater = 19, 
		RULE_atom = 20;
	public static final String[] ruleNames = {
		"prog", "program", "declaration", "variable", "type", "function", "parameters", 
		"formalParameter", "block", "statement", "returnStat", "ifStat", "forStat", 
		"assignStat", "expr", "condExpr", "aexpr", "mexpr", "addictiveOperator", 
		"multiOperater", "atom"
	};

	@Override
	public String getGrammarFileName() { return "C.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgContext extends ParserRuleContext {
		public FunctionContext function(int i) {
			return getRuleContext(FunctionContext.class,i);
		}
		public List<FunctionContext> function() {
			return getRuleContexts(FunctionContext.class);
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
			setState(43); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(42); function();
				}
				}
				setState(45); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==2 || _la==13 );
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

	public static class ProgramContext extends ParserRuleContext {
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(47); declaration();
				}
				}
				setState(50); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==2 || _la==13 );
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

	public static class DeclarationContext extends ParserRuleContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_declaration);
		try {
			setState(54);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(52); variable();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(53); function();
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

	public static class VariableContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(CParser.ID, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56); type();
			setState(57); match(ID);
			setState(58); match(6);
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
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			_la = _input.LA(1);
			if ( !(_la==2 || _la==13) ) {
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

	public static class FunctionContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(CParser.ID, 0); }
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
		enterRule(_localctx, 10, RULE_function);
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

	public static class ParametersContext extends ParserRuleContext {
		public List<FormalParameterContext> formalParameter() {
			return getRuleContexts(FormalParameterContext.class);
		}
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
		enterRule(_localctx, 12, RULE_parameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67); match(15);
			setState(76);
			_la = _input.LA(1);
			if (_la==2 || _la==13) {
				{
				setState(68); formalParameter();
				setState(73);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==19) {
					{
					{
					setState(69); match(19);
					setState(70); formalParameter();
					}
					}
					setState(75);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(78); match(16);
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
		public TerminalNode ID() { return getToken(CParser.ID, 0); }
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
		enterRule(_localctx, 14, RULE_formalParameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80); type();
			setState(81); match(ID);
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
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_block);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(83); match(5);
			setState(87);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(84); variable();
					}
					} 
				}
				setState(89);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
			setState(93);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 2) | (1L << 3) | (1L << 5) | (1L << 6) | (1L << 10) | (1L << 11) | (1L << 13) | (1L << ID) | (1L << INT))) != 0)) {
				{
				{
				setState(90); statement();
				}
				}
				setState(95);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(96); match(9);
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
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ForStatContext forStat() {
			return getRuleContext(ForStatContext.class,0);
		}
		public IfStatContext ifStat() {
			return getRuleContext(IfStatContext.class,0);
		}
		public ReturnStatContext returnStat() {
			return getRuleContext(ReturnStatContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
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
		enterRule(_localctx, 18, RULE_statement);
		try {
			setState(111);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(98); forStat();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(99); ifStat();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(100); expr(0);
				setState(101); match(6);
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(103); block();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(104); assignStat();
				setState(105); match(6);
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(107); returnStat();
				setState(108); match(6);
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(110); match(6);
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113); match(3);
			setState(114); expr(0);
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

	public static class IfStatContext extends ParserRuleContext {
		public CondExprContext condExpr() {
			return getRuleContext(CondExprContext.class,0);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public IfStatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStat; }
	}

	public final IfStatContext ifStat() throws RecognitionException {
		IfStatContext _localctx = new IfStatContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_ifStat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116); match(11);
			setState(117); match(15);
			setState(118); condExpr();
			setState(119); match(16);
			setState(120); statement();
			setState(123);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(121); match(14);
				setState(122); statement();
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
		public AssignStatContext assignStat(int i) {
			return getRuleContext(AssignStatContext.class,i);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public List<AssignStatContext> assignStat() {
			return getRuleContexts(AssignStatContext.class);
		}
		public ForStatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStat; }
	}

	public final ForStatContext forStat() throws RecognitionException {
		ForStatContext _localctx = new ForStatContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_forStat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125); match(10);
			setState(126); match(15);
			setState(127); assignStat();
			setState(128); match(6);
			setState(129); condExpr();
			setState(130); match(6);
			setState(131); assignStat();
			setState(132); match(16);
			setState(133); block();
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
		public TerminalNode ID() { return getToken(CParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
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
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			_la = _input.LA(1);
			if (_la==2 || _la==13) {
				{
				setState(135); type();
				}
			}

			setState(138); match(ID);
			setState(139); match(8);
			setState(140); expr(0);
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
		public AddictiveOperatorContext addictiveOperator() {
			return getRuleContext(AddictiveOperatorContext.class,0);
		}
		public TerminalNode ID() { return getToken(CParser.ID, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode INT() { return getToken(CParser.INT, 0); }
		public MultiOperaterContext multiOperater() {
			return getRuleContext(MultiOperaterContext.class,0);
		}
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
		int _startState = 28;
		enterRecursionRule(_localctx, 28, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			switch (_input.LA(1)) {
			case ID:
				{
				setState(143); match(ID);
				}
				break;
			case INT:
				{
				setState(144); match(INT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(157);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(155);
					switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(147);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(148); addictiveOperator();
						setState(149); expr(3);
						}
						break;

					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(151);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(152); multiOperater();
						setState(153); expr(2);
						}
						break;
					}
					} 
				}
				setState(159);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
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

	public static class CondExprContext extends ParserRuleContext {
		public List<AexprContext> aexpr() {
			return getRuleContexts(AexprContext.class);
		}
		public AexprContext aexpr(int i) {
			return getRuleContext(AexprContext.class,i);
		}
		public CondExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condExpr; }
	}

	public final CondExprContext condExpr() throws RecognitionException {
		CondExprContext _localctx = new CondExprContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_condExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160); aexpr();
			setState(163);
			_la = _input.LA(1);
			if (_la==4 || _la==7) {
				{
				setState(161);
				_la = _input.LA(1);
				if ( !(_la==4 || _la==7) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(162); aexpr();
				}
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

	public static class AexprContext extends ParserRuleContext {
		public List<MexprContext> mexpr() {
			return getRuleContexts(MexprContext.class);
		}
		public AddictiveOperatorContext addictiveOperator() {
			return getRuleContext(AddictiveOperatorContext.class,0);
		}
		public MexprContext mexpr(int i) {
			return getRuleContext(MexprContext.class,i);
		}
		public AexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aexpr; }
	}

	public final AexprContext aexpr() throws RecognitionException {
		AexprContext _localctx = new AexprContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_aexpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165); mexpr();
			setState(166); addictiveOperator();
			setState(167); mexpr();
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

	public static class MexprContext extends ParserRuleContext {
		public AtomContext atom(int i) {
			return getRuleContext(AtomContext.class,i);
		}
		public MultiOperaterContext multiOperater(int i) {
			return getRuleContext(MultiOperaterContext.class,i);
		}
		public List<AtomContext> atom() {
			return getRuleContexts(AtomContext.class);
		}
		public List<MultiOperaterContext> multiOperater() {
			return getRuleContexts(MultiOperaterContext.class);
		}
		public MexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mexpr; }
	}

	public final MexprContext mexpr() throws RecognitionException {
		MexprContext _localctx = new MexprContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_mexpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169); atom();
			setState(175);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << 12) | (1L << 17))) != 0)) {
				{
				{
				{
				setState(170); multiOperater();
				}
				setState(171); atom();
				}
				}
				setState(177);
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

	public static class AddictiveOperatorContext extends ParserRuleContext {
		public AddictiveOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addictiveOperator; }
	}

	public final AddictiveOperatorContext addictiveOperator() throws RecognitionException {
		AddictiveOperatorContext _localctx = new AddictiveOperatorContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_addictiveOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
			_la = _input.LA(1);
			if ( !(_la==18 || _la==20) ) {
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

	public static class MultiOperaterContext extends ParserRuleContext {
		public MultiOperaterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiOperater; }
	}

	public final MultiOperaterContext multiOperater() throws RecognitionException {
		MultiOperaterContext _localctx = new MultiOperaterContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_multiOperater);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << 12) | (1L << 17))) != 0)) ) {
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
		public TerminalNode ID() { return getToken(CParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode INT() { return getToken(CParser.INT, 0); }
		public AtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atom; }
	}

	public final AtomContext atom() throws RecognitionException {
		AtomContext _localctx = new AtomContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_atom);
		try {
			setState(188);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(182); match(ID);
				}
				break;
			case INT:
				enterOuterAlt(_localctx, 2);
				{
				setState(183); match(INT);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 3);
				{
				setState(184); match(15);
				setState(185); expr(0);
				setState(186); match(16);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 14: return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return precpred(_ctx, 2);

		case 1: return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\31\u00c1\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\6\2.\n\2\r\2\16\2/\3\3\6"+
		"\3\63\n\3\r\3\16\3\64\3\4\3\4\5\49\n\4\3\5\3\5\3\5\3\5\3\6\3\6\3\7\3\7"+
		"\3\7\3\7\3\7\3\b\3\b\3\b\3\b\7\bJ\n\b\f\b\16\bM\13\b\5\bO\n\b\3\b\3\b"+
		"\3\t\3\t\3\t\3\n\3\n\7\nX\n\n\f\n\16\n[\13\n\3\n\7\n^\n\n\f\n\16\na\13"+
		"\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\5\13r\n\13\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r~\n\r\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\5\17\u008b\n\17\3\17"+
		"\3\17\3\17\3\17\3\20\3\20\3\20\5\20\u0094\n\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\7\20\u009e\n\20\f\20\16\20\u00a1\13\20\3\21\3\21\3\21"+
		"\5\21\u00a6\n\21\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\7\23\u00b0\n"+
		"\23\f\23\16\23\u00b3\13\23\3\24\3\24\3\25\3\25\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\5\26\u00bf\n\26\3\26\2\3\36\27\2\4\6\b\n\f\16\20\22\24\26\30\32"+
		"\34\36 \"$&(*\2\6\4\2\4\4\17\17\4\2\6\6\t\t\4\2\24\24\26\26\5\2\3\3\16"+
		"\16\23\23\u00c1\2-\3\2\2\2\4\62\3\2\2\2\68\3\2\2\2\b:\3\2\2\2\n>\3\2\2"+
		"\2\f@\3\2\2\2\16E\3\2\2\2\20R\3\2\2\2\22U\3\2\2\2\24q\3\2\2\2\26s\3\2"+
		"\2\2\30v\3\2\2\2\32\177\3\2\2\2\34\u008a\3\2\2\2\36\u0093\3\2\2\2 \u00a2"+
		"\3\2\2\2\"\u00a7\3\2\2\2$\u00ab\3\2\2\2&\u00b4\3\2\2\2(\u00b6\3\2\2\2"+
		"*\u00be\3\2\2\2,.\5\f\7\2-,\3\2\2\2./\3\2\2\2/-\3\2\2\2/\60\3\2\2\2\60"+
		"\3\3\2\2\2\61\63\5\6\4\2\62\61\3\2\2\2\63\64\3\2\2\2\64\62\3\2\2\2\64"+
		"\65\3\2\2\2\65\5\3\2\2\2\669\5\b\5\2\679\5\f\7\28\66\3\2\2\28\67\3\2\2"+
		"\29\7\3\2\2\2:;\5\n\6\2;<\7\27\2\2<=\7\b\2\2=\t\3\2\2\2>?\t\2\2\2?\13"+
		"\3\2\2\2@A\5\n\6\2AB\7\27\2\2BC\5\16\b\2CD\5\22\n\2D\r\3\2\2\2EN\7\21"+
		"\2\2FK\5\20\t\2GH\7\25\2\2HJ\5\20\t\2IG\3\2\2\2JM\3\2\2\2KI\3\2\2\2KL"+
		"\3\2\2\2LO\3\2\2\2MK\3\2\2\2NF\3\2\2\2NO\3\2\2\2OP\3\2\2\2PQ\7\22\2\2"+
		"Q\17\3\2\2\2RS\5\n\6\2ST\7\27\2\2T\21\3\2\2\2UY\7\7\2\2VX\5\b\5\2WV\3"+
		"\2\2\2X[\3\2\2\2YW\3\2\2\2YZ\3\2\2\2Z_\3\2\2\2[Y\3\2\2\2\\^\5\24\13\2"+
		"]\\\3\2\2\2^a\3\2\2\2_]\3\2\2\2_`\3\2\2\2`b\3\2\2\2a_\3\2\2\2bc\7\13\2"+
		"\2c\23\3\2\2\2dr\5\32\16\2er\5\30\r\2fg\5\36\20\2gh\7\b\2\2hr\3\2\2\2"+
		"ir\5\22\n\2jk\5\34\17\2kl\7\b\2\2lr\3\2\2\2mn\5\26\f\2no\7\b\2\2or\3\2"+
		"\2\2pr\7\b\2\2qd\3\2\2\2qe\3\2\2\2qf\3\2\2\2qi\3\2\2\2qj\3\2\2\2qm\3\2"+
		"\2\2qp\3\2\2\2r\25\3\2\2\2st\7\5\2\2tu\5\36\20\2u\27\3\2\2\2vw\7\r\2\2"+
		"wx\7\21\2\2xy\5 \21\2yz\7\22\2\2z}\5\24\13\2{|\7\20\2\2|~\5\24\13\2}{"+
		"\3\2\2\2}~\3\2\2\2~\31\3\2\2\2\177\u0080\7\f\2\2\u0080\u0081\7\21\2\2"+
		"\u0081\u0082\5\34\17\2\u0082\u0083\7\b\2\2\u0083\u0084\5 \21\2\u0084\u0085"+
		"\7\b\2\2\u0085\u0086\5\34\17\2\u0086\u0087\7\22\2\2\u0087\u0088\5\22\n"+
		"\2\u0088\33\3\2\2\2\u0089\u008b\5\n\6\2\u008a\u0089\3\2\2\2\u008a\u008b"+
		"\3\2\2\2\u008b\u008c\3\2\2\2\u008c\u008d\7\27\2\2\u008d\u008e\7\n\2\2"+
		"\u008e\u008f\5\36\20\2\u008f\35\3\2\2\2\u0090\u0091\b\20\1\2\u0091\u0094"+
		"\7\27\2\2\u0092\u0094\7\30\2\2\u0093\u0090\3\2\2\2\u0093\u0092\3\2\2\2"+
		"\u0094\u009f\3\2\2\2\u0095\u0096\f\4\2\2\u0096\u0097\5&\24\2\u0097\u0098"+
		"\5\36\20\5\u0098\u009e\3\2\2\2\u0099\u009a\f\3\2\2\u009a\u009b\5(\25\2"+
		"\u009b\u009c\5\36\20\4\u009c\u009e\3\2\2\2\u009d\u0095\3\2\2\2\u009d\u0099"+
		"\3\2\2\2\u009e\u00a1\3\2\2\2\u009f\u009d\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0"+
		"\37\3\2\2\2\u00a1\u009f\3\2\2\2\u00a2\u00a5\5\"\22\2\u00a3\u00a4\t\3\2"+
		"\2\u00a4\u00a6\5\"\22\2\u00a5\u00a3\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6"+
		"!\3\2\2\2\u00a7\u00a8\5$\23\2\u00a8\u00a9\5&\24\2\u00a9\u00aa\5$\23\2"+
		"\u00aa#\3\2\2\2\u00ab\u00b1\5*\26\2\u00ac\u00ad\5(\25\2\u00ad\u00ae\5"+
		"*\26\2\u00ae\u00b0\3\2\2\2\u00af\u00ac\3\2\2\2\u00b0\u00b3\3\2\2\2\u00b1"+
		"\u00af\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2%\3\2\2\2\u00b3\u00b1\3\2\2\2"+
		"\u00b4\u00b5\t\4\2\2\u00b5\'\3\2\2\2\u00b6\u00b7\t\5\2\2\u00b7)\3\2\2"+
		"\2\u00b8\u00bf\7\27\2\2\u00b9\u00bf\7\30\2\2\u00ba\u00bb\7\21\2\2\u00bb"+
		"\u00bc\5\36\20\2\u00bc\u00bd\7\22\2\2\u00bd\u00bf\3\2\2\2\u00be\u00b8"+
		"\3\2\2\2\u00be\u00b9\3\2\2\2\u00be\u00ba\3\2\2\2\u00bf+\3\2\2\2\22/\64"+
		"8KNY_q}\u008a\u0093\u009d\u009f\u00a5\u00b1\u00be";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}