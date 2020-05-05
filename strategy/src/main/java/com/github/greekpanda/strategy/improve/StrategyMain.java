package com.github.greekpanda.strategy.improve;

/**
 * @author GreePanda
 * @version 1.0
 * @date 2020/5/5 18:08
 */
public class StrategyMain {
    public static void main(String[] args) {
        Duck pekingDuck = new PekingDuck();
        pekingDuck.display();
        pekingDuck.fly();

        System.out.println("------------------");
        Duck wildDuck = new WildDuck();
        wildDuck.display();
        wildDuck.fly();
    }

}
