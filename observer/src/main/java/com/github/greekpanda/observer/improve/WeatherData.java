package com.github.greekpanda.observer.improve;

import com.github.greekpanda.observer.CurrentCondition;

import java.math.BigDecimal;
import java.util.ArrayList;

/**
 * @author GreePanda
 * @version 1.0
 * @date 2020/5/4 16:47
 */
public class WeatherData implements Subject{
    private BigDecimal temperature;
    private BigDecimal pressure;
    private BigDecimal humidity;

    private ArrayList<Observer> observerArrayList;


    public WeatherData() {
        this.observerArrayList = new ArrayList<>();
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

    public void dataChange() {
        //currentCondition.update(getTemperature(), getPressure(), getHumidity());
        notifyObservers();
    }

    public void setData(BigDecimal temperature, BigDecimal pressure, BigDecimal humidity) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        dataChange();
    }

    @Override
    public void registerObserver(Observer o) {
        observerArrayList.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        if(observerArrayList.contains(o))
            observerArrayList.remove(o);
    }

    @Override
    public void notifyObservers() {
        for(int i = 0; i < observerArrayList.size(); ++i) {
            observerArrayList.get(i).update(temperature, pressure, humidity);
        }
    }

}
