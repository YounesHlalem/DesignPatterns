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
public class Decaf extends Beverage{
    /*concrete component*/
    public Decaf() {
        description = "Decaf coffee";
    }

    @Override
    public double cost() {
        return .89;
    }
    
    
}
