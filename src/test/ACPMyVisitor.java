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
		String pathOfProject = "C:/Users/Chinmay/Documents/Bitbucket/ser-502-p2/src/tmp";
		@Override public T visitSub(  ACPParser.SubContext ctx) { 
		super.visitSub(ctx);
		T left = visit(ctx.sumexpr()); // get value of left subexpression
		T right = visit(ctx.term());
				STGroup group = new STGroupDir(pathOfProject);
		ST st = group.getInstanceOf("arithmetic");
		st.add("op", "SUB");
		st.add("left", left.toString());
		st.add("right", right.toString());
		String result = st.render(); // yields "int x = 0;"
		//System.out.println("this is sub"+result);
		return new T(result); 
		}

	@Override public T visitJustAnotherBlock(  ACPParser.JustAnotherBlockContext ctx) { 
		//T block = this.visit(ctx.block());
		super.visitJustAnotherBlock(ctx);
		List<T> blockList = new ArrayList<T>();
		
		for(int i=0; i< ctx.block().size();i++){
			
		
		blockList.add(visit(ctx.block(i)));
		
		}
		STGroup group = new STGroupDir(pathOfProject);
		ST st = group.getInstanceOf("blockenclosed");
		
		st.add("block", blockList);

		String result = st.render(); // yields "int x = 0;"
		//System.out.println("block result"+result);
		
		
		return new T(result+"\n");
		
		 
	}

	@Override 
	public T visitIfwithout(  ACPParser.IfwithoutContext ctx) { 
		super.visitIfwithout(ctx);
		T compexpr= this.visit(ctx.compexpr());
		T elseP = this.visit(ctx.elsepart());
		//System.out.println(elseP);
		STGroup group = new STGroupDir(pathOfProject);
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
		//sSystem.out.println("------->>>>>>"+result+"<-------");
		return new T(result);
	
	}

	@Override public T visitMul(  ACPParser.MulContext ctx) { 
		super.visitMul(ctx);
		T left = visit(ctx.term()); // get value of left subexpression
		T right = visit(ctx.factor());
		STGroup group = new STGroupDir(pathOfProject);
		ST st = group.getInstanceOf("arithmetic");
		st.add("op", "MUL");
		st.add("left", left.toString());
		st.add("right", right.toString());
		String result = st.render(); // yields "int x = 0;"
		//System.out.println("this is mul"+result);
		return new T(result);
	}

	@Override public T visitPrintstmt(  ACPParser.PrintstmtContext ctx) {
		super.visitPrintstmt(ctx);
		String text="";
		STGroup group = new STGroupDir(pathOfProject);
		ST st = group.getInstanceOf("printstmt");
		for(int i=0; i< ctx.ID().size();i++){
			
		
		text = text + ctx.ID(i).getText() + " ";
		
		}
		st.add("value","\""+text+"\"");
		String result = st.render();
		
		

		
		return new T("\n"+ result);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitDiv(  ACPParser.DivContext ctx) { 
		super.visitDiv(ctx);
		T left = visit(ctx.term()); // get value of left subexpression
		T right = visit(ctx.factor());
		STGroup group = new STGroupDir(pathOfProject);
		ST st = group.getInstanceOf("arithmetic");
		st.add("op", "DIV");
		st.add("left", left.toString());
		st.add("right", right.toString());
		String result = st.render(); // yields "int x = 0;"
		//System.out.println(result);
		return new T(result);	
		}

	@Override public T visitStackoperation(  ACPParser.StackoperationContext ctx) { return visitChildren(ctx); }

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitNumber(  ACPParser.NumberContext ctx) { 
	
	super.visitNumber(ctx);
	return new T(ctx.NumberValue().getText()); 
	}

	@Override public T visitElsepart(  ACPParser.ElsepartContext ctx) {
		super.visitElsepart(ctx);
		List<T> blockList = new ArrayList<T>();
		for(int i=0; i< ctx.block().size();i++){
		blockList.add(visit(ctx.block(i)));
		}
		
		return new T(blockList); 
		}

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitAnd(  ACPParser.AndContext ctx) {
		super.visitAnd(ctx);
		T left = visit(ctx.andcomp()); // get value of left subexpression
		T right = visit(ctx.relexpr());
		STGroup group = new STGroupDir(pathOfProject);
		ST st = group.getInstanceOf("arithmetic");
		st.add("op", "AND");
		st.add("left", left.toString());
		st.add("right", right.toString());
		String result = st.render(); // yields "int x = 0;"
		//System.out.println("this is AND"+result);
		return new T(result);} 

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitBlock(  ACPParser.BlockContext ctx) { super.visitBlock(ctx);
		return visitChildren(ctx); 
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitGotofactor(  ACPParser.GotofactorContext ctx) { return visitChildren(ctx); }

	@Override public T visitId(  ACPParser.IdContext ctx) { 
		super.visitId(ctx);
		String id = ctx.ID().getText();
		return new T(id);
		}

	@Override public T visitCallfunc(  ACPParser.CallfuncContext ctx) {return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitFuncwithparam(  ACPParser.FuncwithparamContext ctx) { 
		super.visitFuncwithparam(ctx); 
		String id = ctx.ID().getText();
		
		T param = this.visit(ctx.params());
		List<T> blockList = new ArrayList<T>();
		
		for(int i=0; i< ctx.block().size();i++){
			
		
		blockList.add(visit(ctx.block(i)));
		
		}
		//T block = this.visit(ctx.block());
		STGroup group = new STGroupDir(pathOfProject);
		ST st = group.getInstanceOf("funcwithparams");
		st.add("name", "\""+id+"\"");
		st.add("block", blockList);
		st.add("param", param);
		String result = st.render(); // yields "int x = 0;"
		//System.out.println("funcparam result "+result);
		
		
		return new T( result);
	}

	@Override public T visitAdd(  ACPParser.AddContext ctx) { 
		super.visitAdd(ctx);
		//System.out.println("enterting aaddddd");
		T left = this.visit(ctx.sumexpr()); // get value of left subexpression
		T right = this.visit(ctx.term());
		STGroup group = new STGroupDir(pathOfProject);
		ST st = group.getInstanceOf("arithmetic");
		st.add("left", left.toString());
		st.add("right", right.toString());
		st.add("op", "ADD");
		String result = st.render(); // yields "int x = 0;"
		return new T(result);
	}

	@Override public T visitComp(  ACPParser.CompContext ctx) {
		super.visitComp(ctx);
		T left = this.visit(ctx.sumexpr(0));
		T right = this.visit(ctx.sumexpr(1));
		String op = ctx.CMPOP().getText();
		STGroup group = new STGroupDir(pathOfProject);
		ST st = group.getInstanceOf("conditions");
		st.add("left", left);
		st.add("right", right);
		switch(op){
			case "<=":
				st.add("op", "LEQ");
				break;
			case ">=":
				st.add("op", "GRE");
				break;
			case "<":
				st.add("op", "LET");
				break;
			case ">":
				st.add("op", "GTN");
				break;
			case "==":
				st.add("op", "EQU");
				break;
		}
		
		String result = st.render();
		return new T("\n"+result);
		}

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitOr(  ACPParser.OrContext ctx) {
		super.visitOr(ctx);
		T left = visit(ctx.compexpr()); // get value of left subexpression
		T right = visit(ctx.andcomp());
		STGroup group = new STGroupDir(pathOfProject);
		ST st = group.getInstanceOf("arithmetic");
		st.add("op", "OR");
		st.add("left", left.toString());
		st.add("right", right.toString());
		String result = st.render(); // yields "int x = 0;"
		//System.out.println("this is OR"+result);
		return new T(result);}

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitAndwithout(  ACPParser.AndwithoutContext ctx) { return visitChildren(ctx); }

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitStart(  ACPParser.StartContext ctx) { 
		////System.out.println("Entering Start");
		List<T> blockList = new ArrayList<T>();
		
		for(int i=0; i< ctx.func().size();i++){
			
		
		blockList.add(visit(ctx.func(i)));
		
		}
		PrintWriter writer;
		try {
			writer = new PrintWriter(pathOfProject+"/fff.mvm", "UTF-8");
			//writer.println("[");
			for(T line: blockList)
			{
				writer.println(line.asString());
			}
			//writer.println("]");

		
			writer.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		//System.out.println("entering start");
		return new T(blockList);
		
	}

	@Override public T visitParams(  ACPParser.ParamsContext ctx) { 
		super.visitParams(ctx);
		String id = ctx.ID().getText();
		
		STGroup group = new STGroupDir(pathOfProject);
		ST st = group.getInstanceOf("param");
		st.add("name", "\""+id+"\"");
		String result = st.render();
		
		return new T (result);
	}

	@Override public T visitFuncwithoutparam(  ACPParser.FuncwithoutparamContext ctx) { 
		super.visitFuncwithoutparam(ctx);
		String id = ctx.ID().getText();
		
		
		//T block = this.visit(ctx.block());
		
		List<T> blockList = new ArrayList<T>();
		
		for(int i=0; i< ctx.block().size();i++){
			
	
		blockList.add(visit(ctx.block(i)));
		
		}
		STGroup group = new STGroupDir(pathOfProject);
		ST st = group.getInstanceOf("funcwoparams");
		st.add("name", id);
		st.add("block", blockList);

		String result = st.render(); // yields "int x = 0;"
		//System.out.println("funcwoparam result"+result);
		
		
	return new T(result);
		 
	}
	
	//@Override public T visitComplexcall(ACPParser.ComplexcallContext ctx) { return visitChildren(ctx); }
	
	@Override public T visitSimplecall(ACPParser.SimplecallContext ctx) {
		super.visitSimplecall(ctx);
	String id = ctx.ID().getText();
	T value = visit(ctx.sumexpr());
	
	STGroup group = new STGroupDir(pathOfProject);
		ST st = group.getInstanceOf("funccallsimple");
		st.add("name", id);
		st.add("value", value);

		String result = st.render(); 
		//System.out.println("Funccall result"+result);
		
		
	return new T(result);}

	/*@Override public T visitCall(  ACPParser.CallContext ctx) { 
	super.visitCall(ctx);
	String id = ctx.ID().getText();
	T value = visit(ctx.sumexpr());
	
	STGroup group = new STGroupDir(pathOfProject);
		ST st = group.getInstanceOf("funccall");
		st.add("name", id);
		st.add("value", value);

		String result = st.render(); 
		//System.out.println("Funccall result"+result);
		
		
	return new T(result);
		
	}*/

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitWhilestmt(  ACPParser.WhilestmtContext ctx) { 
	super.visitWhilestmt(ctx);
	T compexpr= this.visit(ctx.compexpr());
		
	STGroup group = new STGroupDir(pathOfProject);
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

	
	@Override public T visitBoolean(  ACPParser.BooleanContext ctx) { 
		super.visitBoolean(ctx);
		return new T(ctx.BooleanValue().getText());
	}


	@Override public T visitIfonly(  ACPParser.IfonlyContext ctx) { 
	super.visitIfonly(ctx);
		T compexpr= this.visit(ctx.compexpr());
		
	STGroup group = new STGroupDir(pathOfProject);
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

	@Override public T visitStackdecl(  ACPParser.StackdeclContext ctx) { return visitChildren(ctx); }

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitReturnstmt(  ACPParser.ReturnstmtContext ctx) {
		super.visitReturnstmt(ctx);
		T sum = this.visit(ctx.sumexpr());
		return new T(sum.asString()); 
		}

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitOrwithout(  ACPParser.OrwithoutContext ctx) { return visitChildren(ctx); }

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitGototerm(  ACPParser.GototermContext ctx) { return visitChildren(ctx); }

	@Override public T visitAssign(  ACPParser.AssignContext ctx) { 
		super.visitAssign(ctx); 
		
		String id = ctx.ID().getText();
		T value = visit(ctx.sumexpr());
		STGroup group = new STGroupDir(pathOfProject);
		ST st = group.getInstanceOf("assign");
		st.add("name", "\""+id+"\"");
		st.add("value", value);
		String result = st.render(); // yields "int x = 0;"
		////System.out.println("visit:"+result);
		
		
		return new T(result);
	}
}
