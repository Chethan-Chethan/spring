package com.xworkz.hospitalmanagement.entity;

import org.springframework.stereotype.Component;

@Component
public class Appointment {

    private String date;
    private String time;
    private String status;

    public void setDate(String date) {
        this.date = date;
    }
    public void setTime(String time) {
        this.time = time;
    }
    public void setStatus(String status) {
        this.status = status;
    }

    public void schedule() {
        System.out.println("Appointment Date: " + date);
        System.out.println("Time: " + time);
        System.out.println("Status: " + status);
    }
}
