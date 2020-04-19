// Generated from Sparky.g4 by ANTLR 4.8
package sparky;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SparkyParser}.
 */
public interface SparkyListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SparkyParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(SparkyParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkyParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(SparkyParser.ProgContext ctx);
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
	 * Enter a parse tree produced by {@link SparkyParser#e1}.
	 * @param ctx the parse tree
	 */
	void enterE1(SparkyParser.E1Context ctx);
	/**
	 * Exit a parse tree produced by {@link SparkyParser#e1}.
	 * @param ctx the parse tree
	 */
	void exitE1(SparkyParser.E1Context ctx);
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
	 * Enter a parse tree produced by {@link SparkyParser#term1}.
	 * @param ctx the parse tree
	 */
	void enterTerm1(SparkyParser.Term1Context ctx);
	/**
	 * Exit a parse tree produced by {@link SparkyParser#term1}.
	 * @param ctx the parse tree
	 */
	void exitTerm1(SparkyParser.Term1Context ctx);
	/**
	 * Enter a parse tree produced by {@link SparkyParser#term2}.
	 * @param ctx the parse tree
	 */
	void enterTerm2(SparkyParser.Term2Context ctx);
	/**
	 * Exit a parse tree produced by {@link SparkyParser#term2}.
	 * @param ctx the parse tree
	 */
	void exitTerm2(SparkyParser.Term2Context ctx);
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
	 * Enter a parse tree produced by {@link SparkyParser#assignedstuff}.
	 * @param ctx the parse tree
	 */
	void enterAssignedstuff(SparkyParser.AssignedstuffContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkyParser#assignedstuff}.
	 * @param ctx the parse tree
	 */
	void exitAssignedstuff(SparkyParser.AssignedstuffContext ctx);
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
	 * Enter a parse tree produced by {@link SparkyParser#datatype}.
	 * @param ctx the parse tree
	 */
	void enterDatatype(SparkyParser.DatatypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkyParser#datatype}.
	 * @param ctx the parse tree
	 */
	void exitDatatype(SparkyParser.DatatypeContext ctx);
}