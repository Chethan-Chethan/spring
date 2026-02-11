package com.xworkz.onlineticket.controller;

import com.xworkz.onlineticket.dto.OnlineTicketDto;
import com.xworkz.onlineticket.service.OnlineTicketService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class OnlineTicketController {

    private OnlineTicketService service;
    public OnlineTicketController(OnlineTicketService service) {
        this.service = service;
    }
    @RequestMapping("/registration")
    public String openRegPage() {
        System.out.println("Registration page opened");
        return "register.jsp";
    }

    @RequestMapping("/register")
    public String reg(@RequestParam("name") String name,
                      @RequestParam("phoneNumber") long phoneNumber,
                      @RequestParam("email") String email,
                      @RequestParam("password") String password,
                      @RequestParam("address") String address,
                      @RequestParam("dob") String dob) {
//        System.out.println("Register details");
//        System.out.println("name: " + name);
//        System.out.println("email: " + email);
//        System.out.println("password: " + password);
//        System.out.println("phoneNumber: " + phoneNumber);
//        System.out.println("address: " + address);
//        System.out.println("dob: " + dob);

        OnlineTicketDto dto = new OnlineTicketDto();
        dto.setName(name);
        dto.setPhoneNumber(phoneNumber);
        dto.setEmail(email);
        dto.setPassword(password);
        dto.setAddress(address);
        dto.setDateOfBirth(dob);

        service.validateAndSaveTicketInfo(dto);
        return "index.jsp";

    }
    @RequestMapping("/getTicket")
    public String buy() {
        System.out.println("Buy Ticket");
        return "";
    }
}
