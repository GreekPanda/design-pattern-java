package com.github.greekpanda.decorator;

import java.math.BigDecimal;

/**
 * @author GreePanda
 * @version 1.0
 * @date 2020/5/2 08:49
 */
public class Expresso extends Coffee{
    public Expresso() {
        setDescription("Italy coffee");
        setPrice(BigDecimal.valueOf(10.0));
    }
}
