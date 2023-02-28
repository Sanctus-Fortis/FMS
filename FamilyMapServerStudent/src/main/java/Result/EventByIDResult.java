package Result;
/***
 * Result class for getting event by ID. Returns all the information of an event.
 */
public class EventByIDResult extends Result {
    String associatedUsername;
    String eventID;
    String personID;
    float latitude;
    float longitude;
    String country;
    String city;
    String eventType;
    Integer year;
    boolean success;
}
