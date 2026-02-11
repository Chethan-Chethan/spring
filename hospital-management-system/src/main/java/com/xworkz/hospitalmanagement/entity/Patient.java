package com.xworkz.hospitalmanagement.entity;

import org.springframework.stereotype.Component;

@Component
public class Patient {

    private String name;
    private int age;
    private String problem;

    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setProblem(String problem) {
        this.problem = problem;
    }

    public void checkup() {
        System.out.println("Patient: " + name);
        System.out.println("Age: " + age);
        System.out.println("Problem: " + problem);
    }
}
