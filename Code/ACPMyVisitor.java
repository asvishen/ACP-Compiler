import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

import org.antlr.v4.codegen.model.decl.Decl;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;
import org.stringtemplate.v4.ST;
import org.stringtemplate.v4.STGroup;
import org.stringtemplate.v4.STGroupDir;

public class ACPMyVisitor extends ACPBaseVisitor<T>{
		@Override public T visitSub(@NotNull ACPParser.SubContext ctx) { 
		super.visitSub(ctx);
		T left = visit(ctx.sumexpr()); // get value of left subexpression
		T right = visit(ctx.term());
				STGroup group = new STGroupDir("/Users/avijitvishen/Desktop/Integrate/src/tmp");
		ST st = group.getInstanceOf("arithmetic");
		st.add("op", "-");
		st.add("left", left.toString());
		st.add("right", right.toString());
		String result = st.render(); // yields "int x = 0;"
		System.out.println("this is sub"+result);
		return new T(result); 
		}

	@Override public T visitJustAnotherBlock(@NotNull ACPParser.JustAnotherBlockContext ctx) { 
		//T block = this.visit(ctx.block());
		List<T> blockList = new ArrayList<T>();
		
		for(int i=0; i< ctx.block().size();i++){
			
		
		blockList.add(visit(ctx.block(i)));
		
		}
		STGroup group = new STGroupDir("/Users/avijitvishen/Desktop/Integrate/src/tmp");
		ST st = group.getInstanceOf("blockenclosed");
		
		st.add("block", blockList);

		String result = st.render(); // yields "int x = 0;"
		System.out.println("block result"+result);
		
		
		return new T(result+"\n");
		
		 
	}

	@Override public T visitIfwithout(@NotNull ACPParser.IfwithoutContext ctx) { 
		T compexpr= this.visit(ctx.compexpr());
		T elseP = this.visit(ctx.elsepart());
		STGroup group = new STGroupDir("/Users/avijitvishen/Desktop/Integrate/src/tmp");
		ST st = group.getInstanceOf("ifstmt");
		
		
		 // yields "int x = 0;"
		
		
		List<T> blockList = new ArrayList<T>();
		for(int i=0; i< ctx.block().size();i++){
		blockList.add(visit(ctx.block(i)));
		}
		st.add("truestmt", blockList);
		st.add("elsestmt", elseP);
		st.add("cond", compexpr);
		String result = st.render();
		
		return new T(result);
	
	}

	@Override public T visitMul(@NotNull ACPParser.MulContext ctx) { 
		super.visitMul(ctx);
		T left = visit(ctx.term()); // get value of left subexpression
		T right = visit(ctx.factor());
		STGroup group = new STGroupDir("/Users/avijitvishen/Desktop/Integrate/src/tmp");
		ST st = group.getInstanceOf("arithmetic");
		st.add("op", "*");
		st.add("left", left.toString());
		st.add("right", right.toString());
		String result = st.render(); // yields "int x = 0;"
		System.out.println("this is mul"+result);
		return new T(result);
	}

	@Override public T visitPrintstmt(@NotNull ACPParser.PrintstmtContext ctx) { return visitChildren(ctx); }

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitDiv(@NotNull ACPParser.DivContext ctx) { 
		super.visitDiv(ctx);
		T left = visit(ctx.term()); // get value of left subexpression
		T right = visit(ctx.factor());
		STGroup group = new STGroupDir("/Users/avijitvishen/Desktop/Integrate/src/tmp");
		ST st = group.getInstanceOf("arithmetic");
		st.add("op", "/");
		st.add("left", left.toString());
		st.add("right", right.toString());
		String result = st.render(); // yields "int x = 0;"
		System.out.println(result);
		return new T(result);	
		}

	@Override public T visitStackoperation(@NotNull ACPParser.StackoperationContext ctx) { return visitChildren(ctx); }

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitNumber(@NotNull ACPParser.NumberContext ctx) { 
	
	super.visitNumber(ctx);
	return new T(ctx.NumberValue().getText()); 
	}

	@Override public T visitElsepart(@NotNull ACPParser.ElsepartContext ctx) { return visitChildren(ctx); }

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitAnd(@NotNull ACPParser.AndContext ctx) {
		super.visitAnd(ctx);
		T left = visit(ctx.andcomp()); // get value of left subexpression
		T right = visit(ctx.relexpr());
		STGroup group = new STGroupDir("/Users/avijitvishen/Desktop/Integrate/src/tmp");
		ST st = group.getInstanceOf("arithmetic");
		st.add("op", "AND");
		st.add("left", left.toString());
		st.add("right", right.toString());
		String result = st.render(); // yields "int x = 0;"
		System.out.println("this is AND"+result);
		return new T(result);} }

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitBlock(@NotNull ACPParser.BlockContext ctx) { return visitChildren(ctx); }

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitGotofactor(@NotNull ACPParser.GotofactorContext ctx) { return visitChildren(ctx); }

	@Override public T visitId(@NotNull ACPParser.IdContext ctx) { 
		super.visitId(ctx);
		String id = ctx.ID().getText();
		return new T(id);
		}

	@Override public T visitCallfunc(@NotNull ACPParser.CallfuncContext ctx) { return visitChildren(ctx); }

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitFuncwithparam(@NotNull ACPParser.FuncwithparamContext ctx) { 
		super.visitFuncwithparam(ctx); 
		String id = ctx.ID().getText();
		
		T param = this.visit(ctx.params());
		List<T> blockList = new ArrayList<T>();
		
		for(int i=0; i< ctx.block().size();i++){
			
		
		blockList.add(visit(ctx.block(i)));
		
		}
		//T block = this.visit(ctx.block());
		STGroup group = new STGroupDir("/Users/avijitvishen/Desktop/Integrate/src/tmp");
		ST st = group.getInstanceOf("funcwithparams");
		st.add("name", "\""+id+"\"");
		st.add("block", blockList);
		st.add("param", param);
		String result = st.render(); // yields "int x = 0;"
		System.out.println("funcparam result "+result);
		
		
		return new T( result);
	}

	@Override public T visitAdd(@NotNull ACPParser.AddContext ctx) { 
		super.visitAdd(ctx);
		System.out.println("enterting aaddddd");
		T left = this.visit(ctx.sumexpr()); // get value of left subexpression
		T right = this.visit(ctx.term());
		STGroup group = new STGroupDir("/Users/avijitvishen/Desktop/Integrate/src/tmp");
		ST st = group.getInstanceOf("arithmetic");
		st.add("left", left.toString());
		st.add("right", right.toString());
		st.add("op", "+");
		String result = st.render(); // yields "int x = 0;"
		return new T(result);
	}

	@Override public T visitComp(@NotNull ACPParser.CompContext ctx) { return visitChildren(ctx); }

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitOr(@NotNull ACPParser.OrContext ctx) {
		super.visitOr(ctx);
		T left = visit(ctx.compexpr()); // get value of left subexpression
		T right = visit(ctx.andcomp());
		STGroup group = new STGroupDir("/Users/avijitvishen/Desktop/Integrate/src/tmp");
		ST st = group.getInstanceOf("arithmetic");
		st.add("op", "OR");
		st.add("left", left.toString());
		st.add("right", right.toString());
		String result = st.render(); // yields "int x = 0;"
		System.out.println("this is OR"+result);
		return new T(result);}

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitAndwithout(@NotNull ACPParser.AndwithoutContext ctx) { return visitChildren(ctx); }

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitStart(@NotNull ACPParser.StartContext ctx) { 
		List<T> blockList = new ArrayList<T>();
		
		for(int i=0; i< ctx.func().size();i++){
			
		
		blockList.add(visit(ctx.func(i)));
		
		}
		PrintWriter writer;
		try {
			writer = new PrintWriter("/Users/avijitvishen/Desktop/Integrate/src/tmp/funcfile.mvm", "UTF-8");
			writer.println("[");
			for(T line: blockList)
			{
				writer.println(line.asString());
			}
			writer.println("]");

		
			writer.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		System.out.println("entering start");
		return new T("["+blockList+"]");
		
	}

	@Override public T visitParams(@NotNull ACPParser.ParamsContext ctx) { 
		String id = ctx.ID().getText();
		
		
		
		
		return new T("\""+id + "\""  + " def \n");
	}

	@Override public T visitFuncwithoutparam(@NotNull ACPParser.FuncwithoutparamContext ctx) { 
		String id = ctx.ID().getText();
		
		
		//T block = this.visit(ctx.block());
		
		List<T> blockList = new ArrayList<T>();
		
		for(int i=0; i< ctx.block().size();i++){
			
	
		blockList.add(visit(ctx.block(i)));
		
		}
		STGroup group = new STGroupDir("/Users/avijitvishen/Desktop/Integrate/src/tmp");
		ST st = group.getInstanceOf("funcwoparams");
		st.add("name", id);
		st.add("block", blockList);

		String result = st.render(); // yields "int x = 0;"
		System.out.println("funcwoparam result"+result);
		
		
	return new T(result);
		 
	}

	@Override public T visitCall(@NotNull ACPParser.CallContext ctx) { 
	String id = ctx.ID().getText();
	T value = visit(ctx.sumexpr());
	
	STGroup group = new STGroupDir("/Users/avijitvishen/Desktop/Integrate/src/tmp");
		ST st = group.getInstanceOf("funccall");
		st.add("name", id);
		st.add("value", value);

		String result = st.render(); 
		System.out.println("Funccall result"+result);
		
		
	return new T(result);
		
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitWhilestmt(@NotNull ACPParser.WhilestmtContext ctx) { T compexpr= this.visit(ctx.compexpr());
		
	STGroup group = new STGroupDir("/Users/avijitvishen/Desktop/Integrate/src/tmp");
		ST st = group.getInstanceOf("whilestmt");
		
		
		 // yields "int x = 0;"
		
		
		List<T> blockList = new ArrayList<T>();
		for(int i=0; i< ctx.block().size();i++){
		blockList.add(visit(ctx.block(i)));
		}
		st.add("cond", compexpr);
		st.add("block", blockList);
		String result = st.render();
		return new T(result);
	}

	
	@Override public T visitBoolean(@NotNull ACPParser.BooleanContext ctx) { 
		super.visitBoolean(ctx);
		return new T(ctx.BooleanValue().getText())
	}


	@Override public T visitIfonly(@NotNull ACPParser.IfonlyContext ctx) { 
		T compexpr= this.visit(ctx.compexpr());
		
	STGroup group = new STGroupDir("/Users/avijitvishen/Desktop/Integrate/src/tmp");
		ST st = group.getInstanceOf("ifstmt");
		
		
		 // yields "int x = 0;"
		
		
		List<T> blockList = new ArrayList<T>();
		for(int i=0; i< ctx.block().size();i++){
		blockList.add(visit(ctx.block(i)));
		}
		st.add("truestmt", blockList);
		st.add("elsestmt", "");
		st.add("cond", compexpr);
		String result = st.render();
		return new T(result);
		
		
		
		
	}

	@Override public T visitStackdecl(@NotNull ACPParser.StackdeclContext ctx) { return visitChildren(ctx); }

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitReturnstmt(@NotNull ACPParser.ReturnstmtContext ctx) { return visitChildren(ctx); }

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitOrwithout(@NotNull ACPParser.OrwithoutContext ctx) { return visitChildren(ctx); }

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitGototerm(@NotNull ACPParser.GototermContext ctx) { return visitChildren(ctx); }

	@Override public T visitAssign(@NotNull ACPParser.AssignContext ctx) { 
		super.visitAssign(ctx); 
		
		String id = ctx.ID().getText();
		T value = visit(ctx.sumexpr());
		STGroup group = new STGroupDir("/Users/avijitvishen/Desktop/Integrate/src/tmp");
		ST st = group.getInstanceOf("assign");
		st.add("name", "\""+id+"\"");
		st.add("value", "\""+value+"\"");
		String result = st.render(); // yields "int x = 0;"
		System.out.println("visit:"+result);
		
		
		return new T( result+"\n")
	}
}