package com.xworkz.hospitalmanagement.entity;

import org.springframework.stereotype.Component;

@Component
public class Laboratory {

    private String testName;
    private double cost;
    private boolean available;

    public void setLabDetails(String testName, double cost, boolean available) {
        this.testName = testName;
        this.cost = cost;
        this.available = available;
    }

    public void test() {
        System.out.println("Lab Test: " + testName);
        System.out.println("Cost: " + cost);
        System.out.println("Available: " + available);
    }
}
