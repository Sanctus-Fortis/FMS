package Service;
import Request.LoadRequest;
import Result.Result;
import model.*;
import dao.*;

import java.sql.Connection;

/***
 * Service for loading user history from the DB
 */
public class LoadService {
    /***
     * Loads user history from the DB and populates application
     */
    public Result load(LoadRequest request) {
        Database base = new Database();
        Connection conn;
        boolean success = true;
        if (request.getUsers().length <= 0 && request.getEvents().length <= 0 && request.getPersons().length <= 0) {
            success = false;
        }
        try {
            conn = base.openConnection();

            EventDAO cTwo = new EventDAO(conn);
            PersonDAO cThree = new PersonDAO(conn);
            UserDAO cFour = new UserDAO(conn);

            for (Event event : request.getEvents()) {
                cTwo.insert(event);
            }
            for (Person person : request.getPersons())  {
                cThree.insert(person);
            }
            for (User user : request.getUsers()) {
                cFour.insert(user);
            }

            base.closeConnection(true);
        }
        catch (DataAccessException e) {
            throw new RuntimeException(e);
        }
        String message;
        if (success) {
            message = "Successfully added " + request.getUsers().length +
                    " users, " + request.getEvents().length +
                    " persons, and " + request.getPersons().length +
                    " events to the database.";
        }
        else {
            message = "Error: Unable to load to database. Content empty.";
        }
        return new Result(message, success);
    }
}
