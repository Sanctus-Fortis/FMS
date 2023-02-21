package model;

public class AuthToken {
    String authToken;
    String username;

    public AuthToken(String authToken, String username) {
        this.authToken = authToken;
        this.username = username;
    }

    // Returns AuthToken object
    AuthToken getToken() {
        return this;
    }

    // Returns authToken
    String getAuthToken() {
        return authToken;
    }

    // Returns username
    String getUsername() {
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