// Generated from ACP.g4 by ANTLR 4.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ACPLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__23=1, T__22=2, T__21=3, T__20=4, T__19=5, T__18=6, T__17=7, T__16=8, 
		T__15=9, T__14=10, T__13=11, T__12=12, T__11=13, T__10=14, T__9=15, T__8=16, 
		T__7=17, T__6=18, T__5=19, T__4=20, T__3=21, T__2=22, T__1=23, T__0=24, 
		CMPOP=25, NumberValue=26, BooleanValue=27, Datatype=28, ID=29, WS=30;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'/'", "'return'", "';'", "'['", "'while'", "'>>'", "'<<'", "'='", "']'", 
		"'if'", "'or'", "'push'", "'print'", "'else'", "'pop'", "'function'", 
		"'stack'", "'('", "')'", "'*'", "'and'", "'+'", "'-'", "'.'", "CMPOP", 
		"NumberValue", "BooleanValue", "Datatype", "ID", "WS"
	};
	public static final String[] ruleNames = {
		"T__23", "T__22", "T__21", "T__20", "T__19", "T__18", "T__17", "T__16", 
		"T__15", "T__14", "T__13", "T__12", "T__11", "T__10", "T__9", "T__8", 
		"T__7", "T__6", "T__5", "T__4", "T__3", "T__2", "T__1", "T__0", "CMPOP", 
		"NumberValue", "BooleanValue", "Datatype", "ID", "WS"
	};


	public ACPLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "ACP.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2 \u00c2\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\3\2\3\2\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7"+
		"\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f\3\r\3"+
		"\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17"+
		"\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\26"+
		"\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\5\32\u009d\n\32\3\33\6\33\u00a0\n\33\r\33\16\33\u00a1\3\34\3\34\3\34"+
		"\3\34\3\34\5\34\u00a9\n\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\5\35\u00b5\n\35\3\36\6\36\u00b8\n\36\r\36\16\36\u00b9\3\37\6\37"+
		"\u00bd\n\37\r\37\16\37\u00be\3\37\3\37\2\2 \3\3\5\4\7\5\t\6\13\7\r\b\17"+
		"\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+"+
		"\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= \3\2\6\4\2>>@@\3\2\62;\5"+
		"\2\62;C\\c|\5\2\13\f\17\17\"\"\u00c9\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2"+
		"\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23"+
		"\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2"+
		"\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2"+
		"\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3"+
		"\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\3?\3\2\2\2\5A\3\2"+
		"\2\2\7H\3\2\2\2\tJ\3\2\2\2\13L\3\2\2\2\rR\3\2\2\2\17U\3\2\2\2\21X\3\2"+
		"\2\2\23Z\3\2\2\2\25\\\3\2\2\2\27_\3\2\2\2\31b\3\2\2\2\33g\3\2\2\2\35m"+
		"\3\2\2\2\37r\3\2\2\2!v\3\2\2\2#\177\3\2\2\2%\u0085\3\2\2\2\'\u0087\3\2"+
		"\2\2)\u0089\3\2\2\2+\u008b\3\2\2\2-\u008f\3\2\2\2/\u0091\3\2\2\2\61\u0093"+
		"\3\2\2\2\63\u009c\3\2\2\2\65\u009f\3\2\2\2\67\u00a8\3\2\2\29\u00b4\3\2"+
		"\2\2;\u00b7\3\2\2\2=\u00bc\3\2\2\2?@\7\61\2\2@\4\3\2\2\2AB\7t\2\2BC\7"+
		"g\2\2CD\7v\2\2DE\7w\2\2EF\7t\2\2FG\7p\2\2G\6\3\2\2\2HI\7=\2\2I\b\3\2\2"+
		"\2JK\7]\2\2K\n\3\2\2\2LM\7y\2\2MN\7j\2\2NO\7k\2\2OP\7n\2\2PQ\7g\2\2Q\f"+
		"\3\2\2\2RS\7@\2\2ST\7@\2\2T\16\3\2\2\2UV\7>\2\2VW\7>\2\2W\20\3\2\2\2X"+
		"Y\7?\2\2Y\22\3\2\2\2Z[\7_\2\2[\24\3\2\2\2\\]\7k\2\2]^\7h\2\2^\26\3\2\2"+
		"\2_`\7q\2\2`a\7t\2\2a\30\3\2\2\2bc\7r\2\2cd\7w\2\2de\7u\2\2ef\7j\2\2f"+
		"\32\3\2\2\2gh\7r\2\2hi\7t\2\2ij\7k\2\2jk\7p\2\2kl\7v\2\2l\34\3\2\2\2m"+
		"n\7g\2\2no\7n\2\2op\7u\2\2pq\7g\2\2q\36\3\2\2\2rs\7r\2\2st\7q\2\2tu\7"+
		"r\2\2u \3\2\2\2vw\7h\2\2wx\7w\2\2xy\7p\2\2yz\7e\2\2z{\7v\2\2{|\7k\2\2"+
		"|}\7q\2\2}~\7p\2\2~\"\3\2\2\2\177\u0080\7u\2\2\u0080\u0081\7v\2\2\u0081"+
		"\u0082\7c\2\2\u0082\u0083\7e\2\2\u0083\u0084\7m\2\2\u0084$\3\2\2\2\u0085"+
		"\u0086\7*\2\2\u0086&\3\2\2\2\u0087\u0088\7+\2\2\u0088(\3\2\2\2\u0089\u008a"+
		"\7,\2\2\u008a*\3\2\2\2\u008b\u008c\7c\2\2\u008c\u008d\7p\2\2\u008d\u008e"+
		"\7f\2\2\u008e,\3\2\2\2\u008f\u0090\7-\2\2\u0090.\3\2\2\2\u0091\u0092\7"+
		"/\2\2\u0092\60\3\2\2\2\u0093\u0094\7\60\2\2\u0094\62\3\2\2\2\u0095\u0096"+
		"\7>\2\2\u0096\u009d\7?\2\2\u0097\u0098\7@\2\2\u0098\u009d\7?\2\2\u0099"+
		"\u009d\t\2\2\2\u009a\u009b\7?\2\2\u009b\u009d\7?\2\2\u009c\u0095\3\2\2"+
		"\2\u009c\u0097\3\2\2\2\u009c\u0099\3\2\2\2\u009c\u009a\3\2\2\2\u009d\64"+
		"\3\2\2\2\u009e\u00a0\t\3\2\2\u009f\u009e\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1"+
		"\u009f\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\66\3\2\2\2\u00a3\u00a4\7[\2\2"+
		"\u00a4\u00a5\7G\2\2\u00a5\u00a9\7U\2\2\u00a6\u00a7\7P\2\2\u00a7\u00a9"+
		"\7Q\2\2\u00a8\u00a3\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a98\3\2\2\2\u00aa\u00ab"+
		"\7k\2\2\u00ab\u00ac\7p\2\2\u00ac\u00b5\7v\2\2\u00ad\u00ae\7d\2\2\u00ae"+
		"\u00af\7q\2\2\u00af\u00b0\7q\2\2\u00b0\u00b1\7n\2\2\u00b1\u00b2\7g\2\2"+
		"\u00b2\u00b3\7c\2\2\u00b3\u00b5\7p\2\2\u00b4\u00aa\3\2\2\2\u00b4\u00ad"+
		"\3\2\2\2\u00b5:\3\2\2\2\u00b6\u00b8\t\4\2\2\u00b7\u00b6\3\2\2\2\u00b8"+
		"\u00b9\3\2\2\2\u00b9\u00b7\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba<\3\2\2\2"+
		"\u00bb\u00bd\t\5\2\2\u00bc\u00bb\3\2\2\2\u00bd\u00be\3\2\2\2\u00be\u00bc"+
		"\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0\u00c1\b\37\2\2"+
		"\u00c1>\3\2\2\2\t\2\u009c\u00a1\u00a8\u00b4\u00b9\u00be\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}