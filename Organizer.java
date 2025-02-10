
import java.util.ArrayList;
import java.util.List;

public class Organizer {
    private String name;
    private List<Tournament> tournamentsOrganized;

    public Organizer(String name) {
        this.name = name;
        this.tournamentsOrganized = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public List<Tournament> getTournamentsOrganized() {
        return tournamentsOrganized;
    }

    public void addTournamentOrganized(Tournament tournament) {
        tournamentsOrganized.add(tournament);
    }
}
