/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ap.younes.koffiestarbuzz;

/**
 *
 * @author Younes
 */
public abstract class Beverage {
    /*component*/
    String description = "unknown";

    public String getDescription() {
        return description;
    }
    
    public abstract double cost();
}
