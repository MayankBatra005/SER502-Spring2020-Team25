package sparkyRuntime;
	/**
	 * Program function reads the Intermediate code file line by line. Variables are
	 * stored in Hashmap having value of different data types. To handle this we
	 * created class Datatypes.
	 * @author Rahul Jain, Sayali Tanawade ,Mayank Batra
 	 * @since April-15-2020
 	 * @version 1.0
	 * @throws Exception
	 */



public interface RuntimeConstantKeywords {

	public static final String equal_to = "EQUAL_TO";
	public static final String INSTRUCTION_STORE = "STORE";
	public static final String INSTRUCTION_PUSH = "PUSH";
	public static final String DECLARE = "DECLARE";
	public static final String INT_DEFAULT = "0";

	public static final String GET = "GET";
	public static final String OPERATOR = "OPERATOR";
	public static final String PUSH = "PUSH";

	public static final String ADDITION = "ADD";
	public static final String SUBTRACTION = "SUBTRACT";
	public static final String MULTIPLICATION = "MULTIPLY";
	public static final String DIVSION = "DIVIDE";
	public static final String BOOLEAN = "YESNO";
	public static final String CONDITION_TRUE = "CONDITION_TRUE";

	public static final String IF_START = "IF_START";
	public static final String IF_END = "IF_END";
	public static final String ELSE_START = "ELSE_START";
	public static final String ELSE_END = "ELSE_END";
	public static final String IFTE_START = "IFTE_START";
	public static final String IFTE_END = "IFTE_END";
	public static final String CHECK_CONDITION = "CHECK_CONDITION";
	public static final String CONDITION_FALSE = "CONDITION_FALSE";
	public static final String JUMP = "JUMP";

	public static final String COMPARE_OPERATOR = "COMPARE_OPERATOR";

	public static final String FOR_START = "FOR_START";
	public static final String FOR_STOP = "FOR_STOP";
	public static final String FOR_INIT = "FOR_INIT";
	public static final String FOR_EXPRESSION = "FOR_EXPRESSION";
	public static final String FOR_CONDITION_START = "FOR_CONDITION_START";
	public static final String FOR_CONDITION_STOP = "FOR_CONDITION_STOP";
	public static final String FOR_UPDATE_START = "FOR_UPDATE_START";
	public static final String FOR_UPDATE_STOP = "FOR_UPDATE_STOP";
	public static final String FOR_VARIABLE = "FOR_VARIABLE";

	// Keywords for While
	public static final String WHILE_BEGIN = "WHILEBEGIN";
	public static final String WHILE_END = "WHILEEND";

	/*
	 * Existing keywords used for while GET , COMPARE_OPERATOR,CONDITION_NOT_TRUE,
	 * STORE, OPERATOR etc.
	 * 
	 */
	public static final String PRINT = "PRINT";
	public static final String AND_OR_OPERATOR = "AND_OR_OPERATOR";

}
