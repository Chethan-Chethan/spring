package com.xworkz.ticket.dto;

import lombok.Data;

@Data
public class TicketDto {

    private int id;
    private String name;
    private long phoneNumber;
    private String email;
    private String password;
    private String dateOfBirth;
}
