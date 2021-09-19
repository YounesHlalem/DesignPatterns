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
public class Milk extends CondimentDecorator{
    /*decorator component*/
    Beverage beverage;

    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }
    
    @Override
    public String getDescription() {
        return beverage.getDescription() + ", extra milk";
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.45;
    }
    
    
}
