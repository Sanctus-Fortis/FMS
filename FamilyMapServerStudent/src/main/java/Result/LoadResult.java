package Result;
/***
 * Result class for loading user data. Returns the number of user, persons and events.
 */
public class LoadResult extends Result {
    // message
    Integer users;
    Integer persons;
    Integer events;
    boolean success;

    public LoadResult(String message, boolean success, Integer users, Integer persons, Integer events, boolean success1) {
        super(message, success);
        this.users = users;
        this.persons = persons;
        this.events = events;
        this.success = success1;
    }
}
