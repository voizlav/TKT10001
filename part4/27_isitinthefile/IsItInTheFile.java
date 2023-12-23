
import java.nio.file.Paths;
import java.util.Scanner;

public class IsItInTheFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Name of the file:");
        String file = scanner.nextLine();
        System.out.println("Search for:");
        String searchedFor = scanner.nextLine();
        Boolean isFound = false;
        scanner.close();

        try (Scanner fileScanner = new Scanner(Paths.get(file))) {
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                if (line.contains(searchedFor)) {
                    isFound = true;
                    break;
                }
            }
        } catch (Exception e) {
            String err = String.format("Reading the file %s failed.", file);
            System.out.println(err);
            return;
        }

        if (isFound) {
            System.out.println("Found!");
        } else {
            System.out.println("Not found.");
        }
    }
}
