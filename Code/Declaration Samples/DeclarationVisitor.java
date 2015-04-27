// Generated from Declaration.g4 by ANTLR 4.2
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link DeclarationParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface DeclarationVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link DeclarationParser#gotosumexp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGotosumexp(@NotNull DeclarationParser.GotosumexpContext ctx);

	/**
	 * Visit a parse tree produced by {@link DeclarationParser#add}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdd(@NotNull DeclarationParser.AddContext ctx);

	/**
	 * Visit a parse tree produced by {@link DeclarationParser#div}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDiv(@NotNull DeclarationParser.DivContext ctx);

	/**
	 * Visit a parse tree produced by {@link DeclarationParser#sub}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSub(@NotNull DeclarationParser.SubContext ctx);

	/**
	 * Visit a parse tree produced by {@link DeclarationParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(@NotNull DeclarationParser.NumberContext ctx);

	/**
	 * Visit a parse tree produced by {@link DeclarationParser#declare}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclare(@NotNull DeclarationParser.DeclareContext ctx);

	/**
	 * Visit a parse tree produced by {@link DeclarationParser#bool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool(@NotNull DeclarationParser.BoolContext ctx);

	/**
	 * Visit a parse tree produced by {@link DeclarationParser#mul}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMul(@NotNull DeclarationParser.MulContext ctx);

	/**
	 * Visit a parse tree produced by {@link DeclarationParser#gotofactor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGotofactor(@NotNull DeclarationParser.GotofactorContext ctx);

	/**
	 * Visit a parse tree produced by {@link DeclarationParser#id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(@NotNull DeclarationParser.IdContext ctx);

	/**
	 * Visit a parse tree produced by {@link DeclarationParser#gototerm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGototerm(@NotNull DeclarationParser.GototermContext ctx);

	/**
	 * Visit a parse tree produced by {@link DeclarationParser#assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(@NotNull DeclarationParser.AssignContext ctx);
}