package com.github.greekpanda.observer;

import java.math.BigDecimal;

/**
 * @author GreePanda
 * @version 1.0
 * @date 2020/5/4 16:44
 */
public class CurrentCondition {
    private BigDecimal temperature;
    private BigDecimal pressure;
    private BigDecimal humidity;

    public BigDecimal getTemperature() {
        return temperature;
    }

    public void setTemperature(BigDecimal temperature) {
        this.temperature = temperature;
    }

    public BigDecimal getPressure() {
        return pressure;
    }

    public void setPressure(BigDecimal pressure) {
        this.pressure = pressure;
    }

    public BigDecimal getHumidity() {
        return humidity;
    }

    public void setHumidity(BigDecimal humidity) {
        this.humidity = humidity;
    }

    public void display() {
        System.out.println("Today's temperature is : " + temperature);
        System.out.println("Today's pressure is : " + pressure);
        System.out.println("Today's humidity is : " + humidity);
    }

    public  void update(BigDecimal temperature, BigDecimal pressure, BigDecimal humidity) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        display();
    }
}
