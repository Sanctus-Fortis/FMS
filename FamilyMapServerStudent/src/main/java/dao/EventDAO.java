package dao;

import model.event;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EventDAO {
    private final Connection conn;

    public EventDAO(Connection conn) {
        this.conn = conn;
    }

    public void insert(Event event) throws DataAccessException {

    }

    public Event find(String eventID) throws DataAccessException {

    }

    public List<Event> findForUser(String username) {

    }
}