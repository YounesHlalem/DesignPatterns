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
public class BrightLightsCommand  implements Command{
    Lights light;

    public BrightLightsCommand() {
        light = new Lights();
    }
    
    @Override
    public void execute() {
        light.bright();
    }

    @Override
    public void undo() {
        light.dim();
    }
}
