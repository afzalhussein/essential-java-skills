package foundation;

public class Lesson14 {

    public static void main(String[] args) {
        System.out.println("How to use the loops in Java?");

        demo();
    }

    public static void demo() {
        // while loop
        getFutureValueWhileLoop();

        // for loop
        getFutureValueForLoop();

        // do-while loop
        getFutureValueDoWhile();
    }

    private static void getFutureValueForLoop() {
        getNumberSequenceStringWithSingleStatement();
        
        getSum_8_6_4_2();

        getFutureValue();
    }

    private static void getSum_8_6_4_2() {
        int sum = 0;
        for (int i = 8; i > 0; i-=2) {
            sum += i;
        }
        System.out.println(sum);
    }

    private static void getNumberSequenceStringWithSingleStatement() {
        String number = "";
        for (int i = 0; i < 5; i++) {
            number += i + " ";
        }
        System.out.println(number);
    }

    private static void getFutureValue() {
        int months = 36;
        double monthlyInterestRate = 0.05;
        double futureValue = 0;
        for (int i = 1; i <= months; i++) { // for loop contains three expressions in (), first is initialization,
                                            // second is condition, third is increment
            futureValue = (futureValue + monthlyInterestRate) * (1 + monthlyInterestRate);
            System.out.println("i = " + futureValue);
        }
    }

    private static void getFutureValueDoWhile() {
        int i = 0;
        int months = 36;
        double monthlyInterestRate = 0.05;
        double futureValue = 0;
        do { // do-while loop executes at least once
            futureValue = (futureValue + monthlyInterestRate) * (1 + monthlyInterestRate);
            System.out.println("i = " + futureValue);
            i++;
        } while (i <= months);
    }

    private static void getFutureValueWhileLoop() {
        int i = 1; // variables declared inside a loop are local to that loop, therefore to retain
        int months = 36; // access to variable used inside loop, declare it outside the loop
        double monthlyInterestRate = 0.05;
        double futureValue = 0;
        while (i <= months) {
            futureValue = (futureValue + monthlyInterestRate) * (1 + monthlyInterestRate);
            System.out.println("i = " + futureValue);
            i++;
        }
    }
}
