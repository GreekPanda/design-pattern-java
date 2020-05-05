package com.github.greekpanda.mediator;

/**
 * @author GreePanda
 * @version 1.0
 * @date 2020/5/5 07:54
 */
public class TV extends Colleague {
    public TV(Mediator mediator, String name) {
        super(mediator, name);
        mediator.register(name, this);
    }

    @Override
    public void sendMessage(int stateChange) {
        this.getMediator().getMessage(stateChange, this.getName());
    }

    public void sendSound(int stateChange) {
        sendMessage(stateChange);
    }

    public void startTV() {
        System.out.println("TV is starting");
    }

    public void stopTV() {
        System.out.println("TV is stopping");
    }
}
