package Result;
import model.Person;
/***
 * Result class for getting all persons associated with a user. Returns an array containing the information of each person.
 */
public class PersonResult extends Result {
    Person[] people;
    boolean success;
}
