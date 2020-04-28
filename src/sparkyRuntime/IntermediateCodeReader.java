package sparkyRuntime;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Stack;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;

public class IntermediateCodeReader {

	public IntermediateCodeReader(String filename) throws Exception {
		program(filename);
	}

	/**
	 * Program function reads the Intermediate code file line by line. Variables are
	 * stored in Hashmap having value of different data types. To handle this we
	 * created class Datatypes.
	 * 
	 * @throws Exception
	 */
	
	private void saveToTextFile(String filename) throws Exception 
	{
		String basePath = new File("").getAbsolutePath()+"\\data";
		String path=basePath+"\\"+filename;
		// change 5
		// CharStream code = CharStreams.fromFileName(path);
		 CharStream code = CharStreams.fromFileName(filename);
		
		 // change 3
		 //PrintWriter out = new PrintWriter(basePath+"/Sparky.txt");
		 PrintWriter out = new PrintWriter("Sparky.txt");
		 out.println(code.toString());
		 out.close();
		 		
	}
	
	private void program(String filename) throws Exception {
		
		saveToTextFile(filename);
		// String basePath = new File("").getAbsolutePath()+"\\data";
		String basePath = new File("").getAbsolutePath();
		// change 4
		//File file = new File(basePath+"\\Sparky.txt");
		File file = new File("Sparky.txt");
		FileReader fileReader = null;
		try {
			fileReader = new FileReader(file);
		} catch (FileNotFoundException fi) {
			System.out.println("Error in reading the file");
			fi.printStackTrace();
		}
		BufferedReader read = new BufferedReader(fileReader);
		String content;
		HashMap<String, DataTypes> map = new HashMap<String, DataTypes>();
		Stack<DataTypes> local = new Stack<DataTypes>();
		Stack<String> forVariable = new Stack<String>();
		int counter = 0;
		Stack<String> whileVariable = new Stack<String>();
		int counter1 = 0;
		try {

			while ((content = read.readLine()) != null) {
				String[] line = content.split(" ");
				DataTypes value;

				if (line[0].equals("DECLARE")) {
					// If variable name is already present.
					if (map.containsKey(line[2])) {
						throw new Exception("Variable " + line[2] + " is already declared.");
					}
					// If variable is declared without definition.
					if (line.length < 5) {
						map.put(line[2], null);
						if (counter != 0) {
							forVariable.push(line[2]);
						}
						if (counter1 != 0) {
							whileVariable.push(line[2]);
						}
					}
					// If variable is declared with definition.
					else {

						value = setValueDataTypes(line[4]);
						if (line[1].equals(value.checkDataType())) {
							map.put(line[2], value);
							if (counter != 0) {
								forVariable.push(line[2]);
							}
							if (counter1 != 0) {
								whileVariable.push(line[2]);
							}
						} else {

							throw new Exception("Datatype Mismatch during Variable declaration");

						}
					}
				}

				else if(line[0].equals("STORE")) {
				if(line[1].charAt(0)!='"') {
					value = setValueDataTypes(line[1]);
					local.push(value);
				}
				else if(line[1].charAt(0)=='"') {
					String output="";
			        int count=0;
			        for(int i=1; i<line.length; i++){
			            if(i==1 && line[i].length()!=1){
			                output+=line[i].substring(1, line[i].length())+" ";
			                count=1;
			            }
			            else if(i==line.length-1 && line[i].length()!=1){
			                output+=line[i].substring(0, line[i].length()-1);
			            }
			            else if(i!=1 && i!=line.length-1){
			                if(count==0 && i==2){
			                    output+= " " + line[i] + " ";
			                }
			                else{
			                    output+=line[i] + " ";
			                }
			            }
			        }
			        value = setValueDataTypes(output);
					local.push(value);
				}
			}

				else if (line[0].equals("PUSH")) {
					if (!map.containsKey(line[1])) {
						throw new Exception("Variable " + line[1] + " might not have been declared.");
					} else {
						DataTypes mapvar = map.get(line[1]);
						DataTypes localvar = local.pop();
						if (mapvar == null || mapvar.checkDataType().equals(localvar.checkDataType())) {
							map.put(line[1], localvar);
						} else {
							throw new Exception("Datatype mismatch while assignment");

						}
					}
				}

				else if (line[0].equals("GET")) {
					if (!map.containsKey(line[1])) {
						throw new Exception("Variable " + line[1] + " might not have been declared.");
					} else {
						local.push(map.get(line[1]));
					}
				}

				else if (line[0].equals("OPERATOR")) {
					operator(line[1], local);
				}

				else if (line[0].equals("COMPARE_OPERATOR")) {
					compare(line[1], local);
				}

				else if (line[0].equals("AND_OR_OPERATOR")) {
					if (line[1].equals("and")) {
						Boolean decand = local.pop().Boolean();
						DataTypes outand = new DataTypes(decand.equals(local.pop().Boolean()) ? decand : false);
						local.push(outand);
					}

					else if (line[1].equals("or")) {
						Boolean decor = local.pop().Boolean();
						DataTypes outor = new DataTypes(decor.equals(local.pop().Boolean()) ? decor : true);
						local.push(outor);
					}

					else if (line[1].equals("not")) {
						Boolean decnot = local.pop().Boolean();
						DataTypes outnot = new DataTypes(decnot.equals(true) ? false : true);
						local.push(outnot);
					}
				}

				else if (line[0].equals("CONDITION_FALSE") && !local.pop().Boolean()) {

					if (line[2].equals("ELSE_START")) {
						while ((content = read.readLine()) != null) {
							line = content.split(" ");
							if (line[0].equals("ELSE_START")) {
								break;
							}
						}
					} else if (line[2].equals("WHILEEND")) {
						while ((content = read.readLine()) != null) {
							line = content.split(" ");
							if (line[0].equals("WHILEEND")) {
								break;
							}
						}
						counter1 = 0;
						while (!whileVariable.empty()) {
							map.remove(whileVariable.pop());
						}
					} else if (line[2].equals("FOR_STOP")) {
						while ((content = read.readLine()) != null) {
							line = content.split(" ");
							if (line[0].equals("FOR_STOP")) {
								break;
							}
						}
						counter = 0;
						while (!forVariable.empty()) {
							map.remove(forVariable.pop());
						}
					}
				}

				else if (line[0].equals("FOR_START")) {
					if (counter == 0) {
						counter = counter + 1;
					}

				}

				else if (line[0].equals("IF_END")) {
					while ((content = read.readLine()) != null) {
						line = content.split(" ");
						if (line[0].equals("ELSE_END")) {
							break;
						}
					}

				}

				else if (line[0].equals("WHILEBEGIN")) {
					if (counter1 == 0) {
						counter1 = counter1 + 1;
					}

				}

				// else if(line[0].equals("FOR_STOP")) {
				// System.out.println("raja");
				// counter = 0;
				// while(forVariable.empty()) {
				// map.remove(forVariable.pop());
				// }
				// }

				else if (line[0].equals("JUMP")) {

					if (line[1].equals("FOR_CONDITION_START")) {
						file = new File(basePath+"\\Sparky.txt");
						fileReader = null;
						try {
							fileReader = new FileReader(file);
						} catch (FileNotFoundException fi) {
							System.out.println("Error in reading the file");
							fi.printStackTrace();
						}
						read = new BufferedReader(fileReader);
						while ((content = read.readLine()) != null) {
							line = content.split(" ");
							if (line[0].equals("FOR_CONDITION_START")) {
								break;
							}
						}
					} else if (line[1].equals("WHILEBEGIN")) {
						file = new File(basePath+"\\Sparky.txt");
						fileReader = null;
						try {
							fileReader = new FileReader(file);
						} catch (FileNotFoundException fi) {
							System.out.println("Error in reading the file");
							fi.printStackTrace();
						}
						read = new BufferedReader(fileReader);
						while ((content = read.readLine()) != null) {
							line = content.split(" ");
							if (line[0].equals("WHILEBEGIN")) {
								break;
							}
						}
					}
				}

				else if (line[0].equals("PRINT")) {
					if(local.isEmpty()) {
						throw new Exception("Nothing to Print.");
					}
					System.out.println(local.pop().toString());
				}
			}
		}

		catch (IOException fu) {
			fu.printStackTrace();
		}

	}

	// Checks the data type of input and creates an object of class DataTypes.
	private DataTypes setValueDataTypes(String string) {
		if(isInt(string)) {
			return new DataTypes(Integer.parseInt(string));
		}
		else if(isdouble(string)) {
			return new DataTypes(Double.parseDouble(string));
		}
		else if(isbool(string)) {
			return new DataTypes(Boolean.parseBoolean(string));
		}
		else {
			return new DataTypes(string);
		}
	}

	private boolean isInt(String strin) {
		try {
			int a = Integer.parseInt(strin);
			return true;
		}
		catch(NumberFormatException fk) {
			return false;
		}
	}
	
	private boolean isdouble(String strin) {
		try {
			double d = Double.parseDouble(strin);
			return true;
		}
		catch(NumberFormatException fk) {
			return false;
		}
	}
	
	private boolean isbool(String string) {
		try {
			Boolean bo = Boolean.parseBoolean(string);
        	if(!bo && !string.equalsIgnoreCase("FALSE")) {
        		 return false;
        	}
            return true;
		}
		catch(NumberFormatException fk) {
			return false;
		}
	}
	
	//Compares the 2 input and pushes the boolean result in stack.
	private void compare(String comparison, Stack<DataTypes> local) throws Exception {
		
		DataTypes locop2 = local.pop();
		DataTypes locop1 = local.pop();
		DataTypes outcome;
		if(locop1.checkDataType().equals(locop2.checkDataType())) {
			if(comparison.equals("==")) {
				outcome = new DataTypes(locop2.toString().equals(locop1.toString()) ? true : false);
				local.push(outcome);
			}
			else if(comparison.equals("<") && locop1.checkDataType().equals("int")) {
				outcome = new DataTypes(locop2.Integer()>locop1.Integer() ? true : false);
				local.push(outcome);
			}
			else if(comparison.equals("<") && locop1.checkDataType().equals("double")) {
				outcome = new DataTypes(locop2.Double()>locop1.Double() ? true : false);
				local.push(outcome);
			}
			else if(comparison.equals("<=") && locop1.checkDataType().equals("int")) {
				outcome = new DataTypes(locop2.Integer()>=locop1.Integer() ? true : false);
				local.push(outcome);
			}
			else if(comparison.equals("<=") && locop1.checkDataType().equals("double")) {
				outcome = new DataTypes(locop2.Double()>=locop1.Double() ? true : false);
				local.push(outcome);
			}
			else if(comparison.equals(">") && locop1.checkDataType().equals("int")) {
				outcome = new DataTypes(locop2.Integer()<locop1.Integer() ? true : false);
				local.push(outcome);
			}
			else if(comparison.equals(">") && locop1.checkDataType().equals("double")) {
				outcome = new DataTypes(locop2.Double()<locop1.Double() ? true : false);
				local.push(outcome);
			}
			else if(comparison.equals(">=") && locop1.checkDataType().equals("int")) {
				outcome = new DataTypes(locop2.Integer()<=locop1.Integer() ? true : false);
				local.push(outcome);
			}
			else if(comparison.equals(">=") && locop1.checkDataType().equals("double")) {
				outcome = new DataTypes(locop2.Double()<=locop1.Double() ? true : false);
				local.push(outcome);
			}
			else {
				throw new Exception("Incorrect Datatype while comparison");
			}
		}
		else {
			throw new Exception("Datatype mismatch while comparison");
		}
		
	}
	
	//Performs Arithmetic operation on inputs and pushes the result in stack.
	private void operator(String operation, Stack<DataTypes> local) throws Exception {
		DataTypes locop2 = local.pop();
		DataTypes locop1 = local.pop();
		DataTypes outcome;
		if(locop1.checkDataType().equals(locop2.checkDataType()) && locop1.checkDataType().equals("int")) {
			if(operation.equals("ADD")) {
				outcome = new DataTypes(locop1.Integer()+locop2.Integer());
				local.push(outcome);
			}
			else if(operation.equals("SUBTRACT")) {
				outcome = new DataTypes(locop1.Integer()-locop2.Integer());
				local.push(outcome);
			}
			else if(operation.equals("MULTIPLY")) {
				outcome = new DataTypes(locop1.Integer()*locop2.Integer());
				local.push(outcome);
			}
			else if(operation.equals("DIVIDE")) {
				if(locop2.Integer()!=0){
					outcome = new DataTypes(locop1.Integer()/locop2.Integer());
					local.push(outcome);
				}
				else {
					throw new Exception("Denominator can't be zero.");
				}
			}
		}
		else if(locop1.checkDataType().equals(locop2.checkDataType()) && locop1.checkDataType().equals("double")) {
			if(operation.equals("ADD")) {
				outcome = new DataTypes(locop1.Double()+locop2.Double());
				local.push(outcome);
			}
			else if(operation.equals("SUBTRACT")) {
				outcome = new DataTypes(locop1.Double()-locop2.Double());
				local.push(outcome);
			}
			else if(operation.equals("MULTIPLY")) {
				outcome = new DataTypes(locop1.Double()*locop2.Double());
				local.push(outcome);
			}
			else if(operation.equals("DIVIDE")) {
				if(locop2.Integer()!=0){
					outcome = new DataTypes(locop1.Double()/locop2.Double());
					local.push(outcome);
				}
				else {
					throw new Exception("Denominator can't be zero.");
				}
			}
		}
		else {
			throw new Exception("Datatype of both the variables should be same.");
		}
	}
}
