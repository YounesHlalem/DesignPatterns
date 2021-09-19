/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ap.younes.gumballmachine;

/**
 *
 * @author Younes
 */
public class SoldState implements State{
    GumballMachine gumball;

    public SoldState(GumballMachine gumball) {
        this.gumball = gumball;
    }

    @Override
    public void insert() {
        System.out.println("Already inserted quarter");
    }

    @Override
    public void eject() {
        System.out.println("Already turned");
    }

    @Override
    public void turn() {
        System.out.println("Already turned");
    }

    @Override
    public void dispense() {
        System.out.println("dispensing gumball");
    }
}
