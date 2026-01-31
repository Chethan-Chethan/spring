package com.xworkz.smartvehicleservice.service;

import com.xworkz.smartvehicleservice.entity.VehicleServiceRecordEntity;

public interface VehicleService {

    VehicleServiceRecordEntity validateAndSaveServiceInfo(VehicleServiceRecordEntity entity);

}
