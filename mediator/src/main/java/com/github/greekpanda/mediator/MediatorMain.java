package com.github.greekpanda.mediator;

/**
 * @author GreePanda
 * @version 1.0
 * @date 2020/5/5 07:27
 */
public class MediatorMain {
    public static void main(String[] args) {
        Mediator mediator = new ConcreteMediator();
        Alarm alarm = new Alarm(mediator, "Alarm");
        CoffeeMachine coffeeMachine = new CoffeeMachine(mediator, "CoffeeMachine");
        Curtains curtains = new Curtains(mediator, "mediator");
        TV tv = new TV(mediator, "tv");
        alarm.sendMessage(0);
        coffeeMachine.finishCoffee();
        alarm.sendMessage(1);
    }
}
