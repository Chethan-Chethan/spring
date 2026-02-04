package com.xworkz.productmanagement.configuration;

import com.xworkz.productmanagement.entity.*;
import org.springframework.context.annotation.Bean;

public class ProductConfiguration {

    @Bean
    public Author author() {
        return new Author();
    }
    @Bean
    public BookProduct bookProduct() {
        return new BookProduct();
    }

    @Bean
    public Warranty warranty() {
        return new Warranty();
    }
    @Bean
    public ElectronicProduct electronicsProduct() {
        return new ElectronicProduct();
    }

    @Bean
    public Battery battery() {
        return new Battery();
    }
    @Bean
    public MobileProduct mobileProduct() {
        return new MobileProduct();
    }

    @Bean
    public Brand brand() {
        return new Brand();
    }
    @Bean
    public ClothingProduct clothingProduct() {
        return new ClothingProduct();
    }

    @Bean
    public Material material() {
        return new Material();
    }
    @Bean
    public FurnitureProduct furnitureProduct() {
        return new FurnitureProduct();
    }
}
