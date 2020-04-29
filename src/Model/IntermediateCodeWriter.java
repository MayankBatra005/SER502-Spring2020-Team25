package Model;

/**
 * This purpose of this class is to be a model for writing the intermediate code keywords
 * @author Mayank Batra
 * @since April-27-2020
 * @version 1.0
 */

public class IntermediateCodeWriter {

	private String icOutput = "";
	public static IntermediateCodeWriter singeltonInstance;
	
	private IntermediateCodeWriter() {}
	
    public void addOutput(String output) {
        this.icOutput += output + "\n";
    }
    
    
    
    public String getIcOutput() {
		return icOutput;
	}

	public void setIcOutput(String icOutput) {
		this.icOutput = icOutput;
	}

	public static IntermediateCodeWriter getInstance()
    {
    	if (singeltonInstance==null)
    	{
    		singeltonInstance=new IntermediateCodeWriter (); 
    	}
    	return singeltonInstance;
    }
}
