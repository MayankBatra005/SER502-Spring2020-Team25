package sparkyRuntime;

/**
 * Purpose of this class is to store variable values as an object.
 * @author Rahul Jain
 * @since April-15-2020
 * @version 1.0
 */
public class DataTypes {
	
	Object value;
	DataTypes(Object value){
		this.value = value;
	}
	
	public String toString() {
		return String.valueOf(value);
	}
	
	public String checkDataType() {
		try {
			@SuppressWarnings("unused")
			int i =(Integer)value;
			return "int";
		}
		catch(ClassCastException fu) {
			return checkDouble();
		}
	}
	
	private String checkDouble() {
		try {
			@SuppressWarnings("unused")
			Double i = (Double)value;
			return "double";
		}
		catch(ClassCastException fu) {
			return checkBoolean();
		}
	}

	private String checkBoolean() {
		try {
			@SuppressWarnings("unused")
			Boolean bo = (Boolean)value;
			return "BOOLEAN";
		}
		catch(ClassCastException fu) {
			return "STRING";
		}
	}
	
	public int Integer() {
		return (Integer)value;
	}
	
	public double Double() {
		return (Double)value;
	}
	
	public Boolean Boolean() {
		return (Boolean)value;
	}
	
	public String String() {
		return (String)value;
	}
}
