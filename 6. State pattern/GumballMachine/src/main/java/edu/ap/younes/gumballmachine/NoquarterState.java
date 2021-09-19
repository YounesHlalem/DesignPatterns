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
public class NoquarterState implements State{
    GumballMachine gumball;

    public NoquarterState(GumballMachine gumball) {
        this.gumball = gumball;
    }

    @Override
    public void insert() {
        System.out.println("Inserting quarter");
        gumball.setState(gumball.getHasquarter());
    }

    @Override
    public void eject() {
        System.out.println("No quarter");
    }

    @Override
    public void turn() {
        System.out.println("No quarter");
    }

    @Override
    public void dispense() {
        System.out.println("no quarter");
    }
}
