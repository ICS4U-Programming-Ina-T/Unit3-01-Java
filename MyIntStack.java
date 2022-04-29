import java.util.Stack;

/**
 * The MyIntStack program will perform commands
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

public class MyIntStack {
    /**
     * Stack property.
     */
    private Stack<Integer> _stack;

    /**
     * Constructor for the class.
     */
<<<<<<< HEAD
    public MyIntStack() {
        _stack = new Stack<Integer>();
    }
=======

    public MyIntStack() { 
        _stack = new Stack<Integer>();
    }

    public MyIntStack() { }
>>>>>>> 61caf47902dfa6aaa546371276ecb11c2adaff04

    /**
     * Function that adds integer to the stack.
     *
     * @param userNum passed in
     */
<<<<<<< HEAD
    void stackPush(int userNum) {
        _stack.push(userNum);
=======
    void stackPush(int userNumInt) {
        _stack.push(userNumInt);
>>>>>>> 61caf47902dfa6aaa546371276ecb11c2adaff04

        // for testing purposes only
        System.out.println("*** " + userNum + " added to the stack.");
    }
}
