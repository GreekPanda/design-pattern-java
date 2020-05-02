package com.github.greekpanda.facade;

/**
 * @author GreePanda
 * @version 1.0
 * @date 2020/5/2 16:45
 */
public class Stereo {
    private static Stereo instance = new Stereo();
    public static Stereo getInstance() {
        return instance;
    }

    public void up() {
        System.out.println("Stereo up");
    }

    public void down() {
        System.out.println("Stereo down");
    }


}
