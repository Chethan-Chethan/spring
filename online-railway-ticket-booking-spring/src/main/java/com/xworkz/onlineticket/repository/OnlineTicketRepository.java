package com.xworkz.onlineticket.repository;

import com.xworkz.onlineticket.dto.OnlineTicketDto;
import com.xworkz.onlineticket.entity.OnlineTicketEntity;

public interface OnlineTicketRepository {

    OnlineTicketEntity saveTicketInfo(OnlineTicketDto dto);

}
