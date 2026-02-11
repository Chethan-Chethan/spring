package com.xworkz.universitymanagement.entity;

import org.springframework.stereotype.Component;

@Component("onlinePayment")
public class OnlinePayment implements FeePayment{

    @Override
    public void pay() {
        System.out.println("Fee Paid using Online Payment");
    }
}
