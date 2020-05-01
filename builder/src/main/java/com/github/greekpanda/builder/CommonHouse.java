package com.github.greekpanda.builder;

/**
 * @author GreePanda
 * @version 1.0
 * @date 2020/5/1 09:29
 */
public class CommonHouse extends HouseBuilder {
    @Override
    public void buildBasic() {
        System.out.println("common basic");
    }

    @Override
    public void buildWalls() {

        System.out.println("common walls");
    }

    @Override
    public void buildRoof() {
        System.out.println("common roof");
    }

    @Override
    public House buildHouse() {
        return super.buildHouse();
    }
}
