package com.xworkz.trafficfines.service;

import com.xworkz.trafficfines.entity.TrafficFineEntity;

import java.util.List;

public interface TrafficFineService {

    TrafficFineEntity validateAndSaveFIneInfo(TrafficFineEntity entity);
    List<TrafficFineEntity> validateAndFetchAllDetails();
    boolean validateAndDeleteById(int id);
    TrafficFineEntity validateAndFetchById(int id);
    TrafficFineEntity validateAndUpdateById(TrafficFineEntity entity);



}
