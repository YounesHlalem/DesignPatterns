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
public abstract class SimplePizzaFactory {
    public Pizza createPizza(String type){
        Pizza pizza = null;
        switch(type){
            case "cheese": pizza = new CheesePizza(); break;
            case "veggie": pizza = new VeggiePizza(); break;
        }
        return pizza;
    }
}
