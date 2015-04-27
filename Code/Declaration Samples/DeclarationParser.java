// Generated from Declaration.g4 by ANTLR 4.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class DeclarationParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__5=1, T__4=2, T__3=3, T__2=4, T__1=5, T__0=6, NumberValue=7, BooleanValue=8, 
		Datatype=9, ID=10;
	public static final String[] tokenNames = {
		"<INVALID>", "'/'", "'*'", "'+'", "';'", "'-'", "'='", "NumberValue", 
		"BooleanValue", "Datatype", "ID"
	};
	public static final int
		RULE_declStatement = 0, RULE_assignmentStatment = 1, RULE_expression = 2, 
		RULE_sumexpr = 3, RULE_term = 4, RULE_factor = 5;
	public static final String[] ruleNames = {
		"declStatement", "assignmentStatment", "expression", "sumexpr", "term", 
		"factor"
	};

	@Override
	public String getGrammarFileName() { return "Declaration.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public DeclarationParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class DeclStatementContext extends ParserRuleContext {
		public DeclStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declStatement; }
	 
		public DeclStatementContext() { }
		public void copyFrom(DeclStatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DeclareContext extends DeclStatementContext {
		public TerminalNode ID() { return getToken(DeclarationParser.ID, 0); }
		public TerminalNode Datatype() { return getToken(DeclarationParser.Datatype, 0); }
		public DeclareContext(DeclStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DeclarationListener ) ((DeclarationListener)listener).enterDeclare(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DeclarationListener ) ((DeclarationListener)listener).exitDeclare(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DeclarationVisitor ) return ((DeclarationVisitor<? extends T>)visitor).visitDeclare(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclStatementContext declStatement() throws RecognitionException {
		DeclStatementContext _localctx = new DeclStatementContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_declStatement);
		try {
			_localctx = new DeclareContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(12); match(Datatype);
			setState(13); match(ID);
			setState(14); match(4);
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

	public static class AssignmentStatmentContext extends ParserRuleContext {
		public AssignmentStatmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentStatment; }
	 
		public AssignmentStatmentContext() { }
		public void copyFrom(AssignmentStatmentContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AssignContext extends AssignmentStatmentContext {
		public TerminalNode ID() { return getToken(DeclarationParser.ID, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignContext(AssignmentStatmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DeclarationListener ) ((DeclarationListener)listener).enterAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DeclarationListener ) ((DeclarationListener)listener).exitAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DeclarationVisitor ) return ((DeclarationVisitor<? extends T>)visitor).visitAssign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentStatmentContext assignmentStatment() throws RecognitionException {
		AssignmentStatmentContext _localctx = new AssignmentStatmentContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_assignmentStatment);
		try {
			_localctx = new AssignContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(16); match(ID);
			setState(17); match(6);
			setState(18); expression();
			setState(19); match(4);
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

	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class GotosumexpContext extends ExpressionContext {
		public SumexprContext sumexpr() {
			return getRuleContext(SumexprContext.class,0);
		}
		public GotosumexpContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DeclarationListener ) ((DeclarationListener)listener).enterGotosumexp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DeclarationListener ) ((DeclarationListener)listener).exitGotosumexp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DeclarationVisitor ) return ((DeclarationVisitor<? extends T>)visitor).visitGotosumexp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BoolContext extends ExpressionContext {
		public TerminalNode BooleanValue() { return getToken(DeclarationParser.BooleanValue, 0); }
		public BoolContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DeclarationListener ) ((DeclarationListener)listener).enterBool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DeclarationListener ) ((DeclarationListener)listener).exitBool(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DeclarationVisitor ) return ((DeclarationVisitor<? extends T>)visitor).visitBool(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_expression);
		try {
			setState(23);
			switch (_input.LA(1)) {
			case BooleanValue:
				_localctx = new BoolContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(21); match(BooleanValue);
				}
				break;
			case NumberValue:
			case ID:
				_localctx = new GotosumexpContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(22); sumexpr(0);
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

	public static class SumexprContext extends ParserRuleContext {
		public SumexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sumexpr; }
	 
		public SumexprContext() { }
		public void copyFrom(SumexprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AddContext extends SumexprContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public SumexprContext sumexpr() {
			return getRuleContext(SumexprContext.class,0);
		}
		public AddContext(SumexprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DeclarationListener ) ((DeclarationListener)listener).enterAdd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DeclarationListener ) ((DeclarationListener)listener).exitAdd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DeclarationVisitor ) return ((DeclarationVisitor<? extends T>)visitor).visitAdd(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SubContext extends SumexprContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public SumexprContext sumexpr() {
			return getRuleContext(SumexprContext.class,0);
		}
		public SubContext(SumexprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DeclarationListener ) ((DeclarationListener)listener).enterSub(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DeclarationListener ) ((DeclarationListener)listener).exitSub(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DeclarationVisitor ) return ((DeclarationVisitor<? extends T>)visitor).visitSub(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GototermContext extends SumexprContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public GototermContext(SumexprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DeclarationListener ) ((DeclarationListener)listener).enterGototerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DeclarationListener ) ((DeclarationListener)listener).exitGototerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DeclarationVisitor ) return ((DeclarationVisitor<? extends T>)visitor).visitGototerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SumexprContext sumexpr() throws RecognitionException {
		return sumexpr(0);
	}

	private SumexprContext sumexpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		SumexprContext _localctx = new SumexprContext(_ctx, _parentState);
		SumexprContext _prevctx = _localctx;
		int _startState = 6;
		enterRecursionRule(_localctx, 6, RULE_sumexpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new GototermContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(26); term(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(36);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(34);
					switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
					case 1:
						{
						_localctx = new AddContext(new SumexprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_sumexpr);
						setState(28);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(29); match(3);
						setState(30); term(0);
						}
						break;

					case 2:
						{
						_localctx = new SubContext(new SumexprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_sumexpr);
						setState(31);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(32); match(5);
						setState(33); term(0);
						}
						break;
					}
					} 
				}
				setState(38);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
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

	public static class TermContext extends ParserRuleContext {
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
	 
		public TermContext() { }
		public void copyFrom(TermContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DivContext extends TermContext {
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public DivContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DeclarationListener ) ((DeclarationListener)listener).enterDiv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DeclarationListener ) ((DeclarationListener)listener).exitDiv(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DeclarationVisitor ) return ((DeclarationVisitor<? extends T>)visitor).visitDiv(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MulContext extends TermContext {
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public MulContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DeclarationListener ) ((DeclarationListener)listener).enterMul(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DeclarationListener ) ((DeclarationListener)listener).exitMul(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DeclarationVisitor ) return ((DeclarationVisitor<? extends T>)visitor).visitMul(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GotofactorContext extends TermContext {
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public GotofactorContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DeclarationListener ) ((DeclarationListener)listener).enterGotofactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DeclarationListener ) ((DeclarationListener)listener).exitGotofactor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DeclarationVisitor ) return ((DeclarationVisitor<? extends T>)visitor).visitGotofactor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		return term(0);
	}

	private TermContext term(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TermContext _localctx = new TermContext(_ctx, _parentState);
		TermContext _prevctx = _localctx;
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_term, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new GotofactorContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(40); factor();
			}
			_ctx.stop = _input.LT(-1);
			setState(50);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(48);
					switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
					case 1:
						{
						_localctx = new MulContext(new TermContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(42);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(43); match(2);
						setState(44); factor();
						}
						break;

					case 2:
						{
						_localctx = new DivContext(new TermContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(45);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(46); match(1);
						setState(47); factor();
						}
						break;
					}
					} 
				}
				setState(52);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
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

	public static class FactorContext extends ParserRuleContext {
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
	 
		public FactorContext() { }
		public void copyFrom(FactorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NumberContext extends FactorContext {
		public TerminalNode NumberValue() { return getToken(DeclarationParser.NumberValue, 0); }
		public NumberContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DeclarationListener ) ((DeclarationListener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DeclarationListener ) ((DeclarationListener)listener).exitNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DeclarationVisitor ) return ((DeclarationVisitor<? extends T>)visitor).visitNumber(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IdContext extends FactorContext {
		public TerminalNode ID() { return getToken(DeclarationParser.ID, 0); }
		public IdContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DeclarationListener ) ((DeclarationListener)listener).enterId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DeclarationListener ) ((DeclarationListener)listener).exitId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DeclarationVisitor ) return ((DeclarationVisitor<? extends T>)visitor).visitId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_factor);
		try {
			setState(55);
			switch (_input.LA(1)) {
			case ID:
				_localctx = new IdContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(53); match(ID);
				}
				break;
			case NumberValue:
				_localctx = new NumberContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(54); match(NumberValue);
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
		case 3: return sumexpr_sempred((SumexprContext)_localctx, predIndex);

		case 4: return term_sempred((TermContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean sumexpr_sempred(SumexprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return precpred(_ctx, 3);

		case 1: return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean term_sempred(TermContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2: return precpred(_ctx, 3);

		case 3: return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\f<\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3"+
		"\3\4\3\4\5\4\32\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5%\n\5\f\5\16"+
		"\5(\13\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6\63\n\6\f\6\16\6\66\13"+
		"\6\3\7\3\7\5\7:\n\7\3\7\2\4\b\n\b\2\4\6\b\n\f\2\2;\2\16\3\2\2\2\4\22\3"+
		"\2\2\2\6\31\3\2\2\2\b\33\3\2\2\2\n)\3\2\2\2\f9\3\2\2\2\16\17\7\13\2\2"+
		"\17\20\7\f\2\2\20\21\7\6\2\2\21\3\3\2\2\2\22\23\7\f\2\2\23\24\7\b\2\2"+
		"\24\25\5\6\4\2\25\26\7\6\2\2\26\5\3\2\2\2\27\32\7\n\2\2\30\32\5\b\5\2"+
		"\31\27\3\2\2\2\31\30\3\2\2\2\32\7\3\2\2\2\33\34\b\5\1\2\34\35\5\n\6\2"+
		"\35&\3\2\2\2\36\37\f\5\2\2\37 \7\5\2\2 %\5\n\6\2!\"\f\4\2\2\"#\7\7\2\2"+
		"#%\5\n\6\2$\36\3\2\2\2$!\3\2\2\2%(\3\2\2\2&$\3\2\2\2&\'\3\2\2\2\'\t\3"+
		"\2\2\2(&\3\2\2\2)*\b\6\1\2*+\5\f\7\2+\64\3\2\2\2,-\f\5\2\2-.\7\4\2\2."+
		"\63\5\f\7\2/\60\f\4\2\2\60\61\7\3\2\2\61\63\5\f\7\2\62,\3\2\2\2\62/\3"+
		"\2\2\2\63\66\3\2\2\2\64\62\3\2\2\2\64\65\3\2\2\2\65\13\3\2\2\2\66\64\3"+
		"\2\2\2\67:\7\f\2\28:\7\t\2\29\67\3\2\2\298\3\2\2\2:\r\3\2\2\2\b\31$&\62"+
		"\649";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}