package com.xworkz.ticket.controller;

import com.xworkz.ticket.dto.TicketDto;
import com.xworkz.ticket.service.TicketService;
import com.xworkz.ticket.service.TicketServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TicketController {

    private final TicketService ticketService;

    public TicketController(TicketService ticketService) {
        this.ticketService = ticketService;
    }


    @RequestMapping("/user")
    public String user() {
        System.out.println("Running on TicKet in TicketController");
        return "register.jsp";
    }
    @RequestMapping("/register")
    public String register(@RequestParam("name") String name, @RequestParam("email") String email, @RequestParam("password") String password, @RequestParam("phoneNumber") long phoneNumber, @RequestParam("address") String address, @RequestParam("dob") String dob){
        System.out.println("Running register in ticket controller");
        System.out.println("name: " + name);
        System.out.println("email: " + email);
        System.out.println("password: " + password);
        System.out.println("phoneNumber: " + phoneNumber);
        System.out.println("address: " + address);
        System.out.println("dob: " + dob);

        TicketDto dto = new TicketDto();
        dto.setName(name);
        dto.setPhoneNumber(phoneNumber);
        dto.setEmail(email);
        dto.setPassword(password);
        dto.setDateOfBirth(dob);

        ticketService.validateAndSaveTicketInfo(dto);
        return "index.jsp";
    }
    @RequestMapping("/login")
    public String listOfUsers() {
        System.out.println("Running listOfUsers in TicketController");
        return "";
    }
}
