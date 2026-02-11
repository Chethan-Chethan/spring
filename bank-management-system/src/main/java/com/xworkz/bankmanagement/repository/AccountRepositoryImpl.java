package com.xworkz.bankmanagement.repository;

import com.xworkz.bankmanagement.entity.Account;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

@Repository
public class AccountRepositoryImpl implements AccountRepository{

    final static EntityManagerFactory emf = Persistence.createEntityManagerFactory("bank");

    @Override
    public Account saveAccountInfo(Account entity) {
        Account save = null;

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
