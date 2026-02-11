package com.xworkz.onlinefoodorder.controller;

import org.springframework.web.bind.annotation.RequestMapping;

public class OnlineOrderController {

    @RequestMapping("/register")
    public String reg() {
        System.out.println("Registration success");
        return "";
    }
    @RequestMapping("/order")
    public String order() {
        System.out.println("Order Placed");
        return "";
    }
}
