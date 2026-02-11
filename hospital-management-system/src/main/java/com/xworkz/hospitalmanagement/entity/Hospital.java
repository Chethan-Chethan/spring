package com.xworkz.hospitalmanagement.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Hospital {

    private String name;
    private String location;
    private int beds;

    @Autowired
    private Department department;

    public void setName(String name) {
        this.name = name;
    }
    public void setLocation(String location) {
        this.location = location;
    }
    public void setBeds(int beds) {
        this.beds = beds;
    }

    public void details() {
        System.out.println("Hospital: " + name);
        System.out.println("Location: " + location);
        System.out.println("Beds: " + beds);
        department.info();
    }
}
