package foundation;

public class Lesson8 {
    public static void main(String[] args) {
        System.out.println("How to use Math class in Java?");
        /**
         * @description: You can use the static methods of the Math class to perform
         *               common arithmetic operatios. This class is part of the
         *               java.lang package. When a method requires parameters, you must include them in
         *               parentheses, separating the parameters with commas. In some cases, you need to
         *               cast the result to the data type that you want.
         */
        demo();
    }

    /**
     * @description: Common static methods in Math class:
     *               abs(number) returns double, ceil(number) returns double,
     *               floor(number) returns double, max(number, number) returns int
     *               or long or double or float, min(number, number) returns int or
     *               long or double or float, pow(number, power),
     *               random() returns double, round(floatOrDouble) returns long,
     *               sqrt(number) returns doubl
     * @apiNote: Math class is part of java.lang package.
     * @author: Syed
     * @date: 2024-10-10
     * @return: void
     * @param: void
     */
    public static void demo() {
        example0();
        example1();
        example2();
        example3();
        example4();
        example5();
    }

    private static void example5() {
        System.out.println("Math class random");
        double x = Math.random() * 100; // x will be between 0 and 100
        System.out.println("Result: " + x);
        long result = (long) x; // convert the result from doble to long
        System.out.println("Result: " + result);
    }

    private static void example4() {
        System.out.println("Math class max and min");
        int x = 67;
        int y = 23;
        int result = Math.max(x, y);
        System.out.println("Result: max 67,23 = " + result);
        int result1 = Math.min(x, y);
        System.out.println("Result1: min 67,23 = " + result1);
        int result0 = Math.max(10, 20);
        System.out.println("Result: max 20,10 = " + result0);
        int result2 = Math.min(10, 20);
        System.out.println("Result2: min 20,10 = " + result2);
    }

    private static void example3() {
        System.out.println("Math class abs");
        double result = Math.abs(-20.25);
        System.out.println("Result: -20.25 = " + result);
    }

    private static void example2() {
        System.out.println("Math class sqrt");
        double result = Math.sqrt(20.25);
        System.out.println("Result: " + result);
        double result2 = Math.sqrt(9);
        System.out.println("Result2: " + result2);
        System.out.println("Result3: 25 = " + Math.sqrt(25));
    }

    private static void example0() {
        System.out.println("Math class rounding");
        long result = Math.round(1.667);
        System.out.println("Result: " + result);
        long result2 = Math.round(1.49f);
        System.out.println("Result2: " + result2);
        System.out.println("Result3: 12.5 = " + Math.round(12.5));
    }

    private static void example1() {
        System.out.println("Math class power"); // 2^3 = 8
        double result = Math.pow(2, 2);
        System.out.println("Result: " + result);
        double Result2 = Math.pow(2, 3);
        System.out.println("Result2: " + Result2);
        double Result3 = Math.pow(5, 2);
        System.out.println("Result3: " + Result3);
        int result4 = (int) Math.pow(5, 2);
        System.out.println("Result4: " + result4);
        System.out.println("Result5: 2^3 = " + Math.pow(2, 3));
    }
}
