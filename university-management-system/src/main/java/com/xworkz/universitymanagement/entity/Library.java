package com.xworkz.universitymanagement.entity;

import org.springframework.stereotype.Component;

@Component
public class Library {

    private String librarian;
    private int books;
    private boolean open;

    public void setLibrarian(String librarian) {
        this.librarian = librarian;
    }
    public void setBooks(int books) {
        this.books = books;
    }
    public void setOpen(boolean open) {
        this.open = open;
    }

    public void info() {
        System.out.println("Library Librarian: " + librarian);
        System.out.println("Total Books: " + books);
        System.out.println("Open: " + open);
    }
}
