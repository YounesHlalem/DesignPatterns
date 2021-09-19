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
public class Main {
    public static void main(String[] args) {
        WeatherData data = new WeatherData();
        CurrentDisplay display = new CurrentDisplay(data);
        
        data.setMeasurements(1, 2, 3);
        data.setMeasurements(20, 20, 20);
        data.removeObserver(display);
        data.setMeasurements(5,5,5);
    }
}
