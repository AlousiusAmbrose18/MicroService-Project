package com.eureka.productservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eureka.productservice.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
