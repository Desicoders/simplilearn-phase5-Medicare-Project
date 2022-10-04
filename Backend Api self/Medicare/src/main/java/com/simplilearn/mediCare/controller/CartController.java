package com.simplilearn.mediCare.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.DependsOn;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.simplilearn.mediCare.entities.Cart;
import com.simplilearn.mediCare.entities.Order1;
import com.simplilearn.mediCare.entities.ProductAndQty;
import com.simplilearn.mediCare.entities.Status;
import com.simplilearn.mediCare.services.CartServiceImpl;
import com.simplilearn.mediCare.services.OrderServiceImpl;
import com.simplilearn.mediCare.services.UserServiceImpl;
import com.simplilearn.mediCare.user.User1;

@RestController
@RequestMapping("/cart")
@CrossOrigin(origins = "http://localhost:4200")
public class CartController {

	@Autowired
	CartServiceImpl cartServiceImpl;
	
	@Autowired
	User1 user1;
	
	@Autowired
	UserServiceImpl userServiceImpl;
	
	@Autowired
	OrderServiceImpl orderServiceImpl;
	
	@Autowired
	Order1  order1;
	
	@GetMapping("/order/{productid}/qty/{qty}")
	public ResponseEntity<Set<ProductAndQty>> order(@PathVariable long productid,@PathVariable long qty)
	{
		cartServiceImpl.OrderProducts(productid,qty);
		
		return new ResponseEntity<Set<ProductAndQty>>(cartServiceImpl.getAllProductsInCart(),HttpStatus.OK);
	}
	
	@GetMapping("/")
	Cart GetCart()
	{
		
		user1=userServiceImpl.get(user1.getId());
		Cart cart=user1.getCart();
		return cart;
	}
	
	
	
	
	
}
