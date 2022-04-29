import java.util.Stack;

/**
 * The MyStringStack program will perform commands
<<<<<<< HEAD
 * used in Stack (push, pop, etc.).
=======
 * used in Stack (push, pop, etc.)
>>>>>>> 61caf47902dfa6aaa546371276ecb11c2adaff04
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
<<<<<<< HEAD

=======
    
>>>>>>> 61caf47902dfa6aaa546371276ecb11c2adaff04
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
