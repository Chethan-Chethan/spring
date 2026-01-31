package com.xworkz.smartvehicleservice.repository;

import com.xworkz.smartvehicleservice.entity.VehicleServiceRecordEntity;

public interface VehicleServiceRepo {

    VehicleServiceRecordEntity saveServiceInfo(VehicleServiceRecordEntity entity);
}
