package com.xworkz.collegecourse.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CourseController {

    @RequestMapping("/register")
    public String reg() {
        System.out.println("Registration success");
        return "";
    }
    @RequestMapping("/enroll")
    public String enRoll() {
        System.out.println("Enrolled to Course");
        return "";
    }
}
