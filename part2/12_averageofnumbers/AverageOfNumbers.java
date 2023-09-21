
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalNums = 0;
        int totalSum = 0;

        while (true) {
            System.out.println("Give a number:");
            int number = Integer.valueOf(scanner.nextLine());

            if (number == 0) {
                break;
            }

            totalNums = totalNums + 1;
            totalSum = totalSum + number;
        }
        scanner.close();

        double averageNum = 0;

        if (totalNums != 0) {
            averageNum = (double) totalSum / totalNums;
        }
        System.out.println("Average of the numbers: " + averageNum);
    }
}
