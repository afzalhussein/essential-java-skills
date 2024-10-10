import java.text.NumberFormat;

public class Lesson7 {
    public static void main(String[] args) {
        System.out.println("How to use Java classes for working with data types in Java?");
        demo();
    }

    public static void demo() {
        /**
         * @description: The NumberFormat class is used to format numbers in Java. It's
         *               part of java.text package. Three static methodsare:
         *               getCurrencyInstance(), getPercentInstance(),
         *               getNumberInstance(), getPercentString(), and getNumberFormat().
         *               Three methods of NumberFormat object: format(anyNumberType)
         *               returns string, setMinimumFractionDigits(int) sets the minimum
         *               number of decimal places, and setMaximumFractionDigits(int)
         *               sets the maximum number of decimal places.
         * @apiNote: When you use the format method of a NumberFormat object, the
         *           numbers are automatically rounded using a technique called
         *           half-even. This technique rounds if the preceding digit is odd, but
         *           rounds down if the preceding digit is even. For example, 3.455 is
         *           rounded to 3.46, and 3.445 is rounded to 3.44. This may cause problem in 
         *           some applications.
         */
        example0();
    }

    private static void example0() {
        System.out.println("How to use NumberFormat class in Java?");
        getCurrency();

        getPercentFormat();

        getNumberFormat();

        getPercentString();
    }

    private static void getPercentString() {
        double majority = 0.505;
        System.out.println("Two NumberFormat methods that are coded in one statement");
        String percentString = NumberFormat.getPercentInstance().format(majority);
        System.out.println(percentString);// 50%
    }

    private static void getNumberFormat() {
        System.out.println("Number with one decimal place format");
        double miles = 15341.253;
        NumberFormat numberFormat = NumberFormat.getInstance();
        numberFormat.setMaximumFractionDigits(1);
        System.out.println(numberFormat.format(miles));
    }

    private static void getPercentFormat() {
        System.out.println("Percent format");
        double majority = 0.505;
        NumberFormat percentFormat = NumberFormat.getPercentInstance();
        System.out.println(percentFormat.format(majority));
    }

    private static void getCurrency() {
        System.out.println("Currency format");
        double price = 11.575;
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        System.out.println(currency.format(price));
    }
}
