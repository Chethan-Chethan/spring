package com.xworkz.productmanagement.entity;

import org.springframework.beans.factory.annotation.Autowired;

public class ElectronicProduct {

    String name = "Television";
    String brand = "Samsung";
    double price = 45000;

    @Autowired
    private Warranty warranty;

    public void buy() {
        System.out.println("Product Name: " + name);
        System.out.println("Brand: " + brand);
        System.out.println("Price: " + price);
        warranty.show();
    }
}
