/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ap.younes.teaandcoffee;

/**
 *
 * @author Younes
 */
public class Coffee extends Beverage{

    @Override
    void brew() {
        System.out.println("Dripping coffee trough filter");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding sugar and milk");
    }
    
}
