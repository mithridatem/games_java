package com.adrar.games.repository;

import com.adrar.games.database.Request;
import com.adrar.games.model.Console;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class ConsoleRepository {
    //Attribut
    private Connection connect;

    //Constructeur
    public ConsoleRepository()
    {
        Request request = new Request();
        this.connect = request.getConnection();
    }

    //Méthode pour ajouter une console (Console) en BDD
    public Console saveConsole(Console console) throws SQLException
    {
        //requête SQL
        String sql = "INSERT INTO console (name, manufacturer) VALUES (?, ?)";
        //Préparation de la requête
        PreparedStatement pstmt = connect.prepareStatement(sql);
        //Assigner les paramètres
        pstmt.setString(1, console.getName());
        pstmt.setString(2, console.getManufacturer());
        //Exécuter la requête
        int addRows = pstmt.executeUpdate();
        return new Console();
    }

    public ArrayList<Console> findAll()
    {
        return new ArrayList<Console>();
    }

    public Console find(int id)
    {
        return new Console();
    }
}
