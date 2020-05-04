package com.github.greekpanda.observer;

import java.math.BigDecimal;

/**
 * @author GreePanda
 * @version 1.0
 * @date 2020/5/4 16:43
 */
public class ObserverMain {
    public static void main(String[] args) {
        BigDecimal temperature = new BigDecimal(30.0);
        BigDecimal pressure = new BigDecimal(1000);
        BigDecimal humidity = new BigDecimal(0.5);

        CurrentCondition currentCondition = new CurrentCondition();
        WeatherData weatherData = new WeatherData(currentCondition);
        weatherData.setData(temperature, pressure, humidity);

    }
}
