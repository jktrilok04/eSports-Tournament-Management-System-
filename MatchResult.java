public class MatchResult {
    private Team teamWinner;
    private Team teamLoser;
    private String playerWinner;
    private String playerLoser;

    public MatchResult(Team teamWinner, Team teamLoser, String playerWinner, String playerLoser) {
        this.teamWinner = teamWinner;
        this.teamLoser = teamLoser;
        this.playerWinner = playerWinner;
        this.playerLoser = playerLoser;
    }

    public MatchResult(String playerWinner, String playerLoser) {
        this.playerWinner = playerWinner;
        this.playerLoser = playerLoser;
    }

    public Team getTeamWinner() {
        return teamWinner;
    }

    public void setTeamWinner(Team teamWinner) {
        this.teamWinner = teamWinner;
    }

    public Team getTeamLoser() {
        return teamLoser;
    }

    public void setTeamLoser(Team teamLoser) {
        this.teamLoser = teamLoser;
    }

    public String getPlayerWinner() {
        return playerWinner;
    }

    public void setPlayerWinner(String playerWinner) {
        this.playerWinner = playerWinner;
    }

    public String getPlayerLoser() {
        return playerLoser;
    }

    public void setPlayerLoser(String playerLoser) {
        this.playerLoser = playerLoser;
    }
}
