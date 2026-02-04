package com.xworkz.productmanagement.entity;

import org.springframework.beans.factory.annotation.Autowired;

public class BookProduct {

    String title = "Malgudi Days";
    double price = 399;
    int pages = 350;

    @Autowired
    private Author author;

    public void read() {
        System.out.println("Book Title: " + title);
        System.out.println("Price: " + price);
        System.out.println("Pages: " + pages);
        author.display();
    }
}
