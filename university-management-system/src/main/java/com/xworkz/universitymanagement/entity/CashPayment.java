package com.xworkz.universitymanagement.entity;

import org.springframework.stereotype.Component;

@Component("cashPayment")
public class CashPayment implements FeePayment{

    @Override
    public void pay() {
        System.out.println("Fee paid using cash");
    }
}
