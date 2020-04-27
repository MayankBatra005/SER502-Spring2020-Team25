package sparkyCompiler;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import sparky.SparkyLexer;
import sparky.SparkyParser;
import sparkyRuntime.IntermediateCodeReader;

public class Compiler {


	public static void main(String[] args) throws Exception 
	{
		String inputIcfile=null;

		try {

			if (args.length > 0) {
				String inputFileName = args[0];
				inputIcfile=args[0];
				// String inputFileName = "data/print.sparky";
String path="data/"+inputIcfile;
				CharStream sourceCode = CharStreams.fromFileName(path);
				SparkyLexer lx = new SparkyLexer(sourceCode);
				CommonTokenStream tokenStream = new CommonTokenStream(lx);
				SparkyParser parser = new SparkyParser(tokenStream);
				ParseTree parseTree = parser.program();

				IntermediateCodeGenerator iCodeGen = new IntermediateCodeGenerator();
				iCodeGen.visit(parseTree);

				List<String> iCodeArray = Arrays.asList(iCodeGen.getOutput().split("\\n"));

				try {
					String basePath = new File("").getAbsolutePath()+"\\data\\";
					File iCodeFile = new File(basePath+inputFileName.replace("sparky", "sparkyic"));
					BufferedWriter bufferWriter = null;
					FileWriter fileWriter = null;
					if (iCodeArray.size() > 1) {
						try {
							if (iCodeFile.exists()) {
								iCodeFile.delete();
								iCodeFile.createNewFile();
							} else {
								iCodeFile.createNewFile();
							}

							fileWriter = new FileWriter(iCodeFile);
							bufferWriter = new BufferedWriter(fileWriter);
							for (int i = 0; i < iCodeArray.size(); i++) {
								bufferWriter.write(iCodeArray.get(i) + " " + "\n");
							}

						} catch (IOException e) {
							e.printStackTrace();

						} finally {
							try {
								if (bufferWriter != null)
									bufferWriter.close();
								if (fileWriter != null)
									fileWriter.close();

							} catch (IOException ex) {
								ex.printStackTrace();
							}
						}
					}
				}

				catch (Exception e) {
					e.printStackTrace();
				}
			}
		} catch (Exception e) {
			System.out.println("Input filename is incorrect");
			e.printStackTrace();
		}
		if (inputIcfile != null) {
			executeRuntime(inputIcfile+"ic");
		}else {
			
			System.out.println("Error File not created ");
		}
	}
	
	public static void executeRuntime(String filename) throws Exception
	{
		new IntermediateCodeReader(filename);
		System.out.println("call to runtime");
		

	}

}
