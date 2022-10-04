package com.simplilearn.mediCare.exceptions;

public class orderNotFoundException extends RuntimeException{
	public orderNotFoundException(String msg)
	{
		super(msg);
	}

}
