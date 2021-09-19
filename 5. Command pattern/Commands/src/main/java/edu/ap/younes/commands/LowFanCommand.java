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
public class LowFanCommand implements Command{
    Fan fan;
    Fan prevstate;

    public LowFanCommand(Fan prev) {
        fan = Fan.LOW;
        prevstate = prev;
    }
    
    @Override
    public void execute() {
        fan.execute();
    }

    @Override
    public void undo() {
        prevstate.execute();
    }
}
