package com.xworkz.onlinecourse.repository;

import com.xworkz.onlinecourse.entity.CourseEnrollmentEntity;

import javax.persistence.*;
import java.util.Collections;
import java.util.List;

public class CourseEnrollmentRepoImpl implements CourseEnrollmentRepo{

    static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("online-course");
    @Override
    public CourseEnrollmentEntity saveStudentInfo(CourseEnrollmentEntity entity) {
        System.out.println("Invoking save method from repo");
        CourseEnrollmentEntity course = null;

        EntityManager em = null;
        EntityTransaction et = null;
        try {
            em = emf.createEntityManager();
            et = em.getTransaction();
            et.begin();
            em.persist(entity);
            et.commit();
            course = em.merge(entity);
        } catch (Exception e){
            e.printStackTrace();
            et.rollback();
        } finally {
            if (em!=null) {
                em.close();
            }
        }
        return null;
    }

    @Override
    public List<CourseEnrollmentEntity> fetchingAllDetails() {
        System.out.println("Invoking fetch method from repository");
        List<CourseEnrollmentEntity> fetch = null;

        EntityManager em = null;
        try {
            em = this.emf.createEntityManager();
            Query query = em.createNamedQuery("fetchingAllDetails");
            fetch = query.getResultList();
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
            CourseEnrollmentEntity find = em.find(CourseEnrollmentEntity.class, id);
            if (find!=null) {
                em.remove(find);
                et.commit();
                del = true;
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
    public CourseEnrollmentEntity fetchById(int id) {
        System.out.println("Invoking fetch from repository");
        CourseEnrollmentEntity fetch = null;

        EntityManager em = null;
        try {
            em = this.emf.createEntityManager();
            fetch = em.find(CourseEnrollmentEntity.class, id);
//            fetch = em.merge(find);
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
    public CourseEnrollmentEntity updateById(CourseEnrollmentEntity entity) {
        System.out.println("Invoking update from repository");
        CourseEnrollmentEntity update = null;

        EntityManager em = null;
        EntityTransaction et = null;
        try {
            em = this.emf.createEntityManager();
            et = em.getTransaction();
            et.begin();
            CourseEnrollmentEntity search = em.find(CourseEnrollmentEntity.class, entity.getId());
            if (entity!=null) {
                search.setStudentName(entity.getStudentName());
                search.setEmail(entity.getEmail());
                search.setPhoneNumber(entity.getPhoneNumber());
                search.setCourseName(entity.getCourseName());
                search.setCourseFee(entity.getCourseFee());
                et.commit();
                update = em.merge(search);
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
