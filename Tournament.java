
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Tournament {
    private String name;
    private String game;
    private Date startDate;
    private Date endDate;
    private String format;
    private List<Player> participants;
    private List<Match> matches;
    private List<Team> teams;

    public Tournament(String name, String game, Date startDate, Date endDate, String format) {
        this.name = name;
        this.game = game;
        this.startDate = startDate;
        this.endDate = endDate;
        this.format = format;
        this.participants = new ArrayList<>();
        this.matches = new ArrayList<>();
        this.teams = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGame() {
        return game;
    }

    public void setGame(String game) {
        this.game = game;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public List<Player> getParticipants() {
        return participants;
    }

    public void addParticipant(Player players) {
        participants.add(players);
    }

    public void addParticipant(Team team) {
        teams.add(team);
    }

    public void removeParticipant(Player player) {
        participants.remove(player);
    }

    public List<Match> getMatches() {
        return matches;
    }

    public List<Team> getTeams() {
        return teams;
    }

    public void addMatch(Match match) {
        matches.add(match);
    }

    public void removeMatch(Match match) {
        matches.remove(match);
    }

    public void generateMatchSchedule() {
        int numTeams = teams.size();

        // Handle cases where there are not enough teams for a round-robin tournament
        if (numTeams < 2) {
            System.out.println("Error: Not enough teams to generate a schedule. Minimum 2 teams required.");
            return;
        }

        // Create a round-robin schedule for the teams
        for (int round = 0; round < numTeams - 1; round++) {
            for (int i = 0; i < numTeams / 2; i++) {
                int team1Index = (i + round) % numTeams;
                int team2Index = (numTeams - 1 - i + round) % numTeams;

                Team team1 = teams.get(team1Index);
                Team team2 = teams.get(team2Index);

                // Create a match between the two teams
                Match match = new Match(team1, team2, new Date()); // Assuming you want the date to be set during match
                                                                   // creation
                matches.add(match);
            }
        }

        System.out.println("Match schedule generated successfully.");
    }

    public void reportMatchResult(Match match, MatchResult result) {
        // Set the result of the match
        match.setResult(result);

        System.out.println(
                "Match result reported for: " + match.getTeam1().getName() + " vs " + match.getTeam2().getName());
    }

}
