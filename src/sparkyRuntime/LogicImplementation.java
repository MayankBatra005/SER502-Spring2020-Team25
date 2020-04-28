/**
 * 
 */
package sparkyRuntime;

import java.util.HashMap;
import java.util.Stack;

/**
 * @author Mayank Batra
 *
 *         Singleton pattern implemented to avoid any corruption of data
 */
public class LogicImplementation {

	public static LogicImplementation singeltonInstance;

	private LogicImplementation() {
	}

	public static LogicImplementation getInstance() {
		if (singeltonInstance == null) {
			singeltonInstance = new LogicImplementation();
		}
		return singeltonInstance;
	}

	HashMap<String, DataTypes> map = new HashMap<String, DataTypes>();
	Stack<DataTypes> local = new Stack<DataTypes>();
	Stack<String> forVariable = new Stack<String>();
	int counter = 0;
	Stack<String> whileVariable = new Stack<String>();

	public void declareLogic() {

	}

	public void storeLogic() {

	}

	public void getLogic() {

	}

	public void whileLogic() {

	}

	public void forLogic() {

	}

	public void ifThenElseLogic() {

	}

}
