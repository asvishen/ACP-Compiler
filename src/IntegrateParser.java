// Generated from Integrate.g4 by ANTLR 4.5
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class IntegrateParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, CMPOP=20, NumberValue=21, BooleanValue=22, Datatype=23, 
		ID=24, WS=25;
	public static final int
		RULE_start = 0, RULE_func = 1, RULE_params = 2, RULE_ifstmt = 3, RULE_whilestmt = 4, 
		RULE_elsepart = 5, RULE_compexpr = 6, RULE_block = 7, RULE_printstmt = 8, 
		RULE_returnstmt = 9, RULE_call = 10, RULE_assignmentStatment = 11, RULE_sumexpr = 12, 
		RULE_term = 13, RULE_factor = 14;
	public static final String[] ruleNames = {
		"start", "func", "params", "ifstmt", "whilestmt", "elsepart", "compexpr", 
		"block", "printstmt", "returnstmt", "call", "assignmentStatment", "sumexpr", 
		"term", "factor"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'<<'", "'>>'", "'function'", "'('", "')'", "'main()'", "'if'", 
		"'else'", "'while'", "'print'", "'['", "']'", "';'", "'return'", "'='", 
		"'+'", "'-'", "'*'", "'/'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, "CMPOP", "NumberValue", 
		"BooleanValue", "Datatype", "ID", "WS"
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
	public String getGrammarFileName() { return "Integrate.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public IntegrateParser(TokenStream input) {
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IntegrateVisitor ) return ((IntegrateVisitor<? extends T>)visitor).visitStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(30);
			match(T__0);
			setState(32); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(31);
				func();
				}
				}
				setState(34); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__5) | (1L << T__6) | (1L << T__8) | (1L << T__9) | (1L << T__13) | (1L << Datatype) | (1L << ID))) != 0) );
			setState(36);
			match(T__1);
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
		public TerminalNode ID() { return getToken(IntegrateParser.ID, 0); }
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public FuncwithoutparamContext(FuncContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IntegrateVisitor ) return ((IntegrateVisitor<? extends T>)visitor).visitFuncwithoutparam(this);
			else return visitor.visitChildren(this);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IntegrateVisitor ) return ((IntegrateVisitor<? extends T>)visitor).visitJustAnotherBlock(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MainContext extends FuncContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public MainContext(FuncContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IntegrateVisitor ) return ((IntegrateVisitor<? extends T>)visitor).visitMain(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FuncwithparamContext extends FuncContext {
		public TerminalNode ID() { return getToken(IntegrateParser.ID, 0); }
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IntegrateVisitor ) return ((IntegrateVisitor<? extends T>)visitor).visitFuncwithparam(this);
			else return visitor.visitChildren(this);
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
				setState(38);
				match(T__2);
				setState(39);
				match(ID);
				setState(40);
				match(T__3);
				setState(41);
				params();
				setState(42);
				match(T__4);
				setState(43);
				match(T__0);
				setState(45); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(44);
					block();
					}
					}
					setState(47); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__8) | (1L << T__9) | (1L << T__13) | (1L << Datatype) | (1L << ID))) != 0) );
				setState(49);
				match(T__1);
				}
				break;
			case 2:
				_localctx = new FuncwithoutparamContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(51);
				match(T__2);
				setState(52);
				match(ID);
				setState(53);
				match(T__3);
				setState(54);
				match(T__4);
				setState(55);
				match(T__0);
				setState(57); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(56);
					block();
					}
					}
					setState(59); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__8) | (1L << T__9) | (1L << T__13) | (1L << Datatype) | (1L << ID))) != 0) );
				setState(61);
				match(T__1);
				}
				break;
			case 3:
				_localctx = new MainContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(63);
				match(T__5);
				setState(64);
				match(T__0);
				setState(65);
				block();
				setState(66);
				match(T__1);
				}
				break;
			case 4:
				_localctx = new JustAnotherBlockContext(_localctx);
				enterOuterAlt(_localctx, 4);
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
		public TerminalNode Datatype() { return getToken(IntegrateParser.Datatype, 0); }
		public TerminalNode ID() { return getToken(IntegrateParser.ID, 0); }
		public ParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_params; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IntegrateVisitor ) return ((IntegrateVisitor<? extends T>)visitor).visitParams(this);
			else return visitor.visitChildren(this);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IntegrateVisitor ) return ((IntegrateVisitor<? extends T>)visitor).visitIfwithout(this);
			else return visitor.visitChildren(this);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IntegrateVisitor ) return ((IntegrateVisitor<? extends T>)visitor).visitIfonly(this);
			else return visitor.visitChildren(this);
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
				match(T__6);
				setState(79);
				match(T__3);
				setState(80);
				compexpr();
				setState(81);
				match(T__4);
				setState(82);
				match(T__0);
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
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__8) | (1L << T__9) | (1L << T__13) | (1L << Datatype) | (1L << ID))) != 0) );
				setState(88);
				match(T__1);
				}
				break;
			case 2:
				_localctx = new IfwithoutContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(90);
				match(T__6);
				setState(91);
				match(T__3);
				setState(92);
				compexpr();
				setState(93);
				match(T__4);
				setState(94);
				match(T__0);
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
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__8) | (1L << T__9) | (1L << T__13) | (1L << Datatype) | (1L << ID))) != 0) );
				setState(100);
				match(T__1);
				setState(101);
				match(T__7);
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
		public List<CompexprContext> compexpr() {
			return getRuleContexts(CompexprContext.class);
		}
		public CompexprContext compexpr(int i) {
			return getRuleContext(CompexprContext.class,i);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IntegrateVisitor ) return ((IntegrateVisitor<? extends T>)visitor).visitWhilestmt(this);
			else return visitor.visitChildren(this);
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
			match(T__8);
			setState(107);
			match(T__3);
			setState(109); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(108);
				compexpr();
				}
				}
				setState(111); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NumberValue) | (1L << BooleanValue) | (1L << ID))) != 0) );
			setState(113);
			match(T__4);
			setState(114);
			match(T__0);
			setState(116); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(115);
				block();
				}
				}
				setState(118); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__8) | (1L << T__9) | (1L << T__13) | (1L << Datatype) | (1L << ID))) != 0) );
			setState(120);
			match(T__1);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IntegrateVisitor ) return ((IntegrateVisitor<? extends T>)visitor).visitElsepart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElsepartContext elsepart() throws RecognitionException {
		ElsepartContext _localctx = new ElsepartContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_elsepart);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			match(T__0);
			setState(124); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(123);
				block();
				}
				}
				setState(126); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__8) | (1L << T__9) | (1L << T__13) | (1L << Datatype) | (1L << ID))) != 0) );
			setState(128);
			match(T__1);
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
	public static class CompContext extends CompexprContext {
		public List<SumexprContext> sumexpr() {
			return getRuleContexts(SumexprContext.class);
		}
		public SumexprContext sumexpr(int i) {
			return getRuleContext(SumexprContext.class,i);
		}
		public TerminalNode CMPOP() { return getToken(IntegrateParser.CMPOP, 0); }
		public CompContext(CompexprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IntegrateVisitor ) return ((IntegrateVisitor<? extends T>)visitor).visitComp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompexprContext compexpr() throws RecognitionException {
		CompexprContext _localctx = new CompexprContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_compexpr);
		try {
			_localctx = new CompContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			sumexpr(0);
			setState(131);
			match(CMPOP);
			setState(132);
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
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IntegrateVisitor ) return ((IntegrateVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_block);
		try {
			setState(140);
			switch (_input.LA(1)) {
			case Datatype:
				enterOuterAlt(_localctx, 1);
				{
				setState(134);
				assignmentStatment();
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 2);
				{
				setState(135);
				ifstmt();
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 3);
				{
				setState(136);
				whilestmt();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 4);
				{
				setState(137);
				call();
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 5);
				{
				setState(138);
				returnstmt();
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 6);
				{
				setState(139);
				printstmt();
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

	public static class PrintstmtContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(IntegrateParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(IntegrateParser.ID, i);
		}
		public PrintstmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printstmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IntegrateVisitor ) return ((IntegrateVisitor<? extends T>)visitor).visitPrintstmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintstmtContext printstmt() throws RecognitionException {
		PrintstmtContext _localctx = new PrintstmtContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_printstmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			match(T__9);
			setState(143);
			match(T__10);
			setState(145); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(144);
				match(ID);
				}
				}
				setState(147); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ID );
			setState(149);
			match(T__11);
			setState(150);
			match(T__12);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IntegrateVisitor ) return ((IntegrateVisitor<? extends T>)visitor).visitReturnstmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnstmtContext returnstmt() throws RecognitionException {
		ReturnstmtContext _localctx = new ReturnstmtContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_returnstmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			match(T__13);
			setState(153);
			sumexpr(0);
			setState(154);
			match(T__12);
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
		public TerminalNode ID() { return getToken(IntegrateParser.ID, 0); }
		public SumexprContext sumexpr() {
			return getRuleContext(SumexprContext.class,0);
		}
		public CallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_call; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IntegrateVisitor ) return ((IntegrateVisitor<? extends T>)visitor).visitCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CallContext call() throws RecognitionException {
		CallContext _localctx = new CallContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_call);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			match(ID);
			setState(157);
			match(T__3);
			setState(158);
			sumexpr(0);
			setState(159);
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
		public TerminalNode Datatype() { return getToken(IntegrateParser.Datatype, 0); }
		public TerminalNode ID() { return getToken(IntegrateParser.ID, 0); }
		public SumexprContext sumexpr() {
			return getRuleContext(SumexprContext.class,0);
		}
		public AssignContext(AssignmentStatmentContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IntegrateVisitor ) return ((IntegrateVisitor<? extends T>)visitor).visitAssign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentStatmentContext assignmentStatment() throws RecognitionException {
		AssignmentStatmentContext _localctx = new AssignmentStatmentContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_assignmentStatment);
		try {
			_localctx = new AssignContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			match(Datatype);
			setState(162);
			match(ID);
			setState(163);
			match(T__14);
			setState(164);
			sumexpr(0);
			setState(165);
			match(T__12);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IntegrateVisitor ) return ((IntegrateVisitor<? extends T>)visitor).visitAdd(this);
			else return visitor.visitChildren(this);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IntegrateVisitor ) return ((IntegrateVisitor<? extends T>)visitor).visitSub(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GototermContext extends SumexprContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public GototermContext(SumexprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IntegrateVisitor ) return ((IntegrateVisitor<? extends T>)visitor).visitGototerm(this);
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
		int _startState = 24;
		enterRecursionRule(_localctx, 24, RULE_sumexpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new GototermContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(168);
			term(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(178);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(176);
					switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
					case 1:
						{
						_localctx = new AddContext(new SumexprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_sumexpr);
						setState(170);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(171);
						match(T__15);
						setState(172);
						term(0);
						}
						break;
					case 2:
						{
						_localctx = new SubContext(new SumexprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_sumexpr);
						setState(173);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(174);
						match(T__16);
						setState(175);
						term(0);
						}
						break;
					}
					} 
				}
				setState(180);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IntegrateVisitor ) return ((IntegrateVisitor<? extends T>)visitor).visitDiv(this);
			else return visitor.visitChildren(this);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IntegrateVisitor ) return ((IntegrateVisitor<? extends T>)visitor).visitMul(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GotofactorContext extends TermContext {
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public GotofactorContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IntegrateVisitor ) return ((IntegrateVisitor<? extends T>)visitor).visitGotofactor(this);
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
		int _startState = 26;
		enterRecursionRule(_localctx, 26, RULE_term, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new GotofactorContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(182);
			factor();
			}
			_ctx.stop = _input.LT(-1);
			setState(192);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(190);
					switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
					case 1:
						{
						_localctx = new MulContext(new TermContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(184);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(185);
						match(T__17);
						setState(186);
						factor();
						}
						break;
					case 2:
						{
						_localctx = new DivContext(new TermContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(187);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(188);
						match(T__18);
						setState(189);
						factor();
						}
						break;
					}
					} 
				}
				setState(194);
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
		public TerminalNode NumberValue() { return getToken(IntegrateParser.NumberValue, 0); }
		public NumberContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IntegrateVisitor ) return ((IntegrateVisitor<? extends T>)visitor).visitNumber(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BooleanContext extends FactorContext {
		public TerminalNode BooleanValue() { return getToken(IntegrateParser.BooleanValue, 0); }
		public BooleanContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IntegrateVisitor ) return ((IntegrateVisitor<? extends T>)visitor).visitBoolean(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IdContext extends FactorContext {
		public TerminalNode ID() { return getToken(IntegrateParser.ID, 0); }
		public IdContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IntegrateVisitor ) return ((IntegrateVisitor<? extends T>)visitor).visitId(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CallfuncContext extends FactorContext {
		public CallContext call() {
			return getRuleContext(CallContext.class,0);
		}
		public CallfuncContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IntegrateVisitor ) return ((IntegrateVisitor<? extends T>)visitor).visitCallfunc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_factor);
		try {
			setState(199);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				_localctx = new IdContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(195);
				match(ID);
				}
				break;
			case 2:
				_localctx = new NumberContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(196);
				match(NumberValue);
				}
				break;
			case 3:
				_localctx = new BooleanContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(197);
				match(BooleanValue);
				}
				break;
			case 4:
				_localctx = new CallfuncContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(198);
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
		case 12:
			return sumexpr_sempred((SumexprContext)_localctx, predIndex);
		case 13:
			return term_sempred((TermContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean sumexpr_sempred(SumexprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean term_sempred(TermContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 3);
		case 3:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\33\u00cc\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\3\2\6\2#\n\2\r"+
		"\2\16\2$\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\6\3\60\n\3\r\3\16\3\61\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\6\3<\n\3\r\3\16\3=\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\6\3H\n\3\r\3\16\3I\5\3L\n\3\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\6\5W\n\5\r\5\16\5X\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\6\5c\n\5\r\5"+
		"\16\5d\3\5\3\5\3\5\3\5\5\5k\n\5\3\6\3\6\3\6\6\6p\n\6\r\6\16\6q\3\6\3\6"+
		"\3\6\6\6w\n\6\r\6\16\6x\3\6\3\6\3\7\3\7\6\7\177\n\7\r\7\16\7\u0080\3\7"+
		"\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u008f\n\t\3\n\3\n\3\n"+
		"\6\n\u0094\n\n\r\n\16\n\u0095\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f"+
		"\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\7\16\u00b3\n\16\f\16\16\16\u00b6\13\16\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\7\17\u00c1\n\17\f\17\16\17\u00c4\13\17\3\20"+
		"\3\20\3\20\3\20\5\20\u00ca\n\20\3\20\2\4\32\34\21\2\4\6\b\n\f\16\20\22"+
		"\24\26\30\32\34\36\2\2\u00d6\2 \3\2\2\2\4K\3\2\2\2\6M\3\2\2\2\bj\3\2\2"+
		"\2\nl\3\2\2\2\f|\3\2\2\2\16\u0084\3\2\2\2\20\u008e\3\2\2\2\22\u0090\3"+
		"\2\2\2\24\u009a\3\2\2\2\26\u009e\3\2\2\2\30\u00a3\3\2\2\2\32\u00a9\3\2"+
		"\2\2\34\u00b7\3\2\2\2\36\u00c9\3\2\2\2 \"\7\3\2\2!#\5\4\3\2\"!\3\2\2\2"+
		"#$\3\2\2\2$\"\3\2\2\2$%\3\2\2\2%&\3\2\2\2&\'\7\4\2\2\'\3\3\2\2\2()\7\5"+
		"\2\2)*\7\32\2\2*+\7\6\2\2+,\5\6\4\2,-\7\7\2\2-/\7\3\2\2.\60\5\20\t\2/"+
		".\3\2\2\2\60\61\3\2\2\2\61/\3\2\2\2\61\62\3\2\2\2\62\63\3\2\2\2\63\64"+
		"\7\4\2\2\64L\3\2\2\2\65\66\7\5\2\2\66\67\7\32\2\2\678\7\6\2\289\7\7\2"+
		"\29;\7\3\2\2:<\5\20\t\2;:\3\2\2\2<=\3\2\2\2=;\3\2\2\2=>\3\2\2\2>?\3\2"+
		"\2\2?@\7\4\2\2@L\3\2\2\2AB\7\b\2\2BC\7\3\2\2CD\5\20\t\2DE\7\4\2\2EL\3"+
		"\2\2\2FH\5\20\t\2GF\3\2\2\2HI\3\2\2\2IG\3\2\2\2IJ\3\2\2\2JL\3\2\2\2K("+
		"\3\2\2\2K\65\3\2\2\2KA\3\2\2\2KG\3\2\2\2L\5\3\2\2\2MN\7\31\2\2NO\7\32"+
		"\2\2O\7\3\2\2\2PQ\7\t\2\2QR\7\6\2\2RS\5\16\b\2ST\7\7\2\2TV\7\3\2\2UW\5"+
		"\20\t\2VU\3\2\2\2WX\3\2\2\2XV\3\2\2\2XY\3\2\2\2YZ\3\2\2\2Z[\7\4\2\2[k"+
		"\3\2\2\2\\]\7\t\2\2]^\7\6\2\2^_\5\16\b\2_`\7\7\2\2`b\7\3\2\2ac\5\20\t"+
		"\2ba\3\2\2\2cd\3\2\2\2db\3\2\2\2de\3\2\2\2ef\3\2\2\2fg\7\4\2\2gh\7\n\2"+
		"\2hi\5\f\7\2ik\3\2\2\2jP\3\2\2\2j\\\3\2\2\2k\t\3\2\2\2lm\7\13\2\2mo\7"+
		"\6\2\2np\5\16\b\2on\3\2\2\2pq\3\2\2\2qo\3\2\2\2qr\3\2\2\2rs\3\2\2\2st"+
		"\7\7\2\2tv\7\3\2\2uw\5\20\t\2vu\3\2\2\2wx\3\2\2\2xv\3\2\2\2xy\3\2\2\2"+
		"yz\3\2\2\2z{\7\4\2\2{\13\3\2\2\2|~\7\3\2\2}\177\5\20\t\2~}\3\2\2\2\177"+
		"\u0080\3\2\2\2\u0080~\3\2\2\2\u0080\u0081\3\2\2\2\u0081\u0082\3\2\2\2"+
		"\u0082\u0083\7\4\2\2\u0083\r\3\2\2\2\u0084\u0085\5\32\16\2\u0085\u0086"+
		"\7\26\2\2\u0086\u0087\5\32\16\2\u0087\17\3\2\2\2\u0088\u008f\5\30\r\2"+
		"\u0089\u008f\5\b\5\2\u008a\u008f\5\n\6\2\u008b\u008f\5\26\f\2\u008c\u008f"+
		"\5\24\13\2\u008d\u008f\5\22\n\2\u008e\u0088\3\2\2\2\u008e\u0089\3\2\2"+
		"\2\u008e\u008a\3\2\2\2\u008e\u008b\3\2\2\2\u008e\u008c\3\2\2\2\u008e\u008d"+
		"\3\2\2\2\u008f\21\3\2\2\2\u0090\u0091\7\f\2\2\u0091\u0093\7\r\2\2\u0092"+
		"\u0094\7\32\2\2\u0093\u0092\3\2\2\2\u0094\u0095\3\2\2\2\u0095\u0093\3"+
		"\2\2\2\u0095\u0096\3\2\2\2\u0096\u0097\3\2\2\2\u0097\u0098\7\16\2\2\u0098"+
		"\u0099\7\17\2\2\u0099\23\3\2\2\2\u009a\u009b\7\20\2\2\u009b\u009c\5\32"+
		"\16\2\u009c\u009d\7\17\2\2\u009d\25\3\2\2\2\u009e\u009f\7\32\2\2\u009f"+
		"\u00a0\7\6\2\2\u00a0\u00a1\5\32\16\2\u00a1\u00a2\7\7\2\2\u00a2\27\3\2"+
		"\2\2\u00a3\u00a4\7\31\2\2\u00a4\u00a5\7\32\2\2\u00a5\u00a6\7\21\2\2\u00a6"+
		"\u00a7\5\32\16\2\u00a7\u00a8\7\17\2\2\u00a8\31\3\2\2\2\u00a9\u00aa\b\16"+
		"\1\2\u00aa\u00ab\5\34\17\2\u00ab\u00b4\3\2\2\2\u00ac\u00ad\f\5\2\2\u00ad"+
		"\u00ae\7\22\2\2\u00ae\u00b3\5\34\17\2\u00af\u00b0\f\4\2\2\u00b0\u00b1"+
		"\7\23\2\2\u00b1\u00b3\5\34\17\2\u00b2\u00ac\3\2\2\2\u00b2\u00af\3\2\2"+
		"\2\u00b3\u00b6\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5\33"+
		"\3\2\2\2\u00b6\u00b4\3\2\2\2\u00b7\u00b8\b\17\1\2\u00b8\u00b9\5\36\20"+
		"\2\u00b9\u00c2\3\2\2\2\u00ba\u00bb\f\5\2\2\u00bb\u00bc\7\24\2\2\u00bc"+
		"\u00c1\5\36\20\2\u00bd\u00be\f\4\2\2\u00be\u00bf\7\25\2\2\u00bf\u00c1"+
		"\5\36\20\2\u00c0\u00ba\3\2\2\2\u00c0\u00bd\3\2\2\2\u00c1\u00c4\3\2\2\2"+
		"\u00c2\u00c0\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3\35\3\2\2\2\u00c4\u00c2"+
		"\3\2\2\2\u00c5\u00ca\7\32\2\2\u00c6\u00ca\7\27\2\2\u00c7\u00ca\7\30\2"+
		"\2\u00c8\u00ca\5\26\f\2\u00c9\u00c5\3\2\2\2\u00c9\u00c6\3\2\2\2\u00c9"+
		"\u00c7\3\2\2\2\u00c9\u00c8\3\2\2\2\u00ca\37\3\2\2\2\24$\61=IKXdjqx\u0080"+
		"\u008e\u0095\u00b2\u00b4\u00c0\u00c2\u00c9";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}