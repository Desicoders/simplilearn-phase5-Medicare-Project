package com.simplilearn.mediCare.exceptions;

public class UserNotFound extends RuntimeException{
	public UserNotFound(String msg) {
		super(msg);
	}
}
