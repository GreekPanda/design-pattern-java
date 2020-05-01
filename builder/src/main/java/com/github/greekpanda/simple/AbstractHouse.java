package com.github.greekpanda.simple;

/**
 * @author GreePanda
 * @version 1.0
 * @date 2020/5/1 09:14
 */
public abstract  class AbstractHouse {
    public abstract void buildBasic();
    public abstract void buildWalls();
    public abstract void roofed();

    public void build() {
        buildBasic();
        buildWalls();
        roofed();
    }
}
