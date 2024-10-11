import java.text.NumberFormat;
import java.util.Scanner;

public class InvoiceApp {
    public static void main(String[] args) {
        final double SALES_TAX_PCT = 0.05;

        Scanner sc = new Scanner(System.in);
        String choice = "y";
        while (choice.equalsIgnoreCase("y")) {
            System.out.print("Enter subtotal:   ");
            double subtotal = sc.nextDouble();

            double discountPercent = 0;
            if (subtotal > 100) {
                discountPercent = 0.1;
            } else
                discountPercent = 0;

            double discountAmount = subtotal * discountPercent;
            double totalBeforeTax = subtotal - discountAmount;
            double salesTax = totalBeforeTax * SALES_TAX_PCT;

            double total = totalBeforeTax + salesTax;

            NumberFormat currency = NumberFormat.getCurrencyInstance();
            NumberFormat percent = NumberFormat.getPercentInstance();

            String debuString = "Unformatted: \n" + "subtotal: " + (subtotal) + "\n" +
                    "discountPercent: " + (discountPercent) + "\n" +
                    "discountAmount: " + (discountAmount) + "\n" +
                    "totalBeforeTax: " + (totalBeforeTax) + "\n" +
                    "salesTax: " + (salesTax) + "\n" +
                    "total: " + (total);

            System.out.println(debuString);

            String message = "Formatted: \n" + "Discount percent: " + percent.format(discountPercent) + "\n" +
                    "Discount amount: " + currency.format(discountAmount) + "\n" +
                    "Total before tax: " + currency.format(totalBeforeTax) + "\n" +
                    "Sales tax: " + currency.format(salesTax) + "\n" +
                    "Total: " + currency.format(total);
            System.out.println(message);

            System.out.print("Continue? (y/n): ");
            choice = sc.next();

            System.out.println();
        }
    }
}
