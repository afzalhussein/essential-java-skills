package foundation;

public class Lesson12 {

    public static void main(String[] args) {
        System.out.println("How to use if/else statement in Java?");
        demo();
    }

    private static void demo() {
        example0();
        example1();
    }

    private static void example0() {
        double discountPercent = 0.0;
        double subtotal = 100.0;
        if (subtotal > 100 && subtotal < 200) {
            discountPercent = 0.1;
        } else if (subtotal > 200) {
            discountPercent = 0.2;
        } else if (subtotal > 300) {
            discountPercent = 0.3;
        } else {
            discountPercent = 0.05;
        }
        double discountAmount = subtotal * discountPercent;
        double total = subtotal - discountAmount;
        System.out.println("subtotal: " + subtotal);
        System.out.println("discountPercent: " + discountPercent);
        System.out.println("discountAmount: " + discountAmount);
        System.out.println("total: " + total);
    }

    private static void example1() {
        double discountPercent = 0.0;
        String customerType = "R";
        double subtotal = 100.0;
        String shippingMethod;
        if (customerType.equals("R")) {
            discountPercent = 0.1;
            shippingMethod = "P";
        } else if (customerType.equals("C")) {
            discountPercent = 0.2;
            shippingMethod = "S";
        } else if (customerType.equals("I")) {
            discountPercent = 0.3;
            shippingMethod = "F";
        } else {
            discountPercent = 0.05;
            shippingMethod = "O";
        }
        double discountAmount = subtotal * discountPercent;
        double total = subtotal - discountAmount;
        System.out.println("subtotal: " + subtotal);
        System.out.println("discountPercent: " + discountPercent);
        System.out.println("discountAmount: " + discountAmount);
        System.out.println("shippingMethod: " + shippingMethod);
        System.out.println("total: " + total);
    }
}