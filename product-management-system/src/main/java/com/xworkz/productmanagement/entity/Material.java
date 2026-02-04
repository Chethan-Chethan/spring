package com.xworkz.productmanagement.entity;

public class Material {

    String name = "Wood";
    boolean durable = true;
    double cost = 1200;

    public void details() {
        System.out.println("Material Name: " + name);
        System.out.println("Durable: " + durable);
        System.out.println("Cost: " + cost);
    }
}
