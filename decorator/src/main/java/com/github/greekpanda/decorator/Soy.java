package com.github.greekpanda.decorator;

import java.math.BigDecimal;

/**
 * @author GreePanda
 * @version 1.0
 * @date 2020/5/2 09:01
 */
public class Soy extends Decorator {
    public Soy(Drink obj) {
        super(obj);
        setDescription("Soy");
        setPrice(BigDecimal.valueOf(1.5));
    }
}
