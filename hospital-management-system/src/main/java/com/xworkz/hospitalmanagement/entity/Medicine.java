package com.xworkz.hospitalmanagement.entity;

import org.springframework.stereotype.Component;

@Component
public class Medicine {

    private String name;
    private int quantity;
    private double price;

    public void setMedicineDetails(String name, int quantity, double price){
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    public void info() {
        System.out.println("Medicine: " + name);
        System.out.println("Quantity: " + quantity);
        System.out.println("Price: " + price);
    }
}
