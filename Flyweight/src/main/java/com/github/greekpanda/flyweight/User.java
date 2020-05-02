package com.github.greekpanda.flyweight;

/**
 * @author GreePanda
 * @version 1.0
 * @date 2020/5/3 07:00
 */
public class User {
    private String name = "";

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
