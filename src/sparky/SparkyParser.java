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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, LIVE=12, DIE=13, FI=14, YESNOOPERATOR=15, EQUALTO=16, 
		ASSEQ=17, LESS_THAN=18, MORE_THAN=19, LESS_THAN_EQ=20, MORE_THAN_EQ=21, 
		PLUS=22, MINUS=23, MUL=24, DIV=25, SEMICOLON=26, LSmoothBrace=27, RSmoothBrace=28, 
		LCurlyBrace=29, RCurlyBrace=30, HAINA=31, INTEGER=32, STRING=33, DOUBLE=34, 
		DECIMAL=35, CHAR=36, IF=37, WHILE=38, STUFF=39, NUMBER=40, WS=41;
	public static final int
		RULE_program = 0, RULE_ball = 1, RULE_declare = 2, RULE_expression = 3, 
		RULE_assignment = 4, RULE_ifte = 5, RULE_loopum = 6, RULE_loop_for = 7, 
		RULE_loop_while = 8, RULE_in_loop = 9, RULE_for_expr = 10, RULE_for_expression = 11, 
		RULE_for_declare = 12, RULE_term = 13, RULE_expr = 14, RULE_yesnostatement = 15, 
		RULE_ternary_operator = 16, RULE_print = 17, RULE_warna = 18, RULE_haina = 19, 
		RULE_datatype = 20, RULE_booleanvalue = 21, RULE_yup = 22, RULE_nope = 23;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "ball", "declare", "expression", "assignment", "ifte", "loopum", 
			"loop_for", "loop_while", "in_loop", "for_expr", "for_expression", "for_declare", 
			"term", "expr", "yesnostatement", "ternary_operator", "print", "warna", 
			"haina", "datatype", "booleanvalue", "yup", "nope"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'warna'", "'for'", "'?'", "':'", "'print('", "'else'", "'bool'", 
			"'yup'", "'nope'", "'true'", "'false'", "'Live'", "'Die'", "'fi'", null, 
			"'='", "'=='", "'<'", "'>'", "'<='", "'>='", "'+'", "'-'", "'*'", "'/'", 
			"';'", "'('", "')'", "'{'", "'}'", "'haina'", "'int'", "'string'", "'double'", 
			"'float'", "'char'", "'if'", "'while'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			"LIVE", "DIE", "FI", "YESNOOPERATOR", "EQUALTO", "ASSEQ", "LESS_THAN", 
			"MORE_THAN", "LESS_THAN_EQ", "MORE_THAN_EQ", "PLUS", "MINUS", "MUL", 
			"DIV", "SEMICOLON", "LSmoothBrace", "RSmoothBrace", "LCurlyBrace", "RCurlyBrace", 
			"HAINA", "INTEGER", "STRING", "DOUBLE", "DECIMAL", "CHAR", "IF", "WHILE", 
			"STUFF", "NUMBER", "WS"
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

	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode LIVE() { return getToken(SparkyParser.LIVE, 0); }
		public BallContext ball() {
			return getRuleContext(BallContext.class,0);
		}
		public TerminalNode DIE() { return getToken(SparkyParser.DIE, 0); }
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkyListener ) ((SparkyListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkyListener ) ((SparkyListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkyVisitor ) return ((SparkyVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			match(LIVE);
			setState(49);
			ball();
			setState(50);
			match(DIE);
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
		public List<DeclareContext> declare() {
			return getRuleContexts(DeclareContext.class);
		}
		public DeclareContext declare(int i) {
			return getRuleContext(DeclareContext.class,i);
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
			setState(70);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(55);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__4) | (1L << IF) | (1L << WHILE) | (1L << STUFF))) != 0)) {
					{
					{
					setState(52);
					expression();
					}
					}
					setState(57);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(61);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << HAINA) | (1L << INTEGER) | (1L << STRING) | (1L << DOUBLE) | (1L << DECIMAL) | (1L << CHAR))) != 0)) {
					{
					{
					setState(58);
					declare();
					}
					}
					setState(63);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(67);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__4) | (1L << IF) | (1L << WHILE) | (1L << STUFF))) != 0)) {
					{
					{
					setState(64);
					expression();
					}
					}
					setState(69);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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

	public static class DeclareContext extends ParserRuleContext {
		public DatatypeContext datatype() {
			return getRuleContext(DatatypeContext.class,0);
		}
		public TerminalNode STUFF() { return getToken(SparkyParser.STUFF, 0); }
		public TerminalNode EQUALTO() { return getToken(SparkyParser.EQUALTO, 0); }
		public TerminalNode NUMBER() { return getToken(SparkyParser.NUMBER, 0); }
		public TerminalNode SEMICOLON() { return getToken(SparkyParser.SEMICOLON, 0); }
		public TerminalNode HAINA() { return getToken(SparkyParser.HAINA, 0); }
		public BooleanvalueContext booleanvalue() {
			return getRuleContext(BooleanvalueContext.class,0);
		}
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
			setState(91);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(72);
				datatype();
				setState(73);
				match(STUFF);
				setState(74);
				match(EQUALTO);
				setState(75);
				match(NUMBER);
				setState(76);
				match(SEMICOLON);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(78);
				datatype();
				setState(79);
				match(STUFF);
				setState(80);
				match(SEMICOLON);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(82);
				match(HAINA);
				setState(83);
				match(STUFF);
				setState(84);
				match(EQUALTO);
				setState(85);
				booleanvalue();
				setState(86);
				match(SEMICOLON);
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				{
				setState(88);
				match(HAINA);
				setState(89);
				match(STUFF);
				setState(90);
				match(SEMICOLON);
				}
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
		public IfteContext ifte() {
			return getRuleContext(IfteContext.class,0);
		}
		public LoopumContext loopum() {
			return getRuleContext(LoopumContext.class,0);
		}
		public Ternary_operatorContext ternary_operator() {
			return getRuleContext(Ternary_operatorContext.class,0);
		}
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
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
			setState(98);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(93);
				assignment();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(94);
				ifte();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(95);
				loopum();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(96);
				ternary_operator();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(97);
				print();
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

	public static class AssignmentContext extends ParserRuleContext {
		public TerminalNode STUFF() { return getToken(SparkyParser.STUFF, 0); }
		public TerminalNode EQUALTO() { return getToken(SparkyParser.EQUALTO, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(SparkyParser.SEMICOLON, 0); }
		public YesnostatementContext yesnostatement() {
			return getRuleContext(YesnostatementContext.class,0);
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
		enterRule(_localctx, 8, RULE_assignment);
		try {
			setState(110);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(100);
				match(STUFF);
				setState(101);
				match(EQUALTO);
				setState(102);
				expr();
				setState(103);
				match(SEMICOLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(105);
				match(STUFF);
				setState(106);
				match(EQUALTO);
				setState(107);
				yesnostatement();
				setState(108);
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

	public static class IfteContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(SparkyParser.IF, 0); }
		public YesnostatementContext yesnostatement() {
			return getRuleContext(YesnostatementContext.class,0);
		}
		public List<In_loopContext> in_loop() {
			return getRuleContexts(In_loopContext.class);
		}
		public In_loopContext in_loop(int i) {
			return getRuleContext(In_loopContext.class,i);
		}
		public TerminalNode FI() { return getToken(SparkyParser.FI, 0); }
		public IfteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifte; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkyListener ) ((SparkyListener)listener).enterIfte(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkyListener ) ((SparkyListener)listener).exitIfte(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkyVisitor ) return ((SparkyVisitor<? extends T>)visitor).visitIfte(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfteContext ifte() throws RecognitionException {
		IfteContext _localctx = new IfteContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_ifte);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			match(IF);
			setState(113);
			yesnostatement();
			setState(114);
			in_loop();
			setState(117);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(115);
				match(T__0);
				setState(116);
				in_loop();
				}
			}

			setState(119);
			match(FI);
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
		public Loop_forContext loop_for() {
			return getRuleContext(Loop_forContext.class,0);
		}
		public Loop_whileContext loop_while() {
			return getRuleContext(Loop_whileContext.class,0);
		}
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
		enterRule(_localctx, 12, RULE_loopum);
		try {
			setState(123);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				enterOuterAlt(_localctx, 1);
				{
				setState(121);
				loop_for();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 2);
				{
				setState(122);
				loop_while();
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

	public static class Loop_forContext extends ParserRuleContext {
		public TerminalNode LSmoothBrace() { return getToken(SparkyParser.LSmoothBrace, 0); }
		public List<TerminalNode> SEMICOLON() { return getTokens(SparkyParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(SparkyParser.SEMICOLON, i);
		}
		public TerminalNode RSmoothBrace() { return getToken(SparkyParser.RSmoothBrace, 0); }
		public In_loopContext in_loop() {
			return getRuleContext(In_loopContext.class,0);
		}
		public For_declareContext for_declare() {
			return getRuleContext(For_declareContext.class,0);
		}
		public For_expressionContext for_expression() {
			return getRuleContext(For_expressionContext.class,0);
		}
		public For_exprContext for_expr() {
			return getRuleContext(For_exprContext.class,0);
		}
		public Loop_forContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loop_for; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkyListener ) ((SparkyListener)listener).enterLoop_for(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkyListener ) ((SparkyListener)listener).exitLoop_for(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkyVisitor ) return ((SparkyVisitor<? extends T>)visitor).visitLoop_for(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Loop_forContext loop_for() throws RecognitionException {
		Loop_forContext _localctx = new Loop_forContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_loop_for);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			match(T__1);
			setState(126);
			match(LSmoothBrace);
			setState(128);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << HAINA) | (1L << INTEGER) | (1L << STRING) | (1L << DOUBLE) | (1L << DECIMAL) | (1L << CHAR))) != 0)) {
				{
				setState(127);
				for_declare();
				}
			}

			setState(130);
			match(SEMICOLON);
			setState(132);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STUFF || _la==NUMBER) {
				{
				setState(131);
				for_expression();
				}
			}

			setState(134);
			match(SEMICOLON);
			setState(136);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STUFF) {
				{
				setState(135);
				for_expr();
				}
			}

			setState(138);
			match(RSmoothBrace);
			setState(139);
			in_loop();
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

	public static class Loop_whileContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(SparkyParser.WHILE, 0); }
		public YesnostatementContext yesnostatement() {
			return getRuleContext(YesnostatementContext.class,0);
		}
		public In_loopContext in_loop() {
			return getRuleContext(In_loopContext.class,0);
		}
		public Loop_whileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loop_while; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkyListener ) ((SparkyListener)listener).enterLoop_while(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkyListener ) ((SparkyListener)listener).exitLoop_while(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkyVisitor ) return ((SparkyVisitor<? extends T>)visitor).visitLoop_while(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Loop_whileContext loop_while() throws RecognitionException {
		Loop_whileContext _localctx = new Loop_whileContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_loop_while);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			match(WHILE);
			setState(142);
			yesnostatement();
			setState(143);
			in_loop();
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
		public BallContext ball() {
			return getRuleContext(BallContext.class,0);
		}
		public TerminalNode RCurlyBrace() { return getToken(SparkyParser.RCurlyBrace, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
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
			setState(150);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LCurlyBrace:
				enterOuterAlt(_localctx, 1);
				{
				setState(145);
				match(LCurlyBrace);
				setState(146);
				ball();
				setState(147);
				match(RCurlyBrace);
				}
				break;
			case T__1:
			case T__4:
			case IF:
			case WHILE:
			case STUFF:
				enterOuterAlt(_localctx, 2);
				{
				setState(149);
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

	public static class For_exprContext extends ParserRuleContext {
		public TerminalNode STUFF() { return getToken(SparkyParser.STUFF, 0); }
		public TerminalNode EQUALTO() { return getToken(SparkyParser.EQUALTO, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public For_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkyListener ) ((SparkyListener)listener).enterFor_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkyListener ) ((SparkyListener)listener).exitFor_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkyVisitor ) return ((SparkyVisitor<? extends T>)visitor).visitFor_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_exprContext for_expr() throws RecognitionException {
		For_exprContext _localctx = new For_exprContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_for_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			match(STUFF);
			setState(153);
			match(EQUALTO);
			setState(154);
			expr();
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

	public static class For_expressionContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode YESNOOPERATOR() { return getToken(SparkyParser.YESNOOPERATOR, 0); }
		public For_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkyListener ) ((SparkyListener)listener).enterFor_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkyListener ) ((SparkyListener)listener).exitFor_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkyVisitor ) return ((SparkyVisitor<? extends T>)visitor).visitFor_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_expressionContext for_expression() throws RecognitionException {
		For_expressionContext _localctx = new For_expressionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_for_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			expr();
			setState(157);
			match(YESNOOPERATOR);
			setState(158);
			expr();
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

	public static class For_declareContext extends ParserRuleContext {
		public DatatypeContext datatype() {
			return getRuleContext(DatatypeContext.class,0);
		}
		public TerminalNode STUFF() { return getToken(SparkyParser.STUFF, 0); }
		public TerminalNode EQUALTO() { return getToken(SparkyParser.EQUALTO, 0); }
		public TerminalNode NUMBER() { return getToken(SparkyParser.NUMBER, 0); }
		public For_declareContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_declare; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkyListener ) ((SparkyListener)listener).enterFor_declare(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkyListener ) ((SparkyListener)listener).exitFor_declare(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkyVisitor ) return ((SparkyVisitor<? extends T>)visitor).visitFor_declare(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_declareContext for_declare() throws RecognitionException {
		For_declareContext _localctx = new For_declareContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_for_declare);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			datatype();
			setState(161);
			match(STUFF);
			setState(162);
			match(EQUALTO);
			setState(163);
			match(NUMBER);
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
		public Token op;
		public TerminalNode NUMBER() { return getToken(SparkyParser.NUMBER, 0); }
		public TerminalNode STUFF() { return getToken(SparkyParser.STUFF, 0); }
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public TerminalNode MUL() { return getToken(SparkyParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(SparkyParser.DIV, 0); }
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
		enterRule(_localctx, 26, RULE_term);
		int _la;
		try {
			setState(173);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(165);
				match(NUMBER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(166);
				match(STUFF);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(167);
				match(STUFF);
				setState(168);
				((TermContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==MUL || _la==DIV) ) {
					((TermContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(169);
				term();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(170);
				match(NUMBER);
				setState(171);
				((TermContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==MUL || _la==DIV) ) {
					((TermContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(172);
				term();
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

	public static class ExprContext extends ParserRuleContext {
		public Token op;
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode PLUS() { return getToken(SparkyParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(SparkyParser.MINUS, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkyListener ) ((SparkyListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkyListener ) ((SparkyListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkyVisitor ) return ((SparkyVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_expr);
		int _la;
		try {
			setState(180);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(175);
				term();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(176);
				term();
				setState(177);
				((ExprContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
					((ExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(178);
				expr();
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

	public static class YesnostatementContext extends ParserRuleContext {
		public BooleanvalueContext booleanvalue() {
			return getRuleContext(BooleanvalueContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
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
		enterRule(_localctx, 30, RULE_yesnostatement);
		try {
			setState(187);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__7:
			case T__8:
				enterOuterAlt(_localctx, 1);
				{
				setState(182);
				booleanvalue();
				}
				break;
			case STUFF:
			case NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(183);
				expr();
				setState(184);
				match(YESNOOPERATOR);
				setState(185);
				expr();
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

	public static class Ternary_operatorContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(SparkyParser.IF, 0); }
		public YesnostatementContext yesnostatement() {
			return getRuleContext(YesnostatementContext.class,0);
		}
		public List<In_loopContext> in_loop() {
			return getRuleContexts(In_loopContext.class);
		}
		public In_loopContext in_loop(int i) {
			return getRuleContext(In_loopContext.class,i);
		}
		public Ternary_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ternary_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkyListener ) ((SparkyListener)listener).enterTernary_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkyListener ) ((SparkyListener)listener).exitTernary_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkyVisitor ) return ((SparkyVisitor<? extends T>)visitor).visitTernary_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ternary_operatorContext ternary_operator() throws RecognitionException {
		Ternary_operatorContext _localctx = new Ternary_operatorContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_ternary_operator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
			match(IF);
			setState(190);
			yesnostatement();
			setState(191);
			match(T__2);
			setState(192);
			in_loop();
			setState(193);
			match(T__3);
			setState(194);
			in_loop();
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

	public static class PrintContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RSmoothBrace() { return getToken(SparkyParser.RSmoothBrace, 0); }
		public TerminalNode SEMICOLON() { return getToken(SparkyParser.SEMICOLON, 0); }
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkyListener ) ((SparkyListener)listener).enterPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkyListener ) ((SparkyListener)listener).exitPrint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkyVisitor ) return ((SparkyVisitor<? extends T>)visitor).visitPrint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_print);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(196);
			match(T__4);
			setState(197);
			expr();
			setState(198);
			match(RSmoothBrace);
			setState(199);
			match(SEMICOLON);
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

	public static class WarnaContext extends ParserRuleContext {
		public WarnaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_warna; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkyListener ) ((SparkyListener)listener).enterWarna(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkyListener ) ((SparkyListener)listener).exitWarna(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkyVisitor ) return ((SparkyVisitor<? extends T>)visitor).visitWarna(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WarnaContext warna() throws RecognitionException {
		WarnaContext _localctx = new WarnaContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_warna);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			match(T__5);
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

	public static class HainaContext extends ParserRuleContext {
		public HainaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_haina; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkyListener ) ((SparkyListener)listener).enterHaina(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkyListener ) ((SparkyListener)listener).exitHaina(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkyVisitor ) return ((SparkyVisitor<? extends T>)visitor).visitHaina(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HainaContext haina() throws RecognitionException {
		HainaContext _localctx = new HainaContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_haina);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(203);
			match(T__6);
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
		public TerminalNode INTEGER() { return getToken(SparkyParser.INTEGER, 0); }
		public TerminalNode STRING() { return getToken(SparkyParser.STRING, 0); }
		public TerminalNode DOUBLE() { return getToken(SparkyParser.DOUBLE, 0); }
		public TerminalNode DECIMAL() { return getToken(SparkyParser.DECIMAL, 0); }
		public TerminalNode CHAR() { return getToken(SparkyParser.CHAR, 0); }
		public TerminalNode HAINA() { return getToken(SparkyParser.HAINA, 0); }
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
		enterRule(_localctx, 40, RULE_datatype);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << HAINA) | (1L << INTEGER) | (1L << STRING) | (1L << DOUBLE) | (1L << DECIMAL) | (1L << CHAR))) != 0)) ) {
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

	public static class BooleanvalueContext extends ParserRuleContext {
		public BooleanvalueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanvalue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkyListener ) ((SparkyListener)listener).enterBooleanvalue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkyListener ) ((SparkyListener)listener).exitBooleanvalue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkyVisitor ) return ((SparkyVisitor<? extends T>)visitor).visitBooleanvalue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanvalueContext booleanvalue() throws RecognitionException {
		BooleanvalueContext _localctx = new BooleanvalueContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_booleanvalue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(207);
			_la = _input.LA(1);
			if ( !(_la==T__7 || _la==T__8) ) {
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

	public static class YupContext extends ParserRuleContext {
		public YupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_yup; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkyListener ) ((SparkyListener)listener).enterYup(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkyListener ) ((SparkyListener)listener).exitYup(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkyVisitor ) return ((SparkyVisitor<? extends T>)visitor).visitYup(this);
			else return visitor.visitChildren(this);
		}
	}

	public final YupContext yup() throws RecognitionException {
		YupContext _localctx = new YupContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_yup);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(209);
			match(T__9);
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

	public static class NopeContext extends ParserRuleContext {
		public NopeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nope; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkyListener ) ((SparkyListener)listener).enterNope(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkyListener ) ((SparkyListener)listener).exitNope(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkyVisitor ) return ((SparkyVisitor<? extends T>)visitor).visitNope(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NopeContext nope() throws RecognitionException {
		NopeContext _localctx = new NopeContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_nope);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(211);
			match(T__10);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3+\u00d8\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\3\2\3\2\3\2\3\2\3\3\7\38\n\3\f\3\16\3;\13\3\3\3\7\3>\n\3\f\3\16\3A\13"+
		"\3\3\3\7\3D\n\3\f\3\16\3G\13\3\5\3I\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4^\n\4\3\5\3\5\3\5\3"+
		"\5\3\5\5\5e\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6q\n\6\3\7\3"+
		"\7\3\7\3\7\3\7\5\7x\n\7\3\7\3\7\3\b\3\b\5\b~\n\b\3\t\3\t\3\t\5\t\u0083"+
		"\n\t\3\t\3\t\5\t\u0087\n\t\3\t\3\t\5\t\u008b\n\t\3\t\3\t\3\t\3\n\3\n\3"+
		"\n\3\n\3\13\3\13\3\13\3\13\3\13\5\13\u0099\n\13\3\f\3\f\3\f\3\f\3\r\3"+
		"\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\5\17\u00b0\n\17\3\20\3\20\3\20\3\20\3\20\5\20\u00b7\n\20\3\21\3"+
		"\21\3\21\3\21\3\21\5\21\u00be\n\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30"+
		"\3\30\3\31\3\31\3\31\2\2\32\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \""+
		"$&(*,.\60\2\6\3\2\32\33\3\2\30\31\3\2!&\3\2\n\13\2\u00d6\2\62\3\2\2\2"+
		"\4H\3\2\2\2\6]\3\2\2\2\bd\3\2\2\2\np\3\2\2\2\fr\3\2\2\2\16}\3\2\2\2\20"+
		"\177\3\2\2\2\22\u008f\3\2\2\2\24\u0098\3\2\2\2\26\u009a\3\2\2\2\30\u009e"+
		"\3\2\2\2\32\u00a2\3\2\2\2\34\u00af\3\2\2\2\36\u00b6\3\2\2\2 \u00bd\3\2"+
		"\2\2\"\u00bf\3\2\2\2$\u00c6\3\2\2\2&\u00cb\3\2\2\2(\u00cd\3\2\2\2*\u00cf"+
		"\3\2\2\2,\u00d1\3\2\2\2.\u00d3\3\2\2\2\60\u00d5\3\2\2\2\62\63\7\16\2\2"+
		"\63\64\5\4\3\2\64\65\7\17\2\2\65\3\3\2\2\2\668\5\b\5\2\67\66\3\2\2\28"+
		";\3\2\2\29\67\3\2\2\29:\3\2\2\2:I\3\2\2\2;9\3\2\2\2<>\5\6\4\2=<\3\2\2"+
		"\2>A\3\2\2\2?=\3\2\2\2?@\3\2\2\2@E\3\2\2\2A?\3\2\2\2BD\5\b\5\2CB\3\2\2"+
		"\2DG\3\2\2\2EC\3\2\2\2EF\3\2\2\2FI\3\2\2\2GE\3\2\2\2H9\3\2\2\2H?\3\2\2"+
		"\2I\5\3\2\2\2JK\5*\26\2KL\7)\2\2LM\7\22\2\2MN\7*\2\2NO\7\34\2\2O^\3\2"+
		"\2\2PQ\5*\26\2QR\7)\2\2RS\7\34\2\2S^\3\2\2\2TU\7!\2\2UV\7)\2\2VW\7\22"+
		"\2\2WX\5,\27\2XY\7\34\2\2Y^\3\2\2\2Z[\7!\2\2[\\\7)\2\2\\^\7\34\2\2]J\3"+
		"\2\2\2]P\3\2\2\2]T\3\2\2\2]Z\3\2\2\2^\7\3\2\2\2_e\5\n\6\2`e\5\f\7\2ae"+
		"\5\16\b\2be\5\"\22\2ce\5$\23\2d_\3\2\2\2d`\3\2\2\2da\3\2\2\2db\3\2\2\2"+
		"dc\3\2\2\2e\t\3\2\2\2fg\7)\2\2gh\7\22\2\2hi\5\36\20\2ij\7\34\2\2jq\3\2"+
		"\2\2kl\7)\2\2lm\7\22\2\2mn\5 \21\2no\7\34\2\2oq\3\2\2\2pf\3\2\2\2pk\3"+
		"\2\2\2q\13\3\2\2\2rs\7\'\2\2st\5 \21\2tw\5\24\13\2uv\7\3\2\2vx\5\24\13"+
		"\2wu\3\2\2\2wx\3\2\2\2xy\3\2\2\2yz\7\20\2\2z\r\3\2\2\2{~\5\20\t\2|~\5"+
		"\22\n\2}{\3\2\2\2}|\3\2\2\2~\17\3\2\2\2\177\u0080\7\4\2\2\u0080\u0082"+
		"\7\35\2\2\u0081\u0083\5\32\16\2\u0082\u0081\3\2\2\2\u0082\u0083\3\2\2"+
		"\2\u0083\u0084\3\2\2\2\u0084\u0086\7\34\2\2\u0085\u0087\5\30\r\2\u0086"+
		"\u0085\3\2\2\2\u0086\u0087\3\2\2\2\u0087\u0088\3\2\2\2\u0088\u008a\7\34"+
		"\2\2\u0089\u008b\5\26\f\2\u008a\u0089\3\2\2\2\u008a\u008b\3\2\2\2\u008b"+
		"\u008c\3\2\2\2\u008c\u008d\7\36\2\2\u008d\u008e\5\24\13\2\u008e\21\3\2"+
		"\2\2\u008f\u0090\7(\2\2\u0090\u0091\5 \21\2\u0091\u0092\5\24\13\2\u0092"+
		"\23\3\2\2\2\u0093\u0094\7\37\2\2\u0094\u0095\5\4\3\2\u0095\u0096\7 \2"+
		"\2\u0096\u0099\3\2\2\2\u0097\u0099\5\b\5\2\u0098\u0093\3\2\2\2\u0098\u0097"+
		"\3\2\2\2\u0099\25\3\2\2\2\u009a\u009b\7)\2\2\u009b\u009c\7\22\2\2\u009c"+
		"\u009d\5\36\20\2\u009d\27\3\2\2\2\u009e\u009f\5\36\20\2\u009f\u00a0\7"+
		"\21\2\2\u00a0\u00a1\5\36\20\2\u00a1\31\3\2\2\2\u00a2\u00a3\5*\26\2\u00a3"+
		"\u00a4\7)\2\2\u00a4\u00a5\7\22\2\2\u00a5\u00a6\7*\2\2\u00a6\33\3\2\2\2"+
		"\u00a7\u00b0\7*\2\2\u00a8\u00b0\7)\2\2\u00a9\u00aa\7)\2\2\u00aa\u00ab"+
		"\t\2\2\2\u00ab\u00b0\5\34\17\2\u00ac\u00ad\7*\2\2\u00ad\u00ae\t\2\2\2"+
		"\u00ae\u00b0\5\34\17\2\u00af\u00a7\3\2\2\2\u00af\u00a8\3\2\2\2\u00af\u00a9"+
		"\3\2\2\2\u00af\u00ac\3\2\2\2\u00b0\35\3\2\2\2\u00b1\u00b7\5\34\17\2\u00b2"+
		"\u00b3\5\34\17\2\u00b3\u00b4\t\3\2\2\u00b4\u00b5\5\36\20\2\u00b5\u00b7"+
		"\3\2\2\2\u00b6\u00b1\3\2\2\2\u00b6\u00b2\3\2\2\2\u00b7\37\3\2\2\2\u00b8"+
		"\u00be\5,\27\2\u00b9\u00ba\5\36\20\2\u00ba\u00bb\7\21\2\2\u00bb\u00bc"+
		"\5\36\20\2\u00bc\u00be\3\2\2\2\u00bd\u00b8\3\2\2\2\u00bd\u00b9\3\2\2\2"+
		"\u00be!\3\2\2\2\u00bf\u00c0\7\'\2\2\u00c0\u00c1\5 \21\2\u00c1\u00c2\7"+
		"\5\2\2\u00c2\u00c3\5\24\13\2\u00c3\u00c4\7\6\2\2\u00c4\u00c5\5\24\13\2"+
		"\u00c5#\3\2\2\2\u00c6\u00c7\7\7\2\2\u00c7\u00c8\5\36\20\2\u00c8\u00c9"+
		"\7\36\2\2\u00c9\u00ca\7\34\2\2\u00ca%\3\2\2\2\u00cb\u00cc\7\b\2\2\u00cc"+
		"\'\3\2\2\2\u00cd\u00ce\7\t\2\2\u00ce)\3\2\2\2\u00cf\u00d0\t\4\2\2\u00d0"+
		"+\3\2\2\2\u00d1\u00d2\t\5\2\2\u00d2-\3\2\2\2\u00d3\u00d4\7\f\2\2\u00d4"+
		"/\3\2\2\2\u00d5\u00d6\7\r\2\2\u00d6\61\3\2\2\2\229?EH]dpw}\u0082\u0086"+
		"\u008a\u0098\u00af\u00b6\u00bd";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}