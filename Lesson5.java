public class Lesson5 {
    public static void main(String[] args) {
        System.out.println("How to work with the order of precedence in Java?");
        demo();
    }

    /**
     * @description The order of precedence for arithmetic operators in Java is as
     *              follows:
     *              1. Increment and decrement
     *              2. Positive and negative
     *              3. Multiplication and division and modulus
     *              4. Addition and subtraction
     *              Unless parentheses are used, the operations in an express take
     *              place from left to right in teh order of precedence. To specify
     *              the sequence of operations, you can use parenthesis. Then, the
     *              operations in the innermost sets of parentheses are done first,
     *              followed by the operations in the next sets, and so on. When you
     *              usen an increment or decrement operator as a prefix to a
     *              variable, the variable is incremented or decremented and then
     *              result is assigned. But when you use an increment or decrement
     *              operator as a postfix to a variable, the result is assigned and
     *              then the variable is incremented or decremented.
     */
    private static void demo() {
        example0();

        example1();

        example2();

        example3();

        example4();
    }

    private static void example0() {
        // 5000 + 100 * (1 + 0.12 / 12) order of precedence in Java are controlled by
        // parentheses. The following example are showing steps controlled by
        // parentheses in order of precedence. To get a difficult calculation you need
        // to break it down into steps.

        System.out.println("Step by step example how parenthesis control order of precedence in Java. Step");
        System.out.println("Step 1: (5000 + 100) * (1 + (.12 / 12)) to get " + (5000 + 100) * (1 + (.12 / 12)));
        System.out.println("Steop 2: (5000 + 100) * (1 + .01) to get " + (5000 + 100) * (1 + .01));
        System.out.println("Step 3: (5000 + 100) * 1.01 is " + (5000 + 100) * 1.01);
        System.out.println("Result:  " + 5151.0);
    }

    private static void example1() {
        double discountPercent = 0.2; // 20%
        double price = 100.0;
        double noPrecedencePrice = price * 1 - discountPercent;
        double precedencePrice = price * (1 - discountPercent);
        System.out.println("Code that calculates a discounted price");
        System.out.println("discountPercent = " + discountPercent); // 0.2
        System.out.println("noPrecedencePrice: price * 1 - discountPercent = " + noPrecedencePrice);// 99.8
        System.out.println("precedencePrice: price * (1 - discountPercent) = " + precedencePrice); // 80.0
    }

    private static void example2() {
        System.out.println("Code that calculates the current value of a monthly investment");
        double currentValue = 5000.0;
        double monthlyInvestment = 100.0;
        double yearlyIntereestRate = 0.12;
        currentValue = (currentValue + monthlyInvestment) * (1 + (yearlyIntereestRate / 12));
        System.out.println("currentValue = " + currentValue);
    }

    private static void example3() {
        System.out.println("Code that calculates the current value of a monthly investment without using parentheses");
        double currentValue = 5000.0;
        double monthlyInvestment = 100.0;
        double yearlyIntereestRate = 0.12;

        currentValue += monthlyInvestment;
        double monthlyInterestRate = yearlyIntereestRate / 12;
        double monthlyInterest = currentValue * monthlyInterestRate;
        currentValue += monthlyInterest;
        System.out.println("currentValue = " + currentValue);
    }

    private static void example4() {
        System.out.println("Prefixed and postfixed increment and decrement oeprators");
        int a = 5;
        System.out.println("a = " + a); // 5
        int b = 5;
        System.out.println("b = " + b); // 5
        int y = ++a;
        int z = b++;
        System.out.println("y: ++a = " + y); // 6
        System.out.println("z: b++ = " + z); // 5
    }
}
