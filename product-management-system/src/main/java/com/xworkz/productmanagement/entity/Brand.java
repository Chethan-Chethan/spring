package com.xworkz.productmanagement.entity;

public class Brand {

    String name = "Levi's";
    String country = "USA";
    boolean premium = true;

    public void info() {
        System.out.println("Brand Name: " + name);
        System.out.println("Country: " + country);
        System.out.println("Premium Brand: " + premium);
    }
}
