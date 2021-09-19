/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ap.younes.ducksim;

import Fly.FlyWithWings;
import Quack.Quack;

/**
 *
 * @author Younes
 */
public class MallardDuck extends Duck{

    public MallardDuck() {
        super.flybehavior = new FlyWithWings();
        super.quackbehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("Mallard duck");
    }
}
