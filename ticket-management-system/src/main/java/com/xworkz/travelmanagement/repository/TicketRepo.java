package com.xworkz.travelmanagement.repository;

import com.xworkz.travelmanagement.entity.TicketEntity;

import java.util.List;

public interface TicketRepo {

    TicketEntity saveTicketInfo(TicketEntity entity);
    List<TicketEntity> findEmailAndPassword(String email, String password);
}
