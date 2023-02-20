package dao;

import model.event;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDAO {

    private final Connection conn;
    public void insert(User user) throws DataAccessException {

    }

    void createUser(User user) throws DataAccessException {

    }

    boolean validate(String username, String password) throws DataAccessException {

    }

    void login(String username, String password) throws DataAccessException {

    }

    boolean validateUser(String username) {

    }

    User findUser()

}