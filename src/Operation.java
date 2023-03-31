/**
 * enum Operation lists all valid operators for the calculator
 */
public enum Operation {
    ADDITION,
    SUBTRACTION,
    MULTIPLICATION,
    DIVISION,
    EXPONENT,
    ROOT,
    MODULO;

    /**
     *
     * @param OperationString - a one character String provider by the user for the operation
     *                        they wish to perform
     * @return - Operation - this is the operation that the calculator will use on
     * the two user-provided numbers
     */
    public static Operation toOperator(String OperationString) {
        Operation Operation = null;

        if (OperationString.equals("+")) {
            Operation = Operation.ADDITION;
        } else if (OperationString.equals("-")) {
            Operation = Operation.SUBTRACTION;
        } else if (OperationString.equals("*")) {
            Operation = Operation.MULTIPLICATION;
        } else if (OperationString.equals("/")) {
            Operation = Operation.DIVISION;
        } else if (OperationString.equals("^")) {
            Operation = Operation.EXPONENT;
        } else if (OperationString.equals("|")) {
            Operation = Operation.ROOT;
        } else if (OperationString.equals("%")) {
            Operation = Operation.MODULO;
        } else {
            System.out.println("Operation is incorrect");
        }
        return Operation;

    }
}
