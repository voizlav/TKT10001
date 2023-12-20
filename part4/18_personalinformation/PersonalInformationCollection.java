
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalInformationCollection {

    public static void main(String[] args) {
        // implement here your program that uses the PersonalInformation class

        ArrayList<PersonalInformation> infoCollection = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("First name: ");
            String firstName = scanner.nextLine();
            if (firstName.isEmpty()) {
                scanner.close();
                break;
            }
            System.out.print("Last name: ");
            String lastName = scanner.nextLine();

            System.out.print("Identification number: ");
            String Id = scanner.nextLine();

            infoCollection.add(new PersonalInformation(firstName, lastName, Id));
        }
        System.out.println();

        for (PersonalInformation info : infoCollection) {
            String firstName = info.getFirstName();
            String lastName = info.getLastName();
            System.out.println(String.format("%s %s", firstName, lastName));
        }
    }
}
