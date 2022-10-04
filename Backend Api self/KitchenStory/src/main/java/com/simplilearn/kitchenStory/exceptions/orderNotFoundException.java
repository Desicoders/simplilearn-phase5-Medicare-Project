package com.simplilearn.kitchenStory.exceptions;

public class orderNotFoundException extends RuntimeException{
	public orderNotFoundException(String msg)
	{
		super(msg);
	}

}
