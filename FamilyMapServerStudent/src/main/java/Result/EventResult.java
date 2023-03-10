package Result;
import model.Event;
/***
 * Result class for getting all events associated with a user. Returns an array containing the information of each event.
 */
public class EventResult extends Result {
    Event[] events;
    boolean success;

    public EventResult(String message, boolean success, Event[] events, boolean success1) {
        super(message, success);
        this.events = events;
        this.success = success1;
    }
}
