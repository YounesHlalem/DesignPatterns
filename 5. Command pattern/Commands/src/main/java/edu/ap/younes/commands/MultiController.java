/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ap.younes.commands;

import java.util.ArrayList;

/**
 *
 * @author Younes
 */
public class MultiController {
    int number = 4;
    Command[] onComm;
    Command[] offComm;
    Command undo;

    public MultiController() {
        onComm = new Command[number];
        offComm = new Command[number];
        Command no = new NoCommand();
        for (int i = 0; i < number; i++) {
            onComm[i] = no;
            offComm[i] = no;
        }
        undo = no;
    }
    
    public void setCommand(Command on, Command off, int slot){
        onComm[slot] = on;
        offComm[slot] = off;
    }
    
    public void onButten(int slot){
        onComm[slot].execute();
        undo = onComm[slot];
    }
    
    public void offButten(int slot){
        offComm[slot].execute();
        undo = offComm[slot];
    }
    
    public void undoButton(){
        undo.undo();
    }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();
        
        for (int i = 0; i < number; i++) {
            Command command = onComm[i];
            sb.append("[slot " + i + "] " + onComm[i].getClass().getName() + " - " + offComm[i].getClass().getName() + '\n');
        }
        return sb.toString();
    }
    
    
}
