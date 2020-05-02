package com.github.greekpanda.decorator;

import java.math.BigDecimal;

/**
 * @author GreePanda
 * @version 1.0
 * @date 2020/5/2 09:00
 */
public class Milk extends Decorator {
    public Milk(Drink obj) {
        super(obj);
        setDescription("milk");
        setPrice(BigDecimal.valueOf(2.0));
    }
}
