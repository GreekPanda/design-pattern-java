package com.github.greekpanda.facade;

/**
 * @author GreePanda
 * @version 1.0
 * @date 2020/5/2 16:46
 */
public class Light {
    private static Light instance = new Light();
    public static Light getInstance() {
        return instance;
    }

    public void on() {
        System.out.println("Light on");
    }
    public void off() {
        System.out.println("Light off");
    }
    public void bright() {
        System.out.println("Light bright");
    }
    public void dim() {
        System.out.println("Light dim");
    }
}
