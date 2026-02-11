package com.xworkz.hospitalmanagement.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Pharmacy {

    private final Medicine medicine;

    private String name;
    private String location;

    @Autowired
    public Pharmacy(Medicine medicine) {
        this.medicine = medicine;
    }

    public void setPharmacyDetails(String name, String location) {
        this.name = name;
        this.location = location;
    }
    public void dispense() {
        System.out.println("Pharmacy: " + name);
        System.out.println("Location: " + location);
        medicine.info();
    }
}
