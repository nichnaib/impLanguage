// Generated from /home/marco/IdeaProjects/imp/src/imp.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;
import org.antlr.v4.runtime.tree.TerminalNode;
import java.util.*;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

/**
 * This class provides an empty implementation of {@link impVisitor},
 * which can be extended to create a visitor which only needs to handle a subset
 * of the available methods.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public class impBaseVisitor<T> extends AbstractParseTreeVisitor<T> implements impVisitor<T> {

	// Memory store
	public HashMap store = new HashMap<String,Object>();

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitProg(impParser.ProgContext ctx) {
		if (ctx.getText().contains(";") && !ctx.getText().contains("input")) {
			visitSt(ctx.st());
			return visitProg(ctx.prog());
		}
		else {
			visitSt(ctx.st());
			System.out.println(store);
		}
		return null;
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitSt(impParser.StContext ctx) {
		String statement= ctx.getChild(0).getText();

		T value=null;
		List <String> listVar= new ArrayList<>();

		String key="";
		switch (statement){
			case "skip" : System.out.println("Ho skippato");return null;
			case "input" :
				//T input= visitProg(ctx.prog(0));
				//creazione di uno lista di espressioni senza eseguirla
				String []expression= ctx.getText().split(";");
				for(int i=0; i<expression.length ; i++) {
					System.out.println(expression[i]);
				}
				break;
			case "output" :
				String q= ctx.lexp().getText();
				List<String> listOutput=new ArrayList<>();
				Object val=null;
				if(q.contains(".")){
					while(q.contains(".")){
						listOutput.add(q.substring(0,q.indexOf('.')));
						q=q.substring(q.indexOf('.')+1);
					}
					listOutput.add(q);
					for(int l=0; l<listOutput.size();l++){
						System.out.println(store.get(listOutput.get(l)));
					}
				}
				else {
					if (store.get(q) instanceof List) {
						listOutput = (List) store.get(q);
						if (store.containsKey(q)) {
							System.out.println(store.get(q));
						} else {
							for (int k = 0; k < listOutput.size(); k++) {
								Object temp = store.get(listOutput.get(k));
								System.out.println(temp);

							}
						}
					} else {
						val = store.get(q);
						System.out.println(val);
					}
				}
				break;

			case "while" :
				String w=visitBexp(ctx.bexp()).toString();
				while(w=="true") {
					visitProg(ctx.prog(0));
					w=visitBexp((impParser.BexpContext) ctx.getChild(1)).toString();
				}
				break;
			case "if" :
				String i=visitBexp((impParser.BexpContext) ctx.getChild(1)).toString();
				if(i=="true")
					visitProg(ctx.prog(0));
				else
					visitProg(ctx.prog(1));
				break;
			case "var " :
				key= ctx.getChild(1).getText();
				value=visitExp(ctx.exp());
				if (store.containsKey(key)) {
					store.replace(key,value);
				} else
					store.put(key, value);
				break;
			case "list " :
				key= ctx.getChild(1).getText();
				listVar=(List)visitLexp(ctx.lexp());

				if (store.containsKey(key))
					store.replace(key,listVar);
				else
					store.put(key, listVar);
				break;
			case "map ":
				HashMap map = new HashMap<String,Object>();
				key=ctx.getChild(1).getText();
				List<Object>lista=(List)visitMexp(ctx.mexp());

				for(int j =0; j<lista.size();j+=2){
					map.put(lista.get(j),lista.get(j+1));
				}
				store.put(key,map);
				break;

			default: T controllo= visitExp(ctx.exp());
				if (controllo!=null)
					System.out.print("");
				else
					System.out.println("_/null/botton");
				;
		}

		return null;
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitExp(impParser.ExpContext ctx) {
		return visitChildren(ctx);
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitAexp(impParser.AexpContext ctx) {
		List<String> foglie= visitTerminalNodeAexp(ctx);
		String temp="";
		String expressionAritmetica="";

		//Espressioni regolari su cui fare il controllo
		String regex="+-*/()";
		String regex2="\\d+";


		for(Iterator<String> iterator=foglie.iterator();iterator.hasNext();){
			temp=iterator.next();
			if(regex.contains(temp) || temp.matches(regex2))
				expressionAritmetica=expressionAritmetica+temp;
			else
				expressionAritmetica=expressionAritmetica+store.get(temp);
		}

		ScriptEngineManager manager = new ScriptEngineManager();
		ScriptEngine engine = manager.getEngineByName("js");
		Object result=null;
		try {
			result = engine.eval(expressionAritmetica);
		}
		catch (Exception e ){
			System.out.println("Error :" + e.getMessage() );
		}
		return (T)result ;
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitAop(impParser.AopContext ctx) {
		return (T)ctx.getText();
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitBexp(impParser.BexpContext ctx) {
		List<String> foglie= visitTerminalNodeBexp(ctx);
		String temp="";
		String expressionBool="";
		for(Iterator<String> iterator=foglie.iterator();iterator.hasNext();){
			temp=iterator.next();
			if(temp.equals("true") || temp.equals("false") || temp.equals("&&") || temp.equals("||") || temp.equals("!"))
				expressionBool=expressionBool+temp;
			else
				expressionBool=expressionBool+store.get(temp);
		}
		//Globale?
		ScriptEngineManager manager = new ScriptEngineManager();
		ScriptEngine engine = manager.getEngineByName("js");
		Object result=null;

		try {
			result = engine.eval(expressionBool);
			return (T)result;
		}
		catch (Exception e ){
			System.out.println("Error : " +e.getMessage());
		}
		return (T)result;
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitBop(impParser.BopContext ctx) {
		return (T)ctx.getText();
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitLexp(impParser.LexpContext ctx) {
		String x=null;
		List<String> lista=new ArrayList<>();
		String WheretoPush="";
		String push="";
		switch (ctx.getChild(0).toString()){
			case "": return (T)""; //chiedere
			case "cons" :
				WheretoPush=ctx.getChild(2).getText();
				push=ctx.getChild(4).getText();
				if(store.containsKey(push) && store.containsKey(WheretoPush)){
					if( store.get(push) instanceof List && store.get(WheretoPush) instanceof List ) {
						lista = concatList((List) store.get(push), (List) store.get(WheretoPush));
						store.replace(WheretoPush, lista);
					}
					else if( store.get(push) instanceof List ){
						lista.add(WheretoPush);
						lista=concatList((List)store.get(push),lista);
					}
					else if(store.get(WheretoPush) instanceof List){
						lista=(List)store.get(WheretoPush);
						lista.add(push);
					}
					else{
						lista.add(WheretoPush);
						lista.add(push);
					}
				}
				if(!store.containsKey(push)&&store.containsKey(WheretoPush)){
					if( store.get(WheretoPush) instanceof List) {
						lista = concatList(getLista(push), (List) store.get(WheretoPush));
						store.replace(WheretoPush, lista);
					}
					else{
						lista.add(WheretoPush);
						lista=concatList((List)getLista(push),lista);
					}
				}
				if(store.containsKey(push)&&!store.containsKey(WheretoPush)){
					if(store.get(push) instanceof List) {
						if (getLista(WheretoPush) != null)
							lista = concatList((List) store.get(push), getLista(WheretoPush));
						else
							lista = null;
					}
					else{
						lista=getLista(WheretoPush);
						if(lista.size()>0)
							lista.add(push);
					}
				}
				if(!store.containsKey(push)&&!store.containsKey(WheretoPush)){
					if(getLista(WheretoPush)==getLista(""))
						if(getLista(push)==getLista(""))
							lista=new ArrayList<>();
						else
							lista=concatList(getLista(push),getLista(WheretoPush));
				}
				System.out.println(lista);
				break;
			case "pop" :
				String pop=ctx.getChild(2).getText();
				if(store.containsKey(pop)){
					if(store.get(pop) instanceof List){
						lista=(List) store.get(pop);
						lista=lista.subList(1,lista.size());
						store.replace(pop,lista);
					}
					else {
						lista=getLista(pop);
						lista=lista.subList(1,lista.size());
						store.replace(pop,lista);
					}
				}
				else {
					if(pop.contains(".")){
						pop=pop.substring(1,pop.length());
						lista=getLista(pop);
					}
					else{
						lista= null;
					}
				}
				System.out.println(lista);
				break;
			case "top" :
				String top=ctx.getChild(2).getText();
				if (store.containsKey(top)){
					if(store.get(top) instanceof List){
						lista= (List) store.get(top);
						lista = lista.subList(0,1);
					}
					else {
						lista=getLista(top);
						lista=lista.subList(0,1);
					}
				}
				else{
					lista=getLista(top);
					lista=lista.subList(0,1);

				}
				System.out.println(lista);
				break;
			case "push" :
				WheretoPush=ctx.getChild(4).getText();
				push=ctx.getChild(2).getText();
				if(!store.containsKey(push) || push.contains(".")){
					break;
				}
				else {
					if(store.containsKey(WheretoPush)){
						lista=(List)store.get(WheretoPush);
						lista=concatList(getLista(push),lista);
						store.replace(WheretoPush,lista);
					}
					else {
						lista=concatList(getLista(push),getLista(WheretoPush));
					}
				}
				System.out.println(lista);
				break;
			default:
				x = ctx.getText();
				lista=getLista(x);
		}
		return (T)lista;
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitMexp(impParser.MexpContext ctx) {
		List<Object> lista = new ArrayList<>();
		HashMap map=new HashMap<String,Object>();
		if(ctx.getText().contains("[")) {
			visitTerminaNodeMexp(ctx,lista);
		}
		else {
			String key=ctx.getChild(0).getText();
			map=(HashMap) store.get(key);
			Object ret= map.get(ctx.getChild(2).getText());
			return  (T)ret;
		}

		return (T)lista ; }

	/**
	 * {@inheritDoc}
	 *
	 * <p>Method that return a list of strings that represent the terminal node </p>
	 */
	public List<String>visitTerminalNodeBexp(impParser.BexpContext tree) {
		List<String> ret=new ArrayList<>();
		int figli=tree.getChildCount();
		for(int i =0; i< figli; i++){
			if(tree.getChild(i).getChildCount()==0 || tree.getChild(i).getChildCount()==1){
				ret.add(tree.getChild(i).getText());
			}
			else{
				tree=(impParser.BexpContext)tree.getChild(i);
				figli=tree.getChildCount();
				i=-1;
			}
		}
		return ret ;
	}
	public List<String>visitTerminalNodeAexp(impParser.AexpContext tree) {
		List<String> ret=new ArrayList<>();
		int figli=tree.getChildCount();
		for(int i =0; i< figli; i++){
			if(tree.getChild(i).getChildCount()==0 || tree.getChild(i).getChildCount()==1){
				ret.add(tree.getChild(i).getText());
			}
			else{
				tree=(impParser.AexpContext)tree.getChild(i);
				figli=tree.getChildCount();
				i=-1;
			}
		}
		return ret ;
	}
	public List<Object>visitTerminaNodeMexp(impParser.MexpContext tree,List<Object>lista ){
		int figli=tree.getChildCount();
		int i =0;
		if(figli==6) {
			lista.add(tree.getChild(1).getText());
			if(store.containsKey(tree.getChild(3).getText())){
				lista.add(store.get(tree.getChild(3).getText()));
			}
			lista.add(visitExp(tree.exp()));
			tree= tree.mexp();
			visitTerminaNodeMexp(tree,lista);
		}
		else{
			lista.add(tree.getChild(1).getText());
			if(store.containsKey(tree.getChild(3).getText())){
				lista.add(store.get(tree.getChild(3).getText()));
			}
			else{
				lista.add(visitExp(tree.exp()));
			}

		}

		return lista;
	}

	public List<String>getLista(String chiavi){
		List<String> lista=new ArrayList<>();
		while(chiavi.contains(".")) {
			int nextPunto = chiavi.indexOf(".");
			String p = chiavi.substring(0, nextPunto);

			if(store.containsKey(p))
				lista.add(p);
			else{
				lista=new ArrayList<>();
				return lista;
			}
			chiavi=chiavi.substring(nextPunto+1);

		}

		if(store.containsKey(chiavi))
			lista.add(chiavi);
		else{
			lista=new ArrayList<>();
			return lista;
		}
		return lista;
	}
	public List<String>concatList(List<String> a,List<String> b){
		if(b.size()>0){
			for(int i=0; i<b.size();i++) {
				a.add(b.get(i));
			}
		}
		else{
			return new ArrayList<>();
		}
		return a;
	}
}