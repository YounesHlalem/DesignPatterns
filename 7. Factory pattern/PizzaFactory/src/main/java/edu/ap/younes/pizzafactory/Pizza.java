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
public abstract class Pizza {
    public abstract void prepare();
    
    public void bake(){
        System.out.println("Baking the pizza");
    }
    
    public void cut(){
        System.out.println("Cutting the pizza");
    }
    
    public void box(){
        System.out.println("Putting pizza in the box");
    }
}
