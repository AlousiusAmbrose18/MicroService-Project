package com.eureka.stockservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eureka.stockservice.model.Stock;

public interface StockRepositrory extends JpaRepository<Stock, Long> {

	public Stock findByProductId(Long productId);

}
