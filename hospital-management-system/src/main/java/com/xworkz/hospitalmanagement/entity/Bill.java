package com.xworkz.hospitalmanagement.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Bill {

    private final Appointment appointment;

    private int billNo;
    private double amount;
    private boolean paid;

    @Autowired
    public Bill(Appointment appointment) {
        this.appointment = appointment;
    }

    public void setBillDetails(int billNo, double amount, boolean paid) {
        this.billNo = billNo;
        this.amount = amount;
        this.paid = paid;
    }

    public void generate() {
        System.out.println("Bill No: " + billNo);
        System.out.println("Amount: " + amount);
        System.out.println("Paid: " + paid);
        appointment.schedule();
    }

}
