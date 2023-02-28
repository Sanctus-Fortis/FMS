package Result;
/***
 * Result class for logging in as a user. Returns password, ID and an authToken.
 */
public class LoginResult extends Result {
    String authToken;
    String username;
    String personID;
    boolean success;
}
