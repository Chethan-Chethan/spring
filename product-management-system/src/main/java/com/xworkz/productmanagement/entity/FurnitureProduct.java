package com.xworkz.productmanagement.entity;

import org.springframework.beans.factory.annotation.Autowired;

public class FurnitureProduct {

    String item = "Table";
    double price = 15000;
    boolean assembled = true;

    @Autowired
    private Material material;

    public void use() {
        System.out.println("Furniture Item: " + item);
        System.out.println("Price: " + price);
        System.out.println("Assembled: " + assembled);
        material.details();
    }
}
