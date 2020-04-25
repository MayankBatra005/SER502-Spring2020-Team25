package sparkyRuntime;

import java.io.*;
import java.util.HashMap;
import java.util.Stack;
public class IntermediateCodeReader {
	
	IntermediateCodeReader() throws Exception{
		program();
	}
	public void program() throws Exception {
		
		File file = new File("C:\\Users\\raj\\Sparky.txt");
		FileReader fileReader = null;
		try {
			fileReader = new FileReader(file);
		}
		catch(FileNotFoundException fi) {
			System.out.println("Error in reading the file");
			fi.printStackTrace();
		}
		BufferedReader read = new BufferedReader(fileReader);
		String content;
		HashMap<String, DataTypes> map = new HashMap<String, DataTypes>();
		Stack<DataTypes> local = new Stack<DataTypes>();
		try {
			
		while((content=read.readLine())!=null) {
			String[] line = content.split(" ");
			DataTypes value;
			if(line[0].equals("DECLARE")) {				
				if(line.length<5) {
					//value = setValueDataTypes(line[1]);
					map.put(line[2], null);
				}
				else {
					value = setValueDataTypes(line[4]);
					if(line[1].equals(value.checkDataType())) {
						map.put(line[2], value);
					}
					else {
						
						throw new Exception("Datatype Mismatch during Variable declaration");
						
					}
				}
			}
			else if(line[0].equals("STORE")) {
				value = setValueDataTypes(line[1]);
				local.push(value);
			}
			else if(line[0].equals("PUSH")) {
				DataTypes mapvar = map.get(line[1]);
				DataTypes localvar = local.pop();
				if(mapvar==null || mapvar.checkDataType().equals(localvar.checkDataType())) {
					map.put(line[1], localvar);
				}
				else {
					throw new Exception("Datatype mismatch while assignment");
					
				}
			}
			
			else if(line[0].equals("GET")) {
				local.push(map.get(line[1]));
				System.out.println(map.get(line[1]));
			}
			else if(line[0].equals("OPERATOR")) {
				operator(line[1], local);
			}
			else if(line[0].equals("COMPARE")) {
				compare(line[1], local);
			}
			else if(line[0].equals("AND")) {
				Boolean decand = local.pop().Boolean();
				DataTypes outand = new DataTypes(decand.equals(local.pop().Boolean()) ? decand : false);
				local.push(outand);
			}
			else if(line[0].equals("OR")) {
				Boolean decor = local.pop().Boolean();
				DataTypes outor = new DataTypes(decor.equals(local.pop().Boolean()) ? decor : true);
				local.push(outor);
			}
			else if(line[0].equals("NOT")) {
				Boolean decnot = local.pop().Boolean();
				DataTypes outnot = new DataTypes(decnot.equals(true) ? false : true);
				local.push(outnot);
			}
			else if(line[0].equals("ComparisionNotTrue") && local.pop().Boolean().equals(false)) {
				if(line[2].equals("LABELELSE")) {
					while((content=read.readLine())!=null && !line[0].equals("LABELELSE")){
						line = content.split(" ");						
					}
				}
				else if(line[2].equals("WHILESCOPEEND")) {
					while((content=read.readLine())!=null && !line[0].equals("WHILESCOPEEND")){
						line = content.split(" ");						
					}
				}
			}
			else if(line[0].equals("PRINT")) {			
				System.out.println(local.pop().toString());
			}
		}
		}
		
		catch(IOException fu) {
			fu.printStackTrace();
		}
		
	}

	private DataTypes setValueDataTypes(String string) {
		if(isInt(string)) {
			return new DataTypes(Integer.parseInt(string));
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

	private void compare(String comparison, Stack<DataTypes> local) throws Exception {
		
		DataTypes locop2 = local.pop();
		DataTypes locop1 = local.pop();
		DataTypes outcome;
		if(locop1.checkDataType().equals(locop2.checkDataType())) {
			if(comparison.equals("ASSEQ")) {
				outcome = new DataTypes(locop2.toString().equals(locop1.toString()) ? true : false);
				local.push(outcome);
			}
			else if(comparison.equals("LESS_THAN") && locop1.checkDataType().equals("INTEGER")) {
				outcome = new DataTypes(locop2.Integer()>locop1.Integer() ? true : false);
				local.push(outcome);
			}
			else if(comparison.equals("MORE_THAN") && locop1.checkDataType().equals("INTEGER")) {
				outcome = new DataTypes(locop2.Integer()<locop1.Integer() ? true : false);
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

	private void operator(String operation, Stack<DataTypes> local) throws Exception {
		DataTypes locop2 = local.pop();
		DataTypes locop1 = local.pop();
		DataTypes outcome;
		if(locop1.checkDataType().equals(locop2.checkDataType()) && locop1.checkDataType().equals("INTEGER")) {
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
		else {
			throw new Exception("Datatype of both the variables should be same.");
		}
	}
}
