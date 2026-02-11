package com.xworkz.hospitalmanagement.entity;

import org.springframework.stereotype.Component;

@Component
public class Nurse {

    private String name;
    private int shiftHours;
    private String ward;

    public void setName(String name) {
        this.name = name;
    }
    public void setShiftHours(int shiftHours) {
        this.shiftHours = shiftHours;
    }
    public void setWard(String ward) {
        this.ward = ward;
    }

    public void assist() {
        System.out.println("Nurse: " + name);
        System.out.println("Shift Hours: " + shiftHours);
        System.out.println("Ward: " + ward);
    }
}
