import java.util.Stack;

/**
 * The MyStringStack program will perform commands
 * used in Stack (push, pop, etc.)
 *
 * @author  Ina Tolo
 * @version 1.0
 * @since   2022-4-26
 */

public class MyStringStack {
    // properties
    private Stack<String> _stack;

    /**
     * Empty constructor for the class.
     */
    public MyStringStack() {
        _stack = new Stack<String>();
    }
    
    /**
     * Function that adds string to top of stack.
     *
     * @param userString passed in
     */
    void stackPush(String userString) {
        _stack.push(userString);

        // for testing purposes only
        System.out.println("*** " + userString + " added to the stack.");
    }
}
