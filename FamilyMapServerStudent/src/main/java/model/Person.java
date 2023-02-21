package model;
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

    public Person(String personID, String associatedUsername, String firstName, String lastName, String gender, String fatherID, String motherID, String spouseID) {
        this.personID = personID;
        this.associatedUsername = associatedUsername;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.fatherID = fatherID;
        this.motherID = motherID;
        this.spouseID = spouseID;
    }

    Person getPerson() {
        return this;
    }

}