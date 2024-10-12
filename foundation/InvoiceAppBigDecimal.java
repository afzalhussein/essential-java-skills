package foundation;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.NumberFormat;
import java.util.Scanner;

public class InvoiceAppBigDecimal {
    /**
     * InvoiceApp with BigDecimal
     * 
     * @description: All of the result values are stored as BigDecimal, and all the
     *               results ahave two decimal places that have been rounded
     *               correctly when needed. Once the results have been calculated,
     *               you can use the NumberFormat methods to format the results
     *               without fear of a rounding error. However, the methods of
     *               NumberFormat object limits to 16 significant digits.
     */

    public static void main(String[] args) {
        final double SALES_TAX_PCT = 0.05;

        try (Scanner sc = new Scanner(System.in)) {
            String choice = "y";
            while (choice.equalsIgnoreCase("y")) {
                System.out.print("Enter subtotal: ");
                double subtotal = sc.nextDouble();
                // Convert subtotal and discountPercent to BigDecimal
                BigDecimal decimalSubTotal = getDecimalSubTotal(subtotal);
                BigDecimal decimalDiscountPercent = getDecimalDiscountPercent(subtotal);
                // Calculate discount amount
                BigDecimal discountAmount = getDiscountAmount(decimalSubTotal, decimalDiscountPercent);
                // Calculate tax
                BigDecimal totalBeforeTax = decimalSubTotal.subtract(discountAmount);
                BigDecimal salesTaxPercent = new BigDecimal(SALES_TAX_PCT);
                BigDecimal salesTax = getSalesTax(totalBeforeTax, salesTaxPercent);
                BigDecimal total = totalBeforeTax.add(salesTax);

                NumberFormat currency = NumberFormat.getCurrencyInstance();
                NumberFormat percent = NumberFormat.getPercentInstance();

                getDebuString(decimalSubTotal, decimalDiscountPercent, discountAmount, totalBeforeTax, salesTax, total);

                getFormattedString(decimalSubTotal, decimalDiscountPercent, discountAmount, totalBeforeTax, salesTax,
                        total, currency, percent);
                System.out.print("Continue? ");
                choice = sc.next();
                while (choice.equalsIgnoreCase("y") == false && choice.equalsIgnoreCase("n") == false) {
                    System.out.print("Enter y or n: ");
                    choice = sc.next();
                }
                System.out.println();
            }
        }
    }

    private static BigDecimal getDecimalDiscountPercent(double subtotal) {
        double discountPercent = getDiscountPercent(subtotal);
        BigDecimal decimalDiscountPercent = new BigDecimal(discountPercent);
        return decimalDiscountPercent;
    }

    private static BigDecimal getSalesTax(BigDecimal totalBeforeTax, BigDecimal salesTaxPercent) {
        BigDecimal salesTax = totalBeforeTax.multiply(salesTaxPercent); // multiplication is same in both
                                                                        // directions
        salesTax = salesTax.setScale(2, RoundingMode.HALF_UP);
        return salesTax;
    }

    private static BigDecimal getDiscountAmount(BigDecimal decimalSubTotal, BigDecimal decimalDiscountPercent) {
        BigDecimal discountAmount = decimalSubTotal.multiply(decimalDiscountPercent);
        discountAmount = discountAmount.setScale(2, RoundingMode.HALF_UP);
        return discountAmount;
    }

    private static BigDecimal getDecimalSubTotal(double subtotal) {
        BigDecimal decimalSubTotal = new BigDecimal(Double.toString(subtotal));// convert double to BigDecimal
        decimalSubTotal = decimalSubTotal.setScale(2, RoundingMode.HALF_UP);
        return decimalSubTotal;
    }

    private static void getFormattedString(BigDecimal decimalSubTotal, BigDecimal decimalDiscountPercent,
            BigDecimal discountAmount, BigDecimal totalBeforeTax, BigDecimal salesTax, BigDecimal total,
            NumberFormat currency, NumberFormat percent) {
        String formattedString = "Formatted: \n" + "subtotal: " + (currency.format(decimalSubTotal)) + "\n" +
                "discountPercent: " + (percent.format(decimalDiscountPercent)) + "\n" +
                "discountAmount: " + (currency.format(discountAmount)) + "\n" +
                "totalBeforeTax: " + (currency.format(totalBeforeTax)) + "\n" +
                "salesTax: " + (currency.format(salesTax)) + "\n" +
                "total: " + (currency.format(total));
        System.out.println(formattedString);
    }

    private static void getDebuString(BigDecimal decimalSubTotal, BigDecimal decimalDiscountPercent,
            BigDecimal discountAmount,
            BigDecimal totalBeforeTax, BigDecimal salesTax, BigDecimal total) {
        String debuString = "Unformatted: \n" + "subtotal: " + (decimalSubTotal) + "\n" +
                "discountPercent: " + (decimalDiscountPercent) + "\n" +
                "discountAmount: " + (discountAmount) + "\n" +
                "totalBeforeTax: " + (totalBeforeTax) + "\n" +
                "salesTax: " + (salesTax) + "\n" +
                "total: " + (total);
        System.out.println(debuString);
    }

    private static double getDiscountPercent(double subtotal) {
        double discountPercent = 0;
        if (subtotal > 100) {
            discountPercent = 0.1;
        } else
            discountPercent = 0;
        return discountPercent;
    }
}
