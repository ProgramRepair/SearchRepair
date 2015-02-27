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
		T__9=1, T__8=2, T__7=3, T__6=4, T__5=5, T__4=6, T__3=7, T__2=8, T__1=9, 
		T__0=10, Address=11, CallExpr=12, Int=13, Char=14, Float=15, ID=16, INT=17, 
		FLOAT=18, WS=19, CharacterLiteral=20, StringLiteral=21, Character=22;
	public static final String[] tokenNames = {
		"<INVALID>", "']'", "'%'", "'+'", "'['", "'*'", "'-'", "'/'", "'='", "'return'", 
		"';'", "Address", "CallExpr", "'int'", "'char'", "'float'", "ID", "INT", 
		"FLOAT", "WS", "CharacterLiteral", "StringLiteral", "Character"
	};
	public static final int
		RULE_prog = 0, RULE_statement = 1, RULE_declarationStat = 2, RULE_assignStat = 3, 
		RULE_returnStat = 4, RULE_exprStat = 5, RULE_expr = 6, RULE_type = 7, 
		RULE_addictiveOperator = 8, RULE_multiOperater = 9;
	public static final String[] ruleNames = {
		"prog", "statement", "declarationStat", "assignStat", "returnStat", "exprStat", 
		"expr", "type", "addictiveOperator", "multiOperater"
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
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
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
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(23);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__1) | (1L << CallExpr) | (1L << Int) | (1L << Char) | (1L << Float) | (1L << ID) | (1L << INT) | (1L << FLOAT) | (1L << CharacterLiteral) | (1L << StringLiteral))) != 0)) {
				{
				{
				setState(20); statement();
				}
				}
				setState(25);
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
		public ExprStatContext exprStat() {
			return getRuleContext(ExprStatContext.class,0);
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
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SnippetListener ) ((SnippetListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SnippetListener ) ((SnippetListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(30);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(26); declarationStat();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(27); assignStat();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(28); returnStat();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(29); exprStat();
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
		public TerminalNode INT() { return getToken(SnippetParser.INT, 0); }
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
	}

	public final DeclarationStatContext declarationStat() throws RecognitionException {
		DeclarationStatContext _localctx = new DeclarationStatContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_declarationStat);
		try {
			setState(49);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(32); type();
				setState(33); match(ID);
				{
				setState(34); match(T__6);
				setState(35); match(INT);
				setState(36); match(T__9);
				}
				setState(38); match(T__0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(40); type();
				setState(41); match(T__5);
				setState(42); match(ID);
				setState(43); match(T__0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(45); type();
				setState(46); match(ID);
				setState(47); match(T__0);
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
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode ID() { return getToken(SnippetParser.ID, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode StringLiteral() { return getToken(SnippetParser.StringLiteral, 0); }
		public TerminalNode Address() { return getToken(SnippetParser.Address, 0); }
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
	}

	public final AssignStatContext assignStat() throws RecognitionException {
		AssignStatContext _localctx = new AssignStatContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_assignStat);
		int _la;
		try {
			setState(67);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(52);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Int) | (1L << Char) | (1L << Float))) != 0)) {
					{
					setState(51); type();
					}
				}

				setState(54); match(ID);
				setState(55); match(T__2);
				setState(56); expr(0);
				setState(57); match(T__0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(60);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Int) | (1L << Char) | (1L << Float))) != 0)) {
					{
					setState(59); type();
					}
				}

				setState(62); match(T__5);
				setState(63); match(ID);
				setState(64); match(T__2);
				setState(65);
				_la = _input.LA(1);
				if ( !(_la==Address || _la==StringLiteral) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(66); match(T__0);
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
		public TerminalNode ID() { return getToken(SnippetParser.ID, 0); }
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
	}

	public final ReturnStatContext returnStat() throws RecognitionException {
		ReturnStatContext _localctx = new ReturnStatContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_returnStat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69); match(T__1);
			setState(70); match(ID);
			setState(71); match(T__0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprStatContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode CallExpr() { return getToken(SnippetParser.CallExpr, 0); }
		public ExprStatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprStat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SnippetListener ) ((SnippetListener)listener).enterExprStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SnippetListener ) ((SnippetListener)listener).exitExprStat(this);
		}
	}

	public final ExprStatContext exprStat() throws RecognitionException {
		ExprStatContext _localctx = new ExprStatContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_exprStat);
		try {
			setState(78);
			switch (_input.LA(1)) {
			case CallExpr:
				enterOuterAlt(_localctx, 1);
				{
				setState(73); match(CallExpr);
				setState(74); match(T__0);
				}
				break;
			case ID:
			case INT:
			case FLOAT:
			case CharacterLiteral:
			case StringLiteral:
				enterOuterAlt(_localctx, 2);
				{
				setState(75); expr(0);
				setState(76); match(T__0);
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

	public static class ExprContext extends ParserRuleContext {
		public TerminalNode FLOAT() { return getToken(SnippetParser.FLOAT, 0); }
		public TerminalNode INT() { return getToken(SnippetParser.INT, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public TerminalNode CharacterLiteral() { return getToken(SnippetParser.CharacterLiteral, 0); }
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode ID() { return getToken(SnippetParser.ID, 0); }
		public MultiOperaterContext multiOperater() {
			return getRuleContext(MultiOperaterContext.class,0);
		}
		public AddictiveOperatorContext addictiveOperator() {
			return getRuleContext(AddictiveOperatorContext.class,0);
		}
		public TerminalNode StringLiteral() { return getToken(SnippetParser.StringLiteral, 0); }
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
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 12;
		enterRecursionRule(_localctx, 12, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			switch (_input.LA(1)) {
			case ID:
				{
				setState(81); match(ID);
				}
				break;
			case INT:
				{
				setState(82); match(INT);
				}
				break;
			case FLOAT:
				{
				setState(83); match(FLOAT);
				}
				break;
			case CharacterLiteral:
				{
				setState(84); match(CharacterLiteral);
				}
				break;
			case StringLiteral:
				{
				setState(85); match(StringLiteral);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(98);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(96);
					switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(88);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(89); addictiveOperator();
						setState(90); expr(6);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(92);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(93); multiOperater();
						setState(94); expr(5);
						}
						break;
					}
					} 
				}
				setState(100);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
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

	public static class TypeContext extends ParserRuleContext {
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
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Int) | (1L << Char) | (1L << Float))) != 0)) ) {
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

	public static class AddictiveOperatorContext extends ParserRuleContext {
		public AddictiveOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addictiveOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SnippetListener ) ((SnippetListener)listener).enterAddictiveOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SnippetListener ) ((SnippetListener)listener).exitAddictiveOperator(this);
		}
	}

	public final AddictiveOperatorContext addictiveOperator() throws RecognitionException {
		AddictiveOperatorContext _localctx = new AddictiveOperatorContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_addictiveOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			_la = _input.LA(1);
			if ( !(_la==T__7 || _la==T__4) ) {
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SnippetListener ) ((SnippetListener)listener).enterMultiOperater(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SnippetListener ) ((SnippetListener)listener).exitMultiOperater(this);
		}
	}

	public final MultiOperaterContext multiOperater() throws RecognitionException {
		MultiOperaterContext _localctx = new MultiOperaterContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_multiOperater);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__5) | (1L << T__3))) != 0)) ) {
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
		case 6: return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return precpred(_ctx, 5);
		case 1: return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\30n\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\3"+
		"\2\7\2\30\n\2\f\2\16\2\33\13\2\3\3\3\3\3\3\3\3\5\3!\n\3\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\64\n\4\3\5"+
		"\5\5\67\n\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5?\n\5\3\5\3\5\3\5\3\5\3\5\5\5F"+
		"\n\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\5\7Q\n\7\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\5\bY\n\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\7\bc\n\b\f\b\16\bf\13\b"+
		"\3\t\3\t\3\n\3\n\3\13\3\13\3\13\2\3\16\f\2\4\6\b\n\f\16\20\22\24\2\6\4"+
		"\2\r\r\27\27\3\2\17\21\4\2\5\5\b\b\5\2\4\4\7\7\t\ts\2\31\3\2\2\2\4 \3"+
		"\2\2\2\6\63\3\2\2\2\bE\3\2\2\2\nG\3\2\2\2\fP\3\2\2\2\16X\3\2\2\2\20g\3"+
		"\2\2\2\22i\3\2\2\2\24k\3\2\2\2\26\30\5\4\3\2\27\26\3\2\2\2\30\33\3\2\2"+
		"\2\31\27\3\2\2\2\31\32\3\2\2\2\32\3\3\2\2\2\33\31\3\2\2\2\34!\5\6\4\2"+
		"\35!\5\b\5\2\36!\5\n\6\2\37!\5\f\7\2 \34\3\2\2\2 \35\3\2\2\2 \36\3\2\2"+
		"\2 \37\3\2\2\2!\5\3\2\2\2\"#\5\20\t\2#$\7\22\2\2$%\7\6\2\2%&\7\23\2\2"+
		"&\'\7\3\2\2\'(\3\2\2\2()\7\f\2\2)\64\3\2\2\2*+\5\20\t\2+,\7\7\2\2,-\7"+
		"\22\2\2-.\7\f\2\2.\64\3\2\2\2/\60\5\20\t\2\60\61\7\22\2\2\61\62\7\f\2"+
		"\2\62\64\3\2\2\2\63\"\3\2\2\2\63*\3\2\2\2\63/\3\2\2\2\64\7\3\2\2\2\65"+
		"\67\5\20\t\2\66\65\3\2\2\2\66\67\3\2\2\2\678\3\2\2\289\7\22\2\29:\7\n"+
		"\2\2:;\5\16\b\2;<\7\f\2\2<F\3\2\2\2=?\5\20\t\2>=\3\2\2\2>?\3\2\2\2?@\3"+
		"\2\2\2@A\7\7\2\2AB\7\22\2\2BC\7\n\2\2CD\t\2\2\2DF\7\f\2\2E\66\3\2\2\2"+
		"E>\3\2\2\2F\t\3\2\2\2GH\7\13\2\2HI\7\22\2\2IJ\7\f\2\2J\13\3\2\2\2KL\7"+
		"\16\2\2LQ\7\f\2\2MN\5\16\b\2NO\7\f\2\2OQ\3\2\2\2PK\3\2\2\2PM\3\2\2\2Q"+
		"\r\3\2\2\2RS\b\b\1\2SY\7\22\2\2TY\7\23\2\2UY\7\24\2\2VY\7\26\2\2WY\7\27"+
		"\2\2XR\3\2\2\2XT\3\2\2\2XU\3\2\2\2XV\3\2\2\2XW\3\2\2\2Yd\3\2\2\2Z[\f\7"+
		"\2\2[\\\5\22\n\2\\]\5\16\b\b]c\3\2\2\2^_\f\6\2\2_`\5\24\13\2`a\5\16\b"+
		"\7ac\3\2\2\2bZ\3\2\2\2b^\3\2\2\2cf\3\2\2\2db\3\2\2\2de\3\2\2\2e\17\3\2"+
		"\2\2fd\3\2\2\2gh\t\3\2\2h\21\3\2\2\2ij\t\4\2\2j\23\3\2\2\2kl\t\5\2\2l"+
		"\25\3\2\2\2\f\31 \63\66>EPXbd";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}