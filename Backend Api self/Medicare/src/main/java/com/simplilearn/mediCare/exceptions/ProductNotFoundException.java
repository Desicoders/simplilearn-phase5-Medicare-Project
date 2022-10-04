package com.simplilearn.mediCare.exceptions;

public class ProductNotFoundException extends RuntimeException{
	public ProductNotFoundException(String msg) {
		super(msg);
	}

}
