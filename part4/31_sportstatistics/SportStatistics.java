
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.Hashtable;
import java.util.Map;
import java.util.ArrayList;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Filename:");
        String fileName = scan.nextLine();
        System.out.println("Team:");
        String team = scan.nextLine();
        scan.close();

        Map<String, int[]> teams = new Hashtable<>();

        for (String[] parts : loadData(fileName)) {
            updateTeams(teams, parts);
        }

        int wins, losses;

        if (teams.containsKey(team)) {
            int[] scores = teams.get(team);
            wins = scores[0];
            losses = scores[1];
        } else {
            wins = 0;
            losses = 0;
        }

        System.out.println("Games: " + (wins + losses));
        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + losses);
    }

    private static ArrayList<String[]> loadData(String fileName) {
        ArrayList<String[]> data = new ArrayList<>();

        try (Scanner fileScanner = new Scanner(Paths.get(fileName))) {
            while (fileScanner.hasNextLine()) {
                data.add(fileScanner.nextLine().split(","));
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        return data;
    }

    private static void updateTeams(Map<String, int[]> teams, String[] parts) {
        String team1 = parts[0];
        String team2 = parts[1];
        int score1 = Integer.valueOf(parts[2]);
        int score2 = Integer.valueOf(parts[3]);

        if (!teams.containsKey(team1)) {
            teams.put(team1, new int[] { 0, 0 });
        }

        if (!teams.containsKey(team2)) {
            teams.put(team2, new int[] { 0, 0 });
        }

        int[] scores1 = teams.get(team1);
        int[] scores2 = teams.get(team2);

        if (score1 > score2) {
            scores1[0]++;
            scores2[1]++;
        } else {
            scores1[1]++;
            scores2[0]++;
        }

        teams.put(team1, scores1);
        teams.put(team2, scores2);
    }
}
