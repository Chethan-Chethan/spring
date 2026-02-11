package com.xworkz.ticket.service;

import com.xworkz.ticket.dto.TicketDto;
import com.xworkz.ticket.entity.TicketEntity;
import com.xworkz.ticket.repository.TicketRepository;
import com.xworkz.ticket.repository.TicketRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TicketServiceImpl implements TicketService{

    @Autowired
    private TicketRepository repository;
    @Override
    public TicketEntity validateAndSaveTicketInfo(TicketDto dto) {
        System.out.println("Validating save method from service");
        TicketEntity isSaveValid = null;

        if (dto!=null) {
            isSaveValid = repository.saveTicketInfo(dto);
        } else {
            System.out.println("Failed to save");
        }
        return isSaveValid;
    }
}
