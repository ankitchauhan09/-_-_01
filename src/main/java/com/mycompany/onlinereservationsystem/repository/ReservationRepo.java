/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.onlinereservationsystem.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.UUID;

/**
 *
 * @author ankit
 */
public class ReservationRepo {

    private Connection con;

    public ReservationRepo() {
        this.con = ConnectionProvider.getConnection();
    }

    public String reserveTicket(String from, String to, String date, String trainName, String trainNumber, String userEmail) {
        String result = "";

        try {

            if (con != null) {

                UUID uuid = UUID.randomUUID();
                String uuidString = uuid.toString().replace("-", "");
                String pnr = uuidString.substring(0, 11);
                pnr = pnr.toUpperCase();
                PreparedStatement ps = con.prepareStatement("insert into reservation(pnr, `from`, `to`, date, train_name, train_number, user) values(?,?,?,?,?,?,?);");
                ps.setString(1, pnr);
                ps.setString(2, from);
                ps.setString(3, to);
                ps.setString(4, date);
                ps.setString(5, trainName);
                ps.setString(6, trainNumber);
                ps.setString(7, userEmail);

                ps.executeUpdate();
                
                return pnr;

            } else {
                return "";
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return result;
    }
    
    public Integer cancelTicket(String username, String pnr){
        Integer status = 0;
        try{
            PreparedStatement ps = con.prepareStatement("DELETE from reservation where user = ? and pnr = ?");  
            ps.setString(1, username);
            ps.setString(2, pnr);
            status = ps.executeUpdate();
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return status;
    }

}
