/*
     * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
     * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.onlinereservationsystem.service;

import com.mycompany.onlinereservationsystem.repository.ConnectionProvider;
import com.mycompany.onlinereservationsystem.repository.UserRepo;
import java.sql.Connection;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ankit
 */
public class UserService {

    private UserRepo userRepo;
    private Connection con;

    public UserService() {
        this.userRepo = new UserRepo();
        this.con = ConnectionProvider.getConnection();
    }

    public Integer login(String username, String password) {
        Integer result = this.userRepo.getUserByIdAndPassword(username, password);
        return result;
    }

    public Integer register(String firstName, String secondName, String email, String password, Integer age, String gender, String address) {
        Integer result = this.userRepo.createUser(firstName, secondName, email, password, age, gender, address);
        return result;
    }

    public List<List<String>> getBookedTickets(String userName) {
        List<List<String>> ticketDetails = new ArrayList<>();
        try {
            ticketDetails = this.userRepo.getBookedTickets(userName);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return ticketDetails;
    }

}
