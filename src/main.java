import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.FileInputStream;
import java.io.IOException;

public class main {
    public static void main(String[] args) {

        //String fileName = "/home/marco/IdeaProjects/imp-Language/imp/src/input.txt";
        String fileName = "/home/davide/IdeaProjects/impLanguage/src/input.txt";
        FileInputStream fis = null;
        try {
            // Open the input file stream
            fis = new FileInputStream(fileName);
            // Create a CharStream that reads from standard input
            ANTLRInputStream input = new ANTLRInputStream(fis);

            // Create a lexer that feeds off of input CharStream
            impLexer lexer = new impLexer(input);

            // Create a buffer of tokens pulled from the lexer
            CommonTokenStream tokens = new CommonTokenStream(lexer);

            // Create a parser that feeds off the tokens buffer
            impParser parser = new impParser(tokens);

            // Begin parsing at rule prog

            ParseTree tree = parser.prog();
            impBaseVisitor vis= new impBaseVisitor();
            vis.visit(tree);
            fis.close();

        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            //ciao
        }
    }
}