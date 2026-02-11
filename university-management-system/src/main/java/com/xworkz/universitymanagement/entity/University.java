package com.xworkz.universitymanagement.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class University {

    private String name;
    private String location;
    private int ranking;

    @Autowired
    private College college;

    public void setName(String name) {
        this.name = name;
    }
    public void setLocation(String location) {
        this.location = location;
    }
    public void setRanking(int ranking) {
        this.ranking = ranking;
    }

    public void details() {
        System.out.println("University: " + name);
        System.out.println("Location: " + location);
        System.out.println("Ranking: " + ranking);
        college.info();
    }
}
