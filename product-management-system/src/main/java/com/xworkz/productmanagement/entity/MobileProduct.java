package com.xworkz.productmanagement.entity;

import org.springframework.beans.factory.annotation.Autowired;

public class MobileProduct {

    String model = "Galaxy S23";
    double price = 70000;
    boolean dualSim = true;

    @Autowired
    private Battery battery;

    public void use() {
        System.out.println("Mobile Model: " + model);
        System.out.println("Price: " + price);
        System.out.println("Dual SIM: " + dualSim);
        battery.specs();
    }
}
