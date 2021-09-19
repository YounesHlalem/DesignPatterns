/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ap.younes.pizzafactory;

/**
 *
 * @author Younes
 */
public class VeggiePizza extends Pizza{
    public VeggiePizza() {
    }
    
    @Override
    public void prepare() {
        System.out.println("Preparing pizza with veggies");
    }
}
