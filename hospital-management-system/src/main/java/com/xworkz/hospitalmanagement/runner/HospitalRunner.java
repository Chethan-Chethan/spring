package com.xworkz.hospitalmanagement.runner;

import com.xworkz.hospitalmanagement.configuration.HospitalConfiguration;
import com.xworkz.hospitalmanagement.entity.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class HospitalRunner {

    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(HospitalConfiguration.class);
        Hospital hospital = context.getBean(Hospital.class);
        Department department = context.getBean(Department.class);
        Doctor doctor = context.getBean(Doctor.class);
        Patient patient = context.getBean(Patient.class);
        Appointment appointment = context.getBean(Appointment.class);
        Bill bill = context.getBean(Bill.class);
        Pharmacy pharmacy = context.getBean(Pharmacy.class);
        Medicine medicine = context.getBean(Medicine.class);
        Nurse nurse = context.getBean(Nurse.class);
        Laboratory lab = context.getBean(Laboratory.class);

        hospital.setName("Xworkz Hospital");
        hospital.setLocation("Bangalore");
        hospital.setBeds(300);

        department.setName("Cardiology");
        department.setDoctors(12);
        department.setFloor("3rd Floor");

        patient.setName("Ramesh");
        patient.setAge(46);
        patient.setProblem("Heart Pain");

        appointment.setDate("15-Feb-2026");
        appointment.setTime("11:30 AM");
        appointment.setStatus("Confirmed");

        doctor.setDoctorDetails("Dr Kumar", "Heart Specialist", 18);

        bill.setBillDetails(201, 8500, true);

        pharmacy.setPharmacyDetails("City Pharmacy", "Ground Floor");

        medicine.setMedicineDetails("Aspirin", 10, 150);

        nurse.setName("Anitha");
        nurse.setShiftHours(8);
        nurse.setWard("ICU");

        lab.setLabDetails("ECG", 1200, true);

        hospital.details();
        nurse.assist();
        lab.test();

    }
}
