package foundation;

public class Lesson15 {
    public static void main(String[] args) {
        System.out.println("How to use the break in Java?");
        demo();
    }

    public static void demo() {
        example0();
        example1();
    }

    private static void example0() {
        // A break statement that exits the inner loop
        System.out.println("Break statement that exits the inner loop");
        for (int i = 1; i < 4; i++) {
            System.out.println("Outer loop: " + i);
            while (true) {
                int number = (int) (Math.random() * 10);
                System.out.println("Inner loop: " + number);
                if (number == 5) {
                    break;
                }
            }
        }
    }

    public static void example1() {
        // A labeled break statement that exits the out loop
        System.out.println("Labeled break statement that exits the outer loop");
        outer: for (int i = 1; i < 4; i++) {
            System.out.println("Outer loop: " + i);
            while (true) {
                int number = (int) (Math.random() * 10);
                System.out.println("Inner loop: " + number);
                if (number == 5) {
                    break outer;
                }
            }
        }
    }

}
