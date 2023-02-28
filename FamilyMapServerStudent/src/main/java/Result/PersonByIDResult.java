package Result;
/***
 * Result class for getting person by ID. Returns all the information of a person.
 */
public class PersonByIDResult extends Result {
    String associatedUsername;
    String personID;
    String firstName;
    String lastName;
    String gender;
    String fatherID;
    String motherID;
    String spouseID;
    boolean success;
}
