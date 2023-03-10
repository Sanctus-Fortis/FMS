package Service;

import Request.ClearRequest;
import Result.Result;
import dao.*;
import model.AuthToken;

import java.sql.Connection;

/***
 * Service to clear DB of all information
 */
public class ClearService {


    public ClearService() {
    }
    /***
     * Clears the entire DB and leaves it sad and empty.
     */
    public Result clear(ClearRequest request) {
        Database base = new Database();
        Connection conn;
        try {
            conn = base.openConnection();
        } catch (DataAccessException e) {
            throw new RuntimeException(e);
        }
        AuthTokenDAO cOne = new AuthTokenDAO(conn);
        EventDAO cTwo = new EventDAO(conn);
        PersonDAO cThree = new PersonDAO(conn);
        UserDAO cFour = new UserDAO(conn);
        try {
            cOne.clear();
            cTwo.clear();
            cThree.clear();
            cFour.clear();
        }
        catch (DataAccessException e) {
            throw new RuntimeException(e);
        }
        Result temp = new Result(true);
        try {
            if (cOne.numTokens() <= 0) {
                temp.setSuccess(false);
            }
            if (cTwo.numEvents() <= 0) {
                temp.setSuccess(false);
            }
            if (cThree.numPersons() <= 0) {
                temp.setSuccess(false);
            }
            if (cFour.numUsers() <= 0) {
                temp.setSuccess(false);
            }
            base.closeConnection(true);
        }
        catch (DataAccessException e) {
            throw new RuntimeException(e);
        }
        return temp;
    }
}
