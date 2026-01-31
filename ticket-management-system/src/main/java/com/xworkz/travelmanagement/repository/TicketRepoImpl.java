package com.xworkz.travelmanagement.repository;

import com.xworkz.travelmanagement.entity.TicketEntity;

import javax.persistence.*;
import java.util.List;

public class TicketRepoImpl implements TicketRepo{

    final static EntityManagerFactory emf = Persistence.createEntityManagerFactory("ticket");

    @Override
    public TicketEntity saveTicketInfo(TicketEntity entity) {
        System.out.println("Invoking save from repository");
        TicketEntity save = null;

        EntityManager em = null;
        EntityTransaction et = null;
        try {
            em = this.emf.createEntityManager();
            et = em.getTransaction();
            et.begin();
            em.persist(entity);
            et.commit();
            save = em.merge(entity);
        } catch (Exception e) {
            e.printStackTrace();
            et.rollback();
        }
        return save;
    }

    @Override
    public List<TicketEntity> findEmailAndPassword(String email, String password) {
        System.out.println("Invoking email and password from repository");
        List<TicketEntity> fetch = null;

        EntityManager em = null;
        try {
            em = this.emf.createEntityManager();
            Query query = em.createNamedQuery("findEmailAndPassword");
            query.setParameter("email", email);
            query.setParameter("password", password);
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


}
