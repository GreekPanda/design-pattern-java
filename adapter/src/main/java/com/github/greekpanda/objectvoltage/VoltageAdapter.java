package com.github.greekpanda.objectvoltage;

/**
 * @author GreePanda
 * @version 1.0
 * @date 2020/5/1 14:20
 */
public class VoltageAdapter implements IVoltage5V {

    //关联关系中的聚合关系
    private Voltage220V voltage220V;

    public VoltageAdapter(Voltage220V voltage220V) {
        this.voltage220V = voltage220V;
    }

    @Override
    public int output5V() {
        int dst = 0;
        if(voltage220V != null) {
            int src = voltage220V.output220V();
            dst = src / 44;
        }
        return dst;
    }
}
