package com.adrar.games.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import static com.adrar.games.database.Env.*;

public class Request {
    public static Connection connection;
    static
    {
        try {
            connection = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
