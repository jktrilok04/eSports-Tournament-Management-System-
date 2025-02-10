
public class TeamStatistics {
    private int totalWins;
    private int totalLosses;

    public TeamStatistics(int totalWins, int totalLosses) {
        this.totalWins = totalWins;
        this.totalLosses = totalLosses;
    }

    public int getTotalWins() {
        return totalWins;
    }

    public void setTotalWins(int totalWins) {
        this.totalWins = totalWins;
    }

    public int getTotalLosses() {
        return totalLosses;
    }

    public void setTotalLosses(int totalLosses) {
        this.totalLosses = totalLosses;
    }
}
