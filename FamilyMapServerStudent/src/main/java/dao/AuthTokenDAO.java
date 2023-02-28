package dao;

import model.AuthToken;

import java.sql.Connection;

/***
 * Data access object for the AuthToken object
 */
public class AuthTokenDAO {

    private final Connection conn;

    public AuthTokenDAO(Connection conn) {
        this.conn = conn;
    }
    // Add an AuthToken for the user to the DB
    public void insert(AuthToken authToken) {

    }

    /***
     *
     * @param stringToken token to look for
     * @return the token if found
     */
    AuthToken findToken(String stringToken) {
        AuthToken token = null;
        return token;
    }

    /***-
     * Creates a token and associates it with a username
     * @param username username to associate
     */
    void createToken(String username) {

    }

    /***
     * Removes a token from the DB
     * @param token Token to remove
     */
    void deleteToken(String token) {

    }

}