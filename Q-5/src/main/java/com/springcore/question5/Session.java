package com.springcore.question5;

public class Session {
    private int id;
    private String name;

    public Session(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Getter methods
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
