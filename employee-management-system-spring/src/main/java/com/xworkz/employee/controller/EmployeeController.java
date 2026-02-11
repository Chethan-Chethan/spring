package com.xworkz.employee.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class EmployeeController {

    @RequestMapping("/login")
    public String login() {
        System.out.println("Login successful");
        return "";
    }
    @RequestMapping("/view")
    public String view() {
        System.out.println("View file");
        return "";
    }
}
