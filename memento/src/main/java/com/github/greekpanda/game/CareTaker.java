package com.github.greekpanda.game;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * 守护者对象，保存游戏角色的状态
 *
 * @author GreePanda
 * @version 1.0
 * @date 2020/5/5 11:24
 */
public class CareTaker {

    private Memento memento;
    private List<Memento> mementos;

    //多个游戏的角色
    private HashMap<String, ArrayList<Memento>> roleMemento;

    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }
}
