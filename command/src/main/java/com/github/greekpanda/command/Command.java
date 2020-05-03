package com.github.greekpanda.command;

/**
 * @author GreePanda
 * @version 1.0
 * @date 2020/5/3 14:54
 */
public interface Command {
    //执行某个动作
    public void execute();
    //撤销某个动作
    public void undo();
}
