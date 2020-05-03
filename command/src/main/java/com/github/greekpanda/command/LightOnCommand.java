package com.github.greekpanda.command;

/**
 * @author GreePanda
 * @version 1.0
 * @date 2020/5/3 14:55
 */
public class LightOnCommand implements Command {

    LightReceiver lightReceiver;

    public LightOnCommand(LightReceiver lightReceiver) {
        this.lightReceiver = lightReceiver;
    }

    @Override
    public void execute() {
        //调用接受者的方法
        lightReceiver.on();
    }

    @Override
    public void undo() {
        //撤销接受者的方法
        lightReceiver.off();
    }
}
