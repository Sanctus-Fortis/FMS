package Result;
import model.Event;
/***
 * Result class for getting all events associated with a user. Returns an array containing the information of each event.
 */
public class EventResult extends Result {
    Event[] events;
    boolean success;
}
