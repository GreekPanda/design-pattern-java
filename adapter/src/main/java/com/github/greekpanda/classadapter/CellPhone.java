package com.github.greekpanda.classadapter;

/**
 * @author GreePanda
 * @version 1.0
 * @date 2020/5/1 14:24
 */
public class CellPhone {
    public void charging(IVoltage5V voltage5V) {

        if(voltage5V.output5V() ==5) {
            System.out.println("It can charge");
        } else if(voltage5V.output5V() > 5) {
            System.out.println("Higher than 5, it can't charge");
        }
    }
}
