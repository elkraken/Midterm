/**
 * abstract class Equation is the superclass for the following classes:
 * Addition
 * Subtraction
 * Multiplication
 * Division
 * Modulo
 * Exponent
 */

public abstract class Equation implements DoCalculable {

    public Double first = 0.00;
    public Double second = 0.00;


    /**
     *
     * @param first - first number entered by user
     * @param second - second number entered by user
     */
    public Equation(Double first, Double second) {
        this.first = first;
        this.second = second;

    }
}
