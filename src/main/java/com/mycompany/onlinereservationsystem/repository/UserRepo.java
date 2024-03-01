/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.onlinereservationsystem.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;

public class UserRepo {
    
    private Connection con;
    
    public UserRepo() {
        this.con = ConnectionProvider.getConnection();
    }
    
    public Integer getUserByIdAndPassword(String username, String password) {
        try {
            String query = "select * from users where email = '" + username + "' and password = '" + password + "';";
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            if (rs.next()) {
                return 1;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }
    
    public Integer createUser(String firstName, String secondName, String email, String password, Integer age, String gender, String address) {
        Integer result = 0;
        try {
            
            PreparedStatement ps = con.prepareStatement("insert into users values(?,?,?,?,?,?,?)");
            ps.setString(1, firstName);
            ps.setString(2, secondName);
            ps.setString(3, email);
            ps.setString(4, password);
            ps.setInt(5, age);
            ps.setString(6, gender);
            ps.setString(7, address);
            
            result = ps.executeUpdate();
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return result;
    }
    
    public List<List<String>> getBookedTickets(String userName) {
        List<List<String>> ticketDetails = new ArrayList<>();
        try {
            PreparedStatement ps = con.prepareStatement("select pnr,train_name,train_number,date from reservation where user = ?");
            ps.setString(1, userName);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                List<String> ticketDetail = new ArrayList<>();
                ticketDetail.add(rs.getString("pnr"));
                ticketDetail.add(rs.getString("train_name"));
                ticketDetail.add(rs.getString("train_number"));
                ticketDetail.add(rs.getString("date"));
                ticketDetails.add(ticketDetail);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ticketDetails;
    }
    
}
