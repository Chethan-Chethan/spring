package com.xworkz.trafficfines.repository;

import com.xworkz.trafficfines.entity.TrafficFineEntity;

import javax.persistence.*;
import java.util.Collections;
import java.util.List;

public class TrafficFineRepoImpl implements TrafficFineRepo{

    final static EntityManagerFactory emf = Persistence.createEntityManagerFactory("traffic-fine");
    @Override
    public TrafficFineEntity saveFIneInfo(TrafficFineEntity entity) {
        System.out.println("invoking save method from repository");
        TrafficFineEntity fine = null;

        EntityManager em = null;
        EntityTransaction et = null;
        try {
            em = emf.createEntityManager();
            et = em.getTransaction();
            et.begin();
            em.persist(entity);
            et.commit();
            fine = em.merge(entity);
        } catch (Exception e) {
            e.printStackTrace();
            et.rollback();
        } finally {
            if (em!=null) {
                em.close();
            }
        }
        return fine;
    }

    @Override
    public List<TrafficFineEntity> fetchAllDetails() {
        System.out.println("Invoking fetchAllDetails method from repository");
        List<TrafficFineEntity> fetch = null;

        EntityManager em = null;

        try {
            em = this.emf.createEntityManager();
            Query query = em.createNamedQuery("fetchAllDetails");
            fetch = query.getResultList();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (em!=null) {
                em.close();
            }
        }
        return fetch;
    }

    @Override
    public boolean deleteById(int id) {
        System.out.println("Invoking delete from repository");
        boolean del = false;

        EntityManager em = null;
        EntityTransaction et = null;
        try {
            em = this.emf.createEntityManager();
            et = em.getTransaction();
            et.begin();
            TrafficFineEntity find = em.find(TrafficFineEntity.class, id);
            if (find!=null) {
                em.remove(find);
                et.commit();
                del=true;
            }
        } catch (Exception e) {
            e.printStackTrace();
            et.rollback();
        } finally {
            if (em!=null) {
                em.close();
            }
        }

        return del;
    }

    @Override
    public TrafficFineEntity fetchById(int id) {
        System.out.println("Invoking fetch from repository");
        TrafficFineEntity fetch = null;

        EntityManager em = null;
        try {
            fetch = this.emf.createEntityManager().find(TrafficFineEntity.class, id);
//            fetch = em.find(TrafficFineEntity.class, id);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (em!=null) {
                em.close();
            }
        }
        return fetch;
    }

    @Override
    public TrafficFineEntity updateById(TrafficFineEntity entity) {
        System.out.println("Invoking update from repository");
        TrafficFineEntity update = null;

        EntityManager em = null;
        EntityTransaction et = null;
        try {
            em = this.emf.createEntityManager();
            et = em.getTransaction();
            et.begin();
            TrafficFineEntity fineEntity = em.find(TrafficFineEntity.class, entity.getId());
            if (entity!=null) {
                fineEntity.setVehicleNumber(entity.getVehicleNumber());
                fineEntity.setViolatedRule(entity.getViolatedRule());
                fineEntity.setFineAmount(entity.getFineAmount());
                et.commit();
                update = em.merge(fineEntity);
            }
        } catch (Exception e) {
            e.printStackTrace();
            et.rollback();
        } finally {
            if (em!=null) {
                em.close();
            }
        }
        return update;
    }
}
