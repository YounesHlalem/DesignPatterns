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
public class DvdPlayer {
    boolean onoff;
    String movie;

    public DvdPlayer() {
        onoff = false;
    }

    public void setMovie(String movie) {
        System.out.println(movie + " chosen");
        this.movie = movie;
    }
    
    public void play(Speaker sp, Screen sc){
        System.out.println("Movie " + movie + " playing.");
        sp.play();
        sc.play();
    }
    
    public void stop(Speaker sp, Screen sc){
        System.out.println("Movie stopping");
        sp.stop();
        sc.stop();
    }
    
    public void on(){
        onoff = true;
    }
    
    public void off(){
        onoff = false;
    }
}
