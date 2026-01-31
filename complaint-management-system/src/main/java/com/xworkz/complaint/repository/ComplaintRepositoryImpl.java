package com.xworkz.complaint.repository;

import com.xworkz.complaint.entity.UserInfoEntity;

import javax.persistence.*;
import java.util.Collections;
import java.util.List;

public class ComplaintRepositoryImpl implements ComplaintRepository{

    final static EntityManagerFactory emf = Persistence.createEntityManagerFactory("complaint");

    @Override
    public UserInfoEntity saveUserInfo(UserInfoEntity entity) {
        System.out.println("Invoking saveUserInfo Method from Repository");
        UserInfoEntity user = null;



        EntityManager em = null;
        EntityTransaction et = null;
        try {
            em = emf.createEntityManager();
            et = em.getTransaction();
            et.begin();
            em.persist(entity);
            et.commit();
            user = em.merge(entity);
        } catch (Exception e) {
            e.printStackTrace();
            et.rollback();
        } finally {
            if (em!=null) {
                em.close();
            }
        }
        return user;
    }

    @Override
    public List<UserInfoEntity> fetchAllDetails() {
        System.out.println("Invoking fetchAllDetails method from repository");
        List<UserInfoEntity> fetch = null;

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
    public boolean deleteUserInfoById(int userId) {
        System.out.println("invoking delete from repository");
        boolean del = false;

        EntityManager em =null;
        EntityTransaction et = null;

        try {
            em = this.emf.createEntityManager();
            et = em.getTransaction();
            et.begin();
            UserInfoEntity search = em.find(UserInfoEntity.class, userId);
            if (search!=null) {
                em.remove(search);
                del = true;
                et.commit();
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
    public UserInfoEntity fetchById(int userId) {
        System.out.println("Invoking fetch from repository");
        UserInfoEntity fetch = null;

        try {
            fetch = this.emf.createEntityManager().find(UserInfoEntity.class, userId);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return fetch;
    }

    @Override
    public UserInfoEntity updateById(UserInfoEntity entity) {
        System.out.println("Invoking update from repository");
        UserInfoEntity update = null;

        EntityManager em = null;
        EntityTransaction et = null;
        try {
            em = this.emf.createEntityManager();
            et = em.getTransaction();
            et.begin();
            UserInfoEntity find = em.find(UserInfoEntity.class, entity.getUserId());
            if (entity!=null) {
                find.setEmail(entity.getEmail());
                find.setPassword(entity.getPassword());
                find.setRole(entity.getRole());
                update = em.merge(find);
                et.commit();
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
