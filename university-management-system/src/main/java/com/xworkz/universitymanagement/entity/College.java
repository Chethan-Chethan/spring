package com.xworkz.universitymanagement.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class College {

    private String name;
    private int students;
    private String grade;

    @Autowired
    private Professor professor;

    public void setName(String name) {
        this.name = name;
    }
    public void setStudents(int students) {
        this.students = students;
    }
    public void setGrade(String grade) {
        this.grade = grade;
    }

    public void info() {
        System.out.println("College: " + name);
        System.out.println("Students: " + students);
        System.out.println("Grade: " + grade);
        professor.teach();
    }
}
