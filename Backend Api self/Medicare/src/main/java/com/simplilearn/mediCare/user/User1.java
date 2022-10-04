package com.simplilearn.mediCare.user;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.validation.constraints.Email;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.simplilearn.mediCare.entities.Cart;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


@Data
@Component
@Entity
@NoArgsConstructor
@ToString
public class User1 {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	String name;
	@Email
	String email;
	@JsonIgnore
	String password;
	String role;

	@OneToOne(cascade =CascadeType.ALL)
	Cart cart=new Cart();

	public User1(UserPayload userPayload){
	this.name=userPayload.get_name();
	this.email=userPayload.get_email();
	this.password=userPayload.get_password();
	this.role=userPayload.get_role();
	this.cart=new Cart();
}
//	public User1() {
//		UserPayload userPayload=new UserPayload();
//		this.name=userPayload.getName();
//		this.email=userPayload.getEmail();
//		this.password=userPayload.getPassword();
//		this.role=userPayload.getRole();
//		this.cart=new Cart();
//	}
//	
}
