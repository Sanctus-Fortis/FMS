package model;

import java.util.Objects;

/***
 * User object used to quantify person for input and retrieval from DB
 */
public class User {
    String username;
    String password;
    String email;
    String firstName;
    String lastName;
    String gender;
    String userID;

    // Sets username
    public void setUsername(String username) {
        this.username = username;
    }

    // Sets password
    public void setPassword(String password) {
        this.password = password;
    }

    // Sets email
    public void setEmail(String email) {
        this.email = email;
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

    // Sets personID
    public void setPersonID(String personID) {
        this.userID = personID;
    }

    // Returns username
    public String getUsername() {
        return username;
    }

    // Returns password
    public String getPassword() {
        return password;
    }

    // Returns email
    public String getEmail() {
        return email;
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

    // Returns personID
    public String getPersonID() {
        return userID;
    }

    // Returns this User object
    User getUser() {
        return this;
    }

    public User(String username, String password, String email, String firstName, String lastName, String gender, String userID) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.userID = userID;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(username, user.username) && Objects.equals(password, user.password) && Objects.equals(email, user.email) && Objects.equals(firstName, user.firstName) && Objects.equals(lastName, user.lastName) && Objects.equals(gender, user.gender) && Objects.equals(userID, user.userID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(username, password, email, firstName, lastName, gender, userID);
    }
}