// Generated from Sparky.g4 by ANTLR 4.8
package sparky;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SparkyParser}.
 */
public interface SparkyListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SparkyParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(SparkyParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkyParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(SparkyParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkyParser#ball}.
	 * @param ctx the parse tree
	 */
	void enterBall(SparkyParser.BallContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkyParser#ball}.
	 * @param ctx the parse tree
	 */
	void exitBall(SparkyParser.BallContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkyParser#declare}.
	 * @param ctx the parse tree
	 */
	void enterDeclare(SparkyParser.DeclareContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkyParser#declare}.
	 * @param ctx the parse tree
	 */
	void exitDeclare(SparkyParser.DeclareContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkyParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(SparkyParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkyParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(SparkyParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkyParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(SparkyParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkyParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(SparkyParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkyParser#ifte}.
	 * @param ctx the parse tree
	 */
	void enterIfte(SparkyParser.IfteContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkyParser#ifte}.
	 * @param ctx the parse tree
	 */
	void exitIfte(SparkyParser.IfteContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkyParser#loopum}.
	 * @param ctx the parse tree
	 */
	void enterLoopum(SparkyParser.LoopumContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkyParser#loopum}.
	 * @param ctx the parse tree
	 */
	void exitLoopum(SparkyParser.LoopumContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkyParser#loop_for}.
	 * @param ctx the parse tree
	 */
	void enterLoop_for(SparkyParser.Loop_forContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkyParser#loop_for}.
	 * @param ctx the parse tree
	 */
	void exitLoop_for(SparkyParser.Loop_forContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkyParser#loop_while}.
	 * @param ctx the parse tree
	 */
	void enterLoop_while(SparkyParser.Loop_whileContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkyParser#loop_while}.
	 * @param ctx the parse tree
	 */
	void exitLoop_while(SparkyParser.Loop_whileContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkyParser#loop_for_range}.
	 * @param ctx the parse tree
	 */
	void enterLoop_for_range(SparkyParser.Loop_for_rangeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkyParser#loop_for_range}.
	 * @param ctx the parse tree
	 */
	void exitLoop_for_range(SparkyParser.Loop_for_rangeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkyParser#in_loop}.
	 * @param ctx the parse tree
	 */
	void enterIn_loop(SparkyParser.In_loopContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkyParser#in_loop}.
	 * @param ctx the parse tree
	 */
	void exitIn_loop(SparkyParser.In_loopContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkyParser#for_expr}.
	 * @param ctx the parse tree
	 */
	void enterFor_expr(SparkyParser.For_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkyParser#for_expr}.
	 * @param ctx the parse tree
	 */
	void exitFor_expr(SparkyParser.For_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkyParser#for_expression}.
	 * @param ctx the parse tree
	 */
	void enterFor_expression(SparkyParser.For_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkyParser#for_expression}.
	 * @param ctx the parse tree
	 */
	void exitFor_expression(SparkyParser.For_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkyParser#for_declare}.
	 * @param ctx the parse tree
	 */
	void enterFor_declare(SparkyParser.For_declareContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkyParser#for_declare}.
	 * @param ctx the parse tree
	 */
	void exitFor_declare(SparkyParser.For_declareContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkyParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(SparkyParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkyParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(SparkyParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkyParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(SparkyParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkyParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(SparkyParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkyParser#yesnostatement}.
	 * @param ctx the parse tree
	 */
	void enterYesnostatement(SparkyParser.YesnostatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkyParser#yesnostatement}.
	 * @param ctx the parse tree
	 */
	void exitYesnostatement(SparkyParser.YesnostatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkyParser#ternary_operator}.
	 * @param ctx the parse tree
	 */
	void enterTernary_operator(SparkyParser.Ternary_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkyParser#ternary_operator}.
	 * @param ctx the parse tree
	 */
	void exitTernary_operator(SparkyParser.Ternary_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkyParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(SparkyParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkyParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(SparkyParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkyParser#warna}.
	 * @param ctx the parse tree
	 */
	void enterWarna(SparkyParser.WarnaContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkyParser#warna}.
	 * @param ctx the parse tree
	 */
	void exitWarna(SparkyParser.WarnaContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkyParser#haina}.
	 * @param ctx the parse tree
	 */
	void enterHaina(SparkyParser.HainaContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkyParser#haina}.
	 * @param ctx the parse tree
	 */
	void exitHaina(SparkyParser.HainaContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkyParser#datatype}.
	 * @param ctx the parse tree
	 */
	void enterDatatype(SparkyParser.DatatypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkyParser#datatype}.
	 * @param ctx the parse tree
	 */
	void exitDatatype(SparkyParser.DatatypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkyParser#stringdatatype}.
	 * @param ctx the parse tree
	 */
	void enterStringdatatype(SparkyParser.StringdatatypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkyParser#stringdatatype}.
	 * @param ctx the parse tree
	 */
	void exitStringdatatype(SparkyParser.StringdatatypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkyParser#booleanvalue}.
	 * @param ctx the parse tree
	 */
	void enterBooleanvalue(SparkyParser.BooleanvalueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkyParser#booleanvalue}.
	 * @param ctx the parse tree
	 */
	void exitBooleanvalue(SparkyParser.BooleanvalueContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkyParser#yup}.
	 * @param ctx the parse tree
	 */
	void enterYup(SparkyParser.YupContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkyParser#yup}.
	 * @param ctx the parse tree
	 */
	void exitYup(SparkyParser.YupContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkyParser#nope}.
	 * @param ctx the parse tree
	 */
	void enterNope(SparkyParser.NopeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkyParser#nope}.
	 * @param ctx the parse tree
	 */
	void exitNope(SparkyParser.NopeContext ctx);
}