// Generated from Sparky.g4 by ANTLR 4.8
package sparky;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SparkyParser extends Parser {
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
	public static final int
		RULE_prog = 0, RULE_ball = 1, RULE_declare = 2, RULE_expression = 3, RULE_e1 = 4, 
		RULE_loopum = 5, RULE_term = 6, RULE_term1 = 7, RULE_term2 = 8, RULE_in_loop = 9, 
		RULE_assignedstuff = 10, RULE_assignment = 11, RULE_yesnostatement = 12, 
		RULE_datatype = 13;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "ball", "declare", "expression", "e1", "loopum", "term", "term1", 
			"term2", "in_loop", "assignedstuff", "assignment", "yesnostatement", 
			"datatype"
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

	@Override
	public String getGrammarFileName() { return "Sparky.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SparkyParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgContext extends ParserRuleContext {
		public BallContext ball() {
			return getRuleContext(BallContext.class,0);
		}
		public List<DeclareContext> declare() {
			return getRuleContexts(DeclareContext.class);
		}
		public DeclareContext declare(int i) {
			return getRuleContext(DeclareContext.class,i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkyListener ) ((SparkyListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkyListener ) ((SparkyListener)listener).exitProg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkyVisitor ) return ((SparkyVisitor<? extends T>)visitor).visitProg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(31);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << YUPNUP) | (1L << INTEGER) | (1L << STRING) | (1L << DOUBLE) | (1L << DECIMAL) | (1L << CHAR))) != 0)) {
				{
				{
				setState(28);
				declare();
				}
				}
				setState(33);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(34);
			ball();
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

	public static class BallContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public BallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ball; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkyListener ) ((SparkyListener)listener).enterBall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkyListener ) ((SparkyListener)listener).exitBall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkyVisitor ) return ((SparkyVisitor<? extends T>)visitor).visitBall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BallContext ball() throws RecognitionException {
		BallContext _localctx = new BallContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_ball);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(39);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUMBER) | (1L << STUFF) | (1L << IF) | (1L << WHILE))) != 0)) {
				{
				{
				setState(36);
				expression();
				}
				}
				setState(41);
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

	public static class DeclareContext extends ParserRuleContext {
		public DatatypeContext datatype() {
			return getRuleContext(DatatypeContext.class,0);
		}
		public TerminalNode STUFF() { return getToken(SparkyParser.STUFF, 0); }
		public TerminalNode EQUALTO() { return getToken(SparkyParser.EQUALTO, 0); }
		public AssignedstuffContext assignedstuff() {
			return getRuleContext(AssignedstuffContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(SparkyParser.SEMICOLON, 0); }
		public DeclareContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declare; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkyListener ) ((SparkyListener)listener).enterDeclare(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkyListener ) ((SparkyListener)listener).exitDeclare(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkyVisitor ) return ((SparkyVisitor<? extends T>)visitor).visitDeclare(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclareContext declare() throws RecognitionException {
		DeclareContext _localctx = new DeclareContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_declare);
		try {
			setState(52);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(42);
				datatype();
				setState(43);
				match(STUFF);
				setState(44);
				match(EQUALTO);
				setState(45);
				assignedstuff();
				setState(46);
				match(SEMICOLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(48);
				datatype();
				setState(49);
				match(STUFF);
				setState(50);
				match(SEMICOLON);
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

	public static class ExpressionContext extends ParserRuleContext {
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public E1Context e1() {
			return getRuleContext(E1Context.class,0);
		}
		public LoopumContext loopum() {
			return getRuleContext(LoopumContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(SparkyParser.SEMICOLON, 0); }
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkyListener ) ((SparkyListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkyListener ) ((SparkyListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkyVisitor ) return ((SparkyVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_expression);
		try {
			setState(65);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(54);
				assignment();
				setState(55);
				e1();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(57);
				loopum();
				setState(58);
				match(SEMICOLON);
				setState(59);
				e1();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(61);
				term();
				setState(62);
				match(SEMICOLON);
				setState(63);
				e1();
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

	public static class E1Context extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(SparkyParser.PLUS, 0); }
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(SparkyParser.SEMICOLON, 0); }
		public E1Context e1() {
			return getRuleContext(E1Context.class,0);
		}
		public TerminalNode MINUS() { return getToken(SparkyParser.MINUS, 0); }
		public YesnostatementContext yesnostatement() {
			return getRuleContext(YesnostatementContext.class,0);
		}
		public E1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_e1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkyListener ) ((SparkyListener)listener).enterE1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkyListener ) ((SparkyListener)listener).exitE1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkyVisitor ) return ((SparkyVisitor<? extends T>)visitor).visitE1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final E1Context e1() throws RecognitionException {
		E1Context _localctx = new E1Context(_ctx, getState());
		enterRule(_localctx, 8, RULE_e1);
		try {
			setState(81);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(67);
				match(PLUS);
				setState(68);
				term();
				setState(69);
				match(SEMICOLON);
				setState(70);
				e1();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(72);
				match(MINUS);
				setState(73);
				term();
				setState(74);
				match(SEMICOLON);
				setState(75);
				e1();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(77);
				yesnostatement();
				setState(78);
				e1();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
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

	public static class LoopumContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(SparkyParser.IF, 0); }
		public List<Term2Context> term2() {
			return getRuleContexts(Term2Context.class);
		}
		public Term2Context term2(int i) {
			return getRuleContext(Term2Context.class,i);
		}
		public TerminalNode THEN() { return getToken(SparkyParser.THEN, 0); }
		public In_loopContext in_loop() {
			return getRuleContext(In_loopContext.class,0);
		}
		public TerminalNode FI() { return getToken(SparkyParser.FI, 0); }
		public TerminalNode ELSE() { return getToken(SparkyParser.ELSE, 0); }
		public TerminalNode WHILE() { return getToken(SparkyParser.WHILE, 0); }
		public TerminalNode LOOP() { return getToken(SparkyParser.LOOP, 0); }
		public TerminalNode POOL() { return getToken(SparkyParser.POOL, 0); }
		public LoopumContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loopum; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkyListener ) ((SparkyListener)listener).enterLoopum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkyListener ) ((SparkyListener)listener).exitLoopum(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkyVisitor ) return ((SparkyVisitor<? extends T>)visitor).visitLoopum(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LoopumContext loopum() throws RecognitionException {
		LoopumContext _localctx = new LoopumContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_loopum);
		int _la;
		try {
			setState(99);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF:
				enterOuterAlt(_localctx, 1);
				{
				setState(83);
				match(IF);
				setState(84);
				term2();
				setState(85);
				match(THEN);
				setState(86);
				in_loop();
				setState(89);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(87);
					match(ELSE);
					setState(88);
					term2();
					}
				}

				setState(91);
				match(FI);
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 2);
				{
				setState(93);
				match(WHILE);
				setState(94);
				term2();
				setState(95);
				match(LOOP);
				setState(96);
				in_loop();
				setState(97);
				match(POOL);
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

	public static class TermContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(SparkyParser.NUMBER, 0); }
		public Term1Context term1() {
			return getRuleContext(Term1Context.class,0);
		}
		public TerminalNode STUFF() { return getToken(SparkyParser.STUFF, 0); }
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkyListener ) ((SparkyListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkyListener ) ((SparkyListener)listener).exitTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkyVisitor ) return ((SparkyVisitor<? extends T>)visitor).visitTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_term);
		try {
			setState(105);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(101);
				match(NUMBER);
				setState(102);
				term1();
				}
				break;
			case STUFF:
				enterOuterAlt(_localctx, 2);
				{
				setState(103);
				match(STUFF);
				setState(104);
				term1();
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

	public static class Term1Context extends ParserRuleContext {
		public TerminalNode MUL() { return getToken(SparkyParser.MUL, 0); }
		public Term2Context term2() {
			return getRuleContext(Term2Context.class,0);
		}
		public Term1Context term1() {
			return getRuleContext(Term1Context.class,0);
		}
		public TerminalNode DIV() { return getToken(SparkyParser.DIV, 0); }
		public Term1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkyListener ) ((SparkyListener)listener).enterTerm1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkyListener ) ((SparkyListener)listener).exitTerm1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkyVisitor ) return ((SparkyVisitor<? extends T>)visitor).visitTerm1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Term1Context term1() throws RecognitionException {
		Term1Context _localctx = new Term1Context(_ctx, getState());
		enterRule(_localctx, 14, RULE_term1);
		try {
			setState(116);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MUL:
				enterOuterAlt(_localctx, 1);
				{
				setState(107);
				match(MUL);
				setState(108);
				term2();
				setState(109);
				term1();
				}
				break;
			case DIV:
				enterOuterAlt(_localctx, 2);
				{
				setState(111);
				match(DIV);
				setState(112);
				term2();
				setState(113);
				term1();
				}
				break;
			case SEMICOLON:
				enterOuterAlt(_localctx, 3);
				{
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

	public static class Term2Context extends ParserRuleContext {
		public TerminalNode LSmoothBrace() { return getToken(SparkyParser.LSmoothBrace, 0); }
		public YesnostatementContext yesnostatement() {
			return getRuleContext(YesnostatementContext.class,0);
		}
		public TerminalNode RSmoothBrace() { return getToken(SparkyParser.RSmoothBrace, 0); }
		public Term2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkyListener ) ((SparkyListener)listener).enterTerm2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkyListener ) ((SparkyListener)listener).exitTerm2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkyVisitor ) return ((SparkyVisitor<? extends T>)visitor).visitTerm2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Term2Context term2() throws RecognitionException {
		Term2Context _localctx = new Term2Context(_ctx, getState());
		enterRule(_localctx, 16, RULE_term2);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			match(LSmoothBrace);
			setState(119);
			yesnostatement();
			setState(120);
			match(RSmoothBrace);
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

	public static class In_loopContext extends ParserRuleContext {
		public TerminalNode LCurlyBrace() { return getToken(SparkyParser.LCurlyBrace, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(SparkyParser.SEMICOLON, 0); }
		public TerminalNode RCurlyBrace() { return getToken(SparkyParser.RCurlyBrace, 0); }
		public In_loopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_in_loop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkyListener ) ((SparkyListener)listener).enterIn_loop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkyListener ) ((SparkyListener)listener).exitIn_loop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkyVisitor ) return ((SparkyVisitor<? extends T>)visitor).visitIn_loop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final In_loopContext in_loop() throws RecognitionException {
		In_loopContext _localctx = new In_loopContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_in_loop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			match(LCurlyBrace);
			setState(123);
			expression();
			setState(124);
			match(SEMICOLON);
			setState(125);
			match(RCurlyBrace);
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

	public static class AssignedstuffContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(SparkyParser.NUMBER, 0); }
		public TerminalNode BOOLEANVALUE() { return getToken(SparkyParser.BOOLEANVALUE, 0); }
		public AssignedstuffContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignedstuff; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkyListener ) ((SparkyListener)listener).enterAssignedstuff(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkyListener ) ((SparkyListener)listener).exitAssignedstuff(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkyVisitor ) return ((SparkyVisitor<? extends T>)visitor).visitAssignedstuff(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignedstuffContext assignedstuff() throws RecognitionException {
		AssignedstuffContext _localctx = new AssignedstuffContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_assignedstuff);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			_la = _input.LA(1);
			if ( !(_la==NUMBER || _la==BOOLEANVALUE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class AssignmentContext extends ParserRuleContext {
		public TerminalNode STUFF() { return getToken(SparkyParser.STUFF, 0); }
		public TerminalNode EQUALTO() { return getToken(SparkyParser.EQUALTO, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkyListener ) ((SparkyListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkyListener ) ((SparkyListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkyVisitor ) return ((SparkyVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			match(STUFF);
			setState(130);
			match(EQUALTO);
			setState(131);
			expression();
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

	public static class YesnostatementContext extends ParserRuleContext {
		public TerminalNode BOOLEANVALUE() { return getToken(SparkyParser.BOOLEANVALUE, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode YESNOOPERATOR() { return getToken(SparkyParser.YESNOOPERATOR, 0); }
		public YesnostatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_yesnostatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkyListener ) ((SparkyListener)listener).enterYesnostatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkyListener ) ((SparkyListener)listener).exitYesnostatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkyVisitor ) return ((SparkyVisitor<? extends T>)visitor).visitYesnostatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final YesnostatementContext yesnostatement() throws RecognitionException {
		YesnostatementContext _localctx = new YesnostatementContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_yesnostatement);
		try {
			setState(138);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOLEANVALUE:
				enterOuterAlt(_localctx, 1);
				{
				setState(133);
				match(BOOLEANVALUE);
				}
				break;
			case NUMBER:
			case STUFF:
			case IF:
			case WHILE:
				enterOuterAlt(_localctx, 2);
				{
				setState(134);
				expression();
				setState(135);
				match(YESNOOPERATOR);
				setState(136);
				expression();
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

	public static class DatatypeContext extends ParserRuleContext {
		public TerminalNode YUPNUP() { return getToken(SparkyParser.YUPNUP, 0); }
		public TerminalNode INTEGER() { return getToken(SparkyParser.INTEGER, 0); }
		public TerminalNode STRING() { return getToken(SparkyParser.STRING, 0); }
		public TerminalNode DOUBLE() { return getToken(SparkyParser.DOUBLE, 0); }
		public TerminalNode DECIMAL() { return getToken(SparkyParser.DECIMAL, 0); }
		public TerminalNode CHAR() { return getToken(SparkyParser.CHAR, 0); }
		public DatatypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_datatype; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkyListener ) ((SparkyListener)listener).enterDatatype(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkyListener ) ((SparkyListener)listener).exitDatatype(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkyVisitor ) return ((SparkyVisitor<? extends T>)visitor).visitDatatype(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DatatypeContext datatype() throws RecognitionException {
		DatatypeContext _localctx = new DatatypeContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_datatype);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << YUPNUP) | (1L << INTEGER) | (1L << STRING) | (1L << DOUBLE) | (1L << DECIMAL) | (1L << CHAR))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3*\u0091\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\7\2 \n\2\f\2\16\2#\13\2\3"+
		"\2\3\2\3\3\7\3(\n\3\f\3\16\3+\13\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\5\4\67\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5D\n\5\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6T\n\6\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\5\7\\\n\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7f\n\7"+
		"\3\b\3\b\3\b\3\b\5\bl\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\tw\n\t"+
		"\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3\r\3\16"+
		"\3\16\3\16\3\16\3\16\5\16\u008d\n\16\3\17\3\17\3\17\2\2\20\2\4\6\b\n\f"+
		"\16\20\22\24\26\30\32\34\2\4\4\2\t\t\13\13\3\2\3\b\2\u0090\2!\3\2\2\2"+
		"\4)\3\2\2\2\6\66\3\2\2\2\bC\3\2\2\2\nS\3\2\2\2\fe\3\2\2\2\16k\3\2\2\2"+
		"\20v\3\2\2\2\22x\3\2\2\2\24|\3\2\2\2\26\u0081\3\2\2\2\30\u0083\3\2\2\2"+
		"\32\u008c\3\2\2\2\34\u008e\3\2\2\2\36 \5\6\4\2\37\36\3\2\2\2 #\3\2\2\2"+
		"!\37\3\2\2\2!\"\3\2\2\2\"$\3\2\2\2#!\3\2\2\2$%\5\4\3\2%\3\3\2\2\2&(\5"+
		"\b\5\2\'&\3\2\2\2(+\3\2\2\2)\'\3\2\2\2)*\3\2\2\2*\5\3\2\2\2+)\3\2\2\2"+
		",-\5\34\17\2-.\7\n\2\2./\7\32\2\2/\60\5\26\f\2\60\61\7\27\2\2\61\67\3"+
		"\2\2\2\62\63\5\34\17\2\63\64\7\n\2\2\64\65\7\27\2\2\65\67\3\2\2\2\66,"+
		"\3\2\2\2\66\62\3\2\2\2\67\7\3\2\2\289\5\30\r\29:\5\n\6\2:D\3\2\2\2;<\5"+
		"\f\7\2<=\7\27\2\2=>\5\n\6\2>D\3\2\2\2?@\5\16\b\2@A\7\27\2\2AB\5\n\6\2"+
		"BD\3\2\2\2C8\3\2\2\2C;\3\2\2\2C?\3\2\2\2D\t\3\2\2\2EF\7\34\2\2FG\5\16"+
		"\b\2GH\7\27\2\2HI\5\n\6\2IT\3\2\2\2JK\7\35\2\2KL\5\16\b\2LM\7\27\2\2M"+
		"N\5\n\6\2NT\3\2\2\2OP\5\32\16\2PQ\5\n\6\2QT\3\2\2\2RT\3\2\2\2SE\3\2\2"+
		"\2SJ\3\2\2\2SO\3\2\2\2SR\3\2\2\2T\13\3\2\2\2UV\7\16\2\2VW\5\22\n\2WX\7"+
		"(\2\2X[\5\24\13\2YZ\7\17\2\2Z\\\5\22\n\2[Y\3\2\2\2[\\\3\2\2\2\\]\3\2\2"+
		"\2]^\7\'\2\2^f\3\2\2\2_`\7\20\2\2`a\5\22\n\2ab\7)\2\2bc\5\24\13\2cd\7"+
		"*\2\2df\3\2\2\2eU\3\2\2\2e_\3\2\2\2f\r\3\2\2\2gh\7\t\2\2hl\5\20\t\2ij"+
		"\7\n\2\2jl\5\20\t\2kg\3\2\2\2ki\3\2\2\2l\17\3\2\2\2mn\7\36\2\2no\5\22"+
		"\n\2op\5\20\t\2pw\3\2\2\2qr\7\37\2\2rs\5\22\n\2st\5\20\t\2tw\3\2\2\2u"+
		"w\3\2\2\2vm\3\2\2\2vq\3\2\2\2vu\3\2\2\2w\21\3\2\2\2xy\7\21\2\2yz\5\32"+
		"\16\2z{\7\22\2\2{\23\3\2\2\2|}\7\23\2\2}~\5\b\5\2~\177\7\27\2\2\177\u0080"+
		"\7\24\2\2\u0080\25\3\2\2\2\u0081\u0082\t\2\2\2\u0082\27\3\2\2\2\u0083"+
		"\u0084\7\n\2\2\u0084\u0085\7\32\2\2\u0085\u0086\5\b\5\2\u0086\31\3\2\2"+
		"\2\u0087\u008d\7\13\2\2\u0088\u0089\5\b\5\2\u0089\u008a\7\31\2\2\u008a"+
		"\u008b\5\b\5\2\u008b\u008d\3\2\2\2\u008c\u0087\3\2\2\2\u008c\u0088\3\2"+
		"\2\2\u008d\33\3\2\2\2\u008e\u008f\t\3\2\2\u008f\35\3\2\2\2\f!)\66CS[e"+
		"kv\u008c";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}