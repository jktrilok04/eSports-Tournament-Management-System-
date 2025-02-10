
import java.util.ArrayList;
import java.util.List;

public class Team {
    private String name;
    private List<Player> players;

    public Team(String name) {
        this.name = name;
        this.players = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    public void addPlayer(Player player) {
        players.add(player);
    }

    public void removePlayer(Player player) {
        players.remove(player);
    }

    public void addPlayersToTeam(List<Player> players) {
        this.players.addAll(players);
    }

    public TeamStatistics calculateTeamStatistics() {
        int totalWins = 0;
        int totalLosses = 0;
        for (Player player : players) {
            totalWins += player.getWins();
            totalLosses += player.getLosses();
        }
        return new TeamStatistics(totalWins, totalLosses);
    }
}
