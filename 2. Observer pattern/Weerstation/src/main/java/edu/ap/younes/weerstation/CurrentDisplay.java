/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ap.younes.weerstation;

/**
 *
 * @author Younes
 */
public class CurrentDisplay implements DisplayElement, Observer{
    private float temperature;
    private float hummidity;
    private Subject weatherData;

    public CurrentDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }
    
    @Override
    public void update(float temp, float hum, float press) {
        this.temperature = temp;
        this.hummidity = hum;
        display();
    }
    
    @Override
    public void display() {
        System.out.println("Current: " + temperature + "°C and " + hummidity + "% hummidity.");
    }
}
