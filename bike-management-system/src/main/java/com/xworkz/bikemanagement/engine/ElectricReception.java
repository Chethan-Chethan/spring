package com.xworkz.bikemanagement.engine;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class ElectricReception {
    @Autowired
    @Qualifier("electricEngine")
    Bike bike;
    public void display() {
        System.out.println("Welcome to Electric bike show room");
        bike.data();
    }
}
