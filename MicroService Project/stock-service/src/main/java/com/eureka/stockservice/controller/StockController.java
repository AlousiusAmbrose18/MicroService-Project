package com.eureka.stockservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eureka.stockservice.service.StockService;

@RestController
@RequestMapping(value="StockController")
public class StockController {
	
	@Autowired
	private StockService stockService;
	
	
	
	@GetMapping(value="inStock")
	public Boolean inStock(@PathVariable Long productId) {
		return stockService.inStock(productId);
		
	}
	

}
