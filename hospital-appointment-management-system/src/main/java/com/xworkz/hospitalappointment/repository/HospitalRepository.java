package com.xworkz.hospitalappointment.repository;

import com.xworkz.hospitalappointment.dto.HospitalDto;
import com.xworkz.hospitalappointment.entity.HospitalEntity;

public interface HospitalRepository {

    HospitalEntity saveInfo(HospitalDto dto);

}
