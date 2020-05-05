package com.github.greekpanda.memento;

/**
 * @author GreePanda
 * @version 1.0
 * @date 2020/5/5 08:38
 */
public class Memento {
    private String state;
    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}

