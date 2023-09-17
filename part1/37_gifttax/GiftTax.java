
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Value of the gift?");
        int value = Integer.valueOf(scan.nextLine());
        scan.close();

        if (value >= 1000000) {
            double result = calcTax(142100, value, 1000000, 0.17);
            System.out.println("Tax: " + result);
        } else if (value >= 200000) {
            double result = calcTax(22100, value, 200000, 0.15);
            System.out.println("Tax: " + result);
        } else if (value >= 55000) {
            double result = calcTax(4700, value, 55000, 0.12);
            System.out.println("Tax: " + result);
        } else if (value >= 25000) {
            double result = calcTax(1700, value, 25000, 0.10);
            System.out.println("Tax: " + result);
        } else if (value > 5000) {
            double result = calcTax(100, value, 5000, 0.08);
            System.out.println("Tax: " + result);
        } else {
            System.out.println("No tax!");
        }
    }

    private static double calcTax(int lower_limit, int value, int gift, double tax_rate) {
        return (lower_limit + (value - gift) * tax_rate);
    }
}
