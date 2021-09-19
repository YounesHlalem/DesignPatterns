/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ap.younes.weerstation;


import java.util.Observable;

/**
 *
 * @author Younes
 */
public class WeatherObservable extends Observable{
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherObservable() {
        temperature = 0;
        humidity = 0;
        pressure = 0;
    }
    
    public void setMeasurements(float temp, float hum, float press){
        this.temperature = temp;
        this.humidity = hum;
        this.pressure = press;
        setChanged();
        measurementsChanged();
    }
    
    public void measurementsChanged(){
        notifyObservers();
    }

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }
}
