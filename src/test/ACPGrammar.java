



import java.io.*;
import java.io.InputStream;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

public class ACPGrammar {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		/*PrintWriter writer;
		try {
			writer = new PrintWriter("C:/Users/Chinmay/Documents/Bitbucket/ser-502-p2/src/tmp/fff1.mvm", "UTF-8");
			writer.println("[");
			writer.println("]");
			writer.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		String inputFile = null;
		if ( args.length>0 ) inputFile = args[0];
		InputStream is = System.in;
		if ( inputFile!=null ) is = new FileInputStream(inputFile);
		ANTLRInputStream input = new ANTLRInputStream(is);
		ACPLexer lexer = new ACPLexer(input);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		ACPParser parser = new ACPParser(tokens);
		ParseTree tree = parser.start();
		System.out.println(tree.toStringTree(parser));
		
		ACPMyVisitor eval = new ACPMyVisitor();
		eval.visit (tree);
	}

}
