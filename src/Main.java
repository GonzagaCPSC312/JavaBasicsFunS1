import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * this is a block comment
 * (more specifically a javadoc comment)
 */

// this is a one line comment

// every public type must be in its own file
// Main the class is in Main.java

// there are four access modifiers
// 1. public (accessible anywhere)
// 2. protected
// 3. private
// 4. package-private (omit modifier)

public class Main {
    public static final int MY_CONSTANT = 35;

    public static void main(String[] args) {
        // static means class-level (as opposed to instance-level)
        // said another way, no "this" reference
        // String[] the type of args (command line args)

        // VARIABLES
        // a variable is either a primitive or a reference
        // there are 8 primitives
        // 1. char
        char myChar = 'a';
        System.out.println("myChar: " + myChar);

        // 2. float, 3. double
        double myDouble = 3.1415;
        System.out.println("myDouble: " + myDouble);
        // 2 way to format a decimal number
        System.out.printf("%.2f\n", myDouble);
        DecimalFormat formatter = new DecimalFormat("#0.00");
        System.out.println(formatter.format(myDouble));

        // CONSTANTS
        // use MACRO_CASE by convention (camelCase for identifiers and PascalCase for types)
        System.out.println(Main.MY_CONSTANT);
        System.out.println(Math.PI);

        // 4. boolean
        boolean myBool = true; // false
        // 5. long, 6. short, 7. byte 8. int

        // STRINGS
        // a String is an object of type String
        String myString = "hello";
        // have access to attributes and member methods
        // task 1: declare 2 strings, one for your first and one for your last name
        // print out <first name> <last name> has <# of letters> letters in it
        String firstName = "gina";
        String lastName = "sprint";
        int numLetters = firstName.length() + lastName.length();
        System.out.println(firstName + " " + lastName + " has " + numLetters + " letters");
        // lots of useful methods... chartAt() toCharArray() trim() split() etc.

        // ARRAYS (and briefly, LISTS)
        // like C++ (lists are like vectors though)
        int[] myInts = {3, 4, 5, 6}; // declare and initialize at the same time
        // task 2: declare an array of 4 of your friends' names
        // print out the array (tricky), number of friends, and the last friend in the array
        System.out.println("myInts:" + myInts);

        final int NUM_FRIENDS = 4;
        String[] myFriends = new String[NUM_FRIENDS];
        myFriends[0] = "Joey";
        myFriends[1] = "Phoebe";
        myFriends[2] = "Monica";
        myFriends[3] = "Chandler";

        System.out.println(Arrays.toString(myFriends) + " " + myFriends.length + " " + myFriends[myFriends.length - 1]);

        // CONTROL FLOW
        // if/else if/else and switch are the same as C/C++
        // while/do-while/for are also the same
        // range-based for loop (for each loop)
        for (String friend : myFriends) {
            System.out.println(friend);
        }

        // task 3: print out the first 20 even numbers (all on the same line)
        // 2 4 6 ... 38 40
        for (int i = 2; i <= 40; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();

        // METHODS
        // like functions in C++
        // task 4: define/call static method that accepts two strings
        // and returns true if they have the same last character, false otherwise
        // think about special cases
        System.out.println(hasSameLastCharacter("john", "sean"));
        System.out.println(hasSameLastCharacter("john", "sam"));
        System.out.println(hasSameLastCharacter("john", null));

        // RANDOM NUMBERS
        // create an object of type Random
        Random random = new Random();
        int randInt = random.nextInt(10); // [0, 10)
        System.out.println("randInt: " + randInt);

        // USER INPUT (only for java assignments, not used for android)
        // use the Scanner class for input from keyboard (System.in) and for reading from a file
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter your favorite number: ");
        int favNum = kb.nextInt();
        kb.nextLine(); // to flush the newline out of the buffer
        System.out.println("Your favorite number: " + favNum);
        System.out.println("Enter your favorite place: ");
        String favPlace = kb.nextLine();
        System.out.println("Your favorite place: " + favPlace);
    }

    public static boolean hasSameLastCharacter(String first, String second) {
        if (first != null && second != null) { // make sure valid references
            if (first.length() > 0 && second.length() > 0) {
                if (first.charAt(first.length() - 1) == second.charAt(second.length() - 1)) {
                    return true;
                }
            }
        }
        // this method be written more concisely...
        return false;
    }
}
