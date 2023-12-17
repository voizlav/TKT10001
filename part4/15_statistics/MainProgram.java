
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Statistics statistics = new Statistics();

        System.out.println("Enter numbers: ");
        while (true) {
            int inputNumber = Integer.valueOf(scanner.nextLine());
            if (inputNumber == -1) {
                scanner.close();
                break;
            }
            statistics.addNumber(inputNumber);
        }

        System.out.println("Sum: " + statistics.sum());
    }
}
