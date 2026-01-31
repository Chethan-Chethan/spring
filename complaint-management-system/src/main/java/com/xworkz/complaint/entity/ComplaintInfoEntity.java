package com.xworkz.complaint.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Getter
@Setter
@ToString
@Entity

@Table(name = "complaint_info")
public class ComplaintInfoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "complaint_id")
    private int complaintId;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private UserInfoEntity user;

    @Column(name = "issue")
    private String issue;

    @Column(name = "status")
    private String status;

    @Column(name = "createdDate")
    private String createdDate;
}