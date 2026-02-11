package com.xworkz.onlineticket.service;

import com.xworkz.onlineticket.dto.OnlineTicketDto;
import com.xworkz.onlineticket.entity.OnlineTicketEntity;

public interface OnlineTicketService {

    OnlineTicketEntity validateAndSaveTicketInfo(OnlineTicketDto dto);
}
