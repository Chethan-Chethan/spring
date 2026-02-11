package com.xworkz.universitymanagement.runner;

import com.xworkz.universitymanagement.configuration.UniversityConfiguration;
import com.xworkz.universitymanagement.entity.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class UniversityRunner {

    public static void main(String[] args) {

        ApplicationContext context =
                new AnnotationConfigApplicationContext(UniversityConfiguration.class);

        University university = context.getBean(University.class);
        College college = context.getBean(College.class);
        Professor professor = context.getBean(Professor.class);
        Student student = context.getBean(Student.class);
        FeeCounter counter = context.getBean(FeeCounter.class);
        Library library = context.getBean(Library.class);
        Examination exam = context.getBean(Examination.class);

        university.setName("Xworkz University");
        university.setLocation("Bangalore");
        university.setRanking(5);

        college.setName("Engineering College");
        college.setStudents(1200);
        college.setGrade("A+");

        professor.setProfessorDetails("Dr Sharma", "Spring Framework", 20);

        student.setName("Chethan");
        student.setAge(24);
        student.setCourse("Computer Science");

        library.setLibrarian("Ravi");
        library.setBooks(25000);
        library.setOpen(true);

        exam.setExamName("Final Semester");
        exam.setDate("20-Apr-2026");
        exam.setOnline(false);

        university.details();
        counter.collectFee();
        library.info();
        exam.conduct();
    }
}
