package com.github.greekpanda.voltage;

/**
 * @author GreePanda
 * @version 1.0
 * @date 2020/5/1 14:20
 */
public class VoltageAdapter extends Voltage220V implements IVoltage5V {

    @Override
    public int output5V() {
        int src = output220V();
        int dst = src / 44;

        return dst;
    }
}
