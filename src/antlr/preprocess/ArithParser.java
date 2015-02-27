// Generated from Arith.g4 by ANTLR 4.4
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
public class ArithParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, INT=2, FLOAT=3, STRING=4, ID=5, OR=6, AND=7, LPAREN=8, RPAREN=9, 
		ADDCTIVE=10, DEDUCTIVE=11, MULTIPLY=12, DIVIDE=13, MOD=14, LT=15, LE=16, 
		GT=17, GE=18, EQ=19, NEQ=20, WS=21;
	public static final String[] tokenNames = {
		"<INVALID>", "';'", "INT", "FLOAT", "STRING", "ID", "'||'", "'&&'", "'('", 
		"')'", "'+'", "'-'", "'*'", "'/'", "'%'", "'<'", "'<='", "'>'", "'>='", 
		"'=='", "'!='", "WS"
	};
	public static final int
		RULE_arith_expression = 0, RULE_add_expression = 1, RULE_multi_expression = 2, 
		RULE_addOperator = 3, RULE_multiOperator = 4, RULE_atom = 5;
	public static final String[] ruleNames = {
		"arith_expression", "add_expression", "multi_expression", "addOperator", 
		"multiOperator", "atom"
	};

	@Override
	public String getGrammarFileName() { return "Arith.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ArithParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
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
			if ( listener instanceof ArithListener ) ((ArithListener)listener).enterArith_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArithListener ) ((ArithListener)listener).exitArith_expression(this);
		}
	}

	public final Arith_expressionContext arith_expression() throws RecognitionException {
		Arith_expressionContext _localctx = new Arith_expressionContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_arith_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(12); add_expression();
			setState(13); match(T__0);
			}
		}
		catch (RecognitionException re) {
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
			if ( listener instanceof ArithListener ) ((ArithListener)listener).enterAdd_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArithListener ) ((ArithListener)listener).exitAdd_expression(this);
		}
	}

	public final Add_expressionContext add_expression() throws RecognitionException {
		Add_expressionContext _localctx = new Add_expressionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_add_expression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(15); multi_expression();
			setState(21);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(16); addOperator();
					setState(17); add_expression();
					}
					} 
				}
				setState(23);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
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
		public AtomContext atom(int i) {
			return getRuleContext(AtomContext.class,i);
		}
		public Add_expressionContext add_expression() {
			return getRuleContext(Add_expressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(ArithParser.RPAREN, 0); }
		public TerminalNode LPAREN() { return getToken(ArithParser.LPAREN, 0); }
		public List<MultiOperatorContext> multiOperator() {
			return getRuleContexts(MultiOperatorContext.class);
		}
		public MultiOperatorContext multiOperator(int i) {
			return getRuleContext(MultiOperatorContext.class,i);
		}
		public List<AtomContext> atom() {
			return getRuleContexts(AtomContext.class);
		}
		public Multi_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multi_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArithListener ) ((ArithListener)listener).enterMulti_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArithListener ) ((ArithListener)listener).exitMulti_expression(this);
		}
	}

	public final Multi_expressionContext multi_expression() throws RecognitionException {
		Multi_expressionContext _localctx = new Multi_expressionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_multi_expression);
		int _la;
		try {
			setState(37);
			switch (_input.LA(1)) {
			case INT:
			case FLOAT:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(24); atom();
				setState(30);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MULTIPLY) | (1L << DIVIDE) | (1L << MOD))) != 0)) {
					{
					{
					setState(25); multiOperator();
					setState(26); atom();
					}
					}
					setState(32);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 2);
				{
				setState(33); match(LPAREN);
				setState(34); add_expression();
				setState(35); match(RPAREN);
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
		public TerminalNode DEDUCTIVE() { return getToken(ArithParser.DEDUCTIVE, 0); }
		public TerminalNode ADDCTIVE() { return getToken(ArithParser.ADDCTIVE, 0); }
		public AddOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArithListener ) ((ArithListener)listener).enterAddOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArithListener ) ((ArithListener)listener).exitAddOperator(this);
		}
	}

	public final AddOperatorContext addOperator() throws RecognitionException {
		AddOperatorContext _localctx = new AddOperatorContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_addOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(39);
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
		public TerminalNode MULTIPLY() { return getToken(ArithParser.MULTIPLY, 0); }
		public TerminalNode DIVIDE() { return getToken(ArithParser.DIVIDE, 0); }
		public TerminalNode MOD() { return getToken(ArithParser.MOD, 0); }
		public MultiOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArithListener ) ((ArithListener)listener).enterMultiOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArithListener ) ((ArithListener)listener).exitMultiOperator(this);
		}
	}

	public final MultiOperatorContext multiOperator() throws RecognitionException {
		MultiOperatorContext _localctx = new MultiOperatorContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_multiOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(41);
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
		public TerminalNode FLOAT() { return getToken(ArithParser.FLOAT, 0); }
		public TerminalNode INT() { return getToken(ArithParser.INT, 0); }
		public TerminalNode ID() { return getToken(ArithParser.ID, 0); }
		public AtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArithListener ) ((ArithListener)listener).enterAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArithListener ) ((ArithListener)listener).exitAtom(this);
		}
	}

	public final AtomContext atom() throws RecognitionException {
		AtomContext _localctx = new AtomContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_atom);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(43);
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\27\60\4\2\t\2\4\3"+
		"\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\3\2\3\2\3\2\3\3\3\3\3\3\3\3\7\3\26"+
		"\n\3\f\3\16\3\31\13\3\3\4\3\4\3\4\3\4\7\4\37\n\4\f\4\16\4\"\13\4\3\4\3"+
		"\4\3\4\3\4\5\4(\n\4\3\5\3\5\3\6\3\6\3\7\3\7\3\7\2\2\b\2\4\6\b\n\f\2\5"+
		"\3\2\f\r\3\2\16\20\4\2\4\5\7\7,\2\16\3\2\2\2\4\21\3\2\2\2\6\'\3\2\2\2"+
		"\b)\3\2\2\2\n+\3\2\2\2\f-\3\2\2\2\16\17\5\4\3\2\17\20\7\3\2\2\20\3\3\2"+
		"\2\2\21\27\5\6\4\2\22\23\5\b\5\2\23\24\5\4\3\2\24\26\3\2\2\2\25\22\3\2"+
		"\2\2\26\31\3\2\2\2\27\25\3\2\2\2\27\30\3\2\2\2\30\5\3\2\2\2\31\27\3\2"+
		"\2\2\32 \5\f\7\2\33\34\5\n\6\2\34\35\5\f\7\2\35\37\3\2\2\2\36\33\3\2\2"+
		"\2\37\"\3\2\2\2 \36\3\2\2\2 !\3\2\2\2!(\3\2\2\2\" \3\2\2\2#$\7\n\2\2$"+
		"%\5\4\3\2%&\7\13\2\2&(\3\2\2\2\'\32\3\2\2\2\'#\3\2\2\2(\7\3\2\2\2)*\t"+
		"\2\2\2*\t\3\2\2\2+,\t\3\2\2,\13\3\2\2\2-.\t\4\2\2.\r\3\2\2\2\5\27 \'";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}