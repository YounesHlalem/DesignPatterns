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
public class Main {
    public static void main(String[] args) {
        GumballMachine gum = new GumballMachine(2);
        gum.insert();
        gum.dispense();
        gum.turn();
    }
}
