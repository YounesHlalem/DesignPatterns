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
public class HasQuarterState implements State{
    GumballMachine gumball;

    public HasQuarterState(GumballMachine gumball) {
        this.gumball = gumball;
    }

    @Override
    public void insert() {
        System.out.println("Already inserted quarter");
    }

    @Override
    public void eject() {
        System.out.println("Taking back quarter");
        gumball.setState(gumball.getNoquarter());
    }

    @Override
    public void turn() {
        System.out.println("Turning...");
        gumball.setState(gumball.getSold());
    }

    @Override
    public void dispense() {
        System.out.println("not dispensed");
    }
}
