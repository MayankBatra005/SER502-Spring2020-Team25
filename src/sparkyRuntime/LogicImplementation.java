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

		System.out.println("Inside declare ");

	}

	public void whileEndLogic() {

		System.out.println("Inside WHILEEND ");

	}

	public void forStopLogic() {

		System.out.println("Inside FOR_STOP ");

	}
	// public void ifEndLogic() {
	//
	// System.out.println("Inside IF_END ");
	//
	// }

	public void whileBeginLogic() {

		System.out.println("Inside WHILEBEGIN ");

	}

	public void jumpLogic() {

		System.out.println("Inside JUMP ");

	}

	public void storeLogic() {
		System.out.println("Inside store ");
	}

	public void pushLogic() {
		System.out.println("Inside push ");
	}

	public void getLogic() {
		System.out.println("Inside get");
	}

	public void whileLogic() {
		System.out.println("Inside while ");
	}

	public void forLogic() {
		System.out.println("Inside for");
	}

	public void ifThenElseLogic() {
		System.out.println("Inside if then else IF_START");
	}

	public void printLogic() {
		System.out.println("Inside print ");
	}

	public void compareOperatorLogic() {
		System.out.println("Inside COMPARE_OPERATOR ");
	}

	public void andOrOperatorLogic() {
		System.out.println("Inside AND_OR_OPERATOR ");
	}

	public void conditionFalseLogic() {
		System.out.println("Inside CONDITION_FALSE ");
	}

	public void operatorLogic() {
		System.out.println("Inside OPERATOR ");
	}

	public void ifEndLogic() {
		System.out.println("Inside IF_END ");
	}

	public void elseStartLogic() {
		System.out.println("Inside ELSE_START  ");
	}

	public void elseEndLogic() {
		System.out.println("Inside ELSE_END ");
	}

	public void ifthenElseEndLogic() {
		System.out.println("Inside IFTE_END  ");
	}

}
