package com.github.greekpanda.mediator;

/**
 * @author GreePanda
 * @version 1.0
 * @date 2020/5/5 07:53
 */
public class Curtains extends Colleague {

    public Curtains(Mediator mediator, String name) {
        super(mediator, name);
        mediator.register(name, this);
    }

    @Override
    public void sendMessage(int stateChange) {
        this.getMediator().getMessage(stateChange, this.getName());
    }

    public void sendBuzz(int stateChange) {
        sendMessage(stateChange);
    }

    public void upCurtains() {
        System.out.println("Rise up curtains");
    }
}
