// Generated from /Users/personal/translation-methods/03-bison-antlr/src/Slylang.g4 by ANTLR 4.9.1

    import java.util.ArrayList;
    import java.util.HashSet;
    import java.util.stream.Collectors;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SlylangLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		IF=1, ELIF=2, ELSE=3, LOOP=4, FOR=5, IN=6, UNTIL=7, BREAK=8, CONTINUE=9, 
		SCAN=10, ECHO=11, RET=12, AND=13, OR=14, XOR=15, NOT=16, NOT_EQ=17, EQ=18, 
		PLUS=19, MINUS=20, MULTIPLY=21, DIVIDE=22, MOD=23, ASSIGN=24, COMMA=25, 
		LP=26, RP=27, LT=28, GT=29, LCB=30, RCB=31, ID=32, INT=33, WS=34;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"IF", "ELIF", "ELSE", "LOOP", "FOR", "IN", "UNTIL", "BREAK", "CONTINUE", 
			"SCAN", "ECHO", "RET", "AND", "OR", "XOR", "NOT", "NOT_EQ", "EQ", "PLUS", 
			"MINUS", "MULTIPLY", "DIVIDE", "MOD", "ASSIGN", "COMMA", "LP", "RP", 
			"LT", "GT", "LCB", "RCB", "ID", "INT", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'if'", "'elif'", "'else'", "'loop'", "'for'", "'in'", "'until'", 
			"'break'", "'continue'", "'scan'", "'echo'", "'ret'", "'and'", "'or'", 
			"'xor'", "'not'", "'!='", "'=='", "'+'", "'-'", "'*'", "'/'", "'%'", 
			"'='", "','", "'('", "')'", "'<'", "'>'", "'{'", "'}'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "IF", "ELIF", "ELSE", "LOOP", "FOR", "IN", "UNTIL", "BREAK", "CONTINUE", 
			"SCAN", "ECHO", "RET", "AND", "OR", "XOR", "NOT", "NOT_EQ", "EQ", "PLUS", 
			"MINUS", "MULTIPLY", "DIVIDE", "MOD", "ASSIGN", "COMMA", "LP", "RP", 
			"LT", "GT", "LCB", "RCB", "ID", "INT", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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


	public SlylangLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Slylang.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2$\u00cd\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4"+
		"\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3"+
		"\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16"+
		"\3\16\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\22\3\22"+
		"\3\22\3\23\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30"+
		"\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37"+
		"\3 \3 \3!\3!\7!\u00b5\n!\f!\16!\u00b8\13!\3\"\5\"\u00bb\n\"\3\"\3\"\3"+
		"\"\7\"\u00c0\n\"\f\"\16\"\u00c3\13\"\5\"\u00c5\n\"\3#\6#\u00c8\n#\r#\16"+
		"#\u00c9\3#\3#\2\2$\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r"+
		"\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33"+
		"\65\34\67\359\36;\37= ?!A\"C#E$\3\2\b\4\2C\\c|\5\2\62;C\\c|\4\2--//\3"+
		"\2\62;\3\2\63;\5\2\13\f\17\17\"\"\2\u00d1\2\3\3\2\2\2\2\5\3\2\2\2\2\7"+
		"\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2"+
		"\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2"+
		"\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2"+
		"\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2"+
		"\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2"+
		"\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\3G\3\2\2\2\5J\3\2\2\2\7O\3\2\2\2\tT"+
		"\3\2\2\2\13Y\3\2\2\2\r]\3\2\2\2\17`\3\2\2\2\21f\3\2\2\2\23l\3\2\2\2\25"+
		"u\3\2\2\2\27z\3\2\2\2\31\177\3\2\2\2\33\u0083\3\2\2\2\35\u0087\3\2\2\2"+
		"\37\u008a\3\2\2\2!\u008e\3\2\2\2#\u0092\3\2\2\2%\u0095\3\2\2\2\'\u0098"+
		"\3\2\2\2)\u009a\3\2\2\2+\u009c\3\2\2\2-\u009e\3\2\2\2/\u00a0\3\2\2\2\61"+
		"\u00a2\3\2\2\2\63\u00a4\3\2\2\2\65\u00a6\3\2\2\2\67\u00a8\3\2\2\29\u00aa"+
		"\3\2\2\2;\u00ac\3\2\2\2=\u00ae\3\2\2\2?\u00b0\3\2\2\2A\u00b2\3\2\2\2C"+
		"\u00ba\3\2\2\2E\u00c7\3\2\2\2GH\7k\2\2HI\7h\2\2I\4\3\2\2\2JK\7g\2\2KL"+
		"\7n\2\2LM\7k\2\2MN\7h\2\2N\6\3\2\2\2OP\7g\2\2PQ\7n\2\2QR\7u\2\2RS\7g\2"+
		"\2S\b\3\2\2\2TU\7n\2\2UV\7q\2\2VW\7q\2\2WX\7r\2\2X\n\3\2\2\2YZ\7h\2\2"+
		"Z[\7q\2\2[\\\7t\2\2\\\f\3\2\2\2]^\7k\2\2^_\7p\2\2_\16\3\2\2\2`a\7w\2\2"+
		"ab\7p\2\2bc\7v\2\2cd\7k\2\2de\7n\2\2e\20\3\2\2\2fg\7d\2\2gh\7t\2\2hi\7"+
		"g\2\2ij\7c\2\2jk\7m\2\2k\22\3\2\2\2lm\7e\2\2mn\7q\2\2no\7p\2\2op\7v\2"+
		"\2pq\7k\2\2qr\7p\2\2rs\7w\2\2st\7g\2\2t\24\3\2\2\2uv\7u\2\2vw\7e\2\2w"+
		"x\7c\2\2xy\7p\2\2y\26\3\2\2\2z{\7g\2\2{|\7e\2\2|}\7j\2\2}~\7q\2\2~\30"+
		"\3\2\2\2\177\u0080\7t\2\2\u0080\u0081\7g\2\2\u0081\u0082\7v\2\2\u0082"+
		"\32\3\2\2\2\u0083\u0084\7c\2\2\u0084\u0085\7p\2\2\u0085\u0086\7f\2\2\u0086"+
		"\34\3\2\2\2\u0087\u0088\7q\2\2\u0088\u0089\7t\2\2\u0089\36\3\2\2\2\u008a"+
		"\u008b\7z\2\2\u008b\u008c\7q\2\2\u008c\u008d\7t\2\2\u008d \3\2\2\2\u008e"+
		"\u008f\7p\2\2\u008f\u0090\7q\2\2\u0090\u0091\7v\2\2\u0091\"\3\2\2\2\u0092"+
		"\u0093\7#\2\2\u0093\u0094\7?\2\2\u0094$\3\2\2\2\u0095\u0096\7?\2\2\u0096"+
		"\u0097\7?\2\2\u0097&\3\2\2\2\u0098\u0099\7-\2\2\u0099(\3\2\2\2\u009a\u009b"+
		"\7/\2\2\u009b*\3\2\2\2\u009c\u009d\7,\2\2\u009d,\3\2\2\2\u009e\u009f\7"+
		"\61\2\2\u009f.\3\2\2\2\u00a0\u00a1\7\'\2\2\u00a1\60\3\2\2\2\u00a2\u00a3"+
		"\7?\2\2\u00a3\62\3\2\2\2\u00a4\u00a5\7.\2\2\u00a5\64\3\2\2\2\u00a6\u00a7"+
		"\7*\2\2\u00a7\66\3\2\2\2\u00a8\u00a9\7+\2\2\u00a98\3\2\2\2\u00aa\u00ab"+
		"\7>\2\2\u00ab:\3\2\2\2\u00ac\u00ad\7@\2\2\u00ad<\3\2\2\2\u00ae\u00af\7"+
		"}\2\2\u00af>\3\2\2\2\u00b0\u00b1\7\177\2\2\u00b1@\3\2\2\2\u00b2\u00b6"+
		"\t\2\2\2\u00b3\u00b5\t\3\2\2\u00b4\u00b3\3\2\2\2\u00b5\u00b8\3\2\2\2\u00b6"+
		"\u00b4\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7B\3\2\2\2\u00b8\u00b6\3\2\2\2"+
		"\u00b9\u00bb\t\4\2\2\u00ba\u00b9\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00c4"+
		"\3\2\2\2\u00bc\u00c5\t\5\2\2\u00bd\u00c1\t\6\2\2\u00be\u00c0\t\5\2\2\u00bf"+
		"\u00be\3\2\2\2\u00c0\u00c3\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c1\u00c2\3\2"+
		"\2\2\u00c2\u00c5\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c4\u00bc\3\2\2\2\u00c4"+
		"\u00bd\3\2\2\2\u00c5D\3\2\2\2\u00c6\u00c8\t\7\2\2\u00c7\u00c6\3\2\2\2"+
		"\u00c8\u00c9\3\2\2\2\u00c9\u00c7\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00cb"+
		"\3\2\2\2\u00cb\u00cc\b#\2\2\u00ccF\3\2\2\2\b\2\u00b6\u00ba\u00c1\u00c4"+
		"\u00c9\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}