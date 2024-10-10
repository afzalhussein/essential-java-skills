package foundation;
public class Lesson4 {

    public static void main(String[] args) {
        System.out.println("How to use shortcut assignment operators in Java?");
        demo();
    }

    /**
     * @description A shortcut assignment operator is an operator that allows you
     *              to assign a value to a variable in one statement. It requires
     *              an equals sign followed by an expression.
     *              Shortcut assignment operators are +=, -=, *=, /=, and %=.
     *              Besides the equals sign, Java provides for the five other
     *              assignment operators shown above. these operators provide a
     *              shorthand way to code common assignment statements.
     * @apiNote Use when the same variable is on both sides of assignment
     *          operator =
     *          count = count + 1 as count += 1
     *          total = total + 100; as total += 100
     *          price = price * 0.9; as price *= 0.9
     *          sum = sum + nextSum; as sum += nextSum
     * @return void
     * @param void
     */
    private static void demo() {
        int month = 11;
        month += 1; // month = month + 1
        int month2 = month; // month2 = month, month = month - 1, month = 11, month2 = 12

        double sum = 0.0;
        double nextSum = 10.0;
        sum += 1; // sum = sum + 1
        sum += 2; // sum = sum + 2
        sum += 3; // sum = sum + 3
        sum += 4; // sum = sum + 4
        sum += nextSum; // sum = sum + nextSum
        System.out.println("Month is " + month); // 12 not short method added 1 to month
        System.out.println("Month2 is " + month2); // 12 directly assigned from month

        System.out.println("Month2 is " + month2++); // 12 note increment after assignment
        System.out.println("Month2 is " + ++month2); // 13 note increment before assignment so result is 13 + 1 = 14

        System.out.println("NextSum is " + nextSum); // 0.0 + 1.0 + 2.0 + 3.0 + 4.0 = 10.0

        System.out.println("Sum is " + sum); // 10.0 + 10.0 = 20.0
    }
}
