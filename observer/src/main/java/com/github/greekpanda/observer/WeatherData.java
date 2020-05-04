package com.github.greekpanda.observer;

import java.math.BigDecimal;

/**
 * @author GreePanda
 * @version 1.0
 * @date 2020/5/4 16:47
 */
public class WeatherData {
    private BigDecimal temperature;
    private BigDecimal pressure;
    private BigDecimal humidity;

    private CurrentCondition currentCondition;

    public WeatherData(CurrentCondition currentCondition) {
        this.currentCondition = currentCondition;
    }

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

    private void dataChange() {
        currentCondition.update(getTemperature(), getPressure(), getHumidity());
    }

    public void setData(BigDecimal temperature, BigDecimal pressure, BigDecimal humidity) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        dataChange();
    }
}
