
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = null;
        int highest = 0;

        while (true) {
            String input = String.valueOf(scanner.nextLine());

            if (input.isEmpty()) {
                scanner.close();
                break;
            }

            String[] nameAndAge = input.split(",");
            int age = Integer.valueOf(nameAndAge[1]);

            if (age > highest) {
                highest = age;
                name = nameAndAge[0];
            }
        }

        System.out.println("Name of the oldest: " + name);
    }
}
