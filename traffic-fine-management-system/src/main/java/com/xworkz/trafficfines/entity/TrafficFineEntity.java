package com.xworkz.trafficfines.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Getter
@Setter
@ToString
@Entity

@NamedQuery(name = "fetchAllDetails", query = "select x from TrafficFineEntity x")
@Table(name = "traffic_fine_info")
public class TrafficFineEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "challan_id")
    private int id;

    @Column(name = "vehicle_number")
    private String vehicleNumber;

    @Column(name = "violated_rule")
    private String violatedRule;

    @Column(name = "fine_amount")
    private double fineAmount;
}
