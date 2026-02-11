package com.xworkz.hospitalappointment.dto;

import lombok.Data;

@Data
public class HospitalDto {

    private int id;
    private String name;
    private long phoneNumber;
    private String email;
    private String password;
    private String date;
}
