package com.simplilearn.kitchenStory.services;

import java.lang.reflect.Field;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ReflectionUtils;

import com.simplilearn.kitchenStory.exceptions.UserNotFound;
import com.simplilearn.kitchenStory.repositories.UserRepo;
import com.simplilearn.kitchenStory.user.User1;
@Service
public class UserServiceImpl implements ServiceApi<User1>{

	@Autowired
	UserRepo userRepo;
	
	@Override
	public User1 get(long id) {
		return userRepo.findById(id).orElseThrow(()->new UserNotFound("No User with id ="+id));
	}

	@Override
	public List<User1> getAll() {
		return userRepo.findAll();
	}

	@Override
	public User1 save(User1 obj) {
		return userRepo.save(obj);
	}

	@Override
	public String delete(long id) {
		 userRepo.deleteById(id);
		 return "User deleted with id = "+id;
	}

	@Override
	public String delete(User1 obj) {
		userRepo.delete(obj);
		return "User deleted with id = "+obj.getId();
	}

	@Override
	public User1 update(long id, String FieldName, Object Value) {
		User1 user =get(id);
		Field field=ReflectionUtils.findField(user.getClass(), FieldName);
		field.setAccessible(true);
		ReflectionUtils.setField(field, user, Value);
		userRepo.save(user);
		return user;
	}

}
