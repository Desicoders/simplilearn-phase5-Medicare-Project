package com.simplilearn.kitchenStory.controller;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.simplilearn.kitchenStory.entities.ProductAndQty;
import com.simplilearn.kitchenStory.services.CartServiceImpl;

@RestController
@RequestMapping("/cart")
@CrossOrigin(origins = "http://localhost:4200")
public class CartController {

	@Autowired
	CartServiceImpl cartServiceImpl;
	
	@GetMapping("/order/{productid}/qty/{qty}")
	public ResponseEntity<Set<ProductAndQty>> order(@PathVariable long productid,@PathVariable long qty)
	{
		cartServiceImpl.OrderProducts(productid,qty);
		
		return new ResponseEntity<Set<ProductAndQty>>(cartServiceImpl.getAllProductsinCart(),HttpStatus.OK);
	}
}
