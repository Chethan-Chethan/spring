package com.xworkz.onlineticket.repository;

import com.xworkz.onlineticket.dto.OnlineTicketDto;
import com.xworkz.onlineticket.entity.OnlineTicketEntity;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

@Repository
public class OnlineTicketRepositoryImpl implements OnlineTicketRepository{

    final static EntityManagerFactory emf = Persistence.createEntityManagerFactory("online-ticket");

    @Override
    public OnlineTicketEntity saveTicketInfo(OnlineTicketDto dto) {
        System.out.println("Invoking save method from repository");
        OnlineTicketEntity save = null;

        OnlineTicketEntity entity = new OnlineTicketEntity();
        entity.setName(dto.getName());
        entity.setPhoneNumber(dto.getPhoneNumber());
        entity.setEmail(dto.getEmail());
        entity.setPassword(dto.getPassword());
        entity.setAddress(dto.getAddress());
        entity.setDateOfBirth(dto.getDateOfBirth());
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
