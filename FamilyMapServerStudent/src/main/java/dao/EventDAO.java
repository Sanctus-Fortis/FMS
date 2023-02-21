package dao;

import model.Event;

import java.sql.Connection;
import java.util.List;

public class EventDAO {
    private final Connection conn;

    public EventDAO(Connection conn) {
        this.conn = conn;
    }

    /***
     * Inserts an event into the database
     * @param event An event object
     */
    public void insert(Event event) {

    }

    /***
     * Checks the database for an event and returns the event as an event object
     * @param eventID The ID for the event
     * @return returns an event object
     */
    public Event find(String eventID) {
        Event event = null;
        return event;
    }

    /***
     * Finds an event by ID and deletes it from the DB
     * @param eventID ID to search for in the DB
     */
    public void delete(String eventID) {

    }

    /***
     * Returns a list of events that are associated with one user
     * @param username the username to match with events
     * @return A list of Event objects whose associated username matches username
     */
    public List<Event> findForUser(String username) {
        List<Event> events = null;
        return events;
    }
}