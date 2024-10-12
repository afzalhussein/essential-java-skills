package foundation;

public class Lesson11 {

    public static void main(String[] args) {
        System.out.println("How to use logical operators in Java?");
        demo();
    }

    private static void demo() {
        /**
         * @description: Logical operators in Java are used to combine boolean values
         *               to produce a single boolean value.
         * @apiNote: Logical operators are &&, ||, &, |, and !
         */
        float subtotal = 100.0f;
        int timeInService = 3;
        if (subtotal >= 100.0f && timeInService >= 3) {
            System.out.println("Discount applied");
        } else {
            System.out.println("No discount applied");
        }
        boolean valid = false;
        if (!valid) {
            System.out.println("Invalid");
        }

        if (subtotal != 90 || timeInService == 3) {
            System.out.println("Discount applied for 90 and 3");
        }
    }
}
