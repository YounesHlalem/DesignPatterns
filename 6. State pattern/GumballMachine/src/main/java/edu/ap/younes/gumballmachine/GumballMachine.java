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
public class GumballMachine {
    State noquarter;
    State hasquarter;
    State sold;
    State soldout;
    State state;

    public GumballMachine(int number) {
        this.noquarter = new NoquarterState(this);
        this.hasquarter = new HasQuarterState(this);
        if(number > 0){
            state = noquarter;
        }else{
            state = soldout;
        }
    }
    
    public void insert() {
        state.insert();
    }

    public void eject() {
        state.eject();
    }

    public void turn() {
        state.turn();
    }

    public void dispense() {
        state.dispense();
    }
    
    public void setState(State state){
        this.state = state;
    }

    public State getNoquarter() {
        return noquarter;
    }

    public State getHasquarter() {
        return hasquarter;
    }

    public State getSold() {
        return sold;
    }

    public State getState() {
        return state;
    }

    public State getSoldout() {
        return soldout;
    }
}
