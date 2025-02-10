
import java.util.ArrayList;
import java.util.List;

public class Caster {
    private String name;
    private List<Match> matchesCasted;

    public Caster(String name) {
        this.name = name;
        this.matchesCasted = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public List<Match> getMatchesCasted() {
        return matchesCasted;
    }

    public void addMatchCasted(Match match) {
        matchesCasted.add(match);
    }

    public void logMatchResult(Match match) {
        System.out.println("Match result logged: " + match.getResult());
    }
}
