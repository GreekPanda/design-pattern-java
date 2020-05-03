package com.github.greekpanda.command;

/**
 * @author GreePanda
 * @version 1.0
 * @date 2020/5/4 07:26
 */
public class TVOnCommand implements Command{
    TVReceiver tvReceiver;

    public TVOnCommand(TVReceiver tvReceiver) {
        this.tvReceiver = tvReceiver;
    }

    @Override
    public void execute() {
        tvReceiver.on();
    }

    @Override
    public void undo() {
        tvReceiver.off();
    }
}
