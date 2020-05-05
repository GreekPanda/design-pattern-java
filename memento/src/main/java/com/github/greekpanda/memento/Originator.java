package com.github.greekpanda.memento;

/**
 * @author GreePanda
 * @version 1.0
 * @date 2020/5/5 08:36
 */
public class Originator {
    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    //保存状态对象，放置到memento，编写一个方法返回memento
    public Memento save() {
        return new Memento(state);
    }

    //通过备忘录对象恢复状态，恢复到属性即可
    public void getStateFromMemento(Memento memento) {
        this.state = memento.getState();
    }

}
