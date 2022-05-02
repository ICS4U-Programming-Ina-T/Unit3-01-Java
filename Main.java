import java.util.Scanner;

/**
 * The Main program implements an application that
 * gets input from the user, then uses an object to
 * perform commands in a Stack.
 *
 * @author  Ina Tolo
 * @version 1.0
 * @since   2022-4-26
 */

class Main {
    /**
     * Constant for error message.
     */
    private static final String ERROR = "Not a valid choice.\n";
    /**
     * Constant for asking again message.
     */
    private static final String ASK_AGAIN = "Would you like to do something "
        + "else to the stack? (Yes or No): ";
    /**
     * Constant for PUSH.
     */
    private static final String PUSH = "PUSH";
    /**
     * Constant for POP.
     */
    private static final String POP = "POP";
    /**
     * Constant for PEEK.
     */
    private static final String PEEK = "PEEK";
    /**
     * Constant for CLEAR.
     */
    private static final String CLEAR = "CLEAR";
    /**
     * Constant for INT.
     */
    private static final String INT = "INT";
    /**
     * Constant for PUSH.
     */
    private static final String STRING = "STRING";
    /**
     * Constant for YES.
     */
    private static final String YES = "YES";
    /**
     * Constant for NO.
     */
    private static final String NO = "NO";

    /**
     * Empty constructor.
     *
     */
    Main() { }

    /**
     * Main entry into program.
     *
     * @param args nothing passed in
     */
    public static void main(String[] args) {
        // create an empy int stack
        MyIntStack myIntStack = new MyIntStack();

        // create an empty string stack
        MyStringStack myStringStack = new MyStringStack();

        // declaring variables
        final Scanner sc = new Scanner(System.in);
        String userOption1Low = "";
        String userOption2Low = "";
        String userOption3Low = "";
        String userNumString = "";
        String userOption1Up = "";
        String userOption2Up = "";
        String userOption3Up = "";
        String userCountString = "";
        String userString = "";
        int userNumInt = 0;
        int userCountInt = -1;
        int elementNum = 0;

        while (userOption2Up != INT || userOption2Up != STRING) {
            // gets users option for which stack to use
            System.out.print("Which stack would "
                + "you like to use? (Int or String): ");
            userOption2Low = sc.nextLine();

            userOption2Up = userOption2Low.toUpperCase();

            // checks if user entered valid stack option
            if (INT.equals(userOption2Up) || STRING.equals(userOption2Up)) {

                while (userOption1Up != PUSH
                    || userOption1Up != POP || userOption1Up != PEEK
                    || userOption1Up != CLEAR) {
                    // gets command input from user
                    System.out.print("Which command would you like "
                        + "to execute (push, pop, peek, or clear)?: ");
                    userOption1Low = sc.nextLine();

                    userOption1Up = userOption1Low.toUpperCase();

                    // checks which of the commands to execute
                    if (PUSH.equals(userOption1Up)) {

                        while (userCountInt < 0) {

                            // gets input for number of elements in the stack
                            System.out.print("How many elements "
                                + "would you like to add?: ");
                            userCountString = sc.nextLine();

                            try {
                                userCountInt = Integer.parseInt(
                                    userCountString);

                                if (userCountInt <= 0) {
                                    System.out.println("Not a valid "
                                        + "choice.\n");
                                    continue;
                                }

                                System.out.println();

                                // checks which stack to use
                                if (INT.equals(userOption2Up)) {
                                    while (elementNum != userCountInt) {
                                        System.out.print("Enter an integer "
                                            + "you would like to add to the "
                                            + "stack: ");
                                        userNumString = sc.nextLine();

                                        try {
                                            userNumInt =
                                                Integer.parseInt(userNumString);

                                            /* calls int stack class that
                                            holds the push function*/
                                            myIntStack.stackPush(userNumInt);

                                            // increments counter
                                            elementNum++;
                                        } catch (IllegalArgumentException
                                            exception) {
                                            System.out.println(ERROR);
                                        }
                                    }
                                    break;
                                } else if (STRING.equals(userOption2Up)) {
                                    while (elementNum != userCountInt) {
                                        System.out.print("Enter a string "
                                            + "you would like to add to "
                                            + "the stack: ");
                                        userString = sc.nextLine();

                                        /* calls int stack class that
                                        holds the push function*/
                                        myStringStack.stackPush(userString);

                                        // increments counter
                                        elementNum++;
                                    }
                                    break;
                                }
                            } catch (IllegalArgumentException exception) {
                                System.out.println(ERROR);
                            }
                        }

                        // resets counter values
                        elementNum = 0;
                        userCountInt = -1;

                        /* determines what the user would like to
                        do after previous command is finished*/
                        while (userOption3Up != YES || userOption3Up != NO) {
                            System.out.print(ASK_AGAIN);
                            userOption3Low = sc.nextLine();

                            userOption3Up = userOption3Low.toUpperCase();

                            // determines if program continues or not
                            if (YES.equals(userOption3Up)) {
                                System.out.println();
                                break;
                            } else if (NO.equals(userOption3Up)) {
                                System.exit(1);
                            } else {
                                System.out.println(ERROR);
                            }
                        }
                    } else if (POP.equals(userOption1Up)) {
                        // checks which stack to pop
                        if (INT.equals(userOption2Up)) {
                            myIntStack.stackPop();
                        } else if (STRING.equals(userOption2Up)) {
                            myStringStack.stackPop();
                        }

                        /* determines what the user would like to
                        do after previous command is finished*/
                        while (userOption3Up != YES || userOption3Up != NO) {
                            System.out.print(ASK_AGAIN);
                            userOption3Low = sc.nextLine();

                            userOption3Up = userOption3Low.toUpperCase();

                            // determines if program continues or not
                            if (YES.equals(userOption3Up)) {
                                System.out.println();
                                break;
                            } else if (NO.equals(userOption3Up)) {
                                System.exit(1);
                            } else {
                                System.out.println(ERROR);
                            }
                        }
                    } else if (PEEK.equals(userOption1Up)) {
                        // checks which stack to peek
                        if (INT.equals(userOption2Up)) {
                            myIntStack.stackPeek();
                        } else if (STRING.equals(userOption2Up)) {
                            myStringStack.stackPeek();
                        }

                        /* determines what the user would like to
                        do after previous command is finished*/
                        while (userOption3Up != YES || userOption3Up != NO) {
                            System.out.print(ASK_AGAIN);
                            userOption3Low = sc.nextLine();

                            userOption3Up = userOption3Low.toUpperCase();

                            // determines if program continues or not
                            if (YES.equals(userOption3Up)) {
                                System.out.println();
                                break;
                            } else if (NO.equals(userOption3Up)) {
                                System.exit(1);
                            } else {
                                System.out.println(ERROR);
                            }
                        }
                    } else if (CLEAR.equals(userOption1Up)) {
                        // checks which stack to clear
                        if (INT.equals(userOption2Up)) {
                            myIntStack.stackClear();
                        } else if (STRING.equals(userOption2Up)) {
                            myStringStack.stackClear();
                        }

                        /* determines what the user would like to
                        do after previous command is finished*/
                        while (userOption3Up != YES || userOption3Up != NO) {
                            System.out.print(ASK_AGAIN);
                            userOption3Low = sc.nextLine();

                            userOption3Up = userOption3Low.toUpperCase();

                            // determines if program continues or not
                            if (YES.equals(userOption3Up)) {
                                System.out.println();
                                break;
                            } else if (NO.equals(userOption3Up)) {
                                System.exit(1);
                            } else {
                                System.out.println(ERROR);
                            }
                        }
                    } else {
                        System.out.println(ERROR);
                    }
                }
            } else {
                System.out.println(ERROR);
            }
        }
    }
}
