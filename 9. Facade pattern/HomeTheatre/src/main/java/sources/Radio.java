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
public class Radio {
    boolean onoff;
    int channel;

    public Radio() {
        onoff = false;
    }

    public void setChannel(int channel) {
        this.channel = channel;
    }
    
    public void play(Speaker sp){
        System.out.println("Channel " + channel + " playing.");
        sp.play();
    }
    
    public void stop(Speaker sp){
        System.out.println("Stopping");
        sp.stop();
    }
    
    public void on(){
        onoff = true;
    }
    
    public void off(){
        onoff = false;
    }

    public boolean isOnoff() {
        return onoff;
    }
}
