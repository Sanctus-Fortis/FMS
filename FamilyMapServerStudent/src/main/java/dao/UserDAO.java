package dao;

import model.Event;
import model.User;

import java.io.File;
import java.sql.*;

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
    public void insert(User user) throws DataAccessException {
        //We can structure our string to be similar to a sql command, but if we insert question
        //marks we can change them later with help from the statement
        String sql = "INSERT INTO Users (username, password, email, firstName, lastName, gender, userID) VALUES(?,?,?,?,?,?,?)";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            //Using the statements built-in set(type) functions we can pick the question mark we want
            //to fill in and give it a proper value. The first argument corresponds to the first
            //question mark found in our sql String
            stmt.setString(1, user.getUsername());
            stmt.setString(2, user.getPassword());
            stmt.setString(3, user.getEmail());
            stmt.setString(4, user.getFirstName());
            stmt.setString(5, user.getLastName());
            stmt.setString(6, user.getGender());
            stmt.setString(7, user.getPersonID());

            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            throw new DataAccessException("Error encountered while inserting an event into the database");
        }
    }

    /***
     * Seaches for a user by ID and returns the user object
     * @param userID ID to search for
     * @return a User object with matching ID
     */
    public User find(String userID) throws DataAccessException {
        User user;
        ResultSet rs;
        String sql = "SELECT * FROM Users WHERE userID = ?;";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, userID);
            rs = stmt.executeQuery();
            if (rs.next()) {
                user = new User(rs.getString("Username"), rs.getString("Password"),
                        rs.getString("Email"), rs.getString("FirstName"), rs.getString("LastName"),
                        rs.getString("Gender"), rs.getString("userID"));
                return user;
            } else {
                return null;
            }
        } catch (SQLException e) {
            e.printStackTrace();
            throw new DataAccessException("Error encountered while finding an event in the database");
        }

    }

    /***
     * Clears all Users from the DB
     */
    public void clear() throws DataAccessException {
        String sql = "DELETE FROM Users";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            throw new DataAccessException("Error encountered while clearing the event table");
        }
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

    int numUsers() throws DataAccessException {
        String sql = "SELECT count(*) FROM Users";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            ResultSet rs = stmt.executeQuery();
            if (!rs.next()) return -1;
            return rs.getInt(1);
        }
        catch (SQLException e) {
            e.printStackTrace();
            throw new DataAccessException(
                    "Error"
            );
        }
    }

}