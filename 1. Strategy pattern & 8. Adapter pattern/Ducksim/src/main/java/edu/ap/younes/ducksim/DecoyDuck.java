/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ap.younes.ducksim;

import Fly.FlyNoWings;
import Quack.MuteQuack;
import Quack.Squeak;

/**
 *
 * @author Younes
 */
public class DecoyDuck extends Duck{

    public DecoyDuck() {
        super.flybehavior = new FlyNoWings();
        super.quackbehavior = new Squeak();
    }

    @Override
    public void display() {
        System.out.println("Decoy");
    }
    
}
