/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ap.younes.gumballmachine;

/**
 *
 * @author Younes
 */
public interface State {
    public void insert();
    public void eject();
    public void turn();
    public void dispense();
}
