
import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Give a string: ");
        String getString = String.valueOf(scan.nextLine());

        System.out.println("Give an integer: ");
        Integer getInt = Integer.valueOf(scan.nextLine());

        System.out.println("Give a double: ");
        Double getDouble = Double.valueOf(scan.nextLine());

        System.out.println("Give a boolean: ");
        Boolean getBool = Boolean.valueOf(scan.nextLine());

        System.out.println("You gave the string " + getString);
        System.out.println("You gave the integer " + getInt);
        System.out.println("You gave the double " + getDouble);
        System.out.println("You gave the boolean " + getBool);

        scan.close();
    }
}
