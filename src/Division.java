/**
 *public class Division extends Equation and divides two user-provided numbers
 */
public class Division extends Equation {
    /**
     *
     * @param first - first number entered by user
     * @param second - second number entered by user
     */
    public Division(Double first, Double second) {
        super(first, second);
    }

    /**
     *
     * @return - result - the quotient of first divided by second
     */
    @Override
    public Double doCalc() {
        Double result;
        result = first / second;
        System.out.println(result);
        return result;
    }
}
