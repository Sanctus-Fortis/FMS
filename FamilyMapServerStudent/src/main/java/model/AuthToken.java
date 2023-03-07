package model;

/***
 * AuthToken object used to validate sessions
 */
public class AuthToken {
    String authToken;
    String username;

    public AuthToken(String authToken, String username) {
        this.authToken = authToken;
        this.username = username;
    }

    // Returns AuthToken object
    public AuthToken getToken() {
        return this;
    }

    // Returns authToken
    public String getAuthToken() {
        return authToken;
    }

    // Returns username
    public String getUsername() {
        return username;
    }

    // Sets authToken
    public void setAuthToken(String authToken) {
        this.authToken = authToken;
    }

    // Sets username
    public void setUsername(String username) {
        this.username = username;
    }
}