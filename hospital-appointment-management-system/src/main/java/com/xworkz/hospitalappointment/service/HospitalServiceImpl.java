package com.xworkz.hospitalappointment.service;

import com.xworkz.hospitalappointment.dto.HospitalDto;
import com.xworkz.hospitalappointment.entity.HospitalEntity;
import com.xworkz.hospitalappointment.repository.HospitalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HospitalServiceImpl implements HospitalService{

    @Autowired
    private HospitalRepository repository;
    @Override
    public HospitalEntity validateAndSaveInfo(HospitalDto dto) {
        System.out.println("validate and save method from service");
        HospitalEntity isValid = null;

        if (dto!=null) {
            isValid = repository.saveInfo(dto);
        } else {
            System.out.println("Failed to save");
        }
        return isValid;
    }
}
