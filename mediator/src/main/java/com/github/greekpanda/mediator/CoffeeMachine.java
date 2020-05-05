package com.github.greekpanda.mediator;

/**
 * @author GreePanda
 * @version 1.0
 * @date 2020/5/5 07:50
 */
public class CoffeeMachine extends Colleague {
    public CoffeeMachine(Mediator mediator, String name) {
        super(mediator, name);
        mediator.register(name, this);
    }

    @Override
    public void sendMessage(int stateChange) {
        this.getMediator().getMessage(stateChange, this.getName());
    }

    public void sendRing(int stateChange) {
        sendMessage(stateChange);
    }

    public void startCoffee() {
        System.out.println("Coffee machine is starting cooking");
    }

    public void finishCoffee() {
        System.out.println("Coffee machine finish cook");
    }
}
