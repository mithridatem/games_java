package com.adrar.games.model;

import java.sql.Date;

public class Game {
    //Attributs
    private int id;
    private String title;
    private String type;
    private Date publishAt;
    private Console console;

    //Constructeurs
    public Game() {}

    public Game(String title, String type, Date publishAt, Console console)
    {
        this.title = title;
        this.type = type;
        this.publishAt = publishAt;
        this.console = console;
    }

    //Getter et Setters
    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Date getPublishAt() {
        return this.publishAt;
    }

    public void setPublishAt(Date publishAt) {
        this.publishAt = publishAt;
    }

    public Console getConsole() {
        return this.console;
    }

    public void setConsole(Console console) {
        this.console = console;
    }

    public String toString()
    {
        return this.title
                + " : "
                + this.type
                + " : "
                + this.publishAt
                + " : "
                + this.console;
    }
}
