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
public class NyPizza extends PizzaStore{

    public NyPizza(SimplePizzaFactory factory) {
        super(factory);
    }

    @Override
    Pizza createPizza(String type) {
        Pizza pizza = null;
        switch(type){
            case "cheese": pizza = new CheesePizza(); break; /*New york Pizza*/
            case "veggie": pizza = new VeggiePizza(); break; /*New york Pizza*/
        }
        return pizza;
    }
    
}
