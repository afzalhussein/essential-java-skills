package foundation;
public class Lesson6 {
    public static void main(String[] args) {
        System.out.println("How to work with casting in Java?");
        demo();
    }

    /**
     * @description: A developer when need to convert a value from one data type to
     *               another
     *               data type, is casting. Java provides two types of casting:
     *               implicit and explicit. Implicit casts
     *               are done automatically and can be used to convert data with a
     *               less precise type to a more precise type. This is called
     *               widening conversion because the new type is always wide enough
     *               to hold the original value. Explicit casts are done manually.
     * 
     */
    public static void demo() {
        example0();
        example1();
        example2();
    }

    /**
     * @description: If you assign a less precise data type to a more precise data
     *               type, Java automatically converts the less precise data type to
     *               the more precise data type. This can be referred as an an
     *               implicit cast or a widening conversion. When you code an
     *               arithmetic express, Java implicitly casts the less precise data
     *               types to the most precise data type. To code an assignment
     *               statement that assigns a more precise data type to a less
     *               precist data type, you must use parentheses to specify the less
     *               precise data type. This can be referred to as an explicit cast
     *               or a narrowing conversion. You can also use an explicit cast in
     *               an arithmetic expression. Then, the casting is done before the
     *               arithmetic operations. Since each char value has a
     *               corresponding int value, you can implicitly or explicitly cast
     *               between these types.
     */
    private static void example2() {
        System.out.println("How to cast between char and int types in Java?");
        char letterChar = 65;
        char letterChar2 = (char) 65;
        int letterInt = 'A';
        int letterInt2 = (int) 'A';
        System.out.println("LetterChar: " + letterChar); // A
        System.out.println("LetterChar2: " + letterChar2); // A
        System.out.println("LetterInt: " + letterInt); // 65
        System.out.println("LetterInt2: " + letterInt2); // 65
    }

    /**
     * @description: Explicit casting: Casting from more precise to less precise
     *               data type. double->float->long->int->short->byte
     * @apiNote: Syntax: (Type) value/expression
     */
    private static void example1() {
        System.out.println("Explicit casting: How explicit casting works in Java?");
        @SuppressWarnings("unused")
        int grade = (int) 93.75; // converted from double to int
        double d = 95.0;
        int i = 86, j = 91;
        double average = ((int) d + i + j) / 3; // convert d to int, average shall receive int part but decimal part is
                                                // discarded
        double result = (double) i / (double) j; // result has decimal places, here i and j are converted to double
        System.out.println("Average: " + average + " %"); // 90.0
        System.out.println("Result: " + result); // 0.9454545454545454
    }

    /**
     * @description: Implicit casting: Casting from less precise to more precise
     *               data type. byte->short->int->long->float->double
     */
    private static void example0() {
        System.out.println("Implicit casting: How implicit casting works in Java?");
        double grade = 93; // converted from int to double
        double d = 95;
        int i = 86, j = 91;
        System.out.println("Average: " + (grade + d + i + j) / 4 + " %"); // converted int i and j to double
    }

}
