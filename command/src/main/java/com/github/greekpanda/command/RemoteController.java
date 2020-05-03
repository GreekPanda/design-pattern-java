package com.github.greekpanda.command;

/**
 * @author GreePanda
 * @version 1.0
 * @date 2020/5/3 15:03
 */
public class RemoteController {
    //开按钮命令数组
    Command[] onCommands;
    Command[] offCommands;
    Command undoCommands;

    public RemoteController() {
        this.onCommands = new Command[5];
        this.offCommands = new Command[5];

        for(int i = 0; i < 5; i++) {
            onCommands[i] = new NoCommand();
            offCommands[i] = new NoCommand();
        }
    }

    //给按钮设置需要的命令即可
    public void setCommands(int no, Command onCommand, Command offCommand) {
        onCommands[no] = onCommand;
        offCommands[no] = offCommand;

    }

    public void onButtonWasPushed(int no) {
        onCommands[no].execute();
        //记录本次的操作用于撤销
        undoCommands = onCommands[no];
    }

    public void offButtonWasPushed(int no) {
        offCommands[no].execute();
        undoCommands = offCommands[no];
    }

    public void undoButtonWasPushed() {
        undoCommands.undo();
    }
}
