/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ap.younes.dbconnoef;

/**
 *
 * @author Younes
 */
public class Main {
    public static void main(String[] args) {
        DatabaseConnect db = DatabaseConnect.getInstance("you", "hla");
        System.out.println("first connection");
        System.out.println(db.SqlCommand());
        System.out.println("User: " + db.getUserName());
        System.out.println("");
        db.OpenOrCloseConnection();
        System.out.println("trying new connection");
        db = DatabaseConnect.getInstance("ani", "sar");
        System.out.println(db.SqlCommand());
        System.out.println("User: " + db.getUserName());
        db.OpenOrCloseConnection();
        System.out.println(db.SqlCommand());
    }
}