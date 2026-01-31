package com.xworkz.onlinepayments.repository;

import com.xworkz.onlinepayments.entity.PaymentEntity;

import javax.persistence.*;
import java.util.Collections;
import java.util.List;

public class PaymentRepositoryImpl implements PaymentRepository {

    final static EntityManagerFactory emf = Persistence.createEntityManagerFactory("online-payments");
    @Override
    public PaymentEntity savePaymentInfo(PaymentEntity entity) {
        System.out.println("Invoking savePaymentInfo()");
        PaymentEntity save = null;


        EntityManager em = null;
        EntityTransaction et = null;
        try {
            em = emf.createEntityManager();
            et = em.getTransaction();
            et.begin();
            em.persist(entity);
            et.commit();
//            save = em.merge(entity);
            return save;
        } catch (Exception e) {
            e.printStackTrace();
            et.rollback();
        } finally {
            if (em!=null) {
                em.close();
            }
            if (emf!=null) {
                emf.close();
            }
        }

        return save;
    }

    @Override
    public List<PaymentEntity> fetchAllDetails() {
        System.out.println("Invoking fetch all method from repository");
        List<PaymentEntity> fetch = null;

        EntityManager em = null;

        try {
            em = this.emf.createEntityManager();
            Query query = em.createNamedQuery("findAllDetails");
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
    public boolean deletePaymentEntityUsingId(int id) {
        System.out.println("Invoking delete operation from repository");
        boolean del = false;

        EntityManager em = null;
        EntityTransaction et = null;
        try {
            em = this.emf.createEntityManager();
            et = em.getTransaction();
            et.begin();
            PaymentEntity find = em.find(PaymentEntity.class, id);
            if (find != null) {
                em.remove(find);
                et.commit();
                del = true;
            }
        } catch (Exception e) {
            e.printStackTrace();
            et.rollback();
            del = false;
        } finally {
            if (em!=null) {
                em.close();
            }
        }
        return del;
    }

    @Override
    public PaymentEntity fetchById(int id) {
        System.out.println("Invoking fetch by id from repository");
        PaymentEntity fetch = null;

        EntityManager em = null;

        try {
            em = this.emf.createEntityManager();
            fetch = em.find(PaymentEntity.class, id);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (em!=null){
                em.close();
            }
        }

        return fetch;
    }

    @Override
    public PaymentEntity updateById(PaymentEntity entity) {
        System.out.println("Invoking update from repository");
        PaymentEntity update = null;

        EntityManager em = null;
        EntityTransaction et = null;
        try {
            em = this.emf.createEntityManager();
            et = em.getTransaction();
            et.begin();
            PaymentEntity paymentEntity = em.find(PaymentEntity.class, entity.getId());

            if (entity!=null) {
                paymentEntity.setPhoneNumber(entity.getPhoneNumber());
                paymentEntity.setTransactionId(entity.getTransactionId());
                paymentEntity.setAmountSenderName(entity.getAmountSenderName());
                paymentEntity.setAmount(entity.getAmount());
                paymentEntity.setAmountReceiverName(entity.getAmountReceiverName());
                paymentEntity.setDate(entity.getDate());
                update = em.merge(paymentEntity);
                et.commit();
//                update = em.merge(paymentEntity);
            }
        } catch (Exception e) {
            e.printStackTrace();
            et.rollback();
        } finally {
            if (em!=null) {
                em.close();
            }
        }
        return null;
    }


}
