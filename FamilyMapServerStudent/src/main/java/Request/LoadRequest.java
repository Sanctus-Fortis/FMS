package Request;
import model.*;
/***
 * Request class object for loading the history of a user
 */
public class LoadRequest {
    User[] users;
    Person[] persons;
    Event[] events;

    public LoadRequest() {

    }

    public User[] getUsers() {
        return users;
    }

    public Person[] getPersons() {
        return persons;
    }

    public Event[] getEvents() {
        return events;
    }
}
