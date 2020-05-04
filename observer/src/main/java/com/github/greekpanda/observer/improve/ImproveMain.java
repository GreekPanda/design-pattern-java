package com.github.greekpanda.observer.improve;

import java.math.BigDecimal;
import java.util.Observable;

/**
 * @author GreePanda
 * @version 1.0
 * @date 2020/5/4 17:25
 */
public class ImproveMain {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        //创建观察者
        CurrentCondition currentCondition = new CurrentCondition();
        weatherData.registerObserver(currentCondition);

        weatherData.setData(BigDecimal.valueOf(10),BigDecimal.valueOf(100),BigDecimal.valueOf(30.0));
        weatherData.dataChange();

        weatherData.removeObserver(currentCondition);

        Observable observable = new Observable();
    }
}
