package com.github.greekpanda.command;

/**
 * 没有任何命令，不用控制，初始化所有的命令指令,调用空命令，对象不做任何动作
 * 这也是设计模式中一种，可以省略对于空的判断
 *
 * @author GreePanda
 * @version 1.0
 * @date 2020/5/3 15:01
 */
public class NoCommand implements Command {
    @Override
    public void execute() {

    }

    @Override
    public void undo() {

    }
}
