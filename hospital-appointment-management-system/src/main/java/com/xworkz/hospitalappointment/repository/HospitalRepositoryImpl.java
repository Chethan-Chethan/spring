package com.xworkz.hospitalappointment.repository;

import com.xworkz.hospitalappointment.dto.HospitalDto;
import com.xworkz.hospitalappointment.entity.HospitalEntity;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

@Repository
public class HospitalRepositoryImpl implements HospitalRepository{

    final static EntityManagerFactory emf = Persistence.createEntityManagerFactory("hospital");

    @Override
    public HospitalEntity saveInfo(HospitalDto dto) {
        System.out.println("invoking save from repo");
        HospitalEntity save = null;

        HospitalEntity entity = new HospitalEntity();
        entity.setName(dto.getName());
        entity.setPhoneNumber(dto.getPhoneNumber());
        entity.setEmail(dto.getEmail());
        entity.setPassword(dto.getPassword());
        entity.setDate(dto.getDate());

        EntityManager em = null;
        EntityTransaction et = null;
        try {
            em = this.emf.createEntityManager();
            et = em.getTransaction();
            et.begin();
            em.persist(entity);
            et.commit();
            return entity;
        } catch (Exception e) {
            e.printStackTrace();
            et.rollback();
        } finally {
            if (em!=null) {
                em.close();
            }
        }

        return save;
    }
}
