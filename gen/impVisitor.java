// Generated from /home/davide/IdeaProjects/impLanguage/src/imp.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link impParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface impVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link impParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(impParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link impParser#st}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSt(impParser.StContext ctx);
	/**
	 * Visit a parse tree produced by {@link impParser#lexp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLexp(impParser.LexpContext ctx);
	/**
	 * Visit a parse tree produced by {@link impParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp(impParser.ExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link impParser#aexp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAexp(impParser.AexpContext ctx);
	/**
	 * Visit a parse tree produced by {@link impParser#aop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAop(impParser.AopContext ctx);
	/**
	 * Visit a parse tree produced by {@link impParser#bexp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBexp(impParser.BexpContext ctx);
	/**
	 * Visit a parse tree produced by {@link impParser#bop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBop(impParser.BopContext ctx);
	/**
	 * Visit a parse tree produced by {@link impParser#mexp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMexp(impParser.MexpContext ctx);
}