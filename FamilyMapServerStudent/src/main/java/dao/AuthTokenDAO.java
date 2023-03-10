package dao;

import model.AuthToken;
import model.Event;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/***
 * Data access object for the AuthToken object
 */
public class AuthTokenDAO {

    private final Connection conn;

    public AuthTokenDAO(Connection conn) {
        this.conn = conn;
    }

    // Add an AuthToken for the user to the DB
    public void insert(AuthToken token) throws DataAccessException {
        //We can structure our string to be similar to a sql command, but if we insert question
        //marks we can change them later with help from the statement
        String sql = "INSERT INTO AuthorizationTokens (authtoken, username) VALUES(?,?)";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            //Using the statements built-in set(type) functions we can pick the question mark we want
            //to fill in and give it a proper value. The first argument corresponds to the first
            //question mark found in our sql String
            stmt.setString(1, token.getAuthToken());
            stmt.setString(2, token.getUsername());

            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            throw new DataAccessException("Error encountered while inserting an event into the database");
        }
    }

    /***-
     * Creates a token and associates it with a username
     * @param username username to associate
     */
    void createToken(String username) {

    }

    int numUsers() throws DataAccessException {
        String sql = "SELECT count(*) FROM AuthorizationTokens";
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

    public AuthToken find(String authToken) throws DataAccessException {
        AuthToken auth;
        ResultSet rs;
        String sql = "SELECT * FROM AuthorizationTokens WHERE authtoken = ?;";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, authToken);
            rs = stmt.executeQuery();
            if (rs.next()) {
                auth = new AuthToken(rs.getString("authtoken"), rs.getString("username"));
                return auth;
            } else {
                return null;
            }
        } catch (SQLException e) {
            e.printStackTrace();
            throw new DataAccessException("Error encountered while finding an event in the database");
        }
    }

    /***
     * Removes a token from the DB
     * @param token Token to remove
     */
    void deleteToken(String token) {

    }

    public void clear() throws DataAccessException {
        String sql = "DELETE FROM AuthorizationTokens";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            throw new DataAccessException("Error encountered while clearing the event table");
        }
    }

    public int numTokens() throws DataAccessException {
        String sql = "SELECT count(*) FROM AuthorizationTokens";
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