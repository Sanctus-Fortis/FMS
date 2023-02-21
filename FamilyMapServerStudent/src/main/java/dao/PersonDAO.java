package dao;

import model.Person;

import java.sql.Connection;
public class PersonDAO {

    private final Connection conn;
    Person person;

    public PersonDAO(Connection conn) {
        this.conn = conn;
    }

    /***
     * Adds a person to the DB
     * @param person Person object to add
     */
    public void insert(Person person){

    }

    /***
     * Searched the DB by ID and removes a person with the matching ID
     * @param personID The ID of the person to be removed
     */
    public void delete(String personID) {

    }

    /***
     * Searches for a person in the database by ID and returns a Person object
     * @param personID ID to search for
     * @return Person object with matching ID
     */
    Person find(String personID) {
        Person person = null;
        return person;
    }

}