package com.xworkz.travelmanagement.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@Setter
@ToString
@Entity

@NamedQuery(name = "findEmailAndPassword",
        query = "select x from TicketEntity x where " +
                "x.email = :email And x.password = :password order by x.createdAt desc")

@Table(name = "ticket_info")
public class TicketEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ticket_id")
    private int id;

    @Column(name = "customer_name")
    private String name;

    @Column(name = "phone_number")
    private long phoneNumber;

    @Column(name = "email")
    private String email;

    @Column(name = "password")
    private String password;

    @Column(name = "boarding_place")
    private String boardingPlace;

    @Column(name = "destination")
    private String destination;

    @Column(name = "created_at")
    private LocalDateTime createdAt;
}
