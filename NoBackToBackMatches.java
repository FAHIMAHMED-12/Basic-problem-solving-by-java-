import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NoBackToBackMatches {
    public static void main(String[] args) {
        List<String> teams = new ArrayList<>();
        teams.add("India");
        teams.add("Pakistan");
        teams.add("Bangladesh");
        teams.add("Srilanka");
        teams.add("Afghanistan");

        generateSchedule(teams);
    }

    private static void generateSchedule(List<String> teams) {
        if (teams.size() % 2 != 0) {
            teams.add("BYE");
        }

        int totalRounds = teams.size() - 1;
        int matchesPerRound = teams.size() / 2;

        for (int round = 0; round < totalRounds; round++) {
            System.out.println("Round " + (round + 1) + ":");
            for (int match = 0; match < matchesPerRound; match++) {
                int team1Index = (round + match) % (teams.size() - 1);
                int team2Index = (teams.size() - 1 - match + round) % (teams.size() - 1);

                // Adjust for the team with the bye
                if (match == 0) {
                    team2Index = teams.size() - 1;
                }

                String team1 = teams.get(team1Index);
                String team2 = teams.get(team2Index);

                System.out.println(team1 + " vs " + team2);
            }
            System.out.println();
            // Rotate the teams in the list (except the first one)
            Collections.rotate(teams.subList(1, teams.size()), 1);
        }
    }
    
}
