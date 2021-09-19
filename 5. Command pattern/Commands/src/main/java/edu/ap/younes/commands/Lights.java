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
public class Lights {
    boolean onoff;
    boolean brightness;

    public Lights() {
        onoff = false;
        brightness = false;
    }
    
    public void on(){
        System.out.println("Lights on");
        onoff = true;
    }
    
    public void off(){
        System.out.println("Lights off");
        onoff = false;
    }
    
    public void dim(){
        System.out.println("Lights dim");
        brightness = false;
    }
    
    public void bright(){
        System.out.println("Lights bright");
        brightness = true;
    }
}
