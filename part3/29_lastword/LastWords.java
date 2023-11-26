
import java.util.Scanner;

public class LastWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String input = String.valueOf(scanner.nextLine());

            if (input.isEmpty()) {
                scanner.close();
                break;
            }

            String[] parts = input.split(" ");
            String lastWord = parts[parts.length - 1];
            System.out.println(lastWord);
        }
    }
}
