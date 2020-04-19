// Generated from Sparky.g4 by ANTLR 4.8
package sparky;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SparkyParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SparkyVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SparkyParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(SparkyParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkyParser#ball}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBall(SparkyParser.BallContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkyParser#declare}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclare(SparkyParser.DeclareContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkyParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(SparkyParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkyParser#e1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitE1(SparkyParser.E1Context ctx);
	/**
	 * Visit a parse tree produced by {@link SparkyParser#loopum}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoopum(SparkyParser.LoopumContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkyParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(SparkyParser.TermContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkyParser#term1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm1(SparkyParser.Term1Context ctx);
	/**
	 * Visit a parse tree produced by {@link SparkyParser#term2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm2(SparkyParser.Term2Context ctx);
	/**
	 * Visit a parse tree produced by {@link SparkyParser#in_loop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIn_loop(SparkyParser.In_loopContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkyParser#assignedstuff}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignedstuff(SparkyParser.AssignedstuffContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkyParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(SparkyParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkyParser#yesnostatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitYesnostatement(SparkyParser.YesnostatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkyParser#datatype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDatatype(SparkyParser.DatatypeContext ctx);
}