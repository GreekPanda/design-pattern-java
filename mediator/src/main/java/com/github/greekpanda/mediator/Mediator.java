package com.github.greekpanda.mediator;

/**
 * @author GreePanda
 * @version 1.0
 * @date 2020/5/5 07:40
 */
public abstract class Mediator {
    public abstract void register(String colleagueName, Colleague colleague);

    public abstract void getMessage(int stateChange, String colleagueName);

    public abstract void sendMessage();
}
