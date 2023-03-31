import java.util.ArrayList;
import java.util.Scanner;
import java.lang.Math;


/**
 * public class GetInput handles user input. It determines if the input is valid and
 * processes it accordingly.
 */

public class GetInput {
    private static Scanner input = new Scanner(System.in);
    Memorize m= new Memorize();

    /**
     * method displayLine prints a blank line.
     */
    public static void displayLine() {
        System.out.println();
    }

    /**
     *
     * @param s - a string of text
     * method displayLine prints a line of text.
     */
    public static void displayLine(String s) {
        System.out.println(s);
    }

    /**
     * method getInput prompts the user for input with a String and returns
     * the input in String form
     * @param prompt - a string that prompts user for input
     * @return i - user input
     */
    public static String getInput(String prompt) {
        System.out.println(prompt);
        String i = input.nextLine();
        return i;
    }

    /**
     * method numberTest tests for valid user input s when a number or other valid commands are expected.
     * If input in invalid, the user gets prompted to re-enter a number.
     * The valid commands are:
     * PI
     * E
     * MEM
     * HELP
     * PRINT
     * QUIT
     *
     * boolean test is set to false until the user enters a valid number
     *
     * @param x - Double value held in memory for future calculations
     * @param y - ArrayList of the log
     * @return d - user input parsed to a Double in order to do the requested calculation
     */

    public static Double numberTest(Double x, ArrayList<String> y) {

        Double d = 0.00;
        String s;

        boolean test = false;

        do {
            s = GetInput.getInput("Enter a number: ");

            if (s.equalsIgnoreCase(("PI"))) {
                d = Math.PI;
                test = true;
            } else if (s.equalsIgnoreCase("E")) {
                d = Math.exp(1);
                test = true;
            } else if (s.equalsIgnoreCase("MEM"))   {
                //need to catch exception for calculations when MEM is null
                try {
                    d= x;
                    test = true;
                }
                catch (NullPointerException e) {
                    test = false;
                }
            } else if (s.equalsIgnoreCase("HELP")) {
                Help.numberHelp();
            } else if (s.equalsIgnoreCase("PRINT")) {
                Logging.printLog(y);
                test = false;
            } else if (s.equalsIgnoreCase("QUIT")) {
                System.out.println("Exiting calculator");
                System.exit(0);

            //} else if (s.equalsIgnoreCase("MEM")) {
            //
            } else {
                try {
                    d = Double.parseDouble(s);
                    test = true;

                }
                catch (Exception e) {
                    test = false;
                }
            }

        } while (!test) ;


        return d;
    }

    /**
     * method operatorTest tests for valid operators or valid commands in user input. If the input is invalid,
     * the user is prompted again to enter an operator.
     * Valid operators ar: + , -, *, /, %, ^, |
     * Valid commands are: HELP, QUIT
     * boolean test is set to false until the user enters a valid operator
     * @return operator class Operator - the mathematical operation the user requests
     */
    public static String operatorTest() {
        String operator = "";
        boolean test = false;
        do {
            operator = GetInput.getInput("Enter the operator: ");
            if (operator.equalsIgnoreCase("HELP")) {
                Help.operatorHelp();
            } else if (operator.equalsIgnoreCase("QUIT")) {
                System.out.println("Exiting calculator");
                System.exit(0);
            } else {
                try {
                    if (operator.equals("+") ||
                            operator.equals("-") ||
                            operator.equals("*") ||
                            operator.equals("/") ||
                            operator.equals("^") ||
                            operator.equals("|") ||
                            operator.equals("%")) {
                        test = true;
                    }
                } catch (Exception e) {
                    test = false;
                }
            }
        } while (!test);
        return operator;
    }









}
