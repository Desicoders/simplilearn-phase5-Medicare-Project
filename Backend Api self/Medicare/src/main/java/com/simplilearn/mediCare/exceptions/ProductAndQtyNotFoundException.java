package com.simplilearn.mediCare.exceptions;

public class ProductAndQtyNotFoundException extends RuntimeException{
	public ProductAndQtyNotFoundException(String msg) {
		super(msg);
	}

}
