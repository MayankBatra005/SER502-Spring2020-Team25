import java.io.*;
import java.util.HashMap;
import java.util.Stack;
public class IntermediateCodeReader {
	public static void main(String[] str)throws Exception {
		
		File file = new File("C:\\Users\\raj\\Sparky.txt");
		BufferedReader read = new BufferedReader(new FileReader(file));
		String content;
		HashMap<String, String> map = new HashMap<String, String>();
		Stack<String> local = new Stack<String>();
		
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
			else if(line[0].equals("PRINT")) {
				if(line[1].equals("PLUS")) {
					System.out.println(Integer.parseInt(local.pop())+Integer.parseInt(local.pop()));
				}
			}
		}
		
	}
}
