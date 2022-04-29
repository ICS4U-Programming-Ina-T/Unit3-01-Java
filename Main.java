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
     * Declaring constant for error message.
     */
    private static final String ERROR = "Error.";

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
        String userOption1Up = "";
        String userOption2Up = "";
        String userCountString = "";
        String userString = "";
        int userNumInt = 0;
        int userCountInt = 0;
        int elementNum = 0;

        // gets command input from user
        System.out.print("Which command would you like "
            + "to execute (push, pop, search, or peek)?: ");
        userOption1Low = sc.nextLine();

        userOption1Up = userOption1Low.toUpperCase();

        // checks which of the commands to execute
        if ("PUSH".equals(userOption1Up)) {

            while (userCountInt <= 1) {

                // gets input for number of elements in the stack
                System.out.print("How many elements would you like to add?: ");
                userCountString = sc.nextLine();

                try {
                    userCountInt = Integer.parseInt(userCountString);
                    
                    if (userCountInt <= 0) {
                        System.out.println("Error.");
                        continue;
                    }

                    while (userOption2Up != "INT" || userOption2Up != "STRING") {
                        
                        // gets users option for which stack to use
                        System.out.print("Which stack would you like "
                            + "to use? (Int or String): ");
                        userOption2Low = sc.nextLine();

                        userOption2Up = userOption2Low.toUpperCase();

                        // checks which stack to use
                        if ("INT".equals(userOption2Up)) {
                            while (elementNum != userCountInt) {
                                System.out.println();
                                System.out.print("Enter an integer you "
                                    + "would like to add to the stack: ");
                                userNumString = sc.nextLine();

                                try {
                                    userNumInt = Integer.parseInt(userNumString);
    
                                    // calls int stack class that hold the push function
                                    myIntStack.stackPush(userNumInt);

                                    // increments counter
                                    elementNum++;
                                } catch (IllegalArgumentException exception) {
                                    System.out.println(ERROR);
                                }
                            }
                            break;

                        } else if ("STRING".equals(userOption2Up)) {
                            while (elementNum != userCountInt) {
                                System.out.println();
                                System.out.print("Enter a string you would "
                                    + "like to add to the stack: ");
                                userString = sc.nextLine();

                                // calls int stack class that hold the push function
                                myStringStack.stackPush(userString);

                                // increments counter
                                elementNum++;
                            }
                            break;
                        } else {
                            System.out.println(ERROR);
                        }
                    }
                } catch (IllegalArgumentException exception) {
                    System.out.println(ERROR);
                }
            }
        } else if ("POP".equals(userOption1Up)) {
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
