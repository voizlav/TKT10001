
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sumPositiveNumbers = 0;
        int totalPositiveNumber = 0;

        while (true) {
            System.out.println("Give a number:");
            int number = Integer.valueOf(scanner.nextLine());

            if (number == 0) {
                break;
            }

            if (number < 0) {
                continue;
            }

            sumPositiveNumbers = sumPositiveNumbers + number;
            totalPositiveNumber = totalPositiveNumber + 1;
        }
        scanner.close();

        if (totalPositiveNumber == 0) {
            System.out.println("Cannot calculate the average");
        } else {
            System.out.println((double) sumPositiveNumbers / totalPositiveNumber);
        }
    }
}
