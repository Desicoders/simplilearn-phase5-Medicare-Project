package com.simplilearn.mediCare.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.simplilearn.mediCare.entities.Address;
import com.simplilearn.mediCare.entities.Cart;
import com.simplilearn.mediCare.entities.CartAndAddress;
import com.simplilearn.mediCare.entities.Order1;
import com.simplilearn.mediCare.entities.Status;
import com.simplilearn.mediCare.services.CartServiceImpl;
import com.simplilearn.mediCare.services.OrderServiceImpl;
import com.simplilearn.mediCare.services.UserServiceImpl;
import com.simplilearn.mediCare.user.User1;

@RestController
@RequestMapping("/order")
@CrossOrigin(origins = "http://localhost:4200")
public class OrderController {
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
	
	@PostMapping("/generateOrder")
	public ResponseEntity<Order1> generateOrder(@RequestBody CartAndAddress  cartAndAddress )
	{
		order1.setProductsAndQty(cartAndAddress.getProductsAndQty());
		
		List<Status> statusList=new ArrayList<>();
		Status status=new Status();
		status.setStatusMsg("created");
		statusList.add(status);
		
		order1.setOrderStatus(statusList);
		
		Address address=new Address();
		address.setCity(cartAndAddress.get_city());
		address.setStreetNo(cartAndAddress.get_streetNo());
		address.setCountry(cartAndAddress.get_country());
		//address.setFloorNo(cartAndAddress.f)
		address.setDistrict(cartAndAddress.get_district());
		address.setHouseNo(cartAndAddress.get_houseNo());
		address.setLocality(cartAndAddress.get_locality());
		address.setPincode((int)cartAndAddress.get_pincode());
		address.setState(cartAndAddress.get_state());
	
		
		
		order1.setAddress(address);
		order1.setUser1(user1);
		
		orderServiceImpl.save(order1);
		return new ResponseEntity<Order1>(order1,HttpStatus.OK);
		
	}
	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping("/currentOrder/{id}")
	public ResponseEntity<Order1> getOrderById(@PathVariable long id)
	{
		Order1 order1= orderServiceImpl.get(id);
		
		return new ResponseEntity<Order1>(order1,HttpStatus.OK);
	}
	
	@GetMapping("/getAllOrders")
	public ResponseEntity<List<Order1>> getAllOrder()
	{
		List<Order1> order1List= orderServiceImpl.getAll(user1.getId());
		
		return new ResponseEntity<List<Order1>>(order1List,HttpStatus.OK);
	}
}
