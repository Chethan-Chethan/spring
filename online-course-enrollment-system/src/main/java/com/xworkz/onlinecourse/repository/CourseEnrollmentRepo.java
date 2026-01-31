package com.xworkz.onlinecourse.repository;

import com.sun.xml.internal.messaging.saaj.packaging.mime.util.LineInputStream;
import com.xworkz.onlinecourse.entity.CourseEnrollmentEntity;

import java.util.List;

public interface CourseEnrollmentRepo {

    CourseEnrollmentEntity saveStudentInfo(CourseEnrollmentEntity entity);
    List<CourseEnrollmentEntity> fetchingAllDetails();
    boolean deleteById(int id);
    CourseEnrollmentEntity fetchById(int id);
    CourseEnrollmentEntity updateById(CourseEnrollmentEntity entity);
}
