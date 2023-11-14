
import java.util.ArrayList;
import java.util.Scanner;

public class FirstAndTheLast {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> list = new ArrayList<>();
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                scanner.close();
                break;
            }

            list.add(input);
        }

        System.out.println(list.get(0));
        System.out.println(list.get(list.size() - 1));
    }
}
