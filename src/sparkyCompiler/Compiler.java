package sparkyCompiler;

import java.io.File;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.List;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import sparky.SparkyLexer;
import sparky.SparkyParser;

public class Compiler {

	public static void main(String[] args) {
		try {
			
			String inputFileName = "data/Example 1.sparky";
			//String iCodeFilename;
    		
    		CharStream sourceCode = CharStreams.fromFileName(inputFileName);
    		SparkyLexer lx = new SparkyLexer(sourceCode);
    		CommonTokenStream tokenStream = new CommonTokenStream(lx);
    		SparkyParser parser = new SparkyParser(tokenStream);
    		ParseTree parseTree = parser.program();
    		
    		
    		//iCodeFilename = inputFileName.split("\\.")[0] + ".isparky";
    		IntermediateCodeGenerator iCodeGen = new IntermediateCodeGenerator();
    		iCodeGen.visit(parseTree);
    		
    		List<String> iCodeArray = Arrays.asList(iCodeGen.getOutput().split("\\n"));
//    		if(iCodeArray.size()>1)
//    		{
    	       
				PrintWriter writer = new PrintWriter(inputFileName.replace("sparky", "sparkyic"), "UTF-8");
    			
    			for(int i=0; i<iCodeArray.size();i++)
    			{
    				writer.println(iCodeArray.get(i));
    			}
    			writer.close();
    			
    			//File iCodeFile = new File(iCodeFilename);
    		//}

        
	}
	catch (Exception e)
	{
//		System.out.println("Wrong Input file" + e.p);
		e.printStackTrace();
	}

		}

	}
