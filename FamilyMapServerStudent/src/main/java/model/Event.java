package model;

public class Event {
    String eventID;
    String associatedUsername;
    String personID;
    float latitude;
    float longitude;
    String country;
    String city;
    String eventType;
    Integer year;


    // Returns evenID
    public String getEventID() {
        return eventID;
    }

    // returns associatedUsername
    public String getAssociatedUsername() {
        return associatedUsername;
    }

    // Returns personID
    public String getPersonID() {
        return personID;
    }

    // Returns latitude
    public float getLatitude() {
        return latitude;
    }

    // Returns longitude
    public float getLongitude() {
        return longitude;
    }

    // Returns country
    public String getCountry() {
        return country;
    }

    // Returns city
    public String getCity() {
        return city;
    }

    // Returns eventType
    public String getEventType() {
        return eventType;
    }

    // Returns year
    public Integer getYear() {
        return year;
    }

    // Returns the entire Event object
    Event getEvent() {
        return this;
    }

    // Sets eventID
    public void setEventID(String eventID) {
        this.eventID = eventID;
    }

    // Sets associatedUsername
    public void setAssociatedUsername(String associatedUsername) {
        this.associatedUsername = associatedUsername;
    }

    // Sets personID
    public void setPersonID(String personID) {
        this.personID = personID;
    }

    // Sets latitude
    public void setLatitude(float latitude) {
        this.latitude = latitude;
    }

    // Sets longitude
    public void setLongitude(float longitude) {
        this.longitude = longitude;
    }

    // Sets country
    public void setCountry(String country) {
        this.country = country;
    }

    // Sets city
    public void setCity(String city) {
        this.city = city;
    }

    // Sets eventType
    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    // Sets year
    public void setYear(Integer year) {
        this.year = year;
    }

    public Event(String eventID, String associatedUsername, String personID, float latitude, float longitude, String country, String city, String eventType, Integer year) {
        this.eventID = eventID;
        this.associatedUsername = associatedUsername;
        this.personID = personID;
        this.latitude = latitude;
        this.longitude = longitude;
        this.country = country;
        this.city = city;
        this.eventType = eventType;
        this.year = year;
    }

}