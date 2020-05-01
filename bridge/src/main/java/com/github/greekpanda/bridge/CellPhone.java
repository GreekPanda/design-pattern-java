package com.github.greekpanda.bridge;

/**
 * @author GreePanda
 * @version 1.0
 * @date 2020/5/1 15:57
 */
public abstract class CellPhone {
    private Brand brand;

    public CellPhone(Brand brand) {
        this.brand = brand;
    }

    protected void on() {
        brand.on();
    }

    protected void shutDown() {
        brand.shutDown();
    }

    protected void call() {
        brand.call();
    }
}
