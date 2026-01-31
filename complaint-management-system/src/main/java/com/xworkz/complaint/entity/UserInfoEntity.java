package com.xworkz.complaint.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Getter
@Setter
@ToString

@NamedQuery(name = "fetchAllDetails", query = "select x from UserInfoEntity x")
@Table(name = "user_info")
public class UserInfoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private int userId;

    @Column(name = "email")
    private String email;

    @Column(name = "password")
    private String password;

    @Column(name = "role")
    private String role;
}
