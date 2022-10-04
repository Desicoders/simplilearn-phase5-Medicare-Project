package com.simplilearn.mediCare.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.simplilearn.mediCare.entities.Product;
import com.simplilearn.mediCare.services.ProductServiceImpl;

@RestController
@RequestMapping("/products")
@CrossOrigin(origins = "http://localhost:4200")
public class ProductController {
	
	@Autowired
	ProductServiceImpl productServiceImpl;
	
	@GetMapping("/")
	ResponseEntity<List<Product>> getAllProducts()
	{
		List<Product> products=productServiceImpl.getAll();
		return new ResponseEntity<List<Product>>(products,HttpStatus.OK);
	}
	
	
	
	

}
