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
        // adds int to stack
        _stack.push(userNum);

        // for testing purposes only
        System.out.println("*** " + userNum + " added to the stack.");
        System.out.println();
    }

    /**
     * Function that removes integer from the stack.
     *
     * @return popValue to main
     */
    int stackPop() {
        int popValue;

        // checks if stack is empty
        if (_stack.empty()) {
            System.out.println("Stack is empty.");
            System.out.println();

            popValue = -1;
        } else {
            // removes value from top of stack
            popValue = _stack.pop();

            System.out.println("***" + " " + popValue
                + " has been removed from the stack.");
            System.out.println();
        }
        return popValue;
    }

    /**
     * Function that tells the user what is at the top of the stack.
     *
     * @return peekValue to main
     */
    int stackPeek() {
        int peekValue;

        // checks if stack is empty
        if (_stack.empty()) {
            System.out.println("Empty stack. Nothing to peek.");
            System.out.println();

            peekValue = -1;
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

            // empties stack
            _stack.clear();

            System.out.println("*** New stack = " + _stack);
            System.out.println();
        }
    }
}
