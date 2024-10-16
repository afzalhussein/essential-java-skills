package foundation;

public class Lesson16 {
    public static void main(String[] args) {
        System.out.println("How to use the continue in Java?");
        demo();
    }

    private static void demo() {
        continueToBeginning();
        continueToLabeled();
    }

    private static void continueToBeginning() {
        // A continue statement that jumps to the beginning of a loop
        System.out.println("Continue statement that jumps to the beginning of a loop");
        for (int i = 1; i < 4; i++) {
            int number = (int) (Math.random() * 10);
            System.out.println(number);
            if (number == 5) {
                System.out.println("This number is equal to 5");
                continue;
            }
        }
    }

    private static void continueToLabeled() {
        // A continue statement that jumpst to labelled statement
        System.out.println("Continue statement that jumps to labelled statement");
        outer: for (int i = 1; i < 4; i++) {
            for (int j = 2; j < i - 1; j++) {
                int remainder = i % j;
                if (remainder == 0) {
                    System.out.println(i + " is not a prime number");
                    continue outer;
                }
            }
            System.out.println(i);
        }
    }
}
