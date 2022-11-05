package com.eureka.stockservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eureka.stockservice.model.Stock;
import com.eureka.stockservice.repository.StockRepositrory;

@Service
public class StockService {
	
	@Autowired
	private StockRepositrory stockRepositrory;
	

	public Boolean inStock(Long productId) {
		
		 if(stockRepositrory.findByProductId(productId).getStock()!=null) return true;	 
		 return false;
		
	}

}
