package com.github.greekpanda.strategy.origin;

/**
 * @author GreePanda
 * @version 1.0
 * @date 2020/5/5 17:57
 */
public abstract class Duck {

    public Duck() {
    }

    public void quack() {
        System.out.println("Duck is gaga");
    }

    public void swim() {
        System.out.println("Duck can swim");
    }

    public void fly() {
        System.out.println("Duck can flay");
    }

    public abstract void display();
}
