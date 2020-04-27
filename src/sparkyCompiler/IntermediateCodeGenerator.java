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
	
	@Override public Object visitBall(SparkyParser.BallContext ctx) {return visitChildren(ctx); }
	
	@Override public Object visitDeclare(SparkyParser.DeclareContext ctx) {
		help.addOutput(RuntimeConstantKeywords.DECLARE + " " + ctx.getChild(0).getText() + " " + ctx.STUFF().getText());
		
		if (ctx.NUMBER() !=null) {
			help.addOutput(RuntimeConstantKeywords.INSTRUCTION_STORE + " " + ctx.NUMBER().getText());
			help.addOutput(RuntimeConstantKeywords.INSTRUCTION_PUSH + " " + ctx.STUFF().getText());
		} else if(ctx.getChild(0).getText().contains("string")) {
			visit(ctx.stringdatatype());
			help.addOutput(RuntimeConstantKeywords.INSTRUCTION_STORE + " " + ctx.STRINGLITERAL().getText());
		}
		
		return null; 		
	}
	
	@Override public Object visitStringdatatype(SparkyParser.StringdatatypeContext ctx) { return visitChildren(ctx); }
		
	
	@Override public Object visitExpression(SparkyParser.ExpressionContext ctx) { return visitChildren(ctx);} 

	
	
	@Override public Object visitAssignment(SparkyParser.AssignmentContext ctx) { 
		String regexStr = "^[0-9]*$";
		help.addOutput(RuntimeConstantKeywords.GET + " " + ctx.expr().getChild(0).getText());	
		if(ctx.expr().getChild(2).getText().matches(regexStr)) {
		help.addOutput(RuntimeConstantKeywords.INSTRUCTION_STORE + " " + ctx.expr().getChild(2).getText());
		}else {
			help.addOutput(RuntimeConstantKeywords.GET + " " + ctx.expr().getChild(2).getText());	
		}
		
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
		if(ctx.yesnostatement().getText().contains("yup") || ctx.yesnostatement().getText().contains("nup")) {
			help.addOutput(RuntimeConstantKeywords.CHECK_CONDITION + " " + ctx.yesnostatement().getText());
		}
		else {
			visit(ctx.yesnostatement());
		}
		
		help.addOutput(RuntimeConstantKeywords.CONDITION_FALSE + " " + RuntimeConstantKeywords.JUMP +
				" " + RuntimeConstantKeywords.ELSE_START);

		help.addOutput(RuntimeConstantKeywords.IF_START);
		//help.addOutput("Testing AND OR" + " " ctx.inlo);
		visit(ctx.in_loop(0));
		help.addOutput(RuntimeConstantKeywords.IF_END);
		if(ctx.in_loop(1) != null) {
		help.addOutput(RuntimeConstantKeywords.ELSE_START);
		visit(ctx.in_loop(1));
		help.addOutput(RuntimeConstantKeywords.ELSE_END);
		}
		help.addOutput(RuntimeConstantKeywords.IFTE_END);
		
			
		return null; }

	
	@Override public Object visitLoopum(SparkyParser.LoopumContext ctx) { return visitChildren(ctx); }
	
	@Override public Object visitLoop_for(SparkyParser.Loop_forContext ctx) { 
		help.addOutput(RuntimeConstantKeywords.FOR_START);
		visit(ctx.for_declare());
		visit(ctx.for_expression());
		visit(ctx.in_loop());
		visit(ctx.for_expr());
		help.addOutput(RuntimeConstantKeywords.FOR_STOP);
		
		return null; }
	
	@Override public Object visitLoop_for_range(SparkyParser.Loop_for_rangeContext ctx) { 
		help.addOutput(RuntimeConstantKeywords.FOR_START);
		help.addOutput(RuntimeConstantKeywords.DECLARE + " int " + ctx.STUFF().getText());
		help.addOutput(RuntimeConstantKeywords.INSTRUCTION_STORE + " " + ctx.NUMBER(0));
		help.addOutput(RuntimeConstantKeywords.INSTRUCTION_PUSH + " " + ctx.STUFF().getText());
		help.addOutput(RuntimeConstantKeywords.FOR_CONDITION_START);
		help.addOutput(RuntimeConstantKeywords.GET + " " + ctx.STUFF().getText());
		help.addOutput(RuntimeConstantKeywords.INSTRUCTION_STORE + " " + ctx.NUMBER(1));
		help.addOutput(RuntimeConstantKeywords.COMPARE_OPERATOR + " " + "<");
		help.addOutput(RuntimeConstantKeywords.CONDITIONNOTTRUE + " " + RuntimeConstantKeywords.JUMP + " " + RuntimeConstantKeywords.FOR_STOP);
		visit(ctx.in_loop());
		help.addOutput(RuntimeConstantKeywords.GET + " " + ctx.STUFF().getText());
		help.addOutput(RuntimeConstantKeywords.INSTRUCTION_STORE + " " + ctx.NUMBER(0));
		help.addOutput(RuntimeConstantKeywords.OPERATOR + " " + "ADD");
		help.addOutput(RuntimeConstantKeywords.INSTRUCTION_PUSH + " " + ctx.STUFF().getText());
		help.addOutput(RuntimeConstantKeywords.JUMP + " " + RuntimeConstantKeywords.FOR_CONDITION_START);
		help.addOutput(RuntimeConstantKeywords.FOR_STOP);		
		return null;
		}
	
	@Override public Object visitLoop_while(SparkyParser.Loop_whileContext ctx) {
		help.addOutput(RuntimeConstantKeywords.WHILE_BEGIN);
		if(ctx.yesnostatement().getText().contains("yup") || ctx.yesnostatement().getText().contains("nup")) {
			help.addOutput(RuntimeConstantKeywords.CHECK_CONDITION + " " + ctx.yesnostatement().getText());
		}
		else {
			visit(ctx.yesnostatement());
		}
		
		help.addOutput(RuntimeConstantKeywords.CONDITION_NOT_TRUE + " " + RuntimeConstantKeywords.JUMP +
				" " + RuntimeConstantKeywords.WHILE_END);
		visit(ctx.in_loop());
		
		
		return visitChildren(ctx); }
	
	@Override public Object visitIn_loop(SparkyParser.In_loopContext ctx) {
		visit(ctx.ball());
		return null; }
		//return visitChildren(ctx); }
	
	@Override public Object visitFor_expr(SparkyParser.For_exprContext ctx) {
		//help.addOutput(RuntimeConstantKeywords.FOR_UPDATE_START);
		//help.addOutput(RuntimeConstantKeywords.FOR_VARIABLE + " " + ctx.STUFF().getText());
		
		help.addOutput(RuntimeConstantKeywords.GET + " " + ctx.expr().getChild(0).getText());	
		help.addOutput(RuntimeConstantKeywords.INSTRUCTION_STORE + " " + ctx.expr().getChild(2).getText());
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
		help.addOutput(RuntimeConstantKeywords.JUMP + " " + RuntimeConstantKeywords.FOR_CONDITION_START);
		

		return null; }
		//return visitChildren(ctx); }
	
	@Override public Object visitFor_expression(SparkyParser.For_expressionContext ctx) { 
		visit(ctx.expr(0));
		visit(ctx.expr(1));
		help.addOutput(RuntimeConstantKeywords.FOR_CONDITION_START);
		help.addOutput(RuntimeConstantKeywords.GET + " " + ctx.expr(0).getText());
		help.addOutput(RuntimeConstantKeywords.INSTRUCTION_STORE + " " + ctx.expr(1).getText());
		help.addOutput(RuntimeConstantKeywords.COMPARE_OPERATOR + " " + ctx.YESNOOPERATOR().getText());
		help.addOutput(RuntimeConstantKeywords.CONDITIONNOTTRUE + " " + RuntimeConstantKeywords.JUMP + " " + RuntimeConstantKeywords.FOR_STOP);
		
		return null; }
		//return visitChildren(ctx); }
	
	@Override public Object visitFor_declare(SparkyParser.For_declareContext ctx) { 
		help.addOutput(RuntimeConstantKeywords.DECLARE + " " + ctx.datatype().getChild(0).getText() +" " + ctx.STUFF().getText());
		help.addOutput(RuntimeConstantKeywords.INSTRUCTION_STORE + " " + ctx.NUMBER().getText());
		help.addOutput(RuntimeConstantKeywords.INSTRUCTION_PUSH + " " + ctx.STUFF().getText());
		
		return null; }
		//return visitChildren(ctx); }
	
	@Override public Object visitTerm(SparkyParser.TermContext ctx) { return visitChildren(ctx); }
	
	@Override public Object visitExpr(SparkyParser.ExprContext ctx) { return visitChildren(ctx); }
	
	@Override public Object visitYesnostatement(SparkyParser.YesnostatementContext ctx) { 
		if(ctx.expr(0) != null) {
		visit(ctx.expr(0));
		visit(ctx.expr(1));
		help.addOutput(RuntimeConstantKeywords.GET + " " + ctx.expr(0).getText());
		help.addOutput(RuntimeConstantKeywords.INSTRUCTION_STORE + " " + ctx.expr(1).getText());
		help.addOutput(RuntimeConstantKeywords.COMPARE_OPERATOR + " " + ctx.YESNOOPERATOR().getText());
		}else {
			visit(ctx.yesnostatement(0));
			visit(ctx.yesnostatement(1));
			help.addOutput(RuntimeConstantKeywords.AND_OR_OPERATOR + " " + ctx.ANDOROPERATOR().getText());
		}
		
		return null;}
		//return visitChildren(ctx); }
	
	@Override public Object visitTernary_operator(SparkyParser.Ternary_operatorContext ctx) { 
		help.addOutput(RuntimeConstantKeywords.IFTE_START);
		if(ctx.yesnostatement().getText().contains("yup") || ctx.yesnostatement().getText().contains("nup")) {
			help.addOutput(RuntimeConstantKeywords.CHECK_CONDITION + " " + ctx.yesnostatement().getText());
		}
		else {
			visit(ctx.yesnostatement());
		}
		
		help.addOutput(RuntimeConstantKeywords.CONDITION_FALSE + " " + RuntimeConstantKeywords.JUMP +
				" " + RuntimeConstantKeywords.ELSE_START);

		help.addOutput(RuntimeConstantKeywords.IF_START);
		//help.addOutput("Testing AND OR" + " " ctx.inlo);
		visit(ctx.in_loop(0));
		help.addOutput(RuntimeConstantKeywords.IF_END);
		if(ctx.in_loop(1) != null) {
		help.addOutput(RuntimeConstantKeywords.ELSE_START);
		visit(ctx.in_loop(1));
		help.addOutput(RuntimeConstantKeywords.ELSE_END);
		}
		help.addOutput(RuntimeConstantKeywords.IFTE_END);
		
			
		return null; }
	
	
	@Override public Object visitPrint(SparkyParser.PrintContext ctx) { 
		
		help.addOutput(RuntimeConstantKeywords.PRINT + " " + ctx.expr().getText());
		return null; }
		//return visitChildren(ctx); }
	
	@Override public Object visitWarna(SparkyParser.WarnaContext ctx) { return visitChildren(ctx); }
	
	@Override public Object visitHaina(SparkyParser.HainaContext ctx) { return visitChildren(ctx); }
	
	@Override public Object visitDatatype(SparkyParser.DatatypeContext ctx) { return visitChildren(ctx); }
	
	@Override public Object visitYup(SparkyParser.YupContext ctx) { return visitChildren(ctx); }
	
	@Override public Object visitNope(SparkyParser.NopeContext ctx) { return visitChildren(ctx); }
	
		

}