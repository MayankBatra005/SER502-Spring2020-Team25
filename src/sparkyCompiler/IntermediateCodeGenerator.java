package sparkyCompiler;


/**
 * In this class methods from SparkyBaseVisitor are overloaded for intermediate course generation according to Sparky grammar.
 * @author Sayali Tanawade
 * @since April-20-2020
 * @version 1.0
 */

import sparky.SparkyBaseVisitor;
import sparky.SparkyParser;
import sparkyRuntime.RuntimeConstantKeywords;

public class IntermediateCodeGenerator extends SparkyBaseVisitor<Object> {
	
	private class Helper {
        private String icOutput = "";
        private void addOutput(String output) {
            this.icOutput += output + "\n";
        }
    }
	
	private Helper help = new Helper();
	
	public String getOutput() {
		return help.icOutput;
	}
	
	@Override public Object visitProgram(SparkyParser.ProgramContext ctx) { return visitChildren(ctx); }
	
	@Override public Object visitBall(SparkyParser.BallContext ctx) {
		
		
		//return null;}
		return visitChildren(ctx); }
	
	@Override public Object visitDeclare(SparkyParser.DeclareContext ctx) {
		help.addOutput(RuntimeConstantKeywords.DECLARE + " " + ctx.datatype().getChild(0).getText() +" " + ctx.STUFF().getText());			
		
		if (ctx.NUMBER() !=null) {
			help.addOutput(RuntimeConstantKeywords.INSTRUCTION + " " + ctx.NUMBER().getText());
		}
		
		//if(ctx.b
				
		return null; 
		
	}
	
	@Override public Object visitExpression(SparkyParser.ExpressionContext ctx) { 
		//String exprChildTest = ctx.getChild(0).getText();
		//help.addOutput("Testing expr child node" + " " + exprChildTest);
		
		
		return visitChildren(ctx);} 
		//return null; }
	
	
	
	@Override public Object visitAssignment(SparkyParser.AssignmentContext ctx) { 
		//String stuff = ctx.STUFF().getText();
		String equal = ctx.EQUALTO().getText();
		//String expr0 = ctx.expr().getChild(0).getText();
		String expr1 = ctx.expr().getChild(1).getText();
		// String expr2 = ctx.expr().getChild(2).getText();
//		help.addOutput("Test stuff" + "" + stuff);
//		help.addOutput("Test equal" + "" + equal);
		//help.addOutput("Test expr0 1 2 " + " " + expr0 + " "+ expr1 + " " +expr2);
		help.addOutput(RuntimeConstantKeywords.GET + " " + ctx.expr().getChild(0).getText());		
		help.addOutput(RuntimeConstantKeywords.GET + " " + ctx.expr().getChild(2).getText());
		
		switch(ctx.expr().getChild(1).getText()) {
		case "+":
			help.addOutput(RuntimeConstantKeywords.OPERATOR + " " + RuntimeConstantKeywords.ADDITION);
			break;
		case "-":
			help.addOutput(RuntimeConstantKeywords.OPERATOR + " " + RuntimeConstantKeywords.SUBTRACTION);
			break;
		case "*":
			help.addOutput(RuntimeConstantKeywords.OPERATOR + " " + RuntimeConstantKeywords.MULTIPLICATION);
			break;
		case "/":
			help.addOutput(RuntimeConstantKeywords.OPERATOR + " " + RuntimeConstantKeywords.DIVSION);
			break;
		}
		help.addOutput(RuntimeConstantKeywords.PUSH + " " + ctx.STUFF().getText());
		
		return null; }
	
	
	@Override public Object visitIfte(SparkyParser.IfteContext ctx) {
		help.addOutput(RuntimeConstantKeywords.IFTE_START);
		help.addOutput(RuntimeConstantKeywords.CHECK_CONDITION + " " + ctx.yesnostatement().getText());
		help.addOutput(RuntimeConstantKeywords.CONDITION_FALSE + " " + RuntimeConstantKeywords.JUMP + " " + RuntimeConstantKeywords.ELSE_START);

		help.addOutput(RuntimeConstantKeywords.IF_START);
		visit(ctx.in_loop(0));
		help.addOutput(RuntimeConstantKeywords.IF_END);
		help.addOutput(RuntimeConstantKeywords.ELSE_START);
		visit(ctx.in_loop(1));
		help.addOutput(RuntimeConstantKeywords.ELSE_END);
		help.addOutput(RuntimeConstantKeywords.IFTE_END);
		
		
			
		return null; }
		//return visitChildren(ctx); }
	
	@Override public Object visitLoopum(SparkyParser.LoopumContext ctx) { return visitChildren(ctx); }
	
	@Override public Object visitLoop_for(SparkyParser.Loop_forContext ctx) { return visitChildren(ctx); }
	
	@Override public Object visitLoop_while(SparkyParser.Loop_whileContext ctx) { return visitChildren(ctx); }
	
	@Override public Object visitIn_loop(SparkyParser.In_loopContext ctx) {
		visit(ctx.ball());
		return null; }
		//return visitChildren(ctx); }
	
	@Override public Object visitFor_expr(SparkyParser.For_exprContext ctx) { return visitChildren(ctx); }
	
	@Override public Object visitFor_expression(SparkyParser.For_expressionContext ctx) { return visitChildren(ctx); }
	
	@Override public Object visitFor_declare(SparkyParser.For_declareContext ctx) { return visitChildren(ctx); }
	
	@Override public Object visitTerm(SparkyParser.TermContext ctx) { return visitChildren(ctx); }
	
	@Override public Object visitExpr(SparkyParser.ExprContext ctx) { return visitChildren(ctx); }
	
	@Override public Object visitYesnostatement(SparkyParser.YesnostatementContext ctx) { 
//		visit(ctx.booleanvalue());
//		help.addOutput("Test yesnostatement ctx.booanvalue" + " " + ctx.getChild(0));
//		
//		return null;}
		return visitChildren(ctx); }
	
	@Override public Object visitTernary_operator(SparkyParser.Ternary_operatorContext ctx) { return visitChildren(ctx); }
	
	@Override public Object visitPrint(SparkyParser.PrintContext ctx) { return visitChildren(ctx); }
	
	@Override public Object visitWarna(SparkyParser.WarnaContext ctx) { return visitChildren(ctx); }
	
	@Override public Object visitHaina(SparkyParser.HainaContext ctx) { return visitChildren(ctx); }
	
	@Override public Object visitDatatype(SparkyParser.DatatypeContext ctx) { return visitChildren(ctx); }
	
	@Override public Object visitYup(SparkyParser.YupContext ctx) { return visitChildren(ctx); }
	
	@Override public Object visitNope(SparkyParser.NopeContext ctx) { return visitChildren(ctx); }
	
		

}
