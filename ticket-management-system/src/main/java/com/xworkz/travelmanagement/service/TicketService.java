package com.xworkz.travelmanagement.service;

import com.xworkz.travelmanagement.entity.TicketEntity;

import java.util.List;

public interface TicketService {

    TicketEntity validateAndSaveTicketInfo(TicketEntity entity);
    List<TicketEntity> validateAndFindEmailAndPassword(String email, String password);


}
