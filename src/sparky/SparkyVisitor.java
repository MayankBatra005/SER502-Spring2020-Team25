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
	 * Visit a parse tree produced by {@link SparkyParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(SparkyParser.ProgramContext ctx);
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
	 * Visit a parse tree produced by {@link SparkyParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(SparkyParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkyParser#ifte}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfte(SparkyParser.IfteContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkyParser#loopum}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoopum(SparkyParser.LoopumContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkyParser#loop_for}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoop_for(SparkyParser.Loop_forContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkyParser#loop_while}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoop_while(SparkyParser.Loop_whileContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkyParser#in_loop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIn_loop(SparkyParser.In_loopContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkyParser#for_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_expr(SparkyParser.For_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkyParser#for_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_expression(SparkyParser.For_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkyParser#for_declare}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_declare(SparkyParser.For_declareContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkyParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(SparkyParser.TermContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkyParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(SparkyParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkyParser#yesnostatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitYesnostatement(SparkyParser.YesnostatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkyParser#ternary_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTernary_operator(SparkyParser.Ternary_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkyParser#print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(SparkyParser.PrintContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkyParser#warna}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWarna(SparkyParser.WarnaContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkyParser#haina}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHaina(SparkyParser.HainaContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkyParser#datatype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDatatype(SparkyParser.DatatypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkyParser#yup}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitYup(SparkyParser.YupContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkyParser#nope}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNope(SparkyParser.NopeContext ctx);
}