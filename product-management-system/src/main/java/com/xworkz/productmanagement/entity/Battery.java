package com.xworkz.productmanagement.entity;

public class Battery {

    int capacity = 5000;
    String type = "Li-ion";
    boolean fastCharge = true;

    public void specs() {
        System.out.println("Battery Capacity: " + capacity + "mAh");
        System.out.println("Battery Type: " + type);
        System.out.println("Fast Charging: " + fastCharge);
    }
}
