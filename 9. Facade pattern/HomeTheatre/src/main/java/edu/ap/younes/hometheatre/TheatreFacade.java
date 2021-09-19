/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ap.younes.hometheatre;

import sources.DvdPlayer;
import sources.Radio;
import sources.Screen;
import sources.Speaker;

/**
 *
 * @author Younes
 */
public class TheatreFacade {
    private Screen screen;
    private Speaker speaker;
    private Radio radio;
    private DvdPlayer dvd;

    public TheatreFacade() {
        screen = new Screen();
        speaker = new Speaker();
        radio = new Radio();
        dvd = new DvdPlayer();
    }
    
    public void startFavoriteMovie(){
        screen.on();
        dvd.on();
        speaker.on();
        dvd.setMovie("Django unchained");
        dvd.play(speaker, screen);
    }
    
    public void stopMovie(){
        dvd.stop(speaker, screen);
        screen.off();
        dvd.off();
        speaker.off();
    }
    
    public void playRadio(){
        radio.on();
        speaker.on();
        radio.setChannel(1);
        radio.play(speaker);
    }
    
    public void stopRadio(){
        radio.stop(speaker);
        radio.off();
        speaker.off();
    }
    
    public void changeChannel(int ch){
        if(radio.isOnoff()){
            radio.setChannel(ch);
        radio.play(speaker);
        }else{
            System.out.println("Radio is off");
        }
    }
}
