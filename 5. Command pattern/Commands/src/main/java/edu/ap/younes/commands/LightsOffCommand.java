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
public class LightsOffCommand implements Command{
    Lights light;

    public LightsOffCommand() {
        light = new Lights();
    }
    
    @Override
    public void execute() {
        light.off();
    }

    @Override
    public void undo() {
        light.on();
    }
    
}
