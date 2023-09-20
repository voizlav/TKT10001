
import java.util.Scanner;

public class ComparingNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNum = Integer.valueOf(scanner.nextLine());
        int secondNum = Integer.valueOf(scanner.nextLine());

        if (firstNum > secondNum) {
            System.out.println(String.format("%d is greater than %d", firstNum, secondNum));
        } else if (secondNum > firstNum) {
            System.out.println(String.format("%d is smaller than %d", firstNum, secondNum));
        } else {
            System.out.println(String.format("%d is equal to %d", firstNum, secondNum));
        }

        scanner.close();
    }
}
