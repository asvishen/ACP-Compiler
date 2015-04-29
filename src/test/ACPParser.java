// Generated from ACP.g4 by ANTLR 4.5
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ACPParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		CMPOP=25, NumberValue=26, BooleanValue=27, Datatype=28, ID=29, WS=30;
	public static final int
		RULE_start = 0, RULE_func = 1, RULE_params = 2, RULE_ifstmt = 3, RULE_whilestmt = 4, 
		RULE_elsepart = 5, RULE_compexpr = 6, RULE_andcomp = 7, RULE_relexpr = 8, 
		RULE_block = 9, RULE_printstmt = 10, RULE_returnstmt = 11, RULE_call = 12, 
		RULE_stackdecl = 13, RULE_stackoperation = 14, RULE_assignmentStatment = 15, 
		RULE_sumexpr = 16, RULE_term = 17, RULE_factor = 18;
	public static final String[] ruleNames = {
		"start", "func", "params", "ifstmt", "whilestmt", "elsepart", "compexpr", 
		"andcomp", "relexpr", "block", "printstmt", "returnstmt", "call", "stackdecl", 
		"stackoperation", "assignmentStatment", "sumexpr", "term", "factor"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'function'", "'('", "')'", "'<<'", "'>>'", "'if'", "'else'", "'while'", 
		"'or'", "'and'", "'print'", "'['", "']'", "';'", "'return'", "'stack'", 
		"'.'", "'push'", "'pop'", "'='", "'+'", "'-'", "'*'", "'/'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, "CMPOP", "NumberValue", "BooleanValue", "Datatype", "ID", "WS"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "ACP.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ACPParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class StartContext extends ParserRuleContext {
		public List<FuncContext> func() {
			return getRuleContexts(FuncContext.class);
		}
		public FuncContext func(int i) {
			return getRuleContext(FuncContext.class,i);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ACPListener ) ((ACPListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ACPListener ) ((ACPListener)listener).exitStart(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(39); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(38);
				func();
				}
				}
				setState(41); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__5) | (1L << T__7) | (1L << T__10) | (1L << T__14) | (1L << T__15) | (1L << Datatype) | (1L << ID))) != 0) );
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

	public static class FuncContext extends ParserRuleContext {
		public FuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func; }
	 
		public FuncContext() { }
		public void copyFrom(FuncContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FuncwithoutparamContext extends FuncContext {
		public TerminalNode ID() { return getToken(ACPParser.ID, 0); }
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public FuncwithoutparamContext(FuncContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ACPListener ) ((ACPListener)listener).enterFuncwithoutparam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ACPListener ) ((ACPListener)listener).exitFuncwithoutparam(this);
		}
	}
	public static class JustAnotherBlockContext extends FuncContext {
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public JustAnotherBlockContext(FuncContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ACPListener ) ((ACPListener)listener).enterJustAnotherBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ACPListener ) ((ACPListener)listener).exitJustAnotherBlock(this);
		}
	}
	public static class FuncwithparamContext extends FuncContext {
		public TerminalNode ID() { return getToken(ACPParser.ID, 0); }
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public FuncwithparamContext(FuncContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ACPListener ) ((ACPListener)listener).enterFuncwithparam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ACPListener ) ((ACPListener)listener).exitFuncwithparam(this);
		}
	}

	public final FuncContext func() throws RecognitionException {
		FuncContext _localctx = new FuncContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_func);
		int _la;
		try {
			int _alt;
			setState(73);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				_localctx = new FuncwithparamContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(43);
				match(T__0);
				setState(44);
				match(ID);
				setState(45);
				match(T__1);
				setState(46);
				params();
				setState(47);
				match(T__2);
				setState(48);
				match(T__3);
				setState(50); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(49);
					block();
					}
					}
					setState(52); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__7) | (1L << T__10) | (1L << T__14) | (1L << T__15) | (1L << Datatype) | (1L << ID))) != 0) );
				setState(54);
				match(T__4);
				}
				break;
			case 2:
				_localctx = new FuncwithoutparamContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(56);
				match(T__0);
				setState(57);
				match(ID);
				setState(58);
				match(T__1);
				setState(59);
				match(T__2);
				setState(60);
				match(T__3);
				setState(62); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(61);
					block();
					}
					}
					setState(64); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__7) | (1L << T__10) | (1L << T__14) | (1L << T__15) | (1L << Datatype) | (1L << ID))) != 0) );
				setState(66);
				match(T__4);
				}
				break;
			case 3:
				_localctx = new JustAnotherBlockContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(69); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(68);
						block();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(71); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class ParamsContext extends ParserRuleContext {
		public TerminalNode Datatype() { return getToken(ACPParser.Datatype, 0); }
		public TerminalNode ID() { return getToken(ACPParser.ID, 0); }
		public ParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_params; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ACPListener ) ((ACPListener)listener).enterParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ACPListener ) ((ACPListener)listener).exitParams(this);
		}
	}

	public final ParamsContext params() throws RecognitionException {
		ParamsContext _localctx = new ParamsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_params);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			match(Datatype);
			setState(76);
			match(ID);
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

	public static class IfstmtContext extends ParserRuleContext {
		public IfstmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifstmt; }
	 
		public IfstmtContext() { }
		public void copyFrom(IfstmtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IfwithoutContext extends IfstmtContext {
		public CompexprContext compexpr() {
			return getRuleContext(CompexprContext.class,0);
		}
		public ElsepartContext elsepart() {
			return getRuleContext(ElsepartContext.class,0);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public IfwithoutContext(IfstmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ACPListener ) ((ACPListener)listener).enterIfwithout(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ACPListener ) ((ACPListener)listener).exitIfwithout(this);
		}
	}
	public static class IfonlyContext extends IfstmtContext {
		public CompexprContext compexpr() {
			return getRuleContext(CompexprContext.class,0);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public IfonlyContext(IfstmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ACPListener ) ((ACPListener)listener).enterIfonly(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ACPListener ) ((ACPListener)listener).exitIfonly(this);
		}
	}

	public final IfstmtContext ifstmt() throws RecognitionException {
		IfstmtContext _localctx = new IfstmtContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_ifstmt);
		int _la;
		try {
			setState(104);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				_localctx = new IfonlyContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(78);
				match(T__5);
				setState(79);
				match(T__1);
				setState(80);
				compexpr(0);
				setState(81);
				match(T__2);
				setState(82);
				match(T__3);
				setState(84); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(83);
					block();
					}
					}
					setState(86); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__7) | (1L << T__10) | (1L << T__14) | (1L << T__15) | (1L << Datatype) | (1L << ID))) != 0) );
				setState(88);
				match(T__4);
				}
				break;
			case 2:
				_localctx = new IfwithoutContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(90);
				match(T__5);
				setState(91);
				match(T__1);
				setState(92);
				compexpr(0);
				setState(93);
				match(T__2);
				setState(94);
				match(T__3);
				setState(96); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(95);
					block();
					}
					}
					setState(98); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__7) | (1L << T__10) | (1L << T__14) | (1L << T__15) | (1L << Datatype) | (1L << ID))) != 0) );
				setState(100);
				match(T__4);
				setState(101);
				match(T__6);
				setState(102);
				elsepart();
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

	public static class WhilestmtContext extends ParserRuleContext {
		public CompexprContext compexpr() {
			return getRuleContext(CompexprContext.class,0);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public WhilestmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whilestmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ACPListener ) ((ACPListener)listener).enterWhilestmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ACPListener ) ((ACPListener)listener).exitWhilestmt(this);
		}
	}

	public final WhilestmtContext whilestmt() throws RecognitionException {
		WhilestmtContext _localctx = new WhilestmtContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_whilestmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			match(T__7);
			setState(107);
			match(T__1);
			setState(108);
			compexpr(0);
			setState(109);
			match(T__2);
			setState(110);
			match(T__3);
			setState(112); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(111);
				block();
				}
				}
				setState(114); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__7) | (1L << T__10) | (1L << T__14) | (1L << T__15) | (1L << Datatype) | (1L << ID))) != 0) );
			setState(116);
			match(T__4);
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

	public static class ElsepartContext extends ParserRuleContext {
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public ElsepartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elsepart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ACPListener ) ((ACPListener)listener).enterElsepart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ACPListener ) ((ACPListener)listener).exitElsepart(this);
		}
	}

	public final ElsepartContext elsepart() throws RecognitionException {
		ElsepartContext _localctx = new ElsepartContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_elsepart);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			match(T__3);
			setState(120); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(119);
				block();
				}
				}
				setState(122); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__7) | (1L << T__10) | (1L << T__14) | (1L << T__15) | (1L << Datatype) | (1L << ID))) != 0) );
			setState(124);
			match(T__4);
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

	public static class CompexprContext extends ParserRuleContext {
		public CompexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compexpr; }
	 
		public CompexprContext() { }
		public void copyFrom(CompexprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class OrContext extends CompexprContext {
		public CompexprContext compexpr() {
			return getRuleContext(CompexprContext.class,0);
		}
		public AndcompContext andcomp() {
			return getRuleContext(AndcompContext.class,0);
		}
		public OrContext(CompexprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ACPListener ) ((ACPListener)listener).enterOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ACPListener ) ((ACPListener)listener).exitOr(this);
		}
	}
	public static class OrwithoutContext extends CompexprContext {
		public AndcompContext andcomp() {
			return getRuleContext(AndcompContext.class,0);
		}
		public OrwithoutContext(CompexprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ACPListener ) ((ACPListener)listener).enterOrwithout(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ACPListener ) ((ACPListener)listener).exitOrwithout(this);
		}
	}

	public final CompexprContext compexpr() throws RecognitionException {
		return compexpr(0);
	}

	private CompexprContext compexpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		CompexprContext _localctx = new CompexprContext(_ctx, _parentState);
		CompexprContext _prevctx = _localctx;
		int _startState = 12;
		enterRecursionRule(_localctx, 12, RULE_compexpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new OrwithoutContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(127);
			andcomp(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(134);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new OrContext(new CompexprContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_compexpr);
					setState(129);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(130);
					match(T__8);
					setState(131);
					andcomp(0);
					}
					} 
				}
				setState(136);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
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

	public static class AndcompContext extends ParserRuleContext {
		public AndcompContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_andcomp; }
	 
		public AndcompContext() { }
		public void copyFrom(AndcompContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AndwithoutContext extends AndcompContext {
		public RelexprContext relexpr() {
			return getRuleContext(RelexprContext.class,0);
		}
		public AndwithoutContext(AndcompContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ACPListener ) ((ACPListener)listener).enterAndwithout(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ACPListener ) ((ACPListener)listener).exitAndwithout(this);
		}
	}
	public static class AndContext extends AndcompContext {
		public AndcompContext andcomp() {
			return getRuleContext(AndcompContext.class,0);
		}
		public RelexprContext relexpr() {
			return getRuleContext(RelexprContext.class,0);
		}
		public AndContext(AndcompContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ACPListener ) ((ACPListener)listener).enterAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ACPListener ) ((ACPListener)listener).exitAnd(this);
		}
	}

	public final AndcompContext andcomp() throws RecognitionException {
		return andcomp(0);
	}

	private AndcompContext andcomp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AndcompContext _localctx = new AndcompContext(_ctx, _parentState);
		AndcompContext _prevctx = _localctx;
		int _startState = 14;
		enterRecursionRule(_localctx, 14, RULE_andcomp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new AndwithoutContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(138);
			relexpr();
			}
			_ctx.stop = _input.LT(-1);
			setState(145);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new AndContext(new AndcompContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_andcomp);
					setState(140);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(141);
					match(T__9);
					setState(142);
					relexpr();
					}
					} 
				}
				setState(147);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
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

	public static class RelexprContext extends ParserRuleContext {
		public RelexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relexpr; }
	 
		public RelexprContext() { }
		public void copyFrom(RelexprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CompContext extends RelexprContext {
		public List<SumexprContext> sumexpr() {
			return getRuleContexts(SumexprContext.class);
		}
		public SumexprContext sumexpr(int i) {
			return getRuleContext(SumexprContext.class,i);
		}
		public TerminalNode CMPOP() { return getToken(ACPParser.CMPOP, 0); }
		public CompContext(RelexprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ACPListener ) ((ACPListener)listener).enterComp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ACPListener ) ((ACPListener)listener).exitComp(this);
		}
	}

	public final RelexprContext relexpr() throws RecognitionException {
		RelexprContext _localctx = new RelexprContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_relexpr);
		try {
			_localctx = new CompContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			sumexpr(0);
			setState(149);
			match(CMPOP);
			setState(150);
			sumexpr(0);
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
		public AssignmentStatmentContext assignmentStatment() {
			return getRuleContext(AssignmentStatmentContext.class,0);
		}
		public IfstmtContext ifstmt() {
			return getRuleContext(IfstmtContext.class,0);
		}
		public WhilestmtContext whilestmt() {
			return getRuleContext(WhilestmtContext.class,0);
		}
		public CallContext call() {
			return getRuleContext(CallContext.class,0);
		}
		public ReturnstmtContext returnstmt() {
			return getRuleContext(ReturnstmtContext.class,0);
		}
		public PrintstmtContext printstmt() {
			return getRuleContext(PrintstmtContext.class,0);
		}
		public StackdeclContext stackdecl() {
			return getRuleContext(StackdeclContext.class,0);
		}
		public StackoperationContext stackoperation() {
			return getRuleContext(StackoperationContext.class,0);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ACPListener ) ((ACPListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ACPListener ) ((ACPListener)listener).exitBlock(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_block);
		try {
			setState(160);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(152);
				assignmentStatment();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(153);
				ifstmt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(154);
				whilestmt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(155);
				call();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(156);
				returnstmt();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(157);
				printstmt();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(158);
				stackdecl();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(159);
				stackoperation();
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

	public static class PrintstmtContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(ACPParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(ACPParser.ID, i);
		}
		public PrintstmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printstmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ACPListener ) ((ACPListener)listener).enterPrintstmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ACPListener ) ((ACPListener)listener).exitPrintstmt(this);
		}
	}

	public final PrintstmtContext printstmt() throws RecognitionException {
		PrintstmtContext _localctx = new PrintstmtContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_printstmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			match(T__10);
			setState(163);
			match(T__11);
			setState(165); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(164);
				match(ID);
				}
				}
				setState(167); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ID );
			setState(169);
			match(T__12);
			setState(170);
			match(T__13);
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

	public static class ReturnstmtContext extends ParserRuleContext {
		public SumexprContext sumexpr() {
			return getRuleContext(SumexprContext.class,0);
		}
		public ReturnstmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnstmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ACPListener ) ((ACPListener)listener).enterReturnstmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ACPListener ) ((ACPListener)listener).exitReturnstmt(this);
		}
	}

	public final ReturnstmtContext returnstmt() throws RecognitionException {
		ReturnstmtContext _localctx = new ReturnstmtContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_returnstmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			match(T__14);
			setState(173);
			sumexpr(0);
			setState(174);
			match(T__13);
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

	public static class CallContext extends ParserRuleContext {
		public CallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_call; }
	 
		public CallContext() { }
		public void copyFrom(CallContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SimplecallContext extends CallContext {
		public TerminalNode ID() { return getToken(ACPParser.ID, 0); }
		public SumexprContext sumexpr() {
			return getRuleContext(SumexprContext.class,0);
		}
		public SimplecallContext(CallContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ACPListener ) ((ACPListener)listener).enterSimplecall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ACPListener ) ((ACPListener)listener).exitSimplecall(this);
		}
	}

	public final CallContext call() throws RecognitionException {
		CallContext _localctx = new CallContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_call);
		try {
			_localctx = new SimplecallContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			match(ID);
			setState(177);
			match(T__1);
			setState(178);
			sumexpr(0);
			setState(179);
			match(T__2);
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

	public static class StackdeclContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ACPParser.ID, 0); }
		public StackdeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stackdecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ACPListener ) ((ACPListener)listener).enterStackdecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ACPListener ) ((ACPListener)listener).exitStackdecl(this);
		}
	}

	public final StackdeclContext stackdecl() throws RecognitionException {
		StackdeclContext _localctx = new StackdeclContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_stackdecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
			match(T__15);
			setState(182);
			match(ID);
			setState(183);
			match(T__13);
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

	public static class StackoperationContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ACPParser.ID, 0); }
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public StackoperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stackoperation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ACPListener ) ((ACPListener)listener).enterStackoperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ACPListener ) ((ACPListener)listener).exitStackoperation(this);
		}
	}

	public final StackoperationContext stackoperation() throws RecognitionException {
		StackoperationContext _localctx = new StackoperationContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_stackoperation);
		try {
			setState(199);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(185);
				match(ID);
				setState(186);
				match(T__16);
				setState(187);
				match(T__17);
				setState(188);
				match(T__1);
				setState(189);
				factor();
				setState(190);
				match(T__2);
				setState(191);
				match(T__13);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(193);
				match(ID);
				setState(194);
				match(T__16);
				setState(195);
				match(T__18);
				setState(196);
				match(T__1);
				setState(197);
				match(T__2);
				setState(198);
				match(T__13);
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
		public TerminalNode Datatype() { return getToken(ACPParser.Datatype, 0); }
		public TerminalNode ID() { return getToken(ACPParser.ID, 0); }
		public SumexprContext sumexpr() {
			return getRuleContext(SumexprContext.class,0);
		}
		public AssignContext(AssignmentStatmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ACPListener ) ((ACPListener)listener).enterAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ACPListener ) ((ACPListener)listener).exitAssign(this);
		}
	}

	public final AssignmentStatmentContext assignmentStatment() throws RecognitionException {
		AssignmentStatmentContext _localctx = new AssignmentStatmentContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_assignmentStatment);
		try {
			_localctx = new AssignContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			match(Datatype);
			setState(202);
			match(ID);
			setState(203);
			match(T__19);
			setState(204);
			sumexpr(0);
			setState(205);
			match(T__13);
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
		public SumexprContext sumexpr() {
			return getRuleContext(SumexprContext.class,0);
		}
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public AddContext(SumexprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ACPListener ) ((ACPListener)listener).enterAdd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ACPListener ) ((ACPListener)listener).exitAdd(this);
		}
	}
	public static class SubContext extends SumexprContext {
		public SumexprContext sumexpr() {
			return getRuleContext(SumexprContext.class,0);
		}
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public SubContext(SumexprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ACPListener ) ((ACPListener)listener).enterSub(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ACPListener ) ((ACPListener)listener).exitSub(this);
		}
	}
	public static class GototermContext extends SumexprContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public GototermContext(SumexprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ACPListener ) ((ACPListener)listener).enterGototerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ACPListener ) ((ACPListener)listener).exitGototerm(this);
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
		int _startState = 32;
		enterRecursionRule(_localctx, 32, RULE_sumexpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new GototermContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(208);
			term(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(218);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(216);
					switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
					case 1:
						{
						_localctx = new AddContext(new SumexprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_sumexpr);
						setState(210);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(211);
						match(T__20);
						setState(212);
						term(0);
						}
						break;
					case 2:
						{
						_localctx = new SubContext(new SumexprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_sumexpr);
						setState(213);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(214);
						match(T__21);
						setState(215);
						term(0);
						}
						break;
					}
					} 
				}
				setState(220);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
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
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public DivContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ACPListener ) ((ACPListener)listener).enterDiv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ACPListener ) ((ACPListener)listener).exitDiv(this);
		}
	}
	public static class MulContext extends TermContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public MulContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ACPListener ) ((ACPListener)listener).enterMul(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ACPListener ) ((ACPListener)listener).exitMul(this);
		}
	}
	public static class GotofactorContext extends TermContext {
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public GotofactorContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ACPListener ) ((ACPListener)listener).enterGotofactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ACPListener ) ((ACPListener)listener).exitGotofactor(this);
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
		int _startState = 34;
		enterRecursionRule(_localctx, 34, RULE_term, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new GotofactorContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(222);
			factor();
			}
			_ctx.stop = _input.LT(-1);
			setState(232);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(230);
					switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
					case 1:
						{
						_localctx = new MulContext(new TermContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(224);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(225);
						match(T__22);
						setState(226);
						factor();
						}
						break;
					case 2:
						{
						_localctx = new DivContext(new TermContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(227);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(228);
						match(T__23);
						setState(229);
						factor();
						}
						break;
					}
					} 
				}
				setState(234);
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
		public TerminalNode NumberValue() { return getToken(ACPParser.NumberValue, 0); }
		public NumberContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ACPListener ) ((ACPListener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ACPListener ) ((ACPListener)listener).exitNumber(this);
		}
	}
	public static class BooleanContext extends FactorContext {
		public TerminalNode BooleanValue() { return getToken(ACPParser.BooleanValue, 0); }
		public BooleanContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ACPListener ) ((ACPListener)listener).enterBoolean(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ACPListener ) ((ACPListener)listener).exitBoolean(this);
		}
	}
	public static class IdContext extends FactorContext {
		public TerminalNode ID() { return getToken(ACPParser.ID, 0); }
		public IdContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ACPListener ) ((ACPListener)listener).enterId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ACPListener ) ((ACPListener)listener).exitId(this);
		}
	}
	public static class CallfuncContext extends FactorContext {
		public CallContext call() {
			return getRuleContext(CallContext.class,0);
		}
		public CallfuncContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ACPListener ) ((ACPListener)listener).enterCallfunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ACPListener ) ((ACPListener)listener).exitCallfunc(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_factor);
		try {
			setState(239);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				_localctx = new IdContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(235);
				match(ID);
				}
				break;
			case 2:
				_localctx = new NumberContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(236);
				match(NumberValue);
				}
				break;
			case 3:
				_localctx = new BooleanContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(237);
				match(BooleanValue);
				}
				break;
			case 4:
				_localctx = new CallfuncContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(238);
				call();
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 6:
			return compexpr_sempred((CompexprContext)_localctx, predIndex);
		case 7:
			return andcomp_sempred((AndcompContext)_localctx, predIndex);
		case 16:
			return sumexpr_sempred((SumexprContext)_localctx, predIndex);
		case 17:
			return term_sempred((TermContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean compexpr_sempred(CompexprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean andcomp_sempred(AndcompContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean sumexpr_sempred(SumexprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 3);
		case 3:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean term_sempred(TermContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 3);
		case 5:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3 \u00f4\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\3\2\6\2*\n\2\r\2\16\2+\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\6\3\65\n\3\r\3\16\3\66\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\6\3A\n\3\r\3"+
		"\16\3B\3\3\3\3\3\3\6\3H\n\3\r\3\16\3I\5\3L\n\3\3\4\3\4\3\4\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\6\5W\n\5\r\5\16\5X\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\6\5c\n"+
		"\5\r\5\16\5d\3\5\3\5\3\5\3\5\5\5k\n\5\3\6\3\6\3\6\3\6\3\6\3\6\6\6s\n\6"+
		"\r\6\16\6t\3\6\3\6\3\7\3\7\6\7{\n\7\r\7\16\7|\3\7\3\7\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\7\b\u0087\n\b\f\b\16\b\u008a\13\b\3\t\3\t\3\t\3\t\3\t\3\t\7\t"+
		"\u0092\n\t\f\t\16\t\u0095\13\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\5\13\u00a3\n\13\3\f\3\f\3\f\6\f\u00a8\n\f\r\f\16\f\u00a9"+
		"\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3"+
		"\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3"+
		"\20\5\20\u00ca\n\20\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\7\22\u00db\n\22\f\22\16\22\u00de\13\22\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\7\23\u00e9\n\23\f\23\16\23\u00ec"+
		"\13\23\3\24\3\24\3\24\3\24\5\24\u00f2\n\24\3\24\2\6\16\20\"$\25\2\4\6"+
		"\b\n\f\16\20\22\24\26\30\32\34\36 \"$&\2\2\u00fd\2)\3\2\2\2\4K\3\2\2\2"+
		"\6M\3\2\2\2\bj\3\2\2\2\nl\3\2\2\2\fx\3\2\2\2\16\u0080\3\2\2\2\20\u008b"+
		"\3\2\2\2\22\u0096\3\2\2\2\24\u00a2\3\2\2\2\26\u00a4\3\2\2\2\30\u00ae\3"+
		"\2\2\2\32\u00b2\3\2\2\2\34\u00b7\3\2\2\2\36\u00c9\3\2\2\2 \u00cb\3\2\2"+
		"\2\"\u00d1\3\2\2\2$\u00df\3\2\2\2&\u00f1\3\2\2\2(*\5\4\3\2)(\3\2\2\2*"+
		"+\3\2\2\2+)\3\2\2\2+,\3\2\2\2,\3\3\2\2\2-.\7\3\2\2./\7\37\2\2/\60\7\4"+
		"\2\2\60\61\5\6\4\2\61\62\7\5\2\2\62\64\7\6\2\2\63\65\5\24\13\2\64\63\3"+
		"\2\2\2\65\66\3\2\2\2\66\64\3\2\2\2\66\67\3\2\2\2\678\3\2\2\289\7\7\2\2"+
		"9L\3\2\2\2:;\7\3\2\2;<\7\37\2\2<=\7\4\2\2=>\7\5\2\2>@\7\6\2\2?A\5\24\13"+
		"\2@?\3\2\2\2AB\3\2\2\2B@\3\2\2\2BC\3\2\2\2CD\3\2\2\2DE\7\7\2\2EL\3\2\2"+
		"\2FH\5\24\13\2GF\3\2\2\2HI\3\2\2\2IG\3\2\2\2IJ\3\2\2\2JL\3\2\2\2K-\3\2"+
		"\2\2K:\3\2\2\2KG\3\2\2\2L\5\3\2\2\2MN\7\36\2\2NO\7\37\2\2O\7\3\2\2\2P"+
		"Q\7\b\2\2QR\7\4\2\2RS\5\16\b\2ST\7\5\2\2TV\7\6\2\2UW\5\24\13\2VU\3\2\2"+
		"\2WX\3\2\2\2XV\3\2\2\2XY\3\2\2\2YZ\3\2\2\2Z[\7\7\2\2[k\3\2\2\2\\]\7\b"+
		"\2\2]^\7\4\2\2^_\5\16\b\2_`\7\5\2\2`b\7\6\2\2ac\5\24\13\2ba\3\2\2\2cd"+
		"\3\2\2\2db\3\2\2\2de\3\2\2\2ef\3\2\2\2fg\7\7\2\2gh\7\t\2\2hi\5\f\7\2i"+
		"k\3\2\2\2jP\3\2\2\2j\\\3\2\2\2k\t\3\2\2\2lm\7\n\2\2mn\7\4\2\2no\5\16\b"+
		"\2op\7\5\2\2pr\7\6\2\2qs\5\24\13\2rq\3\2\2\2st\3\2\2\2tr\3\2\2\2tu\3\2"+
		"\2\2uv\3\2\2\2vw\7\7\2\2w\13\3\2\2\2xz\7\6\2\2y{\5\24\13\2zy\3\2\2\2{"+
		"|\3\2\2\2|z\3\2\2\2|}\3\2\2\2}~\3\2\2\2~\177\7\7\2\2\177\r\3\2\2\2\u0080"+
		"\u0081\b\b\1\2\u0081\u0082\5\20\t\2\u0082\u0088\3\2\2\2\u0083\u0084\f"+
		"\4\2\2\u0084\u0085\7\13\2\2\u0085\u0087\5\20\t\2\u0086\u0083\3\2\2\2\u0087"+
		"\u008a\3\2\2\2\u0088\u0086\3\2\2\2\u0088\u0089\3\2\2\2\u0089\17\3\2\2"+
		"\2\u008a\u0088\3\2\2\2\u008b\u008c\b\t\1\2\u008c\u008d\5\22\n\2\u008d"+
		"\u0093\3\2\2\2\u008e\u008f\f\4\2\2\u008f\u0090\7\f\2\2\u0090\u0092\5\22"+
		"\n\2\u0091\u008e\3\2\2\2\u0092\u0095\3\2\2\2\u0093\u0091\3\2\2\2\u0093"+
		"\u0094\3\2\2\2\u0094\21\3\2\2\2\u0095\u0093\3\2\2\2\u0096\u0097\5\"\22"+
		"\2\u0097\u0098\7\33\2\2\u0098\u0099\5\"\22\2\u0099\23\3\2\2\2\u009a\u00a3"+
		"\5 \21\2\u009b\u00a3\5\b\5\2\u009c\u00a3\5\n\6\2\u009d\u00a3\5\32\16\2"+
		"\u009e\u00a3\5\30\r\2\u009f\u00a3\5\26\f\2\u00a0\u00a3\5\34\17\2\u00a1"+
		"\u00a3\5\36\20\2\u00a2\u009a\3\2\2\2\u00a2\u009b\3\2\2\2\u00a2\u009c\3"+
		"\2\2\2\u00a2\u009d\3\2\2\2\u00a2\u009e\3\2\2\2\u00a2\u009f\3\2\2\2\u00a2"+
		"\u00a0\3\2\2\2\u00a2\u00a1\3\2\2\2\u00a3\25\3\2\2\2\u00a4\u00a5\7\r\2"+
		"\2\u00a5\u00a7\7\16\2\2\u00a6\u00a8\7\37\2\2\u00a7\u00a6\3\2\2\2\u00a8"+
		"\u00a9\3\2\2\2\u00a9\u00a7\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\u00ab\3\2"+
		"\2\2\u00ab\u00ac\7\17\2\2\u00ac\u00ad\7\20\2\2\u00ad\27\3\2\2\2\u00ae"+
		"\u00af\7\21\2\2\u00af\u00b0\5\"\22\2\u00b0\u00b1\7\20\2\2\u00b1\31\3\2"+
		"\2\2\u00b2\u00b3\7\37\2\2\u00b3\u00b4\7\4\2\2\u00b4\u00b5\5\"\22\2\u00b5"+
		"\u00b6\7\5\2\2\u00b6\33\3\2\2\2\u00b7\u00b8\7\22\2\2\u00b8\u00b9\7\37"+
		"\2\2\u00b9\u00ba\7\20\2\2\u00ba\35\3\2\2\2\u00bb\u00bc\7\37\2\2\u00bc"+
		"\u00bd\7\23\2\2\u00bd\u00be\7\24\2\2\u00be\u00bf\7\4\2\2\u00bf\u00c0\5"+
		"&\24\2\u00c0\u00c1\7\5\2\2\u00c1\u00c2\7\20\2\2\u00c2\u00ca\3\2\2\2\u00c3"+
		"\u00c4\7\37\2\2\u00c4\u00c5\7\23\2\2\u00c5\u00c6\7\25\2\2\u00c6\u00c7"+
		"\7\4\2\2\u00c7\u00c8\7\5\2\2\u00c8\u00ca\7\20\2\2\u00c9\u00bb\3\2\2\2"+
		"\u00c9\u00c3\3\2\2\2\u00ca\37\3\2\2\2\u00cb\u00cc\7\36\2\2\u00cc\u00cd"+
		"\7\37\2\2\u00cd\u00ce\7\26\2\2\u00ce\u00cf\5\"\22\2\u00cf\u00d0\7\20\2"+
		"\2\u00d0!\3\2\2\2\u00d1\u00d2\b\22\1\2\u00d2\u00d3\5$\23\2\u00d3\u00dc"+
		"\3\2\2\2\u00d4\u00d5\f\5\2\2\u00d5\u00d6\7\27\2\2\u00d6\u00db\5$\23\2"+
		"\u00d7\u00d8\f\4\2\2\u00d8\u00d9\7\30\2\2\u00d9\u00db\5$\23\2\u00da\u00d4"+
		"\3\2\2\2\u00da\u00d7\3\2\2\2\u00db\u00de\3\2\2\2\u00dc\u00da\3\2\2\2\u00dc"+
		"\u00dd\3\2\2\2\u00dd#\3\2\2\2\u00de\u00dc\3\2\2\2\u00df\u00e0\b\23\1\2"+
		"\u00e0\u00e1\5&\24\2\u00e1\u00ea\3\2\2\2\u00e2\u00e3\f\5\2\2\u00e3\u00e4"+
		"\7\31\2\2\u00e4\u00e9\5&\24\2\u00e5\u00e6\f\4\2\2\u00e6\u00e7\7\32\2\2"+
		"\u00e7\u00e9\5&\24\2\u00e8\u00e2\3\2\2\2\u00e8\u00e5\3\2\2\2\u00e9\u00ec"+
		"\3\2\2\2\u00ea\u00e8\3\2\2\2\u00ea\u00eb\3\2\2\2\u00eb%\3\2\2\2\u00ec"+
		"\u00ea\3\2\2\2\u00ed\u00f2\7\37\2\2\u00ee\u00f2\7\34\2\2\u00ef\u00f2\7"+
		"\35\2\2\u00f0\u00f2\5\32\16\2\u00f1\u00ed\3\2\2\2\u00f1\u00ee\3\2\2\2"+
		"\u00f1\u00ef\3\2\2\2\u00f1\u00f0\3\2\2\2\u00f2\'\3\2\2\2\26+\66BIKXdj"+
		"t|\u0088\u0093\u00a2\u00a9\u00c9\u00da\u00dc\u00e8\u00ea\u00f1";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}