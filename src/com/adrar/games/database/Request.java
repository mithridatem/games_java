package com.adrar.games.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import static com.adrar.games.database.Env.*;

public class Request {
    private static final Connection connection;
    static
    {
        try {
            connection = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    //Méthode
    public Connection getConnection()
    {
        return connection;
    }
}
