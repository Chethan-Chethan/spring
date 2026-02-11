package com.xworkz.bikemanagement.engine;

import org.springframework.stereotype.Component;

@Component("petrolEngine")
public class PetrolEngine implements Bike{
//
//    public void start() {
//        System.out.println("Petrol Engine On");
//    }

    @Override
    public void data() {
        System.out.println("Ride started");
    }
}
