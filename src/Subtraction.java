/**
 * public class Subtraction extends Equation and subtracts one user-provided
 * number from another user-provided number
 */
public class Subtraction extends Equation {
    /**
     *
     * @param first - first number entered by user
     * @param second - second number entered by user
     */
    public Subtraction(Double first, Double second) {
        super(first, second);
    }

    /**
     * method doCalc subtracts a number (Double second) from
     * another number (Double first)
     * @return - Double result - the difference between Double first and Double second
     */
    @Override
    public Double doCalc() {
        Double result;
        result = first - second;
        System.out.println(result);
        return result;


    }
}
