package com.xworkz.onlineticket.dto;

import com.oracle.webservices.internal.api.databinding.DatabindingMode;
import lombok.Data;

@Data
public class OnlineTicketDto {

    private int id;
    private String name;
    private long phoneNumber;
    private String email;
    private String password;
    private String address;
    private String dateOfBirth;
}
