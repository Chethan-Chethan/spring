package com.xworkz.universitymanagement.entity;

import org.springframework.stereotype.Component;

@Component
public class Examination {

    private String examName;
    private String date;
    private boolean online;

    public void setExamName(String examName) {
        this.examName = examName;
    }
    public void setDate(String date) {
        this.date = date;
    }
    public void setOnline(boolean online) {
        this.online = online;
    }

    public void conduct() {
        System.out.println("Exam: " + examName);
        System.out.println("Date: " + date);
        System.out.println("Online: " + online);
    }
}
