package com.springdatajpa.springboot.repository;


import com.springdatajpa.springboot.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;


public interface ProductRepository extends JpaRepository<Product, Long> {


    public Product findByName(String name);


    Optional<Product> findById(Long id);

    List<Product> findByNameOrDescription(String name, String description);


    List<Product> findByNameAndDescription(String name, String description);


    Product findDistinctByName(String name);

    List<Product> findByPriceGreaterThan(BigDecimal price);

    List<Product> findByPriceLessThan(BigDecimal price);

    List<Product> findByNameContaining(String name);




    List<Product> findByNameLike(String name);

    List<Product> findByPriceBetween(int start, int end);


    List<Product> findByDateCreatedBetween (LocalDateTime start , LocalDateTime end);


    List<Product> findByNameIn(List<String> names);

    List<Product> findFirst2ByOrderByNameAsc();

    List<Product> findFirst2ByOrderByPriceAsc();


    @Query("select  p from Product p where p.name=?1  or p.description=?2")
    List<Product> findByNAmeOrDescriptionJPQLIndexParam(String name,String description);







}
