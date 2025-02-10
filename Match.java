
import java.util.Date;

public class Match {
    private Team team1;
    private Team team2;
    private Date date;
    private MatchResult result;

    public Match(Team team1, Team team2, Date date) {
        this.team1 = team1;
        this.team2 = team2;
        this.date = date;
    }

    public Team getTeam1() {
        return team1;
    }

    public Team getTeam2() {
        return team2;
    }

    public Date getDate() {
        return date;
    }

    public MatchResult getResult() {
        return result;
    }

    public void setResult(MatchResult result) {
        this.result = result;
    }
}
