
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();

        while (true) {
            System.out.println("Name (empty will stop):");
            String name = scanner.nextLine();
            if (name.isEmpty()) {
                scanner.close();
                break;
            }

            System.out.println("Publication year:");
            int publicationYear = Integer.valueOf(scanner.nextLine());
            Book book = new Book(name, publicationYear);

            if (books.contains(book)) {
                System.out.println("The book is already on the list. Let's not add the same book again.");
                continue;
            }

            books.add(book);
        }

        System.out.println("Thank you! Books added: " + books.size());
    }
}
