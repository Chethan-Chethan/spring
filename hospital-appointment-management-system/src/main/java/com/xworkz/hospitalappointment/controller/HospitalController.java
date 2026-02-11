package com.xworkz.hospitalappointment.controller;

import com.xworkz.hospitalappointment.dto.HospitalDto;
import com.xworkz.hospitalappointment.service.HospitalService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HospitalController {

    private HospitalService service;

    public HospitalController(HospitalService service) {
        this.service = service;
    }

    @RequestMapping("/registration")
    public String openRegPage() {
        System.out.println("Registration page opened");
        return "register.jsp";
    }
    @RequestMapping("/register")
    public String reg(@RequestParam("name") String name, @RequestParam("phoneNumber") long phoneNumber, @RequestParam("email") String email, @RequestParam("password") String password, @RequestParam("date") String date) {
        System.out.println("Registration success");
        System.out.println("name: " + name);
        System.out.println("phoneNumber: " + phoneNumber);
        System.out.println("email: " + email);
        System.out.println("password: " + password);
        System.out.println("date: " + date);

        HospitalDto dto = new HospitalDto();
        dto.setName(name);
        dto.setPhoneNumber(phoneNumber);
        dto.setEmail(email);
        dto.setPassword(password);
        dto.setDate(date);

        service.validateAndSaveInfo(dto);
        return "index.jsp";
    }
    @RequestMapping("/appointment")
    public String op() {
        System.out.println("Appointment Scheduled");
        return "";
    }
}
