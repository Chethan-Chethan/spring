package com.xworkz.smartvehicleservice.service;

import com.xworkz.smartvehicleservice.entity.VehicleServiceRecordEntity;
import com.xworkz.smartvehicleservice.repository.VehicleServiceRepo;
import com.xworkz.smartvehicleservice.repository.VehicleServiceRepoImpl;

public class VehicleServiceImpl implements VehicleService{

    VehicleServiceRepo repository = new VehicleServiceRepoImpl();
    public VehicleServiceRecordEntity validateAndSaveServiceInfo(VehicleServiceRecordEntity entity) {
        System.out.println("Validating save from service");
        VehicleServiceRecordEntity isValidSave = null;

        if (entity!=null) {
            isValidSave = repository.saveServiceInfo(entity);
        } else {
            System.out.println("Failed to Save");
        }
        return isValidSave;
    }
}
