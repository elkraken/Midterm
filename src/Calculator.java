import java.util.ArrayList;

/**
 * @author -- Laura MacCracken
 * @since -- 2023/03/29
 * class Calculator contains the main method which calls methods to handle user input and do calculations. The calculator
 * includes addition , subtraction, multiplication, division, modulo division, and exponents/roots.
 * Be able to type PI to use Math.PI as a number.
 * Give prompt for the input, ex. Enter a first number (or a commnd), Enter a First Number: Enter a operator: , Enter a second number:
 * 	-will be read in as a string, and then converted to double
 * 	Basic HELP functionality supported
 * 	 Create and use an Enum
 *   - Allow e as numeric input
 *   - Type MEM to retrieve a saved number
 *   - Keep a log of operations and type PRINT to output log.
 *    - Type SAVE to save a result. More Credit : Save to a Stack and / or Queue data type structures
 *     - Stack (LIFO) and Queue(FIFO first in first out)
 */
public class Calculator {
/*

    -----Requirements still needed------
    - Full JavaDocs Full Documentation - Class, methods, every parameter (name, data type etc,) documented
    - Good regular comments
    - Descriptive & correctly cased variable & constants (if needed)

*/

    /**
     * method main gets user input and uses an enum (Operation) and an if..else if.. else to do the correct calculation.
     * main also holds logging information, the stack, and the value for mem( a result saved by the user).
     * @param args String array which takes keyboard parameters after the prgram name separated by spaces.No paramenters
     *             are necessary to run this programs.
     */

    public static void main(String[] args) {

        GetInput.displayLine("Hi! Let's Calculate!");
        GetInput.displayLine("Enter HELP for assistance");

        //initialize variables
        String choice = "y";
        Double result = 0.00;
        Double valueMem = null;
        ArrayList<String> log = new ArrayList<String>(20);
        Memorize stack = new Memorize();



        while (choice.equalsIgnoreCase("y")) {

            //prompts for an interprets firstString
            Double first = GetInput.numberTest(valueMem, log);

            //get operator and go to enum
            String operator = GetInput.operatorTest();
            Operation op;
            op = Operation.toOperator(operator);

            //prompts for and interprets secondString
            Double second = GetInput.numberTest(valueMem,log);


            //Based on operation, do the appropriate calculation
            if (op.equals(Operation.ADDITION)) {
                Addition query = new Addition(first, second);
                result = query.doCalc();

            } else if (op.equals(Operation.SUBTRACTION)) {
                Subtraction query = new Subtraction(first, second);
                result = query.doCalc();

            } else if (op.equals(Operation.MULTIPLICATION)) {
                Multiplication query = new Multiplication(first, second);
                result = query.doCalc();

            } else if (op.equals(Operation.DIVISION)) {
                Division query = new Division(first, second);
                result = query.doCalc();

            } else if (op.equals(Operation.EXPONENT)) {
                Exponent query = new Exponent(first, second);
                result = query.doCalc();

            } else if (op.equals(Operation.ROOT)) {
                Exponent query = new Exponent(first, 1 / second);
                result = query.doCalc();

            } else if (op.equals(Operation.MODULO)) {
                Modulo query = new Modulo(first, second);
                result = query.doCalc();

            } else {
                System.out.println("That input is not valid. Please try again.");
            }

            //add the result to the stack
            stack.storeStack(result);


            //add timestamp, equation, and value in memory to log
            try {
                log.add(Logging.getTimestamp() + "     " + Logging.addEquation(first, operator, second, result, valueMem));
            }
            //catches if there is no value for valueMem because user has not yet saved a result to memory
            catch(NullPointerException e) {
                log.add(Logging.getTimestamp() + "     " + Logging.addEquation(first, operator, second, result));
            }



            //Prompts user to save result in memory for future use
            String saveResult = GetInput.getInput("Would you like to save this result? y/n:");
            if (saveResult.equalsIgnoreCase("y")) {
                valueMem = stack.storeMem();
                System.out.println(valueMem);
            }
            //check if user wishes to do another calculation
            choice = GetInput.getInput("Continue?  y/n: ");

        }

        //end program
        GetInput.displayLine("Bye!");
    }

}





