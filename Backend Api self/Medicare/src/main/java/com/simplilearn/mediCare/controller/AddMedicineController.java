package com.simplilearn.mediCare.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.simplilearn.mediCare.entities.Product;
import com.simplilearn.mediCare.services.ProductServiceImpl;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class AddMedicineController {

	@Autowired
	ProductServiceImpl productServiceImpl;
	@PostMapping("/addProduct")
	public ResponseEntity<Product> addProduct(@RequestBody Product product)
	{
		productServiceImpl.save(product);
		return new ResponseEntity<Product>(product,HttpStatus.OK);
	}
}
