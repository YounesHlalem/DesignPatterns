/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ap.younes.ducksim;

import Fly.FlyBehavior;
import Quack.QuackBehavior;

/**
 *
 * @author Younes
 */
public abstract class Duck {
    FlyBehavior flybehavior;
    QuackBehavior quackbehavior;
    
    public void swim(){
        System.out.println("Swim");
    }
    
    public void display(){}
    
    public void performQuack(){
        quackbehavior.quack();
    }
    
    public void performFly(){
        flybehavior.fly();
    }
    
    public void setQuackBehavior(QuackBehavior quackbehavior){
        this.quackbehavior = quackbehavior;
    }
    
    public void setFlyBehavior(FlyBehavior flybehavior){
        this.flybehavior = flybehavior;
    }
}
