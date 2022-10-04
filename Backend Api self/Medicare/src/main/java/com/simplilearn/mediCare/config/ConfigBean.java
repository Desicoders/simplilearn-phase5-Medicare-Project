package com.simplilearn.mediCare.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.simplilearn.mediCare.entities.Cart;
import com.simplilearn.mediCare.user.User1;

//@SpringBootConfiguration
public class ConfigBean {
	static User1 user1=new User1();
	  @Bean
	  public static User1 getUser1() { 
	 return user1; 
	 }
	public static void setUser1(User1 user1)
	{
		ConfigBean.user1=user1;
	}
}
