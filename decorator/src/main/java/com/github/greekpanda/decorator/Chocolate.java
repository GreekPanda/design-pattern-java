package com.github.greekpanda.decorator;

import java.math.BigDecimal;

/**
 * @author GreePanda
 * @version 1.0
 * @date 2020/5/2 08:58
 */
public class Chocolate extends Decorator{

    public Chocolate(Drink obj) {
        super(obj);
        setPrice(BigDecimal.valueOf(1));
        setDescription("chocolate");

    }
}
