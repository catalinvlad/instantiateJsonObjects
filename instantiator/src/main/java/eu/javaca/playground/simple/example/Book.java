package eu.javaca.playground.simple.example;

import eu.javaca.playground.Pojo;

public class Book extends Pojo {

    private String name;
    private String ISBN;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }
}