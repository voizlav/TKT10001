
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String[]> data = new ArrayList<>();

        while (true) {
            String input = String.valueOf(scanner.nextLine());

            if (input.isEmpty()) {
                scanner.close();
                break;
            }

            data.add(input.split(","));
        }

        System.out.println("Longest name: " + getLongestName(data));
        System.out.println("Average of the birth years: " + getAverageNumber(data));
    }

    public static String getLongestName(ArrayList<String[]> data) {
        String longestName = "";

        for (String[] part : data) {
            if (part[0].length() > longestName.length()) {
                longestName = part[0];
            }
        }

        return longestName;
    }

    public static double getAverageNumber(ArrayList<String[]> data) {
        int sum = 0;

        for (String[] part : data) {
            sum += Integer.valueOf(part[1]);
        }

        return (double) sum / data.size();
    }
}
