/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ap.younes.commands;

/**
 *
 * @author Younes
 */
public class SimpleController {
    Command slot;

    public SimpleController() {
    }
    
    public void setCommand(Command slot) {
        this.slot = slot;
    }
    
    public void pressButton() {
        slot.execute();
    }
    
    
}
