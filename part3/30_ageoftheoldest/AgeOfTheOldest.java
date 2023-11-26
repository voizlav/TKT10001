
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int highest = 0;

        while (true) {
            String input = String.valueOf(scanner.nextLine());

            if (input.isEmpty()) {
                scanner.close();
                break;
            }

            int currentNumber = Integer.valueOf(input.split(",")[1]);

            if (currentNumber > highest) {
                highest = currentNumber;
            }
        }

        System.out.println("Age of the oldest: " + highest);
    }
}
