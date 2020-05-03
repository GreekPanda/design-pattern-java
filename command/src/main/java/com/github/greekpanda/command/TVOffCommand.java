package com.github.greekpanda.command;

/**
 * @author GreePanda
 * @version 1.0
 * @date 2020/5/4 07:29
 */
public class TVOffCommand  implements Command{
    TVReceiver tvReceiver;

    public TVOffCommand(TVReceiver tvReceiver) {
        this.tvReceiver = tvReceiver;
    }

    @Override
    public void execute() {
        tvReceiver.off();
    }

    @Override
    public void undo() {
        tvReceiver.on();
    }
}
