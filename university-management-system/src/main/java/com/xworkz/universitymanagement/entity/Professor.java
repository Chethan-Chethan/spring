package com.xworkz.universitymanagement.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Professor {

    private final Student student;

    private String name;
    private String subject;
    private int experience;

    @Autowired
    public Professor(Student student) {
        this.student = student;
    }

    public void setProfessorDetails(String name, String subject, int experience) {
        this.name = name;
        this.subject = subject;
        this.experience = experience;
    }

    public void teach() {
        System.out.println("Professor: " + name);
        System.out.println("Subject: " + subject);
        System.out.println("Experience: " + experience);
        student.study();
    }
}
