// Generated from Sparky.g4 by ANTLR 4.8
package sparky;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SparkyLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		YUPNUP=1, INTEGER=2, STRING=3, DOUBLE=4, DECIMAL=5, CHAR=6, NUMBER=7, 
		STUFF=8, BOOLEANVALUE=9, YUP=10, NOPE=11, IF=12, ELSE=13, WHILE=14, LSmoothBrace=15, 
		RSmoothBrace=16, LCurlyBrace=17, RCurlyBrace=18, LSquareBrace=19, RSquareBrace=20, 
		SEMICOLON=21, COMMA=22, YESNOOPERATOR=23, EQUALTO=24, ASSEQ=25, PLUS=26, 
		MINUS=27, MUL=28, DIV=29, LESS_THAN=30, MORE_THAN=31, LESS_THAN_EQ=32, 
		MORE_THAN_EQ=33, WS=34, LIVE=35, DIE=36, FI=37, THEN=38, LOOP=39, POOL=40;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"YUPNUP", "INTEGER", "STRING", "DOUBLE", "DECIMAL", "CHAR", "NUMBER", 
			"STUFF", "BOOLEANVALUE", "YUP", "NOPE", "IF", "ELSE", "WHILE", "LSmoothBrace", 
			"RSmoothBrace", "LCurlyBrace", "RCurlyBrace", "LSquareBrace", "RSquareBrace", 
			"SEMICOLON", "COMMA", "YESNOOPERATOR", "EQUALTO", "ASSEQ", "PLUS", "MINUS", 
			"MUL", "DIV", "LESS_THAN", "MORE_THAN", "LESS_THAN_EQ", "MORE_THAN_EQ", 
			"WS", "LIVE", "DIE", "FI", "THEN", "LOOP", "POOL", "T", "H", "E", "N", 
			"I", "L", "O", "P", "F", "V", "D"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'boolean'", "'int'", "'string'", "'double'", "'float'", "'char'", 
			null, null, null, "'true'", "'false'", "'if'", "'else'", "'while'", "'('", 
			"')'", "'{'", "'}'", "'['", "']'", "';'", "','", null, "'='", "'=='", 
			"'+'", "'-'", "'*'", "'/'", "'<'", "'>'", "'<='", "'>='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "YUPNUP", "INTEGER", "STRING", "DOUBLE", "DECIMAL", "CHAR", "NUMBER", 
			"STUFF", "BOOLEANVALUE", "YUP", "NOPE", "IF", "ELSE", "WHILE", "LSmoothBrace", 
			"RSmoothBrace", "LCurlyBrace", "RCurlyBrace", "LSquareBrace", "RSquareBrace", 
			"SEMICOLON", "COMMA", "YESNOOPERATOR", "EQUALTO", "ASSEQ", "PLUS", "MINUS", 
			"MUL", "DIV", "LESS_THAN", "MORE_THAN", "LESS_THAN_EQ", "MORE_THAN_EQ", 
			"WS", "LIVE", "DIE", "FI", "THEN", "LOOP", "POOL"
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


	public SparkyLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Sparky.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2*\u011d\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7"+
		"\3\7\3\7\3\7\3\b\6\b\u0090\n\b\r\b\16\b\u0091\3\t\3\t\7\t\u0096\n\t\f"+
		"\t\16\t\u0099\13\t\3\n\3\n\5\n\u009d\n\n\3\13\3\13\3\13\3\13\3\13\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3"+
		"\17\3\17\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3"+
		"\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\30\3\30\3\30\5\30\u00cd\n\30"+
		"\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37"+
		"\3\37\3 \3 \3!\3!\3!\3\"\3\"\3\"\3#\6#\u00e7\n#\r#\16#\u00e8\3#\3#\3$"+
		"\3$\3$\3$\3$\3%\3%\3%\3%\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3"+
		")\3)\3)\3)\3)\3*\3*\3+\3+\3,\3,\3-\3-\3.\3.\3/\3/\3\60\3\60\3\61\3\61"+
		"\3\62\3\62\3\63\3\63\3\64\3\64\2\2\65\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21"+
		"\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30"+
		"/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S\2U\2W\2"+
		"Y\2[\2]\2_\2a\2c\2e\2g\2\3\2\21\3\2\62;\5\2C\\aac|\6\2\62;C\\aac|\5\2"+
		"\13\f\16\17\"\"\4\2VVvv\4\2JJjj\4\2GGgg\4\2PPpp\4\2KKkk\4\2NNnn\4\2QQ"+
		"qq\4\2RRrr\4\2HHhh\4\2XXxx\4\2FFff\2\u0119\2\3\3\2\2\2\2\5\3\2\2\2\2\7"+
		"\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2"+
		"\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2"+
		"\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2"+
		"\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2"+
		"\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2"+
		"\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M"+
		"\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\3i\3\2\2\2\5q\3\2\2\2\7u\3\2\2\2\t|\3\2"+
		"\2\2\13\u0083\3\2\2\2\r\u0089\3\2\2\2\17\u008f\3\2\2\2\21\u0093\3\2\2"+
		"\2\23\u009c\3\2\2\2\25\u009e\3\2\2\2\27\u00a3\3\2\2\2\31\u00a9\3\2\2\2"+
		"\33\u00ac\3\2\2\2\35\u00b1\3\2\2\2\37\u00b7\3\2\2\2!\u00b9\3\2\2\2#\u00bb"+
		"\3\2\2\2%\u00bd\3\2\2\2\'\u00bf\3\2\2\2)\u00c1\3\2\2\2+\u00c3\3\2\2\2"+
		"-\u00c5\3\2\2\2/\u00cc\3\2\2\2\61\u00ce\3\2\2\2\63\u00d0\3\2\2\2\65\u00d3"+
		"\3\2\2\2\67\u00d5\3\2\2\29\u00d7\3\2\2\2;\u00d9\3\2\2\2=\u00db\3\2\2\2"+
		"?\u00dd\3\2\2\2A\u00df\3\2\2\2C\u00e2\3\2\2\2E\u00e6\3\2\2\2G\u00ec\3"+
		"\2\2\2I\u00f1\3\2\2\2K\u00f5\3\2\2\2M\u00f8\3\2\2\2O\u00fd\3\2\2\2Q\u0102"+
		"\3\2\2\2S\u0107\3\2\2\2U\u0109\3\2\2\2W\u010b\3\2\2\2Y\u010d\3\2\2\2["+
		"\u010f\3\2\2\2]\u0111\3\2\2\2_\u0113\3\2\2\2a\u0115\3\2\2\2c\u0117\3\2"+
		"\2\2e\u0119\3\2\2\2g\u011b\3\2\2\2ij\7d\2\2jk\7q\2\2kl\7q\2\2lm\7n\2\2"+
		"mn\7g\2\2no\7c\2\2op\7p\2\2p\4\3\2\2\2qr\7k\2\2rs\7p\2\2st\7v\2\2t\6\3"+
		"\2\2\2uv\7u\2\2vw\7v\2\2wx\7t\2\2xy\7k\2\2yz\7p\2\2z{\7i\2\2{\b\3\2\2"+
		"\2|}\7f\2\2}~\7q\2\2~\177\7w\2\2\177\u0080\7d\2\2\u0080\u0081\7n\2\2\u0081"+
		"\u0082\7g\2\2\u0082\n\3\2\2\2\u0083\u0084\7h\2\2\u0084\u0085\7n\2\2\u0085"+
		"\u0086\7q\2\2\u0086\u0087\7c\2\2\u0087\u0088\7v\2\2\u0088\f\3\2\2\2\u0089"+
		"\u008a\7e\2\2\u008a\u008b\7j\2\2\u008b\u008c\7c\2\2\u008c\u008d\7t\2\2"+
		"\u008d\16\3\2\2\2\u008e\u0090\t\2\2\2\u008f\u008e\3\2\2\2\u0090\u0091"+
		"\3\2\2\2\u0091\u008f\3\2\2\2\u0091\u0092\3\2\2\2\u0092\20\3\2\2\2\u0093"+
		"\u0097\t\3\2\2\u0094\u0096\t\4\2\2\u0095\u0094\3\2\2\2\u0096\u0099\3\2"+
		"\2\2\u0097\u0095\3\2\2\2\u0097\u0098\3\2\2\2\u0098\22\3\2\2\2\u0099\u0097"+
		"\3\2\2\2\u009a\u009d\5\25\13\2\u009b\u009d\5\27\f\2\u009c\u009a\3\2\2"+
		"\2\u009c\u009b\3\2\2\2\u009d\24\3\2\2\2\u009e\u009f\7v\2\2\u009f\u00a0"+
		"\7t\2\2\u00a0\u00a1\7w\2\2\u00a1\u00a2\7g\2\2\u00a2\26\3\2\2\2\u00a3\u00a4"+
		"\7h\2\2\u00a4\u00a5\7c\2\2\u00a5\u00a6\7n\2\2\u00a6\u00a7\7u\2\2\u00a7"+
		"\u00a8\7g\2\2\u00a8\30\3\2\2\2\u00a9\u00aa\7k\2\2\u00aa\u00ab\7h\2\2\u00ab"+
		"\32\3\2\2\2\u00ac\u00ad\7g\2\2\u00ad\u00ae\7n\2\2\u00ae\u00af\7u\2\2\u00af"+
		"\u00b0\7g\2\2\u00b0\34\3\2\2\2\u00b1\u00b2\7y\2\2\u00b2\u00b3\7j\2\2\u00b3"+
		"\u00b4\7k\2\2\u00b4\u00b5\7n\2\2\u00b5\u00b6\7g\2\2\u00b6\36\3\2\2\2\u00b7"+
		"\u00b8\7*\2\2\u00b8 \3\2\2\2\u00b9\u00ba\7+\2\2\u00ba\"\3\2\2\2\u00bb"+
		"\u00bc\7}\2\2\u00bc$\3\2\2\2\u00bd\u00be\7\177\2\2\u00be&\3\2\2\2\u00bf"+
		"\u00c0\7]\2\2\u00c0(\3\2\2\2\u00c1\u00c2\7_\2\2\u00c2*\3\2\2\2\u00c3\u00c4"+
		"\7=\2\2\u00c4,\3\2\2\2\u00c5\u00c6\7.\2\2\u00c6.\3\2\2\2\u00c7\u00cd\5"+
		"\63\32\2\u00c8\u00cd\5=\37\2\u00c9\u00cd\5? \2\u00ca\u00cd\5A!\2\u00cb"+
		"\u00cd\5C\"\2\u00cc\u00c7\3\2\2\2\u00cc\u00c8\3\2\2\2\u00cc\u00c9\3\2"+
		"\2\2\u00cc\u00ca\3\2\2\2\u00cc\u00cb\3\2\2\2\u00cd\60\3\2\2\2\u00ce\u00cf"+
		"\7?\2\2\u00cf\62\3\2\2\2\u00d0\u00d1\7?\2\2\u00d1\u00d2\7?\2\2\u00d2\64"+
		"\3\2\2\2\u00d3\u00d4\7-\2\2\u00d4\66\3\2\2\2\u00d5\u00d6\7/\2\2\u00d6"+
		"8\3\2\2\2\u00d7\u00d8\7,\2\2\u00d8:\3\2\2\2\u00d9\u00da\7\61\2\2\u00da"+
		"<\3\2\2\2\u00db\u00dc\7>\2\2\u00dc>\3\2\2\2\u00dd\u00de\7@\2\2\u00de@"+
		"\3\2\2\2\u00df\u00e0\7>\2\2\u00e0\u00e1\7?\2\2\u00e1B\3\2\2\2\u00e2\u00e3"+
		"\7@\2\2\u00e3\u00e4\7?\2\2\u00e4D\3\2\2\2\u00e5\u00e7\t\5\2\2\u00e6\u00e5"+
		"\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8\u00e6\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9"+
		"\u00ea\3\2\2\2\u00ea\u00eb\b#\2\2\u00ebF\3\2\2\2\u00ec\u00ed\5]/\2\u00ed"+
		"\u00ee\5[.\2\u00ee\u00ef\5e\63\2\u00ef\u00f0\5W,\2\u00f0H\3\2\2\2\u00f1"+
		"\u00f2\5g\64\2\u00f2\u00f3\5[.\2\u00f3\u00f4\5W,\2\u00f4J\3\2\2\2\u00f5"+
		"\u00f6\5c\62\2\u00f6\u00f7\5[.\2\u00f7L\3\2\2\2\u00f8\u00f9\5S*\2\u00f9"+
		"\u00fa\5U+\2\u00fa\u00fb\5W,\2\u00fb\u00fc\5Y-\2\u00fcN\3\2\2\2\u00fd"+
		"\u00fe\5]/\2\u00fe\u00ff\5_\60\2\u00ff\u0100\5_\60\2\u0100\u0101\5a\61"+
		"\2\u0101P\3\2\2\2\u0102\u0103\5a\61\2\u0103\u0104\5_\60\2\u0104\u0105"+
		"\5_\60\2\u0105\u0106\5]/\2\u0106R\3\2\2\2\u0107\u0108\t\6\2\2\u0108T\3"+
		"\2\2\2\u0109\u010a\t\7\2\2\u010aV\3\2\2\2\u010b\u010c\t\b\2\2\u010cX\3"+
		"\2\2\2\u010d\u010e\t\t\2\2\u010eZ\3\2\2\2\u010f\u0110\t\n\2\2\u0110\\"+
		"\3\2\2\2\u0111\u0112\t\13\2\2\u0112^\3\2\2\2\u0113\u0114\t\f\2\2\u0114"+
		"`\3\2\2\2\u0115\u0116\t\r\2\2\u0116b\3\2\2\2\u0117\u0118\t\16\2\2\u0118"+
		"d\3\2\2\2\u0119\u011a\t\17\2\2\u011af\3\2\2\2\u011b\u011c\t\20\2\2\u011c"+
		"h\3\2\2\2\b\2\u0091\u0097\u009c\u00cc\u00e8\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}