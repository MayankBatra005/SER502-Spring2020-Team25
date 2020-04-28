package sparkyCompiler;

import Model.IntermediateCodeWriter;

/**
 * In this class methods from SparkyBaseVisitor are overloaded for intermediate 
 * course generation according to Sparky grammar.
 * @author Sayali Tanawade 
 * @author Mayank Batra
 * @since April-20-2020
 * @version 2.0
 */

import sparky.SparkyBaseVisitor;
import sparky.SparkyParser;
import sparkyRuntime.RuntimeConstantKeywords;

public class IntermediateCodeGenerator extends SparkyBaseVisitor<Object> {
	String regexStr = "^[0-9]*$";

	public String getOutput() {
		return IntermediateCodeWriter.getInstance().getIcOutput();
	}

	@Override
	public Object visitProgram(SparkyParser.ProgramContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public Object visitBall(SparkyParser.BallContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public Object visitDeclare(SparkyParser.DeclareContext ctx) {
		IntermediateCodeWriter.getInstance().addOutput(
				RuntimeConstantKeywords.DECLARE + " " + ctx.getChild(0).getText() + " " + ctx.STUFF().getText());

		if (ctx.NUMBER() != null) {
			IntermediateCodeWriter.getInstance()
					.addOutput(RuntimeConstantKeywords.INSTRUCTION_STORE + " " + ctx.NUMBER().getText());
			IntermediateCodeWriter.getInstance()
					.addOutput(RuntimeConstantKeywords.INSTRUCTION_PUSH + " " + ctx.STUFF().getText());
		} else if (ctx.getChild(0).getText().contains("string")) {
			visit(ctx.stringdatatype());
			IntermediateCodeWriter.getInstance()
					.addOutput(RuntimeConstantKeywords.INSTRUCTION_STORE + " " + ctx.STRINGLITERAL().getText());
			IntermediateCodeWriter.getInstance()
			.addOutput(RuntimeConstantKeywords.INSTRUCTION_PUSH + " " + ctx.STUFF().getText());
		}

		return null;
	}

	@Override
	public Object visitStringdatatype(SparkyParser.StringdatatypeContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public Object visitExpression(SparkyParser.ExpressionContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public Object visitAssignment(SparkyParser.AssignmentContext ctx) {
		// IntermediateCodeWriter.getInstance().addOutput("Testing assgmnt*******" + " "
		// + ctx.expr().getChildCount());
		if (ctx.expr().getChildCount() == 1) {
			if (ctx.expr().getChild(0).getText().matches(regexStr)) {
				IntermediateCodeWriter.getInstance()
						.addOutput(RuntimeConstantKeywords.INSTRUCTION_STORE + " " + ctx.expr().getChild(0).getText());
			} else {
				IntermediateCodeWriter.getInstance()
						.addOutput(RuntimeConstantKeywords.GET + " " + ctx.expr().getChild(0).getText());
			}
			IntermediateCodeWriter.getInstance().addOutput(RuntimeConstantKeywords.PUSH + " " + ctx.STUFF().getText());
		} else {
			IntermediateCodeWriter.getInstance()
					.addOutput(RuntimeConstantKeywords.GET + " " + ctx.expr().getChild(0).getText());
			if (ctx.expr().getChild(2).getText().matches(regexStr)) {
				IntermediateCodeWriter.getInstance()
						.addOutput(RuntimeConstantKeywords.INSTRUCTION_STORE + " " + ctx.expr().getChild(2).getText());
				switch (ctx.expr().getChild(1).getText()) {
				case "+":
					IntermediateCodeWriter.getInstance()
							.addOutput(RuntimeConstantKeywords.OPERATOR + " " + RuntimeConstantKeywords.ADDITION);
					break;
				case "-":
					IntermediateCodeWriter.getInstance()
							.addOutput(RuntimeConstantKeywords.OPERATOR + " " + RuntimeConstantKeywords.SUBTRACTION);
					break;
				case "*":
					IntermediateCodeWriter.getInstance()
							.addOutput(RuntimeConstantKeywords.OPERATOR + " " + RuntimeConstantKeywords.MULTIPLICATION);
					break;
				case "/":
					IntermediateCodeWriter.getInstance()
							.addOutput(RuntimeConstantKeywords.OPERATOR + " " + RuntimeConstantKeywords.DIVSION);
					break;
				}
				IntermediateCodeWriter.getInstance()
						.addOutput(RuntimeConstantKeywords.PUSH + " " + ctx.STUFF().getText());
			} else {
				IntermediateCodeWriter.getInstance()
						.addOutput(RuntimeConstantKeywords.GET + " " + ctx.expr().getChild(2).getText());
				switch (ctx.expr().getChild(1).getText()) {
				case "+":
					IntermediateCodeWriter.getInstance()
							.addOutput(RuntimeConstantKeywords.OPERATOR + " " + RuntimeConstantKeywords.ADDITION);
					break;
				case "-":
					IntermediateCodeWriter.getInstance()
							.addOutput(RuntimeConstantKeywords.OPERATOR + " " + RuntimeConstantKeywords.SUBTRACTION);
					break;
				case "*":
					IntermediateCodeWriter.getInstance()
							.addOutput(RuntimeConstantKeywords.OPERATOR + " " + RuntimeConstantKeywords.MULTIPLICATION);
					break;
				case "/":
					IntermediateCodeWriter.getInstance()
							.addOutput(RuntimeConstantKeywords.OPERATOR + " " + RuntimeConstantKeywords.DIVSION);
					break;
				}
				IntermediateCodeWriter.getInstance()
						.addOutput(RuntimeConstantKeywords.PUSH + " " + ctx.STUFF().getText());
			}
		}

		return null;
	}

	@Override
	public Object visitIfte(SparkyParser.IfteContext ctx) {
		IntermediateCodeWriter.getInstance().addOutput(RuntimeConstantKeywords.IFTE_START);
		if (ctx.yesnostatement().getText().contains("yup") || ctx.yesnostatement().getText().contains("nup")) {
			IntermediateCodeWriter.getInstance()
					.addOutput(RuntimeConstantKeywords.CHECK_CONDITION + " " + ctx.yesnostatement().getText());
		} else {
			visit(ctx.yesnostatement());
		}

		IntermediateCodeWriter.getInstance().addOutput(RuntimeConstantKeywords.CONDITION_FALSE + " "
				+ RuntimeConstantKeywords.JUMP + " " + RuntimeConstantKeywords.ELSE_START);

		IntermediateCodeWriter.getInstance().addOutput(RuntimeConstantKeywords.IF_START);
		// IntermediateCodeWriter.getInstance().addOutput("Testing AND OR" + " "
		// ctx.inlo);
		visit(ctx.in_loop(0));
		IntermediateCodeWriter.getInstance().addOutput(RuntimeConstantKeywords.IF_END);
		if (ctx.in_loop(1) != null) {
			IntermediateCodeWriter.getInstance().addOutput(RuntimeConstantKeywords.ELSE_START);
			visit(ctx.in_loop(1));
			IntermediateCodeWriter.getInstance().addOutput(RuntimeConstantKeywords.ELSE_END);
		}
		IntermediateCodeWriter.getInstance().addOutput(RuntimeConstantKeywords.IFTE_END);

		return null;
	}

	@Override
	public Object visitLoopum(SparkyParser.LoopumContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public Object visitLoop_for(SparkyParser.Loop_forContext ctx) {
		IntermediateCodeWriter.getInstance().addOutput(RuntimeConstantKeywords.FOR_START);
		visit(ctx.for_declare());
		visit(ctx.for_expression());
		visit(ctx.in_loop());
		visit(ctx.for_expr());
		IntermediateCodeWriter.getInstance().addOutput(RuntimeConstantKeywords.FOR_STOP);

		return null;
	}

	@Override
	public Object visitLoop_for_range(SparkyParser.Loop_for_rangeContext ctx) {
		IntermediateCodeWriter.getInstance().addOutput(RuntimeConstantKeywords.FOR_START);
		IntermediateCodeWriter.getInstance()
				.addOutput(RuntimeConstantKeywords.DECLARE + " int " + ctx.STUFF().getText());
		IntermediateCodeWriter.getInstance().addOutput(RuntimeConstantKeywords.INSTRUCTION_STORE + " " + ctx.NUMBER(0));
		IntermediateCodeWriter.getInstance()
				.addOutput(RuntimeConstantKeywords.INSTRUCTION_PUSH + " " + ctx.STUFF().getText());
		IntermediateCodeWriter.getInstance().addOutput(RuntimeConstantKeywords.FOR_CONDITION_START);
		IntermediateCodeWriter.getInstance().addOutput(RuntimeConstantKeywords.GET + " " + ctx.STUFF().getText());
		if(ctx.NUMBER(1).getText().matches(regexStr)) {
			IntermediateCodeWriter.getInstance().addOutput(RuntimeConstantKeywords.INSTRUCTION_STORE + " " + ctx.NUMBER(1));
			} else {
				IntermediateCodeWriter.getInstance()
				.addOutput(RuntimeConstantKeywords.GET + " " + ctx.NUMBER(1));
			}
		
		IntermediateCodeWriter.getInstance().addOutput(RuntimeConstantKeywords.COMPARE_OPERATOR + " " + "<");
		IntermediateCodeWriter.getInstance().addOutput(RuntimeConstantKeywords.CONDITION_FALSE + " "
				+ RuntimeConstantKeywords.JUMP + " " + RuntimeConstantKeywords.FOR_STOP);
		visit(ctx.in_loop());
		IntermediateCodeWriter.getInstance().addOutput(RuntimeConstantKeywords.GET + " " + ctx.STUFF().getText());
		IntermediateCodeWriter.getInstance().addOutput(RuntimeConstantKeywords.INSTRUCTION_STORE + " " + ctx.NUMBER(0));
		IntermediateCodeWriter.getInstance().addOutput(RuntimeConstantKeywords.OPERATOR + " " + "ADD");
		IntermediateCodeWriter.getInstance()
				.addOutput(RuntimeConstantKeywords.INSTRUCTION_PUSH + " " + ctx.STUFF().getText());
		IntermediateCodeWriter.getInstance()
				.addOutput(RuntimeConstantKeywords.JUMP + " " + RuntimeConstantKeywords.FOR_CONDITION_START);
		IntermediateCodeWriter.getInstance().addOutput(RuntimeConstantKeywords.FOR_STOP);
		return null;
	}

	@Override
	public Object visitLoop_while(SparkyParser.Loop_whileContext ctx) {
		IntermediateCodeWriter.getInstance().addOutput(RuntimeConstantKeywords.WHILE_BEGIN);
		if (ctx.yesnostatement().getText().contains("yup") || ctx.yesnostatement().getText().contains("nup")) {
			IntermediateCodeWriter.getInstance()
					.addOutput(RuntimeConstantKeywords.CHECK_CONDITION + " " + ctx.yesnostatement().getText());
		} else {
			visit(ctx.yesnostatement());
		}

		IntermediateCodeWriter.getInstance().addOutput(RuntimeConstantKeywords.CONDITION_FALSE + " "
				+ RuntimeConstantKeywords.JUMP + " " + RuntimeConstantKeywords.WHILE_END);
		visit(ctx.in_loop());
		IntermediateCodeWriter.getInstance()
				.addOutput(RuntimeConstantKeywords.JUMP + " " + RuntimeConstantKeywords.WHILE_BEGIN);
		IntermediateCodeWriter.getInstance().addOutput(RuntimeConstantKeywords.WHILE_END);

		return null;
	}

	@Override
	public Object visitIn_loop(SparkyParser.In_loopContext ctx) {
		visit(ctx.ball());
		return null;
	}
	// return visitChildren(ctx); }

	@Override
	public Object visitFor_expr(SparkyParser.For_exprContext ctx) {
		// IntermediateCodeWriter.getInstance().addOutput(RuntimeConstantKeywords.FOR_UPDATE_START);
		// IntermediateCodeWriter.getInstance().addOutput(RuntimeConstantKeywords.FOR_VARIABLE
		// + " " + ctx.STUFF().getText());

		IntermediateCodeWriter.getInstance()
				.addOutput(RuntimeConstantKeywords.GET + " " + ctx.expr().getChild(0).getText());
		IntermediateCodeWriter.getInstance()
				.addOutput(RuntimeConstantKeywords.INSTRUCTION_STORE + " " + ctx.expr().getChild(2).getText());
		switch (ctx.expr().getChild(1).getText()) {
		case "+":
			IntermediateCodeWriter.getInstance()
					.addOutput(RuntimeConstantKeywords.OPERATOR + " " + RuntimeConstantKeywords.ADDITION);
			break;
		case "-":
			IntermediateCodeWriter.getInstance()
					.addOutput(RuntimeConstantKeywords.OPERATOR + " " + RuntimeConstantKeywords.SUBTRACTION);
			break;
		case "*":
			IntermediateCodeWriter.getInstance()
					.addOutput(RuntimeConstantKeywords.OPERATOR + " " + RuntimeConstantKeywords.MULTIPLICATION);
			break;
		case "/":
			IntermediateCodeWriter.getInstance()
					.addOutput(RuntimeConstantKeywords.OPERATOR + " " + RuntimeConstantKeywords.DIVSION);
			break;
		}
		IntermediateCodeWriter.getInstance().addOutput(RuntimeConstantKeywords.PUSH + " " + ctx.STUFF().getText());
		IntermediateCodeWriter.getInstance()
				.addOutput(RuntimeConstantKeywords.JUMP + " " + RuntimeConstantKeywords.FOR_CONDITION_START);

		return null;
	}
	// return visitChildren(ctx); }

	@Override
	public Object visitFor_expression(SparkyParser.For_expressionContext ctx) {
		visit(ctx.expr(0));
		visit(ctx.expr(1));
		IntermediateCodeWriter.getInstance().addOutput(RuntimeConstantKeywords.FOR_CONDITION_START);
		IntermediateCodeWriter.getInstance().addOutput(RuntimeConstantKeywords.GET + " " + ctx.expr(0).getText());
		if(ctx.expr(1).getText().matches(regexStr)) {
			IntermediateCodeWriter.getInstance()
					.addOutput(RuntimeConstantKeywords.INSTRUCTION_STORE + " " + ctx.expr(1).getText());
			} else {
				IntermediateCodeWriter.getInstance()
				.addOutput(RuntimeConstantKeywords.GET + " " + ctx.expr(1).getText());
			}
		
		IntermediateCodeWriter.getInstance()
				.addOutput(RuntimeConstantKeywords.COMPARE_OPERATOR + " " + ctx.YESNOOPERATOR().getText());
		IntermediateCodeWriter.getInstance().addOutput(RuntimeConstantKeywords.CONDITION_FALSE + " "
				+ RuntimeConstantKeywords.JUMP + " " + RuntimeConstantKeywords.FOR_STOP);

		return null;
	}
	// return visitChildren(ctx); }

	@Override
	public Object visitFor_declare(SparkyParser.For_declareContext ctx) {
		IntermediateCodeWriter.getInstance().addOutput(RuntimeConstantKeywords.DECLARE + " "
				+ ctx.datatype().getChild(0).getText() + " " + ctx.STUFF().getText());
		IntermediateCodeWriter.getInstance()
				.addOutput(RuntimeConstantKeywords.INSTRUCTION_STORE + " " + ctx.NUMBER().getText());
		IntermediateCodeWriter.getInstance()
				.addOutput(RuntimeConstantKeywords.INSTRUCTION_PUSH + " " + ctx.STUFF().getText());

		return null;
	}
	// return visitChildren(ctx); }

	@Override
	public Object visitTerm(SparkyParser.TermContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public Object visitExpr(SparkyParser.ExprContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public Object visitYesnostatement(SparkyParser.YesnostatementContext ctx) {
		if (ctx.expr(0) != null) {
			visit(ctx.expr(0));
			visit(ctx.expr(1));
			IntermediateCodeWriter.getInstance().addOutput(RuntimeConstantKeywords.GET + " " + ctx.expr(0).getText());
			if(ctx.expr(1).getText().matches(regexStr)) {
			IntermediateCodeWriter.getInstance()
					.addOutput(RuntimeConstantKeywords.INSTRUCTION_STORE + " " + ctx.expr(1).getText());
			} else {
				IntermediateCodeWriter.getInstance()
				.addOutput(RuntimeConstantKeywords.GET + " " + ctx.expr(1).getText());
			}
			IntermediateCodeWriter.getInstance()
					.addOutput(RuntimeConstantKeywords.COMPARE_OPERATOR + " " + ctx.YESNOOPERATOR().getText());
		} else {
			visit(ctx.yesnostatement(0));
			visit(ctx.yesnostatement(1));
			IntermediateCodeWriter.getInstance()
					.addOutput(RuntimeConstantKeywords.AND_OR_OPERATOR + " " + ctx.ANDOROPERATOR().getText());
		}

		return null;
	}
	// return visitChildren(ctx); }

	@Override
	public Object visitTernary_operator(SparkyParser.Ternary_operatorContext ctx) {
		IntermediateCodeWriter.getInstance().addOutput(RuntimeConstantKeywords.IFTE_START);
		if (ctx.yesnostatement().getText().contains("yup") || ctx.yesnostatement().getText().contains("nup")) {
			IntermediateCodeWriter.getInstance()
					.addOutput(RuntimeConstantKeywords.CHECK_CONDITION + " " + ctx.yesnostatement().getText());
		} else {
			visit(ctx.yesnostatement());
		}

		IntermediateCodeWriter.getInstance().addOutput(RuntimeConstantKeywords.CONDITION_FALSE + " "
				+ RuntimeConstantKeywords.JUMP + " " + RuntimeConstantKeywords.ELSE_START);

		IntermediateCodeWriter.getInstance().addOutput(RuntimeConstantKeywords.IF_START);
		// IntermediateCodeWriter.getInstance().addOutput("Testing AND OR" + " "
		// ctx.inlo);
		visit(ctx.in_loop(0));
		IntermediateCodeWriter.getInstance().addOutput(RuntimeConstantKeywords.IF_END);
		if (ctx.in_loop(1) != null) {
			IntermediateCodeWriter.getInstance().addOutput(RuntimeConstantKeywords.ELSE_START);
			visit(ctx.in_loop(1));
			IntermediateCodeWriter.getInstance().addOutput(RuntimeConstantKeywords.ELSE_END);
		}
		IntermediateCodeWriter.getInstance().addOutput(RuntimeConstantKeywords.IFTE_END);

		return null;
	}

	@Override
	public Object visitPrint(SparkyParser.PrintContext ctx) {
		// get a print
		IntermediateCodeWriter.getInstance().addOutput(RuntimeConstantKeywords.GET + " " + ctx.expr().getText());
		IntermediateCodeWriter.getInstance().addOutput(RuntimeConstantKeywords.PRINT);

		return null;
	}
	// return visitChildren(ctx); }

	@Override
	public Object visitWarna(SparkyParser.WarnaContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public Object visitHaina(SparkyParser.HainaContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public Object visitDatatype(SparkyParser.DatatypeContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public Object visitYup(SparkyParser.YupContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public Object visitNope(SparkyParser.NopeContext ctx) {
		return visitChildren(ctx);
	}

}