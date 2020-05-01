package com.github.greekpanda.builder;

/**
 * @author GreePanda
 * @version 1.0
 * @date 2020/5/1 09:30
 */
public class HighBuilding extends HouseBuilder {
    @Override
    public void buildBasic() {
        System.out.println("highBuilding basic");
    }

    @Override
    public void buildWalls() {
        System.out.println("highBuilding walls ");

    }

    @Override
    public void buildRoof() {
        System.out.println("highBuilding roof");
    }

    @Override
    public House buildHouse() {
        return super.buildHouse();
    }
}
