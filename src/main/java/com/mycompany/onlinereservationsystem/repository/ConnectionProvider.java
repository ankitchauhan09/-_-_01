/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.onlinereservationsystem.repository;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author ankit
 */
public class ConnectionProvider {
    
    public static Connection getConnection(){
        Connection con = null;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/onlinereservationsystem", "root", "ankit");
            if(con != null){
                System.out.println("Success");
            }
            else{
                System.out.println("Failed");
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
        
        
        return con;
    }
    
    public static void main(String[] args) {
        
    }
    
    
}
