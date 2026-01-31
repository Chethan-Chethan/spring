package com.xworkz.trafficfines.service;

import com.xworkz.trafficfines.entity.TrafficFineEntity;
import com.xworkz.trafficfines.repository.TrafficFineRepo;
import com.xworkz.trafficfines.repository.TrafficFineRepoImpl;

import java.util.Collections;
import java.util.List;

public class TrafficFineServiceImpl implements TrafficFineService{
    TrafficFineRepo repository = new TrafficFineRepoImpl();
    @Override
    public TrafficFineEntity validateAndSaveFIneInfo(TrafficFineEntity entity) {
        System.out.println("Invoking validation from service");
        TrafficFineEntity isValid = null;

        if (entity!=null) {
            isValid = repository.saveFIneInfo(entity);
        } else {
            isValid = null;
        }
        return isValid;
    }

    @Override
    public List<TrafficFineEntity> validateAndFetchAllDetails() {
        System.out.println("validating fetch method from service");

        List<TrafficFineEntity> list = repository.fetchAllDetails();
        if (list!=null && list.isEmpty()) {
            System.out.println("traffic entity found: " + list.size());
        }
        return list;
    }

    @Override
    public boolean validateAndDeleteById(int id) {
        System.out.println("validating delete from service");
        boolean isValid = false;
        if (id>0) {
            isValid = repository.deleteById(id);
        } else {
            isValid = false;
        }
        return isValid;
    }

    @Override
    public TrafficFineEntity validateAndFetchById(int id) {
        System.out.println("validating fetch from service");
        TrafficFineEntity isValidFetch = null;

        if (id>0) {
            isValidFetch = repository.fetchById(id);
        }else {
            System.out.println("Fetching failed");
        }
        return isValidFetch;
    }

    @Override
    public TrafficFineEntity validateAndUpdateById(TrafficFineEntity entity) {
        System.out.println("validating update from service");
        TrafficFineEntity isValidUpdate = null;

        if (entity!=null) {
            isValidUpdate = repository.updateById(entity);
        } else {
            System.out.println("Update failed");
        }
        return isValidUpdate;
    }
}
