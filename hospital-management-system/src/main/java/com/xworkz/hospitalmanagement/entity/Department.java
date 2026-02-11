package com.xworkz.hospitalmanagement.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Department {

    private String name;
    private int doctors;
    private String floor;

    @Autowired
    private Doctor doctor;

    public void setName(String name) {
        this.name = name;
    }
    public void setDoctors(int doctors) {
        this.doctors = doctors;
    }
    public void setFloor(String floor) {
        this.floor = floor;
    }

    public void info() {
        System.out.println("Department: " + name);
        System.out.println("Doctors: " + doctors);
        System.out.println("Floor: " + floor);
        doctor.treat();
    }
}
