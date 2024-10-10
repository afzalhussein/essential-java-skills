package foundation;

/**
 * @author Syed
 * @version 1.0
 * @since 2024-10-10
 * @category Lesson 1
 * @description Variables and Data Types: A variable stores a value that can
 *              change at run time. You must declare data type and initialize
 *              it. As default values it's common to initialize integer
 *              variables to 0, floating-point to 0.0, and boolean variables to
 *              false. To clare and initialize more than one variable for a
 *              single data type in a single statement, use commas to separate
 *              the assignments. To identify float values, you must type f or F
 *              after the number. To identify long values, you must type an l or
 *              L after the number.
 * @apiNote Start variable names with a lowercase letter and capitalize the
 *          first letter in all words after the first word. Try to use
 *          meaningful names that are easy to remember as you code.
 * @implNote Use the System.out.println() method to print to the console. The
 *           use of underscores in numbers is for readability was introduced in
 *           Java 7.
 */
class Lesson1 {
    public static void main(String[] args) {
        System.out.println("How to declare and initialize variables in Java?");

        demo();
    }

    /**
     * @return void
     * @param void
     */
    private static void demo() {
        int counter; // declare a variable
        counter = 1; // assign a value
        double price = 9.99; // declare and assign
        float interestRate = 0.08f; // f for float
        long numberOfBytes = 1000000000L;// L for long
        int population = 1743323; // declaration and initial value
        int population2 = 1_743_323; // _ for grouping digits for readability
        double distance = 3.65e+9; // e for exponent
        char letter = 65; // 65 is the code for 'A'
        char letter2 = 'A';
        boolean valid = false; // false is a keyword
        int x = 0, y = 0, z = 0; // initialize multiple variables

        System.out.println("Counter is " + counter);
        System.out.println("Price is " + price);
        System.out.println("Interest rate is " + interestRate);
        System.out.println("Number of bytes is " + numberOfBytes);
        System.out.println("Population is " + population);
        System.out.println("Population2 is " + population2);
        System.out.println("Distance is " + distance);
        System.out.println("Letter is " + letter);
        System.out.println("Letter2 is " + letter2);
        System.out.println("Valid is " + valid);
        System.out.println("X is " + x);
        System.out.println("Y is " + y);
        System.out.println("Z is " + z);

        System.out.println("Done");
    }
}