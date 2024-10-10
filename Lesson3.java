public class Lesson3 {
    public static void main(String[] args) {
        System.out.println("How to code assignment statements and arithmetic expressesions in Java?");
        demo();
    }

    /**
     * @description An arithmetic expression consists of operands and arithmetic
     *              operators. The first five operators (+, -, *, /, %, ++, --, +,
     *              -) are called binary operators because they are used for
     *              arithmetic expressions. The last four operators (+, -, ++, --)
     *              are called unary operators because they operate on a single
     *              operand. An assignment statement consists of a variable, an
     *              equals sign, and an expression. When the assignment statement is
     *              executed, the value of the express is determined and the result
     *              is stored in the variable.
     */
    private static void demo() {
        int x = 5;
        int y = 2;
        int z = x * y;
        int z2 = x / y;
        int z3 = x % y;
        int z4 = x + y;
        int z5 = x - y;
        int z6 = x++;
        int z7 = ++x;
        int z8 = --x;
        int z9 = x--;

        double a = 5.50;
        double b = 2.40;
        double c = a * b;
        double c2 = a / b;
        double c3 = a % b;
        double c4 = a + b;
        double c5 = a - b;
        double c6 = a++;
        double c7 = ++a;
        double c8 = --a;
        double c9 = a--;

        System.out.println(x); // 5
        System.out.println(y); // 2
        System.out.println(z); // 10 (multiplies 5 by 2 then prints 10)
        System.out.println(z2); // 2 (divides 5 by 2 then prints 2)
        System.out.println(z3); // 1 (divides 5 by 2 then prints 1)
        System.out.println(z4); // 7 (adds 2 to 5 then prints 7)
        System.out.println(z5); // 3 (subtracts 2 from 5 then prints 3)
        System.out.println(z6); // 5 (prints 5 then increments to 6)
        System.out.println(z7); // 7 (increments to 7 then prints 7)
        System.out.println(z8); // 6 (decrements to 6 then prints 6)
        System.out.println(z9); // 6 (prints 6 then decrements to 5)

        System.out.println(a); // 5.5
        System.out.println(b); // 2.4
        System.out.println(c); // 13.2 (multiplies 5.5 by 2.4 then prints 13.2)
        System.out.println(c2); // 2.291666666666667 (divides 5.5 by 2.4 then prints 2.291666666666667)
        System.out.println(c3); // 0.7000000000000002 (divides 5.5 by 2.4 then prints 0.7000000000000002)
        System.out.println(c4); // 7.9 (adds 2.4 to 5.5 then prints 7.9)
        System.out.println(c5); // 3.1 (subtracts 2.4 from 5.5 then prints 3.1)
        System.out.println(c6); // 5.5 (prints 5.5 then increments to 6.5)
        System.out.println(c7); // 7.5 (increments to 7.5 then prints 7.5)
        System.out.println(c8); // 6.5 (decrements to 6.5 then prints 6.5)
        System.out.println(c9); // 6.5 (prints 6.5 then decrements to 5.5)

        // character arithmetic
        char d = 'A';
        char e = 'a';
        char f = '0';
        char g = '9';
        char letter1 = ++d;

        System.out.println(d); // A unicode integer is 65 however it is incremented to 66 therefore B is
                               // printed
        System.out.println(e); // a unicode integer is 97
        System.out.println(f); // 0 unicode integer is 48
        System.out.println(g); // 9 unicode integer is 57
        System.out.println(letter1); // B unicode integer is 66

    }
}
