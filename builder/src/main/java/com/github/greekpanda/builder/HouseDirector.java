package com.github.greekpanda.builder;

/**
 * @author GreePanda
 * @version 1.0
 * @date 2020/5/1 09:32
 */
public class HouseDirector {
    HouseBuilder houseBuilder = null;

    public HouseBuilder getHouseBuilder() {
        return houseBuilder;
    }

    public void setHouseBuilder(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    public House buildHouse() {
        houseBuilder.buildBasic();
        houseBuilder.buildWalls();
        houseBuilder.buildRoof();

        return houseBuilder.buildHouse();
    }
}
