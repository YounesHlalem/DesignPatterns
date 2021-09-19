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
public class Main {
    public static void main(String[] args) {
        Coffee coffee = new Coffee();
        Tea tea = new Tea();
        
        coffee.prepareRecipe();
        tea.prepareRecipe();
    }
}
