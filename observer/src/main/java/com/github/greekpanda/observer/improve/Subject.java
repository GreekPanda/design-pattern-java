package com.github.greekpanda.observer.improve;

/**
 * @author GreePanda
 * @version 1.0
 * @date 2020/5/4 17:04
 */
public interface Subject {
    void registerObserver(Observer o);

    void removeObserver(Observer o);

    void notifyObservers();
}
