
import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter username: ");
        String username = String.valueOf(scanner.nextLine());
        System.out.print("Enter password: ");
        String password = String.valueOf(scanner.nextLine());
        scanner.close();

        if (username.equals("emma") && password.equals("haskell")
                || username.equals("alex") && password.equals("sunshine")) {
            System.out.println("You have successfully logged in!");
        } else {
            System.out.println("Incorrect username or password!");
        }
    }
}
