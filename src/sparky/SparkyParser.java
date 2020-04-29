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
		T__9=10, T__10=11, T__11=12, T__12=13, ANDOROPERATOR=14, AND=15, OR=16, 
		NOT=17, LIVE=18, DIE=19, FI=20, YESNOOPERATOR=21, EQUALTO=22, ASSEQ=23, 
		LESS_THAN=24, MORE_THAN=25, LESS_THAN_EQ=26, MORE_THAN_EQ=27, PLUS=28, 
		MINUS=29, MUL=30, DIV=31, SEMICOLON=32, COMMA=33, LSmoothBrace=34, RSmoothBrace=35, 
		LCurlyBrace=36, RCurlyBrace=37, DQ=38, STRINGLITERAL=39, HAINA=40, INTEGER=41, 
		STRING=42, DOUBLE=43, DECIMAL=44, CHAR=45, IF=46, WHILE=47, STUFF=48, 
		NUMBER=49, WS=50;
	public static final int
		RULE_program = 0, RULE_ball = 1, RULE_declare = 2, RULE_expression = 3, 
		RULE_assignment = 4, RULE_ifte = 5, RULE_loopum = 6, RULE_loop_for = 7, 
		RULE_loop_while = 8, RULE_loop_for_range = 9, RULE_in_loop = 10, RULE_for_expr = 11, 
		RULE_for_expression = 12, RULE_for_declare = 13, RULE_term = 14, RULE_expr = 15, 
		RULE_yesnostatement = 16, RULE_ternary_operator = 17, RULE_print = 18, 
		RULE_warna = 19, RULE_haina = 20, RULE_datatype = 21, RULE_stringdatatype = 22, 
		RULE_booleanvalue = 23, RULE_yup = 24, RULE_nope = 25;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "ball", "declare", "expression", "assignment", "ifte", "loopum", 
			"loop_for", "loop_while", "loop_for_range", "in_loop", "for_expr", "for_expression", 
			"for_declare", "term", "expr", "yesnostatement", "ternary_operator", 
			"print", "warna", "haina", "datatype", "stringdatatype", "booleanvalue", 
			"yup", "nope"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'warna'", "'for'", "'in'", "'range'", "'?'", "':'", "'print'", 
			"'else'", "'bool'", "'yup'", "'nope'", "'true'", "'false'", null, "'and'", 
			"'or'", "'not'", "'Live'", "'Die'", "'fi'", null, "'='", "'=='", "'<'", 
			"'>'", "'<='", "'>='", "'+'", "'-'", "'*'", "'/'", "';'", "','", "'('", 
			"')'", "'{'", "'}'", "'\"'", null, "'haina'", "'int'", "'string'", "'double'", 
			"'float'", "'char'", "'if'", "'while'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, "ANDOROPERATOR", "AND", "OR", "NOT", "LIVE", "DIE", "FI", 
			"YESNOOPERATOR", "EQUALTO", "ASSEQ", "LESS_THAN", "MORE_THAN", "LESS_THAN_EQ", 
			"MORE_THAN_EQ", "PLUS", "MINUS", "MUL", "DIV", "SEMICOLON", "COMMA", 
			"LSmoothBrace", "RSmoothBrace", "LCurlyBrace", "RCurlyBrace", "DQ", "STRINGLITERAL", 
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
			setState(52);
			match(LIVE);
			setState(53);
			ball();
			setState(54);
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
			setState(74);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(59);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__6) | (1L << T__9) | (1L << T__10) | (1L << NOT) | (1L << IF) | (1L << WHILE) | (1L << STUFF) | (1L << NUMBER))) != 0)) {
					{
					{
					setState(56);
					expression();
					}
					}
					setState(61);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(65);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << HAINA) | (1L << INTEGER) | (1L << STRING) | (1L << DOUBLE) | (1L << DECIMAL) | (1L << CHAR))) != 0)) {
					{
					{
					setState(62);
					declare();
					}
					}
					setState(67);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(71);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__6) | (1L << T__9) | (1L << T__10) | (1L << NOT) | (1L << IF) | (1L << WHILE) | (1L << STUFF) | (1L << NUMBER))) != 0)) {
					{
					{
					setState(68);
					expression();
					}
					}
					setState(73);
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
		public StringdatatypeContext stringdatatype() {
			return getRuleContext(StringdatatypeContext.class,0);
		}
		public TerminalNode STRINGLITERAL() { return getToken(SparkyParser.STRINGLITERAL, 0); }
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
			setState(105);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(76);
				datatype();
				setState(77);
				match(STUFF);
				setState(78);
				match(EQUALTO);
				setState(79);
				match(NUMBER);
				setState(80);
				match(SEMICOLON);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(82);
				datatype();
				setState(83);
				match(STUFF);
				setState(84);
				match(SEMICOLON);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(86);
				match(HAINA);
				setState(87);
				match(STUFF);
				setState(88);
				match(EQUALTO);
				setState(89);
				booleanvalue();
				setState(90);
				match(SEMICOLON);
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				{
				setState(92);
				match(HAINA);
				setState(93);
				match(STUFF);
				setState(94);
				match(SEMICOLON);
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(95);
				stringdatatype();
				setState(96);
				match(STUFF);
				setState(97);
				match(EQUALTO);
				setState(98);
				match(STRINGLITERAL);
				setState(99);
				match(SEMICOLON);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(101);
				stringdatatype();
				setState(102);
				match(STUFF);
				setState(103);
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
			setState(112);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(107);
				assignment();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(108);
				ifte();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(109);
				loopum();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(110);
				ternary_operator();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(111);
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
			setState(124);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(114);
				match(STUFF);
				setState(115);
				match(EQUALTO);
				setState(116);
				expr();
				setState(117);
				match(SEMICOLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(119);
				match(STUFF);
				setState(120);
				match(EQUALTO);
				setState(121);
				yesnostatement(0);
				setState(122);
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
			setState(126);
			match(IF);
			setState(127);
			yesnostatement(0);
			setState(128);
			in_loop();
			setState(131);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(129);
				match(T__0);
				setState(130);
				in_loop();
				}
			}

			setState(133);
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
		public Loop_for_rangeContext loop_for_range() {
			return getRuleContext(Loop_for_rangeContext.class,0);
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
			setState(138);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(135);
				loop_for();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(136);
				loop_while();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(137);
				loop_for_range();
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
			setState(140);
			match(T__1);
			setState(141);
			match(LSmoothBrace);
			setState(143);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << HAINA) | (1L << INTEGER) | (1L << DOUBLE) | (1L << DECIMAL) | (1L << CHAR))) != 0)) {
				{
				setState(142);
				for_declare();
				}
			}

			setState(145);
			match(SEMICOLON);
			setState(147);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NOT) | (1L << STUFF) | (1L << NUMBER))) != 0)) {
				{
				setState(146);
				for_expression();
				}
			}

			setState(149);
			match(SEMICOLON);
			setState(151);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STUFF) {
				{
				setState(150);
				for_expr();
				}
			}

			setState(153);
			match(RSmoothBrace);
			setState(154);
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
			setState(156);
			match(WHILE);
			setState(157);
			yesnostatement(0);
			setState(158);
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

	public static class Loop_for_rangeContext extends ParserRuleContext {
		public TerminalNode STUFF() { return getToken(SparkyParser.STUFF, 0); }
		public TerminalNode LSmoothBrace() { return getToken(SparkyParser.LSmoothBrace, 0); }
		public List<TerminalNode> NUMBER() { return getTokens(SparkyParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(SparkyParser.NUMBER, i);
		}
		public TerminalNode COMMA() { return getToken(SparkyParser.COMMA, 0); }
		public TerminalNode RSmoothBrace() { return getToken(SparkyParser.RSmoothBrace, 0); }
		public In_loopContext in_loop() {
			return getRuleContext(In_loopContext.class,0);
		}
		public Loop_for_rangeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loop_for_range; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkyListener ) ((SparkyListener)listener).enterLoop_for_range(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkyListener ) ((SparkyListener)listener).exitLoop_for_range(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkyVisitor ) return ((SparkyVisitor<? extends T>)visitor).visitLoop_for_range(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Loop_for_rangeContext loop_for_range() throws RecognitionException {
		Loop_for_rangeContext _localctx = new Loop_for_rangeContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_loop_for_range);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			match(T__1);
			setState(161);
			match(STUFF);
			setState(162);
			match(T__2);
			setState(163);
			match(T__3);
			setState(164);
			match(LSmoothBrace);
			setState(165);
			match(NUMBER);
			setState(166);
			match(COMMA);
			setState(167);
			match(NUMBER);
			setState(168);
			match(RSmoothBrace);
			setState(169);
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
		enterRule(_localctx, 20, RULE_in_loop);
		try {
			setState(176);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LCurlyBrace:
				enterOuterAlt(_localctx, 1);
				{
				setState(171);
				match(LCurlyBrace);
				setState(172);
				ball();
				setState(173);
				match(RCurlyBrace);
				}
				break;
			case T__1:
			case T__6:
			case T__9:
			case T__10:
			case NOT:
			case IF:
			case WHILE:
			case STUFF:
			case NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(175);
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
		enterRule(_localctx, 22, RULE_for_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
			match(STUFF);
			setState(179);
			match(EQUALTO);
			setState(180);
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
		enterRule(_localctx, 24, RULE_for_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
			expr();
			setState(183);
			match(YESNOOPERATOR);
			setState(184);
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
		enterRule(_localctx, 26, RULE_for_declare);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			datatype();
			setState(187);
			match(STUFF);
			setState(188);
			match(EQUALTO);
			setState(189);
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
		enterRule(_localctx, 28, RULE_term);
		int _la;
		try {
			setState(199);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(191);
				match(NUMBER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(192);
				match(STUFF);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(193);
				match(STUFF);
				setState(194);
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
				setState(195);
				term();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(196);
				match(NUMBER);
				setState(197);
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
				setState(198);
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
		public TerminalNode NOT() { return getToken(SparkyParser.NOT, 0); }
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
		enterRule(_localctx, 30, RULE_expr);
		int _la;
		try {
			setState(208);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(201);
				term();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(202);
				term();
				setState(203);
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
				setState(204);
				expr();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(206);
				match(NOT);
				setState(207);
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
		public List<YesnostatementContext> yesnostatement() {
			return getRuleContexts(YesnostatementContext.class);
		}
		public YesnostatementContext yesnostatement(int i) {
			return getRuleContext(YesnostatementContext.class,i);
		}
		public TerminalNode ANDOROPERATOR() { return getToken(SparkyParser.ANDOROPERATOR, 0); }
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
		return yesnostatement(0);
	}

	private YesnostatementContext yesnostatement(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		YesnostatementContext _localctx = new YesnostatementContext(_ctx, _parentState);
		YesnostatementContext _prevctx = _localctx;
		int _startState = 32;
		enterRecursionRule(_localctx, 32, RULE_yesnostatement, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__9:
			case T__10:
				{
				setState(211);
				booleanvalue();
				}
				break;
			case NOT:
			case STUFF:
			case NUMBER:
				{
				setState(212);
				expr();
				setState(213);
				match(YESNOOPERATOR);
				setState(214);
				expr();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(223);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new YesnostatementContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_yesnostatement);
					setState(218);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(219);
					match(ANDOROPERATOR);
					setState(220);
					yesnostatement(2);
					}
					} 
				}
				setState(225);
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

	public static class Ternary_operatorContext extends ParserRuleContext {
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
		enterRule(_localctx, 34, RULE_ternary_operator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(226);
			yesnostatement(0);
			setState(227);
			match(T__4);
			setState(228);
			in_loop();
			setState(229);
			match(T__5);
			setState(230);
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
		public TerminalNode LSmoothBrace() { return getToken(SparkyParser.LSmoothBrace, 0); }
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
		enterRule(_localctx, 36, RULE_print);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(232);
			match(T__6);
			setState(233);
			match(LSmoothBrace);
			setState(234);
			expr();
			setState(235);
			match(RSmoothBrace);
			setState(236);
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
		enterRule(_localctx, 38, RULE_warna);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(238);
			match(T__7);
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
		enterRule(_localctx, 40, RULE_haina);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(240);
			match(T__8);
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
		enterRule(_localctx, 42, RULE_datatype);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(242);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << HAINA) | (1L << INTEGER) | (1L << DOUBLE) | (1L << DECIMAL) | (1L << CHAR))) != 0)) ) {
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

	public static class StringdatatypeContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(SparkyParser.STRING, 0); }
		public StringdatatypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringdatatype; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkyListener ) ((SparkyListener)listener).enterStringdatatype(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkyListener ) ((SparkyListener)listener).exitStringdatatype(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkyVisitor ) return ((SparkyVisitor<? extends T>)visitor).visitStringdatatype(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringdatatypeContext stringdatatype() throws RecognitionException {
		StringdatatypeContext _localctx = new StringdatatypeContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_stringdatatype);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(244);
			match(STRING);
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
		enterRule(_localctx, 46, RULE_booleanvalue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(246);
			_la = _input.LA(1);
			if ( !(_la==T__9 || _la==T__10) ) {
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
		enterRule(_localctx, 48, RULE_yup);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(248);
			match(T__11);
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
		enterRule(_localctx, 50, RULE_nope);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(250);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 16:
			return yesnostatement_sempred((YesnostatementContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean yesnostatement_sempred(YesnostatementContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\64\u00ff\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\3\2\3\2\3\2\3\2\3\3\7\3<\n\3\f\3\16\3?\13\3\3\3\7"+
		"\3B\n\3\f\3\16\3E\13\3\3\3\7\3H\n\3\f\3\16\3K\13\3\5\3M\n\3\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4l\n\4\3\5\3\5\3\5\3\5\3\5\5\5"+
		"s\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\177\n\6\3\7\3\7\3\7"+
		"\3\7\3\7\5\7\u0086\n\7\3\7\3\7\3\b\3\b\3\b\5\b\u008d\n\b\3\t\3\t\3\t\5"+
		"\t\u0092\n\t\3\t\3\t\5\t\u0096\n\t\3\t\3\t\5\t\u009a\n\t\3\t\3\t\3\t\3"+
		"\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\f\3\f\3\f\3\f\3\f\5\f\u00b3\n\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16"+
		"\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20"+
		"\u00ca\n\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u00d3\n\21\3\22\3"+
		"\22\3\22\3\22\3\22\3\22\5\22\u00db\n\22\3\22\3\22\3\22\7\22\u00e0\n\22"+
		"\f\22\16\22\u00e3\13\22\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3"+
		"\24\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3"+
		"\32\3\33\3\33\3\33\2\3\"\34\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \""+
		"$&(*,.\60\62\64\2\6\3\2 !\3\2\36\37\4\2*+-/\3\2\f\r\2\u0100\2\66\3\2\2"+
		"\2\4L\3\2\2\2\6k\3\2\2\2\br\3\2\2\2\n~\3\2\2\2\f\u0080\3\2\2\2\16\u008c"+
		"\3\2\2\2\20\u008e\3\2\2\2\22\u009e\3\2\2\2\24\u00a2\3\2\2\2\26\u00b2\3"+
		"\2\2\2\30\u00b4\3\2\2\2\32\u00b8\3\2\2\2\34\u00bc\3\2\2\2\36\u00c9\3\2"+
		"\2\2 \u00d2\3\2\2\2\"\u00da\3\2\2\2$\u00e4\3\2\2\2&\u00ea\3\2\2\2(\u00f0"+
		"\3\2\2\2*\u00f2\3\2\2\2,\u00f4\3\2\2\2.\u00f6\3\2\2\2\60\u00f8\3\2\2\2"+
		"\62\u00fa\3\2\2\2\64\u00fc\3\2\2\2\66\67\7\24\2\2\678\5\4\3\289\7\25\2"+
		"\29\3\3\2\2\2:<\5\b\5\2;:\3\2\2\2<?\3\2\2\2=;\3\2\2\2=>\3\2\2\2>M\3\2"+
		"\2\2?=\3\2\2\2@B\5\6\4\2A@\3\2\2\2BE\3\2\2\2CA\3\2\2\2CD\3\2\2\2DI\3\2"+
		"\2\2EC\3\2\2\2FH\5\b\5\2GF\3\2\2\2HK\3\2\2\2IG\3\2\2\2IJ\3\2\2\2JM\3\2"+
		"\2\2KI\3\2\2\2L=\3\2\2\2LC\3\2\2\2M\5\3\2\2\2NO\5,\27\2OP\7\62\2\2PQ\7"+
		"\30\2\2QR\7\63\2\2RS\7\"\2\2Sl\3\2\2\2TU\5,\27\2UV\7\62\2\2VW\7\"\2\2"+
		"Wl\3\2\2\2XY\7*\2\2YZ\7\62\2\2Z[\7\30\2\2[\\\5\60\31\2\\]\7\"\2\2]l\3"+
		"\2\2\2^_\7*\2\2_`\7\62\2\2`l\7\"\2\2ab\5.\30\2bc\7\62\2\2cd\7\30\2\2d"+
		"e\7)\2\2ef\7\"\2\2fl\3\2\2\2gh\5.\30\2hi\7\62\2\2ij\7\"\2\2jl\3\2\2\2"+
		"kN\3\2\2\2kT\3\2\2\2kX\3\2\2\2k^\3\2\2\2ka\3\2\2\2kg\3\2\2\2l\7\3\2\2"+
		"\2ms\5\n\6\2ns\5\f\7\2os\5\16\b\2ps\5$\23\2qs\5&\24\2rm\3\2\2\2rn\3\2"+
		"\2\2ro\3\2\2\2rp\3\2\2\2rq\3\2\2\2s\t\3\2\2\2tu\7\62\2\2uv\7\30\2\2vw"+
		"\5 \21\2wx\7\"\2\2x\177\3\2\2\2yz\7\62\2\2z{\7\30\2\2{|\5\"\22\2|}\7\""+
		"\2\2}\177\3\2\2\2~t\3\2\2\2~y\3\2\2\2\177\13\3\2\2\2\u0080\u0081\7\60"+
		"\2\2\u0081\u0082\5\"\22\2\u0082\u0085\5\26\f\2\u0083\u0084\7\3\2\2\u0084"+
		"\u0086\5\26\f\2\u0085\u0083\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u0087\3"+
		"\2\2\2\u0087\u0088\7\26\2\2\u0088\r\3\2\2\2\u0089\u008d\5\20\t\2\u008a"+
		"\u008d\5\22\n\2\u008b\u008d\5\24\13\2\u008c\u0089\3\2\2\2\u008c\u008a"+
		"\3\2\2\2\u008c\u008b\3\2\2\2\u008d\17\3\2\2\2\u008e\u008f\7\4\2\2\u008f"+
		"\u0091\7$\2\2\u0090\u0092\5\34\17\2\u0091\u0090\3\2\2\2\u0091\u0092\3"+
		"\2\2\2\u0092\u0093\3\2\2\2\u0093\u0095\7\"\2\2\u0094\u0096\5\32\16\2\u0095"+
		"\u0094\3\2\2\2\u0095\u0096\3\2\2\2\u0096\u0097\3\2\2\2\u0097\u0099\7\""+
		"\2\2\u0098\u009a\5\30\r\2\u0099\u0098\3\2\2\2\u0099\u009a\3\2\2\2\u009a"+
		"\u009b\3\2\2\2\u009b\u009c\7%\2\2\u009c\u009d\5\26\f\2\u009d\21\3\2\2"+
		"\2\u009e\u009f\7\61\2\2\u009f\u00a0\5\"\22\2\u00a0\u00a1\5\26\f\2\u00a1"+
		"\23\3\2\2\2\u00a2\u00a3\7\4\2\2\u00a3\u00a4\7\62\2\2\u00a4\u00a5\7\5\2"+
		"\2\u00a5\u00a6\7\6\2\2\u00a6\u00a7\7$\2\2\u00a7\u00a8\7\63\2\2\u00a8\u00a9"+
		"\7#\2\2\u00a9\u00aa\7\63\2\2\u00aa\u00ab\7%\2\2\u00ab\u00ac\5\26\f\2\u00ac"+
		"\25\3\2\2\2\u00ad\u00ae\7&\2\2\u00ae\u00af\5\4\3\2\u00af\u00b0\7\'\2\2"+
		"\u00b0\u00b3\3\2\2\2\u00b1\u00b3\5\b\5\2\u00b2\u00ad\3\2\2\2\u00b2\u00b1"+
		"\3\2\2\2\u00b3\27\3\2\2\2\u00b4\u00b5\7\62\2\2\u00b5\u00b6\7\30\2\2\u00b6"+
		"\u00b7\5 \21\2\u00b7\31\3\2\2\2\u00b8\u00b9\5 \21\2\u00b9\u00ba\7\27\2"+
		"\2\u00ba\u00bb\5 \21\2\u00bb\33\3\2\2\2\u00bc\u00bd\5,\27\2\u00bd\u00be"+
		"\7\62\2\2\u00be\u00bf\7\30\2\2\u00bf\u00c0\7\63\2\2\u00c0\35\3\2\2\2\u00c1"+
		"\u00ca\7\63\2\2\u00c2\u00ca\7\62\2\2\u00c3\u00c4\7\62\2\2\u00c4\u00c5"+
		"\t\2\2\2\u00c5\u00ca\5\36\20\2\u00c6\u00c7\7\63\2\2\u00c7\u00c8\t\2\2"+
		"\2\u00c8\u00ca\5\36\20\2\u00c9\u00c1\3\2\2\2\u00c9\u00c2\3\2\2\2\u00c9"+
		"\u00c3\3\2\2\2\u00c9\u00c6\3\2\2\2\u00ca\37\3\2\2\2\u00cb\u00d3\5\36\20"+
		"\2\u00cc\u00cd\5\36\20\2\u00cd\u00ce\t\3\2\2\u00ce\u00cf\5 \21\2\u00cf"+
		"\u00d3\3\2\2\2\u00d0\u00d1\7\23\2\2\u00d1\u00d3\5 \21\2\u00d2\u00cb\3"+
		"\2\2\2\u00d2\u00cc\3\2\2\2\u00d2\u00d0\3\2\2\2\u00d3!\3\2\2\2\u00d4\u00d5"+
		"\b\22\1\2\u00d5\u00db\5\60\31\2\u00d6\u00d7\5 \21\2\u00d7\u00d8\7\27\2"+
		"\2\u00d8\u00d9\5 \21\2\u00d9\u00db\3\2\2\2\u00da\u00d4\3\2\2\2\u00da\u00d6"+
		"\3\2\2\2\u00db\u00e1\3\2\2\2\u00dc\u00dd\f\3\2\2\u00dd\u00de\7\20\2\2"+
		"\u00de\u00e0\5\"\22\4\u00df\u00dc\3\2\2\2\u00e0\u00e3\3\2\2\2\u00e1\u00df"+
		"\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2#\3\2\2\2\u00e3\u00e1\3\2\2\2\u00e4"+
		"\u00e5\5\"\22\2\u00e5\u00e6\7\7\2\2\u00e6\u00e7\5\26\f\2\u00e7\u00e8\7"+
		"\b\2\2\u00e8\u00e9\5\26\f\2\u00e9%\3\2\2\2\u00ea\u00eb\7\t\2\2\u00eb\u00ec"+
		"\7$\2\2\u00ec\u00ed\5 \21\2\u00ed\u00ee\7%\2\2\u00ee\u00ef\7\"\2\2\u00ef"+
		"\'\3\2\2\2\u00f0\u00f1\7\n\2\2\u00f1)\3\2\2\2\u00f2\u00f3\7\13\2\2\u00f3"+
		"+\3\2\2\2\u00f4\u00f5\t\4\2\2\u00f5-\3\2\2\2\u00f6\u00f7\7,\2\2\u00f7"+
		"/\3\2\2\2\u00f8\u00f9\t\5\2\2\u00f9\61\3\2\2\2\u00fa\u00fb\7\16\2\2\u00fb"+
		"\63\3\2\2\2\u00fc\u00fd\7\17\2\2\u00fd\65\3\2\2\2\23=CILkr~\u0085\u008c"+
		"\u0091\u0095\u0099\u00b2\u00c9\u00d2\u00da\u00e1";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}