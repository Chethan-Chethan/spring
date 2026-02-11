package com.xworkz.onlineticket.service;

import com.xworkz.onlineticket.dto.OnlineTicketDto;
import com.xworkz.onlineticket.entity.OnlineTicketEntity;
import com.xworkz.onlineticket.repository.OnlineTicketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OnlineTicketServiceImpl implements OnlineTicketService{

    @Autowired
    private OnlineTicketRepository repository;
    @Override
    public OnlineTicketEntity validateAndSaveTicketInfo(OnlineTicketDto dto) {
        System.out.println("validating save from service");
        OnlineTicketEntity isValid = null;

        if (dto!=null) {
            isValid = repository.saveTicketInfo(dto);
        } else {
            System.out.println("Failed to save");
        }
        return isValid;
    }
}
