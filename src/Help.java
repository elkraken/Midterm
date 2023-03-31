/**
 * public class Help contains messages to aid the user in providing valid input.
 */
public class Help {
    /**
     * method numberHelp - when the user types 'HELP' at a prompt requesting a number,
     * this method provides a list of valid input options.
     */
    public static void numberHelp() {
        System.out.println("Enter a number or one of the following commands:\n" +
                "PI: The number pi\n" +
                "E: The number e\n" +
                "PRINT: Print the log of all calculations this session\n" +
                "MEM: To recall a saved result\n" +
                "QUIT: To exit the program\n");
    }
    /**
     * method operatorHelp - when the user types 'HELP' at a prompt requesting a operator,
     * this method provides a list of valid input options.
     */
    public static void operatorHelp() {
        System.out.println("Enter one of the following characters:\n" +
                "+  Addition\n" +
                "-  Subtraction\n" +
                "*  Multiplication\n" +
                "/  Division\n" +
                "^  Exponent    Example: 3 ^ 4  is 3 to the 4th power\n" +
                "|  Root        Example: 17 | 5 is the 5th root of 17\n");

    }
}
