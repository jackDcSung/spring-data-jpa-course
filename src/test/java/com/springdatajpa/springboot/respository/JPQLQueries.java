package com.springdatajpa.springboot.respository;


import com.springdatajpa.springboot.entity.Product;
import com.springdatajpa.springboot.repository.ProductRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class JPQLQueries {


    @Autowired
    private ProductRepository productRepository;


    @Test
    void findByNAmeOrDescriptionJPQLIndexParam() {

        List<Product> products = productRepository.findByNAmeOrDescriptionJPQLIndexParam("product1",
                "product 1 description"
        );

        products.forEach(p -> {

            System.out.println(p.getId());
            System.out.println(p.getName());

        });






    }




















}
