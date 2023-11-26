
import java.util.Scanner;

public class FirstWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String input = String.valueOf(scanner.nextLine());

            if (input.isEmpty()) {
                scanner.close();
                break;
            }

            String firstWord = input.split(" ")[0];
            System.out.println(firstWord);
        }
    }
}
