
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Where to? ");
        int end = Integer.valueOf(scanner.nextLine());

        System.out.println("Where from? ");
        int start = Integer.valueOf(scanner.nextLine());

        scanner.close();

        for (; start <= end; start++) {
            System.out.println(start);
        }
    }
}
