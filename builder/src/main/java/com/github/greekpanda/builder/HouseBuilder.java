package com.github.greekpanda.builder;

/**
 * @author GreePanda
 * @version 1.0
 * @date 2020/5/1 09:26
 */
public abstract class HouseBuilder {
    protected House house = new House();

    public abstract void buildBasic();
    public abstract void buildWalls();
    public abstract void buildRoof();

    public House buildHouse() {
        return house;
    }

}
