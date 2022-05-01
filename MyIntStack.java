import java.util.Stack;

/**
 * The MyIntStack program will perform commands
 * used in Stack (push, pop, etc.).
 *
 * @author  Ina Tolo
 * @version 1.0
 * @since   2022-4-26
 */

public class MyIntStack {
    /**
     * Stack property.
     */
    private Stack<Integer> _stack;

    /**
     * Constructor for the class.
     */
    public MyIntStack() {
        _stack = new Stack<Integer>();
    }

    /**
     * Function that adds integer to the stack.
     *
     * @param userNum passed in
     */
    void stackPush(int userNum) {
        _stack.push(userNum);

        // for testing purposes only
        System.out.println("*** " + userNum + " added to the stack.");
        System.out.println();
    }
    
    int stackPop() {
        if (_stack.empty()) {
            System.out.println("Stack is empty");

            return -1;
        } else {
            int popValue = _stack.pop();

            System.out.println("*** " + popValue + " has been removed from the stack.");

            return popValue;
        }
    } 
}
