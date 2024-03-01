/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.onlinereservationsystem.service;

import com.mycompany.onlinereservationsystem.repository.ReservationRepo;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ankit
 */
public class ReservationService {

    private ReservationRepo reservationRepo;

    public ReservationService() {
        this.reservationRepo = new ReservationRepo();
    }

    public String bookTicket(String from, String to, String date, String trainName, String trainNumber, String userEmail) {
        String pnr = "";
        try {     
            pnr = this.reservationRepo.reserveTicket(from, to, date, trainName, trainNumber, userEmail);
        } 
        catch (Exception e) {
            e.printStackTrace();
        }
        return pnr;

    }
    
    public Integer cancelTicket(String username, String pnr){
        Integer status = 0;
        try{
            status = this.reservationRepo.cancelTicket(username, pnr);
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return status;
    }

}
