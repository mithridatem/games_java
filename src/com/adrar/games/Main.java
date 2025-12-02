package com.adrar.games;

import com.adrar.games.database.Request;

import java.sql.*;

public class Main {
    public static void main(String[] args) {
        Request request = new Request();
        Connection connection = request.connection;
    }
}
