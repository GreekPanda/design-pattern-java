package com.github.greekpanda.memento;

import java.util.ArrayList;
import java.util.List;

/**
 * @author GreePanda
 * @version 1.0
 * @date 2020/5/5 08:41
 */
public class CareTaker {
    private List<Memento> mementoList = new ArrayList<>();

    public void add(Memento memento) {
        mementoList.add(memento);
    }

    public void remove(Memento memento) {
        mementoList.remove(memento);
    }

    public Memento get(int index) {
        return mementoList.get(index);
    }
}
