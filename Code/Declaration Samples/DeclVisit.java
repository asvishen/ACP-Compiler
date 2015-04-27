// Generated from declaration.g4 by ANTLR 4.2
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;

/**
 * This class provides an empty implementation of {@link declarationVisitor},
 * which can be extended to create a visitor which only needs to handle a subset
 * of the available methods.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public class DeclVisit extends DeclarationBaseVisitor <Object> {

	@Override public Integer visitGotosumexp(@NotNull DeclarationParser.GotosumexpContext ctx) { 
		super.visitGotosumexp(ctx); 
		return visit(ctx.sumexpr());
		}
	@Override public Integer visitAdd(@NotNull DeclarationParser.AddContext ctx) { 
		super.visitAdd(ctx);
		int left = visit(ctx.sumexpr()); // get value of left subexpression
		int right = visit(ctx.term());
		return left + right;
		}
	@Override public Integer visitDiv(@NotNull DeclarationParser.DivContext ctx) { 
		super.visitDiv(ctx);
		int left = visit(ctx.term()); // get value of left subexpression
		int right = visit(ctx.factor());
		return left / right; 
		}
	@Override public Integer visitSub(@NotNull DeclarationParser.SubContext ctx) { 
		super.visitSub(ctx);
		int left = visit(ctx.sumexpr()); // get value of left subexpression
		int right = visit(ctx.term());
		return left - right; 
	}
	@Override public Integer visitNumber(@NotNull DeclarationParser.NumberContext ctx) { 
		super.visitNumber(ctx);
		return Integer.valueOf(ctx.NumberValue().getText());
	}
	 */
	@Override public Integer visitDeclare(@NotNull DeclarationParser.DeclareContext ctx) { 
	
		super.visitDeclare (ctx);
		String id = ctx.ID().getText();
		String datatype = ctx.Datatype().getText();
		return 0;
		
	}
	@Override public String visitBool(@NotNull DeclarationParser.BoolContext ctx) { 

		super.visitBool(ctx);
		return(ctx.BooleanValue().getText());
		
	}
	@Override public Integer visitMul(@NotNull DeclarationParser.MulContext ctx) { 
		super.visitMul(ctx);
		int left = visit(ctx.term()); // get value of left subexpression
		int right = visit(ctx.factor());
		return left * right; 
		}
	@Override public Integer visitGotofactor(@NotNull DeclarationParser.GotofactorContext ctx) { 
		super.visitGotofactor(ctx); 
		return visit(ctx.factor()); 
		}

	@Override public Integer visitId(@NotNull DeclarationParser.IdContext ctx) { 
			super.visitId(ctx);
			String id = ctx.ID().getText();
			return 0;
		
		}

	@Override public Integer visitGototerm(@NotNull DeclarationParser.GototermContext ctx) { 
		 super.visitGototerm(ctx); 
		return visit(ctx.term()); 
		
		}

	@Override public Integer visitAssign(@NotNull DeclarationParser.AssignContext ctx) { 
		super.visitAssign(ctx); 
		String id = ctx.ID().getText();
		int value = visit(ctx.expression());
		return value;
		
	}
}