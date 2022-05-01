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
     * Function that adds string to the stack.
     *
     * @param string passed in
     */
    void stackPush(String string) {
        _stack.push(string);

        // for testing purposes only
        System.out.println("*** " + string + " added to the stack.");
        System.out.println();
    }

    /**
     * Function that removes string from the stack.
     *
     * @return popValue to main
     */
    String stackPop() {
        String popValue;

        if (_stack.empty()) {
            System.out.println("Stack is empty.");
            System.out.println();

            popValue = "";
        } else {
            popValue = _stack.pop();

            System.out.println("***" + " "
                + popValue + " has been removed from the stack.");
            System.out.println();
        }
        return popValue;
    }
}
