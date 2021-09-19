/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fly;

/**
 *
 * @author Younes
 */
public class FlyNoWings implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("Not flying");
    }
}
