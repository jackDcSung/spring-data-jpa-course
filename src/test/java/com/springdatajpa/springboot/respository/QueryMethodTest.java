package com.springdatajpa.springboot.respository;

import com.springdatajpa.springboot.entity.Product;
import com.springdatajpa.springboot.repository.ProductRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class QueryMethodTest {


    @Autowired
    private ProductRepository productRepository;


    @Test
    void findByNameMethod() {

        Product product = productRepository.findByName("product 2");

        System.out.println(product.getId());
        System.out.println(product.getName());

        System.out.println(product.getDescription());


    }

    @Test
    void findByIdMethod() {


        Product product = productRepository.findById(1L).get();

        System.out.println(product.getId());

        System.out.println(product.getName());


        System.out.println(product.getDescription());


    }




    @Test
    void findByNameOrDescriptionMethod() {

        List<Product> products=productRepository.findByNameOrDescription("product 1",
                "product 1 description"
                );



        products.forEach(p->{

            System.out.println(p.getId());
            System.out.println(p.getName());

        });


    }



    @Test
    void findByNameAndDescriptionMethod() {

        List<Product> products=productRepository.findByNameAndDescription("product 1",
                "product 1 description"
        );



        products.forEach(p->{

            System.out.println(p.getId());
            System.out.println(p.getName());

        });


    }



    @Test
        void findDistinctByNAmeMethod(){

        Product product=productRepository.findDistinctByName("product 2");

        System.out.println(product.getId());
        System.out.println(product.getName());
        System.out.println(product.getDescription());




        }












}
