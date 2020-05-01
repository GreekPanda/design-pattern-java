package com.github.greekpanda.classvoltage;

/**
 * @author GreePanda
 * @version 1.0
 * @date 2020/5/1 14:20
 */
public class VoltageAdapter extends Voltage220V implements IVoltage5V {

    //使用的是继承关系
    @Override
    public int output5V() {
        int src = output220V();
        int dst = src / 44;

        return dst;
    }
}
