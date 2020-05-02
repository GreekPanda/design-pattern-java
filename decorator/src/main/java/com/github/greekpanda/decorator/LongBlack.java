package com.github.greekpanda.decorator;

import java.math.BigDecimal;

/**
 * @author GreePanda
 * @version 1.0
 * @date 2020/5/2 08:51
 */
public class LongBlack extends Coffee {
    public LongBlack() {
        setDescription("U.S");
        setPrice(BigDecimal.valueOf(15));
    }
}
