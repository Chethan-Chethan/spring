package com.xworkz.travelmanagement.service;

import com.xworkz.travelmanagement.entity.TicketEntity;
import com.xworkz.travelmanagement.repository.TicketRepo;
import com.xworkz.travelmanagement.repository.TicketRepoImpl;

import java.util.List;

public class TicketServiceImpl implements TicketService{

    TicketRepo repository = new TicketRepoImpl();
    @Override
    public TicketEntity validateAndSaveTicketInfo(TicketEntity entity) {
        System.out.println("Validating save from service");
        TicketEntity isValidSave = null;

        if (entity!=null) {
            isValidSave = repository.saveTicketInfo(entity);
        } else {
            System.out.println("Failed to Save");
        }
        return isValidSave;
    }

    @Override
    public List<TicketEntity> validateAndFindEmailAndPassword(String email, String password) {
        System.out.println("validating email and password from service");
        List<TicketEntity> isValid = null;

        if (email!=null && !email.isEmpty() && password!=null && !password.isEmpty()) {
            isValid = repository.findEmailAndPassword(email, password);
        } else {
            System.out.println("Error: email or password Incorrect ");
        }
        return isValid;
    }


}
