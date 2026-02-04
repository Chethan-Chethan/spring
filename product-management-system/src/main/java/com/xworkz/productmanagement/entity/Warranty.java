package com.xworkz.productmanagement.entity;

public class Warranty {

    int years = 2;
    String type = "Manufacturer";
    double cost = 1999;

    public void show() {
        System.out.println("Warranty Years: " + years);
        System.out.println("Warranty Type: " + type);
        System.out.println("Warranty Cost: " + cost);
    }
}
