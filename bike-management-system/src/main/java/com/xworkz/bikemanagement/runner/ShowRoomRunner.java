package com.xworkz.bikemanagement.runner;

import com.xworkz.bikemanagement.configuration.BikeConfiguration;
import com.xworkz.bikemanagement.engine.Bike;
import com.xworkz.bikemanagement.engine.ElectricReception;
import com.xworkz.bikemanagement.engine.PetrolEngine;
import com.xworkz.bikemanagement.engine.PetrolReception;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ShowRoomRunner {
    public static void main(String[] args) {

        ApplicationContext container = new AnnotationConfigApplicationContext(BikeConfiguration.class);
//        PetrolEngine splender = container.getBean(PetrolEngine.class);
//        splender.start();
//        System.out.println(splender);

        container.getBean(PetrolReception.class).getDetails();
        container.getBean(ElectricReception.class).


    }
}
