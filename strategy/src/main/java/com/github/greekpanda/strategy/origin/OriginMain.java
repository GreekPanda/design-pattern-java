package com.github.greekpanda.strategy.origin;

/**
 * @author GreePanda
 * @version 1.0
 * @date 2020/5/5 18:05
 */
public class OriginMain {
    public static void main(String[] args) {
        Duck wildDuck = new WildDuck();
        wildDuck.display();
        wildDuck.quack();
        wildDuck.fly();
        wildDuck.swim();

        System.out.println("--------------");
        Duck toyDuck = new ToyDuck();
        toyDuck.display();
        toyDuck.quack();
        toyDuck.fly();
        toyDuck.swim();
    }
}
