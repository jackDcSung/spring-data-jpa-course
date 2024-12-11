package com.springdatajpa.springboot.respository;


import com.springdatajpa.springboot.entity.Product;
import com.springdatajpa.springboot.repository.ProductRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
import java.util.List;

@SpringBootTest
public class ProductRepositoryTest {

    @Autowired
    private ProductRepository productRepository;


    @Test
    void saveMethod() {
        //create product
        Product product = new Product();
        product.setName("product 11");
        product.setDescription("product 1 description");
        product.setSku("100ABC");
        product.setPrice(new BigDecimal(100));
        product.setImageUrl("product1.png");

        Product savedObject = productRepository.save(product);

        System.out.println(savedObject.getId());
        System.out.println(savedObject.toString());


//save product


    }

    @Test
    void updateUsingSave() {


        //find or retrieve
        Long id = 1L;

        Product product = productRepository.findById(id).get();

        product.setName("updated product 11");

        product.setDescription("updated product 11 desc");


        productRepository.save(product);


    }


    @Test
    void findByIdMethod() {


        Long id = 1L;

        Product product = productRepository.findById(id).get();


    }


    @Test
    void saveAllMethod() {


        //create product
        Product product = new Product();
        product.setName("product 2");
        product.setDescription("product 2 description");
        product.setSku("100ABCD");
        product.setPrice(new BigDecimal(200));
        product.setImageUrl("product2.png");


        Product product3 = new Product();
        product3.setName("product 3");
        product3.setDescription("product 3 description");
        product3.setSku("100ABCDE");
        product3.setPrice(new BigDecimal(300));
        product3.setImageUrl("product3.png");


        productRepository.saveAll(List.of(product, product3));


    }


}
