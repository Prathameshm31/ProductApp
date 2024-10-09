package com.example.controller;

import com.example.model.product;
import com.example.service.productService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.RequestParam;


@RestController
@CrossOrigin
public class productController {

    @Autowired
    private productService service; // Check that this is being injected

    @GetMapping("/products")
    public List<product> getAllProducts() {
        List<product> all= service.getAllProducts(); // Using the injected service
        System.out.println("all "+all.toString());
        return all;
    }
    
  //search by id
  	@GetMapping("/products/{prodId}")
  	public product getProductById(@PathVariable int prodId) {
  		System.out.println("prodId "+prodId);
  		return service.getProductById(prodId);	
  	}
  	
  	
  	//delete
  	@DeleteMapping("/products/{prodId}")
  	public void deleteProdctById(@PathVariable int prodId) {
  		System.out.println("prodId "+prodId);
		 service.deleteProductById(prodId);
  		
  	}
}
