package foundation;

public class Lesson13 {
    public static void main(String[] args) {
        // switch example before and after java 1.7
        example0(1);
        example0(0);
        example1('A');
        example1('B');
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
