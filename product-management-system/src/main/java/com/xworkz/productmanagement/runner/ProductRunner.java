package com.xworkz.productmanagement.runner;

import com.xworkz.productmanagement.configuration.ProductConfiguration;
import com.xworkz.productmanagement.entity.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ProductRunner {

    public static void main(String[] args) {

        ApplicationContext context =
                new AnnotationConfigApplicationContext(ProductConfiguration.class);

        context.getBean(BookProduct.class).read();
        System.out.println("-------------------");
        context.getBean(ElectronicProduct.class).buy();
        System.out.println("-------------------");
        context.getBean(MobileProduct.class).use();
        System.out.println("-------------------");
        context.getBean(ClothingProduct.class).wear();
        System.out.println("-------------------");
        context.getBean(FurnitureProduct.class).use();
    }
}
