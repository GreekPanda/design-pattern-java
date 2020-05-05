package com.github.greekpanda.strategy.improve;

/**
 * @author GreePanda
 * @version 1.0
 * @date 2020/5/5 18:15
 */
public class BadFlyBehavior implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("Bad fly");
    }
}
