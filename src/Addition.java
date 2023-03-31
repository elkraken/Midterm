/**
 * public class Addition extends Equation and adds two numbers provided by user
 */

public class Addition extends Equation {
    /**
     *
     * @param first - first number entered by user
     * @param second - second number entered by user
     */

    public Addition(Double first, Double second) {
        super(first, second);
    }

    /**
     * method doCalc adds two user provided numbers
     * @return - result - the sum of first and second
     */

    @Override
    public Double doCalc() {
        Double result;
        result = first + second;
        System.out.println(result);
        return result;
    }

}
