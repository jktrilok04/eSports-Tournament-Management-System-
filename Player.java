
public class Player {
    private String username;
    private String password;
    private String email;
    private int wins;
    private int losses;

    public Player(String username, String password, String email) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.wins = 0;
        this.losses = 0;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public int getWins() {
        return wins;
    }

    public int getLosses() {
        return losses;
    }

    public void setWins(int wins) {
        this.wins = wins;
    }

    public void setLosses(int losses) {
        this.losses = losses;
    }

    public void updateStatistics(boolean win) {
        if (win) {
            wins++;
        } else {
            losses++;
        }
    }
}
