import java.text.NumberFormat;
import java.util.Scanner;

public class Mortage {
    public static void main(String[] args) {
        final byte Months_in_year = 12;
        final byte Percentage = 100;

        Scanner scan = new Scanner(System.in);

        System.out.print("Principle: ");
        int principle = scan.nextInt();

        System.out.print("Annual interest Rate: ");
        float annualInterest = scan.nextFloat();
        float monthlyInterest = annualInterest / Percentage / Months_in_year;

        System.out.print("Period (Year): ");
        byte years = scan.nextByte();
        int numberOfPayments = years * Months_in_year;

        double mortage = principle * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments)
        /(Math.pow(1 + monthlyInterest, numberOfPayments)));

        String mortageFormatted = NumberFormat.getCurrencyInstance().format(mortage);
        System.out.println("mortage" + mortageFormatted);
    }
}
