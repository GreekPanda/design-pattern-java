package com.github.greekpanda.visitor;

/**
 * @author GreePanda
 * @version 1.0
 * @date 2020/5/4 08:05
 */
public class Man extends Person {
    @Override
    public void accept(Action action) {
        action.getManResult(this);
    }
}
