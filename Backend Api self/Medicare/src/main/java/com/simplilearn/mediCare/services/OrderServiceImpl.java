package com.simplilearn.mediCare.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.simplilearn.mediCare.entities.Order1;
import com.simplilearn.mediCare.exceptions.orderNotFoundException;
import com.simplilearn.mediCare.repositories.OrderRepo;
import com.simplilearn.mediCare.user.User1;

@Service
public class OrderServiceImpl {

	@Autowired
	OrderRepo orderRepo;
	
	@Autowired
	User1 user1;
	
	public Order1 get(long id) {
		return orderRepo.findById(id).orElseThrow(()->new orderNotFoundException("No Order with id ="+id));
	}


	public List<Order1> getAll(long userId) {
		
		return orderRepo.findByUser1(user1);
		
	}

	public Order1 save(Order1 obj) {
		obj.calculateTotalPrice();
		return orderRepo.save(obj);
	}

	
	public String delete(long id) {
		 orderRepo.deleteById(id);
		 return "order deleted with id = "+id;
	}

	
	public String delete(Order1 obj) {
		 orderRepo.delete(obj);
		 return "order deleted with id ="+obj.getId();
	}
	
	

}
