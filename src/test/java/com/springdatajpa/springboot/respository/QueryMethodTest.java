package com.springdatajpa.springboot.respository;

import com.springdatajpa.springboot.entity.Product;
import com.springdatajpa.springboot.repository.ProductRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
import java.time.LocalDateTime;
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

        List<Product> products = productRepository.findByNameOrDescription("product 1",
                "product 1 description"
        );


        products.forEach(p -> {

            System.out.println(p.getId());
            System.out.println(p.getName());

        });


    }


    @Test
    void findByNameAndDescriptionMethod() {

        List<Product> products = productRepository.findByNameAndDescription("product 1",
                "product 1 description"
        );


        products.forEach(p -> {

            System.out.println(p.getId());
            System.out.println(p.getName());

        });


    }


    @Test
    void findDistinctByNAmeMethod() {

        Product product = productRepository.findDistinctByName("product 2");

        System.out.println(product.getId());
        System.out.println(product.getName());
        System.out.println(product.getDescription());


    }

    @Test
    void findByPriceGreaterThanThanMethod() {

        List<Product> products = productRepository.findByPriceGreaterThan(new BigDecimal(100));


        products.forEach(p -> {

            System.out.println(p.getId());
            System.out.println(p.getName());

        });


    }


    @Test
    void findByPriceLessThanMethod() {


        List<Product> products = productRepository.findByPriceLessThan(new BigDecimal(150));


        products.forEach(p -> {

            System.out.println(p.getId());
            System.out.println(p.getName());

        });


    }


    @Test
    void findByContainingMethod() {

        List<Product> products = productRepository.findByNameContaining("product 1");


        products.forEach(p -> {

            System.out.println(p.getId());
            System.out.println(p.getName());

        });


    }


    @Test
    void findByNameLikeMethod() {


        List<Product> products = productRepository.findByNameLike("product 1");


        products.forEach(p -> {

            System.out.println(p.getId());
            System.out.println(p.getName());

        });


    }


    @Test
    void findByNameBetweenMethod() {


        List<Product> products = productRepository.findByPriceBetween(100, 300);

        products.forEach(p -> {

            System.out.println(p.getId());
            System.out.println(p.getName());

        });


    }


    @Test
    void findByDateBetweenMethod() {


        LocalDateTime startDate = LocalDateTime.of(2024, 12, 13, 14, 11, 33);
        LocalDateTime endDate = LocalDateTime.of(2024, 12, 16, 14, 59, 21);


        List<Product> products = productRepository.findByDateCreatedBetween(startDate, endDate);


        products.forEach(p -> {

            System.out.println(p.getId());
            System.out.println(p.getName());

        });


    }
        @Test
        void findNameInMethod(){

        List<Product> products=productRepository.findByNameIn(List.of("product 1","product 2"));





            products.forEach(p -> {

                System.out.println(p.getId());
                System.out.println(p.getName());

            });









        }




        @Test
        void findFirst2ByOrderByNameAscMethod(){

        List<Product> products=productRepository.findFirst2ByOrderByNameAsc();




            products.forEach(p -> {

                System.out.println(p.getId());
                System.out.println(p.getName());

            });





        }


    @Test
    void findTop2ByOrderByPriceDescMethod(){
        List<Product> products = productRepository.findFirst2ByOrderByPriceAsc();



        products.forEach(p -> {

            System.out.println(p.getId());
            System.out.println(p.getName());

        });


    }
















}