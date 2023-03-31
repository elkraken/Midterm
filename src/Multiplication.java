/**
 * public class Multiplication extends Equation and multiplies
 * two numbers provided by the user
 */
public class Multiplication extends Equation {
    /**
     *
     * @param first - first number entered by user
     * @param second - second number entered by user
     */
    public Multiplication(Double first, Double second) {
        super(first, second);
    }

    /**
     * method doCalc multiplies two user-provided numbers
     * @return - Double result - the product of two user-provided numbers
     */
    public Double doCalc() {
        Double result;
        result = first * second;
        System.out.println(result);
        return result;
    }


}
