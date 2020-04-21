import java.io.*;
import java.util.HashMap;
import java.util.Stack;
public class IntermediateCodeReader {
	public static void main(String[] str) {
		
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
		HashMap<String, String> map = new HashMap<String, String>();
		Stack<String> local = new Stack<String>();
		try {
			
		while((content=read.readLine())!=null) {
			String[] line = content.split(" ");
			if(line[0].equals("DECLARE")) {
				map.put(line[2], null);
			}
			else if(line[0].equals("STORE")) {
				local.push(line[1]);
			}
			else if(line[0].equals("PUSH")) {
				map.replace(line[1], local.pop());
			}
			
			else if(line[0].equals("GET")) {
				local.push(map.get(line[1]));
			}
			else if(line[0].equals("COMPARE")) {
				if(line[1].equals("MORE_THAN")) {
					local.push((Integer.parseInt(local.pop())<Integer.parseInt(local.pop()) ? "Yeah" : "Nah" ));
				}
				else if(line[1].equals("LESS_THAN")) {
					local.push((Integer.parseInt(local.pop())>Integer.parseInt(local.pop()) ? "Yeah" : "Nah" ));
				}
				else if(line[1].equals("ASSEQ")) {
					local.push((Integer.parseInt(local.pop())==Integer.parseInt(local.pop()) ? "Yeah" : "Nah" ));
				}
				else if(line[1] == "GreaterThanOrEquals") {
					local.push((Integer.parseInt(local.pop())<=Integer.parseInt(local.pop()) ? "Yeah" : "Nah" ));
				}
				else if(line[1] == "SmallerThanOrEquals") {
					local.push((Integer.parseInt(local.pop())>=Integer.parseInt(local.pop()) ? "Yeah" : "Nah" ));
				}
			}
			else if(line[0].equals("AND")) {
				String dec = local.pop();
				local.push((dec.equals(local.pop()) ? dec : "Nah" ));
			}
			else if(line[0].equals("OR")) {
				String dec = local.pop();
				local.push((dec.equals(local.pop()) ? dec : "Yeah" ));
			}
			else if(line[0].equals("NOT")) {
				String dec = local.pop();
				local.push((dec.equals("Yeah") ? "Nah" : "Yeah" ));
			}
			else if(line[0].equals("ComparisionNotTrue") && local.pop()=="Nah") {
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
				if(line[1].equals("PLUS")) {
					System.out.println(Integer.parseInt(local.pop())+Integer.parseInt(local.pop()));
				}
			}
		}
		}
		
		catch(IOException fu) {
			fu.printStackTrace();
		}
		
	}
}
