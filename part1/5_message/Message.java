import java.util.Scanner;

public class Message {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write a message:");
        String msg = scanner.nextLine();
        System.out.println(msg);
        scanner.close();
    }
}