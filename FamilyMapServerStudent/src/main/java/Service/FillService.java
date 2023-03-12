package Service;
import Request.FillRequest;
import Result.Result;
import dao.*;
import model.Event;
import model.Person;
import model.User;

import java.sql.Connection;

/***
 * Service for filling the DB with information for a user.
 */
public class FillService {

    /***
     * Object used to add, find and delete Events from the DB
     */
    EventDAO cTwo;
    /***
     * Object used to add, find and delete Persons from the DB
     */
    PersonDAO cThree;
    /***
     * Object used to find the username and retrieve information on User
     */
    UserDAO cOne;
    /***
     * Used to pass return message into result object at the end of the party
     */
    boolean success;
    /***
     * Used to pass success value into result object at the end of the party
     */
    String message;
    /***
     * String containing username given to us in URI
     */
    String username;
    /***
     * Generates family history data for the user with the specified name. Default number of generations is 4.
     */
    public Result Fill(FillRequest request) {
        try {
            // populate database with data.
            success = true;
            message = "";

            Database base = new Database();
            Connection conn;

            conn = base.openConnection();

            // Object used to add, find and delete Events from the DB
            cTwo = new EventDAO(conn);
            // Object used to add, find and delete Persons from the DB
            cThree = new PersonDAO(conn);
            // Object used to find the username and retrieve information on User
            cOne= new UserDAO(conn);

            // Check database for username
            if (cOne.find(request.getUsername()) != null) {
                username = request.getUsername();
                // propagating generations is a recursive process starting at 0 and generating two parents recursively.
                // TODO Get names and information from somewhere...


            }
            else {
                success = false;
                message = "Username not found or empty.";
            }

            if (success) {
                message = "Successfully added " + 1 +
                          " persons, and " + 1 +
                          " events to the database.";
            } else {
                message = "Error: Unable to fill database. Content empty.";
            }
            return new Result(true);
        }
        catch (DataAccessException e) {
            throw new RuntimeException(e);
        }
    }

    //String associatedUsername, String firstName, String lastName, String gender, String fatherID, String motherID, String spouseID, String personID

    private void GeneratePerson(int n) {
        if (n > 0) {
            String firstName;
            String lastName;
            String gender;
            String fatherID;
            String motherID;
            String spouseID;
            String personID;
            // TODO Generate required fields
            /*
            firstName = random name
            lastName = random surname
            gender = based on user profile
            fatherID = generate new father
            motherID = generate new mother
            spouseID = generate now spouse
            personID = random ID of person being created
             */
            Person person = new person(username, firstName, lastName, gender, fatherID, motherID, spouseID, personID);
            GenerateAssociated(n--, person);
        }
    }

    private void GenerateAssociated(int n, Person person) {
        if (n > 0) {

        }
    }

}
