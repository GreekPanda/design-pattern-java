package com.github.greekpanda.mediator;

/**
 * @author GreePanda
 * @version 1.0
 * @date 2020/5/5 07:38
 */
public class Alarm extends Colleague {
    public Alarm(Mediator mediator, String name) {
        super(mediator, name);
        mediator.register(name, this);
    }

    @Override
    public void sendMessage(int stateChange) {
        this.getMediator().getMessage(stateChange, this.getName());
    }

    public void sendAlarm(int stateChange) {
        sendMessage(stateChange);
    }
}
