package Service;

import Result.Result;
import dao.*;

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
    public Result clear() {
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
        Result result = new Result("", true);
        try {
            if (cOne.numTokens() > 0) {
                result.setSuccess(false);
            }
            if (cTwo.numEvents() > 0) {
                result.setSuccess(false);
            }
            if (cThree.numPersons() > 0) {
                result.setSuccess(false);
            }
            if (cFour.numUsers() > 0) {
                result.setSuccess(false);
            }
            base.closeConnection(true);
            if (result.getSuccess()) {
                result.setMessage("Clear succeeded.");
            }
            else {
                result.setMessage("Error: Unable to clear database. Check connection or get good.");
            }
        }
        catch (DataAccessException e) {
            throw new RuntimeException(e);
        }
        return result;
    }
}
