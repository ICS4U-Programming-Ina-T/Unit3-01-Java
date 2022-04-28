import java.util.Scanner;

/**
 * The Main program implements an application that
 * performs standard Stack commands (push, pop, peek,
 * and search).
 *
 * @author  Ina Tolo
 * @version 1.0
 * @since   2022-4-26
 */

class Main {
    /**
     * Declaring constant for error message.
     */
    private static final String ERROR = "Error";

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
        String userNumString = "";
        String userCountString = "";
        String userString = "";
        int userNumInt = 0;
        int userCountInt = 0;
        int elementNum = 0;

        // gets command input from user
        System.out.print("Which command would you like "
            + "to execute (push, pop, search, or peek)?: ");
        userOption1Low = sc.nextLine();

        String userOption1Up = userOption1Low.toUpperCase();

        // checks which of the commands to execute
        if ("PUSH".equals(userOption1Up)) {

            System.out.print("How many elements would you like to add?: ");
            userCountString = sc.nextLine();

            try {
                userCountInt = Integer.parseInt(userCountString);

                System.out.print("Which stack would you like "
                    + "to use? (Int or String): ");
                userOption2Low = sc.nextLine();

                String userOption2Up = userOption2Low.toUpperCase();

                if ("INT".equals(userOption2Up)) {

                    while (elementNum != userCountInt) {
                        System.out.println();
                        System.out.print("Enter an integer you "
                            + "would like to add to the stack: ");
                        userNumString = sc.nextLine();

                        try {
                            userNumInt = Integer.parseInt(userNumString);
                            myIntStack.stackPush(userNumInt);

                            elementNum++;
                        } catch (IllegalArgumentException exception) {
                            System.out.println(ERROR);
                        }
                    }

                } else if ("STRING".equals(userOption2Up)) {
                    while (elementNum != userCountInt) {
                        System.out.println();
                        System.out.print("Enter a string you would "
                            + "like to add to the stack: ");
                        userString = sc.nextLine();

                        myStringStack.stackPush(userString);
                        elementNum++;
                    }
                } else {
                    System.out.println(ERROR);
                }
            } catch (IllegalArgumentException exception) {
                System.out.println(ERROR);
            }
        } else if ("PULL".equals(userOption1Up)) {
            // fill in later
        } else if ("SEARCH".equals(userOption1Up)) {
            // fill in later
        } else if ("PEEK".equals(userOption1Up)) {
            // fill in later
        } else {
            System.out.println(ERROR);
        }
    }
}
