package com.xworkz.smartvehicleservice.repository;

import com.xworkz.smartvehicleservice.entity.VehicleServiceRecordEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class VehicleServiceRepoImpl implements VehicleServiceRepo{
    final static EntityManagerFactory emf = Persistence.createEntityManagerFactory("vehicle-service");

    public VehicleServiceRecordEntity saveServiceInfo(VehicleServiceRecordEntity entity) {
        System.out.println("Invoking save method from repository");
        VehicleServiceRecordEntity save = null;

        EntityManager em = null;
        EntityTransaction et = null;
        try {
            em = this.emf.createEntityManager();
            et = em.getTransaction();
            et.begin();
            em.persist(entity);
            save = em.merge(entity);
            et.commit();
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
