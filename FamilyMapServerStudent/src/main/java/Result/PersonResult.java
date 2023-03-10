package Result;
import model.Person;
/***
 * Result class for getting all persons associated with a user. Returns an array containing the information of each person.
 */
public class PersonResult extends Result {
    Person[] people;
    boolean success;

    public PersonResult(String message, boolean success, Person[] people, boolean success1) {
        super(message, success);
        this.people = people;
        this.success = success1;
    }
}
