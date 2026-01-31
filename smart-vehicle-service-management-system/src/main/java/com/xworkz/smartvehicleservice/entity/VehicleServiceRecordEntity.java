package com.xworkz.smartvehicleservice.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Getter
@Setter
@ToString
@Entity

@Table(name = "service_record_info")
public class VehicleServiceRecordEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "service_id")
    private int id;

    @Column(name = "customer_name")
    private String customerName;

    @Column(name = "phone_number")
    private long phoneNumber;

    @Column(name = "vehicle_number")
    private String vehicleNumber;

    @Column(name = "service_type")
    private String serviceType;
    private double serviceCost;
}
