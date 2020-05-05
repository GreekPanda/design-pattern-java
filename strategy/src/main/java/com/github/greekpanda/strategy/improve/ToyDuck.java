package com.github.greekpanda.strategy.improve;


/**
 * @author GreePanda
 * @version 1.0
 * @date 2020/5/5 18:03
 */
public class ToyDuck extends Duck {

    public ToyDuck() {
        flyBehavior = new NoFlyBehavior();
    }

    @Override
    public void fly() {
        if(flyBehavior != null)
            flyBehavior.fly();
    }

    @Override
    public void display() {
        System.out.println("Toy duck ");
    }
}
