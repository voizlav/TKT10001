
import java.util.Scanner;

public class MultiplicationFormula {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Give the first number:");
        Integer num1 = Integer.valueOf(scanner.nextLine());

        System.out.println("Give the second number:");
        Integer num2 = Integer.valueOf(scanner.nextLine());

        String output = String.format("%d * %d = %d", num1, num2, num1 * num2);
        System.out.println(output);

        scanner.close();
    }
}
