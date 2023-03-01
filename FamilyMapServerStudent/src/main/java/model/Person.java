package model;

import java.util.Objects;

/***
 * Person object used to quantify person for input and retrieval from DB
 */
public class Person {
    String personID;
    String associatedUsername;
    String firstName;
    String lastName;
    String gender;
    String fatherID;
    String motherID;
    String spouseID;

    // Sets personID
    public void setPersonID(String personID) {
        this.personID = personID;
    }

    // Sets associatedUsername
    public void setAssociatedUsername(String associatedUsername) {
        this.associatedUsername = associatedUsername;
    }

    // Sets firstName
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    // Sets lastName
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    // Sets gender
    public void setGender(String gender) {
        this.gender = gender;
    }

    // Sets fatherID
    public void setFatherID(String fatherID) {
        this.fatherID = fatherID;
    }

    // Sets motherID
    public void setMotherID(String motherID) {
        this.motherID = motherID;
    }

    // Sets spouseID
    public void setSpouseID(String spouseID) {
        this.spouseID = spouseID;
    }

    // Returns personID
    public String getPersonID() {
        return personID;
    }

    // Returns associatedUsername
    public String getAssociatedUsername() {
        return associatedUsername;
    }

    // Returns firstName
    public String getFirstName() {
        return firstName;
    }

    // Returns lastName
    public String getLastName() {
        return lastName;
    }

    // Returns gender
    public String getGender() {
        return gender;
    }

    // Returns fatherID
    public String getFatherID() {
        return fatherID;
    }

    // Returns motherID
    public String getMotherID() {
        return motherID;
    }

    // Returns spouseID
    public String getSpouseID() {
        return spouseID;
    }

    public Person(String associatedUsername, String firstName, String lastName, String gender, String fatherID, String motherID, String spouseID, String personID) {
        this.associatedUsername = associatedUsername;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.fatherID = fatherID;
        this.motherID = motherID;
        this.spouseID = spouseID;
        this.personID = personID;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(personID, person.personID) && Objects.equals(associatedUsername, person.associatedUsername) && Objects.equals(firstName, person.firstName) && Objects.equals(lastName, person.lastName) && Objects.equals(gender, person.gender) && Objects.equals(fatherID, person.fatherID) && Objects.equals(motherID, person.motherID) && Objects.equals(spouseID, person.spouseID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(personID, associatedUsername, firstName, lastName, gender, fatherID, motherID, spouseID);
    }

    Person getPerson() {
        return this;
    }

}