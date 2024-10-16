package foundation;

public class Lesson9 {
    public static void main(String[] args) {
        System.out.println("How to use the Integer and Double classes in Java?");
        /**
         * @description: The Integer and Double classes are known as wrapper classeses
         *               since they can be used to construct Integer and Double objects
         *               that contain (wrap around) int and double values. This can be
         *               useful when you need to pass an int or double value to a method
         *               that only accepts objects, not primitive data types. The
         *               Integer and Double classes also provide static methods that you
         *               can use for converting values from these data types to strings
         *               and vice versa. If the parseInt and parseDouble methods can't
         *               successfully parse the string, they will cause an error to
         *               occur. In Java terminology, this is known as a throwing an
         *               exception. So you handle or catch exception. Every primitive
         *               type has a wrapper class that works like the Integer and Double
         *               Classes.
         */
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

        stringToDouble();
        doubleToString();

    }

    private static void doubleToString() {
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
        try {
            System.out.println("Double:" + Double.valueOf("123.abc"));
        } catch (NumberFormatException e) {
            System.out.println("Error: " + e);
        }
    }

    private static void integerToString() {
        System.out.println("Integer to String class");
        int quantity4 = 123;
        System.out.println("Quantity4: " + Integer.toString(quantity4)); // "123"
    }

    private static void getPriceDoubleObjectConstructor() {
        System.out.println("Constructor usage - deprecated");
        // Integer quantityIntegerObject = new Integer(123); // deprecated
        Integer quantityIntegerObject = 123;
        System.out.println("quantityIntegerObject: " + quantityIntegerObject);
        // Double priceDoubleObject = new Double(123.45); // deprecated
        Double priceDoubleObject = 123.45;
        System.out.println("priceDoubleObject: " + priceDoubleObject);
    }

    private static void stringToInteger() {
        System.out.println("String to integer conversion");
        Integer quantity = Integer.valueOf("123"); // 123
        Integer quantity2 = Integer.valueOf("123"); // 123
        Integer quantity3 = Integer.valueOf("0123"); // 123
        System.out.println("quantity: " + quantity);
        System.out.println("quantity2: " + quantity2);
        System.out.println("quantity3: " + quantity3);
    }
}
