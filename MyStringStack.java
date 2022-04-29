import java.util.Stack;

/**
 * The MyStringStack program will perform commands
 * used in Stack (push, pop, etc.).
 *
 * @author  Ina Tolo
 * @version 1.0
 * @since   2022-4-26
 */

public class MyStringStack {
    /**
     * Stack property.
     */
    private Stack<String> _stack;

    /**
     * Constructor for the class.
     */
    public MyStringStack() {
        _stack = new Stack<String>();
    }

    /**
     * Function that adds string to top of stack.
     *
     * @param string passed in
     */
    void stackPush(String string) {
        _stack.push(string);

        // for testing purposes only
        System.out.println("*** " + string + " added to the stack.");
    }
}
