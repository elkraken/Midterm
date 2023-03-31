/**
 * public class Exponent raises the first number entered by the user the power
 * indicated by the second user-provided number. This class is also used to find roots.
 */
public class Exponent extends Equation {
    /**
     *
     * @param first- first number entered by user
     * @param second- second number entered by user
     */
    public Exponent(Double first, Double second) {
        super(first, second);}

    /**
     * method doCalc raises one user-provided number to the second user-provided number
     * @return - result - first raised to the power indicated by second
     */
    public Double doCalc() {
        Double result;
        result = Math.pow(first,second);
        System.out.println(result);
        return result;

    }
}

