package com.xworkz.ticket.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Getter
@Setter
@ToString
@Entity

@Table(name = "ticket_info_spring")
public class TicketEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private long phoneNumber;
    private String email;
    private String password;
    private String dateOfBirth;
}
