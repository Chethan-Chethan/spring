package com.xworkz.trafficfines.repository;

import com.xworkz.trafficfines.entity.TrafficFineEntity;

import java.util.List;

public interface TrafficFineRepo {

    TrafficFineEntity saveFIneInfo(TrafficFineEntity entity);
    List<TrafficFineEntity> fetchAllDetails();
    boolean deleteById(int id);
    TrafficFineEntity fetchById(int id);
    TrafficFineEntity updateById(TrafficFineEntity entity);
}
