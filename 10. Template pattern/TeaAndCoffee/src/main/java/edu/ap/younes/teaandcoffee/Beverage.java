/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ap.younes.teaandcoffee;

/**
 *
 * @author Younes
 */
public abstract class Beverage {
    final void prepareRecipe(){
        boilWater();
        brew();
        pourInCup();
        if(wantsCondiments()){addCondiments();}
    }
    
    abstract void brew();
    abstract void addCondiments();
    
    private void boilWater(){
        System.out.println("Boiling water");
    }
    
    private void pourInCup(){
        System.out.println("Pouring in cup");
    }
    
    /*de Hook*/
    boolean wantsCondiments(){
        return false;
    }
}
