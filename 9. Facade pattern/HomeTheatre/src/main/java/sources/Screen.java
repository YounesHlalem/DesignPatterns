/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sources;

/**
 *
 * @author Younes
 */
public class Screen {
    boolean onoff;

    public Screen() {
        onoff = false;
    }
    
    public void play(){
        if(onoff)System.out.println("Showing screen...");
    }
    
    public void stop(){
        if(onoff)System.out.println("No screen...");
    }
    
    public void on(){
        onoff = true;
    }
    
    public void off(){
        onoff = false;
    }
}
