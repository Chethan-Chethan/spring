package com.xworkz.ticket.repository;

import com.xworkz.ticket.dto.TicketDto;
import com.xworkz.ticket.entity.TicketEntity;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

@Repository
public class TicketRepositoryImpl implements TicketRepository {

    final static EntityManagerFactory emf = Persistence.createEntityManagerFactory("ticket");

    @Override
    public TicketEntity saveTicketInfo(TicketDto dto) {
        System.out.println("Invoking save method from repository");
        TicketEntity save = null;

        TicketEntity entity = new TicketEntity();
        entity.setName(dto.getName());
        entity.setPhoneNumber(dto.getPhoneNumber());
        entity.setEmail(dto.getEmail());
        entity.setPassword(dto.getPassword());
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
