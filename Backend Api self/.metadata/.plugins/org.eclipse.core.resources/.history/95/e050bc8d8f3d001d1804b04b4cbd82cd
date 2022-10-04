package com.simplilearn.kitchenStory.user;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserPayload {
	//@NotBlank
	String name;
	@Email
	String email;
	@Size(min = 8)
	String Password;
	String role;
}
