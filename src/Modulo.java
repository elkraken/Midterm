/**
 * public class Modulo extends Equation and finds the remainder when two
 * user-provided numbers are divded
 */
public class Modulo extends Equation {
    /**
     *
     *@param first - first number entered by user
     * @param second - second number entered by user
     */
    public Modulo(Double first, Double second) {
        super(first, second);
    }

    /**
     * method doCalc calculates first modulo second
     * @return - Double - result - the result of the calculation
     */
    @Override
    public Double doCalc() {
        Double result;
        result = first % second;
        System.out.println("The result is: " + Double.toString(result));
        return result;
    }

}