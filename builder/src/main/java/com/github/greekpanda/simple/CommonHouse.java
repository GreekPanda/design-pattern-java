package com.github.greekpanda.simple;

/**
 * @author GreePanda
 * @version 1.0
 * @date 2020/5/1 09:16
 */
public class CommonHouse extends AbstractHouse {
    @Override
    public void buildBasic() {
        System.out.println("basic module");
    }

    @Override
    public void buildWalls() {
        System.out.println("walls are building");

    }

    @Override
    public void roofed() {
        System.out.println("roof is on");
    }
}
