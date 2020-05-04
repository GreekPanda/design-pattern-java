package com.github.greekpanda.observer.improve;

import java.math.BigDecimal;

/**
 * @author GreePanda
 * @version 1.0
 * @date 2020/5/4 17:07
 */
public interface Observer {
    public void update(BigDecimal temperature, BigDecimal pressure, BigDecimal humidity);
}
