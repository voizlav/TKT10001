
import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("end")) {
                scanner.close();
                break;
            }
            int inputNumber = Integer.valueOf(input);
            System.out.println(inputNumber * inputNumber * inputNumber);
        }
    }
}
