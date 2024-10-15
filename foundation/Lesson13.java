package foundation;

public class Lesson13 {
    public static void main(String[] args) {
        // switch example before and after java 1.7
        example0(1);
        example0(0);
        example1('A');
        example1('B');
        example2("hm01");
        example2("bn03");
        example2("banana");
        example3(1);
        example3(2);
        example3(3);
        example3(4);
        example3(5);
        example3(6);
        example3(7);
        example3(8);
    }

    /**
     * @description: If a case label doesn't contain a break statement, code
     *               execution will fall through to the next label. Otherwise, the
     *               break statement ends the switch statement. The case labels can
     *               be coded in any sequence.
     */
    private static void example3(int dayOfWeek) {
        switch (dayOfWeek) {
            case 2, 3, 4, 5, 6 -> System.out.println("Weekday");
            case 1, 7 -> System.out.println("Weekend");
            default -> System.out.println("Invalid day");
        }
    }

    private static void example2(String productCode) {
        switch (productCode) {
            case "hm01" -> System.out.println("hm01 was pressed");
            case "bn03" -> System.out.println("bn03 was pressed");
            default -> System.out.println("Product not found!");
        }
    }

    /**
     * @description: switch syntax - switch (key) { case value: statement; break;
     *               case value: statement; break; default: statement; break; }. There is
     *               another option to write the same code in a precise way, i.e. by
     *               using switch rule as the following code is rewritten using such
     *               that and doens't need break as -> notation separates code
     *               blocks.
     * @apiNote switch statement using a character
     * @param key
     */
    private static void example1(char key) {
        switch (key) {
            case 'A' -> System.out.println("A was pressed");

            default -> System.out.println("default was pressed");
        }
    }

    /**
     * @description: switch syntax - switch (key) { case value: statement; break;
     *               case value: statement; break; default: statement; break; }
     * @apiNote switch statement using an integer
     * @param key
     */
    private static void example0(int key) {
        System.out.println("Method: example0, key = " + key);
        switch (key) {
            case 1 -> System.out.println("1 was pressed");
            default -> System.out.println("default was pressed");
        }
    }
}
