package com.springdatajpa.springboot.respository;

import com.springdatajpa.springboot.entity.Product;
import com.springdatajpa.springboot.repository.ProductRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

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
void findByIdMethod(){


  Product product=productRepository.findById(1L).get();

    System.out.println(product.getId());

    System.out.println(product.getName());


    System.out.println(product.getDescription());










}







}
