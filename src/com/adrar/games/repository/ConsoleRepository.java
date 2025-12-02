package com.adrar.games.repository;

import com.adrar.games.database.Request;
import com.adrar.games.model.Console;

import java.sql.*;
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
    public Console saveConsole(Console console)
    {
        try {
            //requête SQL
            String sql = "INSERT INTO console (name, manufacturer) VALUES (?, ?)";
            //Préparation de la requête
            PreparedStatement pstmt = connect.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            //Assigner les paramètres
            pstmt.setString(1, console.getName());
            pstmt.setString(2, console.getManufacturer());
            //Exécuter la requête
            int addRows = pstmt.executeUpdate();

            //Test si la requête à fonctionné
            if (addRows > 0) {
                //récupération de l'ID
                ResultSet rs = pstmt.getGeneratedKeys();
                //Test si on à une réponse
                if (rs.next()){
                    //ide de l'enregistrement
                    int id  = rs.getInt(1);
                    //set de l' id
                    console.setId(id);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return console;
    }
    //Méthode qui retourne une ArrayList de console (Console)
    public ArrayList<Console> findAll()
    {
        return new ArrayList<Console>();
    }

    //Méthode qui retourne une console depuis son id
    public Console find(int id)
    {
        return new Console();
    }

    //méthode qui test si une console (Console) avec son name existe
    public boolean isExistsByName(Console console)
    {
        try {
            //Requête SQL
            String sql = "SELECT c.id FROM console AS c WHERE c.`name` = ?";
            //Préparer la requête
            PreparedStatement pstmt = connect.prepareStatement(sql);
            //Assigner le paramètre
            pstmt.setString(1, console.getName());
            //Exécution de la requête
            ResultSet rs = pstmt.executeQuery();
            //parcours du resultat
            if (rs.next()) {
                //test si l'id existe
                if (rs.getInt("id") > 0) {
                    return true;
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
        return false;
    }
}
