package Result;
/***
 * Result class for registering a new user, returns login information and an authToken.
 */
public class RegisterResult extends Result {
    String authToken;
    String username;
    String personID;
    boolean success;

    public RegisterResult(String message, boolean success, String authToken, String username, String personID, boolean success1) {
        super(message, success);
        this.authToken = authToken;
        this.username = username;
        this.personID = personID;
        this.success = success1;
    }
}
