package foundation;

import java.text.NumberFormat;

public class FutureValueTableCalculator {
    public static void main(String[] args) {
        // get the currency and percent formmatters
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        NumberFormat percent = NumberFormat.getPercentInstance();
        percent.setMinimumFractionDigits(1);
        // set the montly payment to 100 and display it to the user
        double monthlyPayment = 100;
        System.out.println("Monthly payment: " + currency.format(monthlyPayment));
        System.out.println();
        // declare a variable to store the table
        String table = "               ";
        // fill the firt row of the table
        for (double rate = 5.0; rate < 7.0; rate += 0.5) {
            table += percent.format(rate / 100) + "                 ";
        }
        table += "\n";
        // loop through each row of the table
        for (int years = 4; years > 1; years--) {
            String row = years + "            ";
            // loop through each column of the table
            for (double rate = 5.0; rate < 7.0; rate += 0.5) {
                // calculate the future value for each rate
                int months = years * 12;
                double monthlyInterestRate = rate / 12 / 100;
                double futureValue = 0.0;
                for (int i = 1; i <= months; i++) {
                    futureValue = (futureValue + monthlyPayment)
                            * (1 + monthlyInterestRate);
                }
                // format and display the future value
                row += currency.format(futureValue) + "            ";
            }
            table += row + "\n";
            row = "";
        }
        System.out.println(table);
    }
}
