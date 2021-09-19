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
public class DatabaseConnect {
    private static DatabaseConnect uniqueInstance;
    
    private String databaseName;
    private String ipAdress;
    private int portNr;
    private String userName;
    private String password;
    private boolean status;

    private DatabaseConnect(String username, String password) {
        this.password = password;
        this.userName = username;
        databaseName = "DB";
        ipAdress = "111";
        portNr = 1;
        status = true;
    }
    
    public static DatabaseConnect getInstance(String username, String password){
        if(uniqueInstance==null){
            uniqueInstance = new DatabaseConnect(username, password);
        }
        return uniqueInstance;
    } 
    
    public void OpenOrCloseConnection(){
        status = !status;
    }
    
    public String SqlCommand(){
        if(status){
            return("Response from " + databaseName);
        }else{
            return("Failed to connect to " + ipAdress + " via " + portNr);
        }
    }

    public String getUserName() {
        return userName;
    }
}
