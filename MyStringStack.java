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

        // checks if stack is empty
        if (_stack.empty()) {
            System.out.println("Stack is empty.");
            System.out.println();

            popValue = "";
        } else {
            // removes value from top of stack
            popValue = _stack.pop();

            System.out.println("***" + " "
                + popValue + " has been removed from the stack.");
            System.out.println();
        }
        return popValue;
    }

    /**
     * Function that tells the user what is at the top of the stack.
     *
     * @return peekValue to main
     */
    String stackPeek() {
        String peekValue;

        // checks if stack is empty
        if (_stack.empty()) {
            System.out.println("Empty stack. Nothing to peek.");
            System.out.println();

            peekValue = "";
        } else {
            // looks at top value
            peekValue = _stack.peek();

            System.out.println("**" + "* " + peekValue
                + " is on top of the stack.");
            System.out.println();
        }
        return peekValue;
    }

    /**
     * Function that removes all elements from the stack.
     */
    void stackClear() {
        // checks if stack is empty
        if (_stack.empty()) {
            System.out.println("Stack is already empty.");
            System.out.println();
        } else {
            // alerts user command is complete
            System.out.println("*** Stack has been emptied.");
            System.out.println("*** Old stack = " + _stack);

            // empties  stack
            _stack.clear();

            System.out.println("*** New stack = " + _stack);
            System.out.println();
        }
    }
}
