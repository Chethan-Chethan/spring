package com.xworkz.ticket.repository;

import com.xworkz.ticket.dto.TicketDto;
import com.xworkz.ticket.entity.TicketEntity;

public interface TicketRepository {

    TicketEntity saveTicketInfo(TicketDto dto);

}
