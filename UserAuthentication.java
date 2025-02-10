
import java.util.HashMap;
import java.util.Map;

public class UserAuthentication {
    private Map<String, String> userCredentials; // Map to store username-password pairs

    public UserAuthentication() {
        this.userCredentials = new HashMap<>();
    }

    public boolean registerUser(String username, String password, String email) {
        if (userCredentials.containsKey(username)) {
            System.out.println("Username already exists. Please choose another one.");
            return false;
        }
        userCredentials.put(username, password);
        System.out.println("User " + username + " registered successfully.");
        return true;
    }

    public boolean authenticateUser(String username, String password) {
        if (userCredentials.containsKey(username) && userCredentials.get(username).equals(password)) {
            System.out.println("User " + username + " authenticated successfully.");
            return true;
        }
        System.out.println("Authentication failed. Please check your username and password.");
        return false;
    }

    public boolean resetPassword(String username, String newPassword) {
        if (userCredentials.containsKey(username)) {
            userCredentials.put(username, newPassword);
            System.out.println("Password for user " + username + " reset successfully.");
            return true;
        }
        System.out.println("Password reset failed. User " + username + " does not exist.");
        return false;
    }
}
