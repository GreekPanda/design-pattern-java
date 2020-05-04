package com.github.greekpanda.visitor;

/**
 * @author GreePanda
 * @version 1.0
 * @date 2020/5/4 08:06
 */
public abstract class Person {
    //提供方法供访问者访问
    public abstract void accept(Action action);
}
