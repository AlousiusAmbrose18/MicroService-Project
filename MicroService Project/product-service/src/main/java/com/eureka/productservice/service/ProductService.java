package com.eureka.productservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestHeader;

import com.eureka.productservice.model.Product;
import com.eureka.productservice.repository.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository productRepository;

	public void saveProduct(Product product) {
		productRepository.save(product);
	}

	public Product getProductById(Long id) {
		return productRepository.findById(id).get();

	}

	public List<Product> getAllProduct() {
		return productRepository.findAll();

	}
	
	public Double findProductPriceById(Long productId) {
		Product product = productRepository.findById(productId).get();
		return product.getPrice();
		
	}
}
