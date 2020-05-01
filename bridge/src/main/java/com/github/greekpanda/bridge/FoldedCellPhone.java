package com.github.greekpanda.bridge;

/**
 * @author GreePanda
 * @version 1.0
 * @date 2020/5/1 16:00
 */
public class FoldedCellPhone extends  CellPhone {
    public FoldedCellPhone(Brand brand) {
        super(brand);
    }

    public void on() {
        super.on();
        System.out.println("Folded cell phone is on");
    }

    public void shutDown() {
        super.shutDown();
        System.out.println("Folded cell phone shuts down ");
    }

    public void call() {
        super.call();
        System.out.println("Folded cell phone calls");
    }
}
