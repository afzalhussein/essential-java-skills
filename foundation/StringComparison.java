package foundation;

import java.util.Scanner;

public class StringComparison {
    public static void main(String[] args) {
        /**
         * @description: String comparison, there are two methods - equals(string)
         *               compares case sensitive
         *               and equalsIgnoreCase(string) compares case insensitive.
         */
        example0();
        example1();
    }

    private static void example1() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter string 1: ");
        String str1 = sc.nextLine();
        System.out.println("Enter string 2: ");
        String str2 = sc.nextLine();
        System.out.println("Case sensitive comparison: " + str1 + "->  " + str2 + " = " + str1.equals(str2));
        System.out
                .println("Case insensitive comparison: " + str1 + "->  " + str2 + " = " + str1.equalsIgnoreCase(str2));

        if (str1 == str2) {
            System.out.println("Case equality comparison: " + str1 + "->  " + str2 + " = " + (str1 == str2));
        }
        System.out.println("Case inquality comparison: " + str1 + "->  " + str2 + " != " + (str1 != str2));
        sc.close();
    }

    /**
     * @description: Expressions that compare two string values
     * @apiNote: String class is part of java.lang package. Use equals(string) and
     *           equalsIgnoreCase(string) to compare two string values. For null
     *           values use == and != as equals or ignoreCase will return false even
     *           if the value is null
     */
    private static void example0() {
        System.out.println("How to compare two string values in Java?");
        String firstName = "Fred";
        String otherName = "fred";
        System.out.println(
                "Case sensitive comparison: " + firstName + "->  " + otherName + " = " + firstName.equals(otherName));
        System.out.println("Case insensitive comparison: " + firstName + "->  " + otherName + " = "
                + firstName.equalsIgnoreCase(otherName));
        System.out.println("Compared with empty string: " + firstName + "-> \"\"  = " + firstName.equals(("")));
        System.out.println("Compared with null using equals: " + firstName + "-> null  = " + firstName.equals(null));
        System.out.println("Compared with null using equalsIgnoreCase: " + firstName + "-> null  = "
                + firstName.equalsIgnoreCase(null));

        System.out.println("Compared with null using ==: " + firstName + "-> null  = " + (firstName == null));
        System.out.println("Compared with null using !=: " + firstName + "-> null  = " + (firstName != null));

    }
}
