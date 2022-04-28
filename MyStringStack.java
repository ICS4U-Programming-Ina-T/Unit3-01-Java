import java.util.Stack;

/**
 * The MyStringStack program contains an empty constructor
 * the program.
 *
 * @author  Ina Tolo
 * @version 1.0
 * @since   2022-4-26
 */

<<<<<<< HEAD
public class MyStringStack {
    // properties
    private Stack<String> _stack;

    /**
     * Empty constructor for the class.
     */
    public MyStringStack() {
        _stack = new Stack<String>();
    }
    
=======
class MyStringStack {
    /**
     * Empty constructor for the class.
     */
    public MyStringStack() { }

>>>>>>> ac0cfdb17d8d1132186a2694d0a35065518606e2
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
