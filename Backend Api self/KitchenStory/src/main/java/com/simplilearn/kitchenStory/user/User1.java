package com.simplilearn.kitchenStory.user;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User1 {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	String name;
	@Email
	String email;
	@JsonIgnore
	String Password;
	String role;
	User1(UserPayload userPayload){
		this.name=userPayload.getName();
		this.email=userPayload.getEmail();
		this.Password=userPayload.getPassword();
		this.role=userPayload.getRole();
	}
}
