package Result;
/***
 * Result class for registering a new user, returns login information and an authToken.
 */
public class RegisterResult extends Result {
    String authToken;
    String username;
    String personID;
    boolean success;
}
