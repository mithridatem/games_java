package com.adrar.games;

import com.adrar.games.model.Console;
import com.adrar.games.model.Game;
import com.adrar.games.repository.ConsoleRepository;
import com.adrar.games.repository.GameRepository;

import java.sql.Date;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        //Instance d'un objet console
        Console playstation4 = new Console("Playstation 3", "Sony");
        //instance d'un objet ConsoleRepository
        ConsoleRepository consoleRepository = new ConsoleRepository();
        GameRepository  gameRepository = new GameRepository();
        //System.out.println(gameRepository.findAll());
        //Objet Game
        Game game = new Game();
        game.setType("Action");
        game.setTitle("Dark souls");
        game.setPublishAt(Date.valueOf("2016-12-01"));
        game.setConsole(consoleRepository.find(5));
        System.out.println(game);
        gameRepository.saveGame(game);
        System.out.println(game);
        //Afficher la liste des consoles
        /*System.out.println(consoleRepository.findAll());
        //Afficher la console avec son ID
        System.out.println(consoleRepository.find(5));
        //Test si la console existe
        if (consoleRepository.isExistsByName(playstation4)) {
            System.out.println("La console existe déja");
        }
        //Sinon elle n'existe pas
        else {
            //Appel de la méthode
            System.out.println("La console à été ajouté, id : " + consoleRepository.saveConsole(playstation4).getId());
        }*/
    }
}
