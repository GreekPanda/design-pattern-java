package com.github.greekpanda.strategy.improve;

/**
 * @author GreePanda
 * @version 1.0
 * @date 2020/5/5 18:16
 */
public class NoFlyBehavior implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("No fly");
    }
}
