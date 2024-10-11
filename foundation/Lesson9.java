package foundation;

public class Lesson9 {
    public static void main(String[] args) {
        System.out.println("How to use the Integer and Double classes in Java?");

        demo();
    }

    private static void demo() {
        /**
         * @description: You can use the Integer and Double classes to perform
         *               common arithmetic operations. These class constructors and
         *               static methods are called factory methods. Since these
         *               classes can be used to create objects that wrap around
         *               the primitive types, they're sometims called wrappers. The
         *               wrapper classes exist for the other six primitive types.
         * 
         * @apiNote: Integer and Double classes are part of java.lang package.
         */
        example0();
    }

    private static void example0() {
        System.out.println("How to create Integer and Double objects in Java?");
        // @description: Constructor usage - deprecated
        getPriceDoubleObjectConstructor();

        System.out.println("Two static methods of Integer class");

        stringToInteger();

        integerToString();

        System.out.println("Two static methods of Double class");

        doubleToDouble();

        stringToDouble();

    }

    private static void doubleToDouble() {
        System.out.println("Double to String class");
        double quantity5 = 123.45;
        String quantity5String = Double.toString(quantity5); // "123.45"
        System.out.println("quantity5String: " + quantity5String);
    }

    private static void stringToDouble() {
        System.out.println("String to Double class");
        double price = Double.parseDouble("123"); // 123
        System.out.println("Double:" + price);
        double price2 = Double.parseDouble("123.45"); // 123.45
        System.out.println("Double:" + price2);
    }

    private static void integerToString() {
        System.out.println("Integer to String class");
        int quantity4 = 123;
        System.out.println("Quantity4: " + Integer.toString(quantity4)); // "123"
    }

    private static void getPriceDoubleObjectConstructor() {
        System.out.println("Constructor usage - deprecated");
        @SuppressWarnings("deprecation")
        Integer quantityIntegerObject = new Integer(123); // 123 deprecated
        System.out.println("quantityIntegerObject: " + quantityIntegerObject);
        @SuppressWarnings("deprecation")
        Double priceDoubleObject = new Double(123.45); // 123.45 deprecated
        System.out.println("priceDoubleObject: " + priceDoubleObject);
    }

    private static void stringToInteger() {
        System.out.println("String to integer conversion");
        Integer quantity = Integer.parseInt("123"); // 123
        Integer quantity2 = Integer.parseInt("123"); // 123
        Integer quantity3 = Integer.parseInt("0123"); // 123
        System.out.println("quantity: " + quantity);
        System.out.println("quantity2: " + quantity2);
        System.out.println("quantity3: " + quantity3);
    }
}
