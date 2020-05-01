package com.github.greekpanda.bridge;

/**
 * @author GreePanda
 * @version 1.0
 * @date 2020/5/1 16:01
 */
public class UprightCellPhone extends CellPhone {
    public UprightCellPhone(Brand brand) {
        super(brand);
    }

    public void on() {
        super.on();
        System.out.println("Upright cell phone is on");
    }

    public void shutDown() {
        super.shutDown();
        System.out.println("Upright cell phone shut down");
    }

    public void call() {
        super.call();
        System.out.println("Upright cell phone call");
    }

}
