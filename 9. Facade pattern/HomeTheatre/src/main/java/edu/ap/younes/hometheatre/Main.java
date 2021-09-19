/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ap.younes.hometheatre;

/**
 *
 * @author Younes
 */
public class Main {
    public static void main(String[] args) {
        TheatreFacade theatre = new TheatreFacade();
        
        theatre.startFavoriteMovie();
        theatre.changeChannel(1);
        theatre.stopMovie();
        theatre.playRadio();
        theatre.changeChannel(2020);
        theatre.stopRadio();
    }
}
