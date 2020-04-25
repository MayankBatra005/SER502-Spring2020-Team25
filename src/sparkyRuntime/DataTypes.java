package sparkyRuntime;


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
			int i = (Integer)value;
			return "INTEGER";
		}
		catch(ClassCastException fu) {
			return checkBoolean();
		}
	}
	
	private String checkBoolean() {
		try {
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
	
	public Boolean Boolean() {
		return (Boolean)value;
	}
	
	public String String() {
		return (String)value;
	}
}
