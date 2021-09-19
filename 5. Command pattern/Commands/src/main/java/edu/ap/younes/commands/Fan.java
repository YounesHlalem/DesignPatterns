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
enum Fan
{ 
    HIGH, LOW, MID; 
  
    private int speed;
    
    public void execute() 
    { 
        switch(this){
            case HIGH:System.out.println("Fan is on high"); speed = 3; break;
            case LOW:System.out.println("Fan is on low");speed = 1; break;
            case MID:System.out.println("Fan is on mid");speed = 2; break;
        }
    }
    public int getSpeed(){
        return speed;
    }
} 
