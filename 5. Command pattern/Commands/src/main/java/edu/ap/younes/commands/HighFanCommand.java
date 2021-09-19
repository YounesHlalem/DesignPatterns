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
public class HighFanCommand implements Command{
    Fan fan;
    int prevspeed;

    public HighFanCommand(Fan prev) {
        fan = prev;
    }
    
    @Override
    public void execute() {
        prevspeed = fan.getSpeed();
        fan.execute();
    }

    @Override
    public void undo() {
        switch(fan.getSpeed()){
            case 1: ;
            case 2: ;
            case 3: ;
        }
    }
}
