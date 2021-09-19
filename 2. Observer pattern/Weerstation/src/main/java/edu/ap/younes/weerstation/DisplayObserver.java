/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ap.younes.weerstation;
import java.util.Observable;
import java.util.Observer;
/**
 *
 * @author Younes
 */
public class DisplayObserver implements DisplayElement, Observer {
    private float temperature;
    private float hummidity;
    private Observable weatherData;

    public DisplayObserver(Observable o) {
        
        this.weatherData = o;
        weatherData.addObserver(this);
    }
    
    @Override
    public void display() {
        System.out.println("Current: " + temperature + "°C and " + hummidity + "% hummidity.");
    }

    @Override
    public void update(Observable o, Object arg) {
        if(o instanceof WeatherObservable){
            WeatherObservable we = (WeatherObservable) o; 
            
            this.temperature = we.getTemperature();
            this.hummidity = we.getHumidity();
            display();
        }
        
    }
}
