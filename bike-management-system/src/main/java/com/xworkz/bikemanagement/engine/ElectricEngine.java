package com.xworkz.bikemanagement.engine;

import org.springframework.stereotype.Component;

@Component("electricEngine")
public class ElectricEngine implements Bike{

//    public void start() {
//        System.out.println("Electric engine started");
//    }

    @Override
    public void data() {
        System.out.println("Ride started");

    }
}
