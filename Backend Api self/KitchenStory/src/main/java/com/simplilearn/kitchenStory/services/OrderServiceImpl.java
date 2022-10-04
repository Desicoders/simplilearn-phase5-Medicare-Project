package com.simplilearn.kitchenStory.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.simplilearn.kitchenStory.entities.Order1;
import com.simplilearn.kitchenStory.exceptions.orderNotFoundException;
import com.simplilearn.kitchenStory.repositories.OrderRepo;
import com.simplilearn.kitchenStory.user.User1;

@Service
public class OrderServiceImpl {

	@Autowired
	OrderRepo orderRepo;
	
	@Autowired
	UserServiceImpl userServiceImpl;
	
	public Order1 get(long id) {
		return orderRepo.findById(id).orElseThrow(()->new orderNotFoundException("No Order with id ="+id));
	}


	public List<Order1> getAll(long userId) {
		User1 user=userServiceImpl.get(userId);
		return orderRepo.findByUser1(user);
		
	}

	public Order1 save(Order1 obj) {
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
	
	public Order1 generateNewOrder(String status)
	{
		Order1 order=new Order1(status);
		orderRepo.save(order);
		return order;
	}

}
