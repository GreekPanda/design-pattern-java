package com.github.greekpanda.strategy.improve;

/**
 * @author GreePanda
 * @version 1.0
 * @date 2020/5/5 18:02
 */
public class PekingDuck extends Duck {
    public PekingDuck() {
        flyBehavior = new BadFlyBehavior();

    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }


    @Override
    public void fly() {
        //super.fly();
        if (flyBehavior != null)
            flyBehavior.fly();
    }

    @Override
    public void display() {
        System.out.println("Peking duck");
    }
}
