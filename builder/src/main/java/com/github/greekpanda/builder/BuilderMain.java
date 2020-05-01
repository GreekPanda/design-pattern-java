package com.github.greekpanda.builder;

/**
 * @author GreePanda
 * @version 1.0
 * @date 2020/5/1 09:35
 */
public class BuilderMain {
    public static void main(String[] args) {
        CommonHouse commonHouse = new CommonHouse();

        HouseDirector houseDirector = new HouseDirector();
        houseDirector.setHouseBuilder(commonHouse);

        House house = houseDirector.buildHouse();

        HighBuilding highBuilding = new HighBuilding();

        houseDirector.setHouseBuilder(highBuilding);
        House house1 = houseDirector.buildHouse();
    }
}
