package com.simplilearn.kitchenStory.exceptions;

public class UserNotFound extends RuntimeException{
	public UserNotFound(String msg) {
		super(msg);
	}
}
