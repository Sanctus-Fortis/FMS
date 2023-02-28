package dao;

import model.User;

import java.sql.Connection;

/***
 * Data access object for the user object
 */
public class UserDAO {

    private final Connection conn;
    User user;

    public UserDAO(Connection conn) {
        this.conn = conn;
    }

    /***
     * Adds a user to the DB
     * @param user User to add to the DB
     */
    void insert(User user) {

    }

    /***
     * Retrieves a User object from the DB
     * @return
     */
    User retrieve() {
        User temp = null;
        return temp;
    }

    /***
     * Clears all Users from the DB
     */
    void clear() {

    }

    /***
     * Seaches for a user by ID and returns the user object
     * @param userID ID to search for
     * @return a User object with matching ID
     */
    User find(String userID) {
        User user = null;
        return user;
    }

    /***
     * Validates a login by checking the database for a match for username and password
     * @param username The username to search for in the database
     * @param password Password to match
     * @return A boolean that indicated a valid login
     */
    boolean validate(String username, String password) {
        return false;
    }

    /***
     * Checks if the user exists in the database.
     * @param username Username to check for
     * @return Boolean that indicates if the username already exists.
     */
    boolean validateUser(String username) {
        return false;
    }

    /***
     * Looks for user in the database and returns a user object.
     * @param username used to match with a user in the DB
     * @return user object that matches username
     */
    User findUser(String username) {
        User user = null;
        return user;
    }

}