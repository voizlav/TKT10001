
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;

        System.out.println("Give a number:");
        while (true) {
            int number = Integer.valueOf(scanner.nextLine());

            if (number == -1) {
                break;
            }

            sum += number;
        }
        scanner.close();
        System.out.println("Thx! Bye!");
        System.out.println("Sum: " + sum);
}
