package com.github.greekpanda.decorator;

import java.math.BigDecimal;

/**
 * @author GreePanda
 * @version 1.0
 * @date 2020/5/2 08:51
 */
public class ShortBlack extends Coffee {
    public ShortBlack() {
        setDescription("Short black");
        setPrice(BigDecimal.valueOf(5));
    }
}
