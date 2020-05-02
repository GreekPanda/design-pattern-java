package com.github.greekpanda.decorator;

import java.math.BigDecimal;

/**
 * @author GreePanda
 * @version 1.0
 * @date 2020/5/2 08:48
 */
public class Coffee extends Drink{
    @Override
    public BigDecimal cost() {
        return super.getPrice();
    }
}
