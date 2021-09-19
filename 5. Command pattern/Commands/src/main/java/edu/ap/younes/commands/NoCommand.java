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
public class NoCommand implements Command{

    @Override
    public void execute() {
        System.out.println("Leeg slot");
    }

    @Override
    public void undo() {
        execute();
    }
    
}
