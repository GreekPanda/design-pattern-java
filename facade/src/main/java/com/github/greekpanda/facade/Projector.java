package com.github.greekpanda.facade;

/**
 * @author GreePanda
 * @version 1.0
 * @date 2020/5/2 16:42
 */
public class Projector {
    private static Projector instance = new Projector();

    public static Projector getInstance() {
        return instance;
    }

    public void on() {
        System.out.println("Projector on");
    }

    public void off() {
        System.out.println("Projector off");
    }

    public void focus() {
        System.out.println("Projector focus");
    }
}
