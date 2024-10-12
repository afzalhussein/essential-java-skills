package foundation;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Lesson10 {
    public static void main(String[] args) {
        System.out.println("How to use BigDecimal in Java?");
        /**
         * @description: BigDecimal class provides a way to perform accurate decimal
         *               calculations in Java. It also provides a way to store numbers
         *               with more than 16 significant digits.
         */
        demo();
    }

    private static void demo() {
        /**
         * @description: BigDecimal is a class that can be used to solve two types of
         *               problems that are associated with floating-point numbers.
         *               It's part of java.math package. First, the BigDecimal class can
         *               be used to exactly represent decimal numbers. Second, it can be
         *               used to work with numbers that have more then 16 significant
         *               digits.
         * @apiNote: The constructor and methods accept an int, double, long, or string
         *           argument and create a BigDecimal object. Because floating-point
         *           nubers are limited to 16 significant digits and because these
         *           numbers don't always represent numbers exactly, it's often best to
         *           create Big?Decimal objects from strings. Because the BigDecimal
         *           methods are most useful in business applications, the BigDecimal
         *           allows add, subtract, multiply, and divide methods to be used to
         *           perform these operations. And the toString method can be used to
         *           convert a BigDecimal object to a string. setScale method lets you
         *           set
         *           the number of digits to the right of the decimal point as well as
         *           the rounding mode.
         */

        example0(); // from double and how to set scale and rounding mode
        example1(); // from integer
        example2(); // from string
        example3(); // from double
        example4(); // how to use BigDecimal's add, subtract, multiply, and divide
    }

    private static void example4() {
        // BigDecimal's add, subtract, multiply, and divide
        System.out.println("BigDecimal's add, subtract, multiply, and divide");
        BigDecimal salesTax = new BigDecimal(0.05);
        System.out.println("Sales tax: " + salesTax.setScale(3, RoundingMode.HALF_UP));
        BigDecimal totalTax = salesTax.add(salesTax); // add salesTax
        System.out.println("Total tax: " + totalTax.setScale(2, RoundingMode.HALF_UP));
        BigDecimal total = totalTax.add(new BigDecimal(100.00)).setScale(2, RoundingMode.HALF_UP); // add 100.00
        System.out.println("Total: " + total);
        BigDecimal total2 = totalTax.add(new BigDecimal(100.00)).divide(new BigDecimal(2))
                .setScale(3, RoundingMode.HALF_UP); // divide by 3 and round up
        System.out.println("Total2: " + total2);
        BigDecimal total3 = totalTax.add(new BigDecimal(100.00)).multiply(new BigDecimal(2)); // multiply by 2
        System.out.println("Total3: " + total3.setScale(5, RoundingMode.HALF_UP));
        roundingModeEnumeration(totalTax);
    }

    private static void roundingModeEnumeration(BigDecimal totalTax) {
        BigDecimal total4 = totalTax.add(new BigDecimal(100.00))
                .divide(new BigDecimal(2), 2, RoundingMode.HALF_UP); // divide by 2 and round up towards the nearest
                                                                     // neighbor unless both neighbors are equidistant,
                                                                     // then round up.
        System.out.println("Total4: " + total4);
        BigDecimal total5 = totalTax.add(new BigDecimal(100.00))
                .subtract(new BigDecimal(2)); // subtract 2
        System.out.println("Total5: " + total5.setScale(10, RoundingMode.HALF_EVEN)); // round towards the nearest
                                                                                      // neighbor unless both neighbors
                                                                                      // are equidistant, then round
                                                                                      // towards the even number
    }

    private static void example3() {
        // create a BigDecimal object from long
        System.out.println("Create a BigDecimal object from long");
        long longValue = 1234567890123456789L;
        BigDecimal salesTax = new BigDecimal(longValue);
        System.out.println("Sales tax: " + salesTax);
    }

    private static void example2() {
        // create a BigDecimal object from string
        System.out.println("Create a BigDecimal object from string");
        String stringValue = "0.05";
        BigDecimal salesTax = new BigDecimal(stringValue);
        System.out.println("Sales tax: " + salesTax);
    }

    private static void example1() {
        // create a BigDecimal object from integer
        System.out.println("Create a BigDecimal object from integer");
        int intValue = 5;
        BigDecimal salesTax = new BigDecimal(intValue);
        System.out.println("Sales tax: " + salesTax);
    }

    /**
     * @description Create a BigDecimal object and set the number of digits to the
     *              right of the decimal point as well as the rounding mode. Here
     *              Enumeration used to set the rounding mode. The scale and
     *              rounding mode work the same for divide method. However, this
     *              need to be imported like java.math.RoundingMode.HALF_UP.
     * @apiNote: BigDecimal class is part of java.math package.
     */
    private static void example0() {
        // salesTax = salesTax.setScale(2, RoundingMode.HALF_UP);
        System.out.println(
                "Create a BigDecimal object from double and set the number " +
                        "of digits to the right of the decimal point as well as the" +
                        " rounding mode");
        double doubleTax = 0.05d;
        BigDecimal salesTax = new BigDecimal(doubleTax);
        salesTax = salesTax.setScale(2, RoundingMode.HALF_UP);
        System.out.println("Sales tax: " + salesTax);
    }
}