/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ap.younes.teaandcoffee;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Younes
 */
public class Tea extends Beverage{

    @Override
    void brew() {
        System.out.println("steeping the tea");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding lemon");
    }

    @Override
    boolean wantsCondiments() {
        System.out.println("Do you want condiments?");
        String answer = null;
        
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        try {
            answer = in.readLine();
        } catch (IOException ex) {
            Logger.getLogger(Tea.class.getName()).log(Level.SEVERE, null, ex);
        }
        return answer.toLowerCase().startsWith("y");
    }
    
    
}
