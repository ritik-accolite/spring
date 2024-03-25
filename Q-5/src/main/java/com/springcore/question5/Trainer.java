package com.springcore.question5;

import java.util.ArrayList;
import java.util.List;

public class Trainer {
    private int id;
    private String name;
    private List<Session> sessions;

    public Trainer(int id, String name) {
        this.id = id;
        this.name = name;
        this.sessions = new ArrayList<>();
    }

    // Getter methods
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<Session> getSessions() {
        return sessions;
    }
}
