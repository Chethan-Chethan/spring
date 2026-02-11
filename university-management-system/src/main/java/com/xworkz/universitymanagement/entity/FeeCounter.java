package com.xworkz.universitymanagement.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class FeeCounter {

    private final FeePayment payment;

    @Autowired
    public FeeCounter(@Qualifier("onlinePayment") FeePayment payment) {
        this.payment = payment;
    }

    public void collectFee() {
        payment.pay();
    }
}
