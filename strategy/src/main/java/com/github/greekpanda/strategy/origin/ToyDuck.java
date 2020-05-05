package com.github.greekpanda.strategy.origin;

/**
 * @author GreePanda
 * @version 1.0
 * @date 2020/5/5 18:03
 */
public class ToyDuck extends Duck {
    public ToyDuck() {
        super();
    }

    @Override
    public void quack() {
//        super.quack();
        System.out.println("Toy duck can't quack");
    }

    @Override
    public void swim() {
//        super.swim();
        System.out.println("Toy duck can't swim");
    }

    @Override
    public void fly() {
        //super.fly();
        System.out.println("Toy duck can't fly");
    }

    @Override
    public void display() {
        System.out.println("Toy duck ");
    }
}
