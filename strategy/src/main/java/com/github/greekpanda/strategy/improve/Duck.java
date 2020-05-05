package com.github.greekpanda.strategy.improve;

/**
 * @author GreePanda
 * @version 1.0
 * @date 2020/5/5 17:57
 */
public abstract class Duck {

    //聚合属性策略接口
    FlyBehavior flyBehavior;

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
        if(flyBehavior != null)
            flyBehavior.fly();
    }

    public abstract void display();
}
