
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Statistics statsAll = new Statistics();
        Statistics statsEven = new Statistics();
        Statistics statsOdd = new Statistics();

        System.out.println("Enter numbers: ");
        while (true) {
            int inputNumber = Integer.valueOf(scanner.nextLine());
            if (inputNumber == -1) {
                scanner.close();
                break;
            }
            statsAll.addNumber(inputNumber);

            if (inputNumber % 2 == 0) {
                statsEven.addNumber(inputNumber);
            } else {
                statsOdd.addNumber(inputNumber);
            }
        }

        System.out.println("Sum: " + statsAll.sum());
        System.out.println("Sum of even numbers: " + statsEven.sum());
        System.out.println("Sum of odd numbers: " + statsOdd.sum());
    }
}
