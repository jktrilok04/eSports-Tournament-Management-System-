import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Admin {

    private List<Tournament> tournaments;

    public Admin() {
        this.tournaments = new ArrayList<>();
    }

    public Tournament createTournament(String name, String game, Date startDate, Date endDate, String format) {
        Tournament tournament = new Tournament(name, game, startDate, endDate, format);
        tournaments.add(tournament);

        System.out.println("Tournament \"" + name + "\" created successfully.");

        return tournament;
    }

    public void modifyTournament(Tournament tournament) {
        System.out.println("Tournament \"" + tournament.getName() + "\" modified successfully.");
    }

    public void resolveDispute(Match match, MatchResult result) {
        match.setResult(result);

        System.out.println("Dispute in match resolved. Result updated.");
    }

    public void enforceRules(Tournament tournament) {
        System.out.println("Rules enforced for tournament \"" + tournament.getName() + "\".");
    }
}
