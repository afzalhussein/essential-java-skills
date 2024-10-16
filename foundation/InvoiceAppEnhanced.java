package foundation;
import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Scanner;

public class InvoiceAppEnhanced {
    public static void main(String[] args) {
        System.out.println("Invoice App Enhanced");
        InvoiceAppEnhanced.invoiceApp();
    }

    /**
     * @description: In this version, the console prompts the user for two inputs:
     *               customer type and subtotal. If the user enters "R" or "C" for
     *               the customer type, the discount percent changes depending on
     *               the value of the subtotal. For example the customer type is
     *               'R', and the subtotal is greater than or equal to 250, the
     *               discount percent is .2. Or, if the customer type is "C" and the
     *               subtotal is less than 250, the discount percent is .2. The
     *               conditions are coded in a logical order. This arrangement
     *               allows to cover all possible subtotals from the smallest to the
     *               largest.
     */
    public static void invoiceApp() {
        try (Scanner sc = new Scanner(System.in)) {
            String choice = "y";
            while (choice.equalsIgnoreCase("y")) {
                String customerType = getCustomerType(sc);
                double subtotal = getSubtotal(sc);
                double discountPercent = getDiscountPercent(customerType, subtotal);
                // Convert subtotal and discountPercent to BigDecimal
                BigDecimal decimalDiscountPercent = new BigDecimal(discountPercent);
                // Calculate discount amount
                BigDecimal decimalSubTotal = new BigDecimal(subtotal);
                BigDecimal discountAmount = decimalSubTotal.multiply(decimalDiscountPercent);
                BigDecimal totalBeforeTax = decimalSubTotal.subtract(discountAmount);
                BigDecimal salesTaxPercent = new BigDecimal(0.05);
                BigDecimal salesTax = totalBeforeTax.multiply(salesTaxPercent);
                BigDecimal total = totalBeforeTax.add(salesTax);
                
                printInvoice(decimalDiscountPercent, discountAmount, totalBeforeTax, salesTaxPercent, salesTax, total);
                System.out.print("Continue? ");
                choice = getChoice(sc);
            }
        }
    }

    private static double getSubtotal(Scanner sc) {
        System.out.print("Enter subtotal: ");
        double subtotal = sc.nextDouble();
        return subtotal;
    }

    private static String getCustomerType(Scanner sc) {
        System.out.print("Enter customer type (r/c): ");
        String customerType = sc.next();
        return customerType;
    }

    private static String getChoice(Scanner sc) {
        String choice;
        choice = sc.next();
        while (choice.equalsIgnoreCase("y") == false && choice.equalsIgnoreCase("n") == false) {
            System.out.print("Enter y or n: ");
            choice = sc.next();
        }
        return choice;
    }

    private static void printInvoice(BigDecimal decimalDiscountPercent, BigDecimal discountAmount,
            BigDecimal totalBeforeTax, BigDecimal salesTaxPercent,
            BigDecimal salesTax, BigDecimal total) {
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        NumberFormat percent = NumberFormat.getPercentInstance();
        System.out.println("Discount percent:  " + percent.format(decimalDiscountPercent));
        System.out.println("Discount amount:   " + currency.format(discountAmount));
        System.out.println("Total before tax:  " + currency.format(totalBeforeTax));
        System.out.println("Sales tax percent: " + percent.format(salesTaxPercent));
        System.out.println("Sales tax:         " + currency.format(salesTax));
        System.out.println("Total:             " + currency.format(total));
    }

    private static double getDiscountPercent(String customerType, double subtotal) {
        double discountPercent;
        if (customerType.equalsIgnoreCase("r")) {
            if (subtotal < 100) {
                discountPercent = 0.0;
            } else if (subtotal >= 100 && subtotal < 250) {
                discountPercent = 0.1;
            } else {
                discountPercent = 0.2;
            }
        } else if (customerType.equalsIgnoreCase("c")) {
            if (subtotal < 250) {
                discountPercent = 0.2;
            } else {
                discountPercent = 0.3;
            }
        } else
            discountPercent = 0.1;
        return discountPercent;
    }
}
