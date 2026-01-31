package com.xworkz.onlinecourse.service;

import com.xworkz.onlinecourse.entity.CourseEnrollmentEntity;
import com.xworkz.onlinecourse.repository.CourseEnrollmentRepo;
import com.xworkz.onlinecourse.repository.CourseEnrollmentRepoImpl;

import java.util.Collections;
import java.util.List;

public class CourseEnrollmentServiceImpl implements CourseEnrollmentService{

    CourseEnrollmentRepo repository = new CourseEnrollmentRepoImpl();
    @Override
    public CourseEnrollmentEntity validateAndSaveStudentInfo(CourseEnrollmentEntity entity) {
        System.out.println("Invoking validation from service");
        CourseEnrollmentEntity isValid = null;

        if (entity!=null) {
            isValid = repository.saveStudentInfo(entity);
        } else {
            isValid = null;
        }
        return isValid;
    }

    @Override
    public List<CourseEnrollmentEntity> validateAndFetchingAllDetails() {
        System.out.println("Validating fetch method from service");

        List<CourseEnrollmentEntity> list = repository.fetchingAllDetails();
        if (list!=null && !list.isEmpty()) {
            System.out.println("course entity: " + list.size());
        }
        return list;
    }

    @Override
    public boolean validateAndDeleteById(int id) {
        System.out.println("validating delete from service");
        boolean isValid = false;

        if (id>0) {
            isValid = repository.deleteById(id);
        } else {
            isValid = false;
        }
        return isValid;
    }

    @Override
    public CourseEnrollmentEntity validateAndFetchById(int id) {
        System.out.println("validate fetch from service");
        CourseEnrollmentEntity isValidFetch = null;

        if (id>0) {
            isValidFetch = repository.fetchById(id);
        } else {
            System.out.println("Failed to validate");
        }
        return isValidFetch;
    }

    @Override
    public CourseEnrollmentEntity validateAndUpdateById(CourseEnrollmentEntity entity) {
        System.out.println("validate update from service");
        CourseEnrollmentEntity isValidUpdate = null;

        if (entity!=null) {
            isValidUpdate = repository.updateById(entity);
        } else {
            System.out.println("Update Failed");
        }
        return isValidUpdate;
    }
}
