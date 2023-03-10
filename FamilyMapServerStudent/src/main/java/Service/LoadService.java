package Service;
import Request.LoadRequest;
import Result.Result;
import model.*;
import dao.*;
import com.google.gson.Gson;

import java.sql.Connection;

/***
 * Service for loading user history from the DB
 */
public class LoadService {
    /***
     * Loads user history from the DB and populates application
     */
    public Result load(LoadRequest request, Gson input) {
        Database base = new Database();
        Connection conn;
        try {
            conn = base.openConnection();
        } catch (DataAccessException e) {
            throw new RuntimeException(e);
        }
        EventDAO cTwo = new EventDAO(conn);
        PersonDAO cThree = new PersonDAO(conn);
        UserDAO cFour = new UserDAO(conn);
        // Event[] events = new something;
        // Person[] persons = new something;
        // User[] users = new something;
        /*
        for each in event array {
            cTwo.insert;
        }
        for each in person array  {
            cThree.insert;
        }
        for each in user array {
            cFour.insert;
        }
        */

        return new Result(false);
    }
}
