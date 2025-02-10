
import java.util.List;
import java.util.Date;

public class Driver {

    public static void main(String[] args) {
        // Create Admin instance
        Admin admin = new Admin();

        // Create players
        Player player1 = new Player("John", "password1", "john@example.com");
        Player player2 = new Player("Alice", "password2", "alice@example.com");
        Player player3 = new Player("Bob", "password3", "bob@example.com");
        Player player4 = new Player("Emma", "password4", "emma@example.com");
        Player player5 = new Player("James", "password5", "james@example.com");

        // Create teams
        Team team1 = new Team("Team A");
        team1.addPlayer(player1);
        team1.addPlayer(player2);
        Team team2 = new Team("Team B");
        team2.addPlayer(player3);
        team2.addPlayer(player4);
        Team team3 = new Team("Team C");
        team3.addPlayer(player5);

        // Create tournaments
        Date startDate1 = new Date();
        Date endDate1 = new Date(startDate1.getTime() + 86400000); // 1 day later
        Tournament tournament1 = admin.createTournament("Tournament 1", "Game 1", startDate1, endDate1, "Format 1");

        Date startDate2 = new Date(endDate1.getTime() + 86400000); // 1 day later
        Date endDate2 = new Date(startDate2.getTime() + 86400000); // 1 day later
        Tournament tournament2 = admin.createTournament("Tournament 2", "Game 2", startDate2, endDate2, "Format 2");

        // Add teams to tournaments
        tournament1.addParticipant(team1);
        tournament1.addParticipant(team2);
        tournament2.addParticipant(team2);
        tournament2.addParticipant(team3);

        // Generate match schedule for tournaments
        tournament1.generateMatchSchedule();
        tournament2.generateMatchSchedule();

        // Simulate multiple matches for Tournament 1
        System.out.println("Simulating matches for Tournament 1:");
        System.out.println("------------------------------------");
        simulateMatches(tournament1.getMatches(), tournament1);

        // Simulate multiple matches for Tournament 2
        System.out.println("\nSimulating matches for Tournament 2:");
        System.out.println("------------------------------------");
        simulateMatches(tournament2.getMatches(), tournament2);

        // Display leaderboards for both tournaments
        System.out.println("\nLeaderboard for Tournament 1:");
        displayLeaderboard(tournament1);

        System.out.println("\nLeaderboard for Tournament 2:");
        displayLeaderboard(tournament2);
    }

    private static void simulateMatches(List<Match> matches, Tournament tournament) {
        for (Match match : matches) {
            simulateMatch(match, tournament);
            System.out.println();
        }
    }

    private static void simulateMatch(Match match, Tournament tournament) {
        // Simulate match result
        Team team1 = match.getTeam1();
        Team team2 = match.getTeam2();
        // Simulate match result randomly
        int randomWinner = (int) (Math.random() * 2); // 0 or 1
        String winner, loser;
        if (randomWinner == 0) {
            winner = team1.getName();
            loser = team2.getName();
        } else {
            winner = team2.getName();
            loser = team1.getName();
        }
        MatchResult result = new MatchResult(winner, loser);
        match.setResult(result);

        // Update player statistics
        updatePlayerStatistics(match);

        // Display match result
        System.out.println("Match: " + team1.getName() + " vs " + team2.getName());
        System.out.println("Winner: " + winner);

        // Log match result with caster
        Caster caster = new Caster("Caster 1");
        caster.logMatchResult(match);
    }

    private static void updatePlayerStatistics(Match match) {
        MatchResult result = match.getResult();
        Team winnerTeam = result.getTeamWinner();
        Team loserTeam = result.getTeamLoser();

        // Check for null teams before accessing players
        if (winnerTeam != null && winnerTeam.getPlayers() != null) {
            for (Player player : winnerTeam.getPlayers()) {
                player.updateStatistics(true); // Increment wins
            }
        }

        if (loserTeam != null && loserTeam.getPlayers() != null) {
            for (Player player : loserTeam.getPlayers()) {
                player.updateStatistics(false); // Increment losses
            }
        }
    }

    private static void displayLeaderboard(Tournament tournament) {
        System.out.println("Leaderboard for " + tournament.getName() + ":");
        System.out.println("-----------------------------------------");
        System.out.println("Rank\tTeam Name");
        int rank = 1;
        for (Team team : tournament.getTeams()) {
            System.out.printf("%-8d%-15s\n", rank++, team.getName());
        }
    }
}