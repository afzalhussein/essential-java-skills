package foundation;
/**
 * @author Syed
 * @version 1.0
 * @since 2024-10-10
 * @category Lesson 2
 * @description Constants in Java
 * @apiNote A constant stores a value that never changes. Most of the skills for
 *          declaring and initializing constants are similar to variables.
 * @implNote However, you begin by declaring a constant with the final keyword.
 *           As a result, constants are sometimes called final variables. In
 *           addition, it's common convention to use all caps for constants and
 *           to separate words with underscores.
 */
public class Lesson2 {
    public static void main(String[] args) {
        System.out.println("How to declare and initialize constants in Java?");
        demo();
    }

    /**
     * @description A constant stores a value that cannot changes. Most of the
     *              skills for declaring and initializing constants are similar to
     *              variables.
     * @implNote Capitalize all of the letters in constants and separate words with
     *           underscores. Try to use meaningful names that are easy to remember
     *           as you code.
     */
    private static void demo() {
        // Syntad: final type CONSTANT_NAME = value;
        final int DAYS_IN_NOVEMBER = 30;
        final float SALES_TAX_RATE = 0.08f;
        final double LIGHT_YEAR_MILES = 9460730472580800L;

        System.out.println(DAYS_IN_NOVEMBER);
        System.out.println(SALES_TAX_RATE);
        System.out.println(LIGHT_YEAR_MILES);
    }
}
