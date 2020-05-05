package com.github.greekpanda.strategy.origin;

/**
 * @author GreePanda
 * @version 1.0
 * @date 2020/5/5 18:01
 */
public class WildDuck extends Duck {
    public WildDuck() {
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
        super.fly();
    }

    @Override
    public void display() {
        System.out.println("It's a wild duck");
    }
}
