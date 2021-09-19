/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TurkeyAdapter;

/**
 *
 * @author Younes
 */
public class Turkey implements TurkeyInterface{

    @Override
    public void gobble() {
        System.out.println("gobble gobble");
    }

    @Override
    public void fly() {
        System.out.println("im flying for a short distance");
    }
    
    public void display(){
        System.out.println("im a turkey");
    }
    
}
