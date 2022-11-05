package com.eureka.productservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.eureka.productservice.model.Product;
import com.eureka.productservice.service.ProductService;

@RestController
@RequestMapping(value="ProductController")
public class ProductController {
	
	@Autowired
	private ProductService productService;
	
	@PostMapping(value="saveProduct")
	public void saveProduct(@RequestBody Product product  ) {
		productService.saveProduct(product);
	}
	
	@GetMapping(value="getProductById")
	public @ResponseBody Product getProductById(@RequestHeader Long id) {
		return productService.getProductById(id);
		
	}
	
	@GetMapping(value="getAllProduct")
	public List<Product> getAllProduct(){
		return productService.getAllProduct();
		
	}
	
	public Double findProductPriceById(@RequestHeader (name = "productId") Long productId) {
		return  productService.findProductPriceById(productId);
		
	}
	

}
