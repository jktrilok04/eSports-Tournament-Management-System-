
import java.util.ArrayList;
import java.util.List;

public class Leaderboard {
    private List<Player> players;

    public Leaderboard() {
        this.players = new ArrayList<>();
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void updateStandings() {
        players.sort((p1, p2) -> Integer.compare(p2.getWins(), p1.getWins())); // Sort by wins in descending order
    }

    public void displayLeaderboard() {
        System.out.println("Leaderboard:");
        System.out.println("-----------");
        System.out.println("Username \t Wins \t Losses");
        for (Player player : players) {
            System.out.println(player.getUsername() + "\t\t" + player.getWins() + "\t\t" + player.getLosses());
        }
    }

    public void addPlayer(Player player) {
        players.add(player);
    }
}
