/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ap.younes.ducksim;

import TurkeyAdapter.Turkey;
import TurkeyAdapter.TurkeyAdapter;

/**
 *
 * @author Younes
 */
public class Main {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        Duck decoy = new DecoyDuck();
        Turkey turkey = new Turkey();
        
        ducks(mallard);
        System.out.println("");
        ducks(decoy);
        System.out.println("");
        turkey.display();
        turkey.fly();
        turkey.gobble();
        System.out.println("");
        ducks(new TurkeyAdapter(turkey));
    }
    public static void ducks(Duck d){
        d.display();
        d.performFly();
        d.performQuack();
    }
}
