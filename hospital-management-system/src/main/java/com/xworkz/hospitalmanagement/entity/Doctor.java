package com.xworkz.hospitalmanagement.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Doctor {

    private final Patient patient;

    private String name;
    private String specialization;
    private int experience;

    @Autowired
    public Doctor(Patient patient) {
        this.patient = patient;
    }

    public void setDoctorDetails(String name, String specialization, int experience) {
        this.name = name;
        this.specialization = specialization;
        this.experience = experience;
    }

    public void treat() {
        System.out.println("Doctor: " + name);
        System.out.println("Specialization: " + specialization);
        System.out.println("Experience: " + experience);
        patient.checkup();
    }
}
