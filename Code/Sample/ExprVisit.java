import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;

public class ExprVisit extends ExprBaseVisitor<Integer> {

	@Override public Integer visitProg(ExprParser.ProgContext ctx) {
		super.visitProg(ctx);
		return 1;
		
	}

	@Override public Integer visitPrintExpr(ExprParser.PrintExprContext ctx) { 
		super.visitPrintExpr (ctx);
		Integer value = visit(ctx.expr()); // evaluate the expr child
		System.out.println(value); // print the result
		return 0;
		
	}
	
	@Override public Integer visitAssign(ExprParser.AssignContext ctx) { 
		super.visitAssign(ctx); 
		String id = ctx.ID().getText();
		int value = visit(ctx.expr());
		return value;
	}
	@Override public Integer visitBlank(ExprParser.BlankContext ctx) { return visitChildren(ctx); }
	
	@Override public Integer visitParens(ExprParser.ParensContext ctx) { 
		super.visitParens(ctx); 
		return visit(ctx.expr());
		
	}
	
	@Override public Integer visitMulDiv(ExprParser.MulDivContext ctx) { 
		super.visitMulDiv(ctx);
		int left = visit(ctx.expr(0)); // get value of left subexpression
		int right = visit(ctx.expr(1)); // get value of right subexpression
		if ( ctx.op.getType() == ExprParser.MUL ) return left * right;
		return left / right; // must be DIV
	}

	@Override public Integer visitAddSub(ExprParser.AddSubContext ctx) { 
		super.visitAddSub(ctx);
		int left = visit(ctx.expr(0)); // get value of left subexpression
		int right = visit(ctx.expr(1)); // get value of right subexpression
		if ( ctx.op.getType() == ExprParser.ADD ) return left + right;
		return left - right; // must be SUB
	}

	@Override public Integer visitId(ExprParser.IdContext ctx) { 
		super.visitId(ctx);
		String id = ctx.ID().getText();
		return 0;
	}
	
	
	@Override public Integer visitInt(ExprParser.IntContext ctx) { 
		super.visitInt(ctx);
		return Integer.valueOf(ctx.INT().getText());
	}
}
