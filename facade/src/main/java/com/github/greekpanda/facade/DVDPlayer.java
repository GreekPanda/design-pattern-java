package com.github.greekpanda.facade;

/**
 * @author GreePanda
 * @version 1.0
 * @date 2020/5/2 16:38
 */
public class DVDPlayer {
    private static DVDPlayer instance = new DVDPlayer();
    public static DVDPlayer getInstance() {
        return instance;
    }

    public void on() {
        System.out.println("DVD on");
    }

    public void off() {
        System.out.println("DVD off");
    }

    public void play() {
        System.out.println("DVD play");
    }

    public void pause() {
        System.out.println("DVD pause");
    }
}
