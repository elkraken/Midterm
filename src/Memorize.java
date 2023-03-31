import java.util.Stack;

/**
 * public class Memorize creates a stack and handles storing
 * a result in memory at the user's request
 */
public class Memorize {
    private Double mem = null;
    Stack stack = new Stack<Double>();

    public void setMem(Double mem){
        this.mem = mem;
    }

    public Double getMem(){
        return mem;
    }

    public void setStack(Stack stack) {
        this.stack = stack;
    }

    public Stack getStack() {
        return stack;
    }

    /**
     * method storeStack adds the result of the calulation to the stack
     * @param result - Double - the result of the calculation
     */
    public void storeStack( Double result) {
        stack.push(result);
    }

    /**
     * method storeMem takes the latest result from the stack and returns it.
     * This happens when the user requests to save a result at the end of a calculation.
     * @return - Double -  the result of the latest calculation
     */
    public Double storeMem() {
        return (Double) stack.pop();

    }





}
