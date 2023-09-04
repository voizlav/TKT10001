
import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give the first number:");
        int num1 = Integer.valueOf(scanner.nextLine());

        System.out.println("Give the second number:");
        int num2 = Integer.valueOf(scanner.nextLine());

        String output = String.format("%d + %d = %d", num1, num2, num1 + num2);
        System.out.println(output);

        output = String.format("%d - %d = %d", num1, num2, num1 - num2);
        System.out.println(output);

        output = String.format("%d * %d = %d", num1, num2, num1 * num2);
        System.out.println(output);

        output = String.format("%d / %d = %s", num1, num2, (double) num1 / num2);
        System.out.println(output);

        scanner.close();
    }
}
