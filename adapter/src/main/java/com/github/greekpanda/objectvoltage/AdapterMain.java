package com.github.greekpanda.objectvoltage;

/**
 * @author GreePanda
 * @version 1.0
 * @date 2020/5/1 14:26
 */
public class AdapterMain {
    public static void main(String[] args) {
        CellPhone cellPhone = new CellPhone();
        cellPhone.charging(new VoltageAdapter(new Voltage220V()));
    }
}
