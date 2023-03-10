package Result;
/***
 * Result class for logging in as a user. Returns password, ID and an authToken.
 */
public class LoginResult extends Result {
    String authToken;
    String username;
    String personID;
    boolean success;

    public LoginResult(String message, boolean success, String authToken, String username, String personID, boolean success1) {
        super(message, success);
        this.authToken = authToken;
        this.username = username;
        this.personID = personID;
        this.success = success1;
    }
}
