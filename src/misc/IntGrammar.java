



import java.io.FileInputStream;
import java.io.InputStream;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

public class IntGrammar {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String inputFile = null;
		if ( args.length>0 ) inputFile = args[0];
		InputStream is = System.in;
		if ( inputFile!=null ) is = new FileInputStream(inputFile);
		ANTLRInputStream input = new ANTLRInputStream(is);
		IntegrateLexer lexer = new IntegrateLexer(input);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		IntegrateParser parser = new IntegrateParser(tokens);
		ParseTree tree = parser.start();
		System.out.println(tree.toStringTree(parser));
		
		IntegrateMyVisitor eval = new IntegrateMyVisitor();
		eval.visit (tree);
	}

}
