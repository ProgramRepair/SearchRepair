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
		T__10=1, T__9=2, T__8=3, T__7=4, T__6=5, T__5=6, T__4=7, T__3=8, T__2=9, 
		T__1=10, T__0=11, ASSIGN=12, POINTER=13, ADDCTIVE=14, DEDUCTIVE=15, MULTIPLY=16, 
		DIVIDE=17, MOD=18, INCRE=19, DECRE=20, ADDSELF=21, DEDUCTSELF=22, MODSELF=23, 
		MULTISELF=24, DIVIDESELF=25, Int=26, Char=27, Float=28, String=29, Double=30, 
		ID=31, INT=32, FLOAT=33, OR=34, AND=35, LPAREN=36, RPAREN=37, LT=38, LE=39, 
		GT=40, GE=41, EQ=42, NEQ=43, WS=44, BlockComment=45, LineComment=46, CharacterLiteral=47, 
		StringLiteral=48, EscapeSequence=49;
	public static final String[] tokenNames = {
		"<INVALID>", "']'", "'&'", "','", "'['", "'if'", "'return'", "'else if'", 
		"';'", "'{'", "'else'", "'}'", "'='", "POINTER", "'+'", "'-'", "MULTIPLY", 
		"'/'", "'%'", "'++'", "'--'", "'+='", "'-='", "'%='", "'*='", "'/='", 
		"'int'", "'char'", "'float'", "'char*'", "'double'", "ID", "INT", "FLOAT", 
		"'||'", "'&&'", "'('", "')'", "'<'", "'<='", "'>'", "'>='", "'=='", "'!='", 
		"WS", "BlockComment", "LineComment", "CharacterLiteral", "StringLiteral", 
		"EscapeSequence"
	};
	public static final int
		RULE_function = 0, RULE_type = 1, RULE_parameters = 2, RULE_formalParameter = 3, 
		RULE_block = 4, RULE_statement = 5, RULE_selfIncreStat = 6, RULE_increOperator = 7, 
		RULE_ifBlock = 8, RULE_ifPart = 9, RULE_elseifPart = 10, RULE_elsePart = 11, 
		RULE_declarationStat = 12, RULE_assignStat = 13, RULE_assign_expression = 14, 
		RULE_arithmAssignOperator = 15, RULE_returnStat = 16, RULE_callStat = 17, 
		RULE_addressExpr = 18, RULE_defExpr = 19, RULE_callExpr = 20, RULE_arguments = 21, 
		RULE_arith_expression = 22, RULE_add_expression = 23, RULE_multi_expression = 24, 
		RULE_expr = 25, RULE_addOperator = 26, RULE_multiOperator = 27, RULE_condExpr = 28, 
		RULE_or_expression = 29, RULE_and_expression = 30, RULE_term = 31, RULE_atom = 32, 
		RULE_condOperator = 33;
	public static final String[] ruleNames = {
		"function", "type", "parameters", "formalParameter", "block", "statement", 
		"selfIncreStat", "increOperator", "ifBlock", "ifPart", "elseifPart", "elsePart", 
		"declarationStat", "assignStat", "assign_expression", "arithmAssignOperator", 
		"returnStat", "callStat", "addressExpr", "defExpr", "callExpr", "arguments", 
		"arith_expression", "add_expression", "multi_expression", "expr", "addOperator", 
		"multiOperator", "condExpr", "or_expression", "and_expression", "term", 
		"atom", "condOperator"
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
		enterRule(_localctx, 0, RULE_function);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68); type();
			setState(69); match(ID);
			setState(70); parameters();
			setState(71); block();
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
		public TerminalNode Double() { return getToken(FunctionParser.Double, 0); }
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
		enterRule(_localctx, 2, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
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
		enterRule(_localctx, 4, RULE_parameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75); match(LPAREN);
			setState(84);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Int) | (1L << Char) | (1L << Float) | (1L << String) | (1L << Double))) != 0)) {
				{
				setState(76); formalParameter();
				setState(81);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__8) {
					{
					{
					setState(77); match(T__8);
					setState(78); formalParameter();
					}
					}
					setState(83);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(86); match(RPAREN);
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
		enterRule(_localctx, 6, RULE_formalParameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88); type();
			setState(89); match(ID);
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
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
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
		enterRule(_localctx, 8, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91); match(T__2);
			setState(95);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__5) | (1L << POINTER) | (1L << Int) | (1L << Char) | (1L << Float) | (1L << String) | (1L << Double) | (1L << ID))) != 0)) {
				{
				{
				setState(92); statement();
				}
				}
				setState(97);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(98); match(T__0);
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
		public IfBlockContext ifBlock() {
			return getRuleContext(IfBlockContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_statement);
		try {
			setState(116);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(100); declarationStat();
				setState(101); match(T__3);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(103); assignStat();
				setState(104); match(T__3);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(106); returnStat();
				setState(107); match(T__3);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(109); callStat();
				setState(110); match(T__3);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(112); ifBlock();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(113); selfIncreStat();
				setState(114); match(T__3);
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
		enterRule(_localctx, 12, RULE_selfIncreStat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118); match(ID);
			setState(119); increOperator();
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
		enterRule(_localctx, 14, RULE_increOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
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

	public static class IfBlockContext extends ParserRuleContext {
		public IfPartContext ifPart() {
			return getRuleContext(IfPartContext.class,0);
		}
		public ElsePartContext elsePart() {
			return getRuleContext(ElsePartContext.class,0);
		}
		public List<ElseifPartContext> elseifPart() {
			return getRuleContexts(ElseifPartContext.class);
		}
		public ElseifPartContext elseifPart(int i) {
			return getRuleContext(ElseifPartContext.class,i);
		}
		public IfBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterIfBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitIfBlock(this);
		}
	}

	public final IfBlockContext ifBlock() throws RecognitionException {
		IfBlockContext _localctx = new IfBlockContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_ifBlock);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(123); ifPart();
			setState(127);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(124); elseifPart();
					}
					} 
				}
				setState(129);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			setState(131);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(130); elsePart();
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

	public static class IfPartContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public CondExprContext condExpr() {
			return getRuleContext(CondExprContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public IfPartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifPart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterIfPart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitIfPart(this);
		}
	}

	public final IfPartContext ifPart() throws RecognitionException {
		IfPartContext _localctx = new IfPartContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_ifPart);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133); match(T__6);
			setState(134); match(LPAREN);
			setState(135); condExpr();
			setState(136); match(RPAREN);
			setState(139);
			switch (_input.LA(1)) {
			case T__6:
			case T__5:
			case POINTER:
			case Int:
			case Char:
			case Float:
			case String:
			case Double:
			case ID:
				{
				setState(137); statement();
				}
				break;
			case T__2:
				{
				setState(138); block();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class ElseifPartContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public CondExprContext condExpr() {
			return getRuleContext(CondExprContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ElseifPartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseifPart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterElseifPart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitElseifPart(this);
		}
	}

	public final ElseifPartContext elseifPart() throws RecognitionException {
		ElseifPartContext _localctx = new ElseifPartContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_elseifPart);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141); match(T__4);
			setState(142); match(LPAREN);
			setState(143); condExpr();
			setState(144); match(RPAREN);
			setState(147);
			switch (_input.LA(1)) {
			case T__6:
			case T__5:
			case POINTER:
			case Int:
			case Char:
			case Float:
			case String:
			case Double:
			case ID:
				{
				setState(145); statement();
				}
				break;
			case T__2:
				{
				setState(146); block();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class ElsePartContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ElsePartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elsePart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterElsePart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitElsePart(this);
		}
	}

	public final ElsePartContext elsePart() throws RecognitionException {
		ElsePartContext _localctx = new ElsePartContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_elsePart);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149); match(T__1);
			setState(152);
			switch (_input.LA(1)) {
			case T__6:
			case T__5:
			case POINTER:
			case Int:
			case Char:
			case Float:
			case String:
			case Double:
			case ID:
				{
				setState(150); statement();
				}
				break;
			case T__2:
				{
				setState(151); block();
				}
				break;
			default:
				throw new NoViableAltException(this);
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
		enterRule(_localctx, 24, RULE_declarationStat);
		try {
			setState(165);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(154); type();
				setState(155); match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(157); type();
				setState(158); match(ID);
				{
				setState(159); match(T__7);
				setState(160); match(INT);
				setState(161); match(T__10);
				}
				setState(163); match(T__3);
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
		enterRule(_localctx, 26, RULE_assignStat);
		try {
			setState(194);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(167); match(ID);
				setState(168); match(ASSIGN);
				setState(169); assign_expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(170); type();
				setState(171); match(ID);
				setState(172); match(ASSIGN);
				setState(173); assign_expression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(175); match(POINTER);
				setState(176); match(ID);
				setState(177); match(ASSIGN);
				setState(178); assign_expression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(179); type();
				setState(180); match(POINTER);
				setState(181); match(ID);
				setState(182); match(ASSIGN);
				setState(183); assign_expression();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(185); match(ID);
				setState(186); arithmAssignOperator();
				setState(187); assign_expression();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(189); match(POINTER);
				setState(190); match(ID);
				setState(191); arithmAssignOperator();
				setState(192); assign_expression();
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
		enterRule(_localctx, 28, RULE_assign_expression);
		try {
			setState(199);
			switch (_input.LA(1)) {
			case ID:
			case INT:
			case FLOAT:
			case LPAREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(196); arith_expression();
				}
				break;
			case StringLiteral:
				enterOuterAlt(_localctx, 2);
				{
				setState(197); match(StringLiteral);
				}
				break;
			case CharacterLiteral:
				enterOuterAlt(_localctx, 3);
				{
				setState(198); match(CharacterLiteral);
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
		enterRule(_localctx, 30, RULE_arithmAssignOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
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
		enterRule(_localctx, 32, RULE_returnStat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(203); match(T__5);
			{
			setState(204); arith_expression();
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
		enterRule(_localctx, 34, RULE_callStat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(206); callExpr();
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
		public TerminalNode ID() { return getToken(FunctionParser.ID, 0); }
		public AddressExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addressExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterAddressExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitAddressExpr(this);
		}
	}

	public final AddressExprContext addressExpr() throws RecognitionException {
		AddressExprContext _localctx = new AddressExprContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_addressExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(208); match(T__9);
			setState(209); match(ID);
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
		public TerminalNode POINTER() { return getToken(FunctionParser.POINTER, 0); }
		public TerminalNode ID() { return getToken(FunctionParser.ID, 0); }
		public DefExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterDefExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitDefExpr(this);
		}
	}

	public final DefExprContext defExpr() throws RecognitionException {
		DefExprContext _localctx = new DefExprContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_defExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(211); match(POINTER);
			setState(212); match(ID);
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
		enterRule(_localctx, 40, RULE_callExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(214); match(ID);
			setState(215); arguments();
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
		enterRule(_localctx, 42, RULE_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(217); match(LPAREN);
			setState(226);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ID) | (1L << INT) | (1L << FLOAT) | (1L << LPAREN) | (1L << CharacterLiteral) | (1L << StringLiteral))) != 0)) {
				{
				setState(218); assign_expression();
				setState(223);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__8) {
					{
					{
					setState(219); match(T__8);
					setState(220); assign_expression();
					}
					}
					setState(225);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(228); match(RPAREN);
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
			setState(230); add_expression();
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
			setState(232); multi_expression();
			setState(238);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(233); addOperator();
					setState(234); add_expression();
					}
					} 
				}
				setState(240);
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
			setState(241); expr();
			setState(247);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MULTIPLY) | (1L << DIVIDE) | (1L << MOD))) != 0)) {
				{
				{
				setState(242); multiOperator();
				setState(243); expr();
				}
				}
				setState(249);
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
			setState(255);
			switch (_input.LA(1)) {
			case ID:
			case INT:
			case FLOAT:
				enterOuterAlt(_localctx, 1);
				{
				setState(250); atom();
				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 2);
				{
				setState(251); match(LPAREN);
				setState(252); add_expression();
				setState(253); match(RPAREN);
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
			setState(257);
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
			setState(259);
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
		enterRule(_localctx, 56, RULE_condExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(261); or_expression();
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
		enterRule(_localctx, 58, RULE_or_expression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(263); and_expression();
			setState(268);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(264); match(OR);
					setState(265); or_expression();
					}
					} 
				}
				setState(270);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
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
		enterRule(_localctx, 60, RULE_and_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(271); term();
			setState(276);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND) {
				{
				{
				setState(272); match(AND);
				setState(273); term();
				}
				}
				setState(278);
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
		public CondOperatorContext condOperator() {
			return getRuleContext(CondOperatorContext.class,0);
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
		enterRule(_localctx, 62, RULE_term);
		int _la;
		try {
			setState(289);
			switch (_input.LA(1)) {
			case ID:
			case INT:
			case FLOAT:
				enterOuterAlt(_localctx, 1);
				{
				setState(279); atom();
				setState(283);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LT) | (1L << LE) | (1L << GT) | (1L << GE) | (1L << EQ) | (1L << NEQ))) != 0)) {
					{
					setState(280); condOperator();
					setState(281); atom();
					}
				}

				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 2);
				{
				setState(285); match(LPAREN);
				setState(286); or_expression();
				setState(287); match(RPAREN);
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

	public static class AtomContext extends ParserRuleContext {
		public TerminalNode FLOAT() { return getToken(FunctionParser.FLOAT, 0); }
		public TerminalNode INT() { return getToken(FunctionParser.INT, 0); }
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
		enterRule(_localctx, 64, RULE_atom);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(291);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ID) | (1L << INT) | (1L << FLOAT))) != 0)) ) {
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

	public static class CondOperatorContext extends ParserRuleContext {
		public TerminalNode NEQ() { return getToken(FunctionParser.NEQ, 0); }
		public TerminalNode LT() { return getToken(FunctionParser.LT, 0); }
		public TerminalNode LE() { return getToken(FunctionParser.LE, 0); }
		public TerminalNode GT() { return getToken(FunctionParser.GT, 0); }
		public TerminalNode GE() { return getToken(FunctionParser.GE, 0); }
		public TerminalNode EQ() { return getToken(FunctionParser.EQ, 0); }
		public CondOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterCondOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitCondOperator(this);
		}
	}

	public final CondOperatorContext condOperator() throws RecognitionException {
		CondOperatorContext _localctx = new CondOperatorContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_condOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(293);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\63\u012a\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\7\4R\n\4"+
		"\f\4\16\4U\13\4\5\4W\n\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\7\6`\n\6\f\6\16\6"+
		"c\13\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\5\7w\n\7\3\b\3\b\3\b\3\t\3\t\3\n\3\n\7\n\u0080\n\n\f\n\16\n\u0083"+
		"\13\n\3\n\5\n\u0086\n\n\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u008e\n\13"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u0096\n\f\3\r\3\r\3\r\5\r\u009b\n\r\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u00a8\n\16\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00c5"+
		"\n\17\3\20\3\20\3\20\5\20\u00ca\n\20\3\21\3\21\3\22\3\22\3\22\3\23\3\23"+
		"\3\24\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\27\3\27\7\27"+
		"\u00e0\n\27\f\27\16\27\u00e3\13\27\5\27\u00e5\n\27\3\27\3\27\3\30\3\30"+
		"\3\31\3\31\3\31\3\31\7\31\u00ef\n\31\f\31\16\31\u00f2\13\31\3\32\3\32"+
		"\3\32\3\32\7\32\u00f8\n\32\f\32\16\32\u00fb\13\32\3\33\3\33\3\33\3\33"+
		"\3\33\5\33\u0102\n\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3\37\7\37"+
		"\u010d\n\37\f\37\16\37\u0110\13\37\3 \3 \3 \7 \u0115\n \f \16 \u0118\13"+
		" \3!\3!\3!\3!\5!\u011e\n!\3!\3!\3!\3!\5!\u0124\n!\3\"\3\"\3#\3#\3#\2\2"+
		"$\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BD\2"+
		"\t\3\2\34 \3\2\25\26\3\2\27\33\3\2\20\21\3\2\22\24\3\2!#\3\2(-\u0125\2"+
		"F\3\2\2\2\4K\3\2\2\2\6M\3\2\2\2\bZ\3\2\2\2\n]\3\2\2\2\fv\3\2\2\2\16x\3"+
		"\2\2\2\20{\3\2\2\2\22}\3\2\2\2\24\u0087\3\2\2\2\26\u008f\3\2\2\2\30\u0097"+
		"\3\2\2\2\32\u00a7\3\2\2\2\34\u00c4\3\2\2\2\36\u00c9\3\2\2\2 \u00cb\3\2"+
		"\2\2\"\u00cd\3\2\2\2$\u00d0\3\2\2\2&\u00d2\3\2\2\2(\u00d5\3\2\2\2*\u00d8"+
		"\3\2\2\2,\u00db\3\2\2\2.\u00e8\3\2\2\2\60\u00ea\3\2\2\2\62\u00f3\3\2\2"+
		"\2\64\u0101\3\2\2\2\66\u0103\3\2\2\28\u0105\3\2\2\2:\u0107\3\2\2\2<\u0109"+
		"\3\2\2\2>\u0111\3\2\2\2@\u0123\3\2\2\2B\u0125\3\2\2\2D\u0127\3\2\2\2F"+
		"G\5\4\3\2GH\7!\2\2HI\5\6\4\2IJ\5\n\6\2J\3\3\2\2\2KL\t\2\2\2L\5\3\2\2\2"+
		"MV\7&\2\2NS\5\b\5\2OP\7\5\2\2PR\5\b\5\2QO\3\2\2\2RU\3\2\2\2SQ\3\2\2\2"+
		"ST\3\2\2\2TW\3\2\2\2US\3\2\2\2VN\3\2\2\2VW\3\2\2\2WX\3\2\2\2XY\7\'\2\2"+
		"Y\7\3\2\2\2Z[\5\4\3\2[\\\7!\2\2\\\t\3\2\2\2]a\7\13\2\2^`\5\f\7\2_^\3\2"+
		"\2\2`c\3\2\2\2a_\3\2\2\2ab\3\2\2\2bd\3\2\2\2ca\3\2\2\2de\7\r\2\2e\13\3"+
		"\2\2\2fg\5\32\16\2gh\7\n\2\2hw\3\2\2\2ij\5\34\17\2jk\7\n\2\2kw\3\2\2\2"+
		"lm\5\"\22\2mn\7\n\2\2nw\3\2\2\2op\5$\23\2pq\7\n\2\2qw\3\2\2\2rw\5\22\n"+
		"\2st\5\16\b\2tu\7\n\2\2uw\3\2\2\2vf\3\2\2\2vi\3\2\2\2vl\3\2\2\2vo\3\2"+
		"\2\2vr\3\2\2\2vs\3\2\2\2w\r\3\2\2\2xy\7!\2\2yz\5\20\t\2z\17\3\2\2\2{|"+
		"\t\3\2\2|\21\3\2\2\2}\u0081\5\24\13\2~\u0080\5\26\f\2\177~\3\2\2\2\u0080"+
		"\u0083\3\2\2\2\u0081\177\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u0085\3\2\2"+
		"\2\u0083\u0081\3\2\2\2\u0084\u0086\5\30\r\2\u0085\u0084\3\2\2\2\u0085"+
		"\u0086\3\2\2\2\u0086\23\3\2\2\2\u0087\u0088\7\7\2\2\u0088\u0089\7&\2\2"+
		"\u0089\u008a\5:\36\2\u008a\u008d\7\'\2\2\u008b\u008e\5\f\7\2\u008c\u008e"+
		"\5\n\6\2\u008d\u008b\3\2\2\2\u008d\u008c\3\2\2\2\u008e\25\3\2\2\2\u008f"+
		"\u0090\7\t\2\2\u0090\u0091\7&\2\2\u0091\u0092\5:\36\2\u0092\u0095\7\'"+
		"\2\2\u0093\u0096\5\f\7\2\u0094\u0096\5\n\6\2\u0095\u0093\3\2\2\2\u0095"+
		"\u0094\3\2\2\2\u0096\27\3\2\2\2\u0097\u009a\7\f\2\2\u0098\u009b\5\f\7"+
		"\2\u0099\u009b\5\n\6\2\u009a\u0098\3\2\2\2\u009a\u0099\3\2\2\2\u009b\31"+
		"\3\2\2\2\u009c\u009d\5\4\3\2\u009d\u009e\7!\2\2\u009e\u00a8\3\2\2\2\u009f"+
		"\u00a0\5\4\3\2\u00a0\u00a1\7!\2\2\u00a1\u00a2\7\6\2\2\u00a2\u00a3\7\""+
		"\2\2\u00a3\u00a4\7\3\2\2\u00a4\u00a5\3\2\2\2\u00a5\u00a6\7\n\2\2\u00a6"+
		"\u00a8\3\2\2\2\u00a7\u009c\3\2\2\2\u00a7\u009f\3\2\2\2\u00a8\33\3\2\2"+
		"\2\u00a9\u00aa\7!\2\2\u00aa\u00ab\7\16\2\2\u00ab\u00c5\5\36\20\2\u00ac"+
		"\u00ad\5\4\3\2\u00ad\u00ae\7!\2\2\u00ae\u00af\7\16\2\2\u00af\u00b0\5\36"+
		"\20\2\u00b0\u00c5\3\2\2\2\u00b1\u00b2\7\17\2\2\u00b2\u00b3\7!\2\2\u00b3"+
		"\u00b4\7\16\2\2\u00b4\u00c5\5\36\20\2\u00b5\u00b6\5\4\3\2\u00b6\u00b7"+
		"\7\17\2\2\u00b7\u00b8\7!\2\2\u00b8\u00b9\7\16\2\2\u00b9\u00ba\5\36\20"+
		"\2\u00ba\u00c5\3\2\2\2\u00bb\u00bc\7!\2\2\u00bc\u00bd\5 \21\2\u00bd\u00be"+
		"\5\36\20\2\u00be\u00c5\3\2\2\2\u00bf\u00c0\7\17\2\2\u00c0\u00c1\7!\2\2"+
		"\u00c1\u00c2\5 \21\2\u00c2\u00c3\5\36\20\2\u00c3\u00c5\3\2\2\2\u00c4\u00a9"+
		"\3\2\2\2\u00c4\u00ac\3\2\2\2\u00c4\u00b1\3\2\2\2\u00c4\u00b5\3\2\2\2\u00c4"+
		"\u00bb\3\2\2\2\u00c4\u00bf\3\2\2\2\u00c5\35\3\2\2\2\u00c6\u00ca\5.\30"+
		"\2\u00c7\u00ca\7\62\2\2\u00c8\u00ca\7\61\2\2\u00c9\u00c6\3\2\2\2\u00c9"+
		"\u00c7\3\2\2\2\u00c9\u00c8\3\2\2\2\u00ca\37\3\2\2\2\u00cb\u00cc\t\4\2"+
		"\2\u00cc!\3\2\2\2\u00cd\u00ce\7\b\2\2\u00ce\u00cf\5.\30\2\u00cf#\3\2\2"+
		"\2\u00d0\u00d1\5*\26\2\u00d1%\3\2\2\2\u00d2\u00d3\7\4\2\2\u00d3\u00d4"+
		"\7!\2\2\u00d4\'\3\2\2\2\u00d5\u00d6\7\17\2\2\u00d6\u00d7\7!\2\2\u00d7"+
		")\3\2\2\2\u00d8\u00d9\7!\2\2\u00d9\u00da\5,\27\2\u00da+\3\2\2\2\u00db"+
		"\u00e4\7&\2\2\u00dc\u00e1\5\36\20\2\u00dd\u00de\7\5\2\2\u00de\u00e0\5"+
		"\36\20\2\u00df\u00dd\3\2\2\2\u00e0\u00e3\3\2\2\2\u00e1\u00df\3\2\2\2\u00e1"+
		"\u00e2\3\2\2\2\u00e2\u00e5\3\2\2\2\u00e3\u00e1\3\2\2\2\u00e4\u00dc\3\2"+
		"\2\2\u00e4\u00e5\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6\u00e7\7\'\2\2\u00e7"+
		"-\3\2\2\2\u00e8\u00e9\5\60\31\2\u00e9/\3\2\2\2\u00ea\u00f0\5\62\32\2\u00eb"+
		"\u00ec\5\66\34\2\u00ec\u00ed\5\60\31\2\u00ed\u00ef\3\2\2\2\u00ee\u00eb"+
		"\3\2\2\2\u00ef\u00f2\3\2\2\2\u00f0\u00ee\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1"+
		"\61\3\2\2\2\u00f2\u00f0\3\2\2\2\u00f3\u00f9\5\64\33\2\u00f4\u00f5\58\35"+
		"\2\u00f5\u00f6\5\64\33\2\u00f6\u00f8\3\2\2\2\u00f7\u00f4\3\2\2\2\u00f8"+
		"\u00fb\3\2\2\2\u00f9\u00f7\3\2\2\2\u00f9\u00fa\3\2\2\2\u00fa\63\3\2\2"+
		"\2\u00fb\u00f9\3\2\2\2\u00fc\u0102\5B\"\2\u00fd\u00fe\7&\2\2\u00fe\u00ff"+
		"\5\60\31\2\u00ff\u0100\7\'\2\2\u0100\u0102\3\2\2\2\u0101\u00fc\3\2\2\2"+
		"\u0101\u00fd\3\2\2\2\u0102\65\3\2\2\2\u0103\u0104\t\5\2\2\u0104\67\3\2"+
		"\2\2\u0105\u0106\t\6\2\2\u01069\3\2\2\2\u0107\u0108\5<\37\2\u0108;\3\2"+
		"\2\2\u0109\u010e\5> \2\u010a\u010b\7$\2\2\u010b\u010d\5<\37\2\u010c\u010a"+
		"\3\2\2\2\u010d\u0110\3\2\2\2\u010e\u010c\3\2\2\2\u010e\u010f\3\2\2\2\u010f"+
		"=\3\2\2\2\u0110\u010e\3\2\2\2\u0111\u0116\5@!\2\u0112\u0113\7%\2\2\u0113"+
		"\u0115\5@!\2\u0114\u0112\3\2\2\2\u0115\u0118\3\2\2\2\u0116\u0114\3\2\2"+
		"\2\u0116\u0117\3\2\2\2\u0117?\3\2\2\2\u0118\u0116\3\2\2\2\u0119\u011d"+
		"\5B\"\2\u011a\u011b\5D#\2\u011b\u011c\5B\"\2\u011c\u011e\3\2\2\2\u011d"+
		"\u011a\3\2\2\2\u011d\u011e\3\2\2\2\u011e\u0124\3\2\2\2\u011f\u0120\7&"+
		"\2\2\u0120\u0121\5<\37\2\u0121\u0122\7\'\2\2\u0122\u0124\3\2\2\2\u0123"+
		"\u0119\3\2\2\2\u0123\u011f\3\2\2\2\u0124A\3\2\2\2\u0125\u0126\t\7\2\2"+
		"\u0126C\3\2\2\2\u0127\u0128\t\b\2\2\u0128E\3\2\2\2\27SVav\u0081\u0085"+
		"\u008d\u0095\u009a\u00a7\u00c4\u00c9\u00e1\u00e4\u00f0\u00f9\u0101\u010e"+
		"\u0116\u011d\u0123";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}