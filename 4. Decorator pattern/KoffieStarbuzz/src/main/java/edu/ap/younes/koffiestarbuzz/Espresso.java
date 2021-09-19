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
public class Espresso extends Beverage{
    /*concrete component*/
    public Espresso() {
        description = "Espresso coffee";
    }

    @Override
    public double cost() {
        return 1.2;
    }
}
