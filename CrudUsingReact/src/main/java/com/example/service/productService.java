package com.example.service;

import com.example.model.product;
import com.example.repo.productRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service // This annotation is crucial
public class productService {

    @Autowired
    private productRepo productRepository;

    public List<product> getAllProducts() {
    	
    	System.out.println("productRepository.findAll() "+productRepository.findAll().toString());
        return productRepository.findAll();
    }

    public product getProductById(int prodId) {
		// TODO Auto-generated method stub
		
		return  productRepository.findById(prodId).orElse(new product(100,"No Item Found",null, null, 0, null, null, prodId, null));
	}

	public void deleteProductById(int prodId) {
		// TODO Auto-generated method stub
		
		 productRepository.deleteById(prodId);
	}
}
