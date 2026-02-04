package com.xworkz.productmanagement.entity;

public class Author {

    String name = "R K Narayan";
    String language = "English";
    int books = 30;

    public void display() {
        System.out.println("Author Name: " + name);
        System.out.println("Language: " + language);
        System.out.println("Books Written: " + books);
    }
}
