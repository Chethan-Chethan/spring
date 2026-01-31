package com.xworkz.onlinecourse.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Getter
@Setter
@ToString

@NamedQuery(name = "fetchingAllDetails", query = "select x from CourseEnrollmentEntity x")
@Table(name = "student_info")
public class CourseEnrollmentEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "student_name")
    private String studentName;

    @Column(name = "email")
    private String email;

    @Column(name = "phone_number")
    private long phoneNumber;

    @Column(name = "course_name")
    private String courseName;

    @Column(name = "course_fee")
    private double courseFee;
}
