package com.xworkz.universitymanagement.entity;

import org.springframework.stereotype.Component;

@Component
public class Student {

    private String name;
    private int age;
    private String course;

    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setCourse(String course) {
        this.course = course;
    }

    public void study() {
        System.out.println("Student: " + name);
        System.out.println("Age: " + age);
        System.out.println("Course: " + course);
    }
}
