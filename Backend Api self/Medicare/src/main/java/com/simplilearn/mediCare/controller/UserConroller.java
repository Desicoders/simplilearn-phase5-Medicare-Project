package com.simplilearn.mediCare.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.simplilearn.mediCare.config.ConfigBean;
import com.simplilearn.mediCare.services.UserServiceImpl;
import com.simplilearn.mediCare.user.Login;
import com.simplilearn.mediCare.user.User1;
import com.simplilearn.mediCare.user.UserPayload;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class UserConroller {
	
	@Autowired
	User1 user1=ConfigBean.getUser1();
	
	@Autowired
	UserServiceImpl userServiceImpl;
	
	@PostMapping("/login")
	public ResponseEntity<User1> login(@RequestBody Login login ){
		User1 user12= userServiceImpl.get(login.get_userid());
		if(user12.getPassword().equals(login.get_password()))
		ConfigBean.setUser1(user12);
		return new ResponseEntity<User1>(user12,HttpStatus.OK);
		
	}
	@PostMapping("/signup")
	public ResponseEntity<User1> signup(@RequestBody UserPayload  userPayload ){
		
		User1 user1= new User1(userPayload);
		userServiceImpl.save(user1);
		return new ResponseEntity<User1>(user1,HttpStatus.OK);
		
	}
	@GetMapping("/signout")
	public ResponseEntity<User1> signOut()
	{
		User1 user1=new User1();
		
		ConfigBean.setUser1(user1);
		
		return new ResponseEntity<User1>(user1,HttpStatus.OK);
	}

}
