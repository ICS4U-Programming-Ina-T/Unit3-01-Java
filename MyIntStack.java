import java.util.Stack;

/**
 * The MyIntStack program contains an empty constructor
 * the program.
 *
 * @author  Ina Tolo
 * @version 1.0
 * @since   2022-4-26
 */

public class MyIntStack {
    // properties
    private Stack<Integer> _stack;

    /**
     * Empty constructor for the class.
     */
<<<<<<< HEAD
    public MyIntStack() { 
        _stack = new Stack<Integer>();
    }
=======
    public MyIntStack() { }
>>>>>>> ac0cfdb17d8d1132186a2694d0a35065518606e2

    /**
     * Function that adds integer to top of stack.
     *
     * @param userNumInt passed in
     */
    void stackPush(int userNumInt) {
        _stack.push(userNumInt);
        // for testing purposes only
        System.out.println("*** " + userNumInt + " added to the stack.");
    }
}
