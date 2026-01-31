package com.xworkz.onlinecourse.service;

import com.xworkz.onlinecourse.entity.CourseEnrollmentEntity;

import java.util.List;

public interface CourseEnrollmentService {

    CourseEnrollmentEntity validateAndSaveStudentInfo(CourseEnrollmentEntity entity);
    List<CourseEnrollmentEntity> validateAndFetchingAllDetails();
    boolean validateAndDeleteById(int id);
    CourseEnrollmentEntity validateAndFetchById(int id);
    CourseEnrollmentEntity validateAndUpdateById(CourseEnrollmentEntity entity);



}
