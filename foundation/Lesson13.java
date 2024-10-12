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

    private static void example3(int dayOfWeek) {
        switch(dayOfWeek) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Weekday");
                break;
            case 1:
            case 7:
                System.out.println("Weekend");
                break;
            default:
                System.out.println("Invalid day");
                break;
        }
    }

    private static void example2(String productCode) {
        switch (productCode) {
            case "hm01":
                System.out.println("hm01 was pressed");
                break;
            case "bn03":
                System.out.println("bn03 was pressed");
                break;
            default:
                System.out.println("Product not found!");
                break;
        }
    }

    /**
     * @description: switch syntax - switch (key) { case value: statement; break;
     *               case
     *               value: statement; break; default: statement; break; }
     * @apiNote switch statement using a character
     * @param key
     */
    private static void example1(char key) {
        switch (key) {
            case 'A':
                System.out.println("A was pressed");
                break;

            default:
                System.out.println("default was pressed");
                break;
        }
    }

    /**
     * @description: switch syntax - switch (key) { case value: statement; break;
     *               case
     *               value: statement; break; default: statement; break; }
     * @apiNote switch statement using an integer
     * @param key
     */
    private static void example0(int key) {
        switch (key) {
            case 1:
                System.out.println("1 was pressed");
                break;
            default:
                System.out.println("default was pressed");
                break;
        }
    }
}
