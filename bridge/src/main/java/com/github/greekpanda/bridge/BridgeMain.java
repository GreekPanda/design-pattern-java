package com.github.greekpanda.bridge;

/**
 * @author GreePanda
 * @version 1.0
 * @date 2020/5/1 16:05
 */
public class BridgeMain {
    public static void main(String[] args) {
        CellPhone cellPhone = new FoldedCellPhone(new XiaoMi());
        cellPhone.on();
        cellPhone.call();
        cellPhone.shutDown();

        System.out.println("------------------------------");
        CellPhone cellPhone1 = new FoldedCellPhone(new Vivo());
        cellPhone1.on();
        cellPhone1.call();
        cellPhone1.shutDown();

        System.out.println("===============================");

        CellPhone cellPhone2 = new UprightCellPhone(new XiaoMi());
        cellPhone2.on();
        cellPhone2.call();
        cellPhone2.shutDown();

        System.out.println("---------------------------------");

        CellPhone cellPhone3 = new UprightCellPhone(new Vivo());
        cellPhone3.on();
        cellPhone3.call();
        cellPhone3.shutDown();
    }
}
