package com.xworkz.productmanagement.entity;

import org.springframework.beans.factory.annotation.Autowired;

public class ClothingProduct {

    String type = "Jeans";
    String size = "32";
    double price = 2999;

    @Autowired
    private Brand brand;

    public void wear() {
        System.out.println("Clothing Type: " + type);
        System.out.println("Size: " + size);
        System.out.println("Price: " + price);
        brand.info();
    }
}
