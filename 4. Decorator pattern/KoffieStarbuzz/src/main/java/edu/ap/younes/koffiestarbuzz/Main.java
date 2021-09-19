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
public class Main {
    public static void main(String[] args) {
        Beverage be1 = new Decaf();
        Beverage be2 = new Espresso();
        
        System.out.println(be1.getDescription() + " €" + be1.cost());
        
        be1 = new Milk(be1);
        be1 = new Mocha(be1);
        System.out.println(be1.getDescription() + " €" + be1.cost());
        
        be2 = new Mocha(be2);
        System.out.println(be2.getDescription() + " €" + be2.cost());
        
    }
}
