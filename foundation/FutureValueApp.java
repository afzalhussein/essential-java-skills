package foundation;

import java.text.NumberFormat;
import java.util.Scanner;

public class FutureValueApp {

    private static final int NUMBER_OF_MONTHS_IN_A_YEAR = 12;

    public static void main(String[] args) {
        System.out.println("Future Value App");
        try (Scanner sc = new Scanner(System.in)) { // Try-with-resources takes care of closing the scanner
            String choice = "y";
            while (choice.equalsIgnoreCase("y")) {
                // Get input from user
                System.out.print("Enter monthly investment amount: ");
                double investmentAmount = sc.nextDouble();
                System.out.print("Enter yearly interest rate:      ");
                double interestRate = sc.nextDouble();
                System.out.print("Enter number of years:           ");
                int numberOfYears = sc.nextInt();
                // Convert yearly to monthly values and initialize future value
                double monthlyInterestRate = interestRate / NUMBER_OF_MONTHS_IN_A_YEAR / 100;
                int months = numberOfYears * NUMBER_OF_MONTHS_IN_A_YEAR;
                double futureValue = 0.0;
                // Calculate future value
                for (int i = 1; i <= months; i++) {
                    futureValue = (futureValue + investmentAmount) * (1 + monthlyInterestRate);
                }
                // Display future value
                NumberFormat currency = NumberFormat.getCurrencyInstance();
                System.out.println("Future value:                    " + currency.format(futureValue));
                // Get another calculation
                System.out.println();
                System.out.print("Continue? (y/n): ");
                choice = sc.next();
                System.out.println();
            }
        }
    }
}
