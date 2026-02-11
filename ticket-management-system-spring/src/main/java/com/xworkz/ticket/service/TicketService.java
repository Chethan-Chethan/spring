package com.xworkz.ticket.service;

import com.xworkz.ticket.dto.TicketDto;
import com.xworkz.ticket.entity.TicketEntity;

public interface TicketService {

    TicketEntity validateAndSaveTicketInfo(TicketDto dto);
}
