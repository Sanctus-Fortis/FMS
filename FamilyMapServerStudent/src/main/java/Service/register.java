package Service;
import model.AuthToken;

/***
 * Service class for registering a new user and adding their information to the DB
 */
public class register {

    /***
    Creates a new user account (user row in the database)
    Generates 4 generations of ancestor data for the new user (just like the /fill endpoint if called with a generations value of 4 and this new user’s username as parameters)
    Logs the user in
    Returns an authtoken
     */
    AuthToken registerUser() {
        AuthToken newToken = null;

        return newToken;
    }
}
