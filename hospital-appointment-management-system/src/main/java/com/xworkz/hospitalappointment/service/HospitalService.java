package com.xworkz.hospitalappointment.service;

import com.xworkz.hospitalappointment.dto.HospitalDto;
import com.xworkz.hospitalappointment.entity.HospitalEntity;

public interface HospitalService {

    HospitalEntity validateAndSaveInfo(HospitalDto dto);
}
