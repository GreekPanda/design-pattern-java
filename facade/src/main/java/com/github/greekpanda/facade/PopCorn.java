package com.github.greekpanda.facade;

/**
 * @author GreePanda
 * @version 1.0
 * @date 2020/5/2 16:40
 */
public class PopCorn {
    private static PopCorn instance = new PopCorn();

    public static PopCorn getInstance() {
        return instance;
    }

    public void on() {
        System.out.println("Pop core on");
    }

    public void off() {
        System.out.println("Pop corn off");
    }

    public void pop() {
        System.out.println("Pop corn pop");
    }
}
