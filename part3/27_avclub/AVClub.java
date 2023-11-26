
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String input = String.valueOf(scanner.nextLine());

            if (input.isEmpty()) {
                scanner.close();
                break;
            }

            for (String part : input.split(" ")) {
                if (part.contains("av")) {
                    System.out.println(part);
                }
            }
        }
    }
}
