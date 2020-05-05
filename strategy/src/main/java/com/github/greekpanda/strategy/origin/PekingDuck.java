package com.github.greekpanda.strategy.origin;

/**
 * @author GreePanda
 * @version 1.0
 * @date 2020/5/5 18:02
 */
public class PekingDuck extends Duck {
    public PekingDuck() {
        super();
    }

    @Override
    public void quack() {
        super.quack();
    }

    @Override
    public void swim() {
        super.swim();
    }

    @Override
    public void fly() {
        //super.fly();
        System.out.println("Peking duck can't fly");
    }

    @Override
    public void display() {
        System.out.println("Peking duck");
    }
}
