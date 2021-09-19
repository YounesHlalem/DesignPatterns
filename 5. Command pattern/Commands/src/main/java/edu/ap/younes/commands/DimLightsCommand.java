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
public class DimLightsCommand implements Command{
    Lights light;

    public DimLightsCommand() {
        light = new Lights();
    }
    
    @Override
    public void execute() {
        light.dim();
    }

    @Override
    public void undo() {
        light.bright();
    }
}
